package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ylh implements amml {
    public final /* synthetic */ yll a;
    private final /* synthetic */ int b;

    public /* synthetic */ ylh(yll yllVar, int i) {
        this.b = i;
        this.a = yllVar;
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
