public class ex10 {
    public static void main(String[] args) {
        final int tam=5;
    char[] gabarito={'a','a','d','b','c'};
    char[] respostas=new char[tam];
    int nota=0;

    respostas[0]='a';
    respostas[1]='a';
    respostas[2]='c';
    respostas[3]='b';
    respostas[4]='c';

    for(int i=0;i<tam;i++){
        if(respostas[1]==gabarito[i]){
            nota++;
        }
    }
    System.out.printf("Nota do aluno:%d",nota);
    } 
}
