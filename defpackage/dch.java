package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dch extends dco implements dcr {
    private Animatable c;

    public dch(ImageView imageView) {
        super(imageView);
    }

    private final void p(Object obj) {
        i(obj);
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    @Override // defpackage.dcb, defpackage.dcl
    public void a(Drawable drawable) {
        p(null);
        j(drawable);
    }

    @Override // defpackage.dcl
    public void b(Object obj, dcs dcsVar) {
        if (dcsVar != null) {
            dcsVar.a(this);
        }
        p(obj);
    }

    @Override // defpackage.dcb, defpackage.dcl
    public void f(Drawable drawable) {
        p(null);
        j(drawable);
    }

    protected abstract void i(Object obj);

    public final void j(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.dcb, defpackage.dcl
    public void jZ(Drawable drawable) {
        this.b.c();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        p(null);
        j(drawable);
    }

    @Override // defpackage.dcb, defpackage.daq
    public final void l() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.dcb, defpackage.daq
    public final void m() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
