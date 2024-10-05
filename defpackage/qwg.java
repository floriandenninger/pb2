package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qwg extends qwi {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwg(qof qofVar, Bundle bundle, long j) {
        super(qofVar);
        this.a = bundle;
        this.b = j;
    }

    @Override // defpackage.qpb
    protected final /* bridge */ /* synthetic */ void c(qnq qnqVar) {
        qwn qwnVar = (qwn) qnqVar;
        try {
            Bundle bundle = this.a;
            long j = this.b;
            oba.L(bundle);
            qwq qwqVar = (qwq) qwnVar.D();
            Parcel pn = qwqVar.pn();
            ecr.g(pn, bundle);
            pn.writeLong(j);
            qwqVar.pp(4, pn);
            n(Status.a);
        } catch (Exception e) {
            Log.e("gF_Feedback", "Requesting to save the async feedback psd failed!", e);
            l(qwj.a);
        }
    }
}
