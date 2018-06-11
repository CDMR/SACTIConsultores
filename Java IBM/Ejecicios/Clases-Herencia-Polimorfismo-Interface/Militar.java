package EHCPI;
/**Desarrollador: Carlos Daniel Marcleño Rodriguez**/
public abstract class Militar extends Presentation {
	protected String conflicto;
	protected Militar(String conflicto,String nombre,String region) {
		super(nombre,region);
		this.conflicto=conflicto;
	}
	public String getConflicto() {
		return conflicto;
	}
	public void setConflicto(String conflicto) {
		this.conflicto = conflicto;
	}
}
