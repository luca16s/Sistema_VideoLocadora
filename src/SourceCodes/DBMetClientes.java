/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCodes;

import DataBase.ConexaoBD;
import GUILocadora.Cad_ClienteJIF;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Gian Luca
 */
public class DBMetClientes extends DBMetodos {

    private String Nome, cpf, Nascimento, numero, cep, Identidade, Telefone, Celular, Email, Logradouro, Complemento, Bairro, Cidade, Estado, Dependente1, Dependente2, Dependente3;
    DateConvertion DtC = new DateConvertion();
//<editor-fold defaultstate="collapsed" desc="Métodos Sets e Gets">

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

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the Identidade
     */
    public String getIdentidade() {
        return Identidade;
    }

    /**
     * @param identidade the Identidade to set
     */
    public void setIdentidade(String identidade) {
        this.Identidade = identidade;
    }

    /**
     * @return the Nascimento
     */
    public String getNascimento() {
        return Nascimento;
    }

    /**
     * @param Nascimento the Nascimento to set
     */
    public void setNascimento(String Nascimento) {
        this.Nascimento = Nascimento;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the Telefone
     */
    public String getTelefone() {
        return Telefone;
    }

    /**
     * @param Telefone the Telefone to set
     */
    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    /**
     * @return the Celular
     */
    public String getCelular() {
        return Celular;
    }

    /**
     * @param Celular the Celular to set
     */
    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    /**
     * @return the Logradouro
     */
    public String getLogradouro() {
        return Logradouro;
    }

    /**
     * @param Logradouro the Logradouro to set
     */
    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    /**
     * @return the Complemento
     */
    public String getComplemento() {
        return Complemento;
    }

    /**
     * @param Complemento the Complemento to set
     */
    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    /**
     * @return the Bairro
     */
    public String getBairro() {
        return Bairro;
    }

    /**
     * @param Bairro the Bairro to set
     */
    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    /**
     * @return the Cidade
     */
    public String getCidade() {
        return Cidade;
    }

    /**
     * @param Cidade the Cidade to set
     */
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    /**
     * @return the Estado
     */
    public String getEstado() {
        return Estado;
    }

    /**
     * @param Estado the Estado to set
     */
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    /**
     * @return the Dependente1
     */
    public String getDependente1() {
        return Dependente1;
    }

    /**
     * @param Dependente1 the Dependente1 to set
     */
    public void setDependente1(String Dependente1) {
        this.Dependente1 = Dependente1;
    }

    /**
     * @return the Dependente2
     */
    public String getDependente2() {
        return Dependente2;
    }

    /**
     * @param Dependente2 the Dependente2 to set
     */
    public void setDependente2(String Dependente2) {
        this.Dependente2 = Dependente2;
    }

    /**
     * @return the Dependente3
     */
    public String getDependente3() {
        return Dependente3;
    }

    /**
     * @param Dependente3 the Dependente3 to set
     */
    public void setDependente3(String Dependente3) {
        this.Dependente3 = Dependente3;
    }
//</editor-fold>

    @Override
    public void Cadastrar() {
        Connection ClienteConn = null;
        try {
            ClienteConn = ConexaoBD.ConectDB();
            Statement ClienteStmt = (Statement) ClienteConn.createStatement();
            String ClienteQuery = "insert into Cliente (Nome, cpf, Identidade, nascimento, telefone, celular, Email, Logradouro, Numero, complemento, Bairro, cidade, estado, cep, Dependente1, Dependente2, Dependente3)";
            ClienteQuery += "values ('" + getNome() + "','" + getCpf().replace("-", "").replace(".", "") + "','" + getIdentidade() + "','" + DtC.ConverterData(getNascimento()) + "','" + getTelefone() + "','" + getCelular() + "','" + getEmail() + "','" + getLogradouro() + "','" + getNumero() + "','" + getComplemento() + "','" + getBairro() + "','" + getCidade() + "','" + getEstado() + "','" + getCep().replace("-", "") + "','" + getDependente1() + "','" + getDependente2() + "','" + getDependente3() + "')";
            int result = ClienteStmt.executeUpdate(ClienteQuery);
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro na inserção.");
            }
        } catch (HeadlessException | SQLException e) {
            Logger.getLogger(Cad_ClienteJIF.class.getName()).log(Level.SEVERE, null, e);
        } catch (ParseException ex) {
            Logger.getLogger(DBMetClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Alterar(String escolha) {
        try {
            conn = ConexaoBD.ConectDB();
            String query = "UPDATE cliente SET nome=?, cpf=?, identidade=?, nascimento=?, telefone=?, celular=?, email=?, logradouro=?, numero=?, complemento=?, bairro=?, cidade=?, estado=?, cep=?, dependente1=?, dependente2=?, dependente3=? where cpf=?";

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, getNome());
            stmt.setString(2, getCpf());
            stmt.setString(3, getIdentidade());
            stmt.setString(4, getNascimento());
            stmt.setString(5, getTelefone());
            stmt.setString(6, getCelular());
            stmt.setString(7, getEmail());
            stmt.setString(8, getLogradouro());
            stmt.setString(9, getNumero());
            stmt.setString(10, getComplemento());
            stmt.setString(11, getBairro());
            stmt.setString(12, getCidade());
            stmt.setString(13, getEstado());
            stmt.setString(14, getCep());
            stmt.setString(15, getDependente1());
            stmt.setString(16, getDependente2());
            stmt.setString(17, getDependente3());
            stmt.setString(18, escolha);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Alteração realizada  com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Houve um erro na alteração dos dados!");
            }
        } catch (SQLException e) {
            Logger.getLogger(DBMetClientes.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void mostrar(String cod_escolha) {
        try {
            conn = ConexaoBD.ConectDB();
            stmt = (Statement) conn.createStatement();
            query = "select * from cliente where cpf= '" + cod_escolha + "'";
            resultado = stmt.executeQuery(query);
            while (resultado.next()) {
                setNome(resultado.getString("nome"));
                setCpf(resultado.getString("cpf"));
                setIdentidade(resultado.getString("identidade"));
                setNascimento(DtC.DesconverterData(resultado.getString("nascimento").replace("-", "/")));
                setTelefone(resultado.getString("telefone"));
                setCelular(resultado.getString("celular"));
                setEmail(resultado.getString("email"));
                setLogradouro(resultado.getString("logradouro"));
                setNumero(resultado.getString("numero"));
                setComplemento(resultado.getString("complemento"));
                setBairro(resultado.getString("bairro"));
                setCidade(resultado.getString("cidade"));
                setEstado(resultado.getString("estado"));
                setCep(resultado.getString("cep"));
                setDependente1(resultado.getString("dependente1"));
                setDependente2(resultado.getString("dependente2"));
                setDependente3(resultado.getString("dependente3"));
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(DBMetClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void exluir(String escolha) {
        try {
            conn = ConexaoBD.ConectDB();
            String query = "DELETE FROM cliente WHERE cpf=?";

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, escolha);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Houve um erro ao processar a exclusão!");
            }
        } catch (SQLException e) {
            Logger.getLogger(DBMetClientes.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
