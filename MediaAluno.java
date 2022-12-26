public class MediaAluno {
    public static void main(String args[]) {
        System.out.println("**** Cálculo da Média do Aluno ****");
        System.out.println(" ");
        double nota1 = 7.50;
        double nota2 = 7.50;
        double nota3 = 6.00;
        double nota4 = 9.00;
        double mediaA = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Média do Aluno: " + mediaA);
        double mA = mediaA;
        if (mA >=7) {
            System.out.println("Resultado: Aluno Aprovado.");
        } else if (mA >=5 ) {
            System.out.println("Resultado: Aluno em Recuperação.");
        } else {
            System.out.println("Resultado: Aluno Reprovado.");
        }

    }
}
