public class Main {


    public void vechicle1(){

    }

    public static void vehicle2(){
       SpeakerFactory spf=new SpeakerFactory();
       Spekers sp=spf.getSpeakers("Bose");
       System.out.println(sp.blow());

       TyresFactory ty=new TyresFactory();
       Tyres tys=ty.getTyres("Michelin");
        System.out.println(tys.rotate());
    }


    public static void main(String[] args) {
        vehicle2();
    }
}