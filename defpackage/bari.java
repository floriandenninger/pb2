package defpackage;

import android.os.Process;
import org.webrtc.Logging;
import org.webrtc.audio.WebRtcAudioTrack;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bari extends Thread {
    public volatile boolean a;
    final /* synthetic */ WebRtcAudioTrack b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bari(WebRtcAudioTrack webRtcAudioTrack) {
        super("AudioTrackJavaThread");
        this.b = webRtcAudioTrack;
        this.a = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(-19);
        String valueOf = String.valueOf(aype.q());
        Logging.a("WebRtcAudioTrackExternal", valueOf.length() != 0 ? "AudioTrackThread".concat(valueOf) : new String("AudioTrackThread"));
        WebRtcAudioTrack.a(this.b.e.getPlayState() == 3);
        WebRtcAudioTrack.b(0);
        int capacity = this.b.d.capacity();
        while (this.a) {
            WebRtcAudioTrack.nativeGetPlayoutData(this.b.a, capacity);
            WebRtcAudioTrack.a(capacity <= this.b.d.remaining());
            boolean z = this.b.f;
            WebRtcAudioTrack webRtcAudioTrack = this.b;
            int write = webRtcAudioTrack.e.write(webRtcAudioTrack.d, capacity, 0);
            if (write != capacity) {
                StringBuilder sb = new StringBuilder(60);
                sb.append("AudioTrack.write played invalid number of bytes: ");
                sb.append(write);
                Logging.b("WebRtcAudioTrackExternal", sb.toString());
                if (write < 0) {
                    this.a = false;
                    WebRtcAudioTrack webRtcAudioTrack2 = this.b;
                    StringBuilder sb2 = new StringBuilder(36);
                    sb2.append("AudioTrack.write failed: ");
                    sb2.append(write);
                    String sb3 = sb2.toString();
                    String valueOf2 = String.valueOf(sb3);
                    Logging.b("WebRtcAudioTrackExternal", valueOf2.length() != 0 ? "Run-time playback error: ".concat(valueOf2) : new String("Run-time playback error: "));
                    aype.s("WebRtcAudioTrackExternal", webRtcAudioTrack2.b, webRtcAudioTrack2.c);
                    acnc acncVar = webRtcAudioTrack2.g;
                    if (acncVar != null) {
                        String valueOf3 = String.valueOf(sb3);
                        zga.c("PeerConnectionClient", valueOf3.length() != 0 ? "onWebRtcAudioTrackError: ".concat(valueOf3) : new String("onWebRtcAudioTrackError: "));
                        acog acogVar = acncVar.a.A;
                        if (acogVar != null) {
                            acogVar.a();
                        }
                    }
                }
            }
        }
    }
}
