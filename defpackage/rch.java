package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rch extends ecq implements rci {
    private final AtomicReference a;
    private boolean b;

    public rch(byte[] bArr) {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
        this.a = new AtomicReference();
    }

    public static Object d(Bundle bundle, Class cls) {
        Object obj;
        if (bundle == null || (obj = bundle.get("r")) == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w("AM", String.format("Unexpected object type. Expected, Received: %s, %s", cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    @Override // defpackage.rci
    public final void a(Bundle bundle) {
        synchronized (this.a) {
            try {
                this.a.set(bundle);
                this.b = true;
            } finally {
                this.a.notify();
            }
        }
    }

    public final Bundle b(long j) {
        Bundle bundle;
        synchronized (this.a) {
            if (!this.b) {
                try {
                    this.a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.a.get();
        }
        return bundle;
    }

    public final String c(long j) {
        return (String) d(b(j), String.class);
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        a((Bundle) ecr.a(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }

    public rch() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }
}
