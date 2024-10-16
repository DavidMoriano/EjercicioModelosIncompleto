public class KottersModel {
    private String stepsForChange;
    private int inaugurationAge;
    private String authorName;

    public KottersModel (String stepsForChange, int inaugurationAge, String authorName){
        this.stepsForChange = stepsForChange;
        this.inaugurationAge = inaugurationAge;
        this.authorName = authorName;
    }

    @Override 
    public String toString(){
        String resutl3 = "Los 7 pasos para el cambio son " + this.stepsForChange + " fue inaugurado en el año " + this.inaugurationAge + " por " + this.authorName;
    }
}
