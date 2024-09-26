package com.example.jpaworkshop.entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Setter
    @Column(nullable = false, unique = true, length = 20)
    private String username;

    @Setter
    @Column(nullable = false, length = 100)
    private String password;

    LocalDate regDate;

    @Setter
    @OneToOne
    @JoinColumn(name = "details_id")
    private Details details;

    // Constructor
    public AppUser(String username, String password) {
        this.username = username;
        this.password = password;
        this.regDate = LocalDate.now();
    }
}

