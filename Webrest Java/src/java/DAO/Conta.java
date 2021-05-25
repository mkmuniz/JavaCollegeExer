package DAO;

import java.math.BigDecimal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mikae
 */
class Conta {
    protected long num;
    protected String nome;
    protected Float saldo;
    private Long numAgencia;

    /**
     * @return the num
     */
    public long getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(long num) {
        this.num = num;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the saldo
     */
    public Float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the numAgencia
     */
    public Long getNumAgencia() {
        return numAgencia;
    }

    /**
     * @param numAgencia the numAgencia to set
     */
    public void setNumAgencia(Long numAgencia) {
        this.numAgencia = numAgencia;
    }

    
}
