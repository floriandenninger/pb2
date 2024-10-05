package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acog {
    public boolean a = false;
    final /* synthetic */ abso b;
    final /* synthetic */ acoj c;

    public acog(acoj acojVar, abso absoVar) {
        this.c = acojVar;
        this.b = absoVar;
    }

    public final void a() {
        if (this.a) {
            zga.c("WebRtcCapturePipelineMgr", "A peer connection error occurred while streaming");
            this.c.u(7);
        } else {
            this.c.t(7, this.b);
        }
    }
}
