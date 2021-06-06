package br.edu.prjListaDeContatos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ListaFisico extends ListaContatos {
    private Calendar bDay;

    public Calendar getBDay() {
        return bDay;
    }

    public void setDataNascimento(String dataNascimento) throws ParseException {
        Calendar cal= Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

        cal.setTime(sdf.parse(dataNascimento));

        this.bDay=cal;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        return super.toString()+
                "" +
                "bDay=" + sdf.format(bDay.getTime()) +
                '}';
    }
}
