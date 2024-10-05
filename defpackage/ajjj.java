package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajjj implements afri {
    private final ajji a;
    private final Context b;

    public ajjj(Context context) {
        this.b = context;
        this.a = new ajji(yjk.N(context), Bitmap.Config.ARGB_8888);
    }

    @Override // defpackage.afri
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Drawable b(byte[] bArr) {
        return c(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Drawable c(byte[] bArr) {
        return new BitmapDrawable(this.b.getResources(), this.a.b(bArr));
    }
}
