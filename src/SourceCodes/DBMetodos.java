/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCodes;

import DataBase.ConexaoBD;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gian Luca
 */
public class DBMetodos {

    Connection conn = null;
    String query = null;
    Statement stmt;
    ResultSet resultado;

    public void Cadastrar() {
        try {
            conn = ConexaoBD.ConectDB();
            stmt = (Statement) conn.createStatement();
            int salvar = stmt.executeUpdate(query);
            if (salvar > 0) {
                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro na inserção dos dados.");
            }
        } catch (HeadlessException | SQLException e) {
            Logger.getLogger(DBMetodos.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBMetodos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void Exluir(String escolha) {
        try {
            stmt = (Statement) conn.createStatement();
            int deletar = stmt.executeUpdate(query);
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "a string");
            deletar = pstmt.executeUpdate();
            if (deletar > 0) {
                JOptionPane.showMessageDialog(null, "Dados removidos com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro na remoção dos dados.");
            }
        } catch (SQLException e) {
            Logger.getLogger(DBMetodos.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    /**
     *
     * @param escolha
     */
    public void Alterar(String escolha) {
           
    }
    
    public void mostrar(String cod_escolha) {
        try {
            conn = ConexaoBD.ConectDB();
            stmt = (Statement) conn.createStatement();
            resultado = stmt.executeQuery(query);
            while(resultado.next()){
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBMetodos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
