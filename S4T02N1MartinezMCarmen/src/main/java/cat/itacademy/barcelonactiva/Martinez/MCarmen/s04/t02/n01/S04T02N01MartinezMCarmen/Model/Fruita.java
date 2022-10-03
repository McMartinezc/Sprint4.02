package cat.itacademy.barcelonactiva.Martinez.MCarmen.s04.t02.n01.S04T02N01MartinezMCarmen.Model;

//Clase entitat
import javax.persistence.*;

@Entity //Notación para indicar que es una entidad
@Table(name="fruites") //Nombre de la base de datos que corresponde a esta entidad

public class Fruita {

    //Atributs
    @Id //Llave primaria de la tabla
    @GeneratedValue(strategy= GenerationType.IDENTITY) //se le indica que el campo ID es autonúmerico
    private Integer id; //Será la llave primaria en la base de datos
    private String nom;
    private int quantitatQuilos;

    //Constructors
    public Fruita() {
    }
    public Fruita(Integer id, String nom, int quantitatQuilos) {
        this.id = id;
        this.nom =nom;
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
