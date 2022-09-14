package br.com.coffeeandit.springtdd.domain;

public interface PessoaIBusiness {
    Pessoa save(final Pessoa pessoa);
    String generateId();
}
