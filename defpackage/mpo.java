package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpo extends ajjh {
    final /* synthetic */ mgu a;
    final /* synthetic */ mpp b;

    public mpo(mpp mppVar, mgu mguVar) {
        this.b = mppVar;
        this.a = mguVar;
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void a(ImageView imageView) {
        this.a.a(this.b.C);
    }

    @Override // defpackage.ajjh, defpackage.ajjx
    public final void b(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            this.b.E = ((BitmapDrawable) drawable).getBitmap();
            mgu mguVar = this.a;
            mpp mppVar = this.b;
            mguVar.b(mppVar.C, mppVar.E);
            return;
        }
        this.a.a(this.b.C);
    }
}
