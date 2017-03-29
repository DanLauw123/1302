/**
 * Created by LAUW on 2/28/17.
 */
public class PetSold extends ItemSold {
    //create private boolean here.
    private boolean vaccinated;
    private boolean housebroken;
    private boolean neutered;

    //below are sets of set-method for vaccinated, housebroken, and neutered.
    public void setVaccinated (boolean vaccinated){
        this.vaccinated = vaccinated;
    }
    public void setHouseBroken (boolean housebroken){
        this.housebroken = housebroken;
    }
    public void setNeutered(boolean neutered){
        this.neutered = neutered;
    }

    //below are sets of get-method for the three boolean (vaccinated, housebroken, and neutered).

    public boolean getVaccinated(){
        return this.vaccinated;
    }
    public boolean getHouseBroken(){
        return this.housebroken;
    }
    public boolean getNeutered(){
        return this.neutered;
    }
}
