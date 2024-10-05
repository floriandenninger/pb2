package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mti {
    public final Context a;
    public final ImageView b;
    public final ajjv c;
    private final ajjz d;
    private final double e;

    public mti(Context context, ImageView imageView, ajjz ajjzVar, ajjv ajjvVar, double d) {
        this.a = context;
        this.b = imageView;
        this.d = ajjzVar;
        this.c = ajjvVar;
        this.e = d;
    }

    public final void a(avgg avggVar, boolean z) {
        Uri C;
        this.b.setImageDrawable(null);
        if (this.b.getWidth() == 0) {
            this.b.addOnLayoutChangeListener(new mth(this, avggVar, z));
            return;
        }
        if (z) {
            double width = this.b.getWidth();
            double d = this.e;
            Double.isNaN(width);
            int i = (int) (width / d);
            double d2 = i;
            Double.isNaN(d2);
            C = ahbw.C(avggVar, (int) (d2 * 1.7777777777777777d), i);
        } else {
            C = ahbw.C(avggVar, this.b.getWidth(), this.b.getHeight());
        }
        mtg mtgVar = new mtg(this, z);
        if (C != null) {
            this.d.l(C, mtgVar);
        } else {
            mtgVar.a(null, null);
        }
    }
}
