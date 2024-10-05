package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atxj implements aons {
    private final /* synthetic */ int v;
    static final aons u = new atxj(20);
    static final aons t = new atxj(19);
    static final aons s = new atxj(18);
    static final aons r = new atxj(17);
    static final aons q = new atxj(16);
    static final aons p = new atxj(15);
    static final aons o = new atxj(14);
    static final aons n = new atxj(13);
    static final aons m = new atxj(12);
    static final aons l = new atxj(11);
    static final aons k = new atxj(10);
    static final aons j = new atxj(9);
    static final aons i = new atxj(8);
    static final aons h = new atxj(7);
    static final aons g = new atxj(6);
    static final aons f = new atxj(5);
    static final aons e = new atxj(4);
    static final aons d = new atxj(3);
    static final aons c = new atxj(2);
    static final aons b = new atxj(1);
    static final aons a = new atxj(0);

    private atxj(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aons
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
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
                        return true;
                    default:
                        return false;
                }
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
                        return true;
                    default:
                        return false;
                }
            case 3:
                return atxk.b(i2) != null;
            case 4:
                return atxl.b(i2) != null;
            case 5:
                return anaf.bF(i2) != 0;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 7:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
            case 8:
                return atyc.b(i2) != null;
            case 9:
                return auan.b(i2) != null;
            case 10:
                return anaf.bE(i2) != 0;
            case 11:
                return anaf.bD(i2) != 0;
            case 12:
                return anaf.bC(i2) != 0;
            case 13:
                return auav.b(i2) != null;
            case 14:
                return anaf.bB(i2) != 0;
            case 15:
                return auej.b(i2) != null;
            case 16:
                return anaf.bA(i2) != 0;
            case 17:
                return anaf.bz(i2) != 0;
            case 18:
                return anaf.by(i2) != 0;
            case 19:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 6;
            default:
                return anaf.bx(i2) != 0;
        }
    }
}
