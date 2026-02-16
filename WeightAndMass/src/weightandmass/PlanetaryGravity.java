/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package weightandmass;

/**
 *
 * @author Nereida Rodríguez Orenes 2ºDAM
 */
public enum PlanetaryGravity implements IGravity{
    MERCURIO(3.70f), VENUS(8.87f), TIERRA(9.8f), MARTE(3.71f), JUPITER(24.79f), SATURNO(10.44f), URANO(8.87f), NEPTUNO(11.15f);
    
    private final float gravity;
    private PlanetaryGravity(float gravity){
        this.gravity = gravity;
    }
    
    @Override
     public float calculateWeight(float mass){
         float weight;
         weight = mass * this.gravity;
         return weight;
     }
}
