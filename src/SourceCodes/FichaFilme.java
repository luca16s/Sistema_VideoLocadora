/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SourceCodes;

import DataBase.ConexaoBD;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gian Luca
 */
public class FichaFilme extends DBMetodos{
    private String titulo, quantidade, cor;
    public void mostrarFichaFilme(String cod_escolha) {
        try {
            conn = ConexaoBD.ConectDB();
            stmt = (Statement) conn.createStatement();
            query = "select * from filmes where codigoFilme= '" + cod_escolha + "'";
            resultado = stmt.executeQuery(query);
            while (resultado.next()) {
                setQuantidade(resultado.getString("quantidade"));
                setTitulo(resultado.getString("titulo"));
                setCor(resultado.getString("cor"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FichaFilme.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the quantidade
     */
    public String getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
}
