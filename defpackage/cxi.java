package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxi extends cxh {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(a);

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.cxh
    protected final Bitmap c(ctm ctmVar, Bitmap bitmap, int i, int i2) {
        return cys.c(ctmVar, bitmap, i, i2);
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        return obj instanceof cxi;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        return -599754482;
    }
}
