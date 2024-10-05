package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.IntentFilter;
import android.widget.ProgressBar;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qpe implements Runnable {
    final /* synthetic */ qpf a;
    private final qpd b;

    public qpe(qpf qpfVar, qpd qpdVar) {
        this.a = qpfVar;
        this.b = qpdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a) {
            ConnectionResult connectionResult = this.b.b;
            if (connectionResult.b()) {
                qpf qpfVar = this.a;
                qqf qqfVar = qpfVar.e;
                Activity l = qpfVar.l();
                PendingIntent pendingIntent = connectionResult.d;
                qip.an(pendingIntent);
                qqfVar.startActivityForResult(GoogleApiActivity.a(l, pendingIntent, this.b.a, false), 1);
                return;
            }
            qpf qpfVar2 = this.a;
            if (qpfVar2.c.i(qpfVar2.l(), connectionResult.c, null) != null) {
                qpf qpfVar3 = this.a;
                qmy qmyVar = qpfVar3.c;
                Activity l2 = qpfVar3.l();
                qpf qpfVar4 = this.a;
                qqf qqfVar2 = qpfVar4.e;
                int i = connectionResult.c;
                Dialog b = qmyVar.b(l2, i, new qsc(qmyVar.i(l2, i, "d"), qqfVar2), qpfVar4);
                if (b == null) {
                    return;
                }
                qmyVar.c(l2, b, "GooglePlayServicesErrorDialog", qpfVar4);
                return;
            }
            if (connectionResult.c == 18) {
                qpf qpfVar5 = this.a;
                qmy qmyVar2 = qpfVar5.c;
                Activity l3 = qpfVar5.l();
                qpf qpfVar6 = this.a;
                ProgressBar progressBar = new ProgressBar(l3, null, R.attr.progressBarStyleLarge);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(0);
                AlertDialog.Builder builder = new AlertDialog.Builder(l3);
                builder.setView(progressBar);
                builder.setMessage(qsa.d(l3, 18));
                builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
                AlertDialog create = builder.create();
                qmyVar2.c(l3, create, "GooglePlayServicesUpdatingDialog", qpfVar6);
                Context applicationContext = this.a.l().getApplicationContext();
                qqa qqaVar = new qqa(this, create);
                IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                intentFilter.addDataScheme("package");
                qqb qqbVar = new qqb(qqaVar);
                applicationContext.registerReceiver(qqbVar, intentFilter);
                qqbVar.a = applicationContext;
                if (qnm.i(applicationContext)) {
                    return;
                }
                qqaVar.a();
                qqbVar.a();
                return;
            }
            this.a.b(connectionResult, this.b.a);
        }
    }
}
