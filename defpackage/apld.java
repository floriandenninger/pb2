package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apld implements aons {
    private final /* synthetic */ int v;
    static final aons u = new apld(20);
    static final aons t = new apld(19);
    public static final aons s = new apld(18);
    static final aons r = new apld(17);
    static final aons q = new apld(16);
    static final aons p = new apld(15);
    static final aons o = new apld(14);
    static final aons n = new apld(13);
    static final aons m = new apld(12);
    static final aons l = new apld(11);
    static final aons k = new apld(10);
    static final aons j = new apld(9);
    static final aons i = new apld(8);
    static final aons h = new apld(7);
    static final aons g = new apld(6);
    static final aons f = new apld(5);
    static final aons e = new apld(4);
    static final aons d = new apld(3);
    static final aons c = new apld(2);
    static final aons b = new apld(1);
    static final aons a = new apld(0);

    private apld(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aons
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 1:
                return apkz.b(i2) != null;
            case 2:
                return anaf.aP(i2) != 0;
            case 3:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                        return true;
                    default:
                        return false;
                }
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 6:
                return anaf.aO(i2) != 0;
            case 7:
                return anaf.aN(i2) != 0;
            case 8:
                return anaf.aM(i2) != 0;
            case 9:
                return anaf.aL(i2) != 0;
            case 10:
                return anaf.aK(i2) != 0;
            case 11:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 12:
                return anaf.aJ(i2) != 0;
            case 13:
                return anaf.aI(i2) != 0;
            case 14:
                return apnr.b(i2) != null;
            case 15:
                return anaf.aH(i2) != 0;
            case 16:
                return anaf.aG(i2) != 0;
            case 17:
                return anaf.aF(i2) != 0;
            case 18:
                return anaf.aE(i2) != 0;
            case 19:
                return anaf.aD(i2) != 0;
            default:
                return anaf.aC(i2) != 0;
        }
    }
}
