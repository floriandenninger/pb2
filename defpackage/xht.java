package defpackage;

import android.widget.ImageView;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xht {
    public final AdCountdownView a;
    private int b;

    public xht(AdCountdownView adCountdownView, ajjz ajjzVar) {
        adCountdownView.getClass();
        this.a = adCountdownView;
        adCountdownView.b = new xkq(adCountdownView.d, new ajkj(ajjzVar.b(), adCountdownView.d), adCountdownView.getBackground(), adCountdownView.getAlpha());
        xkh xkhVar = adCountdownView.c;
        ajkj ajkjVar = new ajkj(ajjzVar.b(), xkhVar.b);
        ImageView imageView = xkhVar.b;
        xkhVar.p = new xkq(imageView, ajkjVar, imageView.getBackground(), xkhVar.b.getAlpha());
        this.b = adCountdownView.getVisibility();
        a();
    }

    public final void a() {
        b(false);
        this.a.a();
    }

    public final void b(boolean z) {
        this.a.b(z);
        this.a.setVisibility(this.b);
    }

    public final void c(int i) {
        this.b = i;
        this.a.setVisibility(i);
    }
}
