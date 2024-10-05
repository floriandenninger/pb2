package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aedp {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static aedo a(String str) {
        char c;
        switch (str.hashCode()) {
            case -809938602:
                if (str.equals("vr100k")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3002541:
                if (str.equals("arfb")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 3002919:
                if (str.equals("arrh")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 3433448:
                if (str.equals("pari")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3453629:
                if (str.equals("pvri")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3628152:
                if (str.equals("vrfb")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 3628530:
                if (str.equals("vrrh")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 93029278:
                if (str.equals("ar40k")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 93112086:
                if (str.equals("asisr")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 112506027:
                if (str.equals("vsisr")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new aeaq();
            case 1:
                return new aeap();
            case 2:
                return new aecr();
            case 3:
                return new adzj();
            case 4:
                return new aecv();
            case 5:
                return new adzn();
            case 6:
                return new aecp();
            case 7:
                return new adzh();
            case '\b':
                return new aeco();
            case '\t':
                return new adzg();
            default:
                return null;
        }
    }
}
