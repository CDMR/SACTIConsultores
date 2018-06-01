/*Desarrollador: Carlos Daniel Marceleño Rodriguez*/
abstract class BE implements reactable{
	private String nombre;
	private String region;
	public String perturbacion;
	/**
	 * 
	 */
	@Override
	public void reaccionar(String perturbacion){
		this.perturbacion=perturbacion;
		System.out.println("BE reacciono a"+perturbacion);
	}
	protected BE(String nombre,String region) {
		this.setNombre(nombre);
		this.setNombre(region);
		
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}

}
