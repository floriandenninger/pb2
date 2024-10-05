package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ikg implements ayrs {
    public final /* synthetic */ ikn a;
    private final /* synthetic */ int b;

    public /* synthetic */ ikg(ikn iknVar, int i) {
        this.b = i;
        this.a = iknVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            this.a.a.b();
        } else if (i != 1) {
            this.a.a.b();
        } else {
            this.a.B = ((Boolean) obj).booleanValue();
        }
    }
}
