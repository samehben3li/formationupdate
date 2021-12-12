package tn.isima.formationdelete.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Formation implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String type;
    private String duff;
    private String prix;
    @Column(nullable = false, updatable = false)
    private String formationCode;

    public Formation(){}

    public Formation(String name, String type,String duff, String prix,String formationCode) {
        this.name = name;
        this.type = type;
        this.duff = duff;
        this.prix = prix;
        this.formationCode = formationCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDuff() {
        return duff;
    }

    public void setDuff(String duff) {
        this.duff = duff;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    public String getFormationCode() {
        return formationCode;
    }

    public void setFormationCode(String formationCode) {
        this.formationCode = formationCode;
    }


    @Override
    public String toString() {
        return "Formation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\''+
                ", duff='" + duff + '\'' +
                ", prix='" + prix + '\'' +
                '}';
    }
}