package Heranca;

public class Principal {
     public static void main (String[]args ){

         Pessoa pessoa = new Pessoa ("João da Silva","(11) 9999-9999");
         System.out.println("Pessoa :");
         System.out.println("Nome :" + pessoa.getNome());
         System.out.println("Telefone : " + pessoa.getTelefone());

         PessoaFísica pessoaFísica = new PessoaFísica ("João da Silva","(11) 9999-9999", "123.232.111-99","200.210-1");
         System.out.println("\nPessoa física :");
         System.out.println("Nome :" + pessoaFísica.getNome());
         System.out.println("Telefone : " + pessoaFísica.getTelefone());
         System.out.println("CPF : " + pessoaFísica.getCpf());
         System.out.println("Rg : " + pessoaFísica.getRg());

         PessoaJurídica pessoaJurídica = new PessoaJurídica ("João da Silva","(11) 9999-9999", "123.232.111-99");
         System.out.println("\nPessoa física :");
         System.out.println("Nome :" + pessoaJurídica.getNome());
         System.out.println("Telefone : " + pessoaJurídica.getTelefone());
         System.out.println("CNPJ : " + pessoaJurídica.getCnpj());


     }
}
