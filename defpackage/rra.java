package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rra extends qar {
    @Override // defpackage.qar
    public final /* bridge */ /* synthetic */ qnv s(Context context, Looper looper, qrz qrzVar, Object obj, qod qodVar, qoe qoeVar) {
        rrd rrdVar = (rrd) obj;
        if (rrdVar == null) {
            rrdVar = new rrd(new rrc());
        }
        return new rrr(context, looper, qrzVar, qodVar, qoeVar, rrdVar.a);
    }
}
