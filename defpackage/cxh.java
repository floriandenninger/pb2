package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cxh implements cqr {
    @Override // defpackage.cqr
    public final ctd b(Context context, ctd ctdVar, int i, int i2) {
        if (!ddn.p(i, i2)) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Cannot apply transformation on width: ");
            sb.append(i);
            sb.append(" or height: ");
            sb.append(i2);
            sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
            throw new IllegalArgumentException(sb.toString());
        }
        ctm ctmVar = cnv.b(context).a;
        Bitmap bitmap = (Bitmap) ctdVar.c();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmap.getHeight();
        }
        Bitmap c = c(ctmVar, bitmap, i, i2);
        return bitmap.equals(c) ? ctdVar : cxg.f(c, ctmVar);
    }

    protected abstract Bitmap c(ctm ctmVar, Bitmap bitmap, int i, int i2);
}
