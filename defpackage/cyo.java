package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyo extends cxh {
    private static final byte[] b = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(a);
    private final int c;

    public cyo(int i) {
        did.aq(i > 0, "roundingRadius must be greater than 0.");
        this.c = i;
    }

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(b);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // defpackage.cxh
    protected final Bitmap c(ctm ctmVar, Bitmap bitmap, int i, int i2) {
        return cys.g(ctmVar, bitmap, this.c);
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        return (obj instanceof cyo) && this.c == ((cyo) obj).c;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        return ddn.e(-569625254, ddn.d(this.c));
    }
}
