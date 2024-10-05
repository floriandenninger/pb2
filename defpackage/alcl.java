package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alcl implements anhh {
    final /* synthetic */ axam a;
    final /* synthetic */ String b;
    final /* synthetic */ alcn c;

    public alcl(alcn alcnVar, axam axamVar, String str) {
        this.c = alcnVar;
        this.a = axamVar;
        this.b = str;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        this.a.f();
        this.c.s(this.b, this.a, Double.POSITIVE_INFINITY);
    }
}
