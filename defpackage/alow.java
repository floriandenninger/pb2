package defpackage;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public class alow extends ecq implements IInterface {
    public final alsf a;
    final /* synthetic */ alpo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alow(alpo alpoVar, alsf alsfVar) {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.b = alpoVar;
        this.a = alsfVar;
    }

    public void a(Bundle bundle) {
        alqa alqaVar = this.b.a;
        if (alqaVar != null) {
            alqaVar.f(this.a);
        }
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        a((Bundle) ecr.a(parcel, Bundle.CREATOR));
        return true;
    }
}
