package defpackage;

import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akmg {
    private static final ajjv a;
    private final ajjz b;
    private final ImageView c;

    static {
        ajju a2 = ajjv.a();
        a2.b(R.drawable.product_logo_avatar_square_grey_color_120);
        a = a2.a();
    }

    public akmg(ajjz ajjzVar, ImageView imageView) {
        ajjzVar.getClass();
        this.b = ajjzVar;
        imageView.getClass();
        this.c = imageView;
    }

    public final void a(avgg avggVar) {
        this.b.k(this.c, avggVar, a);
    }

    public final void b(int i) {
        this.c.setVisibility(i);
    }
}
