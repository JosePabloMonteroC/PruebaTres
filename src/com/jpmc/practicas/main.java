package com.jpmc.practicas;

public class main {

	public static void main(String[] args) {
		Biblioteca obj1 = new Biblioteca("LibrosJuan","Insurgentes Sur", 30, 30);
		obj1.agregarAlumno("Pablo", "Montero", 19, 4);
		obj1.agregarProfesor("Ramon", "Sanchez", "Programacion", 48);
		
		obj1.alumnos[0].prestamo("Don quijote de la mancha");
		obj1.profesores[0].prestamo("El psicoanalista");
		obj1.imprimirDatos();

	}

}
