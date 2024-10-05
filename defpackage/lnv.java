package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lnv implements Runnable {
    final /* synthetic */ lnw a;

    public lnv(lnw lnwVar) {
        this.a = lnwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.c.a();
            lnw lnwVar = this.a;
            Handler handler = lnwVar.d;
            final Activity activity = lnwVar.a;
            final lnu lnuVar = new lnu(this);
            handler.post(new Runnable() { // from class: lnx
                @Override // java.lang.Runnable
                public final void run() {
                    Context context = activity;
                    new AlertDialog.Builder(context).setMessage("Success. Please restart your app.").setPositiveButton("Restart", lnuVar).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show();
                }
            });
        } catch (aasx e) {
            lnw lnwVar2 = this.a;
            Handler handler2 = lnwVar2.d;
            Activity activity2 = lnwVar2.a;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Refresh failed: ");
            sb.append(valueOf);
            mcy.t(handler2, activity2, sb.toString(), true);
        }
    }
}
