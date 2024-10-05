package defpackage;

import java.security.MessageDigest;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axag implements axam {
    public static final char[] a = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
    public final String b;
    public final String c;
    public final awzx d;
    public final String e;
    public final awzu f;
    public final awzw g;
    public final MessageDigest h;
    public axam i;
    public int j;
    public int k;
    public awxr l;
    private int m;

    public axag(String str, awzx awzxVar, awzu awzuVar, String str2, awzw awzwVar, axar axarVar) {
        str.getClass();
        awzuVar.getClass();
        awzwVar.getClass();
        this.b = str;
        this.c = "POST";
        this.d = awzxVar;
        this.e = ammx.d(str2);
        this.g = awzwVar;
        this.f = awzuVar;
        this.m = 1;
        this.h = axarVar.b;
    }

    @Override // defpackage.axam
    public final anhy a() {
        Callable callable = new Callable() { // from class: axae
            /* JADX WARN: Removed duplicated region for block: B:75:0x0104 A[Catch: all -> 0x0118, axao -> 0x0127, TryCatch #7 {axao -> 0x0127, all -> 0x0118, blocks: (B:3:0x0002, B:9:0x000b, B:12:0x001d, B:14:0x002e, B:15:0x0046, B:17:0x004c, B:24:0x005e, B:20:0x0068, B:27:0x0072, B:29:0x0094, B:30:0x009e, B:32:0x00af, B:40:0x00c3, B:42:0x00c4, B:48:0x00cc, B:49:0x00d2, B:51:0x00d8, B:53:0x00e0, B:54:0x00e4, B:55:0x00e6, B:56:0x00e7, B:73:0x00f2, B:75:0x0104, B:76:0x010e, B:77:0x0111, B:78:0x0109, B:83:0x0114, B:84:0x0099, B:88:0x0117, B:34:0x00b0, B:35:0x00bf, B:44:0x00c5, B:45:0x00cb, B:5:0x0003, B:7:0x0007, B:8:0x000a), top: B:2:0x0002, inners: #0, #1, #4 }] */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0109 A[Catch: all -> 0x0118, axao -> 0x0127, TryCatch #7 {axao -> 0x0127, all -> 0x0118, blocks: (B:3:0x0002, B:9:0x000b, B:12:0x001d, B:14:0x002e, B:15:0x0046, B:17:0x004c, B:24:0x005e, B:20:0x0068, B:27:0x0072, B:29:0x0094, B:30:0x009e, B:32:0x00af, B:40:0x00c3, B:42:0x00c4, B:48:0x00cc, B:49:0x00d2, B:51:0x00d8, B:53:0x00e0, B:54:0x00e4, B:55:0x00e6, B:56:0x00e7, B:73:0x00f2, B:75:0x0104, B:76:0x010e, B:77:0x0111, B:78:0x0109, B:83:0x0114, B:84:0x0099, B:88:0x0117, B:34:0x00b0, B:35:0x00bf, B:44:0x00c5, B:45:0x00cb, B:5:0x0003, B:7:0x0007, B:8:0x000a), top: B:2:0x0002, inners: #0, #1, #4 }] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 330
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.axae.call():java.lang.Object");
            }
        };
        anio anioVar = new anio();
        anioVar.d("Scotty-Uploader-MultipartTransfer-%d");
        anib C = anaf.C(Executors.newSingleThreadExecutor(anio.b(anioVar)));
        anhy submit = C.submit(callable);
        C.shutdown();
        return submit;
    }

    @Override // defpackage.axam
    public final /* synthetic */ anhy b() {
        return awxr.f();
    }

    @Override // defpackage.axam
    public final awzu c() {
        return this.f;
    }

    public final synchronized void d() {
        int i;
        while (true) {
            i = this.m;
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

    @Override // defpackage.axam
    public final String e() {
        return null;
    }

    @Override // defpackage.axam
    public final void f() {
        synchronized (this) {
            axam axamVar = this.i;
            if (axamVar != null) {
                axamVar.f();
            }
            this.m = 3;
            notifyAll();
        }
    }

    @Override // defpackage.axam
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.axam
    public final synchronized void j(awxr awxrVar, int i, int i2) {
        amkq.F(i > 0, "Progress threshold (bytes) must be greater than 0");
        amkq.F(true, "Progress threshold (millis) must be greater or equal to 0");
        this.l = awxrVar;
        this.j = i;
        this.k = i2;
    }
}
