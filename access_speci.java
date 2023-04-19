class A{
    protected String name;
    A(String n){
        name = n;
    }

    public void show(){
        System.out.println("name is"+name);
    }
}

class B extends A{
    protected long telephone;
    B(String n, long tel){
        super(n);
        telephone = tel;
    }

    public void show(){
        System.out.println(super.name+" "+telephone);
    }
}

class C extends B{
    public String city;
    C(String n, long tel, String cty){
        super(n, tel);
        city = cty;
    }
    public void show(){
        System.out.println(name+" "+telephone+" "+city);
    }
}
public class access_speci {
    public static void main(String[] args){
        C me = new C("Sourab", 1234567880, "Belgaum");
        me.show();
        System.out.println(me.telephone);
    }
    
}
