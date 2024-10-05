package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes3.dex */
final class dwn implements IInterface {
    public final IBinder a;

    public dwn(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
