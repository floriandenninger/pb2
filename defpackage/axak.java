package defpackage;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axak implements axam {
    public String a;
    public awxr b;
    private String c;
    private String d;
    private awzx e;
    private String f;
    private final awzu g;
    private final awzw h;
    private final long i;
    private double j;
    private int k = 1;
    private long l;
    private final Random m;
    private axam n;
    private int o;
    private int p;
    private int q;

    public axak(String str, String str2, awzx awzxVar, awzu awzuVar, String str3, awzw awzwVar, axar axarVar, boolean z) {
        if (z) {
            this.a = str;
        } else {
            this.c = str;
            this.d = str2;
            this.e = awzxVar == null ? new awzx() : awzxVar;
            this.f = str3;
        }
        this.h = awzwVar;
        this.g = awzuVar;
        this.i = axarVar.a;
        this.j = 0.0d;
        this.l = 1L;
        this.m = new Random();
        this.q = 1;
    }

    private final anhy h(final boolean z) {
        anhz a = anhz.a(new Callable() { // from class: axai
            @Override // java.util.concurrent.Callable
            public final Object call() {
                axap axapVar;
                awzy d;
                axak axakVar = axak.this;
                boolean z2 = z;
                try {
                    if (z2) {
                        d = axakVar.g(true);
                    } else if (axakVar.a == null) {
                        d = axakVar.g(false);
                    } else {
                        d = axakVar.d(true);
                    }
                    axapVar = new axap(d);
                } catch (axao e) {
                    axapVar = new axap(e);
                } catch (Throwable th) {
                    axapVar = new axap(new axao(axan.UNKNOWN, th));
                }
                synchronized (axakVar) {
                    if (axakVar.b != null) {
                        if (!axapVar.a()) {
                            axakVar.b.b(axakVar);
                        } else if (!z2) {
                            axakVar.b.c(axakVar);
                        }
                    }
                }
                return axapVar;
            }
        });
        anio anioVar = new anio();
        anioVar.d("Scotty-Uploader-ResumableTransfer-%d");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(anio.b(anioVar));
        newSingleThreadExecutor.submit(a);
        newSingleThreadExecutor.shutdown();
        return a;
    }

    private final awzy k(awzx awzxVar, String str, awzu awzuVar) {
        anhy a;
        l();
        awzx awzxVar2 = new awzx();
        awzxVar2.e("X-Goog-Upload-Protocol", "resumable");
        awzxVar2.e("X-Goog-Upload-Command", str);
        for (String str2 : awzxVar.c()) {
            Iterator it = awzxVar.b(str2).iterator();
            while (it.hasNext()) {
                awzxVar2.e(str2, (String) it.next());
            }
        }
        axam a2 = this.h.a(str.equals("start") ? this.c : this.a, str.contains("start") ? this.d : "PUT", awzxVar2, awzuVar);
        if (this.b != null && !str.equals("start")) {
            synchronized (this) {
                a2.j(new axaj(this, this.b, null), this.o, this.p);
            }
        }
        synchronized (this) {
            this.n = a2;
            a = a2.a();
        }
        try {
            axap axapVar = (axap) a.get();
            if (axapVar.b()) {
                if (axapVar.a.a != axan.CANCELED) {
                    throw axapVar.a;
                }
                l();
                throw new axao(axan.CONNECTION_ERROR, "");
            }
            return axapVar.b;
        } catch (InterruptedException | ExecutionException e) {
            String valueOf = String.valueOf(e.getMessage());
            throw new RuntimeException(valueOf.length() != 0 ? "Unexpected error occurred: ".concat(valueOf) : new String("Unexpected error occurred: "));
        }
    }

    private final synchronized void l() {
        int i;
        while (true) {
            i = this.q;
            if (i != 2) {
                break;
            } else {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (i == 3) {
            throw new axao(axan.CANCELED, "");
        }
        amkq.v(i == 1);
    }

    private final void m(axao axaoVar) {
        if (this.j >= this.i) {
            throw axaoVar;
        }
        double nextDouble = this.m.nextDouble();
        try {
            double d = this.j;
            long j = this.l;
            double d2 = j;
            Double.isNaN(d2);
            this.j = d + (d2 * nextDouble);
            double d3 = j * 1000;
            Double.isNaN(d3);
            Thread.sleep((long) (d3 * nextDouble));
        } catch (InterruptedException unused) {
        }
        long j2 = this.l;
        this.l = j2 + j2;
    }

    private final void n() {
        if (this.g.e() > this.g.c()) {
            this.g.g();
            o();
        }
    }

    private final void o() {
        this.l = 1L;
        this.j = 0.0d;
    }

    private final boolean p() {
        try {
            return this.g.i();
        } catch (IOException e) {
            throw new axao(axan.REQUEST_BODY_READ_ERROR, "Could not call hasMoreData() on upload stream.", e);
        }
    }

    private static final boolean q(awzy awzyVar) {
        return awzyVar.a / 100 == 4;
    }

    private static final boolean r(awzy awzyVar) {
        String a;
        awzx awzxVar = awzyVar.b;
        return (awzxVar == null || (a = awzxVar.a("X-Goog-Upload-Status")) == null || !amkq.e("final", a)) ? false : true;
    }

    private static final boolean s(awzy awzyVar) {
        String a;
        awzx awzxVar = awzyVar.b;
        return awzxVar != null && (a = awzxVar.a("X-Goog-Upload-Status")) != null && amkq.e("active", a) && awzyVar.a == 200;
    }

    @Override // defpackage.axam
    public final anhy a() {
        return h(false);
    }

    @Override // defpackage.axam
    public final anhy b() {
        return h(true);
    }

    @Override // defpackage.axam
    public final awzu c() {
        return this.g;
    }

    @Override // defpackage.axam
    public final String e() {
        return this.a;
    }

    @Override // defpackage.axam
    public final void f() {
        synchronized (this) {
            axam axamVar = this.n;
            if (axamVar != null) {
                axamVar.f();
                this.n = null;
            }
            this.q = 3;
            notifyAll();
        }
    }

    public final awzy g(boolean z) {
        awzy k;
        synchronized (this) {
            awxr awxrVar = this.b;
            if (awxrVar != null) {
                awxrVar.d();
            }
        }
        o();
        while (true) {
            try {
                k = k(this.e, "start", new axal(ammx.d(this.f)));
            } catch (axao e) {
                if (e.a()) {
                    m(e);
                } else {
                    throw e;
                }
            }
            if (r(k)) {
                return k;
            }
            if (!s(k)) {
                if (q(k)) {
                    return k;
                }
                m(new axao(axan.SERVER_ERROR, k.a()));
            } else {
                awzx awzxVar = k.b;
                String a = awzxVar.a("X-Goog-Upload-URL");
                try {
                    new URL(a);
                    this.a = a;
                    synchronized (this) {
                    }
                    String a2 = awzxVar.a("X-Goog-Upload-Chunk-Granularity");
                    if (a2 != null) {
                        try {
                            this.k = Integer.parseInt(a2);
                        } catch (NumberFormatException e2) {
                            throw new axao(axan.SERVER_ERROR, "Server returned an invalid chunk granularity.", e2);
                        }
                    }
                    return z ? k : d(false);
                } catch (MalformedURLException e3) {
                    throw new axao(axan.SERVER_ERROR, "Server returned an invalid upload url.", e3);
                }
            }
        }
    }

    @Override // defpackage.axam
    public final boolean i() {
        return true;
    }

    @Override // defpackage.axam
    public final synchronized void j(awxr awxrVar, int i, int i2) {
        amkq.F(i > 0, "Progress threshold (bytes) must be greater than 0");
        amkq.F(true, "Progress threshold (millis) must be greater or equal to 0");
        this.b = awxrVar;
        this.o = i;
        this.p = i2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:22|(2:62|(1:64)(4:65|66|67|(1:72)(1:71)))(1:24)|25|(1:61)(1:(1:28)(1:60))|29|(1:31)|32|33|34|35|(2:37|(1:44)(1:(1:40)(3:41|42|43)))(2:52|53)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x016d, code lost:
    
        r3 = defpackage.axan.REQUEST_BODY_READ_ERROR;
        r4 = r9.g.e();
        r9 = new java.lang.StringBuilder(241);
        r9.append("Upload stream does not have more data but it should. Maybe the caller passed in a data stream to upload with a mark position that didn't match the transfer handle? Confirmed offset from server: ");
        r9.append(r0);
        r9.append(" Size: ");
        r9.append(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0195, code lost:
    
        throw new defpackage.axao(r3, r9.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0196, code lost:
    
        r9.n();
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x019b, code lost:
    
        r3 = defpackage.axan.SERVER_ERROR;
        r4 = r9.g.c();
        r9 = new java.lang.StringBuilder(com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor);
        r9.append("The server lost bytes that were previously committed. Our offset: ");
        r9.append(r4);
        r9.append(", server offset: ");
        r9.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c3, code lost:
    
        throw new defpackage.axao(r3, r9.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01c4, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01ce, code lost:
    
        throw new defpackage.axao(defpackage.axan.SERVER_ERROR, "Failed to parse X-Goog-Upload-Size-Received header", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0109, code lost:
    
        r9.k = java.lang.Integer.parseInt(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0110, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x011a, code lost:
    
        throw new defpackage.axao(defpackage.axan.SERVER_ERROR, "Server returned an invalid chunk granularity.", r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x01e5, code lost:
    
        if (r0 != null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01e9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        if (q(r0) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c4, code lost:
    
        if (r0.a == 400) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c7, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c8, code lost:
    
        r9.m(new defpackage.axao(defpackage.axan.SERVER_ERROR, r0.a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e1, code lost:
    
        r9.m(new defpackage.axao(defpackage.axan.SERVER_ERROR, r0.a()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00dc, code lost:
    
        if (r0.a() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00de, code lost:
    
        r9.m(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01f7, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00ff, code lost:
    
        r1 = r0.b.a("X-Goog-Upload-Chunk-Granularity");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0107, code lost:
    
        if (r1 == null) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011b, code lost:
    
        r0 = java.lang.Long.parseLong(r0.b.a("X-Goog-Upload-Size-Received"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x012f, code lost:
    
        if (r0 < r9.g.c()) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0139, code lost:
    
        if (r0 < r9.g.e()) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013c, code lost:
    
        r9.g.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0149, code lost:
    
        if (r9.g.e() >= r0) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014f, code lost:
    
        if (r9.p() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0151, code lost:
    
        r2 = r9.g;
        r2.f(r0 - r2.e());
        r9.g.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0162, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016c, code lost:
    
        throw new defpackage.axao(defpackage.axan.REQUEST_BODY_READ_ERROR, "Could not skip in the data stream.", r9);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x00de -> B:3:0x00e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.awzy d(boolean r9) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axak.d(boolean):awzy");
    }
}
