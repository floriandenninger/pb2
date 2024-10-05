package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jns implements syh {
    private final azrw a;

    public jns(azrw azrwVar) {
        this.a = azrwVar;
    }

    @Override // defpackage.syh
    public final /* bridge */ /* synthetic */ Drawable a(Object obj, Bitmap bitmap, ImageView.ScaleType scaleType) {
        return new jnt(bitmap, scaleType, (syd) this.a.get(), ((aqmq) obj).c);
    }

    @Override // defpackage.syh
    public final aomu b() {
        return aqmq.b;
    }
}
