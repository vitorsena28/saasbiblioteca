package application.models;

import javax.persistence.Table;
import javax.persistence.Id;


@Entity
@Table(name = "generos")
public class Genero{
private int id;
private String nome;

public void setId(int id){
    this.id = id;
}
public int getId(){
    return id;
}
public void setNome(String nome){
    this.nome = nome;
}
public String getNome(){
    return nome;
}

}