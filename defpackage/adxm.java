package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adxm implements adxl {
    private final AudioManager a;
    private final Context b;

    public adxm(Context context) {
        this.a = (AudioManager) context.getSystemService("audio");
        this.b = context;
    }

    @Override // defpackage.adxl
    public final atwo a() {
        if ((this.b.getResources().getConfiguration().uiMode & 15) == 3) {
            return atwo.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_ANDROID_AUDIO;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return atwo.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_UNKNOWN;
        }
        amsx p = amsx.p(amkq.bF(c(), adpv.g));
        if (p.contains(8)) {
            return atwo.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_A2DP;
        }
        if (p.contains(7)) {
            return atwo.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_HFP;
        }
        if (p.contains(22) || p.contains(4)) {
            return atwo.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_HEADPHONES;
        }
        if (p.contains(5) || p.contains(6) || p.contains(13)) {
            return atwo.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_LINE_OUT;
        }
        if (p.contains(3)) {
            return atwo.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_HEADPHONES;
        }
        if (p.contains(12) || p.contains(11)) {
            return atwo.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_USB_AUDIO;
        }
        if (p.contains(9)) {
            return atwo.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_HDMI;
        }
        if (p.contains(23)) {
            return atwo.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BLUETOOTH_LE;
        }
        if (p.contains(2)) {
            return atwo.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_BUILT_IN_SPEAKER;
        }
        return atwo.PLAYBACK_AUDIO_ROUTE_OUTPUT_TYPE_UNKNOWN;
    }

    @Override // defpackage.adxl
    public final void b(AudioDeviceCallback audioDeviceCallback) {
        this.a.registerAudioDeviceCallback(audioDeviceCallback, null);
    }

    public final amru c() {
        amrp f = amru.f();
        try {
            for (AudioDeviceInfo audioDeviceInfo : this.a.getDevices(2)) {
                f.h(new adxk(audioDeviceInfo));
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
            afsi.b(2, 6, "AudioManager#getDevices throws ArrayIndexOutOfBoundsException.");
        }
        return f.g();
    }
}
