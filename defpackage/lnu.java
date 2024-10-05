package defpackage;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lnu implements DialogInterface.OnClickListener {
    final /* synthetic */ lnv a;

    public lnu(lnv lnvVar) {
        this.a = lnvVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Activity activity = this.a.a.a;
        ((AlarmManager) activity.getSystemService("alarm")).setExact(3, 1500L, PendingIntent.getActivity(activity, 0, new Intent().setClassName(activity, "com.google.android.youtube.HomeActivity"), yny.M() | 134217728));
        Process.killProcess(Process.myPid());
    }
}
