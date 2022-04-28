package Hospital;



import java.util.ArrayList;
import java.util.List;

import Paciente.Paciente;
import Pruebas.PruebaCovid19;
import Pruebas.PruebaPCR;
import Pruebas.PruebaRapida;

public abstract class OMS {//patron de diseno template
	private List<Paciente>  listPac;
	public OMS(List<Paciente>  listPac) {
		this.listPac=listPac;
	}
	
	protected abstract  boolean  isGamHospital();
	protected abstract  Hospital  getNombreHospital();
	
	private List<PruebaCovid19> diagnosticar() {
		List<PruebaCovid19>  resultadoList = new ArrayList<>() ;
		for(int i=0;i<listPac.size(); i++)
		{	
			Paciente p = listPac.get(i);
			if(isGamHospital()) {
				PruebaCovid19 covid19 = new PruebaPCR(p);
				resultadoList.add(covid19);
			}else{
				PruebaCovid19 covid19 = new PruebaRapida(p);
				resultadoList.add(covid19);
			}
		}
		return resultadoList;
	}
	final public String imprimirReporte() { //Metodo inmutable
		String reporte= "-----------------------"+"\n"+getNombreHospital()+"\n"+  "-----------------------"+"\n";
		List<PruebaCovid19>  resultadoList =diagnosticar();
		for(int i=0;i<listPac.size(); i++)
		{	
			reporte+="Nombre: "+resultadoList.get(i).getNombrePaciente();
			reporte+="Resultado: ";
			reporte+=(resultadoList.get(i).isPositiveCase())?"Positivo Covid19":"Negativo" +"\n"+ "-----------------------"+"\n";
			
		}
		return reporte;
	}
}
