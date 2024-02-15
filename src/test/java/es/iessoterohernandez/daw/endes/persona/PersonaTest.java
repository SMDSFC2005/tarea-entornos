package es.iessoterohernandez.daw.endes.persona;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PersonaTest 
{
	
	private Persona persona;
	@BeforeEach
    public void setUp() {
        persona = new Persona("Sergio", 18, 'H', 65, 1.73);
    }

	@Test
    public void testCalcularIMC() {
        assertEquals(Persona.PESO_IDEAL, persona.calcularIMC());

        persona.setPeso(55);
        assertEquals(Persona.INFRAPESO, persona.calcularIMC());

        persona.setPeso(90);
        assertEquals(Persona.SOBREPESO, persona.calcularIMC());
        
    }



    @Test
    //He puesto el getDNI porque como tienen que ser iguales la única forma que veo al ser aleatorios es crear un get
    public void testToString() {
        String expected = "Informacion de la persona:\n"+ "Nombre: Sergio\n"+ "Sexo: hombre\n"+ "Edad: 18 años\n"+ "DNI: "+persona.getDNI()+"\n"+ "Peso: 65.0 kg\n"+ "Altura: 1.73 metros\n";
        assertEquals(expected, persona.toString());
    }
    
    
    
    @Test
    public void testMayorDeEdad() {
    	
    	assertTrue(persona.esMayorDeEdad());
    	
    	persona.setEdad(15);
    	assertFalse(persona.esMayorDeEdad());
    	
    	
    }
    

}
