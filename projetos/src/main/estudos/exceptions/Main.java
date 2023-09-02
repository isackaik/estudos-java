package main.estudos.exceptions;

public class Main {

    public static void main(String[] args) {

        try {

            Item palheta = new Item();
            palheta.setDescricao("Palheta Vandorem v12");
            palheta.setPreco(37.50);

            Item clarinete = new Item();
            clarinete.setDescricao("Clarinete Yamaha Profissional");
            clarinete.setPreco(3000.0);

            Venda venda = new Venda();
            venda.adicionar(palheta);
            venda.adicionar(clarinete);

            System.out.println("Total de venda: " + venda.getTotal());

        } catch (VendaException e) {
            System.out.println("Erro ao processar a venda: " + e.getMessage() +
                            " - Código: " + e.getCodigo());
        } catch (RuntimeException e) {
            System.out.println("Erro ao processar a venda: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Erro ao processar a venda: " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Processamento de venda encerrado.");
        }

    }

}
