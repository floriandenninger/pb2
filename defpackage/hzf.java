package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hzf implements ykl {
    final /* synthetic */ ImageView a;
    final /* synthetic */ Context b;
    final /* synthetic */ hzg c;

    public hzf(hzg hzgVar, ImageView imageView, Context context) {
        this.c = hzgVar;
        this.a = imageView;
        this.b = context;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.c.v.d(new Runnable() { // from class: hzd
            @Override // java.lang.Runnable
            public final void run() {
                hzg hzgVar = hzf.this.c;
                hzgVar.v.g(hzgVar.x);
            }
        });
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final Drawable drawable = (Drawable) obj2;
        iag iagVar = this.c.v;
        final ImageView imageView = this.a;
        final Context context = this.b;
        iagVar.d(new Runnable() { // from class: hze
            @Override // java.lang.Runnable
            public final void run() {
                hzf hzfVar = hzf.this;
                ImageView imageView2 = imageView;
                Drawable drawable2 = drawable;
                Context context2 = context;
                imageView2.setImageDrawable(drawable2);
                hzfVar.c.w = wcy.A(context2, imageView2);
                hzfVar.c.u.setVisibility(8);
                hzfVar.c.t.addView(imageView2);
            }
        });
    }
}
