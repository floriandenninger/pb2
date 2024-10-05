package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.lullaby.modules.audio.DeviceInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aofo extends BroadcastReceiver {
    final /* synthetic */ DeviceInfo a;

    public aofo(DeviceInfo deviceInfo) {
        this.a = deviceInfo;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.HEADSET_PLUG")) {
            int intExtra = intent.getIntExtra("state", -1);
            if (intExtra == 0) {
                DeviceInfo deviceInfo = this.a;
                deviceInfo.nativeUpdateHeadphoneStateChange(deviceInfo.a, 2);
            } else if (intExtra == 1) {
                DeviceInfo deviceInfo2 = this.a;
                deviceInfo2.nativeUpdateHeadphoneStateChange(deviceInfo2.a, 1);
            } else {
                DeviceInfo deviceInfo3 = this.a;
                deviceInfo3.nativeUpdateHeadphoneStateChange(deviceInfo3.a, 0);
            }
        }
    }
}
