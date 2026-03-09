package com.example.neoAPP.modelos;

import java.util.List;

import com.example.neoAPP.modelos.utils.TipoDocumento;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombres_completos", nullable = false, unique = false, length = 50)
    private String nombres;
    
    @Column(name = "tipo_documento", nullable = false, unique = false)
    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;
    
    @Column(name = "documento", nullable = false, unique = true, length = 15)
    private String documento;
    
    @Column(name = "edad", nullable = false, unique = false, length = 50)
    private Integer edad;

    //Creando una relacion con el modelo de gasto

    //Yo como usuario me relaciono con muchos gastos
    @OneToMany(mappedBy = "usuario")
    private List<Gasto> gastos;

     public Usuario() {
    }

    

    public Usuario(Integer id, String nombres, TipoDocumento tipoDocumento, String documento, Integer edad) {
        this.id = id;
        this.nombres = nombres;
        this.tipoDocumento = tipoDocumento;
        this.documento = documento;
        this.edad = edad;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }


}
