package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nca extends ajjh {
    final /* synthetic */ mgu a;
    final /* synthetic */ ncb b;

    public nca(ncb ncbVar, mgu mguVar) {
        this.b = ncbVar;
        this.a = mguVar;
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void a(ImageView imageView) {
        this.a.a(this.b.E);
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void b(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            this.b.D = ((BitmapDrawable) drawable).getBitmap();
            mgu mguVar = this.a;
            ncb ncbVar = this.b;
            mguVar.b(ncbVar.E, ncbVar.D);
            return;
        }
        this.a.a(this.b.E);
    }
}
