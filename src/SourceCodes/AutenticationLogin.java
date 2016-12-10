/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SourceCodes;

import DataBase.ConexaoBD;
import GUILocadora.StartPageJFM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gian Luca
 */
public class AutenticationLogin {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int curRow = 0;
    public String Acesso;
    public double id;
    StartPageJFM SP = new StartPageJFM();
    public AutenticationLogin()
    {
        conn = ConexaoBD.ConectDB();
    }
    
    public boolean LoginNivel(String username, String Password) throws SQLException {
        boolean autenticacao = false;
        try {
            String sql = "select cpf,cargo,login,senha from funcionarios where login=? and senha=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, Password);
            rs = pst.executeQuery();
            if (rs.next()) {
                Acesso = rs.getString("cargo");
                id = rs.getDouble("cpf");
                autenticacao = true;
            } else {
                pst.close();
                JOptionPane.showMessageDialog(null, "Por Favor tente Novamente.","Acesso Negado!",JOptionPane.WARNING_MESSAGE);
                return autenticacao;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticacao;
    }
}
