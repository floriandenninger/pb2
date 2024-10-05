package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gqm implements anhh {
    private final zaw a;
    private final WeakReference b;

    public gqm(aahd aahdVar, zaw zawVar) {
        this.b = new WeakReference(aahdVar);
        this.a = zawVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        aahd aahdVar;
        armb armbVar = (armb) obj;
        if (armbVar == null || (aahdVar = (aahd) this.b.get()) == null) {
            return;
        }
        if ((armbVar.b & 4) != 0) {
            arlj arljVar = armbVar.f;
            if (arljVar == null) {
                arljVar = arlj.a;
            }
            if ((arljVar.b & 32) != 0) {
                apxf apxfVar = arljVar.f;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.a(apxfVar);
            }
        }
        for (int i = 0; i < armbVar.e.size(); i++) {
            aahdVar.a((apxf) armbVar.e.get(i));
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        zga.d("Error creating post", th);
        this.a.e(th);
    }
}
