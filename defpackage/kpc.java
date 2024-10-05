package defpackage;

import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kpc implements Runnable {
    public final /* synthetic */ YouTubeControlsOverlay a;
    private final /* synthetic */ int b;

    public /* synthetic */ kpc(YouTubeControlsOverlay youTubeControlsOverlay, int i) {
        this.b = i;
        this.a = youTubeControlsOverlay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.pA();
        } else {
            this.a.n.a.sendAccessibilityEvent(4);
        }
    }
}
