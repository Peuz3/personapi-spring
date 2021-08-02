package com.digitalinnovation.personapi.entity;

import com.digitalinnovation.personapi.enums.PhoneType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data //Já gera os gets e sets
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated
    @Column(nullable = false)
    private PhoneType phoneType;

    @Column(nullable = false)
    private String number;


}
