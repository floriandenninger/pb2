package org.webrtc.voiceengine;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class WebRtcAudioUtils {
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final String TAG = "WebRtcAudioUtils";
    private static int defaultSampleRateHz = 16000;
    private static boolean isDefaultSampleRateOverridden;
    private static boolean useWebRtcBasedAcousticEchoCanceler;
    private static boolean useWebRtcBasedNoiseSuppressor;
    private static final String[] BLACKLISTED_OPEN_SL_ES_MODELS = new String[0];
    private static final String[] BLACKLISTED_AEC_MODELS = new String[0];
    private static final String[] BLACKLISTED_NS_MODELS = new String[0];

    public static boolean deviceIsBlacklistedForOpenSLESUsage() {
        return Arrays.asList(BLACKLISTED_OPEN_SL_ES_MODELS).contains(Build.MODEL);
    }

    private static String deviceTypeToString(int i) {
        switch (i) {
            case 1:
                return "TYPE_BUILTIN_EARPIECE";
            case 2:
                return "TYPE_BUILTIN_SPEAKER";
            case 3:
                return "TYPE_WIRED_HEADSET";
            case 4:
                return "TYPE_WIRED_HEADPHONES";
            case 5:
                return "TYPE_LINE_ANALOG";
            case 6:
                return "TYPE_LINE_DIGITAL";
            case 7:
                return "TYPE_BLUETOOTH_SCO";
            case 8:
                return "TYPE_BLUETOOTH_A2DP";
            case 9:
                return "TYPE_HDMI";
            case 10:
                return "TYPE_HDMI_ARC";
            case 11:
                return "TYPE_USB_DEVICE";
            case 12:
                return "TYPE_USB_ACCESSORY";
            case 13:
                return "TYPE_DOCK";
            case 14:
                return "TYPE_FM";
            case 15:
                return "TYPE_BUILTIN_MIC";
            case 16:
                return "TYPE_FM_TUNER";
            case 17:
                return "TYPE_TV_TUNER";
            case 18:
                return "TYPE_TELEPHONY";
            case 19:
                return "TYPE_AUX_LINE";
            case 20:
                return "TYPE_IP";
            case 21:
                return "TYPE_BUS";
            case 22:
                return "TYPE_USB_HEADSET";
            default:
                return "TYPE_UNKNOWN";
        }
    }

    public static List getBlackListedModelsForAecUsage() {
        return Arrays.asList(BLACKLISTED_AEC_MODELS);
    }

    public static List getBlackListedModelsForNsUsage() {
        return Arrays.asList(BLACKLISTED_NS_MODELS);
    }

    public static synchronized int getDefaultSampleRateHz() {
        int i;
        synchronized (WebRtcAudioUtils.class) {
            i = defaultSampleRateHz;
        }
        return i;
    }

    public static String getThreadInfo() {
        String name = Thread.currentThread().getName();
        long id = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 33);
        sb.append("@[name=");
        sb.append(name);
        sb.append(", id=");
        sb.append(id);
        sb.append("]");
        return sb.toString();
    }

    private static boolean hasMicrophone() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.microphone");
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    public static boolean isAutomaticGainControlSupported() {
        return false;
    }

    public static synchronized boolean isDefaultSampleRateOverridden() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            z = isDefaultSampleRateOverridden;
        }
        return z;
    }

    public static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private static boolean isVolumeFixed(AudioManager audioManager) {
        return audioManager.isVolumeFixed();
    }

    private static void logAudioDeviceInfo(String str, AudioManager audioManager) {
        AudioDeviceInfo[] devices;
        int length;
        if (Build.VERSION.SDK_INT >= 23 && (length = (devices = audioManager.getDevices(3)).length) != 0) {
            Logging.a(str, "Audio Devices: ");
            for (int i = 0; i < length; i++) {
                AudioDeviceInfo audioDeviceInfo = devices[i];
                StringBuilder sb = new StringBuilder();
                sb.append("  ");
                sb.append(deviceTypeToString(audioDeviceInfo.getType()));
                sb.append(true != audioDeviceInfo.isSource() ? "(out): " : "(in): ");
                if (audioDeviceInfo.getChannelCounts().length > 0) {
                    sb.append("channels=");
                    sb.append(Arrays.toString(audioDeviceInfo.getChannelCounts()));
                    sb.append(", ");
                }
                if (audioDeviceInfo.getEncodings().length > 0) {
                    sb.append("encodings=");
                    sb.append(Arrays.toString(audioDeviceInfo.getEncodings()));
                    sb.append(", ");
                }
                if (audioDeviceInfo.getSampleRates().length > 0) {
                    sb.append("sample rates=");
                    sb.append(Arrays.toString(audioDeviceInfo.getSampleRates()));
                    sb.append(", ");
                }
                sb.append("id=");
                sb.append(audioDeviceInfo.getId());
                Logging.a(str, sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void logAudioState(String str) {
        logDeviceInfo(str);
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        logAudioStateBasic(str, audioManager);
        logAudioStateVolume(str, audioManager);
        logAudioDeviceInfo(str, audioManager);
    }

    private static void logAudioStateBasic(String str, AudioManager audioManager) {
        String modeToString = modeToString(audioManager.getMode());
        boolean hasMicrophone = hasMicrophone();
        boolean isMicrophoneMute = audioManager.isMicrophoneMute();
        boolean isMusicActive = audioManager.isMusicActive();
        boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        boolean isBluetoothScoOn = audioManager.isBluetoothScoOn();
        StringBuilder sb = new StringBuilder(modeToString.length() + 116);
        sb.append("Audio State: audio mode: ");
        sb.append(modeToString);
        sb.append(", has mic: ");
        sb.append(hasMicrophone);
        sb.append(", mic muted: ");
        sb.append(isMicrophoneMute);
        sb.append(", music active: ");
        sb.append(isMusicActive);
        sb.append(", speakerphone: ");
        sb.append(isSpeakerphoneOn);
        sb.append(", BT SCO: ");
        sb.append(isBluetoothScoOn);
        Logging.a(str, sb.toString());
    }

    private static void logAudioStateVolume(String str, AudioManager audioManager) {
        int[] iArr = {0, 3, 2, 4, 5, 1};
        Logging.a(str, "Audio State: ");
        boolean isVolumeFixed = isVolumeFixed(audioManager);
        StringBuilder sb = new StringBuilder(20);
        sb.append("  fixed volume=");
        sb.append(isVolumeFixed);
        Logging.a(str, sb.toString());
        if (isVolumeFixed) {
            return;
        }
        for (int i = 0; i < 6; i++) {
            int i2 = iArr[i];
            StringBuilder sb2 = new StringBuilder();
            String streamTypeToString = streamTypeToString(i2);
            StringBuilder sb3 = new StringBuilder(streamTypeToString.length() + 4);
            sb3.append("  ");
            sb3.append(streamTypeToString);
            sb3.append(": ");
            sb2.append(sb3.toString());
            sb2.append("volume=");
            sb2.append(audioManager.getStreamVolume(i2));
            sb2.append(", max=");
            sb2.append(audioManager.getStreamMaxVolume(i2));
            logIsStreamMute(str, audioManager, i2, sb2);
            Logging.a(str, sb2.toString());
        }
    }

    static void logDeviceInfo(String str) {
        int i = Build.VERSION.SDK_INT;
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.BRAND;
        String str4 = Build.DEVICE;
        String str5 = Build.ID;
        String str6 = Build.HARDWARE;
        String str7 = Build.MANUFACTURER;
        String str8 = Build.MODEL;
        String str9 = Build.PRODUCT;
        int length = String.valueOf(str2).length();
        int length2 = String.valueOf(str3).length();
        int length3 = String.valueOf(str4).length();
        int length4 = String.valueOf(str5).length();
        int length5 = String.valueOf(str6).length();
        int length6 = String.valueOf(str7).length();
        StringBuilder sb = new StringBuilder(length + 108 + length2 + length3 + length4 + length5 + length6 + String.valueOf(str8).length() + String.valueOf(str9).length());
        sb.append("Android SDK: ");
        sb.append(i);
        sb.append(", Release: ");
        sb.append(str2);
        sb.append(", Brand: ");
        sb.append(str3);
        sb.append(", Device: ");
        sb.append(str4);
        sb.append(", Id: ");
        sb.append(str5);
        sb.append(", Hardware: ");
        sb.append(str6);
        sb.append(", Manufacturer: ");
        sb.append(str7);
        sb.append(", Model: ");
        sb.append(str8);
        sb.append(", Product: ");
        sb.append(str9);
        Logging.a(str, sb.toString());
    }

    private static void logIsStreamMute(String str, AudioManager audioManager, int i, StringBuilder sb) {
        if (Build.VERSION.SDK_INT >= 23) {
            sb.append(", muted=");
            sb.append(audioManager.isStreamMute(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String modeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "MODE_INVALID" : "MODE_IN_COMMUNICATION" : "MODE_IN_CALL" : "MODE_RINGTONE" : "MODE_NORMAL";
    }

    public static boolean runningOnEmulator() {
        return Build.HARDWARE.equals("goldfish") && Build.BRAND.startsWith("generic_");
    }

    public static synchronized void setDefaultSampleRateHz(int i) {
        synchronized (WebRtcAudioUtils.class) {
            isDefaultSampleRateOverridden = true;
            defaultSampleRateHz = i;
        }
    }

    public static synchronized void setWebRtcBasedAcousticEchoCanceler(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedAcousticEchoCanceler = z;
        }
    }

    public static synchronized void setWebRtcBasedAutomaticGainControl(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            Logging.d(TAG, "setWebRtcBasedAutomaticGainControl() is deprecated");
        }
    }

    public static synchronized void setWebRtcBasedNoiseSuppressor(boolean z) {
        synchronized (WebRtcAudioUtils.class) {
            useWebRtcBasedNoiseSuppressor = z;
        }
    }

    private static String streamTypeToString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "STREAM_INVALID" : "STREAM_NOTIFICATION" : "STREAM_ALARM" : "STREAM_MUSIC" : "STREAM_RING" : "STREAM_SYSTEM" : "STREAM_VOICE_CALL";
    }

    public static synchronized boolean useWebRtcBasedAcousticEchoCanceler() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            if (useWebRtcBasedAcousticEchoCanceler) {
                Logging.d(TAG, "Overriding default behavior; now using WebRTC AEC!");
            }
            z = useWebRtcBasedAcousticEchoCanceler;
        }
        return z;
    }

    public static synchronized boolean useWebRtcBasedAutomaticGainControl() {
        synchronized (WebRtcAudioUtils.class) {
        }
        return true;
    }

    public static synchronized boolean useWebRtcBasedNoiseSuppressor() {
        boolean z;
        synchronized (WebRtcAudioUtils.class) {
            if (useWebRtcBasedNoiseSuppressor) {
                Logging.d(TAG, "Overriding default behavior; now using WebRTC NS!");
            }
            z = useWebRtcBasedNoiseSuppressor;
        }
        return z;
    }
}
