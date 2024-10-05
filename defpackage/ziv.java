package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ziv implements ayrr {
    public final /* synthetic */ anhy a;
    private final /* synthetic */ int b;

    public /* synthetic */ ziv(anhy anhyVar, int i) {
        this.b = i;
        this.a = anhyVar;
    }

    @Override // defpackage.ayrr
    public final void a() {
        int i = this.b;
        if (i == 0) {
            this.a.cancel(true);
        } else if (i != 1) {
            this.a.cancel(false);
        } else {
            this.a.cancel(true);
        }
    }
}
