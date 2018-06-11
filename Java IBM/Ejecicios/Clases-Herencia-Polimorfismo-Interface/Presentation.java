package EHCPI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
/**Desarrollador: Carlos Daniel Marceleño Rodriguez**/
abstract class Presentation implements reactable{
	protected String nombre;
	protected String region;
	protected String perturbacion;
	protected String reaccion;
	
	protected Presentation(String nombre,String region) {
		this.setNombre(nombre);
		this.setRegion(region);
	}
	protected String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	@Override
		public void reaccionar(){
			/*Se recomienda el uso estructuras de decision dependientes de perturbacion*/
			this.reaccion="reaccion";
		}
	@Override
		public void perturbar(String perturbacion){
		/*Se recomienda el uso estructuras de decision dependientes de perturbacion*/
			this.perturbacion=perturbacion;
	}
	public static void main(String[] args){
	/*Banco de pruebas*/
		Logger l = Logger.getAnonymousLogger();
		/*Listas*/
		ArrayList<Civil> R = new ArrayList<Civil>();
		List<Tradicional> S1 = new ArrayList<Tradicional>();
		List<Tecnica> S2 = new ArrayList<Tecnica>();
		List<Serviciosemergentes> S3 = new ArrayList<Serviciosemergentes>();
		List<Precariado> S4 = new ArrayList<Precariado>();
		List<Nuevosricos> S5 = new ArrayList<Nuevosricos>();
		List<Establecida> S6 = new ArrayList<Establecida>();
		List<Acomodada> S7 = new ArrayList<Acomodada>();
		List<Elite> S8 = new ArrayList<Elite>();
				S1.add(new Tradicional("Carlos Daniel Marceleño Rodriguez","CDMX"));
				S1.add(new Tradicional("Carlos Daniel Marceleño Rodriguez","Estado de Mexico"));
				S2.add(new Tecnica("Carlos Daniel Marceleño Rodriguez","CDMX"));
				S3.add(new Serviciosemergentes("Carlos Daniel Marceleño Rodriguez","CDMX"));
				S4.add(new Precariado("Carlos Daniel Marceleño Rodriguez","CDMX"));
				S5.add(new Nuevosricos("Carlos Daniel Marceleño Rodriguez","CDMX"));
				S6.add(new Establecida("Carlos Daniel Marceleño Rodriguez","CDMX"));
				S7.add(new Acomodada("Carlos Daniel Marceleño Rodriguez","CDMX"));	
				S8.add(new Elite("Carlos Daniel Marceleño Rodriguez","CDMX"));	
				R.addAll(S1);
				R.addAll(S2);
				R.addAll(S3);
				R.addAll(S4);
				R.addAll(S5);
				R.addAll(S6);
				R.addAll(S7);
				R.addAll(S8);
				
		/*Conjuntos con implementacion HashSet*/		
		Set<Civil> R7 = new HashSet<Civil>();
			R7.addAll(S1);
			R7.addAll(S2);
			R7.addAll(S3);
			R7.addAll(S4);
			R7.addAll(S5);
			R7.addAll(S6);
			R7.addAll(S7);
			R7.addAll(S8);
			
			for (int aa=0;aa < R.size();aa++) {
		l.info("Iteration number: "+aa);
		l.info("Tamaño de la lista: "+R.size());
		l.info("Contenido de Elemento "+aa+" en la lista :"+R.get(aa));
		l.info("Nombre: "+R.get(aa).nombre);
		l.info("Region: "+R.get(aa).region);
		l.info("Clase: "+R.get(aa).getClass());
	}	  
	}
	}
