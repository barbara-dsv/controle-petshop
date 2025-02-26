public class Pet {
    //Essa classe representa um pet
    private final String name;

    private boolean clean;

    //construtor
    public Pet(final String name){
        this.name = name;
        this.clean= false;
    }

    public String getName() {
        return name;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }
}
