package defpackage;

import android.media.NotProvisionedException;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.decoder.CryptoConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pij implements ayh {
    public final ayy a;
    public final byte[] b;
    public final int c;
    public final pik d;
    public final int e;
    public final pia f;
    final azh g;
    final UUID h;
    final pii i;
    public byte[] k;
    public byte[] l;
    public final int m;
    private final String n;
    private final HashMap o;
    private final pij q;
    private int r;
    private HandlerThread s;
    private pih t;
    private CryptoConfig u;
    private ayg v;
    private final pio w;
    private final long x;
    private final pin y;
    public int j = 2;
    private final psj p = new psj();

    public pij(UUID uuid, ayy ayyVar, byte[] bArr, String str, int i, byte[] bArr2, HashMap hashMap, azh azhVar, pio pioVar, Looper looper, pik pikVar, long j, int i2, int i3, pia piaVar, pij pijVar, pin pinVar, byte[] bArr3) {
        String str2;
        this.h = uuid;
        this.a = ayyVar;
        this.c = i;
        this.l = bArr2;
        this.o = hashMap;
        this.g = azhVar;
        this.d = pikVar;
        this.f = piaVar;
        this.q = pijVar;
        this.y = pinVar;
        this.w = pioVar;
        this.x = j;
        this.e = i2;
        this.m = i3;
        this.i = new pii(this, looper);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.s = handlerThread;
        handlerThread.start();
        this.t = new pih(this, this.s.getLooper());
        if (bArr2 == null) {
            this.b = bArr;
            str2 = str;
        } else {
            str2 = null;
            this.b = null;
        }
        this.n = str2;
    }

    private final void u(int i, boolean z) {
        byte[] bArr;
        if (i == 3) {
            bArr = this.l;
        } else {
            bArr = this.k;
        }
        try {
            this.d.b();
            ztp o = this.a.o(bArr, this.l == null ? amru.r(new DrmInitData.SchemeData(plh.d, this.n, this.b)) : null, i, this.o);
            this.d.a();
            this.d.d();
            this.t.a(1, o, z).sendToTarget();
        } catch (Exception e) {
            j(e, true);
        }
    }

    private final boolean v() {
        try {
            this.a.g(this.k, this.l);
            return true;
        } catch (Exception e) {
            Log.e("YTDrmSession", "Error trying to restore Widevine keys.", e);
            i(e, 1);
            return false;
        }
    }

    @Override // defpackage.ayh
    public final int a() {
        return this.j;
    }

    @Override // defpackage.ayh
    public final CryptoConfig b() {
        return this.u;
    }

    @Override // defpackage.ayh
    public final ayg c() {
        if (this.j == 1) {
            return this.v;
        }
        return null;
    }

    @Override // defpackage.ayh
    public final Map d() {
        byte[] bArr = this.k;
        if (bArr == null) {
            return null;
        }
        return this.a.c(bArr);
    }

    @Override // defpackage.ayh
    public final UUID e() {
        return this.h;
    }

    public final pij f() {
        pij pijVar = this.q;
        return pijVar == null ? this : pijVar;
    }

    public final void g(psi psiVar) {
        Iterator it = this.p.b().iterator();
        while (it.hasNext()) {
            psiVar.a((bbx) it.next());
        }
    }

    public final void h(boolean z) {
        long min;
        int i = this.c;
        if (i != 0 && i != 1) {
            if (i != 2) {
                u(3, z);
                return;
            } else if (this.l == null) {
                u(2, z);
                return;
            } else {
                if (v()) {
                    u(2, z);
                    return;
                }
                return;
            }
        }
        if (this.l == null) {
            u(1, z);
            return;
        }
        if (this.j == 4 || v()) {
            if (plh.d.equals(this.h)) {
                Pair c = ays.c(this);
                min = Math.min(((Long) c.first).longValue(), ((Long) c.second).longValue());
            } else {
                min = Long.MAX_VALUE;
            }
            if (this.c == 0 && min <= 60) {
                u(2, z);
            } else if (min <= 0) {
                i(new azg(), 2);
            } else {
                this.j = 4;
                g(axo.g);
            }
            if (this.c != 0 || this.l == null || pts.a >= 23) {
                return;
            }
            this.d.i();
        }
    }

    public final void i(Exception exc, int i) {
        this.v = new ayg(exc, exc instanceof pip ? 6003 : avn.b(exc, i));
        g(new pie(exc, 0));
        if (this.j != 4) {
            this.j = 1;
        }
    }

    public final void j(Exception exc, boolean z) {
        if (!(exc instanceof NotProvisionedException)) {
            i(exc, true != z ? 2 : 1);
        } else {
            l();
        }
    }

    public final void k(Exception exc, boolean z) {
        i(exc, true != z ? 3 : 1);
    }

    public final void l() {
        this.t.a(0, this.a.n(), true).sendToTarget();
    }

    @Override // defpackage.ayh
    public final boolean m() {
        return false;
    }

    @Override // defpackage.ayh
    public final boolean n(String str) {
        return this.a.j(this.k, str);
    }

    @Override // defpackage.ayh
    public final void o(bbx bbxVar) {
        if (bbxVar != null) {
            this.p.c(bbxVar);
        }
        int i = this.r + 1;
        this.r = i;
        if (i != 1) {
            if (bbxVar != null) {
                bbxVar.s(this.j);
            }
        } else if (this.j != 1 && s(true)) {
            if (this.q == null) {
                h(true);
            } else {
                this.t.postDelayed(new Runnable() { // from class: pif
                    @Override // java.lang.Runnable
                    public final void run() {
                        pij.this.h(true);
                    }
                }, new Random().nextInt(this.f != null ? r5.c * 500 : 60000));
            }
        }
    }

    @Override // defpackage.ayh
    public final void p(bbx bbxVar) {
        if (t(bbxVar)) {
            this.y.a.f(this);
        }
    }

    public final boolean q(byte[] bArr) {
        return Arrays.equals(this.k, bArr);
    }

    public final boolean r() {
        int i = this.j;
        return i == 3 || i == 4;
    }

    public final boolean s(boolean z) {
        if (r()) {
            return true;
        }
        try {
            this.d.f();
            this.k = this.a.k();
            this.d.e();
            this.u = this.a.b(this.k);
            this.j = 3;
            return true;
        } catch (NotProvisionedException e) {
            if (z) {
                l();
                return false;
            }
            i(e, 1);
            return false;
        } catch (Exception e2) {
            i(e2, 1);
            return false;
        }
    }

    public final boolean t(bbx bbxVar) {
        g(axo.h);
        if (bbxVar != null) {
            this.p.d(bbxVar);
        }
        int i = this.r - 1;
        this.r = i;
        if (i != 0) {
            return false;
        }
        this.j = 0;
        this.i.removeCallbacksAndMessages(null);
        this.t.removeCallbacksAndMessages(null);
        this.t = null;
        this.s.quit();
        this.s = null;
        this.u = null;
        this.v = null;
        final byte[] bArr = this.k;
        if (bArr == null) {
            return true;
        }
        this.k = null;
        pio pioVar = this.w;
        if (pioVar == null || this.x <= 0) {
            this.a.d(bArr);
            return true;
        }
        pioVar.postDelayed(new Runnable() { // from class: pig
            @Override // java.lang.Runnable
            public final void run() {
                pij pijVar = pij.this;
                try {
                    pijVar.a.d(bArr);
                } catch (RuntimeException unused) {
                }
            }
        }, this.x);
        return true;
    }
}
