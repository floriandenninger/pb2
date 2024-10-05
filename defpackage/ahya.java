package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahya extends ahus implements ahxw {
    private Bitmap a;

    public ahya(Context context) {
        super(context);
    }

    @Override // defpackage.ahxw
    public final void b(Bitmap bitmap) {
        if (this.a == bitmap) {
            return;
        }
        this.a = bitmap;
        Y();
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        ImageView imageView = (ImageView) view;
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            imageView.setImageDrawable(null);
        } else {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // defpackage.ahuy
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public ImageView a(Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setBackgroundColor(-16777216);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.a != null;
    }

    @Override // defpackage.ahxw
    public final void nw() {
        b(null);
    }
}
