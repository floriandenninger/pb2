package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kcx implements ayrs {
    public final /* synthetic */ kcz a;
    private final /* synthetic */ int b;

    public /* synthetic */ kcx(kcz kczVar, int i) {
        this.b = i;
        this.a = kczVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.aG((ahea) obj);
            return;
        }
        if (i == 1) {
            this.a.aF((ahdv) obj);
        } else if (i == 2) {
            this.a.aL();
        } else {
            this.a.l();
        }
    }
}
