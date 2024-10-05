package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qzc implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final long c;
    private final oba d;

    public qzc(Context context, GoogleHelp googleHelp, oba obaVar, long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = context;
        this.b = googleHelp;
        this.d = obaVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List singletonList;
        try {
            zsd zsdVar = new zsd(null);
            zsdVar.c();
            singletonList = this.d.a();
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
            Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
            singletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        qzn b = qza.b(this.a);
        GoogleHelp googleHelp = this.b;
        Bundle J2 = oba.J(singletonList);
        long j = this.c;
        qof qofVar = b.D;
        qzf qzfVar = new qzf(qofVar, J2, j, googleHelp);
        qofVar.a(qzfVar);
        qar.i(qzfVar);
    }
}
