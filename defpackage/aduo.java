package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aduo implements aons {
    private final /* synthetic */ int v;
    public static final aons u = new aduo(20);
    public static final aons t = new aduo(19);
    public static final aons s = new aduo(18);
    public static final aons r = new aduo(17);
    public static final aons q = new aduo(16);
    public static final aons p = new aduo(15);
    public static final aons o = new aduo(14);
    public static final aons n = new aduo(13);
    public static final aons m = new aduo(12);
    public static final aons l = new aduo(11);
    public static final aons k = new aduo(10);
    public static final aons j = new aduo(9);
    public static final aons i = new aduo(8);
    public static final aons h = new aduo(7);
    public static final aons g = new aduo(6);
    public static final aons f = new aduo(5);
    public static final aons e = new aduo(4);
    static final aons d = new aduo(3);
    static final aons c = new aduo(2);
    public static final aons b = new aduo(1);
    static final aons a = new aduo(0);

    private aduo(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aons
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return adup.a(i2) != null;
            case 1:
                return uqw.b(i2) != 0;
            case 2:
                return i2 == 0;
            case 3:
                return i2 == 0 || i2 == 1;
            case 4:
                return akwg.n(i2) != 0;
            case 5:
                return akwg.m(i2) != 0;
            case 6:
                return akwg.l(i2) != 0;
            case 7:
                return akzq.a(i2) != null;
            case 8:
                return akzr.a(i2) != null;
            case 9:
                return akzv.a(i2) != null;
            case 10:
                return ambh.b(i2) != 0;
            case 11:
                return alwb.a(i2) != null;
            case 12:
                return alta.w(i2) != 0;
            case 13:
                return amjl.a(i2) != null;
            case 14:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 15:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 16:
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
                        return true;
                    default:
                        return false;
                }
            case 17:
                return amlh.a(i2) != null;
            case 18:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 19:
                return anaf.r(i2) != 0;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2;
        }
    }
}
