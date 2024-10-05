package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afem implements ammy {
    public final /* synthetic */ afcp a;
    private final /* synthetic */ int b;

    public /* synthetic */ afem(afcp afcpVar, int i) {
        this.b = i;
        this.a = afcpVar;
    }

    @Override // defpackage.ammy
    public final boolean a(Object obj) {
        if (this.b != 0) {
            return ((afcp) obj).b() != this.a.b();
        }
        return ((afcp) obj).a() < this.a.a();
    }
}
