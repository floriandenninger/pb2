package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class imp implements anhh {
    final /* synthetic */ ine a;
    final /* synthetic */ int b;
    final /* synthetic */ boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ imr e;

    public imp(imr imrVar, ine ineVar, int i, boolean z, boolean z2) {
        this.e = imrVar;
        this.a = ineVar;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (!this.e.d && optional.isPresent()) {
            long d = this.e.b.d();
            imr imrVar = this.e;
            long j = imrVar.a;
            apxf apxfVar = (apxf) optional.get();
            ine ineVar = this.a;
            int i = this.b;
            boolean z = this.c;
            imrVar.d(j, apxfVar, ineVar, 2, 1, i, z, z, this.d, d);
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        gfw.v(1, valueOf.length() != 0 ? "Skipping prefetch: ".concat(valueOf) : new String("Skipping prefetch: "));
    }
}
