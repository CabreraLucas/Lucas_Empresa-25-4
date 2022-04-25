public class Programa {
    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
		v.setDataDeEntrada("10/01/2010");
		v.setDepartamento("Vendas");
		v.setEstaNaEmpresa(true);
		v.setNome("Eduardo");
		v.setRg("45");
        v.setSalario(1400.0);
        
        Gerente g1 = new Gerente();
        g1.setDepartamento("Gerencia");
        g1.setDataDeEntrada("03/02/1990");
        g1.setEstaNaEmpresa(true);
        g1.setNome("Eric");
        g1.setRg("48");
        g1.setSalario(4000.0);

        g1.setLogin("eric");
        g1.setSenha("123");

        Supervisor supervisor = new Supervisor();
        supervisor.setNome("Julio");
        supervisor.setDataDeEntrada("10/10/2010");
        supervisor.setSalario(3000.0);
        supervisor.setRg("50");
        supervisor.setDepartamento("Gerência");
        supervisor.setEstaNaEmpresa(true);


        ControleDeBonificacao controle = new ControleDeBonificacao();
        controle.calculaTotalDeBonus(v);
        controle.calculaTotalDeBonus(g1);
        controle.calculaTotalDeBonus(supervisor);

        System.out.println("Nome: " +v.getNome());
        System.out.println("Data de admissão: " +v.getDataDeEntrada());
		System.out.println("Departamento: " +v.getDepartamento());
		System.out.println("RG: "+v.getRg());
		System.out.println("Salário: "+v.getSalario());
		//System.out.println("Contratado: "+v.isEstaNaEmpresa());
		System.out.println("Bonificação: "+v.bonifica());


        System.out.println("//////////////////////////////");
		g1.autentica("eric", "123");
		System.out.println("Nome: " +g1.getNome());
        System.out.println("Data de admissão: " +g1.getDataDeEntrada());
		System.out.println("Departamento: " +g1.getDepartamento());
		System.out.println("RG: " +g1.getRg());
		System.out.println("Salário: " +g1.getSalario());		
		System.out.println("Bonificação: " +g1.bonifica());
		//System.out.println("Total de bonus: R$" + controle.getTotalDeBonus());
    
        System.out.println("//////////////////////////////");
        System.out.println("Nome:" +supervisor.getNome());
        System.out.println("Data de admissão: " +supervisor.getDataDeEntrada());
        System.out.println("Departamento: "+supervisor.getDepartamento());
        System.out.println(("RG: " +supervisor.getRg()));
        System.out.println("Salário: " +supervisor.getSalario());
        System.out.println("Bonificação: "+supervisor.bonifica());
    }
    
}
