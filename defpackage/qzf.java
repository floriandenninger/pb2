package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qzf extends qzl {
    final /* synthetic */ Bundle a;
    final /* synthetic */ long b;
    final /* synthetic */ GoogleHelp c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzf(qof qofVar, Bundle bundle, long j, GoogleHelp googleHelp) {
        super(qofVar);
        this.a = bundle;
        this.b = j;
        this.c = googleHelp;
    }

    @Override // defpackage.qzk
    protected final void b(qzq qzqVar) {
        try {
            Bundle bundle = this.a;
            long j = this.b;
            GoogleHelp googleHelp = this.c;
            qze qzeVar = new qze(this);
            Parcel pn = qzqVar.pn();
            ecr.g(pn, bundle);
            pn.writeLong(j);
            ecr.g(pn, googleHelp);
            ecr.i(pn, qzeVar);
            qzqVar.pq(9, pn);
        } catch (Exception e) {
            Log.e("gH_GoogleHelpApiImpl", "Requesting to save the async feedback psd failed!", e);
            l(qzm.a);
        }
    }
}
