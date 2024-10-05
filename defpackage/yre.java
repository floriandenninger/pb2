package defpackage;

import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yre implements yrf {
    final /* synthetic */ yrh a;
    private boolean b;
    private boolean c;

    public yre(yrh yrhVar) {
        this.a = yrhVar;
    }

    @Override // defpackage.yrf
    public final void a() {
        e(null);
    }

    @Override // defpackage.yrf
    public final void b(TelephonyManager telephonyManager) {
        try {
            telephonyManager.listen(new yrd(this, telephonyManager), 1048576);
        } catch (RuntimeException e) {
            zga.d("TelephonyManager threw error when registering listener.", e);
            this.a.d = false;
        }
    }

    @Override // defpackage.yrf
    public final boolean c() {
        return this.a.d() && this.c;
    }

    @Override // defpackage.yrf
    public final boolean d() {
        return this.a.d() && this.b;
    }

    public final void e(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z;
        synchronized (this.a) {
            if (telephonyDisplayInfo == null) {
                this.c = false;
                this.b = false;
                this.a.c.c(false);
            } else {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                if (overrideNetworkType != 4) {
                    if (overrideNetworkType == 5) {
                        overrideNetworkType = 5;
                    } else {
                        z = false;
                        this.b = z;
                        boolean z2 = !z || overrideNetworkType == 3;
                        this.c = z2;
                        this.a.c.c(Boolean.valueOf(z2));
                    }
                }
                z = true;
                this.b = z;
                if (z) {
                }
                this.c = z2;
                this.a.c.c(Boolean.valueOf(z2));
            }
        }
    }
}
