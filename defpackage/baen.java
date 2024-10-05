package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import org.chromium.base.ApplicationStatus;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class baen extends PhoneStateListener implements badn {
    private final TelephonyManager a;

    public baen() {
        TelephonyManager telephonyManager = (TelephonyManager) ayeq.a.getSystemService("phone");
        this.a = telephonyManager;
        if (telephonyManager.getSimState() != 5) {
            return;
        }
        ApplicationStatus.a(this);
        ApplicationStatus.getStateForApplication();
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        ApplicationStatus.getStateForApplication();
    }
}
