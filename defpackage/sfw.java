package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sfw implements edu {
    public static final amxj a = amxj.l("com/google/android/libraries/assistant/appintegration/MaestroConnector");
    public final Context b;
    public final sft c;
    public final qnn d;
    protected final sgd e;
    public sgc f;
    private final sfv g = new sfv(this);

    public sfw(Context context, sgd sgdVar, sft sftVar, qnn qnnVar) {
        this.b = context;
        this.c = sftVar;
        this.d = qnnVar;
        this.e = sgdVar;
    }

    @Override // defpackage.edu
    public final int a() {
        return this.g.a;
    }

    @Override // defpackage.edu
    public final void b(sgu sguVar) {
        ((amxh) ((amxh) a.b().g(amyj.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector", "sendData", 100, "MaestroConnector.java")).q("#sendData()");
        if (a() != 3 || !d()) {
            throw new RemoteException("Maestro service not connected yet");
        }
        sgc sgcVar = this.f;
        byte[] byteArray = sguVar.toByteArray();
        Parcel pn = sgcVar.pn();
        pn.writeByteArray(byteArray);
        sgcVar.pq(1, pn);
    }

    @Override // defpackage.edu
    public final boolean c(sgu sguVar) {
        amxj amxjVar = a;
        ((amxh) ((amxh) amxjVar.b().g(amyj.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector", "connect", 62, "MaestroConnector.java")).q("#connect()");
        Intent intent = new Intent();
        intent.setAction("com.google.android.apps.gsa.opa.APP_INTEGRATION_SERVICE");
        intent.setPackage("com.google.android.googlequicksearchbox");
        if (this.b.bindService(intent, this.g, 1)) {
            ((amxh) ((amxh) amxjVar.d().g(amyj.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector", "connect", 67, "MaestroConnector.java")).q("#bindService(): binding service.");
            this.g.a = 2;
            return true;
        }
        ((amxh) ((amxh) amxjVar.g().g(amyj.a, "MaestroConnector")).i("com/google/android/libraries/assistant/appintegration/MaestroConnector", "connect", 71, "MaestroConnector.java")).q("#bindService(): failed to bind service.");
        return false;
    }

    @Override // defpackage.edu
    public final boolean d() {
        return this.f != null;
    }
}
