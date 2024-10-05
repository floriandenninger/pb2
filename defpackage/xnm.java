package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xnm {
    public final aahd a;
    private final Context b;
    private final akbz c;

    public xnm(Context context, akbz akbzVar, aahd aahdVar) {
        this.b = context;
        this.c = akbzVar;
        this.a = aahdVar;
    }

    private final void c(int i) {
        akca m = this.c.m();
        m.k(this.b.getString(i));
        m.d(-1);
        m.j(false);
        this.c.o(m.b());
    }

    public final void a(arlj arljVar, final Map map) {
        aqyg aqygVar;
        if (arljVar == null) {
            return;
        }
        aqyg aqygVar2 = arljVar.e;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar2);
        if (b == null || b.length() == 0) {
            return;
        }
        akca m = this.c.m();
        m.k(b);
        m.d(-1);
        m.j(false);
        apmh apmhVar = arljVar.h;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        if ((apmhVar.b & 1) != 0) {
            apmh apmhVar2 = arljVar.h;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            final apmg apmgVar = apmhVar2.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
            if ((apmgVar.b & 256) != 0) {
                aqygVar = apmgVar.i;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            m.m(ajcq.b(aqygVar), new View.OnClickListener() { // from class: xnl
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    apxf apxfVar;
                    xnm xnmVar = xnm.this;
                    apmg apmgVar2 = apmgVar;
                    Map map2 = map;
                    int i = apmgVar2.b;
                    if ((i & 8192) != 0) {
                        apxfVar = apmgVar2.n;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                    } else if ((i & 16384) != 0) {
                        apxfVar = apmgVar2.o;
                        if (apxfVar == null) {
                            apxfVar = apxf.a;
                        }
                    } else {
                        apxfVar = null;
                    }
                    xnmVar.a.c(apxfVar, map2);
                }
            });
        }
        this.c.o(m.b());
    }

    public final void b(arlj arljVar, Map map, int i) {
        if (arljVar == null) {
            c(i);
            return;
        }
        aqyg aqygVar = arljVar.e;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar);
        if (b == null || b.length() == 0) {
            c(i);
        } else {
            a(arljVar, map);
        }
    }
}
