
package pokesimulator1;

public class PokeSimulator1 {
    public static void main(String[] args) {
        
        //Instanciando um objeto
        Pokemon meuPokemon = new Pokemon("Charmander", "Fogo", 100);
        Pokemon outroPokemon = new Pokemon("Staryu", "Agua", 50);
        
        int meuAtaque = meuPokemon.getAtaque();
        int outraDefesa = outroPokemon.getDefesa();               
                
        meuPokemon.imprimiPokemons();               
        outroPokemon.imprimiPokemons();
        
        if(meuAtaque > outraDefesa){
            System.out.println("Ganhei");
        } else{
            System.out.println("Perdi");
        }        
    }    
}
