package org.example;

public class Familia {

    String papa="Cebra";
    String mama="Caballo";
    String hijo="Cebrallo";

    public Familia() {
        this.papa = papa;
        this.mama = mama;
        this.hijo = hijo;
    }


    public void imprimirFamilia(){

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println(
                "El papá es: "+papa+
                        "\nLa mamá es: "+mama+
                            "\nEl hijo es: "+hijo
        );

    }

    public void tenerHijo(String nombre){

        if(papa == null){

            Animal hijo= new Animal();
            hijo.nombre=nombre;
            hijo.peso=1;
            double random = Math.random();
            if(random<0.5){
                hijo.genero="F";
            }else{
                hijo.genero="M";
            }
            hijo=hijo;

        }else{
            System.out.println("Aun no puedes tener hijos");
        }

    }

}
