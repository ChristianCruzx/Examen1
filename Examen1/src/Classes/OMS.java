package Classes;

import java.util.List;

public abstract class OMS {//patron de diseno template
	private List<PruebaCovid19>  listPC19;
	//inyeccion de dependencia
	public OMS(List<PruebaCovid19>  listPC19) {
		this.listPC19=listPC19;
	}
	
	protected abstract  boolean  isGamHospital();
	protected abstract  Hospital  getNombreHospital();

	
}
