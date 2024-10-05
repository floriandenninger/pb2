package defpackage;

import android.os.CountDownTimer;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.DataChannel;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoTrack;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acnf implements PeerConnection.Observer {
    private final acma a;
    private final acne b;

    public acnf(acma acmaVar, acne acneVar) {
        this.a = acmaVar;
        this.b = acneVar;
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onAddStream(final MediaStream mediaStream) {
        abqu a;
        String.valueOf(String.valueOf(mediaStream)).length();
        acne acneVar = this.b;
        if (acneVar == null || mediaStream.b.isEmpty()) {
            return;
        }
        final acmw acmwVar = (acmw) acneVar;
        if (acmwVar.g == null && (a = acmwVar.c.a()) != null && a.b != null) {
            acmwVar.g = new baqd(acmwVar.a);
            final baok l = ((baol) baoe.c(a.b, baom.c)).l();
            acmwVar.b.post(new Runnable() { // from class: acmt
                @Override // java.lang.Runnable
                public final void run() {
                    acmw acmwVar2 = acmw.this;
                    baog baogVar = l;
                    baqd baqdVar = acmwVar2.g;
                    int[] iArr = baom.c;
                    baoy baoyVar = new baoy();
                    aype.x();
                    baqdVar.b = 0;
                    baqdVar.c = 0;
                    baqdVar.a.d(baogVar, baqdVar, iArr, baoyVar);
                }
            });
        }
        acmwVar.h = (VideoTrack) mediaStream.b.get(0);
        acmwVar.h.f(true);
        String valueOf = String.valueOf(acmwVar.h.b());
        if (valueOf.length() != 0) {
            "Adding track - ".concat(valueOf);
        }
        acmwVar.i = acni.a(acmwVar.h.b());
        VideoTrack videoTrack = acmwVar.h;
        baqd baqdVar = acmwVar.g;
        if (baqdVar == null) {
            throw new IllegalArgumentException("The VideoSink is not allowed to be null");
        }
        if (!videoTrack.a.containsKey(baqdVar)) {
            long nativeWrapSink = VideoTrack.nativeWrapSink(baqdVar);
            videoTrack.a.put(baqdVar, Long.valueOf(nativeWrapSink));
            VideoTrack.nativeAddSink(videoTrack.a(), nativeWrapSink);
        }
        if (acmwVar.f != null) {
            acmwVar.b.post(new Runnable() { // from class: acmu
                @Override // java.lang.Runnable
                public final void run() {
                    acmw acmwVar2 = acmw.this;
                    MediaStream mediaStream2 = mediaStream;
                    abtl abtlVar = acmwVar2.f;
                    mediaStream2.b();
                    baqd baqdVar2 = acmwVar2.g;
                    acif acifVar = (acif) abtlVar;
                    acifVar.aO(astk.LIVESTREAM_CONNECTION_STATE_ACTIVE);
                    acifVar.ao.removeAllViews();
                    acifVar.ao.addView(baqdVar2);
                }
            });
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
        for (MediaStream mediaStream : mediaStreamArr) {
            String.valueOf(String.valueOf(mediaStream)).length();
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final /* synthetic */ void onConnectionChange(PeerConnection.PeerConnectionState peerConnectionState) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onDataChannel(DataChannel dataChannel) {
        acne acneVar = this.b;
        if (acneVar != null) {
            if (dataChannel.a == 0) {
                throw new IllegalStateException("DataChannel has been disposed.");
            }
            long j = dataChannel.b;
            if (j != 0) {
                dataChannel.nativeUnregisterObserver(j);
            }
            dataChannel.b = dataChannel.nativeRegisterObserver(acneVar);
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceCandidate(IceCandidate iceCandidate) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr) {
        for (IceCandidate iceCandidate : iceCandidateArr) {
            String.valueOf(String.valueOf(iceCandidate)).length();
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
        PeerConnection.IceConnectionState iceConnectionState2 = PeerConnection.IceConnectionState.NEW;
        int ordinal = iceConnectionState.ordinal();
        if (ordinal != 2) {
            if (ordinal == 4) {
                this.a.a();
                return;
            }
            if (ordinal != 5) {
                return;
            }
            acma acmaVar = this.a;
            CountDownTimer countDownTimer = acmaVar.c;
            if (countDownTimer != null) {
                countDownTimer.start();
            }
            acmaVar.a.a();
            return;
        }
        acma acmaVar2 = this.a;
        abvt.b().m(12);
        acmaVar2.b();
        acnp acnpVar = acmaVar2.a;
        acnpVar.b.post(new acnm(acnpVar, 1));
        if (!acmaVar2.d) {
            acmaVar2.d = true;
            acog acogVar = acmaVar2.e;
            acogVar.a = true;
            acogVar.c.t(0, acogVar.b);
            return;
        }
        acmaVar2.b.c();
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceConnectionReceivingChange(boolean z) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onIceGatheringChange(PeerConnection.IceGatheringState iceGatheringState) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onRemoveStream(MediaStream mediaStream) {
        String.valueOf(String.valueOf(mediaStream)).length();
        acne acneVar = this.b;
        if (acneVar != null) {
            final acmw acmwVar = (acmw) acneVar;
            if (acmwVar.d.contains(acmwVar.i)) {
                return;
            }
            String valueOf = String.valueOf(acmwVar.i);
            if (valueOf.length() != 0) {
                "Removing track - ".concat(valueOf);
            }
            VideoTrack videoTrack = acmwVar.h;
            if (videoTrack != null) {
                Long l = (Long) videoTrack.a.remove(acmwVar.g);
                if (l != null) {
                    VideoTrack.nativeRemoveSink(videoTrack.a(), l.longValue());
                    VideoTrack.nativeFreeSink(l.longValue());
                }
                acmwVar.h = null;
            }
            if (acmwVar.f != null) {
                acmwVar.b.post(new Runnable() { // from class: acmr
                    @Override // java.lang.Runnable
                    public final void run() {
                        acif acifVar = (acif) acmw.this.f;
                        acifVar.aO(astk.LIVESTREAM_CONNECTION_STATE_DISCONNECTED);
                        acifVar.aM();
                    }
                });
            }
        }
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final /* synthetic */ void onRemoveTrack(RtpReceiver rtpReceiver) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onRenegotiationNeeded() {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final /* synthetic */ void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final void onSignalingChange(PeerConnection.SignalingState signalingState) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final /* synthetic */ void onStandardizedIceConnectionChange(PeerConnection.IceConnectionState iceConnectionState) {
    }

    @Override // org.webrtc.PeerConnection.Observer
    public final /* synthetic */ void onTrack(RtpTransceiver rtpTransceiver) {
    }
}
