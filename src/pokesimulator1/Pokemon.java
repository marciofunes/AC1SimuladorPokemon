
package pokesimulator1;

public class Pokemon {
    
    //Atributos Encapsulados
    private String nome; //o nome do pokémon (ex: Charmander)
    private String tipo; //o tipo do pokémon (ex: Fogo)
    private int level;
    private int vida = 200;
    private int ataque;
    private int defesa;
    
    //Construtor
    public Pokemon(String nome, String tipo, int level){
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        
        calculaAtributos();
        calculaBonus();
    }
    
    //Get    
    public int getAtaque(){        
        return this.ataque;        
    }
    
    public int getDefesa(){
        return this.defesa;
    }
    
    //Set
    public void setVida(int novaVida){
        this.vida = novaVida;
    }
    
    //Métodos
    public void imprimiPokemons(){
        System.out.println("Nome: " + nome + " | " +
                           "Tipo: " + tipo + " | " +
                           "Level: " + level + " | " +
                           "Vida: " + vida + " | " +
                           "Ataque: " + ataque + " | " +
                           "Defesa: " + defesa + " | "
        );               
    }

    private void calculaAtributos(){
        switch(tipo){
            case "Fogo":
                ataque = 70;
                defesa = 30;
            break;
            
            case "Agua":
                ataque = 40;
                defesa = 60;
            break;
            
            case "Terra":
                ataque = 50;
                defesa = 100;
            break;
            
            case "Ar":
                ataque = 100;
                defesa = 20;
            break;
        }
    }
    
    public void calculaBonus(){
        vida = vida + (level / 2);
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
    }
}
