package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.ShortsZoomSlider;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hfk implements Runnable {
    public final /* synthetic */ ShortsZoomSlider a;
    private final /* synthetic */ int b;

    public /* synthetic */ hfk(ShortsZoomSlider shortsZoomSlider, int i) {
        this.b = i;
        this.a = shortsZoomSlider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.b(0.0f);
            return;
        }
        ShortsZoomSlider shortsZoomSlider = this.a;
        if (shortsZoomSlider.c == 0.0f) {
            shortsZoomSlider.setVisibility(4);
            jqr jqrVar = shortsZoomSlider.f;
            if (jqrVar != null) {
                jqrVar.a(ShortsZoomSlider.a()).d();
            }
        }
        shortsZoomSlider.c = -1.0f;
    }
}
