package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajji implements afri {
    private final int a;
    private final Bitmap.Config b;

    public ajji() {
        this.a = 0;
        this.b = Bitmap.Config.ARGB_8888;
    }

    public ajji(int i, Bitmap.Config config) {
        amkq.F(i > 0, "desiredWidth must be > 0");
        this.a = i;
        this.b = config;
    }

    @Override // defpackage.afri
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bitmap b(byte[] bArr) {
        int i;
        Bitmap decodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (options.outWidth < 0) {
            decodeByteArray = null;
        } else {
            int i2 = this.a;
            if (i2 != 0) {
                int i3 = options.outWidth;
                i = 1;
                while (true) {
                    i3 >>= 1;
                    if (i3 < i2) {
                        break;
                    }
                    i += i;
                }
            } else {
                i = 1;
            }
            options.inSampleSize = i;
            options.inJustDecodeBounds = false;
            options.inPreferredConfig = this.b;
            options.inPurgeable = true;
            options.inInputShareable = false;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        throw new zjg("failed to decode bitmap");
    }
}
