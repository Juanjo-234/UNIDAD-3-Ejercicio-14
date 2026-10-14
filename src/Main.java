//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
Piloto piloto = new Piloto("ASD-1234", "JUAN PEREZ", 10);

piloto.registrarVuelo(2.5);
piloto.registrarVuelo(2.5);
piloto.registrarVuelo(-2.5);

    System.out.println("Total de horas de vuelo acumuladas: " + piloto.getHorasAcumuladas() + " hrs.");
}
