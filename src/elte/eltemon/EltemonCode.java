package elte.eltemon;

public enum EltemonCode {
    CRAZEPIE(0), LEOTON(1), SPECYBARA(2);


    public final int code;

    EltemonCode(int code) {
        this.code = code;
    }

    public static EltemonCode toEnum(int code) {
        switch (code) {
            case 0:
                return CRAZEPIE;
            case 1:
                return LEOTON;
            case 2:
            default:
                return SPECYBARA;
        }
    }
}
