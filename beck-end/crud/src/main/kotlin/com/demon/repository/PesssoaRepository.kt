package com.demon.repository

import com.demon.entity.Pessoa
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface PesssoaRepository: JpaRepository<Pessoa, Long> {
}