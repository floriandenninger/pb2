package defpackage;

import android.content.Intent;
import com.google.android.apps.youtube.app.settings.NotificationPrefsFragment;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gpx implements afwx {
    final /* synthetic */ Intent a;
    final /* synthetic */ gpy b;

    public gpx(gpy gpyVar, Intent intent) {
        this.b = gpyVar;
        this.a = intent;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        zga.l("Failed to load get_settings response");
        this.b.b(this.a);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        abci abciVar = (abci) obj;
        if (abciVar.c == null) {
            asbd asbdVar = abciVar.a.e;
            if (asbdVar == null) {
                asbdVar = asbd.a;
            }
            List dC = adyu.dC(asbdVar, null);
            if (!dC.isEmpty()) {
                abciVar.c = dC.get(0);
            }
        }
        Object obj2 = abciVar.c;
        if (obj2 instanceof aupr) {
            this.a.putExtra(":android:show_fragment", NotificationPrefsFragment.class.getName());
        } else if (obj2 instanceof aupv) {
            Intent intent = this.a;
            int bz = aobq.bz(((aupv) obj2).e);
            if (bz == 0) {
                bz = 1;
            }
            gpy.c(intent, String.valueOf(bz - 1));
        }
        this.b.b(this.a);
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
