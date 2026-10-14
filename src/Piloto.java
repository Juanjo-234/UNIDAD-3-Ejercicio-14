public class Piloto {
    private String numeroLicencia;
    private  String nombre;
    private double horasAcumuladas;


    public Piloto(String numeroLicencia, String nombre, double horasAcumuladas){
        this.numeroLicencia = numeroLicencia;
        this.nombre = nombre;
        this.horasAcumuladas = horasAcumuladas;
    }

    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getHorasAcumuladas() {
        return horasAcumuladas;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasAcumuladas(double horasAcumuladas) {
        this.horasAcumuladas = horasAcumuladas;
    }


    public void registrarVuelo(double horas){
        if(horas <= 0){
            System.out.println("Ingrese un total de horas mayor a cero.");
        }else{
            this.horasAcumuladas += horas;
            System.out.println("Vuelo de " + horas + " horas registrado con exito.");
        }
    }

}
