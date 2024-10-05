package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mky extends ajpc {
    public final Context a;
    public final ajut b;
    public final ajrv c;
    public final ajyg d;
    public final gni e;
    private final ViewGroup f;
    private final ajjz g;
    private mkx h;
    private mkx i;
    private final int j;

    public mky(Context context, fzb fzbVar, ajut ajutVar, ajrv ajrvVar, ajyg ajygVar, ajjz ajjzVar, gni gniVar) {
        this.a = context;
        this.b = ajutVar;
        this.f = new FrameLayout(context);
        this.c = ajrvVar;
        this.d = ajygVar;
        this.g = ajjzVar;
        this.e = gniVar;
        this.j = fzbVar.c();
    }

    public static int f(Context context) {
        return context.getResources().getConfiguration().smallestScreenWidthDp >= 600 ? R.dimen.background_promo_default_padding_sw600dp : (context.getResources().getConfiguration().orientation != 2 || context.getResources().getConfiguration().screenWidthDp < 480) ? R.dimen.background_promo_default_padding : R.dimen.background_promo_default_padding_w480dp_land;
    }

    private static View g(apib apibVar, Context context) {
        apic apicVar = apibVar.j;
        if (apicVar == null) {
            apicVar = apic.a;
        }
        int h = h(apicVar);
        if (h == 4) {
            View inflate = View.inflate(context, R.layout.background_promo_zero_state, null);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(f(context));
            inflate.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            return inflate;
        }
        if (h == 5) {
            View inflate2 = View.inflate(context, R.layout.background_promo_empty_state, null);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(f(context));
            inflate2.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
            return inflate2;
        }
        if (context.getResources().getConfiguration().orientation == 2) {
            if (context.getResources().getConfiguration().smallestScreenWidthDp >= 600) {
                return View.inflate(context, R.layout.background_promo_sw600dp_land, null);
            }
            if (context.getResources().getConfiguration().screenWidthDp >= 480) {
                return View.inflate(context, R.layout.background_promo_w480dp_land, null);
            }
        }
        View inflate3 = View.inflate(context, R.layout.background_promo, null);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(f(context));
        inflate3.setPadding(dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
        return inflate3;
    }

    private static int h(apic apicVar) {
        int aS;
        if (apicVar == null || (aS = anaf.aS(apicVar.c)) == 0) {
            return 1;
        }
        return aS;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.f;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        mkx mkxVar = this.h;
        if (mkxVar != null) {
            mkxVar.a();
        }
        mkx mkxVar2 = this.i;
        if (mkxVar2 != null) {
            mkxVar2.a();
        }
        this.h = null;
        this.i = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00d3  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajok r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mky.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apib) obj).k.I();
    }
}
