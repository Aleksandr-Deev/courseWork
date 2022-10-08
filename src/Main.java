public class Main {
    public static void main(String[] args) {
        Employee[] listEmployees = new Employee[10];
        Employee ivanov_Ivan_Ivanovich = new Employee("Иванов", "Иван", "Иванович", 1, 40500);
        Employee petrov_Peter_Petrovich = new Employee("Петров", "Петр", "Петроич", 1, 42500);
        Employee sidorov_Maxim_Nikolaevich = new Employee("Сидоров", "Максим", "Николаевич", 2, 48670);
        Employee vasiliev_Andrey_Andreevich = new Employee("Васильев", "Андрей", "Андреевич", 2, 41930);
        Employee ivanko_Galina_Yurievna = new Employee("Иванько", "Галина", "Юрьевна", 3, 46290);
        Employee gnomes_Gnome_Gnomych = new Employee("Гномов", "Гном", "Гномыч", 3, 39090);
        Employee berlusconi_Boris_Borisovich = new Employee("Берлускони", "Борис", "Борисович", 4, 47150);
        Employee ziganshin_Zan_Zidane = new Employee("Зиганшин", "Зан", "Зидан", 4, 42650);
        Employee khairullin_Zufar_Zufarovich = new Employee("Хайруллин", "Зуфар", "Зуфарович", 5, 50650);
        Employee sadko_Blade_Natanovich = new Employee("Садко", "Блейд", "Назипович", 5, 47950);

        listEmployees[0] = ivanov_Ivan_Ivanovich;
        listEmployees[1] = petrov_Peter_Petrovich;
        listEmployees[2] = sidorov_Maxim_Nikolaevich;
        listEmployees[3] = vasiliev_Andrey_Andreevich;
        listEmployees[4] = ivanko_Galina_Yurievna;
        listEmployees[5] = gnomes_Gnome_Gnomych;
        listEmployees[6] = berlusconi_Boris_Borisovich;
        listEmployees[7] = ziganshin_Zan_Zidane;
        listEmployees[8] = khairullin_Zufar_Zufarovich;
        listEmployees[9] = sadko_Blade_Natanovich;

        dataEmployees(listEmployees);
        System.out.println();
        System.out.println("Сумма затрат на зарплаты в месяц " + sumSalary(listEmployees));
        System.out.println();
        System.out.println("Минимальная зарплата = " + minSalaryName(listEmployees));
        System.out.println();
        System.out.println("Максимальная зарплата = " + maxSalaryName(listEmployees));
        System.out.println();
        System.out.println("Среднее значение зарплат = " + averageValueSalary(listEmployees));
        System.out.println();
        fullNameEmployees(listEmployees);
    }

    public static void dataEmployees(Employee[] listEmployees) {
        for (Employee listEmployee : listEmployees) {
            System.out.println(listEmployee);
        }
    }

    public static int sumSalary(Employee[] listEmployees) {
        int sum = 0;
        for (Employee listEmployee : listEmployees) {
            sum += listEmployee.getSalary();
        }
        return sum;
    }

    public static Employee minSalaryName(Employee[] listEmployees) {
        int minSalary = Integer.MAX_VALUE;
        Employee employeesName = null;
        for (Employee listEmployee : listEmployees) {
            if (listEmployee.getSalary() < minSalary) {
                minSalary = listEmployee.getSalary();
            }
        }
        for (Employee listEmployee : listEmployees) {
            if (minSalary == listEmployee.getSalary()) {
                employeesName = listEmployee;
            }
        }
        return employeesName;
    }

    public static Employee maxSalaryName(Employee[] listEmployees) {
        int maxSalary = Integer.MIN_VALUE;
        Employee employeesName = null;
        for (Employee listEmployee : listEmployees) {
            if (listEmployee.getSalary() > maxSalary) {
                maxSalary = listEmployee.getSalary();
            }
        }
        for (Employee listEmployee : listEmployees) {
            if (maxSalary == listEmployee.getSalary()) {
                employeesName = listEmployee;
            }
        }
        return employeesName;
    }

    public static int averageValueSalary(Employee[] listEmployees) {
        return sumSalary(listEmployees) / listEmployees.length;
    }

    public static void fullNameEmployees(Employee[] listEmployees) {
        for (Employee listEmployee : listEmployees) {
            System.out.println(listEmployee.getLastName()+ " " + listEmployee.getFirstName()+ " " + listEmployee.getPatronymic());
        }
    }
}