package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.apps.youtube.app.extensions.reel.common.ReelToReelList;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import com.google.protos.youtube.api.innertube.ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mty extends ajpc implements ypd {
    public final Context a;
    public final ci b;
    public final ypa c;
    public final RecyclerView d;
    public final ajpd e;
    public final ajnb f;
    public final Map g = new HashMap();
    public final List h = new ArrayList();
    public int i;
    public int j;
    private final ajut k;
    private final ajuw l;
    private final gma m;
    private final hbb n;
    private final hai o;
    private final View p;
    private final View q;
    private final ImageButton r;
    private final View s;
    private final ajox t;
    private final aaea u;
    private aukn v;
    private final xzv x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [ajos, java.lang.Object] */
    public mty(Context context, ci ciVar, ajut ajutVar, ajuw ajuwVar, gma gmaVar, ajvb ajvbVar, ajoy ajoyVar, ypa ypaVar, xzv xzvVar, hbb hbbVar, aaea aaeaVar, byte[] bArr) {
        this.a = context;
        this.b = ciVar;
        this.k = ajutVar;
        this.l = ajuwVar;
        this.m = gmaVar;
        this.c = ypaVar;
        this.x = xzvVar;
        this.n = hbbVar;
        this.u = aaeaVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.reel_multiple_items_shelf, (ViewGroup) null);
        this.p = inflate;
        this.q = inflate.findViewById(R.id.reel_multiple_items_shelf_title_layout);
        this.s = inflate.findViewById(R.id.reel_shelf_contextual_menu_anchor);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.reel_multiple_items_view);
        this.d = recyclerView;
        recyclerView.af(new LinearLayoutManager(0));
        recyclerView.v(new zbn(recyclerView));
        this.r = (ImageButton) inflate.findViewById(R.id.reel_shelf_expand_button);
        ajpd ajpdVar = new ajpd();
        this.e = ajpdVar;
        ajnb ajnbVar = new ajnb(ajpdVar);
        this.f = ajnbVar;
        ajox a = ajoyVar.a(ajvbVar.get());
        this.t = a;
        a.h(ajnbVar);
        recyclerView.ac(a);
        hai haiVar = new hai();
        this.o = haiVar;
        a.rU(haiVar);
        gmaVar.c(inflate);
    }

    public static int g(aukn auknVar) {
        if (j(auknVar)) {
            return 2;
        }
        return k(auknVar) ? 3 : 4;
    }

    static boolean j(aukn auknVar) {
        return auknVar != null && (m(auknVar, 10) || m(auknVar, 11));
    }

    static boolean k(aukn auknVar) {
        if (auknVar == null) {
            return false;
        }
        if (m(auknVar, 9)) {
            return true;
        }
        return (auknVar.h.size() == 0 || !((aulq) auknVar.h.get(0)).pY(ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.reelShelfCreationRenderer) || (((ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer) ((aulq) auknVar.h.get(0)).pX(ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.reelShelfCreationRenderer)).b & 8) == 0) ? false : true;
    }

    private static boolean m(aukn auknVar, int i) {
        if (auknVar.h.size() != 0) {
            ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = ((aulq) auknVar.h.get(0)).pY(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) ? (ReelItemRendererOuterClass$ReelItemRenderer) ((aulq) auknVar.h.get(0)).pX(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) : null;
            if (reelItemRendererOuterClass$ReelItemRenderer != null) {
                int bk = anaf.bk(reelItemRendererOuterClass$ReelItemRenderer.r);
                if (bk == 0) {
                    bk = 1;
                }
                if (bk == i) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.m.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.clear();
        this.o.b();
        this.c.m(this);
        this.v = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cf  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(final defpackage.ajok r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mty.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aukn) obj).j.I();
    }

    public final void h() {
        ArrayList arrayList = new ArrayList();
        for (aulq aulqVar : this.v.h) {
            ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = aulqVar.pY(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) ? (ReelItemRendererOuterClass$ReelItemRenderer) aulqVar.pX(ReelItemRendererOuterClass$ReelItemRenderer.reelItemRenderer) : null;
            if (reelItemRendererOuterClass$ReelItemRenderer != null) {
                List list = this.h;
                aujt aujtVar = reelItemRendererOuterClass$ReelItemRenderer.s;
                if (aujtVar == null) {
                    aujtVar = aujt.a;
                }
                if (!list.contains(aujtVar)) {
                    apxf apxfVar = reelItemRendererOuterClass$ReelItemRenderer.m;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    if (apxfVar.pY(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                        apxf apxfVar2 = reelItemRendererOuterClass$ReelItemRenderer.m;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        arrayList.add(apxfVar2);
                    }
                }
            }
        }
        this.o.a = new ReelToReelList(Collections.unmodifiableList(arrayList));
    }

    @Override // defpackage.ajpc
    protected final boolean kC() {
        return evr.Q(this.u);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        int i2;
        if (i == -1) {
            return new Class[]{aacj.class, aaxb.class};
        }
        if (i == 0) {
            aacj aacjVar = (aacj) obj;
            if (!(aacjVar.b() instanceof ReelItemRendererOuterClass$ReelItemRenderer)) {
                return null;
            }
            ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer) aacjVar.b();
            if (!this.e.contains(reelItemRendererOuterClass$ReelItemRenderer)) {
                return null;
            }
            this.i = this.e.indexOf(reelItemRendererOuterClass$ReelItemRenderer);
            this.e.remove(reelItemRendererOuterClass$ReelItemRenderer);
            this.e.l();
            List list = this.h;
            aujt aujtVar = reelItemRendererOuterClass$ReelItemRenderer.s;
            if (aujtVar == null) {
                aujtVar = aujt.a;
            }
            list.add(aujtVar);
            h();
            return null;
        }
        if (i == 1) {
            aaxb aaxbVar = (aaxb) obj;
            if (!(aaxbVar.c() instanceof ReelItemRendererOuterClass$ReelItemRenderer)) {
                return null;
            }
            ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer2 = (ReelItemRendererOuterClass$ReelItemRenderer) aaxbVar.c();
            int size = this.e.size();
            if (this.e.contains(reelItemRendererOuterClass$ReelItemRenderer2) || (i2 = this.i) < 0 || i2 > size) {
                return null;
            }
            this.e.add(i2, reelItemRendererOuterClass$ReelItemRenderer2);
            this.e.l();
            List list2 = this.h;
            aujt aujtVar2 = reelItemRendererOuterClass$ReelItemRenderer2.s;
            if (aujtVar2 == null) {
                aujtVar2 = aujt.a;
            }
            if (!list2.contains(aujtVar2)) {
                return null;
            }
            List list3 = this.h;
            aujt aujtVar3 = reelItemRendererOuterClass$ReelItemRenderer2.s;
            if (aujtVar3 == null) {
                aujtVar3 = aujt.a;
            }
            list3.remove(aujtVar3);
            h();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajpc
    protected final boolean l() {
        return true;
    }
}
