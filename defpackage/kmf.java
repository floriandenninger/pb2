package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kmf {
    public final kly a;
    public final aicg b;
    public final koj c;
    public final axzg e;
    public YouTubeControlsOverlay f;
    public int g;
    public int h;
    public int i;
    public int j;
    public String l;
    public yzr m;
    public yzr n;
    public yzr o;
    public yzr p;
    public yzr q;
    private final aivo r;
    public int k = 0;
    public final ayqw d = new ayqw();

    public kmf(kly klyVar, aicg aicgVar, aivo aivoVar, koj kojVar, axzg axzgVar) {
        this.a = klyVar;
        this.b = aicgVar;
        this.r = aivoVar;
        this.c = kojVar;
        this.e = axzgVar;
    }

    public static void b(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i2;
        }
    }

    public static void c(yzr yzrVar, int i) {
        if (yzrVar == null) {
            return;
        }
        yzrVar.d = i;
    }

    public final void a(boolean z) {
        long j;
        if (z) {
            j = this.b.a().toMillis();
        } else {
            j = -this.b.a().toMillis();
        }
        this.r.g(j);
        YouTubeControlsOverlay youTubeControlsOverlay = this.f;
        youTubeControlsOverlay.l.post(youTubeControlsOverlay.F);
    }
}
