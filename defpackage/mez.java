package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MultiItemCompanionAdRendererOuterClass;
import com.google.protos.youtube.api.innertube.ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mez implements wnb, wmy, wna {
    public static final LinearLayout.LayoutParams a = new LinearLayout.LayoutParams(0, -2, 1.0f);
    public static final LinearLayout.LayoutParams b = new LinearLayout.LayoutParams(-2, -2, 0.0f);
    public xbw c;
    public boolean d;
    public athe e;
    private final ajjz f;
    private final aahd g;
    private final acra h;
    private final Context i;
    private final met j;
    private final mev k;
    private final mer l;
    private final aabq m;
    private final View.OnClickListener n;
    private final ArrayList o = new ArrayList();
    private String p = "";
    private boolean q;
    private ViewGroup r;
    private ViewGroup s;
    private TextView t;
    private TextView u;
    private View v;
    private View w;
    private View x;
    private ImageView y;

    public mez(ajjz ajjzVar, aahd aahdVar, acra acraVar, Context context, wzq wzqVar, met metVar, mev mevVar, aabq aabqVar, mer merVar) {
        this.f = ajjzVar;
        this.g = aahdVar;
        this.h = acraVar;
        this.i = context;
        this.j = metVar;
        this.k = mevVar;
        new zau(context);
        this.m = aabqVar;
        this.l = merVar;
        this.n = new mex(this, wzqVar, aahdVar);
    }

    private final void b(View view) {
        if (view != null) {
            whu.z(view, R.id.multi_item_companion_card_stub, R.id.multi_item_companion_card).setVisibility(8);
        }
        ViewGroup viewGroup = this.r;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
            this.s.removeAllViews();
        }
        xbw xbwVar = this.c;
        if (xbwVar != null) {
            xbwVar.c();
        }
        athe atheVar = this.e;
        if (atheVar != null && (atheVar.b & 1024) != 0) {
            met metVar = this.j;
            aulq aulqVar = atheVar.n;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            metVar.b(ahbj.m(aulqVar));
        }
        this.k.b();
    }

    private final void c() {
        ViewGroup viewGroup = this.r;
        if (viewGroup == null || this.e == null) {
            return;
        }
        viewGroup.setVisibility(0);
    }

    @Override // defpackage.wmz
    public final void a() {
        c();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ae  */
    @Override // defpackage.wmz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r11, defpackage.ajok r12) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mez.d(android.view.View, ajok):void");
    }

    @Override // defpackage.wmz
    public final void e(View view) {
        this.d = false;
        b(view);
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mey meyVar = (mey) arrayList.get(i);
            meyVar.c.setVisibility(8);
            meyVar.e.setVisibility(8);
            meyVar.f.setVisibility(8);
        }
        this.e = null;
    }

    @Override // defpackage.wmz
    public final void f() {
        this.d = true;
        c();
    }

    @Override // defpackage.wmy
    public final boolean g(String str, PlayerResponseModel playerResponseModel, ashd ashdVar) {
        athe atheVar;
        this.p = str;
        this.e = null;
        aryr aryrVar = playerResponseModel.a;
        atyh atyhVar = aryrVar.A;
        if (atyhVar == null) {
            atyhVar = atyh.a;
        }
        if (atyhVar.b == 156112846) {
            atyh atyhVar2 = aryrVar.A;
            if (atyhVar2 == null) {
                atyhVar2 = atyh.a;
            }
            if (atyhVar2.b == 156112846) {
                atheVar = (athe) atyhVar2.c;
            } else {
                atheVar = athe.a;
            }
            this.e = atheVar;
        }
        return this.e != null;
    }

    @Override // defpackage.wmz
    public final void h(xad xadVar) {
        athe atheVar;
        aabq aabqVar;
        aabq aabqVar2 = this.m;
        if (aabqVar2 != null && this.q) {
            this.q = false;
            aabqVar2.b();
        }
        athe atheVar2 = this.e;
        if (atheVar2 != null && (atheVar2.b & 4) != 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.e);
            aahd aahdVar = this.g;
            apxf apxfVar = this.e.g;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, hashMap);
        }
        if (xadVar.a() == xce.USER_SKIPPED && (atheVar = this.e) != null) {
            apxf apxfVar2 = atheVar.d;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
            int bs = aobq.bs(((ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint) apxfVar2.pX(ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.shoppingDrawerEndpoint)).b);
            if (bs != 0 && bs == 2 && (aabqVar = this.m) != null) {
                aabqVar.b();
            }
        }
        this.d = false;
    }

    @Override // defpackage.wnb
    public final boolean i(String str, aqde aqdeVar, ashd ashdVar) {
        this.p = str;
        this.e = null;
        if ((aqdeVar.b & 16) == 0) {
            return false;
        }
        athe atheVar = aqdeVar.g;
        if (atheVar == null) {
            atheVar = athe.a;
        }
        this.e = atheVar;
        return true;
    }

    @Override // defpackage.wna
    public final boolean j(String str, aulq aulqVar) {
        this.p = str;
        if (aulqVar == null || !aulqVar.pY(MultiItemCompanionAdRendererOuterClass.multiItemCompanionAdRenderer)) {
            return false;
        }
        this.e = (athe) aulqVar.pX(MultiItemCompanionAdRendererOuterClass.multiItemCompanionAdRenderer);
        return true;
    }

    @Override // defpackage.wna
    public final boolean k(aulq aulqVar, boolean z) {
        if (!j(this.p, aulqVar)) {
            return false;
        }
        this.d = z;
        return true;
    }
}
