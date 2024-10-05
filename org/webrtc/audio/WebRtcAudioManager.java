package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class WebRtcAudioManager {
    WebRtcAudioManager() {
    }

    private static int a(AudioManager audioManager) {
        String property = audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        if (property == null) {
            return 256;
        }
        return Integer.parseInt(property);
    }

    private static boolean b(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    static AudioManager getAudioManager(Context context) {
        return (AudioManager) context.getSystemService("audio");
    }

    static int getInputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        if (!b(context)) {
            return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, 2) / (i2 + i2);
        }
        return a(audioManager);
    }

    static int getOutputBufferSize(Context context, AudioManager audioManager, int i, int i2) {
        if (!b(context)) {
            return AudioTrack.getMinBufferSize(i, i2 == 1 ? 4 : 12, 2) / (i2 + i2);
        }
        return a(audioManager);
    }

    public static int getSampleRate(AudioManager audioManager) {
        if (!Build.HARDWARE.equals("goldfish") || !Build.BRAND.startsWith("generic_")) {
            String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
            int parseInt = property == null ? 16000 : Integer.parseInt(property);
            StringBuilder sb = new StringBuilder(36);
            sb.append("Sample rate is set to ");
            sb.append(parseInt);
            sb.append(" Hz");
            Logging.a("WebRtcAudioManagerExternal", sb.toString());
            return parseInt;
        }
        Logging.a("WebRtcAudioManagerExternal", "Running emulator, overriding sample rate to 8 kHz.");
        return 8000;
    }
}
