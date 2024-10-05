package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.app.ui.inline.spotlight.SpotlightScrimLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mio extends miq {
    final /* synthetic */ mit a;

    public mio(mit mitVar) {
        this.a = mitVar;
    }

    @Override // defpackage.miq
    public final int a() {
        return 4;
    }

    @Override // defpackage.miq
    public final void b() {
        amkq.E(this.a.k.isPresent());
        amkq.E(this.a.l.isPresent());
        amkq.E(this.a.m.isPresent());
        mit mitVar = this.a;
        int intValue = ((Integer) mitVar.m.get()).intValue();
        gfq gfqVar = (gfq) this.a.l.get();
        RecyclerView l = ((gfr) this.a.k.get()).l();
        String.valueOf(String.valueOf(gfqVar)).length();
        wv i = l.i(intValue);
        if (i == null) {
            StringBuilder sb = new StringBuilder(52);
            sb.append("Could not find view at adapter position: ");
            sb.append(intValue);
            zga.b(sb.toString());
            mitVar.e(mitVar.b);
            return;
        }
        int height = i.a.getHeight();
        zby zbyVar = new zby();
        zby.c(zbyVar, i.a, (View) mitVar.i.getParent());
        int i2 = zbyVar.a.top;
        SpotlightScrimLayout spotlightScrimLayout = mitVar.i;
        spotlightScrimLayout.a = i2;
        spotlightScrimLayout.b = height;
        spotlightScrimLayout.setPadding(0, i2 + height, 0, 0);
        spotlightScrimLayout.invalidate();
        spotlightScrimLayout.c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        spotlightScrimLayout.c.setAntiAlias(true);
        spotlightScrimLayout.setLayerType(2, null);
        mitVar.p.c(true);
        mitVar.e(mitVar.e);
    }

    @Override // defpackage.miq
    public final void c(int i) {
        amkq.F(amsx.t(1, 2, 5).contains(Integer.valueOf(i)), d(i));
    }
}
