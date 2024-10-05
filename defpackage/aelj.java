package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aelj implements anhh {
    final /* synthetic */ aarn a;
    final /* synthetic */ ysl b;
    final /* synthetic */ aelk c;

    public aelj(aelk aelkVar, aarn aarnVar, ysl yslVar) {
        this.c = aelkVar;
        this.a = aarnVar;
        this.b = yslVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aryr aryrVar = (aryr) obj;
        aarn aarnVar = this.a;
        afki.a(aryrVar);
        aarnVar.ql(aryrVar);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        this.c.d(this.b, this.a);
    }
}
