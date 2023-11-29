package com.mycompany.musicdb.persistencia;

import com.mycompany.musicdb.logica.Song;
import com.mycompany.musicdb.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres and Walter
 */
public class ControladorPersistencia {

    SongJpaController songJpa = new SongJpaController();

    public void guardar(Song song) {

        songJpa.create(song);

    }

    public List<Song> traerSong() {

        return songJpa.findSongEntities();
    }

    public void borrarSong(int idSong) {
        try {
            songJpa.destroy(idSong);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Song traerSong(int idSong) {
        return songJpa.findSong(idSong);
    }

    public void modificarSong(Song song) {
        try {
            songJpa.edit(song);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

public List<Song> traerSongsPorAnio(int anio) {
    return songJpa.findSongsByYear(anio);
}

public List<Song> traerSongsPorGenero(String genero) {
    return songJpa.findSongsByGenre(genero);
}
}
