package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n02.S04T02N02MartinezMCarmen.Model;

import javax.persistence.*;

@Entity//Notación para indicar que es una entidad
@Table(name="fruites") //Nombre de la base de datos que corresponde a esta entidad

public class Fruita {

    //Atributs
    @Id //Llave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) //se le indica que el campo ID es autonúmerico
    private int id; //Será la llave primaria en la base de datos
    @Column(name="nom")
    private String nom;
    @Column(name="quantitatQuilos")
    private int quantitatQuilos;

    //Constructors

    public Fruita() {

    }

    public Fruita(String nom, int quantitatQuilos) {
        this.nom = nom;
        this.quantitatQuilos = quantitatQuilos;
    }

    //GETTERS i SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantitatQuilos() {
        return quantitatQuilos;
    }

    public void setQuantitatQuilos(int quantitatQuilos) {
        this.quantitatQuilos = quantitatQuilos;
    }

    //ToString
    @Override
    public String toString() {
        return "Fruita{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", quantitatQuilos=" + quantitatQuilos +
                '}';
    }
}
