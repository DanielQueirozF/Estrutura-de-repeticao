import java.util.Scanner;

public class Main {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        Algoritmo1();
        Algoritmo2();
        Algoritmo3();
        Algoritmo4();
        Algoritmo5();
        Algoritmo6();
        Algoritmo7();
        Algoritmo8();
        Algoritmo9();
        Algoritmo10();
        Algoritmo11();
        Algoritmo12();

        teclado.close();
    }
    private static void Algoritmo1(){
        int escolha;

        System.out.println("Digite o primeiro valor: ");
        int primeiroNumero = teclado.nextInt();

        System.out.println("Digite o segundo valor: ");
        int segundoNumero = teclado.nextInt();

        do {

            System.out.println("OPERAÇÕES");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir (quociente inteiro)");
            System.out.println("5 - Digitar novos valores");
            System.out.println("0 - Sair/Encerrar");
            System.out.print("Digite sua escolha: ");

            escolha = teclado.nextInt();


            switch (escolha){
                case 0:
                    System.out.println("Encerrando...");
                    break;
                case 1:
                    System.out.println("O resultado da soma é: " + (primeiroNumero + segundoNumero));
                    break;
                case 2:
                    System.out.println("O resultado da subtração é: " + (primeiroNumero - segundoNumero));
                    break;
                case 3:
                    System.out.println("O resultado da multiplicação é: " + (primeiroNumero * segundoNumero));
                    break;
                case 4:
                    if (segundoNumero != 0) {
                        System.out.println("O resultado da divisão é: " + (primeiroNumero / segundoNumero));
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                    }
                    break;
                case 5:
                    System.out.println("Digite o primeiro valor: ");
                    primeiroNumero = teclado.nextInt();

                    System.out.println("Digite o segundo valor: ");
                    segundoNumero = teclado.nextInt();
                    break;
            }
        }
        while (escolha != 0);
    }
    private static void Algoritmo2(){

        int numero = 0;
        int soma = 0;

        while (numero <= 500){
            if (numero % 2 != 0){
                if (numero % 3 == 0){
                    soma += numero;
                }
            }
            numero++;
        }

        System.out.println("A soma dos números ímpares múltiplos de 3 é: " + soma);
    }

    private static void Algoritmo3(){
        int maisRecente = 0;
        int mesesMaisRecente = Integer.MAX_VALUE;

        int maisAntigo = 0;
        int mesesMaisAntigo = 0;


        for (int i = 0; i < 300; i++) {
            System.out.print("Número do empregado: ");
            int numeroEmpregado = teclado.nextInt();

            System.out.print("Meses de trabalho: ");
            int mesesTrabalho = teclado.nextInt();

            if (numeroEmpregado == 0 && mesesTrabalho == 0) {
                break;
            }

            if (mesesTrabalho < mesesMaisRecente) {
                maisRecente = numeroEmpregado;
                mesesMaisRecente = mesesTrabalho;
            }

            if (mesesTrabalho > mesesMaisAntigo) {
                maisAntigo = numeroEmpregado;
                mesesMaisAntigo = mesesTrabalho;
            }
        }

        System.out.println("Empregado mais recente: " + maisRecente);
        System.out.println("Meses de trabalho: " + mesesMaisRecente);

        System.out.println("Empregado mais antigo: " + maisAntigo);
        System.out.println("Meses de trabalho: " + mesesMaisAntigo);
    }

    private static void Algoritmo4(){

        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = 0;

        char sexoMaiorAltura = ' ';
        double mediaAlturaMulheres = 0;
        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;

        for (int i = 1; i <= 15; i++){
            System.out.print("Informe a altura: ");
            double altura = teclado.nextDouble();

            System.out.print("Informe o sexo (M = Masculino, F = Feminino: ");
            char sexo = teclado.next().charAt(0);

            if (altura < menorAltura){
                menorAltura = altura;
            }

            if (altura > maiorAltura){
                maiorAltura = altura;
                sexoMaiorAltura = sexo;
            }

            if (sexo == 'M') {
                quantidadeHomens++;
            } else if (sexo == 'F') {
                quantidadeMulheres++;
                mediaAlturaMulheres += altura;
            }

        }
        if (quantidadeMulheres > 0) {
            mediaAlturaMulheres /= quantidadeMulheres;
        }

        System.out.println("Menor altura: " + menorAltura);
        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("Quantidade de homens: " + quantidadeHomens);
        System.out.println("Sexo da pessoa mais alta: " + sexoMaiorAltura);
    }

    private static void Algoritmo5(){
        double salario = 0;
        double maiorSalario = 0;
        double mediaSalario = 0;
        double mediaFilhos = 0;

        int contagem = 0;
        int contagemSalario = 0;

        double percentualSalario = 0;

        do {
            System.out.print("Informe o salario da primeira familia: ");
            salario = teclado.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Informe quantidade de filhos nessa familia: ");
            int filhos = teclado.nextInt();

            if (salario > maiorSalario){
                maiorSalario = salario;
            }

            if (salario <= 250){
                contagemSalario++;
            }

            mediaSalario += salario;
            mediaFilhos += filhos;
            contagem++;

        } while (salario >= 0);

        mediaSalario = mediaSalario / contagem;
        mediaFilhos = mediaFilhos / contagem;
        percentualSalario = (contagemSalario * 100.0) / contagem;

        System.out.print("A media de salário da população é: R$" + mediaSalario);
        System.out.print("A media de filhos da população é: " + mediaFilhos);
        System.out.print("O maior salário entre a população é: R$" + maiorSalario);
        System.out.print("O percentual de pessoas com salário até R$250 é: " + percentualSalario + "%");

    }

    private static void Algoritmo6(){
        int numero = 0;
        int contagem = 0;
        double mediaNumeros = 0;
        int numerosPositivos = 0;
        int numerosNegativos = 0;

        double percentualPositivos = 0;
        double percentualNegativos = 0;
        do {
            System.out.print("Informe um número: ");
            numero = teclado.nextInt();

            if (numero > 0) {
                numerosPositivos++;
            } else if (numero < 0) {
                numerosNegativos++;
            }

            if (numero != 0) {
                mediaNumeros += numero;
                contagem++;
            }

        } while (numero != 0);

        mediaNumeros = mediaNumeros / contagem;

        percentualPositivos = (numerosPositivos * 100.0) / contagem;
        percentualNegativos = (numerosNegativos * 100.0) / contagem;

        System.out.print("A media dos valores lidos é: " + mediaNumeros);
        System.out.print("A quantidade de valores positivos é: " + numerosPositivos);
        System.out.print("A quantidade de valores negativos é: " + numerosNegativos);
        System.out.print("O percentual de valores positivos é: " + percentualPositivos + "%");
        System.out.print("O percentual de valores negativos é: " + percentualNegativos + "%");
    }

    private static void Algoritmo7(){
        double mediaNumeros = 0;
        int contagem = 0;

        for (int i = 0; i < 75; i++) {
            System.out.print("Informe um número: ");
            int numero = teclado.nextInt();

            mediaNumeros += numero;
            contagem++;
        }

        mediaNumeros = mediaNumeros / contagem;

        System.out.print("A media dos valores lidos é: " + mediaNumeros);
        System.out.print("A quantidade de valores lidos é: " + contagem);
    }

    private static void Algoritmo8(){
        double menorAltura = Double.MAX_VALUE;
        double maiorAltura = 0;

        String nomeMenorAltura = "";
        String nomeMaiorAltura = "";

        double mediaAlturaMulheres = 0;
        double mediaAlturaHomens = 0;
        int quantidadeHomens = 0;
        int quantidadeMulheres = 0;

        double mediaAlturaTurma = 0;

        for (int i = 1; i <= 15; i++){
            System.out.print("Informe o nome: ");
            String nome = teclado.next();

            System.out.print("Informe a altura: ");
            double altura = teclado.nextDouble();

            System.out.print("Informe o sexo (código = 1 se for masculino e 2 se for feminino): ");
            int sexo = teclado.nextInt();

            if (altura < menorAltura){
                menorAltura = altura;
                nomeMenorAltura = nome;
            }

            if (altura > maiorAltura){
                maiorAltura = altura;
                nomeMaiorAltura = nome;
            }
            mediaAlturaTurma += altura;

            if (sexo == 1){
                quantidadeHomens++;
                mediaAlturaHomens += altura;
            } else if (sexo == 2){
                quantidadeMulheres++;
                mediaAlturaMulheres += altura;
            }

        }

        if (quantidadeMulheres > 0) {
            mediaAlturaMulheres = mediaAlturaMulheres / quantidadeMulheres;
        }

        if (quantidadeHomens > 0) {
            mediaAlturaHomens = mediaAlturaHomens / quantidadeHomens;
        }

        mediaAlturaTurma = mediaAlturaTurma / 15;

        System.out.println(nomeMenorAltura + " possui a menor altura com: " + menorAltura);
        System.out.println(nomeMaiorAltura + " possui a maior altura com: " + maiorAltura);
        System.out.println("A Média de altura das mulheres: " + mediaAlturaMulheres);
        System.out.println("A Média de altura dos homens: " + mediaAlturaHomens);
        System.out.println("A Média de altura da turma: " + mediaAlturaTurma);
    }

    private static void Algoritmo9(){
        System.out.print("Informe a quantidade de alunos: ");
        int quantidadeAlunos = teclado.nextInt();

        double menorNota = 15;
        double maiorNota = 0;

        for (int i = 0; i < quantidadeAlunos; i++) {

            System.out.print("Informe a nota: ");
            double nota = teclado.nextDouble();

            if (nota < menorNota) {
                menorNota = nota;
            }

            if (nota > maiorNota) {
                maiorNota = nota;
            }
        }

        System.out.println("A Menor nota: " + menorNota);
        System.out.println("A Maior nota: " + maiorNota);
    }

    private static void Algoritmo10(){

        for (int i = 1; i <= 20; i++) {
            double centimetros = i * 2.54;

            System.out.println(i + " polegadas = " + centimetros + " centímetros");
        }
    }

    private static void Algoritmo11(){
        System.out.print("Informe o número limite inferior: ");
        int limiteInferior = teclado.nextInt();

        System.out.print("Informe o número limite superior: ");
        int limiteSuperior = teclado.nextInt();

        int soma = 0;

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }


        System.out.println("A soma dos números pares é: " + soma);
    }

    private static void Algoritmo12(){
        double maiorNota = 0;
        double segundaMaiorNota = 0;

        int matriculaMaiorNota = 0;
        int matriculaSegundaMaiorNota = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Informe o número de matricula do aluno: ");
            int numeroMatricula = teclado.nextInt();

            System.out.print("Informe a nota do aluno: ");
            double nota = teclado.nextDouble();

            if (nota > maiorNota) {

                segundaMaiorNota = maiorNota;
                matriculaSegundaMaiorNota = matriculaMaiorNota;

                maiorNota = nota;
                matriculaMaiorNota = numeroMatricula;

            } else if (nota > segundaMaiorNota) {

                segundaMaiorNota = nota;
                matriculaSegundaMaiorNota = numeroMatricula;
            }
        }

        System.out.println("O aluno da matricula " + matriculaMaiorNota + "Obteve a maior nota da turma sendo ela " + maiorNota);
        System.out.println("O aluno da matricula " + matriculaSegundaMaiorNota + "Obteve a segunda maior nota da turma sendo ela " + segundaMaiorNota);

    }

}