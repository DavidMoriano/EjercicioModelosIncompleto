public class ClassMethod {
    private String name;
    private String typeMethod;
    private String state;
    private int createdDate;
    private String authorName;
    private String objectives;
    private String description;
    private Plan planPhases;

    public ClassMethod (String name, String typeMethod, String state, int createdDate, String authorName, String objectives, String description, Plan planphases){
        this.name = name;
        this.typeMethod = typeMethod;
        this.state = state;
        this.createdDate = createdDate;
        this.authorName = authorName;
        this.objectives = objectives;
        this.description = description;
        this.planPhases = planphases;
    }

    @Override
    public String toString (){
        String result = "El método se llama " + this.name + " el cual es " 
            + this.typeMethod + " " + this.state + " que fue creado en " 
            + this.createdDate + " por " 
            + this.authorName + ".\nEste presenta los siguientes objetivos: " 
            + this.objectives + " siendo sus características principales: " 
            + this.description + ".\nTiene la siguiente organizacion" + this.planPhases;
        return result;
    }

}
