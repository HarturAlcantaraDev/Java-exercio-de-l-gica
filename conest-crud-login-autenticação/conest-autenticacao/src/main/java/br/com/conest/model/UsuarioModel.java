package br.com.conest.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_USUARIO")
@Getter
@Setter
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_usuario;

    @Column(nullable = false, unique = true, length = 20)
    private String cpf_cpnj;

    @Column(nullable = false, unique = true, length = 20)
    private String telefone;

    @Column(nullable = false)
    private LocalDateTime dt_cadastro;

    @Column(nullable = false, length = 60)
    private String nome_usuario;

    @Column(nullable = false, length = 80)
    private String email_usuario;

    @Column(nullable = false)
    private String senha_usuario;

    @Column(nullable = false)
    private boolean cargo_ong;

}