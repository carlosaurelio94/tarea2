package com.example.demo1;

public class bucleswitch {
    public static void main(String[] args) {
    var estacion = "veranno";

    switch(estacion) {
        case "verano":
            System.out.println("es verano");
            break;
        case "invierno":
            System.out.println("es invierno");
            break;
        case "otoño":
            System.out.println("es otoño");
            break;
        case "primavera":
            System.out.println("es primavera");
            break;
        default:
            System.out.println("los datos ingresados son incorrectos: " + estacion);

    }
}
}

