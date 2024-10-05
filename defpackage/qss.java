package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qss extends ecq implements qst {
    private int a;

    /* JADX INFO: Access modifiers changed from: protected */
    public qss(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        qip.ao(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        qvf f;
        if (obj != null && (obj instanceof qst)) {
            try {
                qst qstVar = (qst) obj;
                if (qstVar.pV() == this.a && (f = qstVar.f()) != null) {
                    return Arrays.equals(pU(), (byte[]) qve.b(f));
                }
                return false;
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    @Override // defpackage.qst
    public final qvf f() {
        return qve.a(pU());
    }

    public final int hashCode() {
        return this.a;
    }

    public abstract byte[] pU();

    @Override // defpackage.qst
    public final int pV() {
        return this.a;
    }

    public qss() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            qvf f = f();
            parcel2.writeNoException();
            ecr.i(parcel2, f);
        } else {
            if (i != 2) {
                return false;
            }
            int i3 = this.a;
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        }
        return true;
    }
}
