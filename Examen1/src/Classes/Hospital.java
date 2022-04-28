package Classes;
public enum Hospital {
    MEXICO("Hospital de Nicoya"), 
    NICOYA("Hospital México");
	
    private String nombreHospital;
    
    private Hospital (String nombreHospital){
        this.nombreHospital = nombreHospital;
    }

    public String getNombreHospital() {
        return this.nombreHospital;
    }
}
