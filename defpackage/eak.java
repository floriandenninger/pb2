package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eak extends eaj {
    protected eak(Context context, String str, boolean z) {
        super(context, str, z);
    }

    public static eak p(String str, Context context, boolean z) {
        u(context, z);
        return new eak(context, str, z);
    }

    @Override // defpackage.eaj
    protected final List q(ebe ebeVar, Context context, aone aoneVar, dvj dvjVar) {
        if (ebeVar.b == null || !this.u) {
            return super.q(ebeVar, context, aoneVar, dvjVar);
        }
        int a = ebeVar.a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.q(ebeVar, context, aoneVar, dvjVar));
        arrayList.add(new ebs(ebeVar, aoneVar, a));
        return arrayList;
    }
}
