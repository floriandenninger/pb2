package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xkh {
    public final Context a;
    public final ImageView b;
    public final AdCountdownTextView c;
    public final xkp d;
    public final ColorDrawable e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public xkq p;
    private final Resources q;
    private final int r;

    public xkh(Context context, Resources resources, ImageView imageView, AdCountdownTextView adCountdownTextView, float f) {
        this.a = context;
        this.q = resources;
        this.b = imageView;
        this.c = adCountdownTextView;
        ColorDrawable colorDrawable = (ColorDrawable) adCountdownTextView.getBackground();
        this.e = colorDrawable;
        this.f = colorDrawable.getColor();
        this.g = aih.d(context, R.color.skip_ad_button_inverted_background_color);
        int currentTextColor = adCountdownTextView.getCurrentTextColor();
        this.h = currentTextColor;
        this.i = aih.d(context, R.color.skip_ad_button_inverted_foreground_color);
        this.d = new xkp(adCountdownTextView, adCountdownTextView.getText(), currentTextColor, adCountdownTextView.getTextSize(), colorDrawable, f);
        this.k = adCountdownTextView.getPaddingRight();
        this.j = adCountdownTextView.getPaddingLeft();
        this.l = resources.getDimensionPixelSize(R.dimen.countdown_view_thumbnail_default_width);
        this.m = resources.getDimensionPixelSize(R.dimen.countdown_view_thumbnail_default_height);
        this.n = adCountdownTextView.a;
        this.o = resources.getInteger(android.R.integer.config_shortAnimTime);
        this.r = resources.getInteger(android.R.integer.config_longAnimTime);
    }

    public final void a() {
        jw.q(this.c).a();
    }

    public final void b() {
        this.c.setAlpha(1.0f);
        ka q = jw.q(this.c);
        q.c(0.0f);
        q.d(this.r);
        q.g(5000L);
        q.f(new xkf(this));
    }

    public final void d(int i, int i2) {
        xkp xkpVar = this.d;
        Integer valueOf = Integer.valueOf((i2 + 999) / 1000);
        xkpVar.d(valueOf);
        this.d.a = this.q.getString(i, valueOf);
        this.d.a();
    }

    public final void c(aoyq aoyqVar) {
        aowu aowuVar;
        xkq xkqVar = this.p;
        if (aoyqVar == null) {
            aowuVar = null;
        } else {
            aowuVar = aoyqVar.f;
            if (aowuVar == null) {
                aowuVar = aowu.a;
            }
        }
        xkqVar.c(aowuVar);
        this.d.b(aoyqVar);
        this.d.a();
        this.p.a();
        int i = this.c.getLayoutParams().width;
        int i2 = this.b.getLayoutParams().width;
        if (i != i2) {
            int max = Math.max(i, i2);
            this.c.getLayoutParams().width = max;
            this.b.getLayoutParams().width = max;
        }
    }
}
