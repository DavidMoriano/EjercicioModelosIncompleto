# # Modelos de Gestión del Cambio - Proyecto Java

Este proyecto Java presenta una colección de modelos teóricos y prácticos utilizados en la gestión del cambio, tanto organizacional como personal. Cada modelo está representado mediante instancias de clases personalizadas que encapsulan sus características principales y fases.

## 📚 Modelos incluidos

A continuación, se listan los modelos de cambio implementados en el proyecto:

1. **Modelo de Lewin** (1947) - Kurt Lewin  
   _Fases_: Descongelar, Cambiar, Volver a congelar

2. **Modelo 7-S de McKinsey** (1980) - McKinsey & Company  
   _Elementos_: Estrategia, Estructura, Sistemas, Valores compartidos, Estilo, Personal, Habilidades

3. **Teoría de cambio de Kotter** (1996) - John P. Kotter  
   _Fases_: Crear urgencia, Formar coaliciones, Crear visión, Comunicar visión, Empoderar acción, Crear victorias, Consolidar, Institucionalizar

4. **Modelo ADKAR** (2003) - Jeff Hiatt  
   _Fases_: Conciencia, Deseo, Conocimiento, Habilidad, Refuerzo

5. **Teoría del empujón (Nudge Theory)** (2008) - Richard Thaler, Cass Sunstein  
   _Pasos_: Definir opciones, Modificar el entorno, Influenciar decisiones

6. **Transición de Bridges** (1991) - William Bridges  
   _Fases_: Terminar, Zona neutral, Nuevo comienzo

7. **Modelo de Kübler-Ross** (1969) - Elisabeth Kübler-Ross  
   _Etapas_: Negación, Ira, Negociación, Depresión, Aceptación

8. **Metodología Satir de gestión** (1991) - Virginia Satir  
   _Fases_: Status quo, Resistencia, Caos, Nueva integración, Práctica

## 🛠️ Estructura del Proyecto

- `Main.java`: Contiene el punto de entrada de la aplicación. Instancia y muestra cada modelo con sus características y fases.
- `Plan.java`: Clase que representa las fases, pasos o elementos del modelo.
- `ClassMethod.java`: Clase que encapsula los atributos de cada modelo de cambio (nombre, tipo, año, autor, etc.).

## 🚀 Cómo ejecutar

1. Asegúrate de tener **Java JDK** instalado (Java 8 o superior).
2. Compila el proyecto:
   ```bash
   javac Main.java Plan.java ClassMethod.java
