package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ehd implements ayrs {
    public final /* synthetic */ ehq a;
    private final /* synthetic */ int b;

    public /* synthetic */ ehd(ehq ehqVar, int i) {
        this.b = i;
        this.a = ehqVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.c(null, (Throwable) obj);
            return;
        }
        if (i == 1) {
            this.a.c((Boolean) obj, null);
        } else if (i == 2) {
            this.a.c(null, (Throwable) obj);
        } else {
            this.a.c((Boolean) obj, null);
        }
    }
}
