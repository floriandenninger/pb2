package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.PeerConnection;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aclr implements SdpObserver {
    final /* synthetic */ boolean a;
    final /* synthetic */ acnd b;

    public aclr() {
    }

    public aclr(acnd acndVar, boolean z) {
        this.b = acndVar;
        this.a = z;
    }

    @Override // org.webrtc.SdpObserver
    public final void onCreateFailure(String str) {
        zga.c("PeerConnectionClient", "Failed to create offer.");
        this.b.A.a();
    }

    @Override // org.webrtc.SdpObserver
    public final void onCreateSuccess(SessionDescription sessionDescription) {
        if (this.b.f) {
            String str = sessionDescription.b;
            Matcher matcher = acni.a.matcher(str);
            if (matcher.find()) {
                Matcher matcher2 = Pattern.compile(String.format("a=fmtp:%s( stereo=1;sprop-stereo=1;)?", matcher.group(1))).matcher(str);
                if (matcher2.find()) {
                    String group = matcher2.group();
                    if (!group.contains(" stereo=1;sprop-stereo=1;")) {
                        str = matcher2.replaceFirst(String.valueOf(group).concat(" stereo=1;sprop-stereo=1;"));
                    }
                }
            }
            sessionDescription = new SessionDescription(sessionDescription.a, str);
        }
        String str2 = sessionDescription.b;
        List list = this.b.e;
        if (list == null) {
            str2 = acni.d(str2, axio.H264);
        } else {
            Iterator it = amkq.aT(list).iterator();
            while (it.hasNext()) {
                str2 = acni.d(str2, (axio) it.next());
            }
        }
        SessionDescription sessionDescription2 = new SessionDescription(sessionDescription.a, str2);
        acnd acndVar = this.b;
        boolean z = this.a;
        String.valueOf(String.valueOf(sessionDescription2.a)).length();
        String valueOf = String.valueOf(sessionDescription2.b);
        if (valueOf.length() != 0) {
            "setLocalDescription description: ".concat(valueOf);
        }
        PeerConnection peerConnection = acndVar.y;
        if (peerConnection != null) {
            peerConnection.nativeSetLocalDescription(new acmz(acndVar, z, sessionDescription2), sessionDescription2);
        }
    }

    @Override // org.webrtc.SdpObserver
    public final void onSetFailure(String str) {
        zga.c("CreateOfferCallback", "onSetFailure() called, this class is only meant for create offer callbacks.");
    }

    @Override // org.webrtc.SdpObserver
    public final void onSetSuccess() {
        zga.c("CreateOfferCallback", "onSetSuccess() called, this class is only meant for create offer callbacks.");
    }
}
