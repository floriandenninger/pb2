package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acoi implements abrp {
    final /* synthetic */ acoj a;

    public acoi(acoj acojVar) {
        this.a = acojVar;
    }

    @Override // defpackage.abrp
    public final void c(abqu abquVar) {
        this.a.c.c(abquVar);
        abrd abrdVar = this.a.d;
        if (abrdVar != null) {
            abrdVar.c(abquVar);
        }
    }

    @Override // defpackage.abrp
    public final boolean e(boolean z, abrr abrrVar, abqu abquVar) {
        boolean e = new abrd(this.a.c).e(z, abrrVar, abquVar);
        abrd abrdVar = this.a.d;
        return e || (abrdVar != null ? new abrd(abrdVar).e(z, abrrVar, abquVar) : false);
    }
}
