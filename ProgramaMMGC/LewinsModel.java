public class LewinsModel {
    private String stages;
    private int inaugurationAge;
    private String authorName;

    public LewinsModel (String stages, int inaugurationAge, String authorname){
        this.stages = stages;
        this.inaugurationAge = inaugurationAge;
        this.authorName = authorname;
    }

    @Override
    public String toString(){
        String result = "Presenta 3 fases: " + this.stages + " se inauguro el año " + this.inaugurationAge + " y su autor fue " + this.authorName;
        return result;
    }
}
