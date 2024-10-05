package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.view.View;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nst extends nop implements ajcv, fgp {
    public acsa d;
    private final nou e;
    private final Context f;
    private final ajcx g;
    private final aahd h;
    private final fgq i;
    private final nwy j;
    private final Executor k;
    private final View l;

    public nst(Context context, ajyw ajywVar, acqz acqzVar, aaea aaeaVar, ajcx ajcxVar, aahd aahdVar, fgq fgqVar, nwy nwyVar, Executor executor, byte[] bArr, byte[] bArr2) {
        super(acqzVar.mM(), aaeaVar);
        this.f = context;
        this.g = ajcxVar;
        this.h = aahdVar;
        this.j = nwyVar;
        this.i = fgqVar;
        this.k = executor;
        this.l = ((Activity) context).findViewById(R.id.next_gen_watch_layout);
        this.e = ajywVar.j(acqzVar.mM(), this.c, apbq.a);
    }

    public static /* synthetic */ void d(Throwable th) {
        String valueOf = String.valueOf(th.getMessage());
        afsi.b(1, 1, valueOf.length() != 0 ? "[InlineCustomTab]Could not launch custom tabs:".concat(valueOf) : new String("[InlineCustomTab]Could not launch custom tabs:"));
    }

    private final arho e() {
        aqts aqtsVar = this.b;
        if (aqtsVar == null || (aqtsVar.c & 4194304) == 0) {
            return null;
        }
        aulq aulqVar = aqtsVar.y;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return (arho) aulqVar.pX(arhp.a);
    }

    @Override // defpackage.nqg
    public final void B() {
    }

    @Override // defpackage.nqg
    public final void C() {
        this.f.startActivity(fav.e(this.f));
    }

    @Override // defpackage.nqg
    public final void D(apxf apxfVar) {
        this.i.i(this);
    }

    @Override // defpackage.nqg
    public final void F(nqd nqdVar) {
    }

    @Override // defpackage.nqg
    public final nqb b() {
        return this.e;
    }

    public final void c() {
        aqts aqtsVar = this.b;
        if (aqtsVar == null) {
            afsi.b(1, 1, "[InlineCustomTab]Attempted to close without a model");
            return;
        }
        String str = aqtsVar.d == 1 ? (String) aqtsVar.e : "";
        aong aongVar = (aong) apxf.a.createBuilder();
        aonk aonkVar = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint;
        aone createBuilder = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a.createBuilder();
        createBuilder.copyOnWrite();
        HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.instance;
        str.getClass();
        hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
        hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = str;
        aongVar.e(aonkVar, (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.build());
        this.h.a((apxf) aongVar.build());
    }

    @Override // defpackage.nqg
    public final void n() {
        this.i.j(this);
    }

    @Override // defpackage.nqg
    public final void o(apxf apxfVar) {
    }

    @Override // defpackage.nqg
    public final View oO() {
        return new View(this.f);
    }

    @Override // defpackage.nqg
    public final void oP(ajol ajolVar) {
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (fhgVar != fhg.WATCH_WHILE_MAXIMIZED) {
            c();
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.nop, defpackage.nqg
    public final void p() {
        arho e = e();
        if (e == null) {
            afsi.b(1, 1, "[InlineCustomTab]Attempted to open a null Inline Custom Tabs Renderer.");
            c();
            return;
        }
        if ((e.b & 1) != 0) {
            Uri parse = Uri.parse(e.c);
            ajcx ajcxVar = this.g;
            Context context = this.f;
            Rect rect = new Rect();
            this.l.getRootView().getGlobalVisibleRect(rect);
            Rect rect2 = new Rect();
            this.l.getGlobalVisibleRect(rect2);
            ynm.j(ajcxVar.b((Activity) context, parse, rect.bottom - (rect2.top + this.j.b().top), this), this.k, lra.g);
            return;
        }
        afsi.b(1, 1, "[InlineCustomTab]Attempted to open a Custom Tabs Renderer without a URL.");
        c();
    }

    @Override // defpackage.nop, defpackage.nqg
    public final void q(aqts aqtsVar, asht ashtVar) {
        super.q(aqtsVar, ashtVar);
        arho e = e();
        if (e == null) {
            return;
        }
        this.d = new acqx(e.d);
    }

    @Override // defpackage.nop, defpackage.nqg
    public final boolean t() {
        return true;
    }
}
