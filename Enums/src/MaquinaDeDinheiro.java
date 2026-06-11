public class MaquinaDeDinheiro {

    public static float obterValor(int quantidade, Dinheiro dinheiro) {
        return quantidade * dinheiro.valorMonetario;
    }

    public static String printarMoedaComQuantidade(int quantidade, Dinheiro dinheiro) {
        StringBuilder sb =  new StringBuilder();
        sb.append(quantidade)
          .append(" moeda");
        if (quantidade != 1) {
            sb.append("s");
        }
        sb.append(" de ").append(dinheiro);
        return sb.toString();
    }

}
