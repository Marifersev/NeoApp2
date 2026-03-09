package com.example.neoAPP.modelos;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Gasto {

    //id, descripcion, fecha, valor, imagen(icono)


    //@Column

    //Creando una relacion con el modelo usuario

    //yo como gasto me relaciono con 1 usuario
    @ManyToOne
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id")
    private Usuario usuario;


}
