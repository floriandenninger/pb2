package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class znl implements zng {
    public final znh a;
    public final View b;
    public final acra c;
    public final asht d;

    public znl(znh znhVar, View view, acra acraVar, asht ashtVar) {
        znhVar.getClass();
        this.a = znhVar;
        znhVar.i(this);
        view.getClass();
        this.b = view;
        view.setOnClickListener(new znk(this));
        acraVar.getClass();
        this.c = acraVar;
        this.d = ashtVar;
    }

    private final void k() {
        this.b.setEnabled(false);
    }

    @Override // defpackage.zng
    public final void a() {
        k();
    }

    @Override // defpackage.zng
    public final void b() {
        if (this.a.G()) {
            this.b.setEnabled(true);
            g(this.a.F(), false, false);
        } else {
            k();
        }
    }

    @Override // defpackage.zng
    public final void d() {
    }

    public abstract void g(boolean z, boolean z2, boolean z3);

    public final void h() {
        this.a.n(this);
    }

    public final void i(boolean z) {
        View view = this.b;
        view.getClass();
        if (zev.e(view.getContext())) {
            zev.c(this.b.getContext(), this.b, this.b.getContext().getString(true != z ? R.string.accessibility_flashlight_turned_off : R.string.accessibility_flashlight_turned_on));
        }
    }

    public final void j(int i, int i2) {
        View view = this.b;
        if (view instanceof ImageView) {
            Drawable drawable = view.getResources().getDrawable(i);
            ImageView imageView = (ImageView) view;
            imageView.setImageDrawable(drawable);
            Object drawable2 = imageView.getDrawable();
            if (drawable2 instanceof Animatable2) {
                Animatable2 animatable2 = (Animatable2) drawable2;
                animatable2.registerAnimationCallback(new znj(this, imageView, i2));
                animatable2.start();
            }
        }
    }

    @Override // defpackage.zng
    public final void mn() {
    }

    @Override // defpackage.zng
    public final void mr() {
    }

    @Override // defpackage.zng
    public final void ms() {
    }
}
