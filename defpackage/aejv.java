package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aejv implements atr {
    private static final ath f = new ath(Uri.EMPTY);
    public final atr b;
    public final afjf c;
    public final atq d;
    public volatile atr e;
    private final atm g;
    private final int h;
    private final ArrayList i;
    private final ExecutorCompletionService j;
    private atr k;
    private Future l;
    private Future m;
    private ath n;
    private ath o;
    private ath p;
    private final aeju q;

    public aejv(atr atrVar, atm atmVar, aeju aejuVar, Executor executor, afjf afjfVar, int i) {
        afki.a(atrVar);
        this.b = atrVar;
        afki.a(atmVar);
        this.g = atmVar;
        afki.a(aejuVar);
        this.q = aejuVar;
        afki.a(executor);
        this.j = new ExecutorCompletionService(executor);
        afki.a(afjfVar);
        this.c = afjfVar;
        this.h = i < 0 ? 2000 : i;
        this.d = new atq();
        this.i = new ArrayList();
        this.p = f;
    }

    private final Future d(final atr atrVar, final ath athVar) {
        try {
            return this.j.submit(new Callable() { // from class: aejt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    aejv aejvVar = aejv.this;
                    atr atrVar2 = atrVar;
                    ath athVar2 = athVar;
                    try {
                        if (aejvVar.b == atrVar2) {
                            aejvVar.c.R();
                        } else {
                            aejvVar.c.ad();
                        }
                        atrVar2.l();
                        for (Map.Entry entry : aejvVar.d.a().entrySet()) {
                            atrVar2.m((String) entry.getKey(), (String) entry.getValue());
                        }
                        long h = atrVar2.h(athVar2);
                        aejvVar.c(atrVar2);
                        Long valueOf = Long.valueOf(h);
                        if (aejvVar.e != atrVar2) {
                            pts.N(atrVar2);
                        }
                        return valueOf;
                    } catch (Throwable th) {
                        if (aejvVar.e != atrVar2) {
                            pts.N(atrVar2);
                        }
                        throw th;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            throw new atn("Unable to submit task for execution", athVar, 1);
        }
    }

    private final void e() {
        Future future = this.l;
        if (future != null) {
            future.cancel(true);
            this.l = null;
        }
        Future future2 = this.m;
        if (future2 != null) {
            future2.cancel(true);
            this.m = null;
        }
    }

    private final void f(Future future) {
        if (future != null) {
            try {
                future.get();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new atn("Execution interrupted.", this.p, 3);
            } catch (ExecutionException unused2) {
            }
        }
    }

    @Override // defpackage.atr, defpackage.ate
    public final Map a() {
        return this.e == null ? amvo.b : this.e.a();
    }

    @Override // defpackage.ate
    public final void b(att attVar) {
        this.b.b(attVar);
        atr atrVar = this.k;
        if (atrVar != null) {
            atrVar.b(attVar);
        }
        this.i.add(attVar);
    }

    public final synchronized void c(atr atrVar) {
        if (this.e == null) {
            this.e = atrVar;
        }
        if (this.b == atrVar) {
            ath athVar = this.n;
            if (athVar == null) {
                athVar = this.p;
            }
            this.p = athVar;
            this.c.S();
            return;
        }
        ath athVar2 = this.o;
        if (athVar2 == null) {
            athVar2 = this.p;
        }
        this.p = athVar2;
        this.c.ae();
    }

    @Override // defpackage.atr, defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        if (this.e == null) {
            throw new atn("DataSource is not open.", this.p, 2);
        }
        return this.e.g(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:3:0x0008, B:5:0x000d, B:7:0x0015, B:9:0x0022, B:15:0x0035, B:18:0x0083, B:20:0x0087, B:21:0x0097, B:23:0x009d, B:25:0x00a7, B:28:0x00ad, B:30:0x00b5, B:34:0x00e2, B:37:0x00ea, B:39:0x00ee, B:47:0x00f5, B:49:0x00c3, B:50:0x00d1, B:52:0x00d3, B:54:0x00db, B:56:0x00f6, B:57:0x00fd, B:58:0x003e, B:61:0x004b, B:63:0x006d, B:64:0x0074, B:84:0x00fe, B:85:0x010a, B:66:0x010c, B:68:0x0114, B:70:0x011c, B:72:0x0124, B:74:0x012c, B:75:0x013c, B:76:0x013d, B:77:0x0142, B:78:0x0143, B:79:0x0149, B:80:0x014a, B:81:0x0150, B:82:0x0151, B:83:0x0157, B:86:0x0158, B:87:0x015f), top: B:2:0x0008, inners: #1, #2, #3, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5 A[Catch: InterruptedException -> 0x00c3, ExecutionException -> 0x00d2, all -> 0x0160, TRY_LEAVE, TryCatch #1 {InterruptedException -> 0x00c3, blocks: (B:28:0x00ad, B:30:0x00b5), top: B:27:0x00ad, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ad A[SYNTHETIC] */
    @Override // defpackage.atr, defpackage.ate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(defpackage.ath r9) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aejv.h(ath):long");
    }

    @Override // defpackage.ate
    public final Uri i() {
        if (this.e == null) {
            return null;
        }
        return this.e.i();
    }

    @Override // defpackage.atr, defpackage.ate
    public final void j() {
        try {
            f(this.l);
            f(this.m);
            if (this.e != null) {
                pts.N(this.e);
            }
            this.l = null;
            this.m = null;
            this.e = null;
        } catch (Throwable th) {
            if (this.e != null) {
                pts.N(this.e);
            }
            this.l = null;
            this.m = null;
            this.e = null;
            throw th;
        }
    }

    @Override // defpackage.atr
    public final int k() {
        if (this.e == null) {
            return -1;
        }
        return this.e.k();
    }

    @Override // defpackage.atr
    public final void l() {
        this.d.b();
    }

    @Override // defpackage.atr
    public final void m(String str, String str2) {
        this.d.c(str, str2);
    }
}
