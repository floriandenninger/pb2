package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qzi extends qzl {
    final /* synthetic */ Intent a;
    final /* synthetic */ WeakReference b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qzi(qof qofVar, Intent intent, WeakReference weakReference) {
        super(qofVar);
        this.a = intent;
        this.b = weakReference;
    }

    @Override // defpackage.qzk
    protected final void b(qzq qzqVar) {
        GoogleHelp googleHelp = (GoogleHelp) this.a.getParcelableExtra("EXTRA_GOOGLE_HELP");
        oba obaVar = googleHelp.I;
        try {
            qzj qzjVar = new qzj(this.a, this.b, this, obaVar, null, null, null);
            Parcel pn = qzqVar.pn();
            ecr.g(pn, googleHelp);
            ecr.g(pn, null);
            ecr.i(pn, qzjVar);
            qzqVar.pp(2, pn);
        } catch (RemoteException e) {
            Log.e("gH_GoogleHelpApiImpl", "Starting help failed!", e);
            l(qzm.a);
        }
    }
}
