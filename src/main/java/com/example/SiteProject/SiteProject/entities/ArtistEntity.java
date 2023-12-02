package com.example.SiteProject.SiteProject.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Indexed;

import java.io.Serializable;

@Data
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ARTIST")
@EqualsAndHashCode(callSuper = true)
public class ArtistEntity extends UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARTIST_SEQ")
    @SequenceGenerator(name = "ARTIST_SEQ", sequenceName = "ARTIST_SEQ", allocationSize = 1)
    private Long id;

    @Column(name = "COUNTRY", nullable = false)
    private String country;

}