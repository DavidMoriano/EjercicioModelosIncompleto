public class McKenseyModel {
    private String components;
    private int inaugurationAge;
    private String authorName2;

    public McKenseyModel (String components, int inaugurationAge, String authorName2){
     this.components = components;
     this.inaugurationAge = inaugurationAge;
     this.authorName2 = authorName2;  
    }

    @Override
    public String toString (){
        String result2 = "Esta compuesto por 7 componentes: " + this.components + " se inauguro en el año " + this.inaugurationAge + " y su autor fue " + this.authorName2;
        return result2;
    }
}
