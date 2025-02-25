package testClases.demoQA;


import email.Email;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class enviarEmail {
    private static String fecha;



    @Test()
    public void enviarEmail(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd");
        Date date = new Date();
        fecha = dateFormat.format(date);


        Email email = new Email();
        email.setDestinatario("rodrigo.e.maltez@gmail.com");
        email.setAsunto("Reporte Ejecucion");
        email.configurarCuerpoEmail("Estimados");
        email.configurarCabeceraEmail();
        email.setFileFolder("C:\\jenkins");
        email.setFileName("report"+"_"+fecha+".zip");
        email.configurarCuerpoEmail("Estimados");
        email.enviarMensaje();

    }


}
