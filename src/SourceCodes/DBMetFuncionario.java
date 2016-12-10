/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCodes;

import DataBase.ConexaoBD;
import java.awt.HeadlessException;
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
public class DBMetFuncionario extends DBMetodos {

    private String nome, identidade, cpf, nascimento, endereco, numero, cep, complemento, bairro, cidade, estado, telefone, celular, email, cargo, login, senha;
    DateConvertion DtC = new DateConvertion();
    @Override
    public void Cadastrar() {
        try {
            conn = ConexaoBD.ConectDB();
            stmt = (Statement) conn.createStatement();
            String FuncQuery = "insert into funcionarios (nome, cpf, identidade, nascimento, logradouro, numero, cep, complemento, bairro, cidade, estado, telefone, celular, email, cargo, login, senha)";
            FuncQuery += "values ('" + getNome() + "','" + getCpf().replace("-", "").replace(".", "") + "','" + getIdentidade() + "','" + DtC.ConverterData(getNascimento()) + "','" + getEndereco() + "','" + getNumero() + "','" + getCep().replace("-", "") + "','" + getComplemento() + "','" + getBairro() + "','" + getCidade() + "','" + getEstado() + "','" + getTelefone() + "','" + getCelular() + "','" + getEmail() + "','" + getCargo() + "','" + getLogin() + "','" + getSenha() + "')";
            int salvar = stmt.executeUpdate(FuncQuery);
            if (salvar > 0) {
                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro na inserção dos dados.");
            }
        } catch (HeadlessException | SQLException e) {
            Logger.getLogger(DBMetodos.class.getName()).log(Level.SEVERE, null, e);
        } catch (ParseException ex) {
            Logger.getLogger(DBMetFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void Alterar(String escolha) {
        try {
            conn = ConexaoBD.ConectDB();
            String query = "UPDATE funcionarios SET nome=?, identidade=?, cpf=?, nascimento=?, logradouro=?, numero=?, cep=?, complemento=?, bairro=?, cidade=?, estado=?, telefone=?, celular=?, email=?, cargo=?, login=?, senha=? where cpf=?";

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, getNome());
            stmt.setString(2, getIdentidade());
            stmt.setString(3, getCpf());
            stmt.setString(4, DtC.ConverterData(getNascimento()));
            stmt.setString(5, getEndereco());
            stmt.setString(6, getNumero());
            stmt.setString(7, getCep());
            stmt.setString(8, getComplemento());
            stmt.setString(9, getBairro());
            stmt.setString(10, getCidade());
            stmt.setString(11, getEstado());
            stmt.setString(12, getTelefone());
            stmt.setString(13, getCelular());
            stmt.setString(14, getEmail());
            stmt.setString(15, getCargo());
            stmt.setString(16, getLogin());
            stmt.setString(17, getSenha());
            stmt.setString(18, escolha);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Alteração realizada  com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Houve um erro na alteração dos dados!");
            }
        } catch (SQLException | ParseException e) {
            Logger.getLogger(DBMetFuncionario.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    @Override
    public void mostrar(String cod_escolha) {
        try {
            conn = ConexaoBD.ConectDB();
            stmt = (Statement) conn.createStatement();
            query = "select * from funcionarios where cpf= '" + cod_escolha + "'";
            resultado = stmt.executeQuery(query);
            while (resultado.next()) {
                setNome(resultado.getString("nome"));
                setIdentidade(resultado.getString("identidade"));
                setCpf(resultado.getString("cpf"));
                setNascimento(DtC.DesconverterData(resultado.getString("nascimento").replace("-", "/")));
                setEndereco(resultado.getString("logradouro"));
                setNumero(resultado.getString("numero"));
                setCep(resultado.getString("cep"));
                setComplemento(resultado.getString("complemento"));
                setBairro(resultado.getString("bairro"));
                setCidade(resultado.getString("cidade"));
                setEstado(resultado.getString("estado"));
                setTelefone(resultado.getString("telefone"));
                setCelular(resultado.getString("celular"));
                setEmail(resultado.getString("email"));
                setCargo(resultado.getString("cargo"));
                setLogin(resultado.getString("login"));
                setSenha(resultado.getString("senha"));
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(DBMetFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    @Override
    public void Exluir(String escolha) {
        try {
            conn = ConexaoBD.ConectDB();
            String query = "DELETE FROM funcionarios WHERE cpf=?";

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, escolha);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Houve um erro ao processar a exclusão!");
            }
        } catch (SQLException e) {
            Logger.getLogger(DBMetFuncionario.class.getName()).log(Level.SEVERE, null, e);
        }
    }

// <editor-fold defaultstate="collapsed" desc="Sets e Gets">
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
     * @return the identidade
     */
    public String getIdentidade() {
        return identidade;
    }

    /**
     * @param identidade the identidade to set
     */
    public void setIdentidade(String identidade) {
        this.identidade = identidade;
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
     * @return the nascimento
     */
    public String getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
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
     * @return the complemento
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }
//</editor-fold>

}
