package entities;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    protected static int geradorIdAnimal = 100;
    protected int id;
    protected String nome;
    protected int idade;
    protected double peso;
    protected String cor;
    protected String especie;
    protected boolean disponivel;

    public static List<Animal> listaDeAnimais = new ArrayList<>();

    public Animal(String nome, int idade, double peso, String cor, String especie) {
        this.id = geradorIdAnimal++;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
        this.especie = especie;
        this.disponivel = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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
                if(a.especie.equals(especie) && a.isDisponivel()==true){
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
                if(a.getNome().equalsIgnoreCase(nome) && a.isDisponivel()==true){
                    return a;
                }
            }
        }
        return null;
    }
    
    public void concluirAdocao() {
        System.out.println("Adoção concluída!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
   
    @Override
    public String toString() {
        return "id: " + id + ", Nome: " + nome + ", Idade: " + idade + ", peso=" + peso + "kg, cor: " + cor + ", especie: " + especie;
    }
    
    
}
