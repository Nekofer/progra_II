
package examenp2;

/**
 *
 * @author josue
 */
public final class Entrenador  extends Persona implements Interfaz  {
    private final String nacionalidad;
    private final int titulosInt;
    
    public Entrenador(String nacionalidad, int titulosInt, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.nacionalidad = nacionalidad;
        this.titulosInt = titulosInt;
    }

 
    
    public void DarConvocatoria(){
        
    }
    
    @Override
    public void Concentrarse(){
        
    }
    
    @Override
    public void Viajar(){
        
    }
    
    public final void DirigirEntrenamiento(){
        
    }
    
    public final void DirigirPartido(){
        
    }
    
    @Override
    public void DarEntrevista(){
        
    }
}
