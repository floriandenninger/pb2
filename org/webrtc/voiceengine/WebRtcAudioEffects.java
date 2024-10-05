package org.webrtc.voiceengine;

import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import java.util.UUID;
import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class WebRtcAudioEffects {
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffects";
    private static AudioEffect.Descriptor[] cachedEffects;
    private AcousticEchoCanceler aec;
    private NoiseSuppressor ns;
    private boolean shouldEnableAec;
    private boolean shouldEnableNs;

    private WebRtcAudioEffects() {
        String valueOf = String.valueOf(WebRtcAudioUtils.getThreadInfo());
        Logging.a(TAG, valueOf.length() != 0 ? "ctor".concat(valueOf) : new String("ctor"));
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z = false;
        if (isAcousticEchoCancelerSupported() && !WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() && !isAcousticEchoCancelerBlacklisted() && !isAcousticEchoCancelerExcludedByUUID()) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("canUseAcousticEchoCanceler: ");
        sb.append(z);
        Logging.a(TAG, sb.toString());
        return z;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z = false;
        if (isNoiseSuppressorSupported() && !WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() && !isNoiseSuppressorBlacklisted() && !isNoiseSuppressorExcludedByUUID()) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("canUseNoiseSuppressor: ");
        sb.append(z);
        Logging.a(TAG, sb.toString());
        return z;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    private boolean effectTypeIsVoIP(UUID uuid) {
        if (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) {
            return true;
        }
        return AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported();
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        boolean contains = WebRtcAudioUtils.getBlackListedModelsForAecUsage().contains(Build.MODEL);
        if (contains) {
            Logging.d(TAG, String.valueOf(Build.MODEL).concat(" is blacklisted for HW AEC usage!"));
        }
        return contains;
    }

    private static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        boolean contains = WebRtcAudioUtils.getBlackListedModelsForNsUsage().contains(Build.MODEL);
        if (contains) {
            Logging.d(TAG, String.valueOf(Build.MODEL).concat(" is blacklisted for HW NS usage!"));
        }
        return contains;
    }

    private static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    private static boolean isNoiseSuppressorExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public void enable(int i) {
        StringBuilder sb = new StringBuilder(32);
        sb.append("enable(audioSession=");
        sb.append(i);
        sb.append(")");
        Logging.a(TAG, sb.toString());
        boolean z = false;
        assertTrue(this.aec == null);
        assertTrue(this.ns == null);
        if (isAcousticEchoCancelerSupported()) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                boolean z2 = this.shouldEnableAec && canUseAcousticEchoCanceler();
                if (this.aec.setEnabled(z2) != 0) {
                    Logging.b(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                String str = true != enabled ? "disabled" : "enabled";
                String str2 = true != this.aec.getEnabled() ? "disabled" : "enabled";
                StringBuilder sb2 = new StringBuilder(str.length() + 51 + str2.length());
                sb2.append("AcousticEchoCanceler: was ");
                sb2.append(str);
                sb2.append(", enable: ");
                sb2.append(z2);
                sb2.append(", is now: ");
                sb2.append(str2);
                Logging.a(TAG, sb2.toString());
            } else {
                Logging.b(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported()) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i);
            this.ns = create2;
            if (create2 != null) {
                boolean enabled2 = create2.getEnabled();
                if (this.shouldEnableNs && canUseNoiseSuppressor()) {
                    z = true;
                }
                if (this.ns.setEnabled(z) != 0) {
                    Logging.b(TAG, "Failed to set the NoiseSuppressor state");
                }
                String str3 = true != enabled2 ? "disabled" : "enabled";
                String str4 = true == this.ns.getEnabled() ? "enabled" : "disabled";
                StringBuilder sb3 = new StringBuilder(str3.length() + 46 + str4.length());
                sb3.append("NoiseSuppressor: was ");
                sb3.append(str3);
                sb3.append(", enable: ");
                sb3.append(z);
                sb3.append(", is now: ");
                sb3.append(str4);
                Logging.a(TAG, sb3.toString());
                return;
            }
            Logging.b(TAG, "Failed to create the NoiseSuppressor instance");
        }
    }

    public void release() {
        Logging.a(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
        }
    }

    public boolean setAEC(boolean z) {
        StringBuilder sb = new StringBuilder(13);
        sb.append("setAEC(");
        sb.append(z);
        sb.append(")");
        Logging.a(TAG, sb.toString());
        if (!canUseAcousticEchoCanceler()) {
            Logging.d(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z == this.shouldEnableAec) {
            this.shouldEnableAec = z;
            return true;
        }
        Logging.b(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    public boolean setNS(boolean z) {
        StringBuilder sb = new StringBuilder(12);
        sb.append("setNS(");
        sb.append(z);
        sb.append(")");
        Logging.a(TAG, sb.toString());
        if (!canUseNoiseSuppressor()) {
            Logging.d(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.ns == null || z == this.shouldEnableNs) {
            this.shouldEnableNs = z;
            return true;
        }
        Logging.b(TAG, "Platform NS state can't be modified while recording");
        return false;
    }
}
