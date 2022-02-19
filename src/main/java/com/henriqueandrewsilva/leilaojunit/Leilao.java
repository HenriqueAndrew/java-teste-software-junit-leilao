package com.henriqueandrewsilva.leilaojunit;

// @author Henrique Andrew da Silva

import java.util.List;


class Leilao {
    
    private String nomeLeilao;
    private Lance lance;
    
     public Leilao(String nomeLeilao){
        this.nomeLeilao = nomeLeilao;        
    }
    
    public Leilao(String nomeLeilao, Lance lance){
        this.nomeLeilao = nomeLeilao;
        this.lance = lance;        
    }

    public String getNomeLeilao() {
        return nomeLeilao;
    }

    public void setNomeLeilao(String nomeLeilao) {
        this.nomeLeilao = nomeLeilao;
    }

    public Lance getLance() {
        return lance;
    }

    public void setLance(Lance lance) {
        this.lance = lance;
    }
     
    
    public void propoe(Lance lance){        
    }

    List<Lance> getLances() {
        return null;        
    }  
  
}
