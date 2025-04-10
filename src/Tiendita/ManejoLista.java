package Tiendita;

public class ManejoLista {
	public Nodo primero;
	public Nodo ultimo;
	
	public ManejoLista (String String) {
		primero=null;
		ultimo=null;
	}
	public void guardar() {
		
	}
	public Nodo buscar(String nombrefruta) {
		
	}
	public void eliminar(String nombreFruta) {
		if (primero==null) return;
		
		if(primero.getNombre().equalsIgnoreCase(nombreFruta)) {
			primero=primero.Siguiente;
			if(primero==null) {
			ultimo=null;
		}
		return;
	}
	
	Nodo aux= primero ;
	while(aux.Siguiente !=null && !aux.Siguiente.getNombre().equalsIgnoreCase(nombreFruta)) {
	aux=aux.Siguiente;
	}
	if(aux.Siguiente !=null) {
		aux.Siguiente=aux.Siguiente.Siguiente;
		if(aux.Siguiente==null) {
			ultimo=aux;
			}
		}
	}
}

