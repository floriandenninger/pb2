package defpackage;

import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class acnj implements SdpObserver {
    @Override // org.webrtc.SdpObserver
    public final void onCreateFailure(String str) {
        zga.c("SetDescriptionCallback", "onCreateFailure() called, this class is only meant for set description callbacks.");
    }

    @Override // org.webrtc.SdpObserver
    public final void onCreateSuccess(SessionDescription sessionDescription) {
        zga.c("SetDescriptionCallback", "onCreateSuccess() called, this class is only meant for set description callbacks.");
    }
}
