public class Plan {
    private String phasesNames;

    public Plan (String phasesNames) {
        this.phasesNames = phasesNames;
    }

    @Override
    public String toString (){
        String result = "" + this.phasesNames;
        return result;
    }
}
