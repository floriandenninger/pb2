package defpackage;

import com.google.android.apps.youtube.app.player.overlay.PipPaidProductBadgeOverlay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kmq implements Runnable {
    final /* synthetic */ PipPaidProductBadgeOverlay a;

    public kmq(PipPaidProductBadgeOverlay pipPaidProductBadgeOverlay) {
        this.a = pipPaidProductBadgeOverlay;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h();
    }
}
