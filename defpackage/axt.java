package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.decoder.CryptoConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axt implements ayh {
    public final List a;
    public final ayy b;
    public final bfs c;
    final azh d;
    final UUID e;
    final axr f;
    public int g;
    public byte[] h;
    public byte[] i;
    public final ayb j;
    public ztp k;
    public ztp l;
    private final boolean m;
    private final boolean n;
    private final HashMap o;
    private final psj p;
    private int q;
    private HandlerThread r;
    private axp s;
    private CryptoConfig t;
    private ayg u;
    private final ayd v;

    private final void q(byte[] bArr, int i, boolean z) {
        try {
            this.l = this.b.o(bArr, this.a, i, this.o);
            axp axpVar = this.s;
            int i2 = pts.a;
            ztp ztpVar = this.l;
            pse.c(ztpVar);
            axpVar.a(1, ztpVar, z);
        } catch (Exception e) {
            i(e, true);
        }
    }

    @Override // defpackage.ayh
    public final int a() {
        return this.g;
    }

    @Override // defpackage.ayh
    public final CryptoConfig b() {
        return this.t;
    }

    @Override // defpackage.ayh
    public final ayg c() {
        if (this.g == 1) {
            return this.u;
        }
        return null;
    }

    @Override // defpackage.ayh
    public final Map d() {
        byte[] bArr = this.h;
        if (bArr == null) {
            return null;
        }
        return this.b.c(bArr);
    }

    @Override // defpackage.ayh
    public final UUID e() {
        return this.e;
    }

    public final void f(psi psiVar) {
        Iterator it = this.p.b().iterator();
        while (it.hasNext()) {
            psiVar.a((bbx) it.next());
        }
    }

    public final void g(boolean z) {
        long min;
        if (this.n) {
            return;
        }
        byte[] bArr = (byte[]) pts.C(this.h);
        byte[] bArr2 = this.i;
        if (bArr2 == null) {
            q(bArr, 1, z);
            return;
        }
        if (this.g != 4) {
            try {
                this.b.g(this.h, bArr2);
            } catch (Exception e) {
                h(e, 1);
                return;
            }
        }
        if (plh.d.equals(this.e)) {
            Pair c = ays.c(this);
            pse.c(c);
            min = Math.min(((Long) c.first).longValue(), ((Long) c.second).longValue());
        } else {
            min = Long.MAX_VALUE;
        }
        if (min <= 60) {
            q(bArr, 2, z);
        } else if (min <= 0) {
            h(new azg(), 2);
        } else {
            this.g = 4;
            f(axo.b);
        }
    }

    public final void h(Exception exc, int i) {
        this.u = new ayg(exc, avn.b(exc, i));
        prh.j("DefaultDrmSession", "DRM session error", exc);
        f(new pie(exc, 1));
        if (this.g != 4) {
            this.g = 1;
        }
    }

    public final void i(Exception exc, boolean z) {
        if (!(exc instanceof NotProvisionedException)) {
            h(exc, true != z ? 2 : 1);
        } else {
            this.j.b(this);
        }
    }

    public final void j() {
        this.k = this.b.n();
        axp axpVar = this.s;
        int i = pts.a;
        ztp ztpVar = this.k;
        pse.c(ztpVar);
        axpVar.a(0, ztpVar, true);
    }

    public final boolean k() {
        int i = this.g;
        return i == 3 || i == 4;
    }

    public final boolean l() {
        if (k()) {
            return true;
        }
        try {
            byte[] k = this.b.k();
            this.h = k;
            this.t = this.b.b(k);
            this.g = 3;
            f(new axo(1));
            pse.c(this.h);
            return true;
        } catch (NotProvisionedException unused) {
            this.j.b(this);
            return false;
        } catch (Exception e) {
            h(e, 1);
            return false;
        }
    }

    @Override // defpackage.ayh
    public final boolean m() {
        return this.m;
    }

    @Override // defpackage.ayh
    public final boolean n(String str) {
        return this.b.j((byte[]) pse.d(this.h), str);
    }

    @Override // defpackage.ayh
    public final void o(bbx bbxVar) {
        pse.g(this.q >= 0);
        if (bbxVar != null) {
            this.p.c(bbxVar);
        }
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            pse.g(this.g == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new axp(this, this.r.getLooper());
            if (l()) {
                g(true);
            }
        } else if (bbxVar != null && k() && this.p.a(bbxVar) == 1) {
            bbxVar.s(this.g);
        }
        ayd aydVar = this.v;
        aydVar.a.e.remove(this);
        Handler handler = aydVar.a.j;
        pse.c(handler);
        handler.removeCallbacksAndMessages(this);
    }

    @Override // defpackage.ayh
    public final void p(bbx bbxVar) {
        pse.g(this.q > 0);
        int i = this.q - 1;
        this.q = i;
        if (i == 0) {
            this.g = 0;
            axr axrVar = this.f;
            int i2 = pts.a;
            axrVar.removeCallbacksAndMessages(null);
            this.s.b();
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.l = null;
            this.k = null;
            byte[] bArr = this.h;
            if (bArr != null) {
                this.b.d(bArr);
                this.h = null;
            }
        }
        if (bbxVar != null) {
            this.p.d(bbxVar);
            if (this.p.a(bbxVar) == 0) {
                bbxVar.u();
            }
        }
        ayd aydVar = this.v;
        int i3 = this.q;
        if (i3 == 1) {
            aye ayeVar = aydVar.a;
            if (ayeVar.f > 0) {
                ayeVar.e.add(this);
                Handler handler = aydVar.a.j;
                pse.c(handler);
                handler.postAtTime(new Runnable() { // from class: ayc
                    @Override // java.lang.Runnable
                    public final void run() {
                        axt.this.p(null);
                    }
                }, this, SystemClock.uptimeMillis() + aydVar.a.b);
            }
        } else if (i3 == 0) {
            aydVar.a.c.remove(this);
            aye ayeVar2 = aydVar.a;
            if (ayeVar2.g == this) {
                ayeVar2.g = null;
            }
            if (ayeVar2.h == this) {
                ayeVar2.h = null;
            }
            ayb aybVar = ayeVar2.a;
            aybVar.a.remove(this);
            if (aybVar.b == this) {
                aybVar.b = null;
                if (!aybVar.a.isEmpty()) {
                    aybVar.b = (axt) aybVar.a.iterator().next();
                    aybVar.b.j();
                }
            }
            Handler handler2 = aydVar.a.j;
            pse.c(handler2);
            handler2.removeCallbacksAndMessages(this);
            aydVar.a.e.remove(this);
        }
        aydVar.a.b();
    }

    public axt(UUID uuid, ayy ayyVar, ayb aybVar, ayd aydVar, List list, boolean z, boolean z2, byte[] bArr, HashMap hashMap, azh azhVar, Looper looper, bfs bfsVar) {
        this.e = uuid;
        this.j = aybVar;
        this.v = aydVar;
        this.b = ayyVar;
        this.m = z;
        this.n = z2;
        if (bArr != null) {
            this.i = bArr;
            this.a = null;
        } else {
            pse.c(list);
            this.a = Collections.unmodifiableList(list);
        }
        this.o = hashMap;
        this.d = azhVar;
        this.p = new psj();
        this.c = bfsVar;
        this.g = 2;
        this.f = new axr(this, looper);
    }
}
