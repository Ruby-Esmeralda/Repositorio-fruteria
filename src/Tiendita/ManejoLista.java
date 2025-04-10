package Tiendita;

public class ManejoLista {
	public Nodo primero;
	public Nodo ultimo;
	
	public ManejoLista (String String) {
		primero=null;
		ultimo=null;
	}

	public void guardar(Nodo nuevo) {
		if(primero==null) {
			primero=nuevo;
			ultimo=nuevo;
		}else {
			ultimo.Siguiente=nuevo;
			ultimo=nuevo;
		}
	}
		
	public Nodo buscar(String nombreFruta) {
		Nodo aux = primero;
		while(aux != null) {
			if(aux.getNombre().equalsIgnoreCase(nombreFruta)) {
				return aux;
			}
			aux = aux.Siguiente;
		}
		return null;
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

