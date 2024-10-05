package defpackage;

import android.content.Context;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rmy extends qar {
    @Override // defpackage.qar
    public final /* bridge */ /* synthetic */ qnv s(Context context, Looper looper, qrz qrzVar, Object obj, qod qodVar, qoe qoeVar) {
        rna rnaVar = (rna) obj;
        qip.az(rnaVar, "Must provide valid PeopleOptions!");
        return new rnk(context, looper, qodVar, qoeVar, String.valueOf(rnaVar.a), qrzVar);
    }
}
