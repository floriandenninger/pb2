package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gyf implements syh {
    private final azrw a;
    private final DisplayMetrics b;

    public gyf(Context context, azrw azrwVar) {
        this.a = azrwVar;
        this.b = context.getResources().getDisplayMetrics();
    }

    @Override // defpackage.syh
    public final /* bridge */ /* synthetic */ Drawable a(Object obj, Bitmap bitmap, ImageView.ScaleType scaleType) {
        return new gyg(bitmap, scaleType, (syd) this.a.get(), this.b);
    }

    @Override // defpackage.syh
    public final aomu b() {
        return awpp.b;
    }
}
