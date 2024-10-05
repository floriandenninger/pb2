package org.webrtc.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import defpackage.acnc;
import defpackage.acog;
import defpackage.acoh;
import defpackage.aype;
import defpackage.bare;
import defpackage.barg;
import defpackage.barh;
import defpackage.zga;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.Logging;
import org.webrtc.audio.WebRtcAudioRecord;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class WebRtcAudioRecord {
    public static final AtomicInteger a = new AtomicInteger(0);
    public final Context b;
    public final AudioManager c;
    public long d;
    public ByteBuffer e;
    public AudioRecord f;
    public volatile boolean g;
    public final acoh h;
    public final acnc i;
    private final int j;
    private final int k;
    private final bare l;
    private barh m;
    private final ScheduledExecutorService n;
    private ScheduledFuture o;
    private final AtomicReference p;
    private final boolean q;
    private final boolean r;

    WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, b(), audioManager, 7, null, null, bare.b(), bare.c(), null);
    }

    public static ScheduledExecutorService b() {
        return Executors.newScheduledThreadPool(0, new barg(new AtomicInteger(0), 0));
    }

    public static void c(boolean z) {
        if (!z) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static final void d(int i) {
        String str = i != 0 ? "STOP" : "START";
        Logging.a("WebRtcAudioRecordExternal", str.length() != 0 ? "doAudioRecordStateCallback: ".concat(str) : new String("doAudioRecordStateCallback: "));
    }

    private final void e() {
        Logging.a("WebRtcAudioRecordExternal", "releaseAudioResources");
        AudioRecord audioRecord = this.f;
        if (audioRecord != null) {
            audioRecord.release();
            this.f = null;
        }
        this.p.set(null);
    }

    private boolean enableBuiltInAEC(boolean z) {
        StringBuilder sb = new StringBuilder(23);
        sb.append("enableBuiltInAEC(");
        sb.append(z);
        sb.append(")");
        Logging.a("WebRtcAudioRecordExternal", sb.toString());
        bare bareVar = this.l;
        StringBuilder sb2 = new StringBuilder(13);
        sb2.append("setAEC(");
        sb2.append(z);
        sb2.append(")");
        Logging.a("WebRtcAudioEffectsExternal", sb2.toString());
        if (!bare.b()) {
            Logging.d("WebRtcAudioEffectsExternal", "Platform AEC is not supported");
            bareVar.c = false;
            return false;
        }
        if (bareVar.a == null || z == bareVar.c) {
            bareVar.c = z;
            return true;
        }
        Logging.b("WebRtcAudioEffectsExternal", "Platform AEC state can't be modified while recording");
        return false;
    }

    private boolean enableBuiltInNS(boolean z) {
        StringBuilder sb = new StringBuilder(22);
        sb.append("enableBuiltInNS(");
        sb.append(z);
        sb.append(")");
        Logging.a("WebRtcAudioRecordExternal", sb.toString());
        bare bareVar = this.l;
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append("setNS(");
        sb2.append(z);
        sb2.append(")");
        Logging.a("WebRtcAudioEffectsExternal", sb2.toString());
        if (!bare.c()) {
            Logging.d("WebRtcAudioEffectsExternal", "Platform NS is not supported");
            bareVar.d = false;
            return false;
        }
        if (bareVar.b == null || z == bareVar.d) {
            bareVar.d = z;
            return true;
        }
        Logging.b("WebRtcAudioEffectsExternal", "Platform NS state can't be modified while recording");
        return false;
    }

    private final void f(String str) {
        String valueOf = String.valueOf(str);
        Logging.b("WebRtcAudioRecordExternal", valueOf.length() != 0 ? "Init recording error: ".concat(valueOf) : new String("Init recording error: "));
        aype.s("WebRtcAudioRecordExternal", this.b, this.c);
        a(this.f, false);
        acnc acncVar = this.i;
        if (acncVar != null) {
            String valueOf2 = String.valueOf(str);
            zga.c("PeerConnectionClient", valueOf2.length() != 0 ? "onWebRtcAudioRecordInitError: ".concat(valueOf2) : new String("onWebRtcAudioRecordInitError: "));
            acog acogVar = acncVar.a.A;
            if (acogVar != null) {
                acogVar.a();
            }
        }
    }

    private final void g(int i, String str) {
        String u = aype.u(i);
        StringBuilder sb = new StringBuilder(u.length() + 25 + String.valueOf(str).length());
        sb.append("Start recording error: ");
        sb.append(u);
        sb.append(". ");
        sb.append(str);
        Logging.b("WebRtcAudioRecordExternal", sb.toString());
        aype.s("WebRtcAudioRecordExternal", this.b, this.c);
        a(this.f, false);
        acnc acncVar = this.i;
        if (acncVar != null) {
            String u2 = aype.u(i);
            StringBuilder sb2 = new StringBuilder(u2.length() + 59 + String.valueOf(str).length());
            sb2.append("onWebRtcAudioRecordStartError: errorCode= ");
            sb2.append(u2);
            sb2.append(" , errorMessage= ");
            sb2.append(str);
            zga.c("PeerConnectionClient", sb2.toString());
            acog acogVar = acncVar.a.A;
            if (acogVar != null) {
                acogVar.a();
            }
        }
    }

    private int initRecording(int i, int i2) {
        StringBuilder sb = new StringBuilder(59);
        sb.append("initRecording(sampleRate=");
        sb.append(i);
        sb.append(", channels=");
        sb.append(i2);
        sb.append(")");
        Logging.a("WebRtcAudioRecordExternal", sb.toString());
        if (this.f != null) {
            f("InitRecording called twice without StopRecording.");
            return -1;
        }
        int i3 = this.k;
        if (i3 == 1 || i3 == 2) {
            int i4 = i / 100;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i2 + i2) * i4);
            this.e = allocateDirect;
            if (!allocateDirect.hasArray()) {
                f("ByteBuffer does not have backing array.");
                return -1;
            }
            int capacity = this.e.capacity();
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("byteBuffer.capacity: ");
            sb2.append(capacity);
            Logging.a("WebRtcAudioRecordExternal", sb2.toString());
            byte[] bArr = new byte[this.e.capacity()];
            nativeCacheDirectBufferAddress(this.d, this.e);
            int i5 = i2 == 1 ? 16 : 12;
            int minBufferSize = AudioRecord.getMinBufferSize(i, i5, this.k);
            if (minBufferSize == -1 || minBufferSize == -2) {
                StringBuilder sb3 = new StringBuilder(48);
                sb3.append("AudioRecord.getMinBufferSize failed: ");
                sb3.append(minBufferSize);
                f(sb3.toString());
                return -1;
            }
            StringBuilder sb4 = new StringBuilder(41);
            sb4.append("AudioRecord.getMinBufferSize: ");
            sb4.append(minBufferSize);
            Logging.a("WebRtcAudioRecordExternal", sb4.toString());
            int max = Math.max(minBufferSize + minBufferSize, this.e.capacity());
            StringBuilder sb5 = new StringBuilder(30);
            sb5.append("bufferSizeInBytes: ");
            sb5.append(max);
            Logging.a("WebRtcAudioRecordExternal", sb5.toString());
            try {
                if (Build.VERSION.SDK_INT >= 23) {
                    int i6 = this.j;
                    int i7 = this.k;
                    Logging.a("WebRtcAudioRecordExternal", "createAudioRecordOnMOrHigher");
                    this.f = new AudioRecord.Builder().setAudioSource(i6).setAudioFormat(new AudioFormat.Builder().setEncoding(i7).setSampleRate(i).setChannelMask(i5).build()).setBufferSizeInBytes(max).build();
                    this.p.set(null);
                } else {
                    int i8 = this.j;
                    int i9 = this.k;
                    Logging.a("WebRtcAudioRecordExternal", "createAudioRecordOnLowerThanM");
                    this.f = new AudioRecord(i8, i, i5, i9, max);
                    this.p.set(null);
                }
                AudioRecord audioRecord = this.f;
                if (audioRecord == null || audioRecord.getState() != 1) {
                    f("Creation or initialization of audio recorder failed.");
                    e();
                    return -1;
                }
                bare bareVar = this.l;
                int audioSessionId = this.f.getAudioSessionId();
                StringBuilder sb6 = new StringBuilder(32);
                sb6.append("enable(audioSession=");
                sb6.append(audioSessionId);
                sb6.append(")");
                Logging.a("WebRtcAudioEffectsExternal", sb6.toString());
                bare.a(bareVar.a == null);
                bare.a(bareVar.b == null);
                if (bare.b()) {
                    bareVar.a = AcousticEchoCanceler.create(audioSessionId);
                    AcousticEchoCanceler acousticEchoCanceler = bareVar.a;
                    if (acousticEchoCanceler != null) {
                        boolean enabled = acousticEchoCanceler.getEnabled();
                        boolean z = bareVar.c && bare.b();
                        if (bareVar.a.setEnabled(z) != 0) {
                            Logging.b("WebRtcAudioEffectsExternal", "Failed to set the AcousticEchoCanceler state");
                        }
                        String str = true != enabled ? "disabled" : "enabled";
                        String str2 = true != bareVar.a.getEnabled() ? "disabled" : "enabled";
                        StringBuilder sb7 = new StringBuilder(str.length() + 51 + str2.length());
                        sb7.append("AcousticEchoCanceler: was ");
                        sb7.append(str);
                        sb7.append(", enable: ");
                        sb7.append(z);
                        sb7.append(", is now: ");
                        sb7.append(str2);
                        Logging.a("WebRtcAudioEffectsExternal", sb7.toString());
                    } else {
                        Logging.b("WebRtcAudioEffectsExternal", "Failed to create the AcousticEchoCanceler instance");
                    }
                }
                if (bare.c()) {
                    bareVar.b = NoiseSuppressor.create(audioSessionId);
                    NoiseSuppressor noiseSuppressor = bareVar.b;
                    if (noiseSuppressor != null) {
                        boolean enabled2 = noiseSuppressor.getEnabled();
                        boolean z2 = bareVar.d && bare.c();
                        if (bareVar.b.setEnabled(z2) != 0) {
                            Logging.b("WebRtcAudioEffectsExternal", "Failed to set the NoiseSuppressor state");
                        }
                        String str3 = true != enabled2 ? "disabled" : "enabled";
                        String str4 = true == bareVar.b.getEnabled() ? "enabled" : "disabled";
                        StringBuilder sb8 = new StringBuilder(str3.length() + 46 + str4.length());
                        sb8.append("NoiseSuppressor: was ");
                        sb8.append(str3);
                        sb8.append(", enable: ");
                        sb8.append(z2);
                        sb8.append(", is now: ");
                        sb8.append(str4);
                        Logging.a("WebRtcAudioEffectsExternal", sb8.toString());
                    } else {
                        Logging.b("WebRtcAudioEffectsExternal", "Failed to create the NoiseSuppressor instance");
                    }
                }
                int audioSessionId2 = this.f.getAudioSessionId();
                int channelCount = this.f.getChannelCount();
                int sampleRate = this.f.getSampleRate();
                StringBuilder sb9 = new StringBuilder(85);
                sb9.append("AudioRecord: session ID: ");
                sb9.append(audioSessionId2);
                sb9.append(", channels: ");
                sb9.append(channelCount);
                sb9.append(", sample rate: ");
                sb9.append(sampleRate);
                Logging.a("WebRtcAudioRecordExternal", sb9.toString());
                if (Build.VERSION.SDK_INT >= 23) {
                    int bufferSizeInFrames = this.f.getBufferSizeInFrames();
                    StringBuilder sb10 = new StringBuilder(47);
                    sb10.append("AudioRecord: buffer size in frames: ");
                    sb10.append(bufferSizeInFrames);
                    Logging.a("WebRtcAudioRecordExternal", sb10.toString());
                }
                int a2 = a(this.f, false);
                if (a2 != 0) {
                    StringBuilder sb11 = new StringBuilder(59);
                    sb11.append("Potential microphone conflict. Active sessions: ");
                    sb11.append(a2);
                    Logging.d("WebRtcAudioRecordExternal", sb11.toString());
                }
                return i4;
            } catch (IllegalArgumentException | UnsupportedOperationException e) {
                f(e.getMessage());
                e();
                return -1;
            }
        }
        StringBuilder sb12 = new StringBuilder(28);
        sb12.append("Bad audio format ");
        sb12.append(i3);
        throw new IllegalArgumentException(sb12.toString());
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    private boolean startRecording() {
        Logging.a("WebRtcAudioRecordExternal", "startRecording");
        c(this.f != null);
        c(this.m == null);
        try {
            this.f.startRecording();
            if (this.f.getRecordingState() != 3) {
                int recordingState = this.f.getRecordingState();
                StringBuilder sb = new StringBuilder(64);
                sb.append("AudioRecord.startRecording failed - incorrect state: ");
                sb.append(recordingState);
                g(2, sb.toString());
                return false;
            }
            barh barhVar = new barh(this);
            this.m = barhVar;
            barhVar.start();
            final AudioRecord audioRecord = this.f;
            Logging.a("WebRtcAudioRecordExternal", "scheduleLogRecordingConfigurationsTask");
            if (Build.VERSION.SDK_INT >= 24) {
                Callable callable = new Callable() { // from class: barf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                        AudioRecord audioRecord2 = audioRecord;
                        if (webRtcAudioRecord.f == audioRecord2) {
                            webRtcAudioRecord.a(audioRecord2, true);
                            return "Scheduled task is done";
                        }
                        Logging.a("WebRtcAudioRecordExternal", "audio record has changed");
                        return "Scheduled task is done";
                    }
                };
                ScheduledFuture scheduledFuture = this.o;
                if (scheduledFuture != null && !scheduledFuture.isDone()) {
                    this.o.cancel(true);
                }
                this.o = this.n.schedule(callable, 100L, TimeUnit.MILLISECONDS);
            }
            return true;
        } catch (IllegalStateException e) {
            String valueOf = String.valueOf(e.getMessage());
            g(1, valueOf.length() != 0 ? "AudioRecord.startRecording failed: ".concat(valueOf) : new String("AudioRecord.startRecording failed: "));
            return false;
        }
    }

    private boolean stopRecording() {
        Logging.a("WebRtcAudioRecordExternal", "stopRecording");
        c(this.m != null);
        ScheduledFuture scheduledFuture = this.o;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.o.cancel(true);
            }
            this.o = null;
        }
        barh barhVar = this.m;
        Logging.a("WebRtcAudioRecordExternal", "stopThread");
        barhVar.a = false;
        if (!aype.z(this.m)) {
            Logging.b("WebRtcAudioRecordExternal", "Join of AudioRecordJavaThread timed out");
            aype.s("WebRtcAudioRecordExternal", this.b, this.c);
        }
        this.m = null;
        bare bareVar = this.l;
        Logging.a("WebRtcAudioEffectsExternal", "release");
        AcousticEchoCanceler acousticEchoCanceler = bareVar.a;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            bareVar.a = null;
        }
        NoiseSuppressor noiseSuppressor = bareVar.b;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            bareVar.b = null;
        }
        e();
        return true;
    }

    public final int a(AudioRecord audioRecord, boolean z) {
        boolean z2;
        String str;
        if (Build.VERSION.SDK_INT < 24) {
            Logging.d("WebRtcAudioRecordExternal", "AudioManager#getActiveRecordingConfigurations() requires N or higher");
            return 0;
        }
        if (audioRecord == null) {
            return 0;
        }
        List<AudioRecordingConfiguration> activeRecordingConfigurations = this.c.getActiveRecordingConfigurations();
        int size = activeRecordingConfigurations.size();
        StringBuilder sb = new StringBuilder(48);
        sb.append("Number of active recording sessions: ");
        sb.append(size);
        Logging.a("WebRtcAudioRecordExternal", sb.toString());
        if (size > 0) {
            int audioSessionId = audioRecord.getAudioSessionId();
            c(!activeRecordingConfigurations.isEmpty());
            Logging.a("WebRtcAudioRecordExternal", "AudioRecordingConfigurations: ");
            for (AudioRecordingConfiguration audioRecordingConfiguration : activeRecordingConfigurations) {
                StringBuilder sb2 = new StringBuilder();
                int clientAudioSource = audioRecordingConfiguration.getClientAudioSource();
                sb2.append("  client audio source=");
                switch (clientAudioSource) {
                    case 0:
                        str = "DEFAULT";
                        break;
                    case 1:
                        str = "MIC";
                        break;
                    case 2:
                        str = "VOICE_UPLINK";
                        break;
                    case 3:
                        str = "VOICE_DOWNLINK";
                        break;
                    case 4:
                        str = "VOICE_CALL";
                        break;
                    case 5:
                        str = "CAMCORDER";
                        break;
                    case 6:
                        str = "VOICE_RECOGNITION";
                        break;
                    case 7:
                        str = "VOICE_COMMUNICATION";
                        break;
                    case 8:
                    default:
                        str = "INVALID";
                        break;
                    case 9:
                        str = "UNPROCESSED";
                        break;
                    case 10:
                        str = "VOICE_PERFORMANCE";
                        break;
                }
                sb2.append(str);
                sb2.append(", client session id=");
                sb2.append(audioRecordingConfiguration.getClientAudioSessionId());
                sb2.append(" (");
                sb2.append(audioSessionId);
                sb2.append(")\n");
                AudioFormat format = audioRecordingConfiguration.getFormat();
                sb2.append("  Device AudioFormat: channel count=");
                sb2.append(format.getChannelCount());
                sb2.append(", channel index mask=");
                sb2.append(format.getChannelIndexMask());
                sb2.append(", channel mask=");
                sb2.append(aype.o(format.getChannelMask()));
                sb2.append(", encoding=");
                sb2.append(aype.n(format.getEncoding()));
                sb2.append(", sample rate=");
                sb2.append(format.getSampleRate());
                sb2.append("\n");
                AudioFormat clientFormat = audioRecordingConfiguration.getClientFormat();
                sb2.append("  Client AudioFormat: channel count=");
                sb2.append(clientFormat.getChannelCount());
                sb2.append(", channel index mask=");
                sb2.append(clientFormat.getChannelIndexMask());
                sb2.append(", channel mask=");
                sb2.append(aype.o(clientFormat.getChannelMask()));
                sb2.append(", encoding=");
                sb2.append(aype.n(clientFormat.getEncoding()));
                sb2.append(", sample rate=");
                sb2.append(clientFormat.getSampleRate());
                sb2.append("\n");
                AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
                if (audioDevice != null) {
                    c(audioDevice.isSource());
                    sb2.append("  AudioDevice: type=");
                    sb2.append(aype.p(audioDevice.getType()));
                    sb2.append(", id=");
                    sb2.append(audioDevice.getId());
                }
                Logging.a("WebRtcAudioRecordExternal", sb2.toString());
            }
            if (z) {
                AtomicReference atomicReference = this.p;
                int audioSource = audioRecord.getAudioSource();
                int audioSessionId2 = audioRecord.getAudioSessionId();
                AudioFormat format2 = audioRecord.getFormat();
                AudioDeviceInfo routedDevice = audioRecord.getRoutedDevice();
                c(!activeRecordingConfigurations.isEmpty());
                Iterator<AudioRecordingConfiguration> it = activeRecordingConfigurations.iterator();
                while (true) {
                    if (it.hasNext()) {
                        AudioRecordingConfiguration next = it.next();
                        AudioDeviceInfo audioDevice2 = next.getAudioDevice();
                        if (audioDevice2 != null && next.getClientAudioSource() == audioSource && next.getClientAudioSessionId() == audioSessionId2 && next.getClientFormat().getEncoding() == format2.getEncoding() && next.getClientFormat().getSampleRate() == format2.getSampleRate() && next.getClientFormat().getChannelMask() == format2.getChannelMask() && next.getClientFormat().getChannelIndexMask() == format2.getChannelIndexMask() && next.getFormat().getEncoding() != 0 && next.getFormat().getSampleRate() > 0 && (next.getFormat().getChannelMask() != 0 || next.getFormat().getChannelIndexMask() != 0)) {
                            if (audioDevice2.getId() == routedDevice.getId() && audioDevice2.getType() == routedDevice.getType()) {
                                Logging.a("WebRtcAudioRecordExternal", "verifyAudioConfig: PASS");
                                z2 = true;
                            }
                        }
                    } else {
                        Logging.b("WebRtcAudioRecordExternal", "verifyAudioConfig: FAILED");
                        z2 = false;
                    }
                }
                atomicReference.set(Boolean.valueOf(z2));
            }
        }
        return size;
    }

    boolean isAcousticEchoCancelerSupported() {
        return this.q;
    }

    boolean isAudioConfigVerified() {
        return this.p.get() != null;
    }

    boolean isAudioSourceMatchingRecordingSession() {
        Boolean bool = (Boolean) this.p.get();
        if (bool == null) {
            Logging.d("WebRtcAudioRecordExternal", "Audio configuration has not yet been verified");
            return false;
        }
        return bool.booleanValue();
    }

    boolean isNoiseSuppressorSupported() {
        return this.r;
    }

    public native void nativeDataIsRecorded(long j, int i);

    public void setNativeAudioRecord(long j) {
        this.d = j;
    }

    public WebRtcAudioRecord(Context context, ScheduledExecutorService scheduledExecutorService, AudioManager audioManager, int i, acnc acncVar, acoh acohVar, boolean z, boolean z2, byte[] bArr) {
        this.l = new bare();
        this.p = new AtomicReference();
        if (!z || bare.b()) {
            if (!z2 || bare.c()) {
                this.b = context;
                this.n = scheduledExecutorService;
                this.c = audioManager;
                this.j = i;
                this.k = 2;
                this.i = acncVar;
                this.h = acohVar;
                this.q = z;
                this.r = z2;
                String valueOf = String.valueOf(aype.q());
                Logging.a("WebRtcAudioRecordExternal", valueOf.length() != 0 ? "ctor".concat(valueOf) : new String("ctor"));
                return;
            }
            throw new IllegalArgumentException("HW NS not supported");
        }
        throw new IllegalArgumentException("HW AEC not supported");
    }
}
