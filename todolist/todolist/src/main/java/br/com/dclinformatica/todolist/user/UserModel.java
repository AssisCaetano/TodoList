package br.com.dclinformatica.todolist.user;

import java.time.LocalDate;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID )
    private UUID id;

    @Column(unique = true)
    private String username;
    private String name;
    private String password;
    

    /**
     * Nesse ponto quero saber quando o meu dado
     * a cima foi criado
     */
    @CreationTimestamp
    private LocalDate createdAt;
}
