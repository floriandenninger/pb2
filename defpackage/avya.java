package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class avya implements aons {
    private final /* synthetic */ int v;
    static final aons u = new avya(20);
    static final aons t = new avya(19);
    static final aons s = new avya(18);
    static final aons r = new avya(17);
    static final aons q = new avya(16);
    static final aons p = new avya(15);
    static final aons o = new avya(14);
    static final aons n = new avya(13);
    static final aons m = new avya(12);
    static final aons l = new avya(11);
    static final aons k = new avya(10);
    static final aons j = new avya(9);
    static final aons i = new avya(8);
    static final aons h = new avya(7);
    static final aons g = new avya(6);
    static final aons f = new avya(5);
    static final aons e = new avya(4);
    static final aons d = new avya(3);
    static final aons c = new avya(2);
    static final aons b = new avya(1);
    static final aons a = new avya(0);

    private avya(int i2) {
        this.v = i2;
    }

    @Override // defpackage.aons
    public final boolean isInRange(int i2) {
        switch (this.v) {
            case 0:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 1:
                return awxr.X(i2) != 0;
            case 2:
                return avzp.b(i2) != null;
            case 3:
                return avzr.b(i2) != null;
            case 4:
                return awxr.W(i2) != 0;
            case 5:
                return awag.b(i2) != null;
            case 6:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 7:
                return awah.b(i2) != null;
            case 8:
                return i2 == 0 || i2 == 1;
            case 9:
                return i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3;
            case 10:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 11:
                return i2 == 0 || i2 == 1 || i2 == 2;
            case 12:
                return awxr.V(i2) != 0;
            case 13:
                return awxr.U(i2) != 0;
            case 14:
                return awxr.T(i2) != 0;
            case 15:
                return awxr.S(i2) != 0;
            case 16:
                return awxr.R(i2) != 0;
            case 17:
                return awxr.Q(i2) != 0;
            case 18:
                return awxr.P(i2) != 0;
            case 19:
                return awxr.O(i2) != 0;
            default:
                return awxr.N(i2) != 0;
        }
    }
}
