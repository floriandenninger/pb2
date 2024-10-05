package defpackage;

import android.text.Spanned;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nce {
    private final nhb a;
    private final nah b;
    private final View c;
    private acra d;
    private apmg e;
    private atlt f;

    public nce(nhb nhbVar, nah nahVar, View view) {
        nhbVar.getClass();
        this.a = nhbVar;
        nahVar.getClass();
        this.b = nahVar;
        view.getClass();
        this.c = view;
    }

    private final void d() {
        apmg apmgVar;
        apxf apxfVar;
        this.c.setVisibility(8);
        View view = this.b.d;
        if (view != null) {
            view.setVisibility(0);
        }
        atlt atltVar = this.f;
        if (atltVar != null) {
            nah nahVar = this.b;
            acra acraVar = this.d;
            acraVar.getClass();
            if (nahVar.d == null) {
                nahVar.d = nahVar.b.inflate();
                nahVar.e = (TextView) nahVar.d.findViewById(R.id.notification_text);
                nahVar.f = (TextView) nahVar.d.findViewById(R.id.undo_button);
                nahVar.g = (TextView) nahVar.d.findViewById(R.id.ad_settings_button);
                nahVar.f.setOnClickListener(new naf(nahVar, 1));
                nahVar.g.setOnClickListener(new naf(nahVar, 0));
            }
            apxf apxfVar2 = null;
            acraVar.u(new acqx(atltVar.g), null);
            aulq aulqVar = atltVar.d;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            apmg apmgVar2 = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
            if ((atltVar.b & 4) != 0) {
                aulq aulqVar2 = atltVar.e;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
            } else {
                apmgVar = null;
            }
            if (apmgVar2 == null || (apmgVar2.b & 8192) == 0) {
                apxfVar = null;
            } else {
                apxfVar = apmgVar2.n;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            }
            nahVar.h = apxfVar;
            if (apmgVar != null && (apmgVar.b & 16384) != 0 && (apxfVar2 = apmgVar.o) == null) {
                apxfVar2 = apxf.a;
            }
            nahVar.i = apxfVar2;
            aqyg aqygVar = atltVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            Spanned b = ajcq.b(aqygVar);
            Spanned a = nah.a(apmgVar2);
            Spanned a2 = nah.a(apmgVar);
            whu.G(nahVar.e, b);
            whu.G(nahVar.f, a);
            whu.G(nahVar.g, a2);
        }
    }

    private final void e() {
        this.c.setVisibility(0);
        View view = this.b.d;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void a() {
        if (this.e == null || this.a.L() || this.f == null) {
            return;
        }
        apmg apmgVar = this.e;
        if ((apmgVar.b & 8192) != 0) {
            nhb nhbVar = this.a;
            apxf apxfVar = apmgVar.n;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            nhbVar.g(apxfVar);
        }
        this.a.K(true);
        d();
        nhb nhbVar2 = this.a;
        long j = this.f.f;
        Object obj = nhbVar2.b;
        if (obj == null || j < 0) {
            return;
        }
        nhbVar2.t = new ngz(nhbVar2.m, obj);
        nhbVar2.l.postDelayed(nhbVar2.t, j);
    }

    public final void b() {
        this.a.K(false);
        e();
        nhb nhbVar = this.a;
        ngz ngzVar = nhbVar.t;
        if (ngzVar != null) {
            ngzVar.a = true;
            nhbVar.t = null;
        }
    }

    public final void c(acra acraVar, apmg apmgVar, atlt atltVar) {
        acraVar.getClass();
        this.d = acraVar;
        this.e = apmgVar;
        this.f = atltVar;
        if (!this.a.L() || atltVar == null) {
            e();
        } else {
            d();
        }
    }
}
