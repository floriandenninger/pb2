package defpackage;

import android.support.v7.widget.SwitchCompat;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kdn implements Runnable {
    final /* synthetic */ AutonavToggleController a;

    public kdn(AutonavToggleController autonavToggleController) {
        this.a = autonavToggleController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SwitchCompat switchCompat;
        apxf apxfVar;
        AutonavToggleController autonavToggleController = this.a;
        kdm kdmVar = (kdm) autonavToggleController.b;
        if (kdmVar == null || (switchCompat = autonavToggleController.g) == null) {
            return;
        }
        aahd aahdVar = autonavToggleController.d;
        if (switchCompat.isChecked()) {
            apxfVar = kdmVar.b.d;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = kdmVar.b.e;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        }
        aahdVar.a(apxfVar);
    }
}
