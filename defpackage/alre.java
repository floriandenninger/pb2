package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alre extends ecq implements IInterface {
    public final alsf a;
    final /* synthetic */ alqy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alre(alqy alqyVar, alsf alsfVar) {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
        this.b = alqyVar;
        this.a = alsfVar;
    }

    public void a(int i, Bundle bundle) {
        this.b.b.f(this.a);
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                a(parcel.readInt(), (Bundle) ecr.a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                parcel.readInt();
                this.b.b.f(this.a);
                return true;
            case 4:
                parcel.readInt();
                this.b.b.f(this.a);
                return true;
            case 5:
                parcel.readInt();
                this.b.b.f(this.a);
                return true;
            case 6:
                Bundle bundle = (Bundle) ecr.a(parcel, Bundle.CREATOR);
                this.b.b.f(this.a);
                int i3 = bundle.getInt("error_code");
                alqy.c.k("onError(%d)", Integer.valueOf(i3));
                this.a.a(new alql(i3));
                return true;
            case 7:
                parcel.createTypedArrayList(Bundle.CREATOR);
                this.b.b.f(this.a);
                return true;
            case 8:
                this.b.b.f(this.a);
                return true;
            case 9:
                this.b.b.f(this.a);
                return true;
            case 10:
                this.b.b.f(this.a);
                return true;
            case 11:
                this.b.b.f(this.a);
                return true;
            case 12:
                this.b.b.f(this.a);
                return true;
            case 13:
                this.b.b.f(this.a);
                return true;
            default:
                return false;
        }
    }
}
