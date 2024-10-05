package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AppPromoCompanionAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mei implements wmy, wnb, wna {
    public final aahd a;
    public final wzq b;
    ImageView c;
    public apfn d;
    private final Context e;
    private final ajjz f;
    private final acra g;
    private final met h;
    private final mer i;
    private String j;
    private View k;
    private ImageView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private View p;
    private View q;
    private ImageView r;
    private View s;
    private final int t;
    private xbw u;
    private fqw v;
    private frb w;
    private mfe x;
    private boolean y;
    private final ajyw z;

    public mei(Context context, ajjz ajjzVar, aahd aahdVar, wzq wzqVar, acra acraVar, met metVar, mer merVar, ajyw ajywVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.e = context;
        ajjzVar.getClass();
        this.f = ajjzVar;
        aahdVar.getClass();
        this.a = aahdVar;
        wzqVar.getClass();
        this.b = wzqVar;
        acraVar.getClass();
        this.g = acraVar;
        this.h = metVar;
        this.i = merVar;
        this.t = (int) context.getResources().getDimension(R.dimen.ad_companion_action_button_margin);
        this.z = ajywVar;
    }

    private final void l() {
        View view;
        if (!this.y || this.d == null || (view = this.k) == null) {
            return;
        }
        view.setVisibility(0);
    }

    private final void m(View view, aowg aowgVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(aowgVar.d);
        if ((aowgVar.b & 1) != 0) {
            apxf apxfVar = aowgVar.c;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            arrayList.add(apxfVar);
        }
        view.setOnClickListener(new meh(this, aowgVar, arrayList));
        view.setClickable(true);
        this.g.u(new acqx(aowgVar.e), null);
    }

    private final void n(View view) {
        if (view != null) {
            whu.z(view, R.id.app_promotion_companion_card_stub, R.id.app_promotion_companion_card).setVisibility(8);
        }
        if (this.k != null) {
            Object obj = null;
            this.l.setImageDrawable(null);
            this.r.setVisibility(4);
            this.r.setImageDrawable(null);
            this.f.e(this.l);
            this.k.setVisibility(8);
            this.k.setBackgroundColor(wbs.W(this.e, R.attr.adBackground1).orElse(0));
            this.u.c();
            apfn apfnVar = this.d;
            if (apfnVar != null && (apfnVar.b & 1048576) != 0) {
                met metVar = this.h;
                aulq aulqVar = apfnVar.v;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer)) {
                    aulq aulqVar2 = this.d.v;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    obj = aulqVar2.pX(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer);
                }
                metVar.b(obj);
            }
            fqw fqwVar = this.v;
            if (fqwVar != null) {
                fqwVar.d();
            }
            mfe mfeVar = this.x;
            if (mfeVar != null) {
                mfeVar.a();
            }
            frb frbVar = this.w;
            if (frbVar != null) {
                frbVar.d();
            }
        }
    }

    @Override // defpackage.wmz
    public final void a() {
        l();
    }

    public final Map b(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        hashMap.put("MacrosConverters.CustomConvertersKey", new afxe[]{this.u});
        return hashMap;
    }

    public final void c(Object obj, List list) {
        if (obj == null || this.b.d(obj)) {
            return;
        }
        whl.J(this.a, list, b(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x026c  */
    @Override // defpackage.wmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r12, defpackage.ajok r13) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mei.d(android.view.View, ajok):void");
    }

    @Override // defpackage.wmz
    public final void e(View view) {
        this.j = "";
        this.y = false;
        n(view);
        this.k = null;
    }

    @Override // defpackage.wmz
    public final void f() {
        this.y = true;
        l();
    }

    @Override // defpackage.wmy
    public final boolean g(String str, PlayerResponseModel playerResponseModel, ashd ashdVar) {
        apfn apfnVar;
        this.j = str;
        this.d = null;
        aryr aryrVar = playerResponseModel != null ? playerResponseModel.a : null;
        if (aryrVar != null) {
            atyh atyhVar = aryrVar.A;
            if (atyhVar == null) {
                atyhVar = atyh.a;
            }
            if (atyhVar.b == 65002523) {
                atyh atyhVar2 = aryrVar.A;
                if (atyhVar2 == null) {
                    atyhVar2 = atyh.a;
                }
                if (atyhVar2.b == 65002523) {
                    apfnVar = (apfn) atyhVar2.c;
                } else {
                    apfnVar = apfn.a;
                }
                this.d = apfnVar;
            }
        }
        return this.d != null;
    }

    @Override // defpackage.wmz
    public final void h(xad xadVar) {
        aahd aahdVar = this.a;
        apfn apfnVar = this.d;
        apxf apxfVar = null;
        if (apfnVar != null && (apfnVar.b & 16384) != 0 && (apxfVar = apfnVar.r) == null) {
            apxfVar = apxf.a;
        }
        mfm.c(aahdVar, apfnVar, apxfVar, this.w);
    }

    @Override // defpackage.wnb
    public final boolean i(String str, aqde aqdeVar, ashd ashdVar) {
        this.j = str;
        this.d = null;
        if ((aqdeVar.b & 2) == 0) {
            return false;
        }
        apfn apfnVar = aqdeVar.d;
        if (apfnVar == null) {
            apfnVar = apfn.a;
        }
        this.d = apfnVar;
        return true;
    }

    @Override // defpackage.wna
    public final boolean j(String str, aulq aulqVar) {
        this.j = str;
        if (aulqVar == null || !aulqVar.pY(AppPromoCompanionAdRendererOuterClass.appPromoCompanionAdRenderer)) {
            return false;
        }
        this.d = (apfn) aulqVar.pX(AppPromoCompanionAdRendererOuterClass.appPromoCompanionAdRenderer);
        return true;
    }

    @Override // defpackage.wna
    public final boolean k(aulq aulqVar, boolean z) {
        if (!j(this.j, aulqVar)) {
            return false;
        }
        this.y = true;
        return true;
    }
}
