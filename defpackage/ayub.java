package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayub extends AtomicReference implements aypi {
    private static final long serialVersionUID = -5454794857847146511L;
    final ayuc a;

    public ayub(ayuc ayucVar) {
        this.a = ayucVar;
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void b(Throwable th) {
        this.a.g(th);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void se(ayqx ayqxVar) {
        ayrz.i(this, ayqxVar);
    }

    @Override // defpackage.aypi, defpackage.aypt
    public final void sh() {
        ayuc ayucVar = this.a;
        ayucVar.k = false;
        ayucVar.d();
    }
}
