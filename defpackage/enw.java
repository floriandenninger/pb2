package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.application.upgrade.NewVersionAvailableActivity;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class enw implements aab {
    final /* synthetic */ enx a;

    public enw(enx enxVar) {
        this.a = enxVar;
    }

    @Override // defpackage.aab
    public final void a(Context context) {
        enx enxVar = this.a;
        if (enxVar.a) {
            return;
        }
        enxVar.a = true;
        Object lM = enxVar.lM();
        NewVersionAvailableActivity newVersionAvailableActivity = (NewVersionAvailableActivity) enxVar;
        eed eedVar = (eed) lM;
        newVersionAvailableActivity.b = eedVar.a.cO();
        newVersionAvailableActivity.c = (aadw) eedVar.a.D.get();
    }
}
