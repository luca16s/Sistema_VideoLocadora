/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SourceCodes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Gian Luca
 */
public class DateConvertion {
    String Dataspadrao;
    public String ConverterData(String Data) throws ParseException{
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date minhaData = dateFormat.parse(Data);
        java.sql.Date sqlDate = new java.sql.Date(minhaData.getTime());
        String DataCorreta = sqlDate.toString();
        //JOptionPane.showMessageDialog(null, DataCorreta);
        return DataCorreta;
    }
    public String DesconverterData(String Data) throws ParseException{
        //java.sql.Date dataSql = new java.sql.Date(System.currentTimeMillis());
        Date dataConvertidaEmUtil = new Date(Data);
        String DataCorreta = new SimpleDateFormat("dd/MM/yyyy").format(dataConvertidaEmUtil);
        return DataCorreta;
    }
}
