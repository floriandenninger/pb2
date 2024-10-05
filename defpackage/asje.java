package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asje implements aons {
    private final /* synthetic */ int v;
    static final aons u = new asje(20);
    static final aons t = new asje(19);
    static final aons s = new asje(18);
    static final aons r = new asje(17);
    static final aons q = new asje(16);
    static final aons p = new asje(15);
    static final aons o = new asje(14);
    static final aons n = new asje(13);
    static final aons m = new asje(12);
    static final aons l = new asje(11);
    static final aons k = new asje(10);
    static final aons j = new asje(9);
    static final aons i = new asje(8);
    static final aons h = new asje(7);
    static final aons g = new asje(6);
    static final aons f = new asje(5);
    static final aons e = new asje(4);
    static final aons d = new asje(3);
    static final aons c = new asje(2);
    static final aons b = new asje(1);
    static final aons a = new asje(0);

    private asje(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aons
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return amkq.dj(i2) != 0;
            case 1:
                return amkq.dk(i2) != 0;
            case 2:
                return amkq.di(i2) != 0;
            case 3:
                return i2 == 0 || i2 == 1;
            case 4:
                return asmn.b(i2) != null;
            case 5:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
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
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        return true;
                    default:
                        return false;
                }
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 8:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 9:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 10:
                return asmw.b(i2) != null;
            case 11:
                return asnb.b(i2) != null;
            case 12:
                return asno.b(i2) != null;
            case 13:
                return asoi.b(i2) != null;
            case 14:
                return asoj.b(i2) != null;
            case 15:
                return amkq.dh(i2) != 0;
            case 16:
                return amkq.dg(i2) != 0;
            case 17:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 18:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 19:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            default:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
        }
    }
}
