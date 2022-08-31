package sistemaPaulo;

public class caddiciplina {
    
    private String diciplina;

    caddiciplina(String diciplina){
        this.diciplina = diciplina;
    }
    public String toString(){
        String out = " nome da disciplina: "+ getDiciplina();
        return out;
        
    }
    public String getDiciplina() {
        return diciplina;
    }
    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }
    
}
