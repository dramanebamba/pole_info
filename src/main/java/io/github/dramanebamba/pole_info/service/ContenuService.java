package main.java.io.github.dramanebamba.pole_info.service;

import java.util.HashMap;
import javax.enterprise.context.ApplicationScoped;

/**
 * Servlet implementation class ListeContenu
 */
@ApplicationScoped
public class ContenuService {
	public HashMap<Integer, String> getListeContenu() {
		return listeContenu;
	}
	public void setListeContenu(HashMap<Integer, String> listeContenu) {
		this.listeContenu = listeContenu;
	}
	HashMap<Integer, String> listeContenu = new HashMap<>();
	{
		listeContenu.put(1,"DataScience");
		listeContenu.put(2, "Java EE");
		listeContenu.put(3, "KM");
		listeContenu.put(4, "Datawarehouse");
		listeContenu.put(5, "Négociation");
	}
	public String getlisteContenuString(){
		return listeContenu.get(1);
	}


}
