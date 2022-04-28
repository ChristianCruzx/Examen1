package Classes;

import java.util.List;

public abstract class OMS {//patron de diseno template
	private List<Paciente>  listPac;
	List<PruebaCovid19>  listPC19;
	public OMS(List<Paciente>  listPac) {
		this.listPac=listPac;
	}
	
	protected abstract  boolean  isGamHospital();
	protected abstract  Hospital  getNombreHospital();
	
	private void diagnosticar() {
		for(int i=0;i<listPac.size(); i++)
		{	
			Paciente p = listPac.get(i);
			if(isGamHospital()) {
				PruebaCovid19 covid19 = new PruebaPCR(p);
				listPC19.add(covid19);
			}else{
				PruebaCovid19 covid19 = new PruebaRapida(p);
				listPC19.add(covid19);
			}
		}
		
	}
}
