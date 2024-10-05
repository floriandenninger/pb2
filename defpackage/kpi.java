package defpackage;

import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kpi implements aida {
    final /* synthetic */ YouTubeControlsOverlay a;

    public kpi(YouTubeControlsOverlay youTubeControlsOverlay) {
        this.a = youTubeControlsOverlay;
    }

    @Override // defpackage.aida
    public final void d(int i, int i2, int i3) {
        YouTubeControlsOverlay youTubeControlsOverlay = this.a;
        youTubeControlsOverlay.D = true;
        if (!youTubeControlsOverlay.Y(!youTubeControlsOverlay.h.c.e())) {
            boolean z = (i == 2 || i == 1) && this.a.h.c.f() && i3 != 0 && this.a.X() && this.a.y.a == ahvo.PLAYING;
            if (z) {
                this.a.C();
                this.a.S();
            }
            if (i != i2) {
                if (this.a.h.c.e() || this.a.h.getParent() != null) {
                    if (this.a.h.c.e() && this.a.h.getParent() != null) {
                        this.a.h.clearAnimation();
                        YouTubeControlsOverlay youTubeControlsOverlay2 = this.a;
                        youTubeControlsOverlay2.l.removeView(youTubeControlsOverlay2.h);
                    }
                } else {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    this.a.h.setLayoutParams(layoutParams);
                    YouTubeControlsOverlay youTubeControlsOverlay3 = this.a;
                    youTubeControlsOverlay3.l.addView(youTubeControlsOverlay3.h);
                    this.a.h.bringToFront();
                    this.a.V();
                }
                if (!z && this.a.h.c.d()) {
                    this.a.C();
                }
                this.a.i.a(!r4.h.c.e());
            }
        }
        this.a.D = false;
    }

    @Override // defpackage.aida
    public final void nW(float f, boolean z) {
        if (z && this.a.h.c.g()) {
            this.a.C();
        }
    }
}
