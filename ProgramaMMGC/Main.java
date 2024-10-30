public class Main {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("========================================================================================================================================");

    // Modelo de Lewin
    Plan plan1 = new Plan("Descongelar, Cambiar, Volver a congelar");
    ClassMethod method1 = new ClassMethod(
        "Modelo de Lewin",                    
        "Teorico",                            
        "Implementacion",                     
        1947,                                 
        "Kurt Lewin",                         
        "Guiar el cambio a traves de tres etapas",
        "Es un modelo clasico que sugiere que el cambio ocurre en tres fases: " +
        "Descongelar, Cambiar, y Volver a congelar.", 
        plan1                                 
    );
    System.out.println(method1.toString());
    System.out.println("\n");
    System.out.println("========================================================================================================================================");

    // Modelo 7-S de McKensey
    Plan plan2 = new Plan("Estrategia, Estructura, Sistemas, Valores compartidos, Estilo, Personal, Habilidades");
    ClassMethod method2 = new ClassMethod(
        "Modelo 7-S de McKensey",             
        "Diagnostico",                        
        "Analisis organizacional",            
        1980,                                 
        "McKinsey & Company",                 
        "Evaluar siete elementos clave de una organizacion para asegurarse de que esten alineados.", 
        "El modelo 7-S de McKinsey se centra en la alineacion de siete factores clave dentro de una organizacion: " +
        "Estrategia, Estructura, Sistemas, Valores compartidos, Estilo, Personal y Habilidades.", 
        plan2                                 
    );
    System.out.println(method2.toString());
    System.out.println("\n");
    System.out.println("========================================================================================================================================");

    // Teoria de cambio de Kotter
    Plan plan3 = new Plan("Crear urgencia, Formar coaliciones, Crear vision, Comunicar vision, Empoderar accion, Crear victorias, Consolidar, Institucionalizar");
    ClassMethod method3 = new ClassMethod(
        "Teoria de cambio de Kotter",        
        "Procesual",                          
        "Transformacion organizacional",      
        1996,                                
        "John P. Kotter",                     
        "Liderar un cambio a traves de un proceso de ocho pasos", 
        "El modelo de Kotter es una guia de ocho pasos para liderar el cambio, que incluye crear urgencia, formar coaliciones, " +
        "crear y comunicar una vision, empoderar al equipo, generar victorias a corto plazo, consolidar el cambio y anclarlo en la cultura organizacional.",
        plan3                                 
    );
    System.out.println(method3.toString());
    System.out.println("\n");
    System.out.println("========================================================================================================================================");

    // Modelo ADKAR
    Plan plan4 = new Plan("Conciencia, Deseo, Conocimiento, Habilidad, Refuerzo");
    ClassMethod method4 = new ClassMethod(
        "Modelo ADKAR",                      
        "Procesual",                          
        "Cambio personal y organizacional",   
        2003,                                 
        "Jeff Hiatt",                        
        "Guiar el cambio individual a traves de cinco fases", 
        "El modelo ADKAR se centra en cinco fases que un individuo debe superar para aceptar y realizar con exito el cambio: " +
        "Conciencia, Deseo, Conocimiento, Habilidad y Refuerzo.", 
        plan4                                 
    );
    System.out.println(method4.toString());
    System.out.println("\n");
    System.out.println("========================================================================================================================================");

    // Teoria del empujon (Nudge Theory)
    Plan plan5 = new Plan("Definir opciones, Modificar el entorno, Influenciar decisiones");
    ClassMethod method5 = new ClassMethod(
        "Teoria del empujon",                 
        "Conductual",                        
        "Cambio de comportamiento",           
        2008,                                 
        "Richard Thaler, Cass Sunstein",      
        "Influir en las decisiones de las personas sin restringir su libertad de eleccion", 
        "La teoria del empujon (Nudge Theory) sugiere que pequeñas intervenciones o cambios en el entorno pueden influir en " +
        "las decisiones de las personas de una manera que beneficie a los individuos y a la sociedad sin coercion.", 
        plan5                                 
    );
    System.out.println(method5.toString());
    System.out.println("\n");
    System.out.println("========================================================================================================================================");

    // Transicion de puentes
    Plan plan6 = new Plan("Terminar, Zona neutral, Nuevo comienzo");
    ClassMethod method6 = new ClassMethod(
        "Transicion de puentes",              
        "Psicologico",                        
        "Adaptacion emocional",               
        1991,                                 
        "William Bridges",                    
        "Guiar a las personas a traves de los aspectos emocionales del cambio", 
        "El modelo de Transicion de William Bridges describe tres fases de la adaptacion emocional a cambios importantes: " +
        "El final, la zona neutral y el nuevo comienzo.", 
        plan6                                 
    );
    System.out.println(method6.toString());
    System.out.println("\n");
    System.out.println("========================================================================================================================================");

    // Cambio de Kübler-Ross
    Plan plan7 = new Plan("Negacion, Ira, Negociacion, Depresion, Aceptacion");
    ClassMethod method7 = new ClassMethod(
        "Cambio de Kubler-Ross",              
        "Psicologico",                       
        "Reaccion emocional",                
        1969,                                 
        "Elisabeth Kübler-Ross",             
        "Describir las cinco etapas emocionales del duelo y el cambio", 
        "El modelo de Kübler-Ross, conocido como las cinco etapas del duelo, describe las etapas emocionales " +
        "por las que pasan las personas cuando enfrentan un cambio o perdida importante: Negacion, Ira, Negociacion, Depresion y Aceptacion.", 
        plan7                                 
    );
    System.out.println(method7.toString());
    System.out.println("\n");
    System.out.println("========================================================================================================================================");

    // La metodologia Satir de gestion
    Plan plan8 = new Plan("Status quo, Resistencia, Caos, Nueva integracion, Practica");
    ClassMethod method8 = new ClassMethod(
        "La metodologia Satir de gestion",    
        "Psicologico",                        
        "Desarrollo personal y organizacional",
        1991,                                 
        "Virginia Satir",                    
        "Mejorar la adaptacion y el rendimiento emocional de las personas y organizaciones durante el cambio", 
        "La metodologia Satir de gestion del cambio se centra en como las personas pasan por una serie de fases emocionales " +
        "y comportamentales cuando enfrentan el cambio, que incluyen el status quo, la resistencia, el caos, la nueva integracion y la practica.", 
        plan8                                 
    );
    
    System.out.println(method8.toString());
    System.out.println("\n");
    System.out.println("========================================================================================================================================");

    }
}           
