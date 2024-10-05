package org.webrtc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.DataChannel;
import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpTransceiver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class PeerConnection {
    public final long b;
    public final List a = new ArrayList();
    public List c = new ArrayList();
    public List d = new ArrayList();
    public List e = new ArrayList();

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum AdapterType {
        UNKNOWN(0),
        ETHERNET(1),
        WIFI(2),
        CELLULAR(4),
        VPN(8),
        LOOPBACK(16),
        ADAPTER_TYPE_ANY(32),
        CELLULAR_2G(64),
        CELLULAR_3G(128),
        CELLULAR_4G(256),
        CELLULAR_5G(512);

        private static final Map m = new HashMap();
        public final Integer l;

        static {
            for (AdapterType adapterType : values()) {
                m.put(adapterType.l, adapterType);
            }
        }

        AdapterType(Integer num) {
            this.l = num;
        }

        static AdapterType fromNativeIndex(int i) {
            return (AdapterType) m.get(Integer.valueOf(i));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum BundlePolicy {
        BALANCED,
        MAXBUNDLE,
        MAXCOMPAT
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum CandidateNetworkPolicy {
        ALL,
        LOW_COST
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum ContinualGatheringPolicy {
        GATHER_ONCE,
        GATHER_CONTINUALLY
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum IceConnectionState {
        NEW,
        CHECKING,
        CONNECTED,
        COMPLETED,
        FAILED,
        DISCONNECTED,
        CLOSED;

        static IceConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum IceGatheringState {
        NEW,
        GATHERING,
        COMPLETE;

        static IceGatheringState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class IceServer {
        public final boolean equals(Object obj) {
            throw null;
        }

        String getHostname() {
            throw null;
        }

        String getPassword() {
            throw null;
        }

        List getTlsAlpnProtocols() {
            throw null;
        }

        TlsCertPolicy getTlsCertPolicy() {
            throw null;
        }

        List getTlsEllipticCurves() {
            throw null;
        }

        List getUrls() {
            throw null;
        }

        String getUsername() {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum IceTransportsType {
        NONE,
        RELAY,
        NOHOST,
        ALL
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum KeyType {
        RSA,
        ECDSA
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface Observer {

        /* compiled from: PG */
        /* renamed from: org.webrtc.PeerConnection$Observer$-CC, reason: invalid class name */
        /* loaded from: classes4.dex */
        public final /* synthetic */ class CC {
            public static void $default$onAddTrack(Observer observer, RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr) {
            }

            public static void $default$onConnectionChange(Observer observer, PeerConnectionState peerConnectionState) {
            }

            public static void $default$onRemoveTrack(Observer observer, RtpReceiver rtpReceiver) {
            }

            public static void $default$onSelectedCandidatePairChanged(Observer observer, CandidatePairChangeEvent candidatePairChangeEvent) {
            }

            public static void $default$onStandardizedIceConnectionChange(Observer observer, IceConnectionState iceConnectionState) {
            }

            public static void $default$onTrack(Observer observer, RtpTransceiver rtpTransceiver) {
            }
        }

        void onAddStream(MediaStream mediaStream);

        void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

        void onConnectionChange(PeerConnectionState peerConnectionState);

        void onDataChannel(DataChannel dataChannel);

        void onIceCandidate(IceCandidate iceCandidate);

        void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr);

        void onIceConnectionChange(IceConnectionState iceConnectionState);

        void onIceConnectionReceivingChange(boolean z);

        void onIceGatheringChange(IceGatheringState iceGatheringState);

        void onRemoveStream(MediaStream mediaStream);

        void onRemoveTrack(RtpReceiver rtpReceiver);

        void onRenegotiationNeeded();

        void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent);

        void onSignalingChange(SignalingState signalingState);

        void onStandardizedIceConnectionChange(IceConnectionState iceConnectionState);

        void onTrack(RtpTransceiver rtpTransceiver);
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum PeerConnectionState {
        NEW,
        CONNECTING,
        CONNECTED,
        DISCONNECTED,
        FAILED,
        CLOSED;

        static PeerConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum PortPrunePolicy {
        NO_PRUNE,
        PRUNE_BASED_ON_PRIORITY,
        KEEP_FIRST_READY
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class RTCConfiguration {
        public List b;
        public IceTransportsType a = IceTransportsType.ALL;
        public BundlePolicy c = BundlePolicy.BALANCED;
        public RtcpMuxPolicy d = RtcpMuxPolicy.REQUIRE;
        public TcpCandidatePolicy e = TcpCandidatePolicy.ENABLED;
        public CandidateNetworkPolicy f = CandidateNetworkPolicy.ALL;
        public int g = 50;
        public int h = -1;
        public int i = -1;
        public KeyType j = KeyType.ECDSA;
        public ContinualGatheringPolicy k = ContinualGatheringPolicy.GATHER_ONCE;
        public PortPrunePolicy l = PortPrunePolicy.NO_PRUNE;
        public boolean m = false;
        public int n = 5;
        public boolean o = true;
        public AdapterType p = AdapterType.UNKNOWN;
        public SdpSemantics q = SdpSemantics.PLAN_B;
        public boolean r = true;

        public RTCConfiguration(List list) {
            this.b = list;
        }

        boolean getActiveResetSrtpParams() {
            return false;
        }

        Boolean getAllowCodecSwitching() {
            return null;
        }

        boolean getAudioJitterBufferFastAccelerate() {
            return false;
        }

        int getAudioJitterBufferMaxPackets() {
            return this.g;
        }

        BundlePolicy getBundlePolicy() {
            return this.c;
        }

        CandidateNetworkPolicy getCandidateNetworkPolicy() {
            return this.f;
        }

        RtcCertificatePem getCertificate() {
            return null;
        }

        Boolean getCombinedAudioVideoBwe() {
            return null;
        }

        ContinualGatheringPolicy getContinualGatheringPolicy() {
            return this.k;
        }

        CryptoOptions getCryptoOptions() {
            return null;
        }

        boolean getDisableIPv6OnWifi() {
            return false;
        }

        boolean getDisableIpv6() {
            return false;
        }

        boolean getEnableCpuOveruseDetection() {
            return this.o;
        }

        boolean getEnableDscp() {
            return false;
        }

        Boolean getEnableDtlsSrtp() {
            return null;
        }

        boolean getEnableImplicitRollback() {
            return false;
        }

        int getIceBackupCandidatePairPingInterval() {
            return this.i;
        }

        int getIceCandidatePoolSize() {
            return 0;
        }

        Integer getIceCheckIntervalStrongConnectivity() {
            return null;
        }

        Integer getIceCheckIntervalWeakConnectivity() {
            return null;
        }

        Integer getIceCheckMinInterval() {
            return null;
        }

        int getIceConnectionReceivingTimeout() {
            return this.h;
        }

        List getIceServers() {
            return this.b;
        }

        IceTransportsType getIceTransportsType() {
            return this.a;
        }

        Integer getIceUnwritableMinChecks() {
            return null;
        }

        Integer getIceUnwritableTimeout() {
            return null;
        }

        KeyType getKeyType() {
            return this.j;
        }

        int getMaxIPv6Networks() {
            return this.n;
        }

        AdapterType getNetworkPreference() {
            return this.p;
        }

        boolean getOfferExtmapAllowMixed() {
            return this.r;
        }

        boolean getPresumeWritableWhenFullyRelayed() {
            return this.m;
        }

        boolean getPruneTurnPorts() {
            return false;
        }

        RtcpMuxPolicy getRtcpMuxPolicy() {
            return this.d;
        }

        Integer getScreencastMinBitrate() {
            return null;
        }

        SdpSemantics getSdpSemantics() {
            return this.q;
        }

        Integer getStableWritableConnectionPingIntervalMs() {
            return null;
        }

        Integer getStunCandidateKeepaliveInterval() {
            return null;
        }

        boolean getSurfaceIceCandidatesOnIceTransportTypeChanged() {
            return false;
        }

        boolean getSuspendBelowMinBitrate() {
            return false;
        }

        TcpCandidatePolicy getTcpCandidatePolicy() {
            return this.e;
        }

        TurnCustomizer getTurnCustomizer() {
            return null;
        }

        String getTurnLoggingId() {
            return null;
        }

        PortPrunePolicy getTurnPortPrunePolicy() {
            return this.l;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum RtcpMuxPolicy {
        NEGOTIATE,
        REQUIRE
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum SdpSemantics {
        PLAN_B,
        UNIFIED_PLAN
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum SignalingState {
        STABLE,
        HAVE_LOCAL_OFFER,
        HAVE_LOCAL_PRANSWER,
        HAVE_REMOTE_OFFER,
        HAVE_REMOTE_PRANSWER,
        CLOSED;

        static SignalingState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum TcpCandidatePolicy {
        ENABLED,
        DISABLED
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public enum TlsCertPolicy {
        TLS_CERT_POLICY_SECURE,
        TLS_CERT_POLICY_INSECURE_NO_CHECK
    }

    public PeerConnection(long j) {
        this.b = j;
    }

    private native boolean nativeAddIceCandidate(String str, int i, String str2);

    private native void nativeAddIceCandidateWithObserver(String str, int i, String str2, AddIceObserver addIceObserver);

    private native RtpSender nativeAddTrack(long j, List list);

    private native RtpTransceiver nativeAddTransceiverOfType(MediaStreamTrack.MediaType mediaType, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit);

    private native RtpTransceiver nativeAddTransceiverWithTrack(long j, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit);

    private native PeerConnectionState nativeConnectionState();

    private native void nativeCreateAnswer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    public static native long nativeCreatePeerConnectionObserver(Observer observer);

    private native RtpSender nativeCreateSender(String str, String str2);

    public static native void nativeFreeOwnedPeerConnection(long j);

    private native RtcCertificatePem nativeGetCertificate();

    private native SessionDescription nativeGetLocalDescription();

    private native long nativeGetNativePeerConnection();

    private native List nativeGetReceivers();

    private native SessionDescription nativeGetRemoteDescription();

    private native List nativeGetSenders();

    private native List nativeGetTransceivers();

    private native IceConnectionState nativeIceConnectionState();

    private native IceGatheringState nativeIceGatheringState();

    private native void nativeNewGetStats(RTCStatsCollectorCallback rTCStatsCollectorCallback);

    private native boolean nativeOldGetStats(StatsObserver statsObserver, long j);

    private native boolean nativeRemoveIceCandidates(IceCandidate[] iceCandidateArr);

    private native boolean nativeRemoveTrack(long j);

    private native void nativeRestartIce();

    private native void nativeSetAudioPlayout(boolean z);

    private native void nativeSetAudioRecording(boolean z);

    private native boolean nativeSetConfiguration(RTCConfiguration rTCConfiguration);

    private native void nativeSetLocalDescriptionAutomatically(SdpObserver sdpObserver);

    private native SignalingState nativeSignalingState();

    @Deprecated
    public final void a(StatsObserver statsObserver, MediaStreamTrack mediaStreamTrack) {
        nativeOldGetStats(statsObserver, mediaStreamTrack == null ? 0L : mediaStreamTrack.a());
    }

    long getNativeOwnedPeerConnection() {
        return this.b;
    }

    public native boolean nativeAddLocalStream(long j);

    public native void nativeClose();

    public native DataChannel nativeCreateDataChannel(String str, DataChannel.Init init);

    public native void nativeCreateOffer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    public native void nativeRemoveLocalStream(long j);

    public native boolean nativeSetBitrate(Integer num, Integer num2, Integer num3);

    public native void nativeSetLocalDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);

    public native void nativeSetRemoteDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);

    public native boolean nativeStartRtcEventLog(int i, int i2);

    public native void nativeStopRtcEventLog();
}
