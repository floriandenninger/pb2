package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xkq extends xkr {
    public aami a;
    private final ajkj b;
    private aowu f;

    public xkq(ImageView imageView, ajkj ajkjVar, Drawable drawable, float f) {
        super(imageView, drawable, f);
        this.b = ajkjVar;
        this.a = null;
    }

    @Override // defpackage.xkr
    public final void a() {
        super.a();
        aowu aowuVar = this.f;
        avgg avggVar = null;
        if (aowuVar != null && (aowuVar.b & 1) != 0 && (avggVar = aowuVar.c) == null) {
            avggVar = avgg.a;
        }
        if (avggVar != null) {
            this.b.k(avggVar);
            return;
        }
        aami aamiVar = this.a;
        if (aamiVar == null) {
            this.b.a();
        } else {
            this.b.j(aamiVar);
        }
    }

    public final void b() {
        this.a = null;
        c(null);
        a();
    }

    public final void c(aowu aowuVar) {
        this.f = aowuVar;
        aowk aowkVar = null;
        if (aowuVar != null && (aowuVar.b & 2) != 0) {
            aowv aowvVar = aowuVar.d;
            if (aowvVar == null) {
                aowvVar = aowv.a;
            }
            aowkVar = aowvVar.c;
            if (aowkVar == null) {
                aowkVar = aowk.a;
            }
        }
        this.d = aowkVar;
    }
}
