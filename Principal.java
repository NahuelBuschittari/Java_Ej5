package ui;

import java.util.Scanner;

import entidades.*;
//import java.util.ArrayList;
public class Principal {
	static Scanner lector;
	public static void main(String[] args) {
		lector=new Scanner(System.in);
		//ArrayList<Empleado> empleados= new ArrayList<>();
		Empleado[] empleados= new Empleado[20];
		int op=5;
		int cont=0;
		while( cont<empleados.length-1 && op!=0) {
		//while (cont!=20 && op!=0) {
				System.out.println("Ingrese: ");
				System.out.println("	1. para cargar un nuevo empleado administrativo ");
				System.out.println("	2. para cargar un nuevo empleado vendedor");
				System.out.println("	0. para dejar de cargar");
				op=Integer.parseInt(lector.nextLine());
				if (op!=0) {
					if (op==1) {
					Administrativo a= new Administrativo();
					cargaDatosComunes(a);
					System.out.println("Ingrese las horas extra cumplidas por: "+a.getNomApe());
					a.setHsExtra(Integer.parseInt(lector.nextLine()));
					System.out.println("Ingrese las horas del mes cumplidas: ");
					a.setHsMes(Integer.parseInt(lector.nextLine()));
					empleados[cont]=a;
					//empleados.add(a);
						}
					else {
					Vendedor a= new Vendedor();
					cargaDatosComunes(a);
					System.out.println("Ingrese porcentaje de comision: ");
					a.setPorcenComision(Integer.parseInt(lector.nextLine()));
					System.out.println("Ingrese el total de las ventas del "+a.getNomApe());
					a.setTotalVtas(Integer.parseInt(lector.nextLine()));
					empleados[cont]=a;
					//empleados.add(a);
						}
					cont++;
				}
		
		}
		
		System.out.println("Lista de empleados:"
				+ "\n	Tipo empleado     DNI   Nombre   Apellido  Sueldo ");
		//for (Empleado empleado : empleados) {
		for (int i = 0; i < empleados.length; i++) {
			System.out.println(empleados[i].getDetalle()+"  $"+empleados[i].getSueldo());
			//System.out.println(empleado.getDetalle()+"    $"+empleado.getSueldo());
		}	
		lector.close();
		
}
	public static void cargaDatosComunes(Empleado e) {
		System.out.print("Ingrese DNI: ");
		e.setDni(Integer.parseInt(lector.nextLine()));
		System.out.print("Ingrese nombre: ");
		e.setNombre(lector.nextLine());	
		System.out.print("Ingrese apellido: ");
		e.setApellido(lector.nextLine());
		System.out.println("Ingrese el sueldo base de "+e.getNomApe());
		e.setSueldoBase(Integer.parseInt(lector.nextLine()));
	}
	}