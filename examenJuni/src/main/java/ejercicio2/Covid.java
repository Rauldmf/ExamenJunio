package ejercicio2;

public class Covid {

	public int calcularPrioridadVacunacion(int edad, int numeroDosis) {
	int prioridad =1;
	
	if(edad > 55 && numeroDosis==1) {
		prioridad = 2;
	}
	else if(edad > 35 && edad <=55 && numeroDosis==1) {
		prioridad = 3;
	}
	else {
		prioridad = 1;
	}
	
	return prioridad;
}

}
