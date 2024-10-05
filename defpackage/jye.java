package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jye implements ayrs {
    public final /* synthetic */ jyh a;
    private final /* synthetic */ int b;

    public /* synthetic */ jye(jyh jyhVar, int i) {
        this.b = i;
        this.a = jyhVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            jyh jyhVar = this.a;
            if (((Boolean) obj).booleanValue()) {
                jyhVar.b();
                return;
            }
            return;
        }
        jyh jyhVar2 = this.a;
        if (((Boolean) obj).booleanValue()) {
            jyhVar2.b();
        }
    }
}
