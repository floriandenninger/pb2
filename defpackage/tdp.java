package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import j$.nio.charset.StandardCharsets;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tdp extends Binder {
    protected final Context a;
    public Integer b;
    public final Future c = new tdo(this);

    public tdp(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Binder
    protected final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        byte[] byteArray;
        if (parcel == null) {
            return super.onTransact(i, null, parcel2, i2);
        }
        Bundle readBundle = parcel.readBundle(Bundle.class.getClassLoader());
        if (i != 1) {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            if (readBundle != null) {
                synchronized (this.c) {
                    this.b = Integer.valueOf(readBundle.getInt("activity_result"));
                    this.c.notifyAll();
                }
            }
            return true;
        }
        if (readBundle != null && (byteArray = readBundle.getByteArray("challenge")) != null && parcel2 != null) {
            if (byteArray.length != 0) {
                int i3 = -2078137563;
                for (byte b : byteArray) {
                    i3 = (i3 ^ b) * 435;
                }
                byteArray = Long.toHexString(i3 & 4294967295L).getBytes(StandardCharsets.UTF_8);
            }
            Bundle bundle = new Bundle();
            bundle.putInt("version", 1);
            bundle.putByteArray("challenge_reply", byteArray);
            bundle.putString("caller_package", this.a.getApplicationContext().getPackageName());
            parcel2.writeNoException();
            parcel2.writeBundle(bundle);
        }
        return true;
    }
}
