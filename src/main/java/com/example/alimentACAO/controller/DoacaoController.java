package com.example.alimentACAO.controller;

import com.example.alimentACAO.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Map;

@RestController
@RequestMapping("/api/doacao")
public class DoacaoController {

    @Autowired
    private DoadorRepository doadorRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private DoacaoRepository doacaoRepository;

    @PostMapping("/doacao")
    public ResponseEntity<String> criarDoacao(@RequestBody Map<String, Object> payload) {
        try {
            // Salvando o doador
            Map<String, Object> doadorData = (Map<String, Object>) payload.get("doador");
            Doador doador = new Doador();
            doador.setNome((String) doadorData.get("nome"));
            doador.setEmail((String) doadorData.get("email"));
            doador.setTelefone((String) doadorData.get("telefone"));
            doador.setDataNascimento(LocalDate.parse((String) doadorData.get("dataNascimento")));
            doador.setSexo((String) doadorData.get("sexo"));
            doador.setCpf((String) doadorData.get("cpf"));
            doadorRepository.save(doador);

            // Salvando o endereço
            Map<String, Object> enderecoData = (Map<String, Object>) payload.get("endereco");
            Endereco endereco = new Endereco();
            endereco.setCep((String) enderecoData.get("cep"));
            endereco.setRua((String) enderecoData.get("rua"));
            endereco.setNumero(Integer.parseInt((String) enderecoData.get("numero")));
            endereco.setComplemento((String) enderecoData.get("complemento"));
            endereco.setBairro((String) enderecoData.get("bairro"));
            endereco.setCidade((String) enderecoData.get("cidade"));
            endereco.setEstado((String) enderecoData.get("estado"));
            enderecoRepository.save(endereco);

            // Salvando a doação
            Map<String, Object> doacaoData = (Map<String, Object>) payload.get("doacao");
            Doacao doacao = new Doacao();
            doacao.setDoador(doador);
            doacao.setEndereco(endereco);
            String tipoDoacao = (String) doacaoData.get("tipoDoacao");

            if ("MENSAL".equals(tipoDoacao) || "UNICA".equals(tipoDoacao)) {
                doacao.setTipoDoacao(tipoDoacao);
                doacao.setValor(Double.valueOf((String) doacaoData.get("valor")));
                doacao.setAceitarTermos((Boolean) payload.get("aceitarTermos"));
                doacaoRepository.save(doacao);
                return ResponseEntity.ok("Doação criada com sucesso!");
            } else {
                return ResponseEntity.badRequest().body("Tipo de doação inválido.");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao criar a doação.");
        }
    }
}
