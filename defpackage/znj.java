package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class znj extends Animatable2.AnimationCallback {
    final /* synthetic */ ImageView a;
    final /* synthetic */ int b;
    final /* synthetic */ znl c;

    public znj(znl znlVar, ImageView imageView, int i) {
        this.c = znlVar;
        this.a = imageView;
        this.b = i;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.a.setImageDrawable(this.c.b.getResources().getDrawable(this.b));
    }
}
