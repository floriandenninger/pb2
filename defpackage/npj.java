package defpackage;

import android.content.Context;
import android.view.View;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class npj extends nop implements ajxa, xox {
    private final aaea A;
    private final aypn B;
    private final etv C;
    private Cfor D;
    private nrx E;
    private View F;
    private boolean G;
    private boolean H;
    private Set I;

    /* renamed from: J, reason: collision with root package name */
    private final aadw f243J;
    private final ajoy K;
    public final zaw d;
    public final aahd e;
    public final zbi f;
    public LoadingFrameLayout g;
    public SwipeRefreshLayout h;
    ajwi i;
    public nqa j;
    public apxf k;
    public nqc l;
    public xpa m;
    public final yap n;
    public final abie o;
    public final yaq p;
    public final oiy q;
    public final ajyw r;
    private final Context s;
    private final aaue t;
    private final ypa v;
    private final ajoy w;
    private final ajvb x;
    private final Executor y;
    private final azrw z;

    public npj(Context context, aaue aaueVar, zaw zawVar, ypa ypaVar, ajoy ajoyVar, ajvb ajvbVar, oiy oiyVar, Executor executor, acra acraVar, aahd aahdVar, ajoy ajoyVar2, zbi zbiVar, abie abieVar, azrw azrwVar, yaq yaqVar, yap yapVar, aaea aaeaVar, aypn aypnVar, ajyw ajywVar, etv etvVar, aadw aadwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(acraVar, aaeaVar);
        this.s = context;
        this.t = aaueVar;
        this.d = zawVar;
        this.v = ypaVar;
        this.w = ajoyVar;
        this.x = ajvbVar;
        this.q = oiyVar;
        this.y = executor;
        this.e = aahdVar;
        this.K = ajoyVar2;
        this.f = zbiVar;
        this.o = abieVar;
        this.z = azrwVar;
        this.p = yaqVar;
        this.n = yapVar;
        this.A = aaeaVar;
        this.B = aypnVar;
        this.r = ajywVar;
        this.C = etvVar;
        this.f243J = aadwVar;
    }

    public static final boolean H(apxf apxfVar) {
        if (apxfVar == null) {
            return false;
        }
        return K(apxfVar).h() || J(apxfVar).h();
    }

    public static final apxf I(apxf apxfVar, boolean z) {
        ammv ammvVar;
        if (!H(apxfVar)) {
            return null;
        }
        ammv K = K(apxfVar);
        if (!K.h()) {
            if (apxfVar.pY(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
                ammvVar = ammv.i((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apxfVar.pX(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint));
            } else {
                ammvVar = amlr.a;
            }
            ammv J2 = J(apxfVar);
            if (!ammvVar.h() || !J2.h()) {
                return null;
            }
            autu autuVar = ((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) ammvVar.c()).l;
            if (autuVar == null) {
                autuVar = autu.a;
            }
            aone builder = autuVar.toBuilder();
            aone builder2 = ((apyz) J2.c()).toBuilder();
            builder2.copyOnWrite();
            apyz apyzVar = (apyz) builder2.instance;
            apyzVar.b |= 8;
            apyzVar.f = z;
            apyz apyzVar2 = (apyz) builder2.build();
            builder.copyOnWrite();
            autu autuVar2 = (autu) builder.instance;
            apyzVar2.getClass();
            autuVar2.c = apyzVar2;
            autuVar2.b = 2;
            autu autuVar3 = (autu) builder.build();
            aone builder3 = ((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) ammvVar.c()).toBuilder();
            builder3.copyOnWrite();
            ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) builder3.instance;
            autuVar3.getClass();
            showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.l = autuVar3;
            showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.b |= 1024;
            ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2 = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) builder3.build();
            aong aongVar = (aong) apxfVar.toBuilder();
            aongVar.e(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint, showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2);
            return (apxf) aongVar.build();
        }
        aone builder4 = ((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) K.c()).toBuilder();
        builder4.copyOnWrite();
        ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand = (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) builder4.instance;
        showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.b |= 8;
        showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.f = z;
        ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand2 = (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) builder4.build();
        aong aongVar2 = (aong) apxfVar.toBuilder();
        aongVar2.e(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand, showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand2);
        return (apxf) aongVar2.build();
    }

    private static ammv J(apxf apxfVar) {
        apyz apyzVar;
        if (apxfVar.pY(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint)) {
            ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apxfVar.pX(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint);
            autu autuVar = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.l;
            if (autuVar == null) {
                autuVar = autu.a;
            }
            if (autuVar.b == 2) {
                autu autuVar2 = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.l;
                if (autuVar2 == null) {
                    autuVar2 = autu.a;
                }
                if (autuVar2.b == 2) {
                    apyzVar = (apyz) autuVar2.c;
                } else {
                    apyzVar = apyz.a;
                }
                return ammv.j(apyzVar);
            }
        }
        return amlr.a;
    }

    private static ammv K(apxf apxfVar) {
        return apxfVar.pY(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand) ? ammv.i((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) apxfVar.pX(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand)) : amlr.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
    
        if (r5 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(boolean r5) {
        /*
            r4 = this;
            r4.E()
            r0 = 1
            r4.G = r0
            apxf r0 = r4.k
            byte[] r0 = defpackage.evr.bo(r0)
            aaue r1 = r4.t
            aauc r1 = r1.f()
            r1.m(r0)
            apxf r0 = r4.k
            boolean r0 = H(r0)
            if (r0 == 0) goto L8c
            apxf r0 = r4.k
            java.lang.String r0 = d(r0)
            r1.d(r0)
            apxf r0 = r4.k
            ammv r2 = K(r0)
            boolean r3 = r2.h()
            if (r3 == 0) goto L3b
            java.lang.Object r0 = r2.c()
            com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand r0 = (com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) r0
            java.lang.String r0 = r0.e
            goto L50
        L3b:
            ammv r0 = J(r0)
            boolean r2 = r0.h()
            if (r2 == 0) goto L4e
            java.lang.Object r0 = r0.c()
            apyz r0 = (defpackage.apyz) r0
            java.lang.String r0 = r0.e
            goto L50
        L4e:
            java.lang.String r0 = ""
        L50:
            r1.v(r0)
            if (r5 != 0) goto L7e
            apxf r5 = r4.k
            ammv r0 = K(r5)
            boolean r2 = r0.h()
            if (r2 == 0) goto L6a
            java.lang.Object r5 = r0.c()
            com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand r5 = (com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) r5
            boolean r5 = r5.f
            goto L7c
        L6a:
            ammv r5 = J(r5)
            boolean r0 = r5.h()
            if (r0 == 0) goto L91
            java.lang.Object r5 = r5.c()
            apyz r5 = (defpackage.apyz) r5
            boolean r5 = r5.f
        L7c:
            if (r5 == 0) goto L91
        L7e:
            r5 = 2
            r1.s(r5)
            apxf r5 = r4.k
            r0 = 0
            apxf r5 = I(r5, r0)
            r4.k = r5
            goto L91
        L8c:
            java.lang.String r5 = "CommentRepliesEngagementPanel: cannot load navigation endpoint."
            defpackage.zga.b(r5)
        L91:
            aaue r5 = r4.t
            java.util.concurrent.Executor r0 = r4.y
            anhy r5 = r5.h(r1, r0)
            angq r0 = defpackage.angq.a
            npc r1 = new npc
            r1.<init>()
            npd r2 = new npd
            r2.<init>()
            defpackage.ynm.k(r5, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npj.L(boolean):void");
    }

    public static String d(apxf apxfVar) {
        ammv K = K(apxfVar);
        if (!K.h() || (((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) K.c()).b & 1) == 0) {
            ammv J2 = J(apxfVar);
            return (!J2.h() || (((apyz) J2.c()).b & 1) == 0) ? "" : ((apyz) J2.c()).c;
        }
        return ((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) K.c()).c;
    }

    public static void h(acra acraVar, String str) {
        InteractionLoggingScreen c = acraVar.c();
        if (c == null) {
            return;
        }
        int i = c.f;
        aone createBuilder = asht.a.createBuilder();
        aone createBuilder2 = ashm.a.createBuilder();
        createBuilder2.copyOnWrite();
        ashm ashmVar = (ashm) createBuilder2.instance;
        str.getClass();
        ashmVar.b |= 1;
        ashmVar.c = str;
        createBuilder2.copyOnWrite();
        ashm ashmVar2 = (ashm) createBuilder2.instance;
        ashmVar2.b |= 2;
        ashmVar2.d = i;
        createBuilder.copyOnWrite();
        asht ashtVar = (asht) createBuilder.instance;
        ashm ashmVar3 = (ashm) createBuilder2.build();
        ashmVar3.getClass();
        ashtVar.l = ashmVar3;
        ashtVar.b |= 16384;
        asht ashtVar2 = (asht) createBuilder.build();
        awav i2 = acraVar.i(new Object(), acsb.c(22811));
        acraVar.D(adyu.ce(i2));
        acraVar.u(adyu.ce(i2), ashtVar2);
    }

    @Override // defpackage.nqg
    public final void B() {
        E();
        nqa nqaVar = this.j;
        if (nqaVar != null) {
            nqaVar.oT();
        }
        apxs apxsVar = this.f243J.b().z;
        if (apxsVar == null) {
            apxsVar = apxs.a;
        }
        if (apxsVar.h) {
            this.C.a();
        }
    }

    @Override // defpackage.nqg
    public final void C() {
        this.a.t();
        nqa nqaVar = this.j;
        if (nqaVar != null) {
            nqaVar.d();
        }
    }

    @Override // defpackage.nqg
    public final void D(apxf apxfVar) {
        i();
        this.H = false;
        if (!this.G) {
            L(false);
        }
        nqa nqaVar = this.j;
        if (nqaVar != null) {
            ((npz) nqaVar).f();
        }
    }

    public final void E() {
        this.G = false;
        this.g.c();
        Cfor cfor = this.D;
        if (cfor != null) {
            cfor.b();
        }
    }

    @Override // defpackage.nqg
    public final void F(nqd nqdVar) {
    }

    @Override // defpackage.nqg
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final nrx b() {
        nrx nrxVar = this.E;
        if (nrxVar != null) {
            return nrxVar;
        }
        nrx nrxVar2 = (nrx) this.z.get();
        this.E = nrxVar2;
        nrxVar2.h = this.a;
        return nrxVar2;
    }

    @Override // defpackage.ajxa
    public final void lo() {
        ajwi ajwiVar = this.i;
        if (ajwiVar != null) {
            ajwiVar.h();
        }
        this.D.c(1);
        if (this.g != null) {
            this.y.execute(new npe(this));
        }
    }

    @Override // defpackage.ajxa
    public final boolean lp() {
        return true;
    }

    @Override // defpackage.nop, defpackage.nqg
    public final void m() {
        View view = this.F;
        if (view == null || !zev.e(view.getContext())) {
            return;
        }
        this.F.sendAccessibilityEvent(8);
    }

    @Override // defpackage.nqg
    public final void n() {
        ammv ammvVar;
        this.a.t();
        nqa nqaVar = this.j;
        if (nqaVar != null) {
            ((npz) nqaVar).d();
        }
        apxf apxfVar = this.k;
        ammv K = K(apxfVar);
        if (!K.h() || (((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) K.c()).b & 128) == 0) {
            ammv J2 = J(apxfVar);
            if (!J2.h() || (((apyz) J2.c()).b & 64) == 0) {
                ammvVar = amlr.a;
            } else {
                apxf apxfVar2 = ((apyz) J2.c()).i;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                ammvVar = ammv.j(apxfVar2);
            }
        } else {
            apxf apxfVar3 = ((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) K.c()).j;
            if (apxfVar3 == null) {
                apxfVar3 = apxf.a;
            }
            ammvVar = ammv.j(apxfVar3);
        }
        if (ammvVar.h()) {
            this.e.a((apxf) ammvVar.c());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [ajos, java.lang.Object] */
    @Override // defpackage.nqg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(defpackage.apxf r18) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.npj.o(apxf):void");
    }

    @Override // defpackage.nqg
    public final View oO() {
        return this.g;
    }

    @Override // defpackage.nqg
    public final void oP(ajol ajolVar) {
        ajwi ajwiVar = this.i;
        if (ajwiVar != null) {
            ajwiVar.u(ajolVar);
            return;
        }
        if (this.I == null) {
            this.I = new HashSet();
        }
        this.I.add(ajolVar);
    }

    public final void i() {
        int i;
        if (!this.H) {
            this.H = true;
            return;
        }
        acra acraVar = this.a;
        apxf apxfVar = this.k;
        int i2 = 32276;
        if (apxfVar != null) {
            ammv K = K(apxfVar);
            if (K.h()) {
                i = ((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) K.c()).h;
            } else {
                ammv J2 = J(apxfVar);
                i = J2.h() ? ((apyz) J2.c()).h : 0;
            }
            if (i != 0) {
                i2 = i;
            }
        }
        acraVar.G(acsb.b(i2), acrs.OVERLAY, this.k);
    }
}
