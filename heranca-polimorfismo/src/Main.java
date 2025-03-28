import domain.Employee;
import domain.Manager;
import domain.Salesman;

public class Main {
    public static void main(String[] args) {
        //Employee agora é abstrata e portanto não pode ser instanciada
            //Employee employee = new Employee();
        Employee employee = new Employee();
        Salesman salesman = new Salesman();
        Manager manager = new Manager();
        System.out.println(salesman instanceof Employee); //true
        System.out.println(manager instanceof Employee); //true
        System.out.println(employee instanceof Employee); //true
        System.out.println(employee instanceof Manager); //false
        System.out.println(employee instanceof Salesman); //false
        printEmployee(new Manager());
        printEmployee(new Salesman());
    }

    public static void printEmployee(Employee employee) {
        switch (employee) {
            case Manager manager:
                manager.setCode("123");
                manager.setSalary(5000.00);
                manager.setName("João");
                manager.setLogin("joao");
                manager.setPassword("123456");
                manager.setCommission(1500.00);

                System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());
                System.out.println(manager.getCode());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println("R$ " + manager.getSalary());
                System.out.println("R$ " + manager.getCommission());
                break;
            case Salesman salesman:
                salesman.setCode("321");
                salesman.setName("João");
                salesman.setSalary(2000.00);
                salesman.setPercentPerSold(10.00);
                salesman.setSoldAmount(1000.00);

                System.out.printf("=======%s=======\n", employee.getClass().getCanonicalName());
                System.out.println(salesman.getCode());
                System.out.println(salesman.getName());
                System.out.println("R$ " + salesman.getSalary());
                System.out.println(salesman.getPercentPerSold() + "%");
                System.out.println("R$ " + salesman.getSoldAmount());
                break;
            default:
                System.out.println("[3RR0R] Algo deu errado, tente novamente");
                break;
        }
        //System.out.println("R$ " + employee.getFullSalary());
        
    }
}
