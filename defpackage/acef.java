package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acef implements ykl {
    final /* synthetic */ Resources a;
    final /* synthetic */ ImageView b;
    private final /* synthetic */ int c;

    public acef(Resources resources, ImageView imageView, int i) {
        this.c = i;
        this.a = resources;
        this.b = imageView;
    }

    @Override // defpackage.ykl
    public final /* synthetic */ void a(Object obj, Exception exc) {
        if (this.c != 0) {
        }
    }

    @Override // defpackage.ykl
    public final /* synthetic */ void b(Object obj, Object obj2) {
        if (this.c == 0) {
            final ga a = gl.a(this.a, (Bitmap) obj2);
            a.c();
            final ImageView imageView = this.b;
            final int i = 0;
            imageView.post(new Runnable() { // from class: acee
                @Override // java.lang.Runnable
                public final void run() {
                    if (i != 0) {
                        imageView.setImageDrawable(a);
                    } else {
                        imageView.setImageDrawable(a);
                    }
                }
            });
            return;
        }
        final ga a2 = gl.a(this.a, (Bitmap) obj2);
        a2.c();
        Handler handler = new Handler(Looper.getMainLooper());
        final ImageView imageView2 = this.b;
        final int i2 = 1;
        handler.post(new Runnable() { // from class: acee
            @Override // java.lang.Runnable
            public final void run() {
                if (i2 != 0) {
                    imageView2.setImageDrawable(a2);
                } else {
                    imageView2.setImageDrawable(a2);
                }
            }
        });
    }
}
