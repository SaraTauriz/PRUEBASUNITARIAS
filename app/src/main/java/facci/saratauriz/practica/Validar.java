package facci.saratauriz.practica;


public class Validar {

    public boolean validarCampo(String cadena) {
        if (cadena.length()== 0){
            return false;
        }
        return true;
    }

    public boolean validarLargo(String cadena) {
        if (cadena.length() >= 4){
            return true;
        }
        return false;
    }

    public boolean validarlargo(String cadena) {
        if (cadena.length() >= 10){
            return true;
        }
        return false;
    }

}
