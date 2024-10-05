package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tul implements anfz {
    public final /* synthetic */ tus a;
    private final /* synthetic */ int b;

    public /* synthetic */ tul(tus tusVar, int i) {
        this.b = i;
        this.a = tusVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.b == 0) {
            return this.a.b.f();
        }
        tus tusVar = this.a;
        tvb tvbVar = (tvb) obj;
        if (tus.l(tvbVar)) {
            return anaf.O(tvbVar);
        }
        return tusVar.h();
    }
}
