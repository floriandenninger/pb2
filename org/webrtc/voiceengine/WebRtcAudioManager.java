package org.webrtc.voiceengine;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioTrack;
import android.os.Build;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class WebRtcAudioManager {
    private static final int BITS_PER_SAMPLE = 16;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;
    private static final String TAG = "WebRtcAudioManager";
    private static final boolean blacklistDeviceForAAudioUsage = true;
    private static boolean blacklistDeviceForOpenSLESUsage;
    private static boolean blacklistDeviceForOpenSLESUsageIsOverridden;
    private static boolean useStereoInput;
    private static boolean useStereoOutput;
    private boolean aAudio;
    private final AudioManager audioManager;
    private boolean hardwareAEC;
    private boolean hardwareAGC;
    private boolean hardwareNS;
    private boolean initialized;
    private int inputBufferSize;
    private int inputChannels;
    private boolean lowLatencyInput;
    private boolean lowLatencyOutput;
    private final long nativeAudioManager;
    private int nativeChannels;
    private int nativeSampleRate;
    private int outputBufferSize;
    private int outputChannels;
    private boolean proAudio;
    private int sampleRate;
    private final VolumeLogger volumeLogger;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    class VolumeLogger {
        private static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
        private static final int TIMER_PERIOD_IN_SECONDS = 30;
        private final AudioManager audioManager;
        private Timer timer;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* loaded from: classes4.dex */
        public class LogVolumeTask extends TimerTask {
            private final int maxRingVolume;
            private final int maxVoiceCallVolume;

            public LogVolumeTask(int i, int i2) {
                this.maxRingVolume = i;
                this.maxVoiceCallVolume = i2;
            }

            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                int mode = VolumeLogger.this.audioManager.getMode();
                if (mode == 1) {
                    int streamVolume = VolumeLogger.this.audioManager.getStreamVolume(2);
                    int i = this.maxRingVolume;
                    StringBuilder sb = new StringBuilder(56);
                    sb.append("STREAM_RING stream volume: ");
                    sb.append(streamVolume);
                    sb.append(" (max=");
                    sb.append(i);
                    sb.append(")");
                    Logging.a(WebRtcAudioManager.TAG, sb.toString());
                    return;
                }
                if (mode == 3) {
                    int streamVolume2 = VolumeLogger.this.audioManager.getStreamVolume(0);
                    int i2 = this.maxVoiceCallVolume;
                    StringBuilder sb2 = new StringBuilder(55);
                    sb2.append("VOICE_CALL stream volume: ");
                    sb2.append(streamVolume2);
                    sb2.append(" (max=");
                    sb2.append(i2);
                    sb2.append(")");
                    Logging.a(WebRtcAudioManager.TAG, sb2.toString());
                }
            }
        }

        public VolumeLogger(AudioManager audioManager) {
            this.audioManager = audioManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void stop() {
            Timer timer = this.timer;
            if (timer != null) {
                timer.cancel();
                this.timer = null;
            }
        }

        public void start() {
            Timer timer = new Timer(THREAD_NAME);
            this.timer = timer;
            timer.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0L, 30000L);
        }
    }

    WebRtcAudioManager(long j) {
        String valueOf = String.valueOf(WebRtcAudioUtils.getThreadInfo());
        Logging.a(TAG, valueOf.length() != 0 ? "ctor".concat(valueOf) : new String("ctor"));
        this.nativeAudioManager = j;
        AudioManager audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
        this.audioManager = audioManager;
        this.volumeLogger = new VolumeLogger(audioManager);
        storeAudioParameters();
        nativeCacheAudioParameters(this.sampleRate, this.outputChannels, this.inputChannels, this.hardwareAEC, this.hardwareAGC, this.hardwareNS, this.lowLatencyOutput, this.lowLatencyInput, this.proAudio, this.aAudio, this.outputBufferSize, this.inputBufferSize, j);
        WebRtcAudioUtils.logAudioState(TAG);
    }

    private static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private void dispose() {
        String valueOf = String.valueOf(WebRtcAudioUtils.getThreadInfo());
        Logging.a(TAG, valueOf.length() != 0 ? "dispose".concat(valueOf) : new String("dispose"));
        if (this.initialized) {
            this.volumeLogger.stop();
        }
    }

    private int getLowLatencyInputFramesPerBuffer() {
        assertTrue(isLowLatencyInputSupported());
        return getLowLatencyOutputFramesPerBuffer();
    }

    private int getLowLatencyOutputFramesPerBuffer() {
        assertTrue(isLowLatencyOutputSupported());
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_FRAMES_PER_BUFFER");
        return property == null ? DEFAULT_FRAME_PER_BUFFER : Integer.parseInt(property);
    }

    private static int getMinInputFrameSize(int i, int i2) {
        return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, 2) / (i2 + i2);
    }

    private static int getMinOutputFrameSize(int i, int i2) {
        return AudioTrack.getMinBufferSize(i, i2 == 1 ? 4 : 12, 2) / (i2 + i2);
    }

    private int getNativeOutputSampleRate() {
        if (WebRtcAudioUtils.runningOnEmulator()) {
            Logging.a(TAG, "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        if (WebRtcAudioUtils.isDefaultSampleRateOverridden()) {
            int defaultSampleRateHz = WebRtcAudioUtils.getDefaultSampleRateHz();
            StringBuilder sb = new StringBuilder(50);
            sb.append("Default sample rate is overriden to ");
            sb.append(defaultSampleRateHz);
            sb.append(" Hz");
            Logging.a(TAG, sb.toString());
            return WebRtcAudioUtils.getDefaultSampleRateHz();
        }
        int sampleRateForApiLevel = getSampleRateForApiLevel();
        StringBuilder sb2 = new StringBuilder(36);
        sb2.append("Sample rate is set to ");
        sb2.append(sampleRateForApiLevel);
        sb2.append(" Hz");
        Logging.a(TAG, sb2.toString());
        return sampleRateForApiLevel;
    }

    private int getSampleRateForApiLevel() {
        String property = this.audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        return property == null ? WebRtcAudioUtils.getDefaultSampleRateHz() : Integer.parseInt(property);
    }

    public static synchronized boolean getStereoInput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoInput;
        }
        return z;
    }

    public static synchronized boolean getStereoOutput() {
        boolean z;
        synchronized (WebRtcAudioManager.class) {
            z = useStereoOutput;
        }
        return z;
    }

    private boolean hasEarpiece() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    private boolean init() {
        String valueOf = String.valueOf(WebRtcAudioUtils.getThreadInfo());
        Logging.a(TAG, valueOf.length() != 0 ? "init".concat(valueOf) : new String("init"));
        if (this.initialized) {
            return blacklistDeviceForAAudioUsage;
        }
        String modeToString = WebRtcAudioUtils.modeToString(this.audioManager.getMode());
        Logging.a(TAG, modeToString.length() != 0 ? "audio mode is: ".concat(modeToString) : new String("audio mode is: "));
        this.initialized = blacklistDeviceForAAudioUsage;
        this.volumeLogger.start();
        return blacklistDeviceForAAudioUsage;
    }

    private boolean isAAudioSupported() {
        Logging.d(TAG, "AAudio support is currently disabled on all devices!");
        return false;
    }

    private static boolean isAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.canUseAcousticEchoCanceler();
    }

    private boolean isCommunicationModeEnabled() {
        if (this.audioManager.getMode() == 3) {
            return blacklistDeviceForAAudioUsage;
        }
        return false;
    }

    private boolean isLowLatencyOutputSupported() {
        return ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.low_latency");
    }

    private static boolean isNoiseSuppressorSupported() {
        return WebRtcAudioEffects.canUseNoiseSuppressor();
    }

    private boolean isProAudioSupported() {
        if (Build.VERSION.SDK_INT < 23 || !ContextUtils.getApplicationContext().getPackageManager().hasSystemFeature("android.hardware.audio.pro")) {
            return false;
        }
        return blacklistDeviceForAAudioUsage;
    }

    private native void nativeCacheAudioParameters(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i4, int i5, long j);

    public static synchronized void setBlacklistDeviceForOpenSLESUsage(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            blacklistDeviceForOpenSLESUsageIsOverridden = blacklistDeviceForAAudioUsage;
            blacklistDeviceForOpenSLESUsage = z;
        }
    }

    public static synchronized void setStereoInput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            StringBuilder sb = new StringBuilder(56);
            sb.append("Overriding default input behavior: setStereoInput(");
            sb.append(z);
            sb.append(')');
            Logging.d(TAG, sb.toString());
            useStereoInput = z;
        }
    }

    public static synchronized void setStereoOutput(boolean z) {
        synchronized (WebRtcAudioManager.class) {
            StringBuilder sb = new StringBuilder(58);
            sb.append("Overriding default output behavior: setStereoOutput(");
            sb.append(z);
            sb.append(')');
            Logging.d(TAG, sb.toString());
            useStereoOutput = z;
        }
    }

    private void storeAudioParameters() {
        int minOutputFrameSize;
        int minInputFrameSize;
        this.outputChannels = true != getStereoOutput() ? 1 : 2;
        this.inputChannels = true != getStereoInput() ? 1 : 2;
        this.sampleRate = getNativeOutputSampleRate();
        this.hardwareAEC = isAcousticEchoCancelerSupported();
        this.hardwareAGC = false;
        this.hardwareNS = isNoiseSuppressorSupported();
        this.lowLatencyOutput = isLowLatencyOutputSupported();
        this.lowLatencyInput = isLowLatencyInputSupported();
        this.proAudio = isProAudioSupported();
        isAAudioSupported();
        this.aAudio = false;
        if (this.lowLatencyOutput) {
            minOutputFrameSize = getLowLatencyOutputFramesPerBuffer();
        } else {
            minOutputFrameSize = getMinOutputFrameSize(this.sampleRate, this.outputChannels);
        }
        this.outputBufferSize = minOutputFrameSize;
        if (this.lowLatencyInput) {
            minInputFrameSize = getLowLatencyInputFramesPerBuffer();
        } else {
            minInputFrameSize = getMinInputFrameSize(this.sampleRate, this.inputChannels);
        }
        this.inputBufferSize = minInputFrameSize;
    }

    public boolean isLowLatencyInputSupported() {
        if (isLowLatencyOutputSupported()) {
            return blacklistDeviceForAAudioUsage;
        }
        return false;
    }

    private boolean isDeviceBlacklistedForOpenSLESUsage() {
        boolean deviceIsBlacklistedForOpenSLESUsage = blacklistDeviceForOpenSLESUsageIsOverridden ? blacklistDeviceForOpenSLESUsage : WebRtcAudioUtils.deviceIsBlacklistedForOpenSLESUsage();
        if (deviceIsBlacklistedForOpenSLESUsage) {
            Logging.a(TAG, String.valueOf(Build.MODEL).concat(" is blacklisted for OpenSL ES usage!"));
        }
        return deviceIsBlacklistedForOpenSLESUsage;
    }
}
