package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asaq implements aons {
    private final /* synthetic */ int v;
    static final aons u = new asaq(20);
    static final aons t = new asaq(19);
    static final aons s = new asaq(18);
    static final aons r = new asaq(17);
    static final aons q = new asaq(16);
    static final aons p = new asaq(15);
    static final aons o = new asaq(14);
    static final aons n = new asaq(13);
    static final aons m = new asaq(12);
    static final aons l = new asaq(11);
    static final aons k = new asaq(10);
    static final aons j = new asaq(9);
    static final aons i = new asaq(8);
    public static final aons h = new asaq(7);
    public static final aons g = new asaq(6);
    public static final aons f = new asaq(5);
    public static final aons e = new asaq(4);
    static final aons d = new asaq(3);
    static final aons c = new asaq(2);
    static final aons b = new asaq(1);
    static final aons a = new asaq(0);

    private asaq(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aons
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                if (i2 != 27 && i2 != 28) {
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
                            break;
                        default:
                            return false;
                    }
                }
                return true;
            case 1:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 2:
                if (i2 != 18 && i2 != 22) {
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
                            break;
                        default:
                            return false;
                    }
                }
                return true;
            case 3:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 4:
                return amkq.du(i2) != 0;
            case 5:
                return amkq.dt(i2) != 0;
            case 6:
                return amkq.ds(i2) != 0;
            case 7:
                return amkq.dr(i2) != 0;
            case 8:
                return amkq.dq(i2) != 0;
            case 9:
                return amkq.dp(i2) != 0;
            case 10:
                return amkq.m1do(i2) != 0;
            case 11:
                return amkq.dn(i2) != 0;
            case 12:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 13:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 14:
                return amkq.dm(i2) != 0;
            case 15:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 16:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 17:
                if (i2 != 0 && i2 != 1 && i2 != 2) {
                    switch (i2) {
                        case 4:
                        case 8:
                        case 16:
                        case 32:
                        case 64:
                        case 128:
                        case 256:
                        case 512:
                        case 1024:
                        case 2048:
                        case 4096:
                        case 8192:
                        case 16384:
                            break;
                        default:
                            return false;
                    }
                }
                return true;
            case 18:
                return amkq.dl(i2) != 0;
            case 19:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
        }
    }
}
