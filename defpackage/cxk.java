package defpackage;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxk extends cxh {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(a);

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
    }

    @Override // defpackage.cxh
    protected final Bitmap c(ctm ctmVar, Bitmap bitmap, int i, int i2) {
        return cys.e(ctmVar, bitmap, i, i2);
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        return obj instanceof cxk;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        return 1101716364;
    }
}
