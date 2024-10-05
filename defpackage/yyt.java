package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yyt {
    public static final int a = wbs.aq(8, 1);
    public static final int b = wbs.aq(13, 1);
    public final aypy c;
    private final azrh d;
    private volatile int e = 0;

    public yyt() {
        azrh aN = azrh.aN(Long.valueOf(wbs.aw(this.e, this.e)));
        this.d = aN;
        this.c = aN.U();
    }

    public final synchronized void a(int i) {
        if (wbs.au(this.e, i) != 0) {
            return;
        }
        int av = wbs.av(this.e, i, 1);
        if (this.e == av) {
            return;
        }
        int i2 = this.e;
        this.e = av;
        this.d.c(Long.valueOf(wbs.aw(av, i2)));
    }
}
