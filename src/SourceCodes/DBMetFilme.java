/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCodes;

import DataBase.ConexaoBD;
import GUILocadora.Cad_ClienteJIF;
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
public class DBMetFilme extends DBMetodos {

    private String codigo, quantidade, titulo, lancamento, duracao, genero, disco, cor, classificacao, diretor, roteirista, distribuidora, capa;
    DateConvertion DtC = new DateConvertion();

    @Override //Funcionando, não mexer
    public void Cadastrar() {
        try {
            conn = ConexaoBD.ConectDB();
            stmt = (Statement) conn.createStatement();
            query = "insert into filmes (codigoFilme, quantidade, titulo, lancamento, duracao, genero, disco, cor, classificacao, diretor, roteirista, distribuidora, capa)";
            query += "values ('" + getCodigo() + "','" + getQuantidade() + "','" + getTitulo() + "','" + DtC.ConverterData(getLancamento()) + "','" + getDuracao() + "','" + getGenero() + "','" + getDisco() + "','" + getCor() + "','" + getClassificacao() + "','" + getDiretor() + "','" + getRoteirista() + "','" + getDistribuidora() + "','" + getCapa() + "')";
            int result = stmt.executeUpdate(query);
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso.");
            } else {
                JOptionPane.showMessageDialog(null, "Erro na inserção.");

            }
        } catch (HeadlessException | SQLException e) {
            Logger.getLogger(Cad_ClienteJIF.class.getName()).log(Level.SEVERE, null, e);
        } catch (ParseException ex) {
            Logger.getLogger(DBMetFilme.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBMetFilme.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void Exluir(String escolha) {
        try {
            conn = ConexaoBD.ConectDB();
            String query = "DELETE FROM filmes WHERE codigofilme=?";

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, escolha);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Exclusão realizada com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Houve um erro ao processar a exclusão!");
            }
        } catch (SQLException e) {
            Logger.getLogger(DBMetFilme.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public void mostrar(String cod_escolha) {
        try {
            conn = ConexaoBD.ConectDB();
            stmt = (Statement) conn.createStatement();
            query = "select * from filmes where codigoFilme= '" + cod_escolha + "'";
            resultado = stmt.executeQuery(query);
            while (resultado.next()) {
                setCodigo(resultado.getString("codigoFilme"));
                setQuantidade(resultado.getString("quantidade"));
                setTitulo(resultado.getString("titulo"));
                setLancamento(DtC.DesconverterData(resultado.getString("lancamento").replace("-", "/")));
                setDuracao(resultado.getString("duracao"));
                setGenero(resultado.getString("genero"));
                setDisco(resultado.getString("disco"));
                setCor(resultado.getString("cor"));
                setClassificacao(resultado.getString("classificacao"));
                setDiretor(resultado.getString("diretor"));
                setRoteirista(resultado.getString("roteirista"));
                setDistribuidora(resultado.getString("distribuidora"));
                setCapa(resultado.getString("capa"));
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(DBMetFilme.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void Alterar(String escolha) {
        try {
            conn = ConexaoBD.ConectDB();
            String query = "UPDATE filmes SET codigofilme=?, quantidade=?, titulo=?, lancamento=?, duracao=?, genero=?, disco=?, cor=?, classificacao=?, diretor=?, roteirista=?, distribuidora=?, capa=? where codigofilme=?";

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, getCodigo());
            stmt.setString(2, getQuantidade());
            stmt.setString(3, getTitulo());
            stmt.setString(4, DtC.ConverterData(getLancamento()));
            stmt.setString(5, getDuracao());
            stmt.setString(6, getGenero());
            stmt.setString(7, getDisco());
            stmt.setString(8, getCor());
            stmt.setString(9, getClassificacao());
            stmt.setString(10, getDiretor());
            stmt.setString(11, getRoteirista());
            stmt.setString(12, getDistribuidora());
            stmt.setString(13, getCapa());
            stmt.setString(14, escolha);

            int rowsDeleted = stmt.executeUpdate();
            if (rowsDeleted > 0) {
                JOptionPane.showMessageDialog(null, "Alteração realizada  com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Houve um erro na alteração dos dados!");
            }
        } catch (SQLException | ParseException e) {
            Logger.getLogger(DBMetFilme.class.getName()).log(Level.SEVERE, null, e);
        }
    }

//<editor-fold defaultstate="collapsed" desc="Métodos Sets e Gets">
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
     * @return the lancamento
     */
    public String getLancamento() {
        return lancamento;
    }

    /**
     * @param lancamento the lancamento to set
     */
    public void setLancamento(String lancamento) {
        this.lancamento = lancamento;
    }

    /**
     * @return the duracao
     */
    public String getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the disco
     */
    public String getDisco() {
        return disco;
    }

    /**
     * @param disco the disco to set
     */
    public void setDisco(String disco) {
        this.disco = disco;
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

    /**
     * @return the classificacao
     */
    public String getClassificacao() {
        return classificacao;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    /**
     * @return the diretor
     */
    public String getDiretor() {
        return diretor;
    }

    /**
     * @param diretor the diretor to set
     */
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    /**
     * @return the roteirista
     */
    public String getRoteirista() {
        return roteirista;
    }

    /**
     * @param roteirista the roteirista to set
     */
    public void setRoteirista(String roteirista) {
        this.roteirista = roteirista;
    }

    /**
     * @return the distribuidora
     */
    public String getDistribuidora() {
        return distribuidora;
    }

    /**
     * @param distribuidora the distribuidora to set
     */
    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    /**
     * @return the capa
     */
    public String getCapa() {
        return capa;
    }

    /**
     * @param capa the capa to set
     */
    public void setCapa(String capa) {
        this.capa = capa;
    }
    //</editor-fold>

}
