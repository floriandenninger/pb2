package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cba implements Runnable {
    private final cbb a;

    public cba(cbb cbbVar) {
        this.a = cbbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        cbb cbbVar = this.a;
        ajbh.X().T(new Throwable[0]);
        cbbVar.b();
        synchronized (cbbVar.g) {
            if (cbbVar.h != null) {
                ajbh X = ajbh.X();
                String.format("Removing command %s", cbbVar.h);
                X.T(new Throwable[0]);
                if (((Intent) cbbVar.g.remove(0)).equals(cbbVar.h)) {
                    cbbVar.h = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            cdz cdzVar = cbbVar.j.a;
            cas casVar = cbbVar.f;
            synchronized (casVar.d) {
                z = !casVar.c.isEmpty();
            }
            if (!z && cbbVar.g.isEmpty()) {
                synchronized (cdzVar.b) {
                    z2 = !cdzVar.a.isEmpty();
                }
                if (!z2) {
                    ajbh.X().T(new Throwable[0]);
                    caz cazVar = cbbVar.i;
                    if (cazVar != null) {
                        cazVar.a();
                    }
                }
            }
            if (!cbbVar.g.isEmpty()) {
                cbbVar.e();
            }
        }
    }
}
