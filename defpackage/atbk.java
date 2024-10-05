package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atbk implements aons {
    private final /* synthetic */ int v;
    public static final aons u = new atbk(20);
    public static final aons t = new atbk(19);
    static final aons s = new atbk(18);
    static final aons r = new atbk(17);
    static final aons q = new atbk(16);
    static final aons p = new atbk(15);
    static final aons o = new atbk(14);
    static final aons n = new atbk(13);
    static final aons m = new atbk(12);
    static final aons l = new atbk(11);
    static final aons k = new atbk(10);
    static final aons j = new atbk(9);
    static final aons i = new atbk(8);
    static final aons h = new atbk(7);
    static final aons g = new atbk(6);
    static final aons f = new atbk(5);
    static final aons e = new atbk(4);
    static final aons d = new atbk(3);
    static final aons c = new atbk(2);
    static final aons b = new atbk(1);
    static final aons a = new atbk(0);

    private atbk(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aons
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
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
                    case 11:
                    case 12:
                        return true;
                    default:
                        return false;
                }
            case 2:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5;
            case 3:
                return amkq.cR(i2) != 0;
            case 4:
                return amkq.cQ(i2) != 0;
            case 5:
                return amkq.cP(i2) != 0;
            case 6:
                return amkq.cO(i2) != 0;
            case 7:
                return amkq.cN(i2) != 0;
            case 8:
                return amkq.cM(i2) != 0;
            case 9:
                return amkq.cL(i2) != 0;
            case 10:
                return anaf.co(i2) != 0;
            case 11:
                return anaf.cn(i2) != 0;
            case 12:
                return anaf.cm(i2) != 0;
            case 13:
                return anaf.cl(i2) != 0;
            case 14:
                return anaf.ck(i2) != 0;
            case 15:
                return atfo.b(i2) != null;
            case 16:
                return anaf.cj(i2) != 0;
            case 17:
                return anaf.ci(i2) != 0;
            case 18:
                return anaf.ch(i2) != 0;
            case 19:
                return anaf.cg(i2) != 0;
            default:
                return anaf.cf(i2) != 0;
        }
    }
}
