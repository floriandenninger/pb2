package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qwp implements Runnable {
    private final Context a;
    private final long b;
    private final oba c;

    public qwp(Context context, oba obaVar, long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context;
        this.c = obaVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List singletonList;
        try {
            zsd zsdVar = new zsd(null);
            zsdVar.c();
            singletonList = this.c.a();
            if (singletonList == null) {
                singletonList = new ArrayList(1);
            }
            try {
                singletonList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(zsdVar.a())));
            } catch (UnsupportedOperationException unused) {
                ArrayList arrayList = new ArrayList(singletonList);
                arrayList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(zsdVar.a())));
                singletonList = arrayList;
            }
        } catch (Exception e) {
            Log.w("gF_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
            singletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        qob e2 = qwj.e(this.a);
        qar.i(qwj.b(e2.D, oba.J(singletonList), this.b));
    }
}
