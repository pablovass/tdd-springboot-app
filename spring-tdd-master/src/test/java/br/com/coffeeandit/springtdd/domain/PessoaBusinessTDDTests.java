package br.com.coffeeandit.springtdd.domain;

import br.com.coffeeandit.springtdd.MongoConfig;
import br.com.coffeeandit.springtdd.repository.PessoaRepository;
import de.flapdoodle.embed.mongo.MongodExecutable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.notNullValue;
import static org.mockito.Mockito.when;

@Import(MongoConfig.class)
@ActiveProfiles("test")
@SpringBootTest(classes = PessoaBusinessImpl.class)
@EnableMongoRepositories(basePackageClasses = PessoaRepository.class)
public class PessoaBusinessTDDTests {


    public static final String MOCK_ID = "1";
    @Value("${pessoa.nome}")
    String pessoaNome;
    @Value("${pessoa.cpf}")
    Long cpf;

    @Autowired
    private MongodExecutable mongodExecutable;

    @SpyBean
    private PessoaIBusiness pessoaIBusiness;

    @BeforeEach
    public void tearUp() throws IOException {
        mongodExecutable.start();
    }

    @AfterEach
    public void tearDown() {
        mongodExecutable.stop();
    }

    @Test
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.BEFORE_METHOD)
    @DisplayName("Teste de Persistir Pessoas")
    void testSavePessoa() {

        when(pessoaIBusiness.generateId()).thenReturn(MOCK_ID);
        var pessoa = Pessoa.builder().nome(pessoaNome).cpf(cpf).build();
        pessoaIBusiness.save(pessoa);
        assertThat(pessoa.getId(), equalTo(MOCK_ID));
    }
    @Test
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.BEFORE_METHOD)
    @DisplayName("Teste de geraçao do ID")
    void testPessoaId() {

                var pessoa = Pessoa.builder().nome(pessoaNome).cpf(cpf).build();
        pessoaIBusiness.save(pessoa);
        assertThat(pessoa.getId(), notNullValue());

    }



}
