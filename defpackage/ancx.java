package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ancx implements aons {
    private final /* synthetic */ int u;
    public static final aons t = new ancx(20);
    public static final aons s = new ancx(19);
    public static final aons r = new ancx(18);
    public static final aons q = new ancx(17);
    public static final aons p = new ancx(16);
    public static final aons o = new ancx(15);
    public static final aons n = new ancx(14);
    public static final aons m = new ancx(13);
    public static final aons l = new ancx(12);
    public static final aons k = new ancx(11);
    public static final aons j = new ancx(10);
    public static final aons i = new ancx(9);
    public static final aons h = new ancx(8);
    public static final aons g = new ancx(7);
    public static final aons f = new ancx(6);
    public static final aons e = new ancx(5);
    public static final aons d = new ancx(4);
    public static final aons c = new ancx(3);
    public static final aons b = new ancx(2);
    public static final aons a = new ancx(1);
    static final aons INSTANCE = new ancx(0);

    private ancx(int i2) {
        this.u = i2;
    }

    @Override // defpackage.aons
    public final boolean isInRange(int i2) {
        switch (this.u) {
            case 0:
                return ancy.a(i2) != null;
            case 1:
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
                        return true;
                    default:
                        return false;
                }
            case 2:
                return andg.a(i2) != null;
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
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                        return true;
                    default:
                        return false;
                }
            case 4:
                return anaf.p(i2) != 0;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 6:
                switch (i2) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        return true;
                    default:
                        return false;
                }
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 8:
                return anaf.n(i2) != 0;
            case 9:
                return anaf.m(i2) != 0;
            case 10:
                return anaf.l(i2) != 0;
            case 11:
                return aobq.H(i2) != 0;
            case 12:
                return ansd.a(i2) != null;
            case 13:
                return ansl.a(i2) != null;
            case 14:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 16:
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
            case 17:
                return aobq.a(i2) != 0;
            case 18:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 19:
                return aocz.a(i2) != 0;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
        }
    }
}
