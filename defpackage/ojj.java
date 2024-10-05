package defpackage;

import com.google.android.apps.youtube.app.watch.playback.SingleLoopPlaybackMonitor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ojj implements akbl {
    final /* synthetic */ SingleLoopPlaybackMonitor a;

    public ojj(SingleLoopPlaybackMonitor singleLoopPlaybackMonitor) {
        this.a = singleLoopPlaybackMonitor;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void li(Object obj, int i) {
        this.a.a.q(new acqx(acsb.c(123602)), null);
        this.a.c = false;
    }

    @Override // defpackage.akbl
    public final /* bridge */ /* synthetic */ void lj(Object obj) {
        this.a.a.n(new acqx(acsb.c(123602)));
        this.a.c = true;
    }
}
