package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class mkp implements muz {
    public final View a;
    private final ajut b;
    private final akbu c;
    private final Context d;
    private final ImageView e;
    private final TextView f;
    private final ajyd g;
    private final ColorStateList h;
    private final int i;
    private acra j;
    private apmg k;
    private ajok l;

    public mkp(ajut ajutVar, akbu akbuVar, Context context, akpq akpqVar, ViewGroup viewGroup, int i, int i2, byte[] bArr) {
        this.b = ajutVar;
        this.c = akbuVar;
        this.d = context;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.a = inflate;
        this.g = akpqVar.c(inflate);
        this.e = (ImageView) inflate.findViewById(R.id.button_icon);
        TextView textView = (TextView) inflate.findViewById(R.id.button_text);
        this.f = textView;
        this.h = textView.getTextColors();
        this.i = i2;
    }

    @Override // defpackage.muz
    public void b() {
        this.j = null;
        this.k = null;
        this.l = null;
        this.a.setContentDescription(null);
    }

    public void c(auvo auvoVar, acra acraVar, ajok ajokVar) {
        int i;
        avfc avfcVar;
        int orElse;
        aqyg aqygVar;
        avfc avfcVar2;
        ColorStateList colorStateList;
        arej arejVar;
        acraVar.getClass();
        this.j = acraVar;
        apmh apmhVar = auvoVar.f;
        if (apmhVar == null) {
            apmhVar = apmh.a;
        }
        amkq.N(1 == (apmhVar.b & 1));
        apmh apmhVar2 = auvoVar.f;
        if (apmhVar2 == null) {
            apmhVar2 = apmh.a;
        }
        apmg apmgVar = apmhVar2.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        this.k = apmgVar;
        this.l = ajokVar;
        ajyd ajydVar = this.g;
        acra acraVar2 = this.j;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        ajok ajokVar2 = this.l;
        if (ajokVar2 != null) {
            hashMap.put("sectionListController", ajokVar2.c("sectionListController"));
            hashMap.putAll(this.l.e());
        }
        ajydVar.a(apmgVar, acraVar2, hashMap);
        apmg apmgVar2 = this.k;
        if ((apmgVar2.b & 32) != 0) {
            ajut ajutVar = this.b;
            arfs arfsVar = apmgVar2.g;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            i = ajutVar.a(b);
        } else {
            i = 0;
        }
        Drawable a = i == 0 ? null : aii.a(this.d, i);
        if (a == null) {
            this.e.setImageResource(0);
        } else {
            apmg apmgVar3 = this.k;
            if (apmgVar3.c == 20) {
                avfcVar = (avfc) apmgVar3.d;
            } else {
                avfcVar = avfc.a;
            }
            if ((avfcVar.b & 2) == 0) {
                orElse = wbs.W(this.d, this.i).orElse(0);
            } else {
                Context context = this.d;
                avez b2 = avez.b(avfcVar.d);
                if (b2 == null) {
                    b2 = avez.THEME_ATTRIBUTE_UNKNOWN;
                }
                orElse = akbg.a(context, b2, 0);
            }
            Drawable mutate = gl.c(a).mutate();
            mutate.setTint(orElse);
            this.e.setImageDrawable(mutate);
        }
        TextView textView = this.f;
        apmg apmgVar4 = this.k;
        if ((apmgVar4.b & 256) != 0) {
            aqygVar = apmgVar4.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        apmg apmgVar5 = this.k;
        if (apmgVar5.c == 20) {
            avfcVar2 = (avfc) apmgVar5.d;
        } else {
            avfcVar2 = avfc.a;
        }
        if ((avfcVar2.b & 1) != 0) {
            Context context2 = this.d;
            avez b3 = avez.b(avfcVar2.c);
            if (b3 == null) {
                b3 = avez.THEME_ATTRIBUTE_UNKNOWN;
            }
            colorStateList = ColorStateList.valueOf(akbg.a(context2, b3, 0));
        } else {
            colorStateList = this.h;
        }
        this.f.setTextColor(colorStateList);
        arel arelVar = this.k.m;
        if (arelVar == null) {
            arelVar = arel.a;
        }
        if (arelVar.b == 102716411) {
            akbu akbuVar = this.c;
            arel arelVar2 = this.k.m;
            if (arelVar2 == null) {
                arelVar2 = arel.a;
            }
            if (arelVar2.b == 102716411) {
                arejVar = (arej) arelVar2.c;
            } else {
                arejVar = arej.a;
            }
            akbuVar.b(arejVar, this.a, this.k, this.j);
        }
        aott aottVar = this.k.s;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        if ((1 & aottVar.b) == 0) {
            this.e.setContentDescription(null);
            this.f.setImportantForAccessibility(0);
            return;
        }
        ImageView imageView = this.e;
        aots aotsVar = aottVar.c;
        if (aotsVar == null) {
            aotsVar = aots.a;
        }
        imageView.setContentDescription(aotsVar.c);
        this.f.setImportantForAccessibility(2);
    }

    @Override // defpackage.muz
    public final View oE() {
        return this.a;
    }
}
