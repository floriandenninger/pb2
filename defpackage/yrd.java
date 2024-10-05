package defpackage;

import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class yrd extends yrg {
    final /* synthetic */ yre a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yrd(yre yreVar, TelephonyManager telephonyManager) {
        super(yreVar.a, telephonyManager);
        this.a = yreVar;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        this.a.e(telephonyDisplayInfo);
        a();
    }
}
