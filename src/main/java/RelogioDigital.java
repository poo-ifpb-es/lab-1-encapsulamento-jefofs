import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;

public class RelogioDigital {
    int hora;
    int minuto;

    public RelogioDigital(){
        hora = 12;
        minuto = 20;
    }

    public void tick(){
        if(minuto < 59){
            this.minuto++;
        }else{
            this.hora++;
            this.minuto = 0;
        }
        if(hora == 24){
            this.hora = 0;
        }
    }

    public int getHora(){
        return this.hora;
    }

    public int getMinuto(){
        return this.minuto;
    }

    public void setHora(int hora){
        this.hora = hora;
    }

    public void setMinuto(int minuto){
        this.minuto = minuto;
    }

}