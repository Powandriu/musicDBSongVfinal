package com.mycompany.musicdb.logica;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-11-29T16:42:36", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Song.class)
public class Song_ { 

    public static volatile SingularAttribute<Song, String> artista;
    public static volatile SingularAttribute<Song, String> genero;
    public static volatile SingularAttribute<Song, String> titulo;
    public static volatile SingularAttribute<Song, Integer> duracion;
    public static volatile SingularAttribute<Song, Integer> id;
    public static volatile SingularAttribute<Song, Integer> anio;

}