package datos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import database.Conexion;
//import datos.CrudInterface.CategoriaInterface;
//import entidades.Categoria;
import java.util.List;

public class CategoriaDAO implements CategoriaInterface<Object> {
    
    //variables
    private final Conexion CON;
    private PreparedStatement ps;
    private ResultSet resp;
    
    //Constructor

    public CategoriaDAO(Conexion CON) {
        this.CON = CON;
    }
    
    
}
