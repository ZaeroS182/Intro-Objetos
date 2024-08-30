
public class Main {

	public static void main(String[] args) {
		
		Estudiante e = new Estudiante();
		
		e.setNombres ("Juan Camilo");
		e.setApellidos ("Londoño Perez");
		e.setCorreo ("juca@gmail.com");
		e.setDocumento ("109464523");
		e.setEdad (19);
		
		System.out.println("santiago estuvo aqui <3");
		
		
		// Instanciar es lo que esta aqui abajo
		Estudiante e2 = new Estudiante("claudia" , "londoño", "coco@gmail.com", "1231234", 20);
		
		System.out.println(e.getNombres() + " " + e.getApellidos());
		
		System.out.println(e2.getNombres() + " " + e2.getApellidos() +  " " + e2.getCorreo());
		
		// el constructor es un metodo, primer meotod que se ejecuta cuando creo un objeto, 
		// sirve para instanciar una clase o un objeto
	}

}
