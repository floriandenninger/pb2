package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aaqn extends PhoneStateListener {
    final /* synthetic */ aaqo a;

    public aaqn(aaqo aaqoVar) {
        this.a = aaqoVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        aaqo aaqoVar = this.a;
        aaqoVar.d.set(aaqoVar.a());
    }
}
