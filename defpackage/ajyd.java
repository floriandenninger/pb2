package defpackage;

import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajyd implements View.OnClickListener {
    public final View a;
    protected apmg b;
    public ajyc c;
    public ajyb d;
    public final aoae e;
    private final aahd f;
    private Map g;

    public ajyd(aahd aahdVar, aoae aoaeVar, View view, byte[] bArr) {
        aahdVar.getClass();
        this.f = aahdVar;
        this.e = aoaeVar;
        view.getClass();
        this.a = view;
        view.setOnClickListener(this);
    }

    private final amrz c() {
        ajyb ajybVar = this.d;
        Map a = ajybVar != null ? ajybVar.a() : null;
        return a == null ? amvo.b : amrz.j(a);
    }

    private final Map d(amrz amrzVar, boolean z) {
        Map i = acrc.i(this.b, z);
        Map map = this.g;
        if (map != null) {
            i.putAll(map);
        }
        i.putAll(amrzVar);
        return i;
    }

    public void a(final apmg apmgVar, acra acraVar, Map map) {
        String str;
        this.g = map != null ? amrz.j(map) : null;
        this.b = apmgVar;
        if (apmgVar == null) {
            this.a.setVisibility(8);
            return;
        }
        this.a.setVisibility(0);
        this.a.setEnabled(!this.b.h);
        this.a.setClickable(!this.b.h);
        apmg apmgVar2 = this.b;
        if ((apmgVar2.b & 65536) != 0) {
            aots aotsVar = apmgVar2.r;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            str = aotsVar.c;
        } else {
            str = null;
        }
        if (str != null) {
            this.a.setContentDescription(str);
        }
        if (acraVar != null) {
            apmg apmgVar3 = this.b;
            if ((apmgVar3.b & 1048576) != 0) {
                acraVar.u(new acqx(apmgVar3.t), null);
            }
        }
        if (apmgVar.q.size() != 0) {
            this.f.d(apmgVar.q, d(c(), false));
        }
        if (this.e != null) {
            if (!this.a.isShown() || !jw.aj(this.a)) {
                this.a.post(new Runnable() { // from class: ajya
                    @Override // java.lang.Runnable
                    public final void run() {
                        ajyd ajydVar = ajyd.this;
                        ajydVar.e.c(apmgVar, ajydVar.a);
                    }
                });
            } else {
                this.e.c(apmgVar, this.a);
            }
        }
    }

    public final void b(apmg apmgVar, acra acraVar) {
        a(apmgVar, acraVar, null);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apmg apmgVar = this.b;
        if (apmgVar == null || apmgVar.h) {
            return;
        }
        if (this.c != null) {
            aong aongVar = (aong) apmgVar.toBuilder();
            this.c.oC(aongVar);
            this.b = (apmg) aongVar.build();
        }
        apmg apmgVar2 = this.b;
        int i = apmgVar2.b;
        if ((i & 8192) == 0 && (i & 16384) == 0 && (i & 32768) == 0) {
            return;
        }
        amrz c = c();
        int i2 = apmgVar2.b;
        if ((i2 & 8192) != 0) {
            boolean z = !((i2 & 16384) != 0);
            aahd aahdVar = this.f;
            apxf apxfVar = apmgVar2.n;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, d(c, z));
        }
        if ((apmgVar2.b & 16384) != 0) {
            aahd aahdVar2 = this.f;
            apxf apxfVar2 = apmgVar2.o;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            aahdVar2.c(apxfVar2, d(c, false));
        }
        if ((apmgVar2.b & 32768) != 0) {
            aahd aahdVar3 = this.f;
            apxf apxfVar3 = apmgVar2.p;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            aahdVar3.c(apxfVar3, d(c, false));
        }
    }
}
