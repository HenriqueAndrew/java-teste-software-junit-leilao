package com.henriqueandrewsilva.leilaojunit;

// @author Henrique Andrew da Silva

import java.util.List;
import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

public class AvaliadorTeste {
    
    private Avaliador leiloeiro;
    private Usuario joao;
    private Usuario jose;
    private Usuario maria;
    
    //novo méotod que cria o avaliador
    
    @Before
    public void criaAvaliador(){
        this.leiloeiro = new Avaliador();
        this.joao = new Usuario("João");
        this.jose = new Usuario("José");
        this.maria = new Usuario("Maria");
    }

    @Test
    public void deveEntenderLancesEmOrdemCrescente() {        
        
        //parte 1: cenário (3 lances em ordem crescente)
        Leilao leilao = new CriadorDeLeilao()
                .para("Playstation 3 Novo")
                .lance(joao, 250)
                .lance(jose, 300)
                .lance(maria, 400)
                .constroi();
        
        //parte 2: ação
        leiloeiro.avalia(leilao);
        
        //parte 3: validação
        assertThat(leiloeiro.getMenorLance(), equalTo(250.0));
        assertThat(leiloeiro.getMaiorLance(), equalTo(400.0));
    }
    
    @Test
    public void deveEntenderLeilaoComApenasUmLance(){
        
        //parte 1: cenário
        Usuario joao = new Usuario("Joao");
        Leilao leilao = new Leilao("Playstation 3 Novo");
        leilao.propoe(new Lance(joao, 1000.0));

        //parte 2: ação
        leiloeiro.avalia(leilao);
        
        //parte 3: validação
        assertEquals(1000, leiloeiro.getMaiorLance(), 0.0001);
        assertEquals(1000, leiloeiro.getMenorLance(), 0.0001);
    }
    
    @Test
    public void deveEncontrarOsTresMaioresLances() {
        
        //parte 1: cenário
        Leilao leilao = new CriadorDeLeilao()
                .para("Playstation 3 Novo")
                .lance(joao, 100.0)
                .lance(maria, 200.0)
                .lance(joao, 300.0)
                .lance(maria, 400.0)
                .constroi();
        
        //parte 2: ação
        leiloeiro.avalia(leilao);
        
        //parte 3: validação
        List<Lance> maiores = leiloeiro.getTresMaiores();
        assertEquals(3, maiores.size());
        
        assertEquals(400, maiores.get(0).getValor(), 0.00001);
        assertEquals(300, maiores.get(1).getValor(), 0.00001);
        assertEquals(200, maiores.get(2).getValor(), 0.00001);

    }
    
     @Test(expected = RuntimeException.class)
    public void naoDeveAvaliarLeiloesSemNenhumLanceDado() {

        Leilao leilao = new CriadorDeLeilao()
                .para("Playstation 3 Novo")
                .constroi();
        leiloeiro.avalia(leilao);
    }

}
