package defpackage;

import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.util.Log;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sgd extends ecq implements IInterface {
    public sfz a;
    public boolean b;
    protected SettableFuture c;
    public aefy d;
    public aclt e;

    public sgd(byte[] bArr) {
        super("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback");
        new Handler(Looper.getMainLooper());
        this.c = SettableFuture.f();
        this.d = new aefy((byte[]) null);
        this.c.o(sga.a);
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        parcel.createByteArray();
        Log.w("AIClientCbStub", String.format("callback is not an instance of CallbackExt: %s", this.e));
        return true;
    }

    public sgd() {
        super("com.google.android.libraries.assistant.appintegration.shared.aidl.IAppIntegrationSessionCallback");
    }
}
