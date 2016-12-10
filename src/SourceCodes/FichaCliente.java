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
public class FichaCliente extends DBMetodos{
    private String Nome;
    
    public void mostrarFichaCliente(String cod_escolha) {
        try {
            conn = ConexaoBD.ConectDB();
            stmt = (Statement) conn.createStatement();
            query = "select * from cliente where cpf= '" + cod_escolha + "'";
            resultado = stmt.executeQuery(query);
            while (resultado.next()) {
                setNome(resultado.getString("nome"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBMetClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
}
