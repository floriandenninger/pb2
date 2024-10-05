package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
class yrg extends PhoneStateListener {
    private final TelephonyManager a;
    final /* synthetic */ yrh b;

    public yrg(yrh yrhVar, TelephonyManager telephonyManager) {
        this.b = yrhVar;
        this.a = telephonyManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        yrh yrhVar;
        try {
            try {
                this.a.listen(this, 0);
                yrhVar = this.b;
            } catch (RuntimeException e) {
                zga.d("TelephonyManager threw error when unregistering listener.", e);
                yrhVar = this.b;
            }
            yrhVar.d = false;
        } catch (Throwable th) {
            this.b.d = false;
            throw th;
        }
    }
}
