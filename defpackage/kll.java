package defpackage;

import com.google.android.apps.youtube.app.player.overlay.InteractiveInlineMutedControlsOverlay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kll implements Runnable {
    public final /* synthetic */ InteractiveInlineMutedControlsOverlay a;
    private final /* synthetic */ int b;

    public /* synthetic */ kll(InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay, int i) {
        this.b = i;
        this.a = interactiveInlineMutedControlsOverlay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            InteractiveInlineMutedControlsOverlay interactiveInlineMutedControlsOverlay = this.a;
            interactiveInlineMutedControlsOverlay.k.start();
            interactiveInlineMutedControlsOverlay.r.postDelayed(interactiveInlineMutedControlsOverlay.j, 2140L);
        } else if (i != 1) {
            this.a.A();
        } else {
            this.a.l.startTransition(500);
        }
    }
}
