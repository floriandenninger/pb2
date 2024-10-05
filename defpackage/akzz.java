package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class akzz implements alaf {
    protected final Uri c;
    protected final ContentResolver d;
    protected final axze e;

    public akzz(Uri uri, ContentResolver contentResolver, axze axzeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.c = uri;
        this.d = contentResolver;
        this.e = axzeVar;
    }

    @Override // defpackage.alaf
    public final Bitmap b(Point point) {
        return alaa.b(this.d, this.c, point);
    }

    @Override // defpackage.alaf
    public final avuc g(String str, String str2) {
        return alaa.d(str);
    }

    @Override // defpackage.alaf
    public final boolean k() {
        return true;
    }

    public static akzz a(int i, Uri uri, Context context, axze axzeVar) {
        int i2 = i - 1;
        if (i2 == 1) {
            return new akzy(uri, context, axzeVar, false, null, null, null);
        }
        if (i2 == 2) {
            return new akzy(uri, context, axzeVar, true, null, null, null);
        }
        return new alac(uri, context.getContentResolver(), axzeVar, null, null, null);
    }
}
