package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csp {
    private final cub a;
    private volatile cuc b;

    public csp(cub cubVar) {
        this.a = cubVar;
    }

    public final cuc a() {
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    this.b = this.a.a();
                }
                if (this.b == null) {
                    this.b = new cue();
                }
            }
        }
        return this.b;
    }
}
