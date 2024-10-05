package org.webrtc;

import org.webrtc.PeerConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RtcCertificatePem {
    public final String a;
    public final String b;

    public RtcCertificatePem(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    private static native RtcCertificatePem nativeGenerateCertificate(PeerConnection.KeyType keyType, long j);

    String getCertificate() {
        return this.b;
    }

    String getPrivateKey() {
        return this.a;
    }
}
