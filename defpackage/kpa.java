package defpackage;

import android.graphics.Rect;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kpa implements ayrs {
    public final /* synthetic */ YouTubeControlsOverlay a;
    private final /* synthetic */ int b;

    public /* synthetic */ kpa(YouTubeControlsOverlay youTubeControlsOverlay, int i) {
        this.b = i;
        this.a = youTubeControlsOverlay;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        switch (this.b) {
            case 0:
                this.a.T();
                return;
            case 1:
                YouTubeControlsOverlay youTubeControlsOverlay = this.a;
                Rect rect = (Rect) obj;
                youTubeControlsOverlay.k.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                aicz aiczVar = youTubeControlsOverlay.h;
                if (!aiczVar.b.equals(rect)) {
                    aiczVar.b.set(rect);
                    if (aiczVar.k()) {
                        ((aicw) aiczVar.d.get()).a(rect);
                    }
                }
                ksg ksgVar = youTubeControlsOverlay.j;
                if (ksgVar.c.equals(rect)) {
                    return;
                }
                ksgVar.c.set(rect);
                if (ksgVar.f) {
                    ksgVar.d();
                    return;
                }
                return;
            case 2:
                YouTubeControlsOverlay youTubeControlsOverlay2 = this.a;
                kii kiiVar = (kii) obj;
                if (kiiVar.a) {
                    youTubeControlsOverlay2.P(kiiVar.b);
                    if (kiiVar.c) {
                        youTubeControlsOverlay2.C();
                        return;
                    } else {
                        youTubeControlsOverlay2.F();
                        return;
                    }
                }
                if (youTubeControlsOverlay2.t == 0 || !youTubeControlsOverlay2.X()) {
                    return;
                }
                youTubeControlsOverlay2.S();
                return;
            case 3:
                YouTubeControlsOverlay youTubeControlsOverlay3 = this.a;
                if (((ahds) obj).b() == aigj.PARTIAL_PLAYBACK_END_OF_DOWNLOADED_BYTES) {
                    youTubeControlsOverlay3.e.b(youTubeControlsOverlay3.r);
                    return;
                } else {
                    youTubeControlsOverlay3.e.a(youTubeControlsOverlay3.r);
                    return;
                }
            case 4:
                this.a.D((ahdv) obj);
                return;
            case 5:
                this.a.b.b();
                return;
            case 6:
                YouTubeControlsOverlay youTubeControlsOverlay4 = this.a;
                youTubeControlsOverlay4.A = (ahuh) obj;
                youTubeControlsOverlay4.U();
                return;
            case 7:
                YouTubeControlsOverlay youTubeControlsOverlay5 = this.a;
                if (((aigr) obj).i == 15) {
                    youTubeControlsOverlay5.e.b(youTubeControlsOverlay5.r);
                    return;
                } else {
                    youTubeControlsOverlay5.e.a(youTubeControlsOverlay5.r);
                    return;
                }
            case 8:
                kmt kmtVar = this.a.f;
                kmtVar.i = ((Boolean) obj).booleanValue();
                kmtVar.u();
                return;
            case 9:
                YouTubeControlsOverlay youTubeControlsOverlay6 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    youTubeControlsOverlay6.W(true);
                    return;
                }
                return;
            case 10:
                this.a.p.setText((CharSequence) obj);
                return;
            default:
                this.a.L.c((Rect) obj);
                return;
        }
    }
}
