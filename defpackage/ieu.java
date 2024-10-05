package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ieu implements cnl {
    public final AlertDialog a;
    final /* synthetic */ iev b;

    public ieu(iev ievVar, AlertDialog alertDialog) {
        this.b = ievVar;
        this.a = alertDialog;
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        iev ievVar = this.b;
        if (ievVar.c.a) {
            return;
        }
        ((Activity) ievVar.a).runOnUiThread(new Runnable() { // from class: iet
            @Override // java.lang.Runnable
            public final void run() {
                ieu ieuVar = ieu.this;
                ieuVar.a.dismiss();
                iev ievVar2 = ieuVar.b;
                whu.K(ievVar2.a, true != ievVar2.c.b ? R.string.download_reel_item_saved : R.string.download_reel_item_error, 1);
            }
        });
    }
}
