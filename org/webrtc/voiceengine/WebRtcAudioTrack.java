package org.webrtc.voiceengine;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import defpackage.aype;
import defpackage.baqo;
import java.nio.ByteBuffer;
import org.webrtc.ContextUtils;
import org.webrtc.Logging;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class WebRtcAudioTrack {
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_USAGE = 2;
    private static final String TAG = "WebRtcAudioTrack";
    private static ErrorCallback errorCallback = null;
    private static WebRtcAudioTrackErrorCallback errorCallbackOld = null;
    private static volatile boolean speakerMute = false;
    private static int usageAttribute = 2;
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private byte[] emptyBytes;
    private final long nativeAudioTrack;
    private final baqo threadChecker;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    class AudioTrackThread extends Thread {
        private volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            return audioTrack.write(byteBuffer, i, 0);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            String valueOf = String.valueOf(WebRtcAudioUtils.getThreadInfo());
            Logging.a(WebRtcAudioTrack.TAG, valueOf.length() != 0 ? "AudioTrackThread".concat(valueOf) : new String("AudioTrackThread"));
            WebRtcAudioTrack.assertTrue(WebRtcAudioTrack.this.audioTrack.getPlayState() == 3);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
                WebRtcAudioTrack.assertTrue(capacity <= WebRtcAudioTrack.this.byteBuffer.remaining());
                if (WebRtcAudioTrack.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.put(WebRtcAudioTrack.this.emptyBytes);
                }
                int writeBytes = writeBytes(WebRtcAudioTrack.this.audioTrack, WebRtcAudioTrack.this.byteBuffer, capacity);
                if (writeBytes != capacity) {
                    StringBuilder sb = new StringBuilder(60);
                    sb.append("AudioTrack.write played invalid number of bytes: ");
                    sb.append(writeBytes);
                    Logging.b(WebRtcAudioTrack.TAG, sb.toString());
                    if (writeBytes < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                        StringBuilder sb2 = new StringBuilder(36);
                        sb2.append("AudioTrack.write failed: ");
                        sb2.append(writeBytes);
                        webRtcAudioTrack2.reportWebRtcAudioTrackError(sb2.toString());
                    }
                }
            }
            if (WebRtcAudioTrack.this.audioTrack != null) {
                Logging.a(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                try {
                    WebRtcAudioTrack.this.audioTrack.stop();
                    Logging.a(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
                } catch (IllegalStateException e) {
                    String valueOf2 = String.valueOf(e.getMessage());
                    Logging.b(WebRtcAudioTrack.TAG, valueOf2.length() != 0 ? "AudioTrack.stop failed: ".concat(valueOf2) : new String("AudioTrack.stop failed: "));
                }
            }
        }

        public void stopThread() {
            Logging.a(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface ErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    /* compiled from: PG */
    @Deprecated
    /* loaded from: classes4.dex */
    public interface WebRtcAudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(String str);
    }

    WebRtcAudioTrack(long j) {
        baqo baqoVar = new baqo();
        this.threadChecker = baqoVar;
        baqoVar.a();
        String valueOf = String.valueOf(WebRtcAudioUtils.getThreadInfo());
        Logging.a(TAG, valueOf.length() != 0 ? "ctor".concat(valueOf) : new String("ctor"));
        this.nativeAudioTrack = j;
        this.audioManager = (AudioManager) ContextUtils.getApplicationContext().getSystemService("audio");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assertTrue(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i) {
        return i == 1 ? 4 : 12;
    }

    private static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3) {
        Logging.a(TAG, "createAudioTrackOnLollipopOrHigher");
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        StringBuilder sb = new StringBuilder(35);
        sb.append("nativeOutputSampleRate: ");
        sb.append(nativeOutputSampleRate);
        Logging.a(TAG, sb.toString());
        if (i != nativeOutputSampleRate) {
            Logging.d(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
        int i4 = usageAttribute;
        if (i4 != DEFAULT_USAGE) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("A non default usage attribute is used: ");
            sb2.append(i4);
            Logging.d(TAG, sb2.toString());
        }
        return new AudioTrack(new AudioAttributes.Builder().setUsage(usageAttribute).setContentType(1).build(), new AudioFormat.Builder().setEncoding(2).setSampleRate(i).setChannelMask(i2).build(), i3, 1, 0);
    }

    private static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    private int getBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.audioTrack.getBufferSizeInFrames();
        }
        return -1;
    }

    private static int getDefaultUsageAttribute() {
        return 2;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.a();
        Logging.a(TAG, "getStreamMaxVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.a();
        Logging.a(TAG, "getStreamVolume");
        assertTrue(this.audioManager != null);
        return this.audioManager.getStreamVolume(0);
    }

    private int initPlayout(int i, int i2, double d) {
        this.threadChecker.a();
        StringBuilder sb = new StringBuilder(100);
        sb.append("initPlayout(sampleRate=");
        sb.append(i);
        sb.append(", channels=");
        sb.append(i2);
        sb.append(", bufferSizeFactor=");
        sb.append(d);
        sb.append(")");
        Logging.a(TAG, sb.toString());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i2 + i2) * (i / 100));
        this.byteBuffer = allocateDirect;
        int capacity = allocateDirect.capacity();
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append("byteBuffer.capacity: ");
        sb2.append(capacity);
        Logging.a(TAG, sb2.toString());
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioTrack);
        int channelCountToConfiguration = channelCountToConfiguration(i2);
        double minBufferSize = AudioTrack.getMinBufferSize(i, channelCountToConfiguration, 2);
        Double.isNaN(minBufferSize);
        int i3 = (int) (minBufferSize * d);
        StringBuilder sb3 = new StringBuilder(33);
        sb3.append("minBufferSizeInBytes: ");
        sb3.append(i3);
        Logging.a(TAG, sb3.toString());
        if (i3 < this.byteBuffer.capacity()) {
            reportWebRtcAudioTrackInitError("AudioTrack.getMinBufferSize returns an invalid value.");
            return -1;
        }
        if (this.audioTrack == null) {
            try {
                AudioTrack createAudioTrackOnLollipopOrHigher = createAudioTrackOnLollipopOrHigher(i, channelCountToConfiguration, i3);
                this.audioTrack = createAudioTrackOnLollipopOrHigher;
                if (createAudioTrackOnLollipopOrHigher == null || createAudioTrackOnLollipopOrHigher.getState() != 1) {
                    reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                    releaseAudioResources();
                    return -1;
                }
                logMainParameters();
                logMainParametersExtended();
                return i3;
            } catch (IllegalArgumentException e) {
                reportWebRtcAudioTrackInitError(e.getMessage());
                releaseAudioResources();
                return -1;
            }
        }
        reportWebRtcAudioTrackInitError("Conflict with existing AudioTrack.");
        return -1;
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        if (Build.VERSION.SDK_INT >= 24) {
            int bufferCapacityInFrames = this.audioTrack.getBufferCapacityInFrames();
            StringBuilder sb = new StringBuilder(50);
            sb.append("AudioTrack: buffer capacity in frames: ");
            sb.append(bufferCapacityInFrames);
            Logging.a(TAG, sb.toString());
        }
    }

    private void logBufferSizeInFrames() {
        if (Build.VERSION.SDK_INT >= 23) {
            int bufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
            StringBuilder sb = new StringBuilder(46);
            sb.append("AudioTrack: buffer size in frames: ");
            sb.append(bufferSizeInFrames);
            Logging.a(TAG, sb.toString());
        }
    }

    private void logMainParameters() {
        int audioSessionId = this.audioTrack.getAudioSessionId();
        int channelCount = this.audioTrack.getChannelCount();
        int sampleRate = this.audioTrack.getSampleRate();
        float maxVolume = AudioTrack.getMaxVolume();
        StringBuilder sb = new StringBuilder(111);
        sb.append("AudioTrack: session ID: ");
        sb.append(audioSessionId);
        sb.append(", channels: ");
        sb.append(channelCount);
        sb.append(", sample rate: ");
        sb.append(sampleRate);
        sb.append(", max gain: ");
        sb.append(maxVolume);
        Logging.a(TAG, sb.toString());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    private void logUnderrunCount() {
        if (Build.VERSION.SDK_INT >= 24) {
            int underrunCount = this.audioTrack.getUnderrunCount();
            StringBuilder sb = new StringBuilder(27);
            sb.append("underrun count: ");
            sb.append(underrunCount);
            Logging.a(TAG, sb.toString());
        }
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeGetPlayoutData(int i, long j);

    private void releaseAudioResources() {
        Logging.a(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        String valueOf = String.valueOf(str);
        Logging.b(TAG, valueOf.length() != 0 ? "Run-time playback error: ".concat(valueOf) : new String("Run-time playback error: "));
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        String valueOf = String.valueOf(str);
        Logging.b(TAG, valueOf.length() != 0 ? "Init playout error: ".concat(valueOf) : new String("Init playout error: "));
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        String valueOf = String.valueOf(audioTrackStartErrorCode);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23 + String.valueOf(str).length());
        sb.append("Start playout error: ");
        sb.append(valueOf);
        sb.append(". ");
        sb.append(str);
        Logging.b(TAG, sb.toString());
        WebRtcAudioUtils.logAudioState(TAG);
        WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback = errorCallbackOld;
        if (webRtcAudioTrackErrorCallback != null) {
            webRtcAudioTrackErrorCallback.onWebRtcAudioTrackStartError(str);
        }
        ErrorCallback errorCallback2 = errorCallback;
        if (errorCallback2 != null) {
            errorCallback2.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    public static synchronized void setAudioTrackUsageAttribute(int i) {
        synchronized (WebRtcAudioTrack.class) {
            int i2 = DEFAULT_USAGE;
            StringBuilder sb = new StringBuilder(67);
            sb.append("Default usage attribute is changed from: ");
            sb.append(i2);
            sb.append(" to ");
            sb.append(i);
            Logging.d(TAG, sb.toString());
            usageAttribute = i;
        }
    }

    public static void setErrorCallback(ErrorCallback errorCallback2) {
        Logging.a(TAG, "Set extended error callback");
        errorCallback = errorCallback2;
    }

    public static void setSpeakerMute(boolean z) {
        StringBuilder sb = new StringBuilder(21);
        sb.append("setSpeakerMute(");
        sb.append(z);
        sb.append(")");
        Logging.d(TAG, sb.toString());
        speakerMute = z;
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.a();
        StringBuilder sb = new StringBuilder(28);
        sb.append("setStreamVolume(");
        sb.append(i);
        sb.append(")");
        Logging.a(TAG, sb.toString());
        assertTrue(this.audioManager != null);
        if (isVolumeFixed()) {
            Logging.b(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.a();
        Logging.a(TAG, "startPlayout");
        assertTrue(this.audioTrack != null);
        assertTrue(this.audioThread == null);
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                AudioTrackStartErrorCode audioTrackStartErrorCode = AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH;
                int playState = this.audioTrack.getPlayState();
                StringBuilder sb = new StringBuilder(53);
                sb.append("AudioTrack.play failed - incorrect state :");
                sb.append(playState);
                reportWebRtcAudioTrackStartError(audioTrackStartErrorCode, sb.toString());
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            AudioTrackStartErrorCode audioTrackStartErrorCode2 = AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION;
            String valueOf = String.valueOf(e.getMessage());
            reportWebRtcAudioTrackStartError(audioTrackStartErrorCode2, valueOf.length() != 0 ? "AudioTrack.play failed: ".concat(valueOf) : new String("AudioTrack.play failed: "));
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.a();
        Logging.a(TAG, "stopPlayout");
        assertTrue(this.audioThread != null);
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.a(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!aype.z(this.audioThread)) {
            Logging.b(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG);
        }
        Logging.a(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        releaseAudioResources();
        return true;
    }

    @Deprecated
    public static void setErrorCallback(WebRtcAudioTrackErrorCallback webRtcAudioTrackErrorCallback) {
        Logging.a(TAG, "Set error callback (deprecated");
        errorCallbackOld = webRtcAudioTrackErrorCallback;
    }
}
