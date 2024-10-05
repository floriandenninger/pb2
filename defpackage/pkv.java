package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.view.Surface;
import androidx.media3.exoplayer.video.DummySurface;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pkv implements azx {
    public final ScheduledExecutorService b;
    public final Executor c;
    public ExecutorService d;
    public int e;
    public final LruCache f;
    public int g;
    public boolean h;
    public final aeua i;
    public final afhs j;
    private final Context k;
    private boolean l;
    private afjp m;
    private int n;
    private final baof o;

    public pkv(ScheduledExecutorService scheduledExecutorService, Context context, aeua aeuaVar, afhs afhsVar, final amnv amnvVar) {
        ExecutorService newSingleThreadExecutor = afhsVar.M() ? Executors.newSingleThreadExecutor(pkr.a) : scheduledExecutorService;
        this.e = 0;
        this.n = 11;
        this.l = true;
        this.b = scheduledExecutorService;
        this.k = context;
        this.i = aeuaVar;
        this.j = afhsVar;
        this.o = new baof();
        this.g = afhsVar.h();
        this.c = new Executor() { // from class: pkp
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                Handler handler = (Handler) amnv.this.get();
                if (handler.getLooper().equals(Looper.myLooper())) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        };
        this.d = newSingleThreadExecutor;
        this.f = new pkt(this, Math.max(this.g, 1));
    }

    private final synchronized pku i(azw azwVar) {
        pku pkuVar = (pku) this.f.get(azwVar.a.a);
        if (pkuVar == null) {
            afic aficVar = afic.ABR;
            if (this.f.size() > 0) {
                this.n = 25;
            }
            return null;
        }
        azw azwVar2 = pkuVar.b;
        pms pmsVar = azwVar2.c;
        pms pmsVar2 = azwVar.c;
        asf asfVar = pmsVar.z;
        byte[] bArr = asfVar != null ? asfVar.e : null;
        asf asfVar2 = pmsVar2.z;
        byte[] bArr2 = asfVar2 != null ? asfVar2.e : null;
        int i = asfVar != null ? asfVar.d : 0;
        int i2 = asfVar2 != null ? asfVar2.d : 0;
        String str = pmsVar2.n;
        int i3 = 31;
        if (str != null && !str.equals(pmsVar.n) && p(5)) {
            i3 = 5;
        } else if (pmsVar.v != pmsVar2.v && p(3)) {
            i3 = 3;
        } else if (!azwVar2.a.e && ((pmsVar.s != pmsVar2.s || pmsVar.t != pmsVar2.t) && p(6))) {
            i3 = 6;
        } else if (i == i2 || !p(31)) {
            if (!pts.R(bArr, bArr2) && p(30)) {
                i3 = 30;
            } else if (!pts.R(pmsVar.z, pmsVar2.z) && p(4)) {
                i3 = 4;
            } else if (pmsVar2.s > o(azwVar2.b, "max-width") && p(8)) {
                i3 = 8;
            } else if (pmsVar2.t > o(azwVar2.b, "max-height") && p(9)) {
                i3 = 9;
            } else if (pmsVar2.o > o(azwVar2.b, "max-input-size") && p(10)) {
                i3 = 10;
            } else if (pts.a >= 23 && n(azwVar2.b, 0.0f) != n(azwVar.b, 0.0f) && n(azwVar.b, -1.0f) == -1.0f && p(7)) {
                i3 = 7;
            } else if (azwVar.e != null) {
                i3 = 22;
            } else {
                i3 = (pmsVar2.e(pmsVar) || !p(29)) ? 0 : 29;
            }
        }
        if (i3 == 0) {
            return pkuVar;
        }
        afic aficVar2 = afic.ABR;
        this.n = i3;
        return null;
    }

    private final afjp j() {
        k();
        afjp afjpVar = new afjp();
        this.m = afjpVar;
        return afjpVar;
    }

    private final void k() {
        afjp afjpVar = this.m;
        if (afjpVar != null) {
            afjpVar.a = true;
        }
    }

    private static boolean l(azw azwVar, azw azwVar2) {
        return !azwVar2.c.e(azwVar.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0070, code lost:
    
        if (r4.d(r5) == false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized int m(boolean r4, java.lang.String r5, boolean r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.h     // Catch: java.lang.Throwable -> L7b
            r1 = 1
            if (r0 == 0) goto L79
            if (r6 != 0) goto L79
            if (r4 != 0) goto Lc
            goto L79
        Lc:
            afhs r4 = r3.j     // Catch: java.lang.Throwable -> L7b
            boolean r4 = r4.P()     // Catch: java.lang.Throwable -> L7b
            r6 = 2
            if (r4 == 0) goto L77
            int r4 = defpackage.pts.a     // Catch: java.lang.Throwable -> L7b
            r0 = 29
            if (r4 != r0) goto L23
            java.lang.String r4 = "c2.android.aac.decoder"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L7b
            if (r4 != 0) goto L77
        L23:
            int r4 = defpackage.pts.a     // Catch: java.lang.Throwable -> L7b
            r0 = 23
            if (r4 > r0) goto L31
            java.lang.String r4 = "OMX.google.vorbis.decoder"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L7b
            if (r4 != 0) goto L77
        L31:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7b
            r2 = 3
            if (r4 < r0) goto L75
            baof r4 = r3.o     // Catch: java.lang.Throwable -> L7b
            afhs r0 = r3.j     // Catch: java.lang.Throwable -> L7b
            aadw r0 = r0.c     // Catch: java.lang.Throwable -> L7b
            apwy r0 = r0.b()     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L58
            atck r0 = r0.q     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L48
            atck r0 = defpackage.atck.a     // Catch: java.lang.Throwable -> L7b
        L48:
            apdi r0 = r0.b     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L4e
            apdi r0 = defpackage.apdi.a     // Catch: java.lang.Throwable -> L7b
        L4e:
            int r0 = r0.c     // Catch: java.lang.Throwable -> L7b
            int r0 = defpackage.amkq.bK(r0)     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L57
            goto L58
        L57:
            r1 = r0
        L58:
            int r1 = r1 + (-1)
            if (r1 == r6) goto L75
            r6 = 4
            if (r1 == r2) goto L73
            if (r1 == r6) goto L68
            boolean r4 = r4.d(r5)     // Catch: java.lang.Throwable -> L7b
            if (r4 != 0) goto L75
            goto L73
        L68:
            boolean r0 = r4.b     // Catch: java.lang.Throwable -> L7b
            if (r0 != 0) goto L75
            boolean r4 = r4.d(r5)     // Catch: java.lang.Throwable -> L7b
            if (r4 == 0) goto L73
            goto L75
        L73:
            monitor-exit(r3)
            return r6
        L75:
            monitor-exit(r3)
            return r2
        L77:
            monitor-exit(r3)
            return r6
        L79:
            monitor-exit(r3)
            return r1
        L7b:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pkv.m(boolean, java.lang.String, boolean):int");
    }

    private static float n(MediaFormat mediaFormat, float f) {
        return mediaFormat.containsKey("operating-rate") ? mediaFormat.getFloat("operating-rate") : f;
    }

    private static int o(MediaFormat mediaFormat, String str) {
        if (mediaFormat.containsKey(str)) {
            return mediaFormat.getInteger(str);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean p(int r6) {
        /*
            r5 = this;
            afhs r0 = r5.j
            axzg r0 = r0.p
            aadw r1 = r0.b
            apwy r1 = r1.b()
            aqvj r1 = r1.C
            if (r1 != 0) goto L10
            aqvj r1 = defpackage.aqvj.a
        L10:
            r2 = 45354057(0x2b40c49, double:2.24078815E-316)
            boolean r4 = r1.a(r2)
            if (r4 == 0) goto L6c
            aoot r1 = r1.b     // Catch: defpackage.aoob -> L46
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: defpackage.aoob -> L46
            boolean r3 = r1.containsKey(r2)     // Catch: defpackage.aoob -> L46
            if (r3 == 0) goto L40
            java.lang.Object r1 = r1.get(r2)     // Catch: defpackage.aoob -> L46
            aqvk r1 = (defpackage.aqvk) r1     // Catch: defpackage.aoob -> L46
            int r2 = r1.b     // Catch: defpackage.aoob -> L46
            r3 = 5
            if (r2 != r3) goto L35
            java.lang.Object r1 = r1.c     // Catch: defpackage.aoob -> L46
            aomf r1 = (defpackage.aomf) r1     // Catch: defpackage.aoob -> L46
            goto L37
        L35:
            aomf r1 = defpackage.aomf.b     // Catch: defpackage.aoob -> L46
        L37:
            aorr r2 = defpackage.aorr.a     // Catch: defpackage.aoob -> L46
            aonm r1 = defpackage.aonm.parseFrom(r2, r1)     // Catch: defpackage.aoob -> L46
            aorr r1 = (defpackage.aorr) r1     // Catch: defpackage.aoob -> L46
            goto L6e
        L40:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: defpackage.aoob -> L46
            r1.<init>()     // Catch: defpackage.aoob -> L46
            throw r1     // Catch: defpackage.aoob -> L46
        L46:
            r1 = move-exception
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Unable to parse proto typed experiment flag: "
            int r3 = r1.length()
            if (r3 == 0) goto L64
            java.lang.String r1 = r2.concat(r1)
            goto L69
        L64:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L69:
            android.util.Log.e(r0, r1)
        L6c:
            aorr r1 = defpackage.aorr.a
        L6e:
            aonu r0 = r1.b
            int r6 = defpackage.aobq.aH(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r0.contains(r6)
            if (r6 != 0) goto L80
            r6 = 1
            return r6
        L80:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pkv.p(int):boolean");
    }

    public final synchronized void a() {
        this.h = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.azx
    public final synchronized azy b(final azw azwVar) {
        pkj pkjVar;
        pkj pkjVar2;
        boolean Y = this.j.Y();
        final int m = m(Y, azwVar.a.a, azwVar.e != null);
        if (Y) {
            int max = Math.max(this.j.h(), 1);
            if (this.g != max) {
                this.g = max;
                this.f.resize(max);
            }
            final pku i = i(azwVar);
            if (i != null) {
                if (this.j.M()) {
                    final pki pkiVar = new pki(l(i.b, azwVar));
                    final afjp j = j();
                    this.d.execute(new Runnable() { // from class: pkl
                        @Override // java.lang.Runnable
                        public final void run() {
                            pkj pkjVar3;
                            pkv pkvVar = pkv.this;
                            afjp afjpVar = j;
                            pki pkiVar2 = pkiVar;
                            azw azwVar2 = azwVar;
                            pku pkuVar = i;
                            int i2 = m;
                            pkvVar.d(Thread.currentThread(), afjpVar, pkiVar2, azwVar2.d);
                            if (afjpVar.a) {
                                afjpVar.run();
                                return;
                            }
                            try {
                                pkjVar3 = pkvVar.e(pkuVar, azwVar2, i2);
                            } catch (IOException e) {
                                pkvVar.i.b(e);
                                try {
                                    pkj f = pkvVar.f(azwVar2, i2);
                                    if (i2 != 1) {
                                        pkvVar.f.put(azwVar2.a.a, new pku(f, azwVar2));
                                    }
                                    pkjVar3 = f;
                                } catch (IOException | RuntimeException e2) {
                                    pkiVar2.q(e2, azwVar2.d);
                                    afjpVar.run();
                                    return;
                                }
                            }
                            pkiVar2.d(pkjVar3);
                            afjpVar.run();
                            afic aficVar = afic.ABR;
                            String str = azwVar2.a.a;
                        }
                    });
                    pkjVar2 = pkiVar;
                } else {
                    try {
                        pkjVar2 = e(i, azwVar, m);
                    } catch (IOException e) {
                        this.i.b(e);
                        pkjVar2 = null;
                    }
                }
                if (pkjVar2 != null) {
                    return pkjVar2;
                }
            }
            int size = this.f.size();
            int i2 = this.g;
            if (size >= i2) {
                this.f.trimToSize(Math.max(i2 - 1, 0));
            }
        } else if (this.h) {
            g(26);
        }
        if (this.j.M()) {
            final pki pkiVar2 = new pki(false);
            final afjp j2 = j();
            this.d.execute(new Runnable() { // from class: pkm
                @Override // java.lang.Runnable
                public final void run() {
                    pkv pkvVar = pkv.this;
                    afjp afjpVar = j2;
                    pki pkiVar3 = pkiVar2;
                    azw azwVar2 = azwVar;
                    int i3 = m;
                    pkvVar.d(Thread.currentThread(), afjpVar, pkiVar3, azwVar2.d);
                    if (afjpVar.a) {
                        afjpVar.run();
                        return;
                    }
                    int size2 = pkvVar.f.size();
                    int i4 = pkvVar.g;
                    if (size2 >= i4) {
                        pkvVar.f.trimToSize(Math.max(i4 - 1, 0));
                    }
                    try {
                        pkj f = pkvVar.f(azwVar2, i3);
                        if (!afjpVar.a) {
                            synchronized (pkvVar) {
                                if (pkvVar.h && i3 != 1) {
                                    pkvVar.f.put(azwVar2.a.a, new pku(f, azwVar2));
                                }
                            }
                            pkiVar3.d(f);
                            afjpVar.run();
                            afic aficVar = afic.ABR;
                            String str = azwVar2.a.a;
                            return;
                        }
                        f.h();
                        afjpVar.run();
                    } catch (IOException | RuntimeException e2) {
                        pkiVar3.q(e2, azwVar2.d);
                        afjpVar.run();
                    }
                }
            });
            pkjVar = pkiVar2;
        } else {
            pkj f = f(azwVar, m);
            pkjVar = f;
            if (m != 1) {
                this.f.put(azwVar.a.a, new pku(f, azwVar));
                return f;
            }
        }
        return pkjVar;
    }

    public final synchronized void c() {
        pkj pkjVar;
        int i;
        DummySurface dummySurface;
        for (Map.Entry entry : this.f.snapshot().entrySet()) {
            pku pkuVar = (pku) entry.getValue();
            try {
                pkjVar = pkuVar.a;
                i = pkjVar.d;
                dummySurface = null;
            } catch (RuntimeException e) {
                this.f.remove((String) entry.getKey());
                this.i.b(e);
            }
            if (i == 0) {
                throw null;
                break;
            }
            if (i == 4) {
                afki.e(Build.VERSION.SDK_INT >= 23, "Attempt to use REUSE_WITH_SYNTHETIC_SURFACE on invalid SDK.");
                if (Build.VERSION.SDK_INT >= 23) {
                    if (pkjVar.c == null) {
                        pkjVar.c = DummySurface.a(pkjVar.a, pkjVar.b);
                    }
                    afic aficVar = afic.ABR;
                    pkjVar.j(pkjVar.c);
                    dummySurface = pkjVar.c;
                }
            }
            if (dummySurface != null) {
                azw azwVar = pkuVar.b;
                pkuVar.b = azw.a(azwVar.a, azwVar.b, azwVar.c, dummySurface, azwVar.e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(final Thread thread, final afjp afjpVar, final pki pkiVar, final Surface surface) {
        Long l;
        ScheduledExecutorService scheduledExecutorService = this.b;
        Runnable runnable = new Runnable() { // from class: pko
            @Override // java.lang.Runnable
            public final void run() {
                final pkv pkvVar = pkv.this;
                Thread thread2 = thread;
                afjp afjpVar2 = afjpVar;
                pki pkiVar2 = pkiVar;
                Surface surface2 = surface;
                if (afjpVar2.isDone() || pkvVar.d == pkvVar.b) {
                    return;
                }
                pkvVar.e++;
                afid.e(afic.CODEC_REUSE, "Codec initialization stuck. Time No. %d", Integer.valueOf(pkvVar.e));
                thread2.interrupt();
                afjpVar2.a = true;
                pkiVar2.q(new TimeoutException(), surface2);
                afjpVar2.run();
                pkvVar.d.shutdownNow();
                pkvVar.d = Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: pkq
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable2) {
                        int i = pkv.this.e;
                        StringBuilder sb = new StringBuilder(17);
                        sb.append("codec-");
                        sb.append(i);
                        return new Thread(runnable2, sb.toString());
                    }
                });
                aeua aeuaVar = pkvVar.i;
                int i = pkvVar.e;
                StringBuilder sb = new StringBuilder(47);
                sb.append("Codec initialization stuck. Time No.");
                sb.append(i);
                aeuaVar.b(new TimeoutException(sb.toString()));
            }
        };
        aqvj aqvjVar = this.j.p.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45352816L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45352816L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45352816L);
            l = Long.valueOf(aqvkVar.b == 2 ? ((Long) aqvkVar.c).longValue() : 0L);
        } else {
            l = 0L;
        }
        int intValue = Long.valueOf(l.longValue()).intValue();
        if (intValue == 0) {
            intValue = 5000;
        }
        scheduledExecutorService.schedule(runnable, intValue, TimeUnit.MILLISECONDS);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pkj e(defpackage.pku r13, defpackage.azw r14, int r15) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pkv.e(pku, azw, int):pkj");
    }

    public final pkj f(azw azwVar, int i) {
        MediaCodec createByCodecName;
        String str = azwVar.a.a;
        MediaCodec mediaCodec = null;
        try {
            if (str.length() != 0) {
                "createCodec:".concat(str);
            }
            int i2 = pts.a;
            createByCodecName = MediaCodec.createByCodecName(str);
        } catch (IOException e) {
            e = e;
        } catch (RuntimeException e2) {
            e = e2;
        }
        try {
            createByCodecName.configure(azwVar.b, azwVar.d, azwVar.e, 0);
            createByCodecName.start();
            int i3 = this.l ? 11 : this.n;
            afic aficVar = afic.CODEC_REUSE;
            Object[] objArr = new Object[3];
            objArr[0] = str;
            objArr[1] = i != 1 ? i != 2 ? i != 3 ? "FLUSH_AND_SYNTHETIC_SURFACE" : "FLUSH" : "STOP" : "RELEASE";
            String aG = aobq.aG(i3);
            if (i3 == 0) {
                throw null;
            }
            objArr[2] = aG;
            afid.e(aficVar, "Codec created: %s. ReleaseMode %s. InitReason %s.", objArr);
            aeua aeuaVar = this.i;
            aeuaVar.a.b().a().aR(i3);
            aeuaVar.d.j("cir", String.format(Locale.US, "reused.false;reason.%s", aobq.aG(i3)));
            this.l = false;
            MediaCrypto mediaCrypto = azwVar.e;
            boolean z = mediaCrypto == null;
            if (mediaCrypto != null) {
                this.n = 23;
            } else {
                this.n = 2;
            }
            return new pkj(createByCodecName, azwVar.d, i, this.k, true ^ z);
        } catch (IOException | RuntimeException e3) {
            e = e3;
            mediaCodec = createByCodecName;
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e;
        }
    }

    public final void g(final int i) {
        this.c.execute(new Runnable() { // from class: pkn
            @Override // java.lang.Runnable
            public final void run() {
                pkv.this.h(i);
            }
        });
    }

    public final synchronized void h(int i) {
        this.h = false;
        this.n = i;
        k();
        this.f.evictAll();
    }
}
