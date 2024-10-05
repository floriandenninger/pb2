package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.common.ui.OverScrollLinearLayoutManager;
import com.google.android.apps.youtube.app.common.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class igf implements ajxa, ifu, igo, akdd {
    public final LoadingFrameLayout a;
    public final gna b;
    public final acqz c;
    public final nyl d;
    public final zaw e;
    public final ajwi f;
    public InteractionLoggingScreen g;
    public xpa h;
    private final CoordinatorLayout i;
    private final aaue j;
    private final Executor k;
    private final igp l;
    private apxf m;

    /* JADX WARN: Type inference failed for: r11v1, types: [ajos, java.lang.Object] */
    public igf(Context context, ypa ypaVar, acqz acqzVar, zaw zawVar, final aaue aaueVar, ajvb ajvbVar, final oiy oiyVar, final abie abieVar, ajoy ajoyVar, gni gniVar, final yaq yaqVar, final yap yapVar, final igp igpVar, Executor executor, aaea aaeaVar, aypn aypnVar, byte[] bArr, byte[] bArr2) {
        int color;
        this.c = acqzVar;
        this.j = aaueVar;
        this.k = executor;
        this.l = igpVar;
        this.e = zawVar;
        final acra mM = acqzVar.mM();
        final byte[] bArr3 = null;
        final byte[] bArr4 = null;
        ajvd ajvdVar = new ajvd(abieVar, aaueVar, mM, yaqVar, yapVar, igpVar, oiyVar, bArr3, bArr4) { // from class: ige
            public final /* synthetic */ aaue b;
            public final /* synthetic */ acra c;
            public final /* synthetic */ yap d;
            public final /* synthetic */ igp e;
            public final /* synthetic */ abie f;
            public final /* synthetic */ yaq g;
            public final /* synthetic */ oiy h;

            @Override // defpackage.ajvd
            public final ajvc a(Object obj, ajxe ajxeVar, ajwx ajwxVar) {
                igf igfVar = igf.this;
                abie abieVar2 = this.f;
                aaue aaueVar2 = this.b;
                acra acraVar = this.c;
                yaq yaqVar2 = this.g;
                yap yapVar2 = this.d;
                final igp igpVar2 = this.e;
                oiy oiyVar2 = this.h;
                if (obj instanceof apzx) {
                    xoy b = abieVar2.b((apzx) obj, aaueVar2, acraVar, yaqVar2, yapVar2);
                    b.b = new xow() { // from class: igb
                        @Override // defpackage.xow
                        public final void a() {
                            igp.this.a();
                        }
                    };
                    b.i(igfVar.h);
                    return b;
                }
                if (!(obj instanceof aalz)) {
                    return null;
                }
                npk b2 = oiyVar2.b(aaueVar2, acraVar);
                b2.i((aalz) obj);
                return b2;
            }
        };
        View inflate = LayoutInflater.from(context).inflate(R.layout.reel_comment_view, (ViewGroup) null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate.findViewById(R.id.reel_comment_coordinator_layout);
        this.i = coordinatorLayout;
        if (gniVar.a() == gng.DARK) {
            color = context.getResources().getColor(R.color.yt_black1);
        } else {
            color = context.getResources().getColor(R.color.yt_white1);
        }
        coordinatorLayout.setBackgroundColor(color);
        igpVar.e = LayoutInflater.from(igpVar.c).inflate(R.layout.reel_engagement_sheet_header, (ViewGroup) null, false);
        igpVar.f = (TextView) igpVar.e.findViewById(R.id.title);
        igpVar.e.findViewById(R.id.reel_engagement_sheet_close_button).setOnClickListener(new View.OnClickListener() { // from class: igl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                igp.this.a();
            }
        });
        igpVar.e.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: igm
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                igp igpVar2 = igp.this;
                if (igpVar2.l != null) {
                    int height = igpVar2.g - view.getHeight();
                    igpVar2.i = height;
                    yny.z(((igf) igpVar2.l).a, yny.n(height), ViewGroup.LayoutParams.class);
                }
            }
        });
        igpVar.k = new CoordinatorLayout(igpVar.c);
        LinearLayout linearLayout = new LinearLayout(igpVar.c);
        linearLayout.setOrientation(1);
        linearLayout.addView(igpVar.e);
        linearLayout.addView(coordinatorLayout);
        igpVar.k.addView(linearLayout);
        igpVar.b.ae = this;
        igpVar.l = this;
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) inflate.findViewById(R.id.reel_comment_loading_preview);
        this.a = loadingFrameLayout;
        loadingFrameLayout.f(this);
        yny.z(loadingFrameLayout, yny.n(igpVar.i), ViewGroup.LayoutParams.class);
        yny.z(loadingFrameLayout, yny.x(igpVar.h), ViewGroup.LayoutParams.class);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.reel_comments);
        OverScrollLinearLayoutManager overScrollLinearLayoutManager = new OverScrollLinearLayoutManager(null);
        overScrollLinearLayoutManager.ab(1);
        recyclerView.af(overScrollLinearLayoutManager);
        nyl nylVar = new nyl();
        this.d = nylVar;
        nylVar.A(acqzVar.mM());
        ajwi ajwiVar = new ajwi(null, recyclerView, ajoyVar, new ajvq(), aaueVar, ypaVar, ajvdVar, zawVar, nylVar, ajvbVar.get(), this, ajwk.d, aaeaVar, aypnVar);
        this.b = new gna((StickyHeaderContainer) inflate.findViewById(R.id.sticky_header_container), (vw) ajwiVar.g, new iga(ajwiVar.f));
        this.f = ajwiVar;
    }

    public final void b(apxf apxfVar, xpa xpaVar, boolean z) {
        acsc b;
        c();
        this.m = apxfVar;
        this.h = xpaVar;
        byte[] bo = evr.bo(apxfVar);
        aauc f = this.j.f();
        f.m(bo);
        ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand = apxfVar != null ? (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) apxfVar.pX(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand) : null;
        if (showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand != null) {
            f.d(showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.c);
            f.v(showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.e);
            igp igpVar = this.l;
            aqyg aqygVar = showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            Spanned b2 = ajcq.b(aqygVar);
            igpVar.j = b2;
            TextView textView = igpVar.f;
            if (textView != null) {
                textView.setText(b2);
                igpVar.f.setVisibility(b2 != null ? 0 : 8);
                String charSequence = igpVar.j.toString();
                View view = igpVar.e;
                if (view != null) {
                    view.setContentDescription(charSequence);
                }
            }
            final igp igpVar2 = this.l;
            if (!igpVar2.b.ar() && igpVar2.d == null && igpVar2.k != null) {
                igpVar2.d = igpVar2.a.getSupportFragmentManager().k();
                igpVar2.d.v(new Runnable() { // from class: ign
                    @Override // java.lang.Runnable
                    public final void run() {
                        igp.this.d = null;
                    }
                });
                igpVar2.b.aI(igpVar2.d, igpVar2.k, "REEL_COMMENT_REPLIES_VIEW_TAG");
            }
            this.g = this.d.c();
            nyl nylVar = this.d;
            if (apxfVar == null) {
                b = acsb.b(32276);
            } else {
                int i = ((ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand) apxfVar.pX(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.showCommentRepliesEngagementPanelCommand)).h;
                if (i == 0) {
                    b = acsb.b(32276);
                } else {
                    b = acsb.b(i);
                }
            }
            nylVar.G(b, acrs.OVERLAY, apxfVar);
            this.a.c();
            if (z || showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.f) {
                f.s(2);
            }
        } else {
            zga.b("ReelCommentRepliesController: cannot load navigation endpoint.");
        }
        ynm.k(this.j.h(f, this.k), angq.a, new ynk() { // from class: igc
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                igf igfVar = igf.this;
                zfl a = igfVar.e.a(th);
                igfVar.a.b(a.a, true);
                igfVar.d.A(igfVar.c.mM());
                nyl nylVar2 = igfVar.d;
                String str = a.b;
                if (nylVar2.c() != null) {
                    nylVar2.c().c();
                    int i2 = nylVar2.c().f;
                    aone createBuilder = asht.a.createBuilder();
                    aone createBuilder2 = ashm.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    ashm ashmVar = (ashm) createBuilder2.instance;
                    str.getClass();
                    ashmVar.b = 1 | ashmVar.b;
                    ashmVar.c = str;
                    createBuilder2.copyOnWrite();
                    ashm ashmVar2 = (ashm) createBuilder2.instance;
                    ashmVar2.b |= 2;
                    ashmVar2.d = i2;
                    createBuilder.copyOnWrite();
                    asht ashtVar = (asht) createBuilder.instance;
                    ashm ashmVar3 = (ashm) createBuilder2.build();
                    ashmVar3.getClass();
                    ashtVar.l = ashmVar3;
                    ashtVar.b |= 16384;
                    asht ashtVar2 = (asht) createBuilder.build();
                    awav i3 = nylVar2.i(new Object(), acsb.c(22811));
                    nylVar2.D(adyu.ce(i3));
                    nylVar2.u(adyu.ce(i3), ashtVar2);
                }
            }
        }, new ynl() { // from class: igd
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                igf igfVar = igf.this;
                BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
                if (!browseResponseModel.j()) {
                    amru g = browseResponseModel.g();
                    if (!g.isEmpty()) {
                        auov auovVar = ((aame) g.get(0)).a().a;
                        igfVar.d.A(igfVar.c.mM());
                        igfVar.f.h();
                        igfVar.b.c();
                        igfVar.f.M(new aamd(auovVar));
                        igfVar.a.a();
                    }
                }
                igfVar.d.D(new acqx(browseResponseModel.d()));
            }
        });
    }

    public final void c() {
        this.f.h();
        this.b.c();
        this.a.c();
    }

    @Override // defpackage.ajxa
    public final void lo() {
    }

    @Override // defpackage.ajxa
    public final boolean lp() {
        return false;
    }

    @Override // defpackage.akdd
    public final void qJ() {
        b(this.m, this.h, true);
    }
}
