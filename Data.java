public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (dataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    private boolean dataValida(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && isBissexto(ano)) {
            diasPorMes[1] = 29;
        }

        return dia >= 1 && dia <= diasPorMes[mes - 1];
    }

    private boolean isBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int compara(Data outraData) {
        if (this.ano == outraData.ano && this.mes == outraData.mes && this.dia == outraData.dia) {
            return 0;
        } else if (this.ano > outraData.ano || (this.ano == outraData.ano && this.mes > outraData.mes)
                || (this.ano == outraData.ano && this.mes == outraData.mes && this.dia > outraData.dia)) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getMesExtenso() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
                "Outubro", "Novembro", "Dezembro"};
        return meses[mes - 1];
    }

    public int getAno() {
        return ano;
    }

    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }
}
