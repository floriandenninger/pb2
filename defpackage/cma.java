package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.BillingClientNativeCallback;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cma {
    public volatile int a;
    public final String b;
    public final Handler c;
    public volatile cly d;
    public Context e;
    public volatile cmh f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public ExecutorService o;
    public volatile cna p;
    private boolean q;
    private final String r;

    public cma() {
    }

    private final void d(final cmn cmnVar) {
        if (Thread.interrupted()) {
            return;
        }
        this.c.post(new Runnable() { // from class: cmd
            @Override // java.lang.Runnable
            public final void run() {
                cma cmaVar = cma.this;
                cmn cmnVar2 = cmnVar;
                BillingClientNativeCallback billingClientNativeCallback = cmaVar.d.b.d;
                if (cmaVar.d.a() != null) {
                    cmaVar.d.a().b(cmnVar2, amru.q());
                } else {
                    cms.f("BillingClient", "No valid listener is set in BroadcastManager");
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x030c A[Catch: Exception -> 0x034c, CancellationException -> 0x034e, TimeoutException -> 0x0350, TryCatch #6 {CancellationException -> 0x034e, TimeoutException -> 0x0350, Exception -> 0x034c, blocks: (B:103:0x0302, B:105:0x030c, B:107:0x0332), top: B:102:0x0302 }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0332 A[Catch: Exception -> 0x034c, CancellationException -> 0x034e, TimeoutException -> 0x0350, TRY_LEAVE, TryCatch #6 {CancellationException -> 0x034e, TimeoutException -> 0x0350, Exception -> 0x034c, blocks: (B:103:0x0302, B:105:0x030c, B:107:0x0332), top: B:102:0x0302 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cmn a(android.app.Activity r30, defpackage.cml r31) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cma.a(android.app.Activity, cml):cmn");
    }

    public final Future b(Callable callable, long j, final Runnable runnable, Handler handler) {
        double d = j;
        Double.isNaN(d);
        long j2 = (long) (d * 0.95d);
        if (this.o == null) {
            this.o = Executors.newFixedThreadPool(cms.a, new ebb(1, null));
        }
        try {
            final Future submit = this.o.submit(callable);
            handler.postDelayed(new Runnable() { // from class: cme
                @Override // java.lang.Runnable
                public final void run() {
                    Future future = submit;
                    Runnable runnable2 = runnable;
                    if (future.isDone() || future.isCancelled()) {
                        return;
                    }
                    future.cancel(true);
                    cms.f("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }, j2);
            return submit;
        } catch (Exception e) {
            cms.g("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public final boolean c() {
        return (this.a != 2 || this.p == null || this.f == null) ? false : true;
    }

    public cma(String str, boolean z, Context context, cmq cmqVar) {
        String str2;
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.h = 0;
        this.r = str;
        try {
            str2 = (String) Class.forName("com.android.billingclient.ktx.BuildConfig").getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str2 = "4.1.0-prepaid-eap-1";
        }
        this.b = str2;
        this.e = context.getApplicationContext();
        this.d = new cly(this.e, cmqVar);
        this.q = z;
    }
}
