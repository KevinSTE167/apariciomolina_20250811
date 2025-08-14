/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apariciomolina_20250811;

/**
 *
 * @author UFG
 */
public class Main{
    
    public static int HoraEnUnDia = 24;
    public static int SegundosEnUnaHora = 3600;
    public static int SegundosEnUnMinuto = 60;
    
    public static void main(String[] args) {

        //variable local
        int SegundosTotales = 91111;
        
        //se asigna el valor de dias a la variable local
        int dias = CalcularDias(SegundosTotales);
        //se asigma el valor de los segundos restates despues de haber calculado los dias
        int SegundosRestantesDespuesDeExtraerDias = ObtenerSegundosRestantesDespuesDeExtraerDias(SegundosTotales);
        //se asigma el valor de las horas a partir de los segundos restantes del calculo de dias
        int horas = CalcularHoras(SegundosRestantesDespuesDeExtraerDias);
        //se asigna el valor de los segundos restantes a partir del calculo de dias
        int SegundosRestantesDespuesDeExtraerHoras = ObtenerSegundosRestantesDespuesDeExtraerHoras(SegundosRestantesDespuesDeExtraerDias);
        //se asigma el valor de los minutos a partir de los segundos restantes del calculo de horas
        int minutos = CalcularMinutos(SegundosRestantesDespuesDeExtraerHoras);
        //los segundos que quedan despues de haber realizado todos los calculos anteriores
        int SegundosFinales = ObtenerSegundosRestantesDespuesDeExtraerMinutos(SegundosRestantesDespuesDeExtraerHoras);
        
        System.out.println("Usted ha solicitado los dias, horas, minutos y segundos a partir de un numero mayor a 86400");
        System.out.println("Usted ha indicado el valor actual de segundos como: "+SegundosTotales);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
        System.out.println("Minutos: "+minutos);
        System.out.println("Segundos: "+SegundosFinales);
    }
    //modulo para calcular los dias
    public static int CalcularDias(int SegundosTotales){
        return SegundosTotales/(Main.HoraEnUnDia*Main.SegundosEnUnaHora);
        
    }
    //modulo para calcular los segundos restantes depues de extraer dias
    public static int ObtenerSegundosRestantesDespuesDeExtraerDias(int SegundosTotales){
        return SegundosTotales % (Main.HoraEnUnDia*Main.SegundosEnUnaHora);
        
    }
    //modulo para calcular las horas
    public static int CalcularHoras(int SegundosRestantes){
        return SegundosRestantes/Main.SegundosEnUnaHora;
    }
    //modulo para calcular los segundos restantes depues de extraer horas
    public static int ObtenerSegundosRestantesDespuesDeExtraerHoras(int SegundosRestantes){
        return SegundosRestantes % Main.SegundosEnUnaHora;
        
    }
    //modulo para calcular las minutos
    public static int CalcularMinutos(int SegundosRestantes){
        return SegundosRestantes/Main.SegundosEnUnMinuto;
    }
    //modulo para calcular los segundos restantes depues de extraer minutos
    public static int ObtenerSegundosRestantesDespuesDeExtraerMinutos(int SegundosRestantes){
        return SegundosRestantes % Main.SegundosEnUnMinuto;
        
    }
}