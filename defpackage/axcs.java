package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axcs implements aons {
    private final /* synthetic */ int v;
    public static final aons u = new axcs(20);
    public static final aons t = new axcs(19);
    public static final aons s = new axcs(18);
    public static final aons r = new axcs(17);
    public static final aons q = new axcs(16);
    public static final aons p = new axcs(15);
    public static final aons o = new axcs(14);
    public static final aons n = new axcs(13);
    public static final aons m = new axcs(12);
    public static final aons l = new axcs(11);
    public static final aons k = new axcs(10);
    public static final aons j = new axcs(9);
    static final aons i = new axcs(8);
    static final aons h = new axcs(7);
    static final aons g = new axcs(6);
    static final aons f = new axcs(5);
    static final aons e = new axcs(4);
    static final aons d = new axcs(3);
    static final aons c = new axcs(2);
    static final aons b = new axcs(1);
    static final aons a = new axcs(0);

    private axcs(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aons
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return awxt.c(i2) != 0;
            case 1:
                return awxs.c(i2) != 0;
            case 2:
                return axcz.b(i2) != null;
            case 3:
                return axdm.b(i2) != null;
            case 4:
                return axdq.b(i2) != null;
            case 5:
                return axec.b(i2) != null;
            case 6:
                return i2 == 1 || i2 == 2 || i2 == 3;
            case 7:
                return i2 == 1;
            case 8:
                return i2 == 1;
            case 9:
                return axin.b(i2) != null;
            case 10:
                return axio.b(i2) != null;
            case 11:
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
            case 12:
                return badf.h(i2) != 0;
            case 13:
                return baav.b(i2) != null;
            case 14:
                return i2 == 0 || i2 == 1 || i2 == 2;
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
                return babo.b(i2) != null;
            case 17:
                return babq.b(i2) != null;
            case 18:
                return babt.b(i2) != null;
            case 19:
                return badf.g(i2) != 0;
            default:
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
        }
    }
}
