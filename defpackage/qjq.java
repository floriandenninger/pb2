package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qjq extends ecq implements IInterface {
    final /* synthetic */ qjn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjq(qjn qjnVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
        this.a = qjnVar;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            this.a.publishProgress(Long.valueOf(parcel.readLong()), Long.valueOf(parcel.readLong()));
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(213880000);
        }
        return true;
    }

    public qjq() {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
    }
}
