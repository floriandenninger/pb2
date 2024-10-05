package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ylm implements amml {
    public final /* synthetic */ ylq a;
    private final /* synthetic */ int b;

    public /* synthetic */ ylm(ylq ylqVar, int i) {
        this.b = i;
        this.a = ylqVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        if (this.b != 0) {
            this.a.c.e();
            return obj;
        }
        this.a.a.run();
        return null;
    }
}
