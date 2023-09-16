public class Person {
    public static void main(Stiring[] args){
        Person man = new Person(male);
        Person woman = new Person(female);
    
    public void speak (male){
        System.out.println("I'm a man")
    }
    public void speak (female){
        System.out.println("I'm a woman")
    }
}

//ヒント１を見てから書いたもの
publi class Person{
    publi enum Gender {MAN, WOMAN};
    private Gender Gender;

    public Person(Gender gender){
        this.gender=gender;
        }

    public void speak()
        switch(gender){
            case MAN:
                System.out.println("I'm a man")
                break;
            Case WOMAN:
                System.out.println("I'm a woman")
                break;
           default: 
        }
    }
    public static void main(Stiring[] args){
        Person man = new Person(MAN);
        Person woman = new Person(WOMAN);
        Person.speak();
            System.out.println()
    }
}

//ヒント2を見てから書いたもの
publi class Person{
    publi enum Gender {MAN, WOMAN};
    private Gender Gender;

    public Person(Gender gender){
        this.gender=gender;
        }

    public void speak(){
        switch(gender){
            case MAN:
                System.out.println("I'm a man")
                break;
            Case WOMAN:
                System.out.println("I'm a woman")
                break;
           default: 
        }
    }
    public static void main(Stiring[] args){
        Person man = new Person(Gender.MAN);
        man.speak();

        Person woman = new Person(Gender.WOMAN);
        woman.speak();
    }
}