package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class imq implements anhh {
    final /* synthetic */ ine a;
    final /* synthetic */ boolean b;
    final /* synthetic */ imr c;

    public imq(imr imrVar, ine ineVar, boolean z) {
        this.c = imrVar;
        this.a = ineVar;
        this.b = z;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (!this.c.d && optional.isPresent()) {
            long d = this.c.b.d();
            imr imrVar = this.c;
            imrVar.d(imrVar.a, (apxf) optional.get(), this.a, 3, 1, 0, false, false, this.b, d);
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        gfw.v(1, valueOf.length() != 0 ? "Skipping prefetch: ".concat(valueOf) : new String("Skipping prefetch: "));
    }
}
