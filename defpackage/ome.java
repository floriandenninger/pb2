package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ome implements fxh {
    final /* synthetic */ wdo a;

    public ome(wdo wdoVar) {
        this.a = wdoVar;
    }

    @Override // defpackage.fxh
    public final void e(Configuration configuration) {
        wdo wdoVar = this.a;
        if (wdoVar.c || wdoVar.b() == null) {
            return;
        }
        wdy b = wdoVar.b();
        b.getClass();
        wdoVar.d = true;
        Bundle bundle = b.m;
        Fragment$SavedState c = wdoVar.a.getSupportFragmentManager().c(b);
        dn k = wdoVar.a.getSupportFragmentManager().k();
        k.m(b);
        wdoVar.b = new wdy();
        wdoVar.b.ah(c);
        wdoVar.b.af(bundle);
        k.r(wdoVar.b, "update_image_fragment");
        k.d();
        wdoVar.d = false;
        if (wdoVar.e) {
            wdoVar.d();
            wdoVar.e = false;
        }
    }
}
