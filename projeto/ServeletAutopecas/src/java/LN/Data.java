package LN;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String transform(Data data){
        String saida=String.valueOf(ano)+"-";
        if (data.getMes()<10){
            saida= saida+"0"+String.valueOf(data.getMes())+"-";
        }
        else{
            saida= saida+String.valueOf(data.getMes())+"-";
        }
        if (data.getDia()<10){
            saida= saida+"0"+String.valueOf(data.getDia());
        }
        else{
            saida= saida+String.valueOf(data.getDia());
        }
        return saida;
    }
}
