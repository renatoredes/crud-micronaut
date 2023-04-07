package com.demon.entity

import io.micronaut.core.annotation.Introspected
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Introspected
data class Pessoa (
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long?,

        @Column
        val sobreNome: String,

        @Column
        val nome: String,

        @Column
        val idade: Long,

)


