package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eqw {
    private final Context a;
    private final ajyd b;
    private final akbu c;
    private final TextView d;

    public eqw(Context context, akbu akbuVar, akpq akpqVar, final akcy akcyVar, TextView textView, byte[] bArr) {
        this.a = context;
        ajyd c = akpqVar.c(textView);
        this.b = c;
        this.c = akbuVar;
        this.d = textView;
        c.c = new ajyc() { // from class: eqv
            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                akcy akcyVar2 = akcy.this;
                if (akcyVar2.i()) {
                    akcyVar2.f();
                }
            }
        };
    }

    public final void a(apmg apmgVar, acra acraVar) {
        aqyg aqygVar;
        int aJ;
        int aJ2;
        int aJ3;
        this.b.a(apmgVar, acraVar, amrz.k(acrc.b, Boolean.TRUE));
        if (apmgVar == null) {
            return;
        }
        TextView textView = this.d;
        arej arejVar = null;
        if ((apmgVar.b & 256) != 0) {
            aqygVar = apmgVar.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        int i = 1;
        if (apmgVar.c != 1 || (aJ3 = anaf.aJ(((Integer) apmgVar.d).intValue())) == 0 || aJ3 != 7) {
            if (apmgVar.c != 1 || (aJ2 = anaf.aJ(((Integer) apmgVar.d).intValue())) == 0 || aJ2 != 6) {
                if (apmgVar.c == 1 && (aJ = anaf.aJ(((Integer) apmgVar.d).intValue())) != 0) {
                    i = aJ;
                }
                String num = Integer.toString(i - 1);
                StringBuilder sb = new StringBuilder(num.length() + 30);
                sb.append("Unknown sponsor button style: ");
                sb.append(num);
                zga.b(sb.toString());
                this.d.setTextColor(wbs.Q(this.a, R.attr.ytTextDisabled));
            } else {
                this.d.setTextColor(wbs.Q(this.a, R.attr.ytTextDisabled));
            }
        } else {
            this.d.setTextColor(wbs.Q(this.a, R.attr.ytCallToAction));
        }
        arel arelVar = apmgVar.m;
        if (arelVar == null) {
            arelVar = arel.a;
        }
        if (arelVar.b == 102716411) {
            arel arelVar2 = apmgVar.m;
            if (arelVar2 == null) {
                arelVar2 = arel.a;
            }
            if (arelVar2.b == 102716411) {
                arejVar = (arej) arelVar2.c;
            } else {
                arejVar = arej.a;
            }
        }
        if (arejVar != null) {
            this.c.b(arejVar, this.d, apmgVar, acraVar);
        }
    }
}
