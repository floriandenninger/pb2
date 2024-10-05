package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nww implements ayrs {
    public final /* synthetic */ nwx a;
    private final /* synthetic */ int b;

    public /* synthetic */ nww(nwx nwxVar, int i) {
        this.b = i;
        this.a = nwxVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.o = (nxh) obj;
        } else if (i == 1) {
            this.a.n = ((Integer) obj).intValue();
        } else {
            this.a.p = ((Boolean) obj).booleanValue();
        }
    }
}
