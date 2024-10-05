package defpackage;

import android.content.IntentFilter;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abwg implements abso {
    public final /* synthetic */ abwy a;
    private final /* synthetic */ int b;

    public /* synthetic */ abwg(abwy abwyVar, int i) {
        this.b = i;
        this.a = abwyVar;
    }

    @Override // defpackage.abso
    public final void a(int i) {
        int i2 = this.b;
        if (i2 == 0) {
            this.a.i.b();
            return;
        }
        if (i2 == 1) {
            abwy abwyVar = this.a;
            if (abwyVar.d.d()) {
                abwyVar.c.z();
                return;
            }
            return;
        }
        if (i2 == 2) {
            abwy abwyVar2 = this.a;
            if (i != 0) {
                if (i == 2 || i == 7 || i == 8) {
                    StringBuilder sb = new StringBuilder(54);
                    sb.append("Capture pipeline not configured properly - ");
                    sb.append(i);
                    zga.b(sb.toString());
                    abwyVar2.R = false;
                    abwyVar2.i.m();
                    return;
                }
                StringBuilder sb2 = new StringBuilder(35);
                sb2.append("Error starting capture: ");
                sb2.append(i);
                zga.b(sb2.toString());
                abwyVar2.h(i);
                return;
            }
            abwyVar2.R = false;
            if (abwyVar2.S) {
                if (!abwyVar2.v()) {
                    abwyVar2.c();
                }
                abwp abwpVar = new abwp(abwyVar2);
                abub abubVar = abwyVar2.g;
                abubVar.A = abwpVar;
                abubVar.e(abwyVar2.r);
                abwl abwlVar = new abwl(abwyVar2);
                abtp abtpVar = abwyVar2.b;
                abtpVar.o = abwlVar;
                if (abtpVar.d) {
                    Log.w("CaptureRsrcMonitor", "Resource monitor already running.");
                } else {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
                    intentFilter.addCategory("android.intent.category.DEFAULT");
                    abtpVar.b.registerReceiver(abtpVar.m, intentFilter);
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("android.intent.action.SCREEN_ON");
                    intentFilter2.addAction("android.intent.action.SCREEN_OFF");
                    intentFilter2.addCategory("android.intent.category.DEFAULT");
                    abtpVar.b.registerReceiver(abtpVar.n, intentFilter2);
                    abvt.b().f(assb.class, abtp.class, abtpVar);
                    abtpVar.d = true;
                }
                long j = abwyVar2.I;
                if (j == 0 || abwyVar2.f26J > 0) {
                    j = abwyVar2.h.d() - abwyVar2.f26J;
                    abwyVar2.I = j;
                }
                abwyVar2.c.x(j);
                abvt.b().j(asrx.class, abwy.a);
                return;
            }
            return;
        }
        abxc abxcVar = this.a.i;
        abxcVar.k = false;
        abxcVar.h();
    }
}
