package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abic implements abif, abpa, ypd {
    public final azrw a;
    public final azrw b;
    public final abjr c;
    public asra d;
    public abid e;
    public abpb f;
    private final abig g;
    private final azrw h;
    private final azrw i;
    private final azrw j;
    private final abjv k;
    private final azrw l;

    public abic(Context context, abig abigVar, abjr abjrVar, abjv abjvVar, ypa ypaVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, azrw azrwVar5, azrw azrwVar6) {
        this.g = abigVar;
        this.a = azrwVar;
        abigVar.a(this);
        this.b = azrwVar3;
        this.h = azrwVar4;
        this.i = azrwVar5;
        this.j = azrwVar6;
        this.c = abjrVar;
        this.k = abjvVar;
        this.l = azrwVar2;
        ajsm.b(context);
        ypaVar.g(this);
        new abpc(this, azrwVar, abigVar);
    }

    public final void a() {
        abht abhtVar;
        if (this.e == null || !adyu.cY(this.d)) {
            return;
        }
        abht abhtVar2 = (abht) this.a.get();
        abhtVar2.C();
        if (this.e.b() != null) {
            this.e.b().s();
        }
        abhtVar2.w(this.e.b());
        abid abidVar = this.e;
        if (abidVar.c == null) {
            ajoy ajoyVar = abidVar.h;
            ViewGroup viewGroup = abidVar.a;
            abjt abjtVar = (abjt) ajoyVar.a.get();
            abjtVar.getClass();
            abidVar.c = new abpd(abjtVar, viewGroup);
        }
        abpd abpdVar = abidVar.c;
        abhu abhuVar = (abhu) this.j.get();
        if (abhtVar2 != null) {
            abhuVar.a = abhtVar2;
            abhtVar2.E(abhuVar);
        }
        abhuVar.b = abpdVar;
        abhtVar2.b.lX(abhuVar);
        abjn a = this.e.a();
        ((abhc) this.b.get()).c(a);
        abhf abhfVar = (abhf) this.l.get();
        abid abidVar2 = this.e;
        if (abidVar2.d == null) {
            abidVar2.d = abidVar2.f.b(abidVar2.a);
        }
        abhfVar.b(abidVar2.d);
        abia abiaVar = (abia) this.h.get();
        abid abidVar3 = this.e;
        if (abidVar3.e == null) {
            agcd agcdVar = abidVar3.g;
            ViewGroup viewGroup2 = abidVar3.a;
            acra acraVar = abidVar3.b;
            Context context = (Context) agcdVar.j.get();
            context.getClass();
            ajut ajutVar = (ajut) agcdVar.e.get();
            ajutVar.getClass();
            ajjz ajjzVar = (ajjz) agcdVar.c.get();
            ajjzVar.getClass();
            aahd aahdVar = (aahd) agcdVar.d.get();
            aahdVar.getClass();
            Handler handler = (Handler) agcdVar.a.get();
            handler.getClass();
            abgd abgdVar = (abgd) agcdVar.f.get();
            abgdVar.getClass();
            aoae aoaeVar = (aoae) agcdVar.h.get();
            aoaeVar.getClass();
            abjv abjvVar = (abjv) agcdVar.i.get();
            abjvVar.getClass();
            aahv aahvVar = (aahv) agcdVar.g.get();
            aahvVar.getClass();
            abge abgeVar = (abge) agcdVar.b.get();
            abgeVar.getClass();
            abhtVar = abhtVar2;
            abidVar3.e = new abpo(context, ajutVar, ajjzVar, aahdVar, handler, abgdVar, aoaeVar, abjvVar, aahvVar, abgeVar, viewGroup2, acraVar, null);
        } else {
            abhtVar = abhtVar2;
        }
        abiaVar.a = abidVar3.e;
        ((abns) a).u = new abib(this);
        abht abhtVar3 = abhtVar;
        ((abhh) this.i.get()).a = abhtVar3;
        abhtVar3.B(this.d);
        abpb abpbVar = this.f;
        if (abpbVar != null) {
            b(abpbVar);
        }
    }

    @Override // defpackage.abpa
    public final void b(abpb abpbVar) {
        int i;
        int i2;
        if (abpbVar == null) {
            return;
        }
        Context context = abpbVar.getContext();
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        boolean aa = yjk.aa(context);
        if (this.c.c) {
            i2 = Math.min(Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels), resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_purchase_dialog_container_max_width));
            i = 1;
        } else if (aa) {
            i2 = abpbVar.getWidth();
            i = 8388693;
        } else {
            i = 87;
            i2 = -1;
        }
        abjr abjrVar = this.c;
        abjrVar.a = i2;
        abjrVar.b = i;
        Iterator it = abjrVar.d.iterator();
        while (it.hasNext()) {
            ((abjq) it.next()).d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [ajos, java.lang.Object] */
    public final void c() {
        this.d = null;
        if (this.e == null) {
            return;
        }
        abhc abhcVar = (abhc) this.b.get();
        abhcVar.b();
        abhcVar.a.clear();
        abhcVar.b = null;
        abhf abhfVar = (abhf) this.l.get();
        Iterator it = abhfVar.a.iterator();
        while (it.hasNext()) {
            abnz abnzVar = (abnz) it.next();
            abnzVar.f();
            abnzVar.l = null;
            abnzVar.q = false;
            apxf apxfVar = abnzVar.t;
            if (apxfVar != null) {
                abnzVar.h.c(apxfVar, null);
            }
            abnzVar.m = null;
            abnzVar.o = null;
            ajom ajomVar = abnzVar.n;
            if (ajomVar != 0) {
                ajomVar.b(abnzVar.i.get());
                abnzVar.n = null;
            }
            abnzVar.e.setVisibility(0);
        }
        abhfVar.a.clear();
        abhfVar.b.clear();
        abhfVar.c = null;
        abhfVar.d = null;
        abhfVar.e = false;
        abpo abpoVar = ((abia) this.h.get()).a;
        if (abpoVar != null && abpoVar.s) {
            abpoVar.e(false, true, false);
        }
        abjv abjvVar = this.k;
        abjvVar.a = null;
        abjvVar.d.clear();
        abjvVar.c.clear();
        abjvVar.b.clear();
        abhu abhuVar = (abhu) this.j.get();
        abhuVar.b = null;
        abht abhtVar = (abht) this.a.get();
        abhtVar.b.pf(abhuVar);
        abhtVar.C();
        abhtVar.w(null);
    }

    @Override // defpackage.abif
    public final void d(boolean z) {
    }

    public final void e(asra asraVar) {
        if (amkq.b(asraVar, this.d)) {
            return;
        }
        this.d = asraVar;
        a();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahcx.class};
        }
        if (i == 0) {
            ahcx ahcxVar = (ahcx) obj;
            if (ahcxVar.d() != aigf.FULLSCREEN && ahcxVar.d() != aigf.DEFAULT) {
                return null;
            }
            this.c.c = ahcxVar.d() == aigf.FULLSCREEN;
            b(this.f);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
