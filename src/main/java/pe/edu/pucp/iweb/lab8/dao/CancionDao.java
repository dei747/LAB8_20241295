package pe.edu.pucp.iweb.lab8.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.eclipse.tags.shaded.org.apache.bcel.generic.Select;
import pe.edu.pucp.iweb.lab8.beans.Cancion;
import pe.edu.pucp.iweb.lab8.beans.Genero;

public class CancionDao extends BaseDao{ // TODO: heredar de BaseDao

    /**
     * Ejercicio 2: todas las canciones (con el nombre de su género, JOIN),
     * ordenadas por título. Use PreparedStatement.
     */

    public ArrayList<Cancion> listar() {
        // TODO
        ArrayList<Cancion> listaCanciones = new ArrayList<>();

        try(Connection conn = this.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select c.titulo, c.artista, c.duracion_seg AS duracion, c.anio, g.nombre"
                    + "FROM cancion c JOIN genero g on g.idgenero = c.idgenero ORDER BY c.titulo;")){
            while (rs.next()){
                Cancion cancion = new Cancion();
                cancion.setTitulo(rs.getString(1));
                cancion.setArtista(rs.getString(2));
                cancion.setDuracion_seg(rs.getInt(3));
                cancion.setAnio(rs.getInt(4));
                cancion.setGenero(rs.getString(5));
                listaCanciones.add(cancion);

            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listaCanciones;
    }

    /**
     * Ejercicio 2: la canción con ese id, o null si no existe.
     */
    public Cancion buscarPorId(int idCancion) {
        // TODO
        ArrayList<Cancion> listaCanciones = new ArrayList<>();

        try(Connection conn = this.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select c.titulo, c.artista, c.duracion_seg AS duracion, c.anio, g.nombre"
                    + "FROM cancion c JOIN genero g on g.idgenero = c.idgenero  WHERE c.idcancion IS NOT NULL;)){
            while (rs.next()){
                Cancion cancion = new Cancion();
                cancion.setTitulo(rs.getString(1));
                cancion.setArtista(rs.getString(2));
                cancion.setDuracion_seg(rs.getInt(3));
                cancion.setAnio(rs.getInt(4));
                cancion.setGenero(rs.getString(5));
                listaCanciones.add(cancion);

            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listaCanciones;
    }

    /**
     * Ejercicio 2: INSERT de una canción nueva (PreparedStatement).
     */
    public void crear(Cancion cancion) {
        // TODO
    }

    /**
     * Ejercicio 2: UPDATE de una canción existente (PreparedStatement).
     */
    public void actualizar(Cancion cancion) {
        // TODO
    }

    /**
     * Ejercicio 3: DELETE por id (PreparedStatement).
     */
    public void eliminar(int idCancion) {
        // TODO
    }
}
