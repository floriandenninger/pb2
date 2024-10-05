package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aogu implements aons {
    private final /* synthetic */ int v;
    public static final aons u = new aogu(20);
    public static final aons t = new aogu(19);
    public static final aons s = new aogu(18);
    public static final aons r = new aogu(17);
    public static final aons q = new aogu(16);
    public static final aons p = new aogu(15);
    public static final aons o = new aogu(14);
    public static final aons n = new aogu(13);
    public static final aons m = new aogu(12);
    public static final aons l = new aogu(11);
    public static final aons k = new aogu(10);
    public static final aons j = new aogu(9);
    public static final aons i = new aogu(8);
    public static final aons h = new aogu(7);
    public static final aons g = new aogu(6);
    public static final aons f = new aogu(5);
    public static final aons e = new aogu(4);
    public static final aons d = new aogu(3);
    public static final aons c = new aogu(2);
    public static final aons b = new aogu(1);
    static final aons a = new aogu(0);

    private aogu(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aons
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return aogv.a(i2) != null;
            case 1:
                return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 2:
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
                        return true;
                    default:
                        return false;
                }
            case 3:
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
            case 4:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 6:
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
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 8:
                return aocz.b(i2) != 0;
            case 9:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 11:
                return aohm.a(i2) != null;
            case 12:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 13:
                return aobq.m(i2) != 0;
            case 14:
                return aohq.a(i2) != null;
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 16:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 17:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 18:
                return aobq.l(i2) != 0;
            case 19:
                return aohx.a(i2) != null;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
        }
    }
}
