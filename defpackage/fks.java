package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class fks implements flm {
    private final fln a;
    private boolean b;

    public fks(fln flnVar) {
        this.a = flnVar;
    }

    public void l() {
        if (this.b) {
            return;
        }
        if (this.a.b) {
            kH();
        }
        this.a.a(this);
        this.b = true;
    }
}
