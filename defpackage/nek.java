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
public final class nek implements ajom {
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
    private nej m;
    private ndy n;
    private boolean o;
    private final ajyw p;

    /* JADX INFO: Access modifiers changed from: protected */
    public nek(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajuw ajuwVar, wyz wyzVar, tdv tdvVar, wzq wzqVar, euv euvVar, ypa ypaVar, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
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
        apmg apmgVar;
        apxf apxfVar;
        auhi auhiVar = (auhi) obj;
        int d = d(ajokVar);
        this.k.removeAllViews();
        boolean z = d > 1 || !auhiVar.f;
        this.o = z;
        aoxy aoxyVar = null;
        if (z) {
            if (this.m == null) {
                this.m = new nej(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.p, this.l, null, null, null, null, null);
            }
            nej nejVar = this.m;
            auhiVar.getClass();
            nejVar.h = ajokVar.a;
            augz augzVar = auhiVar.c;
            if (augzVar == null) {
                augzVar = augz.a;
            }
            aulq aulqVar = augzVar.s;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                augz augzVar2 = auhiVar.c;
                if (augzVar2 == null) {
                    augzVar2 = augz.a;
                }
                aulq aulqVar2 = augzVar2.s;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
            } else {
                apmgVar = null;
            }
            aulq aulqVar3 = auhiVar.e;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            atlt atltVar = (atlt) ahbj.n(aulqVar3, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
            ncd ncdVar = nejVar.a;
            augz augzVar3 = auhiVar.c;
            if (augzVar3 == null) {
                augzVar3 = augz.a;
            }
            if ((augzVar3.b & 32768) != 0) {
                augz augzVar4 = auhiVar.c;
                if (augzVar4 == null) {
                    augzVar4 = augz.a;
                }
                apxfVar = augzVar4.q;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            } else {
                apxfVar = null;
            }
            augz augzVar5 = auhiVar.c;
            if (augzVar5 == null) {
                augzVar5 = augz.a;
            }
            ncdVar.a(apxfVar, augzVar5.v);
            nhb nhbVar = nejVar.b;
            acra acraVar = ajokVar.a;
            String str = auhiVar.i;
            augz augzVar6 = auhiVar.c;
            if (augzVar6 == null) {
                augzVar6 = augz.a;
            }
            augu[] auguVarArr = (augu[]) auhiVar.d.toArray(new augu[0]);
            if ((auhiVar.b & 8) != 0 && (aoxyVar = auhiVar.g) == null) {
                aoxyVar = aoxy.a;
            }
            nhbVar.G(acraVar, auhiVar, str, augzVar6, auguVarArr, aoxyVar, auhiVar.h.I());
            augz augzVar7 = auhiVar.c;
            if (augzVar7 == null) {
                augzVar7 = augz.a;
            }
            nejVar.c.v(nejVar.h, auhiVar, augzVar7, atltVar);
            int d2 = d(ajokVar);
            nejVar.e.postInvalidate();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) nejVar.g.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) nejVar.f.getLayoutParams();
            Resources resources = nejVar.e.getResources();
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
            nejVar.d.c(nejVar.h, apmgVar, atltVar);
            this.k.addView(this.m.e);
            return;
        }
        if (this.n == null) {
            this.n = new ndy(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null, this.p, this.l, null, null, null, null, null);
        }
        ndy ndyVar = this.n;
        auhiVar.getClass();
        String str2 = auhiVar.i;
        augz augzVar8 = auhiVar.c;
        if (augzVar8 == null) {
            augzVar8 = augz.a;
        }
        augu[] auguVarArr2 = (augu[]) auhiVar.d.toArray(new augu[0]);
        aulq aulqVar4 = auhiVar.e;
        if (aulqVar4 == null) {
            aulqVar4 = aulq.a;
        }
        atlt atltVar2 = (atlt) ahbj.n(aulqVar4, MutedSparklesRendererOuterClass.mutedSparklesRenderer);
        if ((auhiVar.b & 8) != 0 && (aoxyVar = auhiVar.g) == null) {
            aoxyVar = aoxy.a;
        }
        ndyVar.d(ajokVar, auhiVar, str2, augzVar8, auguVarArr2, atltVar2, aoxyVar, auhiVar.h.I());
        this.k.addView(this.n.c);
    }
}
