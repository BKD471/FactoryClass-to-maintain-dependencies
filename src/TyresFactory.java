public class TyresFactory {

    public Tyres getTyres(String tyres) {

        if (tyres == null) return null;
        if (tyres.equalsIgnoreCase("MRF")) return new MRFTyres();
        else if (tyres.equalsIgnoreCase("Michelin")) return new MichelinTyres();
        return null;
    }
}
