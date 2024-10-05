package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vne extends dcf {
    final /* synthetic */ SquareImageView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vne(SquareImageView squareImageView, SquareImageView squareImageView2) {
        super(squareImageView2);
        this.b = squareImageView;
    }

    @Override // defpackage.dcl
    public final void a(Drawable drawable) {
        this.b.b();
    }

    @Override // defpackage.dcl
    public final /* bridge */ /* synthetic */ void b(Object obj, dcs dcsVar) {
        SquareImageView squareImageView = this.b;
        squareImageView.a = (Bitmap) obj;
        squareImageView.c();
    }

    @Override // defpackage.dcf
    protected final void c() {
        this.b.b();
    }
}
