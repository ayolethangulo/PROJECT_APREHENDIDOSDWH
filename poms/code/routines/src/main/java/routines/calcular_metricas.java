package routines;

public class calcular_metricas {

    public static int Calcularfemenino(String genero) {
    	int count = 0;
        if (genero.equals("FEMENINO")) {
            count=1;
        }
        return count;
    }
    public static int Calcularmasculino(String genero) {
    	int count = 0;
        if (genero.equals("MASCULINO")) {
            count=1;
        }
        return count;
    }
}
