package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ntl implements ayrs {
    public final /* synthetic */ nto a;
    private final /* synthetic */ int b;

    public /* synthetic */ ntl(nto ntoVar, int i) {
        this.b = i;
        this.a = ntoVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            nto ntoVar = this.a;
            ntoVar.t = ((Integer) obj).intValue();
            ntoVar.n();
            return;
        }
        nto ntoVar2 = this.a;
        aubs aubsVar = (aubs) obj;
        ntoVar2.s = aubsVar;
        ntoVar2.n();
        ntoVar2.j.c(adyu.di(aubsVar));
        if (ntoVar2.q) {
            ntoVar2.i();
        }
    }
}
