/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SourceCodes;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gian Luca
 */
public class Reserva extends DBMetodos {
    DateConvertion date = new DateConvertion();
    private String cpf, dataReserva, dataBusca, status;
    private int idReserva;
    private float valor;
    private ArrayList codigoFilme;
    //<editor-fold defaultstate="collapsed" desc="Sets e gets">

    /**
     * @return the idReserva
     */
    public int getIdReserva() {
        return idReserva;
    }

    /**
     * @param idReserva the idReserva to set
     */
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
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
     * @return the dataReserva
     */
    public String getDataReserva() {
        return dataReserva;
    }

    /**
     * @param dataReserva the dataReserva to set
     */
    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    /**
     * @return the dataBusca
     */
    public String getDataBusca() {
        return dataBusca;
    }

    /**
     * @param dataBusca the dataBusca to set
     */
    public void setDataBusca(String dataBusca) {
        this.dataBusca = dataBusca;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the codigoFilme
     */
    public ArrayList getCodigoFilme() {
        return codigoFilme;
    }

    /**
     * @param codigoFilme the codigoFilme to set
     */
    public void setCodigoFilme(ArrayList codigoFilme) {
        this.codigoFilme = codigoFilme;
    }
    
    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }
    
    //</editor-fold>
    @Override
    public void Cadastrar() {
        try {
            String sql = "INSERT INTO Users (idreserva, databusca, datareserva, valor, filmes_codigofilmes, cliente_cpf, status) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement;
            statement = conn.prepareStatement(sql);
            statement.setInt(1, getIdReserva());
            statement.setString(2, date.ConverterData(getDataBusca()));
            statement.setString(3, date.ConverterData(getDataReserva()));
            statement.setFloat(4, getValor());
            statement.setArray(5, (Array) getCodigoFilme());
            statement.setString(6, getCpf());
            statement.setString(7, getStatus());
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new user was inserted successfully!");
            }
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(Reserva.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    

}
