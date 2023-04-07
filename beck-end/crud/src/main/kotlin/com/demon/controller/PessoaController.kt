package com.demon.controller;


import com.demon.entity.Pessoa
import com.demon.repository.PesssoaRepository
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post
import jakarta.inject.Inject

@Controller("/pessoas")
class PessoaController() {

    @Inject
    lateinit var pesssoaRepository: PesssoaRepository;

    @Get
    fun pesquisarPessoa(): List<Pessoa> {
        return pesssoaRepository.findAll()
    }

    @Post
    fun cadastraPessoa(pessoa: Pessoa): HttpResponse<Pessoa> {
    return  HttpResponse.created(pesssoaRepository.save(pessoa))
    }
}