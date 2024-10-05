package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yhd extends ajpc {
    public avnb a;
    private final View b;
    private final TextView c;
    private final TextView d;
    private final ajyf e;
    private final ajyf f;
    private final aahd g;
    private final Context h;

    public yhd(Context context, ViewGroup viewGroup, aahd aahdVar, ajyg ajygVar) {
        this.h = context;
        this.g = aahdVar;
        final int i = 0;
        View inflate = LayoutInflater.from(context).inflate(R.layout.unlimited_user_notification, viewGroup, false);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        this.d = (TextView) inflate.findViewById(R.id.message);
        ajyf a = ajygVar.a((TextView) inflate.findViewById(R.id.dismiss_button));
        this.e = a;
        final int i2 = 1;
        a.c = new ajyc(this) { // from class: yhb
            public final /* synthetic */ yhd a;

            {
                this.a = this;
            }

            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                if (i2 != 0) {
                    yhd yhdVar = this.a;
                    avnb avnbVar = yhdVar.a;
                    if (avnbVar == null || (avnbVar.b & 4) == 0) {
                        return;
                    }
                    apmh apmhVar = avnbVar.h;
                    if (apmhVar == null) {
                        apmhVar = apmh.a;
                    }
                    apmg apmgVar = apmhVar.c;
                    if (apmgVar == null) {
                        apmgVar = apmg.a;
                    }
                    yhdVar.f(apmgVar);
                    return;
                }
                yhd yhdVar2 = this.a;
                avnb avnbVar2 = yhdVar2.a;
                if (avnbVar2 == null || (avnbVar2.b & 2) == 0) {
                    return;
                }
                apmh apmhVar2 = avnbVar2.g;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmg apmgVar2 = apmhVar2.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                yhdVar2.f(apmgVar2);
            }
        };
        ajyf a2 = ajygVar.a((TextView) inflate.findViewById(R.id.update_button));
        this.f = a2;
        a2.c = new ajyc(this) { // from class: yhb
            public final /* synthetic */ yhd a;

            {
                this.a = this;
            }

            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                if (i != 0) {
                    yhd yhdVar = this.a;
                    avnb avnbVar = yhdVar.a;
                    if (avnbVar == null || (avnbVar.b & 4) == 0) {
                        return;
                    }
                    apmh apmhVar = avnbVar.h;
                    if (apmhVar == null) {
                        apmhVar = apmh.a;
                    }
                    apmg apmgVar = apmhVar.c;
                    if (apmgVar == null) {
                        apmgVar = apmg.a;
                    }
                    yhdVar.f(apmgVar);
                    return;
                }
                yhd yhdVar2 = this.a;
                avnb avnbVar2 = yhdVar2.a;
                if (avnbVar2 == null || (avnbVar2.b & 2) == 0) {
                    return;
                }
                apmh apmhVar2 = avnbVar2.g;
                if (apmhVar2 == null) {
                    apmhVar2 = apmh.a;
                }
                apmg apmgVar2 = apmhVar2.c;
                if (apmgVar2 == null) {
                    apmgVar2 = apmg.a;
                }
                yhdVar2.f(apmgVar2);
            }
        };
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.a = null;
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        apmg apmgVar;
        apmg apmgVar2;
        avnb avnbVar = (avnb) obj;
        this.a = avnbVar;
        int i = avnbVar.c;
        if (i == 5) {
            this.b.setBackgroundColor(Color.parseColor((String) avnbVar.d));
        } else if (i == 8) {
            View view = this.b;
            Context context = this.h;
            avez b = avez.b(((Integer) avnbVar.d).intValue());
            if (b == null) {
                b = avez.THEME_ATTRIBUTE_UNKNOWN;
            }
            view.setBackgroundColor(akbg.a(context, b, 0));
        }
        TextView textView = this.c;
        if ((avnbVar.b & 1) != 0) {
            aqygVar = avnbVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        whu.G(this.d, ajcq.k(System.getProperty("line.separator"), ajcq.o((aqyg[]) avnbVar.f.toArray(new aqyg[0]))));
        if ((avnbVar.b & 32) != 0) {
            Context context2 = this.h;
            avez b2 = avez.b(avnbVar.i);
            if (b2 == null) {
                b2 = avez.THEME_ATTRIBUTE_UNKNOWN;
            }
            int a = akbg.a(context2, b2, 0);
            this.c.setTextColor(a);
            this.d.setTextColor(a);
        }
        if ((avnbVar.b & 1) == 0 && avnbVar.f.size() > 0) {
            yny.z(this.d, yny.s(0, 0, 0, 0), ViewGroup.MarginLayoutParams.class);
        }
        if ((avnbVar.b & 4) != 0) {
            apmh apmhVar = avnbVar.h;
            if (apmhVar == null) {
                apmhVar = apmh.a;
            }
            apmgVar = apmhVar.c;
            if (apmgVar == null) {
                apmgVar = apmg.a;
            }
        } else {
            apmgVar = null;
        }
        this.e.a(apmgVar, null, null);
        if ((avnbVar.b & 2) != 0) {
            apmh apmhVar2 = avnbVar.g;
            if (apmhVar2 == null) {
                apmhVar2 = apmh.a;
            }
            apmgVar2 = apmhVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
        } else {
            apmgVar2 = null;
        }
        this.f.a(apmgVar2, null, null);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avnb) obj).j.I();
    }

    public final void f(apmg apmgVar) {
        if (apmgVar != null) {
            int i = apmgVar.b;
            if ((i & 16384) != 0) {
                aahd aahdVar = this.g;
                apxf apxfVar = apmgVar.o;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
                return;
            }
            if ((i & 8192) != 0) {
                aahd aahdVar2 = this.g;
                apxf apxfVar2 = apmgVar.n;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                aahdVar2.c(apxfVar2, acrc.g(this.a));
            }
        }
    }
}
