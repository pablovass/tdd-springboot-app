package br.com.coffeeandit.springtdd.domain;

import br.com.coffeeandit.springtdd.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class PessoaBusinessImpl implements PessoaIBusiness {

    public PessoaBusinessImpl(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    private PessoaRepository pessoaRepository;

    @Override
    public Pessoa save(final Pessoa pessoa) {
        pessoa.setId(generateId());
        return pessoaRepository.save(pessoa);
    }

    @Override
    public String generateId() {
        return UUID.randomUUID().toString();
    }
}
