package defpackage;

import android.util.Log;
import android.widget.Toast;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acea {
    final /* synthetic */ acei a;

    public acea(acei aceiVar) {
        this.a = aceiVar;
    }

    public final void a(Exception exc) {
        acei aceiVar = this.a;
        Log.e("SelfViewWindow", "Camera preview failed", exc);
        String string = aceiVar.f.getResources().getString(R.string.camera_preview_error);
        aceg acegVar = aceiVar.p;
        if (acegVar != null) {
            Log.e("ScreencastControls", "Disabling camera preview support due to camera error.");
            ((acdy) acegVar).c.l(false);
        } else {
            Toast.makeText(aceiVar.f, string, 0).show();
        }
        aceiVar.e(false, null);
        accy accyVar = aceiVar.t;
        if (accyVar != null) {
            accyVar.l();
            aceiVar.t.b();
        }
    }
}
