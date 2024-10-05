package com.google.vr.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.util.Log;
import defpackage.axfc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DeviceInfo {
    public final long a;
    private final Context b;
    private final BroadcastReceiver c = new axfc(this);

    private DeviceInfo(long j, Context context) {
        this.a = j;
        this.b = context;
    }

    private static DeviceInfo createDeviceInfo(long j, Context context) {
        return new DeviceInfo(j, context);
    }

    private int getSystemBufferSize() {
        String property = ((AudioManager) this.b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            Log.w("DeviceInfo", "Could not obtain system buffer size, defaulting to 256");
            return 256;
        }
        return Integer.parseInt(property);
    }

    private int getSystemSampleRate() {
        String property = ((AudioManager) this.b.getSystemService("audio")).getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            Log.w("DeviceInfo", "Could not obtain system sample rate, defaulting to 48000");
            return 48000;
        }
        return Integer.parseInt(property);
    }

    private boolean isBluetoothAudioDevicePluggedIn() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.b.getSystemService("audio")).getDevices(2)) {
            if (audioDeviceInfo.getType() == 8) {
                return true;
            }
        }
        return false;
    }

    private boolean isHeadphonePluggedIn() {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) this.b.getSystemService("audio")).getDevices(2)) {
            if (audioDeviceInfo.getType() == 4 || audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22) {
                return true;
            }
        }
        return false;
    }

    private void registerHandlers() {
        this.b.registerReceiver(this.c, new IntentFilter("android.intent.action.HEADSET_PLUG"));
    }

    private void unregisterHandlers() {
        this.b.unregisterReceiver(this.c);
    }

    public native void nativeUpdateHeadphoneStateChange(long j, int i);
}
