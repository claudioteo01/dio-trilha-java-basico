public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS","CLAUDIO","MARCIO","TEODORO" };
    
       // for (int x=0; x<alunos.length; x++) 
       
       for(String aluno : alunos){
            System.out.println("O aluno no indice é " + aluno);
        }
    
    }
}
