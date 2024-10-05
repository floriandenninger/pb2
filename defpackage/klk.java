package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class klk {
    public View a;
    public ImageView b;
    public TextView c;
    public TextView d;
    public yzr f;
    private final ajjz g;
    public boolean e = false;
    private boolean h = true;

    public klk(ajjz ajjzVar) {
        this.g = ajjzVar;
    }

    public final void a(boolean z) {
        if (this.h == z) {
            return;
        }
        this.h = z;
        whu.I(this.a, z);
        whu.I(this.c, this.h);
        whu.I(this.d, this.h);
    }

    public final void b(CharSequence charSequence, CharSequence charSequence2, avgg avggVar) {
        yjk.f();
        this.c.setText(charSequence);
        this.d.setText(charSequence2);
        if (avggVar == null) {
            this.g.e(this.b);
        } else {
            this.g.k(this.b, avggVar, ajjv.b);
        }
    }
}
