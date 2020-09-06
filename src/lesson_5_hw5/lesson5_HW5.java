package lesson_5_hw5;


class Person {
    private  String name;
    private String position;
    private  String eMail;
    private String telNummer;
    private int praise;
    private int age;


    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }


    public void setTelNummer(String telNummer) {
        this.telNummer = telNummer;
    }

    public void setPraise(int praise) {
        this.praise = praise;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Person(String name, String position, String eMail, String telNummer, int praise, int age) {
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.telNummer = telNummer;
        this.praise = praise;
        this.age = age;
    }
    public void info() {
        System.out.println("Имя фамилия работника: " + name + "; Должность: " + position + ";\n " +
                " Электронный адрес: " + eMail + "; зарплата: " + praise + "; Возраст: " + age);
    }

    public static void main(String[] args) {

        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов

        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        persArray[1] = new Person("Sidorov Petr", "Master", "sidorov@mair.ru", "89135432123", 40000, 41);
        persArray[2] = new Person("Petrova Elena", "Povar", "petrova@gimail.com", "89543212345", 31000, 52);
        persArray[3] = new Person("Egorov Pavel", "Ohrannik", "egorov@yandex", "89117654321", 18000, 46);
        persArray[4] = new Person("Kozlova Svetlana", "Yborschica", "kozlova@gimail.com", "89321236543", 11500, 21);


        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge() > 40) {
                persArray[i].info();
            }
        }
    }

//        if (age >= 0)
//            this.age = age;
//        if (age > 40) {
//            System.out.println("возраст больше 40 лет");
//        } else {
//            System.out.println("Введен некорректный возраст");
//        }




    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String geteMail() {
        return eMail;
    }

    public String getTelNummer() {
        return telNummer;
    }

    public int getPraise() {
        return praise;
    }
    
    public int getAge() {
        return age;
    }



    public String Person (String toString) {
        return "Person{" + "Имя фамилия работника: " + name + "; Должность: " + position + ";\n " +
                " Электронный адрес: " + eMail + "; зарплата: " + praise + "; Возраст: " + age + '}';
    }
}