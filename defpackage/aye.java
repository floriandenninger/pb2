package defpackage;

import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.media3.common.DrmInitData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aye implements ayr {
    public final ayb a;
    public final long b;
    public final List c;
    public final Set d;
    public final Set e;
    public int f;
    public axt g;
    public axt h;
    public Looper i;
    public Handler j;
    public byte[] k;
    volatile axw l;
    private final UUID n;
    private final azh o;
    private final HashMap p;
    private final int[] q;
    private final bfs r;
    private final ayd s;
    private ayy t;

    public aye(UUID uuid, azh azhVar, HashMap hashMap, int[] iArr, bfs bfsVar) {
        pse.c(uuid);
        pse.f(!plh.b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.n = uuid;
        this.o = azhVar;
        this.p = hashMap;
        this.q = iArr;
        this.r = bfsVar;
        this.a = new ayb();
        this.s = new ayd(this);
        this.c = new ArrayList();
        this.d = amkq.as();
        this.e = amkq.as();
        this.b = 300000L;
    }

    private static List h(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.c);
        for (int i = 0; i < drmInitData.c; i++) {
            DrmInitData.SchemeData a = drmInitData.a(i);
            if ((a.b(uuid) || (plh.c.equals(uuid) && a.b(plh.b))) && (a.d != null || z)) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    private final synchronized void i(Looper looper) {
        Looper looper2 = this.i;
        if (looper2 == null) {
            this.i = looper;
            this.j = new Handler(looper);
        } else {
            pse.g(looper2 == looper);
            pse.c(this.j);
        }
    }

    private final void j() {
        amxd listIterator = amsx.p(this.e).listIterator();
        while (listIterator.hasNext()) {
            ((ayh) listIterator.next()).p(null);
        }
    }

    private final void k() {
        amxd listIterator = amsx.p(this.d).listIterator();
        while (listIterator.hasNext()) {
            ((aya) listIterator.next()).a();
        }
    }

    private static boolean l(ayh ayhVar) {
        if (((axt) ayhVar).g != 1) {
            return false;
        }
        int i = pts.a;
        ayg c = ayhVar.c();
        pse.c(c);
        return c.getCause() instanceof ResourceBusyException;
    }

    private final axt m(List list, boolean z, bbx bbxVar) {
        pse.c(this.t);
        UUID uuid = this.n;
        ayy ayyVar = this.t;
        ayb aybVar = this.a;
        ayd aydVar = this.s;
        byte[] bArr = this.k;
        HashMap hashMap = this.p;
        azh azhVar = this.o;
        Looper looper = this.i;
        pse.c(looper);
        axt axtVar = new axt(uuid, ayyVar, aybVar, aydVar, list, z, z, bArr, hashMap, azhVar, looper, this.r);
        axtVar.o(bbxVar);
        axtVar.o(null);
        return axtVar;
    }

    private final axt n(List list, boolean z, bbx bbxVar, boolean z2) {
        axt m = m(list, z, bbxVar);
        if (l(m) && !this.e.isEmpty()) {
            j();
            o(m, bbxVar);
            m = m(list, z, bbxVar);
        }
        if (!l(m) || !z2 || this.d.isEmpty()) {
            return m;
        }
        k();
        if (!this.e.isEmpty()) {
            j();
        }
        o(m, bbxVar);
        return m(list, z, bbxVar);
    }

    private static final void o(ayh ayhVar, bbx bbxVar) {
        ayhVar.p(bbxVar);
        ayhVar.p(null);
    }

    @Override // defpackage.ayr
    public final int a(pms pmsVar) {
        ayy ayyVar = this.t;
        pse.c(ayyVar);
        int a = ayyVar.a();
        DrmInitData drmInitData = pmsVar.q;
        if (drmInitData == null) {
            if (pts.l(this.q, psz.b(pmsVar.n)) != -1) {
                return a;
            }
            return 0;
        }
        if (this.k == null) {
            if (h(drmInitData, this.n, true).isEmpty()) {
                if (drmInitData.c == 1 && drmInitData.a(0).b(plh.b)) {
                    String valueOf = String.valueOf(this.n);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
                    sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
                    sb.append(valueOf);
                    Log.w("DefaultDrmSessionMgr", sb.toString());
                }
                return 1;
            }
            String str = drmInitData.b;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : pts.a < 25)) {
                return 1;
            }
        }
        return a;
    }

    public final void b() {
        if (this.t != null && this.f == 0 && this.c.isEmpty() && this.d.isEmpty()) {
            ayy ayyVar = this.t;
            pse.c(ayyVar);
            ayyVar.f();
            this.t = null;
        }
    }

    @Override // defpackage.ayr
    public final void d() {
        int i = this.f - 1;
        this.f = i;
        if (i != 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.c);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((axt) arrayList.get(i2)).p(null);
        }
        k();
        b();
    }

    @Override // defpackage.ayr
    public final ayh e(Looper looper, bbx bbxVar, pms pmsVar) {
        pse.g(this.f > 0);
        i(looper);
        return f(looper, bbxVar, pmsVar, true);
    }

    public final ayh f(Looper looper, bbx bbxVar, pms pmsVar, boolean z) {
        if (this.l == null) {
            this.l = new axw(this, looper);
        }
        DrmInitData drmInitData = pmsVar.q;
        List list = null;
        if (drmInitData == null) {
            int b = psz.b(pmsVar.n);
            ayy ayyVar = this.t;
            pse.c(ayyVar);
            if ((ayyVar.a() == 2 && ayz.a) || pts.l(this.q, b) == -1 || ayyVar.a() == 1) {
                return null;
            }
            axt axtVar = this.g;
            if (axtVar == null) {
                axt n = n(amru.q(), true, null, z);
                this.c.add(n);
                this.g = n;
            } else {
                axtVar.o(null);
            }
            return this.g;
        }
        if (this.k == null) {
            list = h(drmInitData, this.n, false);
            if (list.isEmpty()) {
                axx axxVar = new axx(this.n);
                prh.j("DefaultDrmSessionMgr", "DRM error", axxVar);
                if (bbxVar != null) {
                    bbxVar.t(axxVar);
                }
                return new ayw(new ayg(axxVar, 6003));
            }
        }
        axt axtVar2 = this.h;
        if (axtVar2 == null) {
            axt n2 = n(list, false, bbxVar, z);
            this.h = n2;
            this.c.add(n2);
            return n2;
        }
        axtVar2.o(bbxVar);
        return axtVar2;
    }

    @Override // defpackage.ayr
    public final ayq g(Looper looper, bbx bbxVar, final pms pmsVar) {
        pse.g(this.f > 0);
        i(looper);
        final aya ayaVar = new aya(this, bbxVar, null);
        Handler handler = ayaVar.c.j;
        pse.c(handler);
        handler.post(new Runnable() { // from class: axz
            @Override // java.lang.Runnable
            public final void run() {
                aya ayaVar2 = aya.this;
                pms pmsVar2 = pmsVar;
                aye ayeVar = ayaVar2.c;
                if (ayeVar.f == 0 || ayaVar2.b) {
                    return;
                }
                Looper looper2 = ayeVar.i;
                pse.c(looper2);
                ayaVar2.a = ayeVar.f(looper2, ayaVar2.d, pmsVar2, false);
                ayaVar2.c.d.add(ayaVar2);
            }
        });
        return ayaVar;
    }

    @Override // defpackage.ayr
    public final void c() {
        ayy ayvVar;
        int i = this.f;
        this.f = i + 1;
        if (i != 0) {
            return;
        }
        if (this.t != null) {
            for (int i2 = 0; i2 < this.c.size(); i2++) {
                ((axt) this.c.get(i2)).o(null);
            }
            return;
        }
        UUID uuid = this.n;
        try {
            ayvVar = aze.p(uuid);
        } catch (azj unused) {
            String valueOf = String.valueOf(uuid);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 53);
            sb.append("Failed to instantiate a FrameworkMediaDrm for uuid: ");
            sb.append(valueOf);
            sb.append(".");
            Log.e("FrameworkMediaDrm", sb.toString());
            ayvVar = new ayv();
        }
        this.t = ayvVar;
        ayvVar.h(new axv(this));
    }
}
