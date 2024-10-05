package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aege extends afja {
    public final amnv b;
    public ath c;
    public atr d;
    public final Map e;
    public aesa f;
    private final ysy g;
    private final PlayerConfigModel h;
    private final afhi i;
    private final shf j;
    private final ExecutorService k;
    private Exception l;
    private Uri m;
    private Future n;
    private final aegc o;
    private final boolean p;
    private final boolean q;
    private ammv r;
    private final afhs s;

    public aege(amnv amnvVar, atr atrVar, ysy ysyVar, PlayerConfigModel playerConfigModel, afhs afhsVar, afhi afhiVar, shf shfVar, ExecutorService executorService, aesa aesaVar, boolean z, boolean z2) {
        super(atrVar);
        this.r = amlr.a;
        this.b = amnvVar;
        this.g = ysyVar;
        this.h = playerConfigModel;
        this.s = afhsVar;
        this.i = afhiVar;
        this.j = shfVar;
        this.k = executorService;
        this.o = new aegc();
        this.f = aesaVar;
        this.e = DesugarCollections.synchronizedMap(new HashMap());
        this.p = z;
        this.q = z2;
    }

    private final long d(long j) {
        aegc aegcVar = this.o;
        if (aegcVar.b != 1) {
            return 0L;
        }
        int i = aegcVar.a(0).d;
        double d = this.s.o().n;
        if (d <= 0.0d) {
            d = 1.0d;
        }
        int i2 = this.s.o().k;
        double pow = Math.pow(d, i);
        afic aficVar = afic.ABR;
        double d2 = i2;
        Double.isNaN(d2);
        return j + ((long) (d2 * pow));
    }

    private final void e(atn atnVar) {
        if (this.g.o()) {
            if (this.s.o().w && atnVar.getCause() != null && (atnVar.getCause() instanceof InterruptedIOException)) {
                return;
            }
            if ((atnVar instanceof afhu) && ((afhu) atnVar).e == 204) {
                return;
            }
            if ((atnVar instanceof afhv) && "x-segment-lmt".equals(((afhv) atnVar).e)) {
                return;
            }
            if (aear.c(atnVar)) {
                aegc aegcVar = this.o;
                aegcVar.a(aegcVar.b).b++;
            } else {
                aegc aegcVar2 = this.o;
                aegcVar2.a(aegcVar2.b).a++;
            }
            if (this.o.b == 0) {
                this.l = atnVar;
            }
            afic aficVar = afic.ABR;
        }
    }

    final void c(long j) {
        aegc aegcVar = this.o;
        aegcVar.a(aegcVar.b).a();
        if (this.s.o().k > 0) {
            aegc aegcVar2 = this.o;
            if (aegcVar2.b == 1) {
                if (this.n != null || aegcVar2.a(0).c == 0 || j <= this.o.a(0).c) {
                    Future future = this.n;
                    if (future == null || !future.isDone()) {
                        return;
                    }
                    try {
                        if (((Boolean) this.n.get()).booleanValue()) {
                            this.o.a(0).a();
                            this.o.a(0).c = 0L;
                        } else {
                            this.o.a(0).d++;
                            this.o.a(0).c = d(j);
                        }
                        this.n = null;
                        return;
                    } catch (InterruptedException | ExecutionException unused) {
                        return;
                    }
                }
                this.n = this.k.submit(new Callable() { // from class: aegd
                    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, atr] */
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        String str;
                        aege aegeVar = aege.this;
                        ath athVar = aegeVar.c;
                        if (aegeVar.d == null) {
                            aegeVar.d = aegeVar.b.get();
                        }
                        aegeVar.d.l();
                        for (Map.Entry entry : aegeVar.e.entrySet()) {
                            aegeVar.d.m((String) entry.getKey(), (String) entry.getValue());
                        }
                        boolean z = false;
                        try {
                            try {
                                ath c = athVar.c(0L, 4096L);
                                aegeVar.d.h(c);
                                byte[] bArr = new byte[4096];
                                int i = 0;
                                while (true) {
                                    int g = aegeVar.d.g(bArr, i, ((int) c.h) - i);
                                    if (g <= 0) {
                                        break;
                                    }
                                    i += g;
                                }
                                str = "none";
                                pts.N(aegeVar.d);
                                z = true;
                            } catch (Exception e) {
                                if (aear.c(e)) {
                                    str = "timeout";
                                } else {
                                    str = e instanceof IOException ? "io" : "unknown";
                                }
                                pts.N(aegeVar.d);
                            }
                            aegeVar.f.f("fbprb", str.length() != 0 ? "err.".concat(str) : new String("err."));
                            return Boolean.valueOf(z);
                        } catch (Throwable th) {
                            pts.N(aegeVar.d);
                            throw th;
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        try {
            int g = super.g(bArr, i, i2);
            c(this.j.c());
            return g;
        } catch (atn e) {
            e(e);
            throw e;
        }
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.ate
    public final long h(ath athVar) {
        boolean equals;
        ammv f;
        Uri uri;
        Exception exc;
        if (this.p && athVar.a != null && !this.r.h()) {
            this.r = adyu.f(athVar.a, this.s.m());
        }
        if (this.h.aZ()) {
            equals = adyu.i(athVar.a, this.m);
        } else {
            equals = athVar.a.equals(this.m);
        }
        if (!equals) {
            if (this.q || (exc = this.l) == null || !aear.c(exc)) {
                this.l = null;
                Arrays.fill(this.o.a, 0, 3, (Object) null);
            }
            this.m = athVar.a;
        }
        this.c = athVar;
        Uri uri2 = athVar.a;
        if (this.p) {
            f = this.r;
        } else if (uri2 != null) {
            f = adyu.f(uri2, this.s.m());
        } else {
            f = amlr.a;
        }
        try {
            if (f.h()) {
                aegb a = this.o.a(0);
                aegb a2 = this.o.a(1);
                if (this.s.B() && ((a.a >= this.s.o().j || a.b >= this.s.o().m) && a2.a + a2.b <= a.a + a.b)) {
                    Uri.Builder authority = athVar.a.buildUpon().authority((String) f.c());
                    authority.appendQueryParameter("fallback_count", "1");
                    athVar = athVar.d(authority.build());
                    aegc aegcVar = this.o;
                    aegcVar.b = 1;
                    if (aegcVar.a(0).c == 0) {
                        this.o.a(0).c = d(this.j.c());
                    }
                    afic aficVar = afic.ABR;
                    long h = super.h(athVar);
                    this.i.D(super.k(), super.a());
                    c(this.j.c());
                    return h;
                }
            }
            if (!this.s.o().p || !adyu.j(uri)) {
                aegb a3 = this.o.a(0);
                aegb a4 = this.o.a(2);
                if (this.h.ai() && a3.a + a3.b > this.h.u() && a4.a + a4.b == 0) {
                    Uri uri3 = athVar.a;
                    String authority2 = uri3.getAuthority();
                    Uri.Builder authority3 = uri3.buildUpon().authority("redirector.googlevideo.com");
                    afki.a(authority2);
                    if (authority2.endsWith("a1.googlevideo.com")) {
                        uri3 = authority3.appendQueryParameter("cmo", "pf=1").appendQueryParameter("cmo", "td=a1.googlevideo.com").build();
                    } else if (authority2.endsWith("googlevideo.com")) {
                        uri3 = authority3.appendQueryParameter("cmo", "pf=1").build();
                    } else if (authority2.endsWith("c.youtube.com")) {
                        uri3 = authority3.appendQueryParameter("cmo", "td=c.youtube.com").build();
                    }
                    athVar = athVar.d(uri3);
                    this.o.b = 2;
                    afic aficVar2 = afic.ABR;
                    long h2 = super.h(athVar);
                    this.i.D(super.k(), super.a());
                    c(this.j.c());
                    return h2;
                }
            }
            afic aficVar22 = afic.ABR;
            long h22 = super.h(athVar);
            this.i.D(super.k(), super.a());
            c(this.j.c());
            return h22;
        } catch (atn e) {
            e(e);
            throw e;
        }
        uri = athVar.a;
        this.o.b = 0;
    }

    @Override // defpackage.afja, defpackage.atr
    public final void l() {
        super.l();
        this.e.clear();
    }

    @Override // defpackage.afja, defpackage.atr
    public final void m(String str, String str2) {
        super.m(str, str2);
        this.e.put(str, str2);
    }
}
