package defpackage;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afph {
    public final Context a;
    public final ImageView b;
    private final ajjz c;

    public afph(Context context, ImageView imageView, ajjz ajjzVar) {
        this.a = context;
        this.b = imageView;
        this.c = ajjzVar;
    }

    public final void a(avgg avggVar) {
        this.b.setImageDrawable(null);
        if (this.b.getWidth() == 0) {
            this.b.addOnLayoutChangeListener(new afpg(this, avggVar));
            return;
        }
        Uri C = ahbw.C(avggVar, this.b.getWidth(), this.b.getHeight());
        afpf afpfVar = new afpf(this);
        if (C != null) {
            this.c.l(C, afpfVar);
        } else {
            afpfVar.a(null, null);
        }
    }
}
