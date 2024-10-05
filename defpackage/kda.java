package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kda implements fgp {
    public int a;
    public View b;
    public View c;
    public flr[] d;
    private final ainy e;
    private final aifs f;
    private int g = -1;
    private final kch h;

    public kda(ainy ainyVar, aifs aifsVar, kch kchVar) {
        this.e = ainyVar;
        this.h = kchVar;
        this.f = aifsVar;
    }

    public final void a(float f) {
        this.d[this.a].setAlpha(f);
        int i = (int) (f * 5.0f);
        if (i != this.g) {
            this.g = i;
            ((kcz) this.h.get()).ay.I(Math.max(0.0f, Math.min(1.0f, 1.0f - ((float) (Math.log((5 - i) + 1) / Math.log(6.0d))))));
        }
    }

    public final void b(int i) {
        if (this.a == i) {
            return;
        }
        a(1.0f);
        if (!this.f.m) {
            this.e.a();
        }
        this.e.z(false);
        this.d[this.a].c(this.b, this.c);
        this.a = i;
        this.d[i].b(this.b, this.c);
        kcz kczVar = (kcz) this.h.get();
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = kczVar.aT;
        if (youTubePlayerViewNotForReflection != null) {
            kczVar.ay.x(youTubePlayerViewNotForReflection.d, (aifp) kczVar.as.get());
        }
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (fhgVar != fhg.NONE) {
            b(fhgVar.d() ? 1 : 0);
        }
        if (fhgVar == fhg.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED || !fhgVar.f()) {
            return;
        }
        a(1.0f);
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }
}
