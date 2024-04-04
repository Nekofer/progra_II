
package examenp2;

/**
 *
 * @author josue
 */
public final class Futbolista extends Persona implements Interfaz {
    private final String club;
    private final String pos;
    private final int num;

    public Futbolista(String club, String pos, int num, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.club = club;
        this.pos = pos;
        this.num = num;
    }

    
    
    @Override
    public void Concentrarse(){
        System.out.println("C concentra");
    }
    
    @Override
    public void Viajar(){
        System.out.println("Los jugadores emprendieron su viaje bb ..................");
    }
    
    public void Entrenar(){
        System.out.println("Los jugadores empezaron a entrenar ..................");
        
    }
    
    public final void JugarPartido(){
        System.out.println("Los jugadores empezaron a jugar ...................");
        System.out.println("Pierden ..........."); 
    }
    
    @Override
    public void DarEntrevista(){
    
        System.out.println("Que miras bobo que miras........................ ");
        
    }
}
