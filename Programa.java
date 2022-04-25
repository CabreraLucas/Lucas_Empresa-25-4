public class Programa {
    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
		v.setDataDeEntrada("10/01/2010");
		v.setDepartamento("Vendas");
		v.setEstaNaEmpresa(true);
		v.setNome("Eduardo");
		v.setRg("45");
        
        Gerente g1 = new Gerente();
        g1.departamento = "Vendas";
        g1.dataDeEntrada = "03/02/1990";
        g1.estaNaEmpresa = true;
        g1.nome = "Eric";
        g1.rg = "48";
        g1.salario = 3500.0;

        g1.setLogin("eric");
        g1.setSenha("123");

        Supervisor supervisor = new Supervisor();
        supervisor.nome = "Julio";
        supervisor.dataDeEntrada = "10/10/2010";
        supervisor.salario = 5000.0;

        ControleDeBonificacao controle = new ControleDeBonificacao();
        controle.calculaTotalDeBonus(v);
        controle.calculaTotalDeBonus(g1);
        controle.calculaTotalDeBonus(supervisor);

        System.out.println("Data de admissão: " +v.getDataDeEntrada());
		System.out.println("Departamento: " +v.getDepartamento());
		System.out.println("Nome: " +v.getNome());
		System.out.println("RG: "+v.getRg());
		System.out.println("Salário: "+v.getSalario());
		System.out.println("Contratado: "+v.isEstaNaEmpresa());
		System.out.println("Bonificação: "+v.bonifica());


        System.out.println("//////////////////////////////");
		g1.autentica("eric", "123");
		System.out.println("Data de admissão: " +g1.getDataDeEntrada());
		System.out.println("Departamento: " +g1.getDepartamento());
		System.out.println("Nome: " +g1.getNome());
		System.out.println("RG: " +g1.getRg());
		System.out.println("Salário: " +g1.getSalario());		
		System.out.println("Bonificação: " +g1.bonifica());
		System.out.println("Total de bonus: R$" + controle.getTotalDeBonus());
    
        System.out.println("//////////////////////////////");
        System.out.println("Nome:" +supervisor.getNome());
        System.out.println("Data de admissão: " +supervisor.getDataDeEntrada());
        System.out.println("Salário: " +supervisor.getSalario());

    }

}
