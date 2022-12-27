package homework;

public class Person {     //Declare Class name
    String firstName;     //Declare Instance Variable
    String lastName;      //Declare Instance Variable
    int age;              //Declare Instance variable

    public static void main(String[] args) {    //Declare main method or predefined method

        Person person = new Person();
        person.setFirstName(""); // firstName is set to empty string
        person.setLastName(""); // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John"); // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith"); // lastName is setto Smith
        System.out.println("fullName= " + person.getFullName());
    }

    public String getFirstName(){       //Declare Instance method
        return firstName;
    }
    public String getLastName(){       //Declare Instance method
        return lastName;

    }
    public int getAge(){               //Declare Instance method
        return age;
    }
    public void setFirstName(String firstName){      //Declare Instance method
        this.firstName = firstName;
    }
    public void setLastName(String lastName){          //Declare Instance Method
        this . lastName = lastName;
    }
    public void setAge(int age){                        //Declare Instance method
        if (age>0 && age<=100){
            this.age = age;
        }else{
            this.age = 0;
        }
    }
    public boolean isTeen() {                      //Declare Instance method
        if (age > 12 && age < 20) {
            return true;
        } else {
            return false;
        }
    }

        public String getFullName(){               //Declare Instance method
        if (firstName.isEmpty()){
            return lastName;
        }
        if (lastName .isEmpty()){
            return firstName;
        }
        if (firstName.isEmpty() && lastName.isEmpty()){
            return " ";
        }
        else {
            return firstName + " " + lastName;
        }

        }



        }




