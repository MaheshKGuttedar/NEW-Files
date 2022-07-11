
 public class Student {
        String name;
        int age;
        char a;
        public void printInfo(){
            System.out.println("no arg method");
            System.out.println(this.name);
            System.out.println(this.age);
        }
        public void printInfo(int a, String n) {
            this.age = age;
            this.name = name;
            // printInfo(int, String)
            System.out.println(this.age);
            System.out.println(this.name);
        }
    }
    class Main{
        public static void main(String[] args) {
            Student v = new Student();
            v.name = "vinod Kumar";
            Student v1 = new Student();

            System.out.println(v.name);
            v.printInfo(23,"vishal kumar");
            System.out.println(v.name);
        }
    }

