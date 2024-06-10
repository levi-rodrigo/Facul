import java.util.Scanner;


public class avaliacao {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        final int numPerguntas=5;
        int pontoQuestao=2;
        char[] gabarito={'a','a','a','c','a'};
        String[] perguntas={
          "Qual maior estrela do Sistema Solar?",
          "Qual e a primeira letra do alfabeto",
          "Quanto e 3x10",
          "Valor de PI",
          "Musica do Djavan",
        };
        String[] alternativas={
          "A) Sol | B) Lua | C) Marte",
          "A)A | B)C | C)B",
          "A)30 | B)31 | C)10",
          "A)4.31 | B)3,13 | C)3,14",
          "A)Eu te devoro | B)Olhinhos de fogueira | C)Diga Sim"
        };
        char[] respostas=new char[numPerguntas];
        char resp;
        int nota=0;
        String aluno;

        System.out.print("Digite seu nome:");
        aluno=scan.nextLine();
        for(int i=0;i<numPerguntas;i++){
            System.out.println("------------------");
            System.out.printf("Pergunta %d%n", i+1);
            System.out.printf("%s%n",perguntas[i]);
            System.out.printf("%s%n",alternativas[i]);
            resp=scan.nextLine().charAt(0);
            respostas[i]=resp;
        }
        System.out.printf("%s%n","Fim da prova, confira o resultado");
        for(int i=0;i<numPerguntas;i++){
            if(gabarito[i]==respostas[i]){
                nota+=pontoQuestao;
            }
        }
        System.out.printf("%s sua nota foi %d, você foi %s", aluno,nota,nota>=6?"Aprovado" : "Reprovado");
   }
}
