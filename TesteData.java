public class TesteData {
    public static void main(String[] args) {
        Data data1 = new Data(6, 5, 2024);
        Data data2 = new Data(6, 5, 2024);

        System.out.println("Data 1: " + data1.getDia() + "/" + data1.getMes() + "/" + data1.getAno());
        System.out.println("Data 2: " + data2.getDia() + "/" + data2.getMes() + "/" + data2.getAno());

        System.out.println("Comparação: " + data1.compara(data2));

        System.out.println("Mês por extenso: " + data1.getMesExtenso());

        System.out.println("Ano bissexto? " + DataUtil.isBissexto(data1.getAno()));

        Data cloneData = data1.clone();
        System.out.println("Clonagem: " + cloneData.getDia() + "/" + cloneData.getMes() + "/" + cloneData.getAno());
    }
}
