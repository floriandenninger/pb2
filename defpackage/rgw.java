package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rgw implements Runnable {
    final /* synthetic */ ConditionalUserPropertyParcel a;
    final /* synthetic */ rff b;

    public rgw(rff rffVar, ConditionalUserPropertyParcel conditionalUserPropertyParcel) {
        this.b = rffVar;
        this.a = conditionalUserPropertyParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.w();
        if (this.a.c.a() == null) {
            rki rkiVar = this.b.a;
            ConditionalUserPropertyParcel conditionalUserPropertyParcel = this.a;
            String str = conditionalUserPropertyParcel.a;
            qip.an(str);
            AppMetadata d = rkiVar.d(str);
            if (d != null) {
                rkiVar.F(conditionalUserPropertyParcel, d);
                return;
            }
            return;
        }
        rki rkiVar2 = this.b.a;
        ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = this.a;
        String str2 = conditionalUserPropertyParcel2.a;
        qip.an(str2);
        AppMetadata d2 = rkiVar2.d(str2);
        if (d2 != null) {
            rkiVar2.I(conditionalUserPropertyParcel2, d2);
        }
    }
}
