package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Animal {

    protected static int geradorIdAnimal = 100;
    protected int id;
    protected String nome;
    protected LocalDate dataNascimento;
    protected double peso;
    protected String cor;
    protected String especie;

    public static List<Animal> listaDeAnimais = new ArrayList<>();

    public Animal(String nome, LocalDate dataNascimento, double peso, String cor, String especie) {
        this.id = geradorIdAnimal++;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.peso = peso;
        this.cor = cor;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public void emitirSom(){
        System.out.println("Fazendo barulho");
    }

    public void cadastrarAnimal(String nome, int idade, double peso, String cor, String especie) {
        Animal novoAnimal = new Animal(nome, idade, peso, cor, especie);
        listaDeAnimais.add(novoAnimal);
    }
    
    public void cacadastrarAnimal(){
        listaDeAnimais.add(this);
    }

    public void editarAnimal() {
        System.out.println("Animal editado");
    }

    public static String listarAnimais() {
        if (!listaDeAnimais.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Animal a : Animal.listaDeAnimais) {
                sb.append(a).append("\n");
            }
            return sb.toString();
        }
        return null;
    }
    
    public static String listarAnimaisPorEspecie(String especie) {
        if (!listaDeAnimais.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Animal a : Animal.listaDeAnimais) {
                if(a.especie.equals(especie)){
                    sb.append(a).append("\n");
                }                
            }
            return sb.toString();
        }
        return null;
    }
    
    public static Animal buscarPorNome(String nome){
        if(!listaDeAnimais.isEmpty()){
            for(Animal a: listaDeAnimais){
                if(a.getNome().equalsIgnoreCase(nome)){
                    return a;
                }
            }
        }
        return null;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
   
    @Override
    public String toString() {
        return "id: " + id + ", Nome: " + nome + ", Idade: " + idade + ", peso=" + peso + "kg, cor: " + cor + ", especie: " + especie;
    }
    
    
}
