package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aloo extends alot {
    final /* synthetic */ alop a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aloo(alop alopVar, alsf alsfVar) {
        super(alopVar, alsfVar);
        this.a = alopVar;
        new ammr("OnRequestInstallCallback", (char[]) null);
    }

    @Override // defpackage.alot
    public final void b(Bundle bundle) {
        super.b(bundle);
        if (alop.a(bundle) != 0) {
            this.b.a(new aloy(alop.a(bundle)));
            return;
        }
        alsf alsfVar = this.b;
        alop alopVar = this.a;
        bundle.getInt("version.code", -1);
        int i = bundle.getInt("update.availability");
        int i2 = bundle.getInt("install.status", 0);
        if (bundle.getInt("client.version.staleness", -1) != -1) {
            bundle.getInt("client.version.staleness");
        }
        bundle.getInt("in.app.update.priority", 0);
        bundle.getLong("bytes.downloaded");
        bundle.getLong("total.bytes.to.download");
        alsfVar.b(new alod(i, i2, bundle.getLong("additional.size.required"), aloh.a(new File(alopVar.d.a.getFilesDir(), "assetpacks")), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent"), (PendingIntent) bundle.getParcelable("blocking.destructive.intent"), (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent")));
    }
}
