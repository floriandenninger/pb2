package defpackage;

import android.content.Context;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.CastOptions;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qgp extends ecq implements IInterface {
    final /* synthetic */ qgy a;

    public qgp() {
        super("com.google.android.gms.cast.framework.ISessionProvider");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgp(qgy qgyVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider");
        this.a = qgyVar;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String readString = parcel.readString();
            qgy qgyVar = this.a;
            Context context = qgyVar.a;
            String str = qgyVar.b;
            CastOptions castOptions = qgyVar.c;
            qvf m = new qfy(context, str, readString, castOptions, new qju(context, castOptions, qgyVar.e)).m();
            parcel2.writeNoException();
            ecr.i(parcel2, m);
        } else if (i == 2) {
            boolean z = this.a.c.d;
            parcel2.writeNoException();
            ecr.e(parcel2, z);
        } else if (i == 3) {
            String str2 = this.a.b;
            parcel2.writeNoException();
            parcel2.writeString(str2);
        } else {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(213880000);
        }
        return true;
    }
}
