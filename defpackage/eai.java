package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eai implements Runnable, ead {
    public Context b;
    public final qxe c;
    public final dve d;
    public final boolean e;
    private final Executor g;
    private final boolean h;
    public final AtomicReference a = new AtomicReference();
    CountDownLatch f = new CountDownLatch(1);
    private final List i = new ArrayList();

    public eai(Context context, Executor executor, dve dveVar) {
        boolean z = true;
        this.d = dveVar;
        this.b = context;
        this.g = executor;
        pyi.b(context);
        boolean booleanValue = ((Boolean) pyi.c.e()).booleanValue();
        this.e = booleanValue;
        qxe a = qxe.a(context, executor, booleanValue);
        this.c = a;
        Context context2 = this.b;
        qxv qxvVar = new qxv(this.b, rbd.n(context2, a), new eah(this), ((Boolean) pyi.b.e()).booleanValue());
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (qxv.a) {
            eco g = qxvVar.g(1);
            if (g != null) {
                File a2 = qxvVar.a(g.c);
                if (!new File(a2, "pcam.jar").exists()) {
                    qxvVar.e(4026, currentTimeMillis);
                } else if (!new File(a2, "pcbc").exists()) {
                    qxvVar.e(4027, currentTimeMillis);
                } else {
                    qxvVar.e(5019, currentTimeMillis);
                }
            } else {
                qxvVar.e(4025, currentTimeMillis);
            }
            z = false;
        }
        this.h = z;
        executor.execute(this);
    }

    public static final Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private final void b() {
        if (this.i.isEmpty() || this.a.get() == null) {
            return;
        }
        for (Object[] objArr : this.i) {
            int length = objArr.length;
            if (length == 1) {
                ((ead) this.a.get()).h((MotionEvent) objArr[0]);
            } else if (length == 3) {
                ((ead) this.a.get()).i(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.i.clear();
    }

    private final void j() {
        this.a.set(eak.p(this.d.e, a(this.b), this.d.f));
    }

    @Override // defpackage.ead
    @Deprecated
    public final String c(Context context, String str) {
        return d(context, str, null, null);
    }

    @Override // defpackage.ead
    @Deprecated
    public final String d(Context context, String str, View view, Activity activity) {
        if (!o()) {
            return "";
        }
        b();
        return ((ead) this.a.get()).d(a(context), str, view, activity);
    }

    @Override // defpackage.ead
    public final String e(Context context) {
        return f(context, null);
    }

    @Override // defpackage.ead
    public final String f(Context context, byte[] bArr) {
        if (!o()) {
            return "";
        }
        b();
        return ((ead) this.a.get()).e(a(context));
    }

    @Override // defpackage.ead
    public final String g(Context context, View view, Activity activity) {
        return o() ? ((ead) this.a.get()).g(context, view, activity) : "";
    }

    @Override // defpackage.ead
    public final void h(MotionEvent motionEvent) {
        if (this.a.get() != null) {
            b();
            ((ead) this.a.get()).h(motionEvent);
        } else {
            this.i.add(new Object[]{motionEvent});
        }
    }

    @Override // defpackage.ead
    public final void i(int i, int i2, int i3) {
        if (this.a.get() == null) {
            this.i.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            b();
            ((ead) this.a.get()).i(i, i2, i3);
        }
    }

    @Override // defpackage.ead
    public final void k(View view) {
        if (this.a.get() != null) {
            ((ead) this.a.get()).k(view);
        }
    }

    @Override // defpackage.ead
    public final boolean m() {
        return this.f.getCount() == 0 && this.a.get() != null && ((ead) this.a.get()).m();
    }

    @Override // defpackage.ead
    public final boolean o() {
        try {
            this.f.await();
            if (this.a.get() != null) {
                return ((ead) this.a.get()).o();
            }
            return false;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028 A[Catch: all -> 0x0075, NullPointerException -> 0x0077, TryCatch #1 {NullPointerException -> 0x0077, blocks: (B:3:0x0005, B:6:0x0010, B:9:0x0024, B:11:0x0028, B:19:0x0038, B:20:0x0043, B:22:0x0064, B:24:0x006a, B:25:0x0018, B:27:0x001c), top: B:2:0x0005, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043 A[Catch: all -> 0x0075, NullPointerException -> 0x0077, TryCatch #1 {NullPointerException -> 0x0077, blocks: (B:3:0x0005, B:6:0x0010, B:9:0x0024, B:11:0x0028, B:19:0x0038, B:20:0x0043, B:22:0x0064, B:24:0x006a, B:25:0x0018, B:27:0x001c), top: B:2:0x0005, outer: #0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            dve r3 = r8.d     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            int r3 = r3.c     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            int r3 = defpackage.esv.L(r3)     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            if (r3 != 0) goto L10
            r3 = 1
        L10:
            int r3 = r3 + (-1)
            r4 = 3
            r5 = 2
            if (r3 == r5) goto L18
        L16:
            r3 = 2
            goto L24
        L18:
            boolean r3 = r8.h     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            if (r3 != 0) goto L23
            dve r3 = r8.d     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            boolean r3 = r3.d     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            if (r3 == 0) goto L23
            goto L16
        L23:
            r3 = 3
        L24:
            int r3 = r3 + (-1)
            if (r3 == r5) goto L43
            r8.j()     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            dve r3 = r8.d     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            int r3 = r3.c     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            int r3 = defpackage.esv.L(r3)     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            if (r3 != 0) goto L36
            goto L6d
        L36:
            if (r3 != r4) goto L6d
            java.util.concurrent.Executor r3 = r8.g     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            eag r4 = new eag     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            r4.<init>()     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            r3.execute(r4)     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            goto L6d
        L43:
            dve r3 = r8.d     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            java.lang.String r3 = r3.e     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            android.content.Context r4 = r8.b     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            android.content.Context r4 = a(r4)     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            java.util.concurrent.Executor r5 = r8.g     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            dve r6 = r8.d     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            boolean r6 = r6.f     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            boolean r7 = r8.e     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            eaa r3 = defpackage.eaa.b(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            java.util.concurrent.atomic.AtomicReference r4 = r8.a     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            r4.set(r3)     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            boolean r3 = r3.n()     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            if (r3 != 0) goto L6d
            dve r3 = r8.d     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            boolean r3 = r3.d     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            if (r3 == 0) goto L6d
            r8.j()     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
        L6d:
            r8.b = r2
            java.util.concurrent.CountDownLatch r0 = r8.f
        L71:
            r0.countDown()
            return
        L75:
            r0 = move-exception
            goto L92
        L77:
            r3 = move-exception
            dve r4 = r8.d     // Catch: java.lang.Throwable -> L75
            boolean r4 = r4.d     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L81
            r8.j()     // Catch: java.lang.Throwable -> L75
        L81:
            qxe r4 = r8.c     // Catch: java.lang.Throwable -> L75
            r5 = 2031(0x7ef, float:2.846E-42)
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L75
            long r6 = r6 - r0
            r4.c(r5, r6, r3)     // Catch: java.lang.Throwable -> L75
            r8.b = r2
            java.util.concurrent.CountDownLatch r0 = r8.f
            goto L71
        L92:
            r8.b = r2
            java.util.concurrent.CountDownLatch r1 = r8.f
            r1.countDown()
            goto L9b
        L9a:
            throw r0
        L9b:
            goto L9a
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eai.run():void");
    }
}
