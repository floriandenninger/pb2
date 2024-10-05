package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.video.media.VideoMetaData;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vxw extends vxv implements vym {
    public final vyk c;
    public final vxp d;
    private final AtomicBoolean e;
    private final List f;
    private final VideoMetaData g;
    private vya h;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
    
        throw new java.lang.AssertionError("An existing thumbnail was already stored");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vxw(int[] r10, defpackage.vxo r11, defpackage.vyc r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vxw.<init>(int[], vxo, vyc, java.lang.String, int):void");
    }

    private final vya n() {
        if (!this.b) {
            while (this.d.hasNext()) {
                vya b = this.c.b(((Integer) this.d.next()).intValue());
                b.getClass();
                if (b.f() == 1) {
                    return b;
                }
                if (b.f() == 2) {
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        ((vyl) it.next()).I(b);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.vxv
    public final int a() {
        vya vyaVar = this.h;
        if (vyaVar != null) {
            return vyaVar.a;
        }
        return -1;
    }

    @Override // defpackage.vxv
    public final void b() {
        Iterator it;
        synchronized (this.e) {
            this.e.set(true);
            it = this.f.iterator();
        }
        while (it.hasNext()) {
            ((vyl) it.next()).q(this);
        }
    }

    @Override // defpackage.vxv
    public final void c(Exception exc) {
        synchronized (this.f) {
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                ((vyl) it.next()).G(exc);
            }
        }
    }

    @Override // defpackage.vxv
    public final int d() {
        vya vyaVar = this.h;
        if (vyaVar != null && vyaVar.f() == 2) {
            this.h = n();
        }
        vya vyaVar2 = this.h;
        if (vyaVar2 != null) {
            return vyaVar2.a;
        }
        return -1;
    }

    @Override // defpackage.vxv
    public final void e(int i, Bitmap bitmap) {
        vya vyaVar = this.h;
        boolean z = false;
        if (vyaVar != null && vyaVar.a == i) {
            z = true;
        }
        vcp.d(z);
        this.h.e(bitmap);
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((vyl) it.next()).I(this.h);
        }
    }

    @Override // defpackage.vxv
    public final boolean f(int i) {
        vya vyaVar = this.h;
        if (vyaVar != null) {
            return vyaVar.a == i;
        }
        vtv.e("Thumbnails are being extracted even though all requests are already completed");
        return false;
    }

    @Override // defpackage.vym
    public final vya g(long j, boolean z) {
        synchronized (this.c) {
            vya a = this.c.a(j, z);
            if (a == null) {
                return null;
            }
            return a.c();
        }
    }

    public final vya h() {
        vya c;
        synchronized (this.c) {
            Map.Entry firstEntry = this.c.a.firstEntry();
            c = (firstEntry != null ? (vya) firstEntry.getValue() : null).c();
        }
        return c;
    }

    @Override // defpackage.vym
    public final vya i(long j) {
        vya b;
        synchronized (this.c) {
            int g = this.g.g(j);
            if (g == -1 || (b = this.c.b(g)) == null) {
                return null;
            }
            return b.c();
        }
    }

    @Override // defpackage.vym
    public final void j() {
        this.b = true;
        synchronized (this.c) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((vya) it.next()).d();
            }
            this.c.d();
            this.h = null;
        }
        this.f.clear();
    }

    @Override // defpackage.vym
    public final void k(vyl vylVar) {
        boolean z;
        vylVar.getClass();
        synchronized (this.e) {
            this.f.add(vylVar);
            z = this.e.get();
        }
        if (z) {
            vylVar.q(this);
        }
    }

    @Override // defpackage.vym
    public final void l(vyl vylVar) {
        this.f.remove(vylVar);
    }

    @Override // defpackage.vym
    public final boolean m() {
        if (this.e.get()) {
            return true;
        }
        synchronized (this.c) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                if (((vya) it.next()).f() == 1) {
                    return false;
                }
            }
            synchronized (this.e) {
                this.e.set(true);
            }
            return true;
        }
    }

    public vxw(int[] iArr, vyc vycVar, String str, int i) {
        this(iArr, vxo.a, vycVar, str, i);
    }
}
