package defpackage;

import android.telephony.ServiceState;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yrb extends yrg {
    final /* synthetic */ yrc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrb(yrc yrcVar, TelephonyManager telephonyManager) {
        super(yrcVar.a, telephonyManager);
        this.a = yrcVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        this.a.e(serviceState);
        a();
    }
}
