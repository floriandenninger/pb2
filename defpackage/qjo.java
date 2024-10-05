package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qjo extends ecp implements qjp {
    public qjo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    @Override // defpackage.qjp
    public final Bitmap a(Uri uri) {
        Parcel pn = pn();
        ecr.g(pn, uri);
        Parcel po = po(1, pn);
        Bitmap bitmap = (Bitmap) ecr.a(po, Bitmap.CREATOR);
        po.recycle();
        return bitmap;
    }
}
