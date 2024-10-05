package org.webrtc;

import java.util.Arrays;
import org.webrtc.PeerConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class IceCandidate {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final PeerConnection.AdapterType e;

    IceCandidate(String str, int i, String str2, String str3, PeerConnection.AdapterType adapterType) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = adapterType;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IceCandidate)) {
            return false;
        }
        IceCandidate iceCandidate = (IceCandidate) obj;
        return a(this.a, iceCandidate.a) && this.b == iceCandidate.b && a(this.c, iceCandidate.c);
    }

    String getSdp() {
        return this.c;
    }

    String getSdpMid() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c});
    }

    public final String toString() {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String adapterType = this.e.toString();
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 15 + length2 + String.valueOf(str3).length() + String.valueOf(adapterType).length());
        sb.append(str);
        sb.append(":");
        sb.append(i);
        sb.append(":");
        sb.append(str2);
        sb.append(":");
        sb.append(str3);
        sb.append(":");
        sb.append(adapterType);
        return sb.toString();
    }
}
