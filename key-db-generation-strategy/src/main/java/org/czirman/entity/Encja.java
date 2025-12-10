package org.czirman.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name ="tabela")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Encja {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq")
    @SequenceGenerator(
            name = "my_seq",       // nazwa generatora w JPA
            sequenceName = "my_seq",// faktyczna nazwa sekwencji w bazie
            allocationSize = 1            // krok prealokacji
    )
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

}
