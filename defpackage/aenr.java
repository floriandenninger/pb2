package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.youtube.libraries.bandwidth.BandwidthSampleGenerator;
import com.youtube.libraries.bandwidth.CompletionEvent;
import com.youtube.libraries.bandwidth.RequestType;
import com.youtube.libraries.bandwidth.ResponseEvent;
import com.youtube.libraries.bandwidth.TransferEvent;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aenr implements aenl {
    public final aenv a;
    public apks b;
    public volatile ByteBuffer c;
    public PlayerConfigModel f;
    private final aaea h;
    private final aeot i;
    private final ScheduledExecutorService j;
    private final axpg k;
    private final axpg l;
    private final axpg m;
    private volatile long p;
    private long s;
    private long t;
    private int u;
    private volatile boolean q = true;
    public volatile boolean d = true;
    private final AtomicReference r = new AtomicReference(aeny.u);
    public final AtomicReference e = new AtomicReference(aeny.u);
    private int v = 0;
    private volatile long o = -1;
    private final bew g = new bew();
    private final azrh n = azrh.aN(ByteBuffer.allocateDirect(0));

    public aenr(PlayerConfigModel playerConfigModel, aenv aenvVar, aeot aeotVar, aaea aaeaVar, ScheduledExecutorService scheduledExecutorService, axpg axpgVar, axpg axpgVar2, axpg axpgVar3) {
        this.f = playerConfigModel;
        this.h = aaeaVar;
        this.a = aenvVar;
        this.i = aeotVar;
        this.j = scheduledExecutorService;
        this.k = axpgVar;
        this.l = axpgVar2;
        this.m = axpgVar3;
    }

    private final Class q() {
        int bf = this.f.bf(2) - 1;
        return bf != 2 ? bf != 3 ? bf != 4 ? bf != 5 ? aens.class : aeoh.class : aenn.class : aenw.class : aeoa.class;
    }

    private final void r(PlayerConfigModel playerConfigModel) {
        aens aensVar = new aens(playerConfigModel.be(), playerConfigModel.bd());
        aenv aenvVar = this.a;
        if (aenvVar != null) {
            j(aenvVar.a(), aensVar, false);
        }
        this.r.set(aensVar);
    }

    private final void s(int i, long j, long j2) {
        this.g.b(i, j, j2);
    }

    private final void t(aeny aenyVar, boolean z) {
        float b = aenyVar.b();
        if (z) {
            this.p = Float.isNaN(b) ? -1L : b;
            return;
        }
        if (aenyVar.i() && b == -1.0f) {
            r(this.f);
        }
        this.o = Float.isNaN(b) ? -1L : b;
    }

    @Override // defpackage.att
    public final synchronized void a(ate ateVar, ath athVar, boolean z, int i) {
        BandwidthSampleGenerator a;
        long j = i;
        this.s += j;
        aeny aenyVar = (aeny) this.r.get();
        String queryParameter = athVar.a.getQueryParameter("cpn");
        if (!aenyVar.i() || queryParameter == null || (a = ((aeoh) aenyVar).a(queryParameter)) == null) {
            return;
        }
        try {
            if (athVar.a.getQueryParameter("rn") == null) {
                u(14);
            } else {
                a.onTransfer(new TransferEvent(Integer.parseInt(r9), ((float) SystemClock.elapsedRealtime()) / 1000.0f, j));
            }
        } catch (NumberFormatException unused) {
            u(14);
        }
    }

    @Override // defpackage.att
    public final synchronized void b(ate ateVar, ath athVar, boolean z) {
        BandwidthSampleGenerator a;
        pse.g(this.u > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = (int) (elapsedRealtime - this.t);
        aeny aenyVar = (aeny) this.r.get();
        String queryParameter = athVar.a.getQueryParameter("cpn");
        if (aenyVar.i() && queryParameter != null && (a = ((aeoh) aenyVar).a(queryParameter)) != null) {
            try {
                if (athVar.a.getQueryParameter("rn") == null) {
                    u(14);
                    return;
                }
                a.onCompletion(new CompletionEvent(Integer.parseInt(r13), ((float) elapsedRealtime) / 1000.0f));
            } catch (NumberFormatException unused) {
                u(14);
            }
        }
        if (i > 0) {
            long j = this.s;
            if (j >= this.v) {
                long j2 = (j * 8000) / i;
                aeny aenyVar2 = (aeny) this.e.get();
                if (!aenyVar.i()) {
                    aenyVar.f((float) j2);
                }
                t(aenyVar, false);
                aenyVar2.f((float) j2);
                t(aenyVar2, true);
                s(i, this.s, this.o);
                aenv aenvVar = this.a;
                if (aenvVar != null) {
                    aenvVar.b(this.s, j2);
                }
            }
        }
        int i2 = this.u - 1;
        this.u = i2;
        if (i2 > 0) {
            this.t = elapsedRealtime;
        }
        this.s = 0L;
    }

    @Override // defpackage.att
    public final void c(ate ateVar, ath athVar, boolean z) {
    }

    @Override // defpackage.att
    public final synchronized void d(ate ateVar, ath athVar, boolean z) {
        RequestType requestType;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.u;
        if (i == 0) {
            this.t = elapsedRealtime;
            i = 0;
        }
        this.u = i + 1;
        String queryParameter = athVar.a.getQueryParameter("cpn");
        aeny aenyVar = (aeny) this.r.get();
        if (!aenyVar.i() || queryParameter == null) {
            return;
        }
        BandwidthSampleGenerator a = ((aeoh) aenyVar).a(queryParameter);
        Object obj = athVar.k;
        if (true != (obj instanceof aehx)) {
            obj = null;
        }
        Long l = obj != null ? ((aehx) obj).b : null;
        long longValue = l != null ? l.longValue() : 0L;
        Long l2 = obj != null ? ((aehx) obj).c : null;
        long longValue2 = l2 != null ? l2.longValue() : 0L;
        if (a != null) {
            String queryParameter2 = athVar.a.getQueryParameter("mime");
            String path = athVar.a.getPath();
            String queryParameter3 = athVar.a.getQueryParameter("rn");
            if (path != null && queryParameter3 != null && (path.startsWith("/initplayback") || queryParameter2 != null)) {
                if (path.startsWith("/initplayback")) {
                    requestType = RequestType.ONESIE;
                } else if (queryParameter2 == null || !queryParameter2.contains("audio")) {
                    requestType = RequestType.VIDEO;
                } else {
                    requestType = RequestType.AUDIO;
                }
                RequestType requestType2 = requestType;
                try {
                    int parseInt = Integer.parseInt(queryParameter3);
                    long j = athVar.h;
                    if (j == -1) {
                        j = ((((float) longValue2) / 8.0f) * ((float) longValue)) / 1000.0f;
                    }
                    a.onResponse(new ResponseEvent(parseInt, ((float) elapsedRealtime) / 1000.0f, requestType2, j, ((float) longValue) / 1000.0f));
                    return;
                } catch (NumberFormatException unused) {
                    u(14);
                    return;
                }
            }
            u(14);
            return;
        }
        r(this.f);
    }

    @Override // defpackage.bey
    public final long e() {
        return this.o;
    }

    @Override // defpackage.bey
    public final void f(Handler handler, bex bexVar) {
        this.g.a(handler, bexVar);
    }

    @Override // defpackage.bey
    public final void g(bex bexVar) {
        this.g.c(bexVar);
    }

    @Override // defpackage.aenl
    public final long h() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final aeny i(boolean z, PlayerConfigModel playerConfigModel) {
        int bf = playerConfigModel.bf(2) - 1;
        if (bf == 2) {
            return new aeoa(playerConfigModel.be(), playerConfigModel.bd());
        }
        if (bf != 3) {
            if (bf == 4) {
                return new aenn(playerConfigModel.be(), playerConfigModel.bd());
            }
            if (bf == 5) {
                apks apksVar = this.b;
                if (playerConfigModel.i && apksVar != null) {
                    ByteBuffer byteBuffer = this.c;
                    if ((apksVar.b & 16) != 0 && byteBuffer != null && byteBuffer.capacity() != 0) {
                        apkt apktVar = apksVar.e;
                        if (apktVar == null) {
                            apktVar = apkt.a;
                        }
                        if ((apktVar.b & 1) != 0) {
                            apkt apktVar2 = apksVar.e;
                            if (apktVar2 == null) {
                                apktVar2 = apkt.a;
                            }
                            aeoh aeohVar = new aeoh(this.h, (affe) this.l.get(), (acpl) this.k.get(), byteBuffer, apktVar2.c, this.i);
                            if (aeohVar.c()) {
                                return aeohVar;
                            }
                        }
                    }
                    u(11);
                }
            }
            return new aens(playerConfigModel.be(), playerConfigModel.bd());
        }
        aenw k = aenw.k(this.h, z);
        if (k != null) {
            return k;
        }
        return new aens(playerConfigModel.be(), playerConfigModel.bd());
    }

    public final void j(List list, aeny aenyVar, boolean z) {
        if (aenyVar.i()) {
            aenyVar.g();
            t(aenyVar, z);
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                aenyVar.f((float) ((Long) it.next()).longValue());
            }
            t(aenyVar, z);
        }
    }

    @Override // defpackage.aenl
    public final synchronized void k() {
        aeny aenyVar = (aeny) this.r.get();
        if (aenyVar != null) {
            aenyVar.h();
        }
        ((aeny) this.e.get()).h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(PlayerConfigModel playerConfigModel) {
        aeny aenyVar = (aeny) this.r.get();
        boolean z = q() == aeoh.class && !playerConfigModel.i;
        if (aenyVar == null || !q().isInstance(aenyVar) || z) {
            aeny i = i(false, playerConfigModel);
            aenv aenvVar = this.a;
            if (aenvVar != null) {
                j(aenvVar.a(), i, false);
            }
            this.r.set(i);
        }
    }

    @Override // defpackage.aenl
    public final synchronized void m(long j) {
        l(this.f);
        aeny aenyVar = (aeny) this.r.get();
        aeny aenyVar2 = (aeny) this.e.get();
        if (!aenyVar.i()) {
            aenyVar.f((float) j);
            t(aenyVar, false);
        } else {
            this.o = j;
        }
        aenyVar2.f((float) j);
        t(aenyVar2, true);
        aenv aenvVar = this.a;
        if (aenvVar != null) {
            aenvVar.b(1L, j);
        }
        s(0, 0L, this.o);
    }

    @Override // defpackage.aenl
    public final void n() {
        aypy.m(this.h.a.Y(afly.b).B(), this.n, nxd.t).ab(azre.b(this.j)).ax(new ayrs() { // from class: aenp
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aenr aenrVar = aenr.this;
                aenq aenqVar = (aenq) obj;
                apks apksVar = aenqVar.a;
                ByteBuffer byteBuffer = aenqVar.b;
                aenrVar.d = true;
                apks apksVar2 = aenrVar.b;
                if (apksVar2 == null || !apksVar2.equals(apksVar)) {
                    aenrVar.b = apksVar;
                    aeny aenyVar = aeny.u;
                    if ((aenrVar.b.b & 2) != 0) {
                        aenyVar = aenrVar.i(true, aenrVar.f);
                        aenv aenvVar = aenrVar.a;
                        if (aenvVar != null) {
                            aenrVar.j(aenvVar.a(), aenyVar, true);
                        }
                    }
                    aenrVar.e.set(aenyVar);
                }
                if (aenrVar.f.bf(1) != 6 || byteBuffer.capacity() == 0) {
                    return;
                }
                if (aenrVar.c == null || !byteBuffer.equals(aenrVar.c)) {
                    aenrVar.c = byteBuffer;
                    aenrVar.l(aenrVar.f);
                }
            }
        });
        if (this.f.bf(1) == 6) {
            aeof aeofVar = (aeof) this.m.get();
            atcl atclVar = this.h.a().i;
            if (atclVar == null) {
                atclVar = atcl.a;
            }
            apks apksVar = atclVar.e;
            if (apksVar == null) {
                apksVar = apks.a;
            }
            apkt apktVar = apksVar.e;
            if (apktVar == null) {
                apktVar = apkt.a;
            }
            aeofVar.a(apktVar.c, this.n);
        }
    }

    @Override // defpackage.aenl
    public final void o(PlayerConfigModel playerConfigModel) {
        this.f = playerConfigModel;
        this.v = playerConfigModel.l();
        PlayerConfigModel playerConfigModel2 = this.f;
        playerConfigModel2.i = true;
        l(playerConfigModel2);
        this.q = true;
    }

    @Override // defpackage.aenl
    public final int p() {
        return ((aeny) this.r.get()).j();
    }

    private final void u(int i) {
        if (i == 14) {
            if (this.q) {
                aeoh.d(14, (acpl) this.k.get());
                this.q = false;
                return;
            }
            return;
        }
        if (i == 11 && this.d) {
            aeoh.d(11, (acpl) this.k.get());
            this.d = false;
        }
    }
}
