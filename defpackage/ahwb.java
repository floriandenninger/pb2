package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ahwb implements Runnable {
    public final /* synthetic */ LiveOverlayPresenter a;
    private final /* synthetic */ int b;

    public /* synthetic */ ahwb(LiveOverlayPresenter liveOverlayPresenter, int i) {
        this.b = i;
        this.a = liveOverlayPresenter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.o();
        } else if (i != 1) {
            this.a.k();
        } else {
            this.a.j();
        }
    }
}
