package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alpj extends ecq implements IInterface {
    final /* synthetic */ alph a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alpj(alph alphVar) {
        super("com.google.android.play.core.prewarm.protocol.IPrewarmServiceCallback");
        this.a = alphVar;
    }

    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        alqa alqaVar = this.a.a;
        if (alqaVar != null) {
            alqaVar.e();
        }
        return true;
    }

    public alpj() {
        super("com.google.android.play.core.prewarm.protocol.IPrewarmServiceCallback");
    }
}
