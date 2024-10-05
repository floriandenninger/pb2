package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pki implements azy {
    private final List a = new ArrayList();
    private final boolean b;
    private pkj c;
    private boolean d;
    private pkh e;

    public pki(boolean z) {
        this.b = z;
    }

    @Override // defpackage.azy
    public final int a() {
        pkh pkhVar = this.e;
        if (pkhVar != null) {
            throw pkhVar;
        }
        pkj pkjVar = this.c;
        if (pkjVar == null) {
            return -1;
        }
        return pkjVar.a();
    }

    @Override // defpackage.azy
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        pkj pkjVar = this.c;
        if (pkjVar == null) {
            return -1;
        }
        return pkjVar.b(bufferInfo);
    }

    @Override // defpackage.azy
    public final MediaFormat c() {
        pkj pkjVar = this.c;
        if (pkjVar == null) {
            return null;
        }
        return pkjVar.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void d(pkj pkjVar) {
        if (this.d) {
            pkjVar.h();
        } else {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((amnb) it.next()).a(pkjVar);
            }
        }
        this.c = pkjVar;
    }

    @Override // defpackage.azy
    public final ByteBuffer e(int i) {
        pkj pkjVar = this.c;
        if (pkjVar == null) {
            return null;
        }
        return pkjVar.e(i);
    }

    @Override // defpackage.azy
    public final ByteBuffer f(int i) {
        pkj pkjVar = this.c;
        if (pkjVar == null) {
            return null;
        }
        return pkjVar.f(i);
    }

    @Override // defpackage.azy
    public final void g() {
        pkj pkjVar = this.c;
        if (pkjVar == null) {
            return;
        }
        pkjVar.g();
    }

    @Override // defpackage.azy
    public final synchronized void h() {
        pkj pkjVar = this.c;
        if (pkjVar == null) {
            this.d = true;
        } else {
            pkjVar.h();
        }
    }

    @Override // defpackage.azy
    public final void i(int i, long j) {
        afki.a(this.c);
        this.c.i(i, j);
    }

    @Override // defpackage.azy
    public final synchronized void j(final Surface surface) {
        pkj pkjVar = this.c;
        if (pkjVar == null) {
            this.a.add(new amnb() { // from class: pkg
                @Override // defpackage.amnb
                public final void a(Object obj) {
                    ((pkj) obj).j(surface);
                }
            });
        } else {
            pkjVar.j(surface);
        }
    }

    @Override // defpackage.azy
    public final synchronized void k(final Bundle bundle) {
        pkj pkjVar = this.c;
        if (pkjVar == null) {
            this.a.add(new amnb() { // from class: pkf
                @Override // defpackage.amnb
                public final void a(Object obj) {
                    ((pkj) obj).k(bundle);
                }
            });
        } else {
            pkjVar.k(bundle);
        }
    }

    @Override // defpackage.azy
    public final synchronized void l(final int i) {
        pkj pkjVar = this.c;
        if (pkjVar == null) {
            this.a.add(new amnb() { // from class: pke
                @Override // defpackage.amnb
                public final void a(Object obj) {
                    ((pkj) obj).l(i);
                }
            });
        } else {
            pkjVar.l(i);
        }
    }

    @Override // defpackage.azy
    public final boolean m() {
        return this.b;
    }

    @Override // defpackage.azy
    public final void n(int i, int i2, long j, int i3) {
        afki.a(this.c);
        this.c.n(i, i2, j, i3);
    }

    @Override // defpackage.azy
    public final void o(int i, ass assVar, long j) {
        afki.a(this.c);
        this.c.o(i, assVar, j);
    }

    @Override // defpackage.azy
    public final void p(int i) {
        afki.a(this.c);
        this.c.p(i);
    }

    public final void q(Throwable th, Surface surface) {
        this.e = new pkh(th, surface);
    }
}
