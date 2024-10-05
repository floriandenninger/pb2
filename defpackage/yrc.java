package defpackage;

import android.telephony.ServiceState;
import android.telephony.TelephonyManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yrc implements yrf {
    final /* synthetic */ yrh a;
    private ammv b = amlr.a;

    public yrc(yrh yrhVar) {
        this.a = yrhVar;
    }

    private static final boolean f(String str) {
        return str.contains("nrState=CONNECTED") || str.contains("nrState=NOT_RESTRICTED");
    }

    @Override // defpackage.yrf
    public final void a() {
        e(null);
    }

    @Override // defpackage.yrf
    public final void b(TelephonyManager telephonyManager) {
        try {
            telephonyManager.listen(new yrb(this, telephonyManager), 1);
        } catch (RuntimeException e) {
            zga.d("TelephonyManager threw error when registering listener.", e);
            this.a.d = false;
        }
    }

    @Override // defpackage.yrf
    public final boolean c() {
        return this.a.d() && f((String) this.b.e(""));
    }

    @Override // defpackage.yrf
    public final boolean d() {
        return this.a.d() && this.a.d() && ((String) this.b.e("")).contains("mNrFrequencyRange=4");
    }

    public final void e(ServiceState serviceState) {
        synchronized (this.a) {
            if (serviceState == null) {
                this.b = amlr.a;
                this.a.c.c(false);
            } else {
                String serviceState2 = serviceState.toString();
                this.b = ammv.j(serviceState2);
                this.a.c.c(Boolean.valueOf(f(serviceState2)));
            }
        }
    }
}
