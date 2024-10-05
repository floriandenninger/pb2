package defpackage;

import android.media.MediaDrm;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.media3.common.DrmInitData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class piq implements ayr {
    public final List a;
    public int b;
    public byte[] c;
    public int d;
    public int e = -1;
    public boolean f = true;
    public long g;
    protected volatile pio h;
    public volatile pim i;
    private final UUID j;
    private final HashMap k;
    private final pik l;
    private Looper n;
    private boolean o;
    private ayy p;
    private final aeqm q;

    public piq(UUID uuid, aeqm aeqmVar, HashMap hashMap, pik pikVar) {
        pse.c(uuid);
        this.j = uuid;
        this.q = aeqmVar;
        this.k = hashMap;
        this.l = pikVar;
        this.d = 3;
        this.o = false;
        this.b = 0;
        this.a = new ArrayList();
    }

    private static DrmInitData.SchemeData j(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.c);
        for (int i = 0; i < drmInitData.c; i++) {
            DrmInitData.SchemeData a = drmInitData.a(i);
            if ((a.b(uuid) || (plh.c.equals(uuid) && a.b(plh.b))) && (a.d != null || z)) {
                arrayList.add(a);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (plh.d.equals(uuid)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i2);
                int b = schemeData.a() ? jf.b(schemeData.d) : -1;
                if (pts.a < 23 && b == 0) {
                    return schemeData;
                }
                if (pts.a >= 23 && b == 1) {
                    return schemeData;
                }
            }
        }
        return (DrmInitData.SchemeData) arrayList.get(0);
    }

    @Override // defpackage.ayr
    public final int a(pms pmsVar) {
        DrmInitData drmInitData = pmsVar.q;
        if (drmInitData == null) {
            return 0;
        }
        if (this.c != null) {
            return 2;
        }
        if (j(drmInitData, this.j, true) == null) {
            if (drmInitData.c == 1 && drmInitData.a(0).b(plh.b)) {
                String valueOf = String.valueOf(this.j);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 72);
                sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
                sb.append(valueOf);
                Log.w("YTDrmSessionMgr", sb.toString());
            }
        }
        String str = drmInitData.b;
        if (str == null || "cenc".equals(str)) {
            return 2;
        }
        return (("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) && pts.a < 24) ? 1 : 2;
    }

    protected final pij b(byte[] bArr, String str, pia piaVar, pij pijVar) {
        pse.c(this.p);
        return new pij(this.j, this.p, bArr, str, this.b, this.c, this.k, this.q, this.h, this.n, this.l, this.g, this.d, this.e, piaVar, pijVar, new pin(this, null), null);
    }

    @Override // defpackage.ayr
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.ayr
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.ayr
    public final ayh e(Looper looper, bbx bbxVar, pms pmsVar) {
        String str;
        byte[] bArr;
        pij pijVar;
        pij b;
        pij pijVar2;
        pia piaVar;
        if (pmsVar.q == null) {
            return null;
        }
        if (this.f || this.a.isEmpty()) {
            Looper looper2 = this.n;
            pse.g(looper2 == null || looper2 == looper);
            if (this.a.isEmpty()) {
                this.n = looper;
                if (this.h == null) {
                    this.h = new pio(this, looper);
                }
                if (this.i == null) {
                    this.i = new pim(this, looper);
                }
            }
            if (this.c == null) {
                DrmInitData.SchemeData j = j(pmsVar.q, this.j, false);
                if (j == null) {
                    pip pipVar = new pip(this.j);
                    if (bbxVar != null) {
                        bbxVar.t(pipVar);
                    }
                    return new ayw(new ayg(pipVar, 6003));
                }
                bArr = j.d;
                str = j.c;
            } else {
                str = null;
                bArr = null;
            }
            pia i = aear.i(bArr);
            if (i != null) {
                this.q.d = Integer.valueOf(i.b);
            } else {
                this.q.d = null;
            }
            Iterator it = this.a.iterator();
            pij pijVar3 = null;
            while (true) {
                if (!it.hasNext()) {
                    pijVar = null;
                    break;
                }
                pijVar = (pij) it.next();
                if (Arrays.equals(pijVar.b, bArr)) {
                    break;
                }
                if (pijVar.j == 4 && i != null && (piaVar = pijVar.f) != null && i.b != -1 && piaVar.b != -1 && Arrays.equals(i.a, piaVar.a) && Math.abs(i.b - piaVar.b) <= 1) {
                    pijVar3 = pijVar;
                }
            }
            if (pijVar != null) {
                b = pijVar.f();
            } else if (pijVar3 == null || !this.o) {
                b = b(bArr, str, i, null);
                this.a.add(b);
            } else {
                pse.c(i);
                pij f = pijVar3.f();
                Iterator it2 = this.a.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        pijVar2 = null;
                        break;
                    }
                    pijVar2 = (pij) it2.next();
                    if (pijVar2 != f && pijVar2 != pijVar3 && pijVar2.f() == f) {
                        break;
                    }
                }
                if (pijVar2 != null) {
                    pijVar2.p(null);
                    this.a.remove(pijVar2);
                }
                pij f2 = pijVar3.f();
                pia piaVar2 = pijVar3.f;
                Integer valueOf = piaVar2 == null ? null : Integer.valueOf(piaVar2.b);
                if (valueOf == null) {
                    Log.w("YTDrmSessionMgr", "AcquireSession: No crypto period index available for overlap session!");
                }
                if (i.b > valueOf.intValue()) {
                    pij b2 = b(bArr, str, i, f2);
                    this.a.add(b2);
                    b2.o(null);
                }
                b = f2;
            }
            b.o(bbxVar);
            return b;
        }
        ayh ayhVar = (ayh) this.a.get(0);
        ayhVar.o(bbxVar);
        return ayhVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(pij pijVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pijVar);
        for (pij pijVar2 : this.a) {
            if (pijVar2.f() == pijVar) {
                arrayList.add(pijVar2);
                pijVar2.t(null);
            }
        }
        this.a.removeAll(arrayList);
        this.a.size();
    }

    @Override // defpackage.ayr
    public final /* synthetic */ ayq g(Looper looper, bbx bbxVar, pms pmsVar) {
        return ayq.e;
    }

    public final void h(ayy ayyVar) {
        pse.c(ayyVar);
        this.p = ayyVar;
        int i = pts.a;
        try {
            ayyVar.i("sessionSharing", "enable");
            this.o = true;
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append("failed to set sessionSharing:");
            sb.append(valueOf);
            Log.w("YTDrmSessionMgr", sb.toString());
            this.o = false;
        }
        ayyVar.h(new pil(this));
        if (pts.a >= 23) {
            final pin pinVar = new pin(this);
            if (pts.a < 23) {
                throw new UnsupportedOperationException();
            }
            ((aze) ayyVar).a.setOnExpirationUpdateListener(new MediaDrm.OnExpirationUpdateListener() { // from class: azb
                @Override // android.media.MediaDrm.OnExpirationUpdateListener
                public final void onExpirationUpdate(MediaDrm mediaDrm, byte[] bArr, long j) {
                    piq piqVar = pin.this.a;
                    if (piqVar.b == 0) {
                        piqVar.i.obtainMessage(0, bArr).sendToTarget();
                    }
                }
            }, (Handler) null);
        }
    }

    public final void i(int i, byte[] bArr) {
        pse.g(this.a.isEmpty());
        if (i == 1 || i == 3) {
            pse.c(bArr);
        }
        this.b = i;
        this.c = bArr;
    }
}
