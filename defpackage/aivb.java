package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aivb implements aioa, ypd {
    public volatile float a;
    public boolean b;
    private final aaoz c;
    private final Set d = Collections.newSetFromMap(new ConcurrentHashMap());

    public aivb(aaoz aaozVar) {
        this.c = aaozVar;
    }

    public final void a(aiva aivaVar) {
        if (aivaVar != null) {
            this.d.add(aivaVar);
        }
    }

    public final void b(aeqq aeqqVar) {
        float f;
        FormatStreamModel f2 = aeqqVar.f();
        if (f2 == null) {
            return;
        }
        int i = f2.i();
        int d = f2.d();
        if (i < 0 || d < 0) {
            i = 1280;
            d = 720;
        }
        int V = f2.V();
        atyi atyiVar = this.c.get().c;
        boolean z = true;
        float f3 = 0.0f;
        if ((atyiVar.c & 1) != 0) {
            awaz awazVar = atyiVar.v;
            if (awazVar == null) {
                awazVar = awaz.a;
            }
            f = awazVar.i;
        } else {
            f = 0.0f;
        }
        if (V != 3 && V != 4 && V != 5) {
            z = false;
        }
        this.b = z;
        if (z && f != 0.0f) {
            i = (int) (d * f);
        }
        if (d > 0 && i > 0) {
            f3 = i / d;
        }
        this.a = f3;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((aiva) it.next()).d(i, d);
        }
    }

    public final void c(aiva aivaVar) {
        if (aivaVar != null) {
            this.d.remove(aivaVar);
        }
    }

    public final boolean d() {
        return this.a <= 1.01f && this.a > 0.0f;
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        return new ayqx[]{aiocVar.ae(aipq.h, aipq.i).h(ahbw.g(aiocVar.aC(), 1073741824L)).h(ahbw.e(1)).Y(new ayrs() { // from class: aiuz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aivb.this.b((aeqq) obj);
            }
        }, airw.e), aiocVar.ae(aipq.h, aipq.j).h(ahbw.g(aiocVar.aC(), 1073741824L)).h(ahbw.e(1)).Y(new ayrs() { // from class: aiuz
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aivb.this.b((aeqq) obj);
            }
        }, airw.e)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aeqq.class};
        }
        if (i == 0) {
            b((aeqq) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
