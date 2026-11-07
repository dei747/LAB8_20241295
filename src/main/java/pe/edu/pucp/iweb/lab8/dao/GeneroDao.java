package pe.edu.pucp.iweb.lab8.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import pe.edu.pucp.iweb.lab8.beans.Genero;

public class GeneroDao extends BaseDao{ // TODO: heredar de BaseDao

    /**
     * Ejercicio 2: todos los géneros ordenados por nombre.
     */
    public ArrayList<Genero> listar() {
        // TODO
        ArrayList<Genero> listaGenero = new ArrayList<>();

        try(Connection conn = this.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select g.idgenero, g.nombre"
                    + "FROM genero g ORDER BY g.nombre;")){
            while (rs.next()){
                Genero genero = new Genero();
                genero.setIdGenero(rs.getInt(1));
                genero.setNombre(rs.getString(2));
                listaGenero.add(genero);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listaGenero;
    }
}
