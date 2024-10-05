package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class emx implements Runnable {
    final /* synthetic */ emz a;
    private final /* synthetic */ int b;

    public emx(emz emzVar, int i) {
        this.b = i;
        this.a = emzVar;
    }

    public /* synthetic */ emx(emz emzVar, int i, byte[] bArr) {
        this.b = i;
        this.a = emzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            ((zfu) this.a.g.get()).a();
            return;
        }
        if (i == 1) {
            this.a.b();
            return;
        }
        if (i == 2) {
            long d = ((shf) this.a.h.get()).d();
            ((wza) this.a.i.get()).f();
            this.a.d.d();
            ypa ypaVar = (ypa) this.a.j.get();
            ypaVar.d(new xas(d));
            ypaVar.d(new xar());
            return;
        }
        atej atejVar = ((aadw) this.a.e.get()).b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        apdm apdmVar = atejVar.p;
        if (apdmVar == null) {
            apdmVar = apdm.a;
        }
        if (!apdmVar.d || apdmVar.e.size() == 0) {
            return;
        }
        ajoy ajoyVar = (ajoy) this.a.m.get();
        Iterator it = apdmVar.e.iterator();
        while (it.hasNext()) {
            ajoyVar.u((String) it.next());
        }
    }
}
