package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acnb extends acnj {
    final /* synthetic */ acnd a;

    public acnb(acnd acndVar) {
        this.a = acndVar;
    }

    @Override // org.webrtc.SdpObserver
    public final void onSetFailure(String str) {
        zga.c("PeerConnectionClient", "Failed to set remote description.");
        this.a.A.a();
    }

    @Override // org.webrtc.SdpObserver
    public final void onSetSuccess() {
        acnd acndVar = this.a;
        acndVar.j.post(acndVar.b);
    }
}
