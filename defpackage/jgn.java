package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jgn implements adue {
    final /* synthetic */ jgo a;

    public jgn(jgo jgoVar) {
        this.a = jgoVar;
    }

    @Override // defpackage.adue
    public final void oZ(int i, adub adubVar) {
        jgo jgoVar = this.a;
        jgoVar.g = adubVar;
        if (i != 2) {
            if (i != 7) {
                return;
            }
            jgoVar.b();
        } else if (adubVar.j != 2) {
            jgoVar.e = jgoVar.c.g();
        } else {
            jgoVar.e = null;
            jgoVar.b.c(null);
        }
    }
}
