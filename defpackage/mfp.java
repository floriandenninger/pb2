package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfp {
    public final mfq a = new mfq();
    public final ml b;

    public mfp(Context context) {
        this.b = (ml) context;
    }

    public final void a(aren arenVar) {
        if (arenVar == null) {
            return;
        }
        mfq mfqVar = this.a;
        if (arenVar.equals(mfqVar.ah)) {
            return;
        }
        mfqVar.ah = arenVar;
        mfqVar.aH();
    }
}
