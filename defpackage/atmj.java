package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atmj implements aons {
    private final /* synthetic */ int i;
    static final aons h = new atmj(7);
    static final aons g = new atmj(6);
    static final aons f = new atmj(5);
    public static final aons e = new atmj(4);
    static final aons d = new atmj(3);
    static final aons c = new atmj(2);
    public static final aons b = new atmj(1);
    static final aons a = new atmj(0);

    private atmj(int i) {
        this.i = i;
    }

    @Override // defpackage.aons
    public final boolean isInRange(int i) {
        switch (this.i) {
            case 0:
                return atmk.b(i) != null;
            case 1:
                return i == 0 || i == 1 || i == 2;
            case 2:
                return atna.b(i) != null;
            case 3:
                return atng.b(i) != null;
            case 4:
                return anaf.ce(i) != 0;
            case 5:
                return anaf.cd(i) != 0;
            case 6:
                return anaf.cc(i) != 0;
            default:
                return i == 0 || i == 1 || i == 2 || i == 3 || i == 4 || i == 5;
        }
    }
}
