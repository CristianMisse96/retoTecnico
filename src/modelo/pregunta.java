
package modelo;

/**
 *
 * @author cristian
 */
public class pregunta { 
    //atributos clase pregunta
    private String pregunta,opcionA,opcionB,opcionC,opcionD,opcionTrue;
    private int categoria;
    //contructor por default
    public pregunta(){
    }
    //constructor con argumentos 
    public pregunta(String pregunta, String opcionA, String opcionB, String opcionC, String opcionD, String opcionTrue, int categoria) {
        this.pregunta = pregunta;
        this.opcionA = opcionA;
        this.opcionB = opcionB;
        this.opcionC = opcionC;
        this.opcionD = opcionD;
        this.opcionTrue = opcionTrue;
        this.categoria = categoria;
    }
    
    //getter and setter 

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getOpcionA() {
        return opcionA;
    }

    public void setOpcionA(String opcionA) {
        this.opcionA = opcionA;
    }

    public String getOpcionB() {
        return opcionB;
    }

    public void setOpcionB(String opcionB) {
        this.opcionB = opcionB;
    }

    public String getOpcionC() {
        return opcionC;
    }

    public void setOpcionC(String opcionC) {
        this.opcionC = opcionC;
    }

    public String getOpcionD() {
        return opcionD;
    }

    public void setOpcionD(String opcionD) {
        this.opcionD = opcionD;
    }

    public String getOpcionTrue() {
        return opcionTrue;
    }

    public void setOpcionTrue(String opcionTrue) {
        this.opcionTrue = opcionTrue;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
    
    //toString

    @Override
    public String toString() {
        return "pregunta{" + "pregunta=" + pregunta + ", opcionA=" + opcionA + ", opcionB=" + opcionB + ", opcionC=" + opcionC + ", opcionD=" + opcionD + ", opcionTrue=" + opcionTrue + ", categoria=" + categoria + '}';
    }
    
    
}
