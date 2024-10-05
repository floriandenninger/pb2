package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cmh implements ServiceConnection {
    public final Object a = new Object();
    public boolean b = false;
    public cmi c;
    final /* synthetic */ cma d;

    public cmh(cma cmaVar, cmi cmiVar) {
        this.d = cmaVar;
        this.c = cmiVar;
    }

    public final void a(cmn cmnVar) {
        synchronized (this.a) {
            cmi cmiVar = this.c;
            if (cmiVar != null) {
                cmiVar.a(cmnVar);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        cna cnaVar;
        cmn cmnVar;
        int i = cms.a;
        cma cmaVar = this.d;
        if (iBinder == null) {
            cnaVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (queryLocalInterface instanceof cna) {
                cnaVar = (cna) queryLocalInterface;
            } else {
                cnaVar = new cna(iBinder);
            }
        }
        cmaVar.p = cnaVar;
        if (this.d.b(new Callable() { // from class: cmg
            /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 206
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cmg.call():java.lang.Object");
            }
        }, 30000L, new Runnable() { // from class: cmf
            @Override // java.lang.Runnable
            public final void run() {
                cmh cmhVar = cmh.this;
                cmhVar.d.a = 0;
                cmhVar.d.p = null;
                cmhVar.a(cmo.i);
            }
        }, Looper.myLooper() == null ? this.d.c : new Handler(Looper.myLooper())) == null) {
            cma cmaVar2 = this.d;
            if (cmaVar2.a == 0 || cmaVar2.a == 3) {
                cmnVar = cmo.h;
            } else {
                cmnVar = cmo.f;
            }
            a(cmnVar);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        cms.f("BillingClient", "Billing service disconnected.");
        this.d.p = null;
        this.d.a = 0;
        synchronized (this.a) {
            cmi cmiVar = this.c;
            if (cmiVar != null) {
                zga.h(ydq.a, "Play billing client disconnected");
                ((ydq) cmiVar).h();
            }
        }
    }
}
