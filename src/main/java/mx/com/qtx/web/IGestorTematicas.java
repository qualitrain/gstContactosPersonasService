package mx.com.qtx.web;

import java.util.List;

import mx.com.qtx.entidades.TematicaPersona;

public interface IGestorTematicas {
	List<TematicaPersona> getTematicasXpersona(int numPersona);

}
