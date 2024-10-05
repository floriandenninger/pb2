package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xzw implements Runnable {
    final /* synthetic */ Drawable a;
    final /* synthetic */ Uri b;
    final /* synthetic */ xzx c;

    public xzw(xzx xzxVar, Drawable drawable, Uri uri) {
        this.c = xzxVar;
        this.a = drawable;
        this.b = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable drawable = this.a;
        if (drawable == null) {
            this.c.a.setImageDrawable(null);
            return;
        }
        this.c.a.setImageDrawable(drawable);
        if (this.c.c && Build.VERSION.SDK_INT >= 22) {
            Drawable drawable2 = this.a;
            if (drawable2 instanceof BitmapDrawable) {
                ga a = gl.a(this.c.a.getContext().getResources(), ((BitmapDrawable) drawable2).getBitmap());
                a.d();
                this.c.a.setImageDrawable(a);
            }
        }
        if (!this.b.equals(this.c.a.getTag(R.id.bitmap_source_tag))) {
            this.c.a.setTag(R.id.bitmap_source_tag, this.b);
            if (this.c.b.hasStarted() && !this.c.b.hasEnded()) {
                this.c.b.cancel();
                this.c.b.reset();
            }
            xzx xzxVar = this.c;
            xzxVar.a.startAnimation(xzxVar.b);
        }
        Object obj = this.a;
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            if (animatable.isRunning()) {
                return;
            }
            animatable.start();
        }
    }
}
