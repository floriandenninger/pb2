package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azlk extends azqr {
    final azll a;
    boolean b;

    public azlk(azll azllVar) {
        this.a = azllVar;
    }

    @Override // defpackage.ayqd
    public final void b(Throwable th) {
        if (this.b) {
            aynu.j(th);
            return;
        }
        this.b = true;
        azll azllVar = this.a;
        ayrz.c(azllVar.e);
        if (azqi.e(azllVar.h, th)) {
            azllVar.j = true;
            azllVar.f();
        } else {
            aynu.j(th);
        }
    }

    @Override // defpackage.ayqd
    public final void c(Object obj) {
        if (this.b) {
            return;
        }
        this.a.g();
    }

    @Override // defpackage.ayqd
    public final void sh() {
        if (this.b) {
            return;
        }
        this.b = true;
        azll azllVar = this.a;
        ayrz.c(azllVar.e);
        azllVar.j = true;
        azllVar.f();
    }
}
