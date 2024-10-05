package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oai {
    public final ImageView a;
    public final ProgressBar b;
    public final oak c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    private Drawable g;
    private Drawable h;
    private Drawable i;

    public oai(ImageView imageView, ProgressBar progressBar, oak oakVar) {
        this.a = imageView;
        this.b = progressBar;
        this.c = oakVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i) {
        boolean z = true;
        this.a.setEnabled(true);
        this.a.setOnClickListener(new oah(this, 2));
        this.b.setVisibility(8);
        if (i == 1) {
            if (this.i == null) {
                this.i = aii.a(this.a.getContext(), R.drawable.yt_fill_pause_black_24);
            }
            b(this.i, R.string.accessibility_pause);
        } else if (i == 2) {
            if (this.g == null) {
                this.g = aii.a(this.a.getContext(), R.drawable.yt_fill_play_arrow_black_24);
            }
            b(this.g, R.string.accessibility_play);
        } else if (i == 3) {
            if (this.h == null) {
                this.h = aii.a(this.a.getContext(), R.drawable.yt_outline_arrow_circle_black_24);
            }
            b(this.h, R.string.accessibility_replay);
        } else if (i == 4) {
            z = false;
        }
        whu.I(this.a, z);
    }

    public final void b(Drawable drawable, int i) {
        this.a.setImageDrawable(drawable);
        ImageView imageView = this.a;
        imageView.setContentDescription(imageView.getContext().getText(i));
    }

    public final void c(int i, int i2) {
        this.b.setMax(i);
        this.b.setProgress(i2);
    }
}
