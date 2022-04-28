package Test;


import java.util.ArrayList;
import java.util.List;

import Hospital.HospitalMexico;
import Hospital.HospitalNicoya;
import Paciente.Paciente;

public class Test {

	
	public static void main(String[] args) {
		
		Paciente paciente1 = new Paciente("Juan", 30, 30,false);
		Paciente paciente2 = new Paciente("Carlos", 60, 60,true);
		
		Paciente paciente3 = new Paciente("Maria", 20, 10,false);
		Paciente paciente4 = new Paciente("Daniela", 62, 39,true);

		
		List<Paciente> listPaciente= new ArrayList<>();
		               listPaciente.add(paciente1);
		               listPaciente.add(paciente2);
		               
		List<Paciente> listPaciente2= new ArrayList<>();
		               listPaciente2.add(paciente3);
		               listPaciente2.add(paciente4);
		
		HospitalNicoya HospiNicoya = new HospitalNicoya(listPaciente);
		
		HospitalMexico HospiMexico = new HospitalMexico(listPaciente2);
		
		System.out.println("Reporte Hospital Nicoya");  //Rapida
		
		System.out.println(HospiNicoya.imprimirReporte());  
		
        System.out.println("Reporte Hospital Mexico");  
    	System.out.print(HospiMexico.imprimirReporte());  //PCR
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
