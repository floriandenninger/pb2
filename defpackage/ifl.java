package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ifl implements aaha {
    private final hbb a;
    private final /* synthetic */ int b;

    public ifl(hbb hbbVar, int i) {
        this.b = i;
        this.a = hbbVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (this.b == 0) {
            amkq.E(apxfVar.pY(auyo.b));
            auyo auyoVar = (auyo) apxfVar.pX(auyo.b);
            int i = auyoVar.c;
            boolean z = false;
            if ((i & 2) != 0 && (i & 1) != 0) {
                z = true;
            }
            amkq.E(z);
            hbb hbbVar = this.a;
            String str = auyoVar.e;
            int be = aobq.be(auyoVar.d);
            int i2 = be != 0 ? be : 1;
            synchronized (hbbVar.e) {
                try {
                    if (i2 != 2) {
                        if (i2 == 3 && hbbVar.e.contains(str)) {
                            hbbVar.e.remove(str);
                            hbbVar.c = null;
                        }
                    } else if (!hbbVar.e.contains(str)) {
                        hbbVar.e.add(str);
                        hbbVar.c = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        amkq.E(apxfVar.pY(auyj.b));
        aony aonyVar = ((auyj) apxfVar.pX(auyj.b)).c;
        hbb hbbVar2 = this.a;
        if (aonyVar.equals(hbbVar2.d)) {
            return;
        }
        synchronized (hbbVar2.a) {
            hbbVar2.a.clear();
        }
        hbbVar2.d = amru.o(aonyVar);
        hbbVar2.c = null;
    }
}
