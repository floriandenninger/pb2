package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mho extends ajjh {
    final /* synthetic */ awpf a;
    final /* synthetic */ mgu b;
    final /* synthetic */ String c;

    public mho(awpf awpfVar, mgu mguVar, String str) {
        this.a = awpfVar;
        this.b = mguVar;
        this.c = str;
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void a(ImageView imageView) {
        this.b.a(this.c);
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void b(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if ((this.a.b & 1) == 0) {
                this.b.b(this.c, bitmapDrawable.getBitmap());
                return;
            }
            mgu mguVar = this.b;
            String str = this.c;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            int y = awxr.y(this.a.d);
            mguVar.c(str, bitmap, ahbn.o(y != 0 ? y : 1));
            return;
        }
        this.b.a(this.c);
    }
}
