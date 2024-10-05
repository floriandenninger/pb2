package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abui implements absi {
    public static final int[] a = {1152000, 512000, 0};
    public static final int[] b = {384000, 128000, 32000};
    public final abzy c;
    public final Handler d = new Handler(Looper.getMainLooper());
    private final acaf e;
    private final Handler f;
    private final abuh g;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public abui(int r12, int r13, int r14, defpackage.abzy r15, defpackage.acaf r16, java.util.concurrent.ScheduledExecutorService r17, android.os.Handler r18, defpackage.shf r19) {
        /*
            r11 = this;
            r0 = r11
            r7 = r13
            r3 = r15
            r11.<init>()
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.d = r1
            r15.getClass()
            r0.c = r3
            r18.getClass()
            r4 = r18
            r0.f = r4
            r16.getClass()
            r2 = r16
            r0.e = r2
            r1 = 1
            r5 = 0
            r8 = r12
            if (r8 > r7) goto L2e
            r9 = r14
            if (r7 > r9) goto L2f
            r6 = 1
            goto L30
        L2e:
            r9 = r14
        L2f:
            r6 = 0
        L30:
            defpackage.amkq.E(r6)
            if (r7 <= 0) goto L36
            goto L37
        L36:
            r1 = 0
        L37:
            defpackage.amkq.E(r1)
            int r1 = r15.b()
            if (r1 == r7) goto L43
            r15.a(r13)
        L43:
            abuh r10 = new abuh
            r1 = r10
            r2 = r16
            r3 = r15
            r4 = r18
            r5 = r17
            r6 = r19
            r7 = r13
            r8 = r12
            r9 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.g = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abui.<init>(int, int, int, abzy, acaf, java.util.concurrent.ScheduledExecutorService, android.os.Handler, shf):void");
    }

    @Override // defpackage.absi
    public final long a() {
        return this.e.d();
    }

    @Override // defpackage.absi
    public final void b(absy absyVar) {
    }

    @Override // defpackage.absi
    public final void c(final int i, final abvu abvuVar) {
        this.f.post(new Runnable() { // from class: abue
            @Override // java.lang.Runnable
            public final void run() {
                abui abuiVar = abui.this;
                int i2 = i;
                abvu abvuVar2 = abvuVar;
                abuiVar.c.a(i2);
                abuiVar.d.post(new abud(abvuVar2, 0));
            }
        });
    }

    @Override // defpackage.absi
    public final void d(boolean z) {
        if (!z) {
            abuh abuhVar = this.g;
            ScheduledFuture scheduledFuture = abuhVar.e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                abuhVar.e = null;
                return;
            }
            return;
        }
        abuh abuhVar2 = this.g;
        if (abuhVar2.e != null) {
            return;
        }
        abuhVar2.g = abuh.a(abuhVar2.f);
        abuhVar2.c.post(new abuf(abuhVar2));
        if (abuhVar2.e == null) {
            abuhVar2.e = abuhVar2.d.scheduleWithFixedDelay(abuhVar2, 1L, 1L, TimeUnit.SECONDS);
        }
    }

    @Override // defpackage.absi
    public final void e(int i) {
    }
}
