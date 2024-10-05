package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alot extends ecq implements IInterface {
    public final alsf b;
    final /* synthetic */ alop c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alot(alop alopVar, alsf alsfVar) {
        super("com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.c = alopVar;
        this.b = alsfVar;
    }

    public void a(Bundle bundle) {
        this.c.a.f(this.b);
    }

    public void b(Bundle bundle) {
        this.c.a.f(this.b);
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            b((Bundle) ecr.a(parcel, Bundle.CREATOR));
            return true;
        }
        if (i != 3) {
            return false;
        }
        a((Bundle) ecr.a(parcel, Bundle.CREATOR));
        return true;
    }
}
