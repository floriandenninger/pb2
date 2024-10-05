package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import com.google.protos.youtube.api.innertube.UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ygi extends ajpc implements ypd {
    public final View a;
    public final TextView b;
    public final Context c;
    public awgq d;
    public acra e;
    public final int f;
    public Drawable g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final ajyf k;
    private final aahd l;
    private final LinearLayout m;
    private final LinearLayout n;
    private final ypa o;
    private final int p;

    public ygi(Context context, ajyg ajygVar, aahd aahdVar, ypa ypaVar) {
        this.c = context;
        View inflate = View.inflate(context, R.layout.single_ypc_offer_item, null);
        this.a = inflate;
        this.h = (TextView) inflate.findViewById(R.id.metadata);
        this.i = (TextView) inflate.findViewById(R.id.name);
        this.j = (TextView) inflate.findViewById(R.id.promotion_text);
        this.l = aahdVar;
        this.o = ypaVar;
        this.p = context.getResources().getDimensionPixelSize(R.dimen.offer_container_margin);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.offer_container);
        this.m = linearLayout;
        this.n = (LinearLayout) linearLayout.findViewById(R.id.offer_info);
        TextView textView = (TextView) linearLayout.findViewById(R.id.price);
        this.b = textView;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.price_icon_size);
        this.f = dimensionPixelSize;
        textView.addOnLayoutChangeListener(akbc.e(textView, dimensionPixelSize));
        ajyf a = ajygVar.a(textView);
        this.k = a;
        a.e(R.dimen.price_icon_compound_padding);
        a.g();
        a.c = new ajyc() { // from class: ygg
            @Override // defpackage.ajyc
            public final void oC(aong aongVar) {
                ygi ygiVar = ygi.this;
                if (aongVar == null || ygiVar.e == null) {
                    return;
                }
                apxf apxfVar = ((apmg) aongVar.instance).o;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                if (!apxfVar.pY(ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.confirmDialogEndpoint)) {
                    apxf apxfVar2 = ((apmg) aongVar.instance).o;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    if (!apxfVar2.pY(UnlimitedFamilyFlowEndpointOuterClass$UnlimitedFamilyFlowEndpoint.unlimitedFamilyFlowEndpoint)) {
                        return;
                    }
                }
                acra acraVar = ygiVar.e;
                apxf apxfVar3 = ((apmg) aongVar.instance).o;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                acraVar.I(3, new acqx(apxfVar3.c), null);
            }
        };
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.o.m(this);
        this.d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a3  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajok r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygi.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((awgq) obj).f.I();
    }

    public final void g(int i) {
        int i2;
        int i3;
        if (this.m.getOrientation() == i) {
            return;
        }
        this.m.setOrientation(i);
        int i4 = -2;
        if (i == 0) {
            i2 = 0;
            i4 = 0;
            i3 = -2;
        } else {
            i2 = this.p;
            i3 = 0;
        }
        yny.B(this.n, i4, i3);
        yny.z(this.b, yny.s(0, i2, 0, 0), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        apxf apxfVar;
        aqyg aqygVar;
        apxf apxfVar2;
        if (i == -1) {
            return new Class[]{aawx.class, aawy.class};
        }
        if (i != 0) {
            if (i == 1) {
                apxf a = ((aawy) obj).a();
                apmh apmhVar = this.d.g;
                if (apmhVar == null) {
                    apmhVar = apmh.a;
                }
                apmg apmgVar = apmhVar.c;
                if (apmgVar == null) {
                    apmgVar = apmg.a;
                }
                if ((apmgVar.b & 8192) != 0) {
                    apmh apmhVar2 = this.d.g;
                    if (apmhVar2 == null) {
                        apmhVar2 = apmh.a;
                    }
                    apmg apmgVar2 = apmhVar2.c;
                    if (apmgVar2 == null) {
                        apmgVar2 = apmg.a;
                    }
                    apxfVar2 = apmgVar2.n;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                } else {
                    apxfVar2 = null;
                }
                if (!amkq.b(a, apxfVar2)) {
                    return null;
                }
                LayerDrawable layerDrawable = (LayerDrawable) this.c.getResources().getDrawable(R.drawable.indeterminate_loading_indicator);
                int measuredWidth = this.b.getMeasuredWidth();
                this.b.setCompoundDrawablesRelative(layerDrawable, null, null, null);
                TextView textView = this.b;
                textView.setPadding((measuredWidth / 2) - (this.f / 2), textView.getPaddingTop(), this.b.getPaddingRight(), this.b.getPaddingBottom());
                ObjectAnimator.ofInt(layerDrawable.getDrawable(0), "level", 0, 20000).setDuration(3000L).start();
                ObjectAnimator.ofInt(layerDrawable.getDrawable(1), "level", 0, 20000).setDuration(3000L).start();
                this.b.setText("");
                this.b.setWidth(measuredWidth);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        apxf a2 = ((aawx) obj).a();
        apmh apmhVar3 = this.d.g;
        if (apmhVar3 == null) {
            apmhVar3 = apmh.a;
        }
        apmg apmgVar3 = apmhVar3.c;
        if (apmgVar3 == null) {
            apmgVar3 = apmg.a;
        }
        if ((apmgVar3.b & 8192) != 0) {
            apmh apmhVar4 = this.d.g;
            if (apmhVar4 == null) {
                apmhVar4 = apmh.a;
            }
            apmg apmgVar4 = apmhVar4.c;
            if (apmgVar4 == null) {
                apmgVar4 = apmg.a;
            }
            apxfVar = apmgVar4.n;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        if (!amkq.b(a2, apxfVar) || this.g == null) {
            return null;
        }
        this.b.setPadding(this.c.getResources().getDimensionPixelSize(R.dimen.price_text_padding_start_default), this.b.getPaddingTop(), this.b.getPaddingRight(), this.b.getPaddingBottom());
        TextView textView2 = this.b;
        apmh apmhVar5 = this.d.g;
        if (apmhVar5 == null) {
            apmhVar5 = apmh.a;
        }
        apmg apmgVar5 = apmhVar5.c;
        if (apmgVar5 == null) {
            apmgVar5 = apmg.a;
        }
        if ((apmgVar5.b & 256) != 0) {
            apmh apmhVar6 = this.d.g;
            if (apmhVar6 == null) {
                apmhVar6 = apmh.a;
            }
            apmg apmgVar6 = apmhVar6.c;
            if (apmgVar6 == null) {
                apmgVar6 = apmg.a;
            }
            aqygVar = apmgVar6.i;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView2.setText(ajcq.b(aqygVar));
        this.b.setCompoundDrawablesRelative(this.g, null, null, null);
        return null;
    }
}
