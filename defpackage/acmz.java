package defpackage;

import org.webrtc.SessionDescription;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acmz extends acnj {
    final /* synthetic */ boolean a;
    final /* synthetic */ SessionDescription b;
    final /* synthetic */ acnd c;

    public acmz(acnd acndVar, boolean z, SessionDescription sessionDescription) {
        this.c = acndVar;
        this.a = z;
        this.b = sessionDescription;
    }

    @Override // org.webrtc.SdpObserver
    public final void onSetFailure(String str) {
        zga.c("PeerConnectionClient", "Failed to set local description.");
        this.c.A.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x014f A[Catch: JSONException -> 0x0153, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0153, blocks: (B:26:0x013e, B:28:0x014f), top: B:25:0x013e }] */
    @Override // org.webrtc.SdpObserver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSetSuccess() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acmz.onSetSuccess():void");
    }
}
