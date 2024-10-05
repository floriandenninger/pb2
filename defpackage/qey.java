package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qey extends qar {
    @Override // defpackage.qar
    public final /* bridge */ /* synthetic */ qnv s(Context context, Looper looper, qrz qrzVar, Object obj, qod qodVar, qoe qoeVar) {
        qem qemVar = (qem) obj;
        qip.az(qemVar, "Setting the API options is required.");
        CastDevice castDevice = qemVar.a;
        int i = qemVar.c;
        return new qkn(context, looper, qrzVar, castDevice, qemVar.b, qemVar.d, qodVar, qoeVar);
    }
}
