package defpackage;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.signin.internal.SignInResponse;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ror extends ecq implements IInterface {
    public ror() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    public void c(SignInResponse signInResponse) {
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 3:
                break;
            case 4:
                break;
            case 5:
            default:
                return false;
            case 6:
                break;
            case 7:
                break;
            case 8:
                c((SignInResponse) ecr.a(parcel, SignInResponse.CREATOR));
                break;
            case 9:
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
