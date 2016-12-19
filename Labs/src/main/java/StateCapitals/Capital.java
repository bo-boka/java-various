/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StateCapitals;

/**
 *
 * @author apprentice
 */
public class Capital {
    String name;
    int population;
    int sqMile;
    
    public String toString(){
        return this.name +" | Pop: "+ this.population +" | Area: " + this.sqMile+"sq mi";
    }

    public Capital(String name, int population, int sqMile) {
        this.name = name;
        this.population = population;
        this.sqMile = sqMile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSqMile() {
        return sqMile;
    }

    public void setSqMile(int sqMile) {
        this.sqMile = sqMile;
    }
    
    
}
