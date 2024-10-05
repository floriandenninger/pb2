package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dod extends dnw {
    final /* synthetic */ doe b;

    public dod(doe doeVar) {
        this.b = doeVar;
    }

    @Override // defpackage.dnw
    public final void c(long j) {
        doe doeVar = this.b;
        doeVar.e = false;
        if (doeVar.d) {
            if (doeVar.f != j) {
                doeVar.c.a(j);
                doeVar.f = j;
            }
            if (doeVar.d) {
                doeVar.a();
            }
        }
    }
}
