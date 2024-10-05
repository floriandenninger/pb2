package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MutedSparklesRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ngo implements ajom {
    private final Context a;
    private final ajjz b;
    private final aahd c;
    private final ajut d;
    private final ajuw e;
    private final wyz f;
    private final tdv g;
    private final wzq h;
    private final euv i;
    private final ypa j;
    private final FrameLayout k;
    private final akbd l;
    private ngn m;
    private ngi n;
    private boolean o;
    private final ajyw p;

    /* JADX INFO: Access modifiers changed from: protected */
    public ngo(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = context;
        this.b = ajjzVar;
        this.c = aahdVar;
        this.d = ajutVar;
        this.e = ajuwVar;
        this.f = wyzVar;
        this.g = tdvVar;
        this.h = wzqVar;
        this.i = euvVar;
        this.j = ypaVar;
        this.k = new FrameLayout(context);
        this.p = ajywVar;
        this.l = akbdVar;
    }

    public static int d(ajok ajokVar) {
        Object c = ajokVar.c("horizontalShelfColumnCountSupplier");
        if (c instanceof ajti) {
            return ((ajti) c).a();
        }
        return 1;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.k;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        if (this.o) {
            this.m.b.c();
        } else {
            this.n.b(ajosVar);
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        apxf apxfVar;
        auht auhtVar = (auht) obj;
        int d = d(ajokVar);
        this.k.removeAllViews();
        boolean z = d > 1 || !auhtVar.f;
        this.o = z;
        aoxy aoxyVar = null;
        if (z) {
            if (this.m == null) {
                this.m = new ngn(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.p, this.l, null, null, null, null, null);
            }
            ngn ngnVar = this.m;
            auhtVar.getClass();
            ngnVar.h = ajokVar.a;
            augy augyVar = auhtVar.c;
            if (augyVar == null) {
                augyVar = augy.a;
            }
            aulq aulqVar = augyVar.p;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            apmg apmgVar = (apmg) ahbj.n(aulqVar, ButtonRendererOuterClass.buttonRenderer);
            aulq aulqVar2 = auhtVar.e;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            atlt atltVar = (atlt) ahbj.n(aulqVar2, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
            ncd ncdVar = ngnVar.a;
            augy augyVar2 = auhtVar.c;
            if (augyVar2 == null) {
                augyVar2 = augy.a;
            }
            if ((augyVar2.b & 2048) != 0) {
                augy augyVar3 = auhtVar.c;
                if (augyVar3 == null) {
                    augyVar3 = augy.a;
                }
                apxfVar = augyVar3.n;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            } else {
                apxfVar = null;
            }
            augy augyVar4 = auhtVar.c;
            if (augyVar4 == null) {
                augyVar4 = augy.a;
            }
            ncdVar.a(apxfVar, augyVar4.s);
            nhb nhbVar = ngnVar.b;
            acra acraVar = ajokVar.a;
            String str = auhtVar.i;
            augy augyVar5 = auhtVar.c;
            if (augyVar5 == null) {
                augyVar5 = augy.a;
            }
            augu[] auguVarArr = (augu[]) auhtVar.d.toArray(new augu[0]);
            if ((auhtVar.b & 8) != 0 && (aoxyVar = auhtVar.g) == null) {
                aoxyVar = aoxy.a;
            }
            nhbVar.F(acraVar, auhtVar, str, augyVar5, auguVarArr, aoxyVar, auhtVar.h.I());
            augy augyVar6 = auhtVar.c;
            if (augyVar6 == null) {
                augyVar6 = augy.a;
            }
            ngnVar.c.d(ajokVar.a, auhtVar, augyVar6, atltVar);
            int d2 = d(ajokVar);
            ngnVar.e.postInvalidate();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ngnVar.g.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) ngnVar.f.getLayoutParams();
            Resources resources = ngnVar.e.getResources();
            if (d2 > 1) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
                layoutParams2.width = 0;
                layoutParams2.weight = d2 - 1;
            } else {
                layoutParams.width = (int) resources.getDimension(R.dimen.list_item_thumbnail_width);
                layoutParams.weight = 0.0f;
                layoutParams2.width = -2;
                layoutParams2.weight = 1.0f;
            }
            ngnVar.d.c(ngnVar.h, apmgVar, atltVar);
            this.k.addView(this.m.e);
            return;
        }
        if (this.n == null) {
            this.n = new ngi(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null, this.p, this.l, null, null, null, null, null);
        }
        ngi ngiVar = this.n;
        auhtVar.getClass();
        String str2 = auhtVar.i;
        augy augyVar7 = auhtVar.c;
        if (augyVar7 == null) {
            augyVar7 = augy.a;
        }
        augu[] auguVarArr2 = (augu[]) auhtVar.d.toArray(new augu[0]);
        aulq aulqVar3 = auhtVar.e;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        atlt atltVar2 = (atlt) ahbj.n(aulqVar3, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        if ((auhtVar.b & 8) != 0 && (aoxyVar = auhtVar.g) == null) {
            aoxyVar = aoxy.a;
        }
        ngiVar.d(ajokVar, auhtVar, str2, augyVar7, auguVarArr2, atltVar2, aoxyVar, auhtVar.h.I());
        this.k.addView(this.n.c);
    }
}
