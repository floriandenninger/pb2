package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import com.google.android.youtube.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jbu implements adjm, ypd {
    public final azrw a;
    public final azrw b;
    public final adjs c;
    public final adkb d;
    public Optional e;
    private final adgd f;
    private final Activity g;
    private final ety h;

    public jbu(adkb adkbVar, adgd adgdVar, Activity activity, ety etyVar, azrw azrwVar, adjs adjsVar, azrw azrwVar2) {
        this.d = adkbVar;
        this.f = adgdVar;
        activity.getClass();
        this.g = activity;
        this.h = etyVar;
        this.a = azrwVar;
        this.c = adjsVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        this.e = Optional.empty();
    }

    @Override // defpackage.adjm
    public final adgd a() {
        return this.f;
    }

    @Override // defpackage.adjm
    public final adkb b() {
        return this.d;
    }

    @Override // defpackage.adjm
    public final void c() {
        this.e.ifPresent(new jbs(this, 0));
    }

    @Override // defpackage.adjm
    public final void d(Runnable runnable) {
        yjk.f();
        adkb adkbVar = this.d;
        if (adkbVar.g) {
            this.c.b(adkbVar.h);
            runnable.run();
            return;
        }
        jbt jbtVar = new jbt(this, runnable);
        Resources resources = this.g.getResources();
        akbw akbwVar = (akbw) this.b.get();
        akbx m = ((akbw) this.b.get()).m();
        m.c = resources.getText(R.string.cast_icon_mealbar_title);
        m.d = resources.getText(R.string.cast_icon_mealbar_sub_title);
        m.m = jbtVar;
        akbx e = m.a(resources.getText(R.string.cast_icon_mealbar_watch_on_tv_text), new View.OnClickListener() { // from class: jbr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jbu jbuVar = jbu.this;
                ((Optional) jbuVar.a.get()).ifPresent(new jbs(jbuVar, 1));
            }
        }).c(resources.getText(R.string.cast_icon_mealbar_dismiss_text), ipu.a).e(R.drawable.mealbar_cast_icon);
        e.i(false);
        akbwVar.o(e.f());
    }

    @Override // defpackage.adjm
    public final boolean e() {
        return (this.h.j() || this.h.l() || this.h.h()) ? false : true;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adek.class};
        }
        if (i == 0) {
            adek adekVar = (adek) obj;
            if (!adekVar.a() || !adekVar.b()) {
                return null;
            }
            c();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
