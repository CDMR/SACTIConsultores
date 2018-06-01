/*Desarrollador: Carlos Daniel Marceleño Rodriguez*/
class Militar extends BE {
	private String conflicto;

	/**
	 * 
	 */
	
	protected Militar(String conflicto,String nombre,String region) {
		super(nombre,region);
		this.conflicto=conflicto;
	}

	/**
	 * @return the regimen
	 */
	public String getConflicto() {
		return conflicto;
	}

	/**
	 * @param regimen the regimen to set
	 */
	public void setConflicto(String conflicto) {
		this.conflicto = conflicto;
	}



}
