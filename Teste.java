public class Teste {
    public static void main(String[] args) {
        Empregado emp = new Empregado();
        emp.setNome("José");
        emp.setEndereco("Rua Augusto 32");
        emp.setTelefone("123456");
        emp.setCodigoSetor(123);
        emp.setSalarioBase(1550.15);
        emp.setImpostos(40.15);
        System.out.println(emp.getNome());
        System.out.println(emp.getEndereco());
        System.out.println(emp.getTelefone());
        System.out.println(emp.getCodigoSetor());
        emp.calcularSalario();
        


    }
}
