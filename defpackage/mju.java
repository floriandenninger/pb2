package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mju implements zfk {
    public final ImageView a;
    public final Drawable b;
    final /* synthetic */ PivotBar c;

    public mju(PivotBar pivotBar, ImageView imageView, Drawable drawable) {
        this.c = pivotBar;
        imageView.getClass();
        this.a = imageView;
        drawable.getClass();
        this.b = drawable;
        imageView.setImageDrawable(drawable);
    }

    @Override // defpackage.zfk
    public final void j() {
        throw null;
    }
}
