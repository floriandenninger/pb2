package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CompactCompanionExtensionRendererOuterClass;
import com.google.protos.youtube.api.innertube.CompanionAdRendererOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfm implements wmy, wnb, wna {
    public final aahd a;
    public final wzq b;
    public xbw c;
    public aqdd d;
    private final ajjz e;
    private final acra f;
    private final met g;
    private final ajut h;
    private final Context i;
    private final mer j;
    private mfl k;
    private View l;
    private TextView m;
    private TextView n;
    private ViewGroup o;
    private ImageView p;
    private String q = "";
    private boolean r;
    private ImageView s;
    private View t;
    private frb u;
    private final ajyw v;

    public mfm(ajjz ajjzVar, aahd aahdVar, wzq wzqVar, acra acraVar, met metVar, ajut ajutVar, Context context, mer merVar, ajyw ajywVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        aahdVar.getClass();
        this.a = aahdVar;
        wzqVar.getClass();
        this.b = wzqVar;
        ajjzVar.getClass();
        this.e = ajjzVar;
        ajutVar.getClass();
        this.h = ajutVar;
        acraVar.getClass();
        this.f = acraVar;
        this.g = metVar;
        this.i = context;
        this.j = merVar;
        this.v = ajywVar;
    }

    public static void c(aahd aahdVar, Object obj, apxf apxfVar, fqz fqzVar) {
        if (apxfVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (obj != null) {
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        }
        hashMap.put("hint_anchor_tag", fqzVar == null ? null : fqzVar.a);
        aahdVar.c(apxfVar, hashMap);
    }

    private final void l(View view, final aowg aowgVar) {
        final ArrayList arrayList = new ArrayList();
        arrayList.addAll(aowgVar.d);
        if ((aowgVar.b & 1) != 0) {
            apxf apxfVar = aowgVar.c;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            arrayList.add(apxfVar);
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: mfg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                mfm mfmVar = mfm.this;
                aowg aowgVar2 = aowgVar;
                List list = arrayList;
                if (list.isEmpty()) {
                    return;
                }
                Map b = mfmVar.b(aowgVar2);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mfmVar.a.c((apxf) it.next(), b);
                }
            }
        });
        view.setClickable(true);
        this.f.u(new acqx(aowgVar.e), null);
    }

    private final void m(View view) {
        if (view != null) {
            whu.z(view, R.id.ad_companion_card_stub, R.id.ad_companion_card).setVisibility(8);
        }
        if (this.l != null) {
            this.e.e(this.s);
            this.l.setVisibility(8);
            this.l.setBackgroundColor(wbs.W(this.i, R.attr.adBackground1).orElse(0));
        }
        xbw xbwVar = this.c;
        if (xbwVar != null) {
            xbwVar.c();
        }
        aqdd aqddVar = this.d;
        if (aqddVar != null) {
            aulq aulqVar = aqddVar.o;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer)) {
                met metVar = this.g;
                aulq aulqVar2 = this.d.o;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                metVar.b(aulqVar2.pX(CompactCompanionExtensionRendererOuterClass.compactCompanionExtensionRenderer));
            }
        }
        mfl mflVar = this.k;
        if (mflVar != null) {
            mflVar.a.setOnClickListener(null);
            mflVar.a.setVisibility(8);
            mflVar.d.d();
            mflVar.f = null;
            mflVar.g = null;
        }
        frb frbVar = this.u;
        if (frbVar != null) {
            frbVar.d();
        }
    }

    private final void n() {
        View view;
        if (!this.r || this.d == null || (view = this.l) == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // defpackage.wmz
    public final void a() {
        n();
    }

    public final Map b(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        hashMap.put("MacrosConverters.CustomConvertersKey", new afxe[]{this.c});
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01eb  */
    @Override // defpackage.wmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r14, defpackage.ajok r15) {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mfm.d(android.view.View, ajok):void");
    }

    @Override // defpackage.wmz
    public final void e(View view) {
        m(view);
        this.q = "";
        this.r = false;
        this.d = null;
        this.l = null;
    }

    @Override // defpackage.wmz
    public final void f() {
        this.r = true;
        n();
    }

    @Override // defpackage.wmy
    public final boolean g(String str, PlayerResponseModel playerResponseModel, ashd ashdVar) {
        aqdd aqddVar;
        this.q = str;
        this.d = null;
        aryr aryrVar = playerResponseModel != null ? playerResponseModel.a : null;
        if (aryrVar != null) {
            atyh atyhVar = aryrVar.A;
            if (atyhVar == null) {
                atyhVar = atyh.a;
            }
            if (atyhVar.b == 55514441) {
                atyh atyhVar2 = aryrVar.A;
                if (atyhVar2 == null) {
                    atyhVar2 = atyh.a;
                }
                if (atyhVar2.b == 55514441) {
                    aqddVar = (aqdd) atyhVar2.c;
                } else {
                    aqddVar = aqdd.a;
                }
                this.d = aqddVar;
            }
        }
        return this.d != null;
    }

    @Override // defpackage.wmz
    public final void h(xad xadVar) {
        aahd aahdVar = this.a;
        aqdd aqddVar = this.d;
        apxf apxfVar = null;
        if (aqddVar != null && (aqddVar.b & 8192) != 0 && (apxfVar = aqddVar.n) == null) {
            apxfVar = apxf.a;
        }
        c(aahdVar, aqddVar, apxfVar, this.u);
    }

    @Override // defpackage.wnb
    public final boolean i(String str, aqde aqdeVar, ashd ashdVar) {
        this.q = str;
        if ((aqdeVar.b & 1) == 0) {
            this.d = null;
            return false;
        }
        aqdd aqddVar = aqdeVar.c;
        if (aqddVar == null) {
            aqddVar = aqdd.a;
        }
        this.d = aqddVar;
        return true;
    }

    @Override // defpackage.wna
    public final boolean j(String str, aulq aulqVar) {
        this.q = str;
        if (aulqVar == null || !aulqVar.pY(CompanionAdRendererOuterClass.companionAdRenderer)) {
            return false;
        }
        this.d = (aqdd) aulqVar.pX(CompanionAdRendererOuterClass.companionAdRenderer);
        return true;
    }

    @Override // defpackage.wna
    public final boolean k(aulq aulqVar, boolean z) {
        if (!j(this.q, aulqVar)) {
            return false;
        }
        this.r = true;
        return true;
    }
}
