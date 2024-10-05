package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class etl extends erx {
    private final View k;
    private final akbd l;
    private final ajyf m;

    public etl(Context context, ajjz ajjzVar, gma gmaVar, ajoy ajoyVar, ajuw ajuwVar, ajyg ajygVar, ftn ftnVar, fvf fvfVar, akbd akbdVar, byte[] bArr, byte[] bArr2) {
        super(context, ajjzVar, gmaVar, ajoyVar, ajuwVar, ftnVar, fvfVar, null, null);
        this.k = this.e.findViewById(R.id.avatar_layout);
        this.l = akbdVar;
        TextView textView = this.h;
        this.m = textView != null ? ajygVar.a(textView) : null;
    }

    public static final CharSequence q(aqbj aqbjVar) {
        aqyg aqygVar;
        if ((aqbjVar.b & 32) != 0) {
            aqygVar = aqbjVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    public static final apkl r(aqbj aqbjVar) {
        for (apjt apjtVar : aqbjVar.j) {
            if ((apjtVar.b & 16777216) != 0) {
                apkl apklVar = apjtVar.h;
                return apklVar == null ? apkl.a : apklVar;
            }
        }
        return null;
    }

    public static final CharSequence s(aqbj aqbjVar) {
        aqyg aqygVar;
        if ((aqbjVar.b & 16) != 0) {
            aqygVar = aqbjVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        return ajcq.b(aqygVar);
    }

    @Override // defpackage.erx
    public final /* synthetic */ apxf d(Object obj) {
        apxf apxfVar = ((aqbj) obj).g;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    @Override // defpackage.erx
    public final /* synthetic */ atdf e(Object obj) {
        atdf atdfVar = ((aqbj) obj).k;
        return atdfVar == null ? atdf.a : atdfVar;
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ auzj f(Object obj) {
        aqbj aqbjVar = (aqbj) obj;
        aqbk aqbkVar = aqbjVar.h;
        if (aqbkVar == null) {
            aqbkVar = aqbk.a;
        }
        if ((aqbkVar.b & 1) == 0) {
            return null;
        }
        aqbk aqbkVar2 = aqbjVar.h;
        if (aqbkVar2 == null) {
            aqbkVar2 = aqbk.a;
        }
        auzj auzjVar = aqbkVar2.c;
        return auzjVar == null ? auzj.a : auzjVar;
    }

    @Override // defpackage.erx
    public final /* synthetic */ avgg g(Object obj) {
        avgg avggVar = ((aqbj) obj).c;
        return avggVar == null ? avgg.a : avggVar;
    }

    @Override // defpackage.erx
    public final /* synthetic */ CharSequence h(Object obj) {
        return q((aqbj) obj);
    }

    @Override // defpackage.erx
    public final /* synthetic */ CharSequence i(Object obj) {
        return s((aqbj) obj);
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ CharSequence j(Object obj) {
        return q((aqbj) obj);
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ CharSequence k(Object obj) {
        aqyg aqygVar;
        aqbj aqbjVar = (aqbj) obj;
        if (r(aqbjVar) == null) {
            if ((aqbjVar.b & 8) != 0) {
                aqygVar = aqbjVar.d;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            return ajcq.b(aqygVar);
        }
        return r(aqbjVar).b;
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ CharSequence l(Object obj) {
        return s((aqbj) obj);
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ Object m(Object obj, auzj auzjVar) {
        aqbj aqbjVar = (aqbj) obj;
        if ((aqbjVar.b & 256) == 0) {
            return aqbjVar;
        }
        aong aongVar = (aong) aqbjVar.toBuilder();
        aqbk aqbkVar = aqbjVar.h;
        if (aqbkVar == null) {
            aqbkVar = aqbk.a;
        }
        aone builder = aqbkVar.toBuilder();
        builder.copyOnWrite();
        aqbk aqbkVar2 = (aqbk) builder.instance;
        auzjVar.getClass();
        aqbkVar2.c = auzjVar;
        aqbkVar2.b |= 1;
        aongVar.copyOnWrite();
        aqbj aqbjVar2 = (aqbj) aongVar.instance;
        aqbk aqbkVar3 = (aqbk) builder.build();
        aqbkVar3.getClass();
        aqbjVar2.h = aqbkVar3;
        aqbjVar2.b |= 256;
        return (aqbj) aongVar.build();
    }

    @Override // defpackage.erx
    public final /* synthetic */ List n(Object obj) {
        return ((aqbj) obj).i;
    }

    @Override // defpackage.erx
    public final /* bridge */ /* synthetic */ byte[] o(Object obj) {
        return ((aqbj) obj).m.I();
    }

    @Override // defpackage.erx, defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apmg apmgVar;
        aqbj aqbjVar = (aqbj) obj;
        super.oB(ajokVar, aqbjVar);
        yny.z(this.k, yny.x(this.a.getResources().getDimensionPixelSize(R.dimen.list_item_thumbnail_width)), ViewGroup.LayoutParams.class);
        TextView textView = (TextView) this.e.findViewById(R.id.channel_name);
        if (r(aqbjVar) != null) {
            zbx zbxVar = new zbx(wbs.Q(textView.getContext(), R.attr.ytVerifiedBadgeBackground));
            textView.setMaxLines(2);
            textView.setBackground(zbxVar);
            textView.getViewTreeObserver().addOnPreDrawListener(new etk(aqbjVar, textView, zbxVar));
        } else {
            textView.setBackground(null);
            textView.setMaxLines(this.a.getResources().getInteger(R.integer.compact_renderer_title_max_lines));
            textView.setPadding(0, 0, 0, 0);
        }
        acra acraVar = ajokVar.a;
        if (this.m == null) {
            whu.I(this.h, false);
        } else {
            if ((aqbjVar.b & 131072) != 0) {
                aulq aulqVar = aqbjVar.n;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                apmgVar = (apmg) aulqVar.pX(ButtonRendererOuterClass.buttonRenderer);
            } else {
                apmgVar = null;
            }
            this.m.b(apmgVar, acraVar);
            whu.I(this.h, apmgVar != null);
        }
        this.l.b(this.e, this.l.a(this.e, null));
    }
}
