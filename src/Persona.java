public class Persona {
//Atributos
    String nombre,identificacion;
    int edad;

    //Metodos


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /*
     * Sobrecarga de constructores
     *
     */
    public Persona(String identificacion) {
        this.identificacion = identificacion;
    }

    /*
     *sobrecarga de metodos con mismo nombre pero diferentes parametros
     */
    public void caminar(){
        System.out.println("soy "+nombre+" tengo "+edad+" años y estoy caminando en el parque");
    }
    public void caminar(int metros){
        System.out.println("Camine por el parque "+metros+" metros y mi identificacion es: "+identificacion);
    }

    public static void main(String[] args) {
        Persona uno=new Persona("manolo",21);
        uno.caminar();
        Persona dos=new Persona("357892");
        dos.caminar(70);

    }




}
