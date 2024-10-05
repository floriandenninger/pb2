package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yxt implements yxx {
    private final File X;
    private final File Y;
    private final zfh Z;
    public final AtomicReference a = new AtomicReference(null);
    private final azrw aa;
    private final Context ab;
    private boolean ac;
    private volatile int ad;

    /* JADX WARN: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yxt(android.content.Context r9, defpackage.zfh r10, defpackage.azrw r11, defpackage.yyf r12, java.lang.String[] r13) {
        /*
            r8 = this;
            r8.<init>()
            r8.Z = r10
            r8.ab = r9
            r8.aa = r11
            java.util.concurrent.atomic.AtomicReference r11 = new java.util.concurrent.atomic.AtomicReference
            r0 = 0
            r11.<init>(r0)
            r8.a = r11
            r11 = 8
            r1 = 2
            r2 = 1
            r3 = 0
            java.io.File r4 = r(r9)     // Catch: java.lang.Exception -> L7f
            r4.getClass()
            java.io.File r5 = s(r4)     // Catch: java.lang.Exception -> L7f
            java.io.File r4 = q(r4)     // Catch: java.lang.Exception -> L7f
            if (r13 == 0) goto L3a
            r9 = r13[r3]     // Catch: java.lang.Exception -> L7f
            r10 = r13[r2]     // Catch: java.lang.Exception -> L7f
            long[][] r9 = v(r9, r10)     // Catch: java.lang.Exception -> L7f
            r10 = r13[r2]     // Catch: java.lang.Exception -> L7f
            if (r10 != 0) goto L35
            r10 = 0
            goto L36
        L35:
            r10 = 1
        L36:
            r8.ac = r10     // Catch: java.lang.Exception -> L7f
        L38:
            r10 = 1
            goto L7d
        L3a:
            boolean r13 = defpackage.yjk.s(r5)     // Catch: java.lang.Exception -> L7f
            if (r13 != 0) goto L57
            boolean r13 = defpackage.yjk.s(r4)     // Catch: java.lang.Exception -> L7f
            if (r13 != 0) goto L57
            java.lang.String r9 = defpackage.yyc.e(r9)     // Catch: java.lang.Exception -> L7f
            long[][] r10 = v(r0, r9)     // Catch: java.lang.Exception -> L7f
            if (r9 != 0) goto L52
            r9 = 0
            goto L53
        L52:
            r9 = 1
        L53:
            r8.ac = r9     // Catch: java.lang.Exception -> L7f
            r9 = r10
            goto L38
        L57:
            long[][] r9 = new long[r1]     // Catch: java.lang.Exception -> L7f
            r9[r3] = r0     // Catch: java.lang.Exception -> L7f
            long[] r13 = p(r4, r10)     // Catch: java.lang.Exception -> L7f
            if (r13 == 0) goto L65
            defpackage.yjk.t(r4, r5, r10)     // Catch: java.lang.Exception -> L7f
            goto L69
        L65:
            long[] r13 = p(r5, r10)     // Catch: java.lang.Exception -> L7f
        L69:
            if (r13 != 0) goto L6d
            long[] r13 = new long[r11]     // Catch: java.lang.Exception -> L7f
        L6d:
            r9[r2] = r13     // Catch: java.lang.Exception -> L7f
            int r10 = defpackage.yxt.b     // Catch: java.lang.Exception -> L7f
            long r6 = d(r13, r10)     // Catch: java.lang.Exception -> L7f
            int r10 = (int) r6     // Catch: java.lang.Exception -> L7f
            if (r10 == r2) goto L7a
            r10 = 1
            goto L7b
        L7a:
            r10 = 0
        L7b:
            r8.ac = r3     // Catch: java.lang.Exception -> L7f
        L7d:
            r11 = 0
            goto L8b
        L7f:
            long[][] r9 = new long[r1]
            r9[r3] = r0
            long[] r10 = new long[r11]
            r9[r2] = r10
            r4 = r0
            r5 = r4
            r10 = 0
            r11 = 1
        L8b:
            r8.X = r5
            r8.Y = r4
            r13 = r9[r2]
            long[] r13 = t(r13)
            r9[r2] = r13
            r1 = r9[r3]
            if (r1 == 0) goto La2
            long[] r13 = t(r1)
            r9[r3] = r13
            goto La4
        La2:
            r9[r3] = r13
        La4:
            int r12 = r12.i
            int r12 = c(r12)
            r13 = r9[r3]
            int r13 = a(r13, r12)
            yxr r1 = new yxr
            r1.<init>()
            r1.d(r3)
            r1.e(r3)
            r3 = r9[r3]
            r1.j(r3)
            r9 = r9[r2]
            r1.h(r9)
            r1.f(r10)
            r1.e(r11)
            r1.i(r12)
            r1.g(r13)
            r8.n(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yxt.<init>(android.content.Context, zfh, azrw, yyf, java.lang.String[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(long[] jArr, int i) {
        int au = wbs.au(i, yyf.e);
        boolean z = (au & 7) == 7 || (au & 8) == 0;
        int d = ((int) d(jArr, g)) * 5;
        if (d <= 0) {
            d = 30;
        }
        return z ? d : Math.max(d / 5, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i) {
        return wbs.av(wbs.av(0, yyf.d, wbs.au(i, yyf.d)), yyf.e, wbs.au(i, yyf.e));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long d(long[] jArr, int i) {
        int d = yxu.d(i);
        int i2 = d >> 6;
        int i3 = d & 63;
        long e = yxu.e(i);
        if (i2 >= jArr.length) {
            return 0L;
        }
        return (jArr[i2] >> i3) & e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(long[] jArr, int i, long j) {
        int d = yxu.d(i);
        int i2 = d >> 6;
        int i3 = d & 63;
        long e = yxu.e(i);
        if (e != -1) {
            j = yjk.z(j, 0L, e);
        }
        jArr[i2] = (j << i3) | (jArr[i2] & ((e << i3) ^ (-1)));
    }

    static long[] p(File file, zfh zfhVar) {
        int read;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                int i = 0;
                do {
                    read = fileInputStream.read(bArr, i, length - i);
                    i += read;
                } while (read != 0);
                long[] jArr = new long[(length + 7) >> 3];
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = i2 >> 3;
                    jArr[i3] = jArr[i3] | ((bArr[i2] & 255) << ((i2 & 7) << 3));
                }
                fileInputStream.close();
                return jArr;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            return null;
        } catch (Throwable unused3) {
            yjk.x(file, zfhVar);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File q(File file) {
        return new File(file, "bootstrap.data.bak");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File r(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            return new File(filesDir, "cfg");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File s(File file) {
        return new File(file, "bootstrap.data");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final long[] t(long[] jArr) {
        if (jArr.length < 8) {
            jArr = Arrays.copyOf(jArr, 8);
        }
        if (((int) d(jArr, b)) <= 0 && d(jArr, w) == 0) {
            m(jArr, w, 534773760L);
        }
        if (jArr.length > 8) {
            jArr = Arrays.copyOf(jArr, 8);
        }
        m(jArr, b, 1L);
        return jArr;
    }

    private static void u(yxs yxsVar, yxs yxsVar2) {
        ScheduledFuture scheduledFuture;
        if (yxsVar == null || (scheduledFuture = yxsVar.h) == null) {
            return;
        }
        if (yxsVar2 == null || scheduledFuture != yxsVar2.h) {
            scheduledFuture.cancel(false);
        }
    }

    private static final long[][] v(String str, String str2) {
        yxp yxpVar = new yxp(str, str2);
        yxpVar.d();
        return new long[][]{yxpVar.a, yxpVar.b};
    }

    @Override // defpackage.yxx
    public final /* synthetic */ int b(yxw yxwVar) {
        return yxu.a(this, yxwVar);
    }

    public final long e(int i) {
        return d(((yxs) this.a.get()).a, i);
    }

    @Override // defpackage.yxx
    public final long f(yxw yxwVar) {
        return e(yxwVar.c);
    }

    @Override // defpackage.yxx
    public final SharedPreferences.Editor g(SharedPreferences.Editor editor, apwy apwyVar, arfd arfdVar) {
        avdj avdjVar = apwyVar.u;
        if (avdjVar == null) {
            avdjVar = avdj.a;
        }
        apev apevVar = avdjVar.g;
        if (apevVar == null) {
            apevVar = apev.a;
        }
        avdz avdzVar = arfdVar.y;
        if (avdzVar == null) {
            avdzVar = avdz.a;
        }
        atej atejVar = apwyVar.k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        avdy avdyVar = atejVar.x;
        if (avdyVar == null) {
            avdyVar = avdy.a;
        }
        asvu asvuVar = apwyVar.e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        atej atejVar2 = apwyVar.k;
        if (atejVar2 == null) {
            atejVar2 = atej.a;
        }
        aqjf aqjfVar = atejVar2.j;
        if (aqjfVar == null) {
            aqjfVar = aqjf.a;
        }
        yxq i = i(32);
        i.b(l, avdzVar.b);
        i.c(k, apevVar.b);
        i.b(j, apevVar.c);
        i.b(n, apevVar.d);
        i.b(w, apevVar.f);
        i.b(h, apevVar.h);
        i.c(m, apevVar.g);
        i.c(o, avdjVar.m);
        i.b(z, avdjVar.n);
        i.b(i, yyy.c(avdyVar));
        int i2 = p;
        atax ataxVar = apwyVar.n;
        if (ataxVar == null) {
            ataxVar = atax.a;
        }
        int cM = amkq.cM(ataxVar.ac);
        if (cM == 0) {
            cM = 1;
        }
        i.b(i2, cM - 1);
        i.b(g, apevVar.e);
        int i3 = q;
        aotz aotzVar = apwyVar.i;
        if (aotzVar == null) {
            aotzVar = aotz.a;
        }
        i.c(i3, aotzVar.d);
        i.c(r, asvuVar.cF);
        i.c(s, asvuVar.E);
        int i4 = t;
        avdk avdkVar = avdyVar.i;
        if (avdkVar == null) {
            avdkVar = avdk.a;
        }
        i.b(i4, avdkVar.m);
        int i5 = u;
        avdj avdjVar2 = apwyVar.u;
        if (avdjVar2 == null) {
            avdjVar2 = avdj.a;
        }
        i.b(i5, (amkq.bM(avdjVar2.s) != 0 ? r1 : 1) - 1);
        i.b(v, aqjfVar.i);
        int i6 = x;
        atij atijVar = apwyVar.g;
        if (atijVar == null) {
            atijVar = atij.a;
        }
        atik atikVar = atijVar.b;
        if (atikVar == null) {
            atikVar = atik.a;
        }
        i.c(i6, atikVar.b);
        i.b(y, avdjVar.u);
        int i7 = A;
        avds avdsVar = avdyVar.o;
        if (avdsVar == null) {
            avdsVar = avds.a;
        }
        avdn avdnVar = avdsVar.b;
        if (avdnVar == null) {
            avdnVar = avdn.a;
        }
        i.b(i7, avdnVar.b);
        int i8 = B;
        avds avdsVar2 = avdyVar.o;
        if (avdsVar2 == null) {
            avdsVar2 = avds.a;
        }
        avdu avduVar = avdsVar2.c;
        if (avduVar == null) {
            avduVar = avdu.a;
        }
        i.b(i8, avduVar.b);
        i.a();
        return editor;
    }

    @Override // defpackage.yxx
    public final SharedPreferences.Editor h(SharedPreferences.Editor editor) {
        yxq i = i(1);
        i.a++;
        i.a();
        return editor;
    }

    public final yxq i(int i) {
        return new yxq(this, i);
    }

    @Override // defpackage.yxx
    public final Object j() {
        yxs yxsVar = (yxs) this.a.get();
        return new long[][]{yxsVar.a, yxsVar.b};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        yxs yxsVar;
        yxr c;
        yxs yxsVar2;
        yxr c2;
        do {
            yxsVar = (yxs) this.a.get();
            if (!yxsVar.c) {
                return;
            }
            c = yxsVar.c();
            c.f(false);
        } while (!n(yxsVar, c));
        synchronized (this) {
            int i = this.ad;
            int i2 = yxsVar.f;
            if (i < i2) {
                this.ad = i2;
                yjk.t(this.X, this.Y, this.Z);
                try {
                    OutputStream w = yjk.w(this.X);
                    try {
                        long[] jArr = yxsVar.b;
                        byte[] bArr = new byte[64];
                        for (int i3 = 0; i3 < 64; i3++) {
                            bArr[i3] = (byte) ((jArr[i3 >> 3] >> ((i3 & 7) << 3)) & 255);
                        }
                        w.write(bArr);
                        w.close();
                        if (this.ac) {
                            yyc.c(yyc.d(this.ab).edit()).apply();
                            this.ac = false;
                        }
                        yjk.x(this.Y, this.Z);
                    } catch (Throwable th) {
                        try {
                            w.close();
                        } catch (Throwable unused) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.Z.a("!serialize", th2);
                    yjk.t(this.Y, this.X, this.Z);
                    do {
                        yxsVar2 = (yxs) this.a.get();
                        if (yxsVar2.c) {
                            break;
                        }
                        c2 = yxsVar2.c();
                        c2.f(true);
                    } while (!n(yxsVar2, c2));
                }
            }
        }
    }

    @Override // defpackage.yxx
    public final void l(int i) {
        yxs yxsVar;
        yxr c;
        do {
            yxsVar = (yxs) this.a.get();
            if (yxsVar.a()) {
                return;
            }
            c = yxsVar.c();
            c.e(i);
        } while (!n(yxsVar, c));
        if (i == 2) {
            k();
        }
    }

    @Override // defpackage.yxx
    public final boolean o(yxw yxwVar) {
        return e(yxwVar.c) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean n(yxs yxsVar, yxr yxrVar) {
        long[] jArr;
        Boolean bool;
        if (yxsVar != null && yxsVar.a()) {
            yxrVar.e(yxsVar.d);
            if (!yxsVar.c) {
                yxrVar.f(false);
            }
        } else if (yxrVar.b() != 0) {
            yxrVar.h = null;
            if (yxrVar.b() == 1) {
                yxrVar.f(false);
            }
        } else {
            Boolean bool2 = yxrVar.c;
            if (bool2 == null) {
                throw new IllegalStateException("Property \"isDirty\" has not been set");
            }
            if (!bool2.booleanValue()) {
                yxrVar.h = null;
            } else if ((yxrVar.h == null || ((yxrVar.a() && (yxsVar == null || !yxs.b(yxsVar.e))) || (yxsVar != null && yxsVar.g != yxrVar.c()))) && yxsVar != null) {
                yxrVar.h = ((ScheduledExecutorService) this.aa.get()).schedule(new Runnable() { // from class: yxo
                    @Override // java.lang.Runnable
                    public final void run() {
                        yxt.this.k();
                    }
                }, yxrVar.a() ? 0 : yxrVar.c(), TimeUnit.SECONDS);
            }
        }
        Integer num = yxrVar.f;
        if (num == null) {
            throw new IllegalStateException("Property \"changeCount\" has not been set");
        }
        yxrVar.d(num.intValue() + 1);
        long[] jArr2 = yxrVar.a;
        if (jArr2 == null || (jArr = yxrVar.b) == null || (bool = yxrVar.c) == null || yxrVar.d == null || yxrVar.e == null || yxrVar.f == null || yxrVar.g == null) {
            StringBuilder sb = new StringBuilder();
            if (yxrVar.a == null) {
                sb.append(" active");
            }
            if (yxrVar.b == null) {
                sb.append(" serialized");
            }
            if (yxrVar.c == null) {
                sb.append(" isDirty");
            }
            if (yxrVar.d == null) {
                sb.append(" disposed");
            }
            if (yxrVar.e == null) {
                sb.append(" shutdownLikely");
            }
            if (yxrVar.f == null) {
                sb.append(" changeCount");
            }
            if (yxrVar.g == null) {
                sb.append(" serialDelaySec");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        yxs yxsVar2 = new yxs(jArr2, jArr, bool.booleanValue(), yxrVar.d.intValue(), yxrVar.e.intValue(), yxrVar.f.intValue(), yxrVar.g.intValue(), yxrVar.h);
        boolean compareAndSet = this.a.compareAndSet(yxsVar, yxsVar2);
        if (compareAndSet) {
            u(yxsVar, yxsVar2);
        } else {
            u(yxsVar2, yxsVar);
        }
        return compareAndSet;
    }
}
