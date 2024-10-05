package defpackage;

import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.apps.youtube.app.player.controls.ListenFirstMenuItemController;
import com.google.android.apps.youtube.app.player.controls.MusicDeeplinkMenuItemController;
import com.google.android.apps.youtube.app.player.controls.SingleLoopMenuItemController;
import com.google.android.apps.youtube.app.watch.bottomsheet.PlayerOverflowBottomSheetController;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nnz extends nns implements AdapterView.OnItemClickListener, ajdg, aioa, ypd {
    private static final ammy aE = mjw.i;
    public nob aA;
    public akpq aB;
    public c aC;
    private final ayqw aF = new ayqw();
    private List aG = Collections.emptyList();
    private List aH;
    private String aI;
    private ajnb aJ;
    public ypa ae;
    public ainy af;
    public ajut ag;
    public keo ah;
    public kfw ai;
    public ker aj;
    public ListenFirstMenuItemController ak;
    public kfn al;
    public kek am;
    public kfy an;
    public kex ao;
    public kfc ap;
    public SingleLoopMenuItemController aq;
    public ajdh ar;
    public aioc as;
    public gvv at;
    public MusicDeeplinkMenuItemController au;
    public acra av;
    public Set aw;
    acsa ax;
    ajnp ay;
    public aadw az;

    private final void aO(PlayerResponseModel playerResponseModel) {
        if (playerResponseModel == null) {
            return;
        }
        arys arysVar = playerResponseModel.a.f111J;
        if (arysVar == null) {
            arysVar = arys.a;
        }
        acqx a = acqx.a(arysVar);
        acsa acsaVar = this.ax;
        if (a != acsaVar) {
            if (acsaVar != null) {
                this.av.q(acsaVar, null);
            }
            this.ax = a;
            if (a != null) {
                this.av.D(a);
                this.av.u(this.ax, null);
                this.at.a();
            }
        }
    }

    @Override // defpackage.uyt
    protected final /* synthetic */ ListAdapter aH() {
        Object obj;
        ajpd ajpdVar = new ajpd();
        List<atda> list = this.aH;
        if (list != null) {
            for (atda atdaVar : list) {
                atdb atdbVar = atdaVar.c;
                if (atdbVar == null) {
                    atdbVar = atdb.a;
                }
                if ((atdbVar.b & 2) != 0) {
                    atdb atdbVar2 = atdaVar.c;
                    if (atdbVar2 == null) {
                        atdbVar2 = atdb.a;
                    }
                    arfs arfsVar = atdbVar2.d;
                    if (arfsVar == null) {
                        arfsVar = arfs.a;
                    }
                    arfr b = arfr.b(arfsVar.c);
                    if (b == null) {
                        b = arfr.UNKNOWN;
                    }
                    if (b != arfr.OUTLINE_YOUTUBE_MUSIC) {
                    }
                }
                if ((atdaVar.b & 8192) != 0) {
                    aqrf aqrfVar = atdaVar.p;
                    if (aqrfVar == null) {
                        aqrfVar = aqrf.a;
                    }
                    akpq akpqVar = this.aB;
                    acra acraVar = this.av;
                    axpg axpgVar = ((axqv) akpqVar.a).get();
                    axpgVar.getClass();
                    ajdw ajdwVar = (ajdw) akpqVar.b.get();
                    ajdwVar.getClass();
                    acraVar.getClass();
                    aqrfVar.getClass();
                    obj = new ajxs(axpgVar, ajdwVar, acraVar, aqrfVar);
                } else {
                    ajxu ajxuVar = new ajxu(adyu.m0do(atdaVar).toString(), atdaVar);
                    obj = ajxuVar;
                    if (adyu.dm(atdaVar) != null) {
                        ajut ajutVar = this.ag;
                        arfr b2 = arfr.b(adyu.dm(atdaVar).c);
                        if (b2 == null) {
                            b2 = arfr.UNKNOWN;
                        }
                        int a = ajutVar.a(b2);
                        obj = ajxuVar;
                        if (a > 0) {
                            ajxuVar.e = qX().getDrawable(a);
                            obj = ajxuVar;
                        }
                    }
                }
                ajpdVar.add(obj);
            }
        }
        ajpd ajpdVar2 = new ajpd();
        this.aJ = new ajnb(ajpdVar2);
        for (ajxt ajxtVar : this.aG) {
            ajpdVar2.add(ajxtVar);
            ajxtVar.a.add(new nnx(this));
        }
        ajoc ajocVar = new ajoc();
        ajocVar.m(ajpdVar);
        ajnb ajnbVar = this.aJ;
        if (ajnbVar != null) {
            ajocVar.m(ajnbVar);
        }
        this.ay = new ajnp(ajocVar, aE);
        ci C = C();
        C.getClass();
        ajnp ajnpVar = this.ay;
        ajnpVar.getClass();
        return new ajxr(C, ajnpVar);
    }

    @Override // defpackage.uyt
    protected final AdapterView.OnItemClickListener aJ() {
        return this;
    }

    @Override // defpackage.uyt
    protected final String aK() {
        return null;
    }

    public final void aL(ahel ahelVar) {
        aO(ahelVar.a().c());
    }

    public final void aM(ahef ahefVar) {
        if (!ahefVar.c().c(aign.PLAYBACK_LOADED) || ahefVar.b() == null) {
            return;
        }
        aN();
    }

    public final void aN() {
        ajnb ajnbVar;
        ainy ainyVar = this.af;
        if (ainyVar == null) {
            return;
        }
        boolean equals = TextUtils.equals(ainyVar.q(), this.aI);
        ajnb ajnbVar2 = this.aJ;
        if (ajnbVar2 != null) {
            ajnbVar2.h(true != equals ? 0 : Integer.MAX_VALUE);
        }
        if (equals && ar() && (ajnbVar = this.aJ) != null) {
            ajnbVar.v();
        }
    }

    @Override // defpackage.aioa
    public final ayqx[] kI(aioc aiocVar) {
        final int i = 1;
        final int i2 = 0;
        return new ayqx[]{aiocVar.G().b.Y(new ayrs(this) { // from class: nny
            public final /* synthetic */ nnz a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.aM((ahef) obj);
                } else {
                    this.a.aL((ahel) obj);
                }
            }
        }, ktf.u), aiocVar.V().Y(new ayrs(this) { // from class: nny
            public final /* synthetic */ nnz a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.aM((ahef) obj);
                } else {
                    this.a.aL((ahel) obj);
                }
            }
        }, ktf.u)};
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahef.class, ahel.class};
        }
        if (i == 0) {
            aM((ahef) obj);
            return null;
        }
        if (i == 1) {
            aL((ahel) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajdg
    public final void lP() {
        kv();
    }

    @Override // defpackage.uyt
    protected final int mA() {
        return 0;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mD() {
        super.mD();
        if (evr.au(this.az)) {
            this.aF.c();
        } else {
            this.ae.m(this);
        }
        this.ar.d(this);
        this.at.b(false);
        acsa acsaVar = this.ax;
        if (acsaVar != null) {
            this.av.q(acsaVar, null);
            this.at.a();
        }
        SingleLoopMenuItemController singleLoopMenuItemController = this.aq;
        singleLoopMenuItemController.h = false;
        kem kemVar = singleLoopMenuItemController.e;
        if (kemVar != null && kemVar.g) {
            singleLoopMenuItemController.c.q(new acqx(acsb.c(123601)), null);
        }
        ValueAnimator valueAnimator = singleLoopMenuItemController.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            singleLoopMenuItemController.j = null;
        }
    }

    @Override // defpackage.uyt, defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        kem[] kemVarArr = new kem[12];
        kemVarArr[0] = this.ai.a();
        ker kerVar = this.aj;
        if (kerVar.b == null) {
            kerVar.a();
        }
        kem kemVar = kerVar.b;
        kemVar.getClass();
        kemVarArr[1] = kemVar;
        final SingleLoopMenuItemController singleLoopMenuItemController = this.aq;
        if (singleLoopMenuItemController.e == null) {
            singleLoopMenuItemController.e = new kem(singleLoopMenuItemController.a.getString(R.string.single_loop_menu_item), new kel() { // from class: kfi
                @Override // defpackage.kel
                public final void a() {
                    SingleLoopMenuItemController singleLoopMenuItemController2 = SingleLoopMenuItemController.this;
                    singleLoopMenuItemController2.c.I(3, new acqx(acsb.c(123601)), null);
                    singleLoopMenuItemController2.b.D().h(true != singleLoopMenuItemController2.f ? 2 : 0);
                }
            });
            singleLoopMenuItemController.h();
            singleLoopMenuItemController.e.g(singleLoopMenuItemController.g);
        }
        if (singleLoopMenuItemController.e.g) {
            singleLoopMenuItemController.c.D(new acqx(acsb.c(123601)));
        }
        kemVarArr[2] = singleLoopMenuItemController.e;
        kemVarArr[3] = this.al.a();
        kemVarArr[4] = this.am.b;
        kemVarArr[5] = this.ap.b;
        kex kexVar = this.ao;
        kexVar.a();
        kemVarArr[6] = kexVar.b;
        final ListenFirstMenuItemController listenFirstMenuItemController = this.ak;
        if (listenFirstMenuItemController.d == null) {
            listenFirstMenuItemController.d = new kem(listenFirstMenuItemController.a.getString(R.string.listening_controls_overflow_menu_item), new kel() { // from class: kes
                @Override // defpackage.kel
                public final void a() {
                    ListenFirstMenuItemController listenFirstMenuItemController2 = ListenFirstMenuItemController.this;
                    aone createBuilder = ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.a.createBuilder();
                    createBuilder.copyOnWrite();
                    ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.instance;
                    showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.c = 1;
                    showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.d = "listen-first";
                    ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2 = (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) createBuilder.build();
                    aahd aahdVar = listenFirstMenuItemController2.b;
                    aong aongVar = (aong) apxf.a.createBuilder();
                    aongVar.e(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint, showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint2);
                    aahdVar.a((apxf) aongVar.build());
                }
            });
            listenFirstMenuItemController.d.e = whu.y(listenFirstMenuItemController.a, R.drawable.quantum_ic_tune_black_24, R.attr.ytTextPrimary);
            listenFirstMenuItemController.c.i(listenFirstMenuItemController);
            listenFirstMenuItemController.oQ(listenFirstMenuItemController.c.g());
        }
        kem kemVar2 = listenFirstMenuItemController.d;
        kemVar2.getClass();
        kemVarArr[7] = kemVar2;
        kemVarArr[8] = this.an.a;
        final keo keoVar = this.ah;
        if (keoVar.b == null) {
            keoVar.b = new kem(keoVar.a.getString(R.string.menu_help), new kel() { // from class: ken
                @Override // defpackage.kel
                public final void a() {
                    keo keoVar2 = keo.this;
                    keoVar2.c.a(keoVar2.a, "yt_android_watch");
                }
            });
            keoVar.b.g(true);
            keoVar.b.e = whu.y(keoVar.a, R.drawable.yt_outline_question_circle_black_24, R.attr.ytTextPrimary);
        }
        kemVarArr[9] = keoVar.b;
        final gvv gvvVar = this.at;
        if (gvvVar.e == null) {
            gvvVar.e = new kem("", new kel() { // from class: gvt
                @Override // defpackage.kel
                public final void a() {
                    gvv gvvVar2 = gvv.this;
                    aouj g = gvvVar2.b.g();
                    if (g == null) {
                        zga.b("User clicked presence menu item but no menu data is available");
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(gvvVar2.a);
                    aqyg aqygVar = g.e;
                    if (aqygVar == null) {
                        aqygVar = aqyg.a;
                    }
                    AlertDialog.Builder title = builder.setTitle(ajcq.b(aqygVar));
                    aqyg aqygVar2 = g.d;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    AlertDialog.Builder message = title.setMessage(ajcq.b(aqygVar2));
                    aqyg aqygVar3 = g.f;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                    AlertDialog create = message.setPositiveButton(ajcq.b(aqygVar3), (DialogInterface.OnClickListener) null).setCancelable(true).create();
                    create.setCanceledOnTouchOutside(true);
                    create.show();
                }
            });
            gvvVar.e.g(false);
            gvvVar.e.e = whu.y(gvvVar.a, gvvVar.c.a(arfr.ACCOUNT_LINKED), R.attr.ytTextPrimary);
        }
        kemVarArr[10] = gvvVar.e;
        MusicDeeplinkMenuItemController musicDeeplinkMenuItemController = this.au;
        if (musicDeeplinkMenuItemController.b == null) {
            musicDeeplinkMenuItemController.b = new kem("", new keu(musicDeeplinkMenuItemController));
            musicDeeplinkMenuItemController.h();
        }
        kem kemVar3 = musicDeeplinkMenuItemController.b;
        kemVar3.getClass();
        kemVarArr[11] = kemVar3;
        this.aG = Arrays.asList(kemVarArr);
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            if (!bundle2.containsKey("FEED_MENU_ITEMS_KEY")) {
                this.aH = new ArrayList();
            } else {
                try {
                    this.aH = ((atdc) amkq.cj(bundle2, "FEED_MENU_ITEMS_KEY", atdc.a, aomw.b())).c;
                } catch (aoob e) {
                    String valueOf = String.valueOf(e.toString());
                    throw new RuntimeException(valueOf.length() != 0 ? "unable to decode menu items: ".concat(valueOf) : new String("unable to decode menu items: "));
                }
            }
            this.aI = bundle2.getString("VIDEO_ID_KEY");
        }
    }

    @Override // defpackage.ajxk, defpackage.uyt, defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        aN();
        if (evr.au(this.az)) {
            this.aF.c();
            this.aF.g(kI(this.as));
        } else {
            this.ae.g(this);
        }
        this.ar.a(this);
        this.aC.e();
        this.at.b(true);
        aixh o = this.af.o();
        if (o != null) {
            aO(o.c());
        }
        Set set = this.aw;
        boolean z = set != null && set.contains(0);
        final SingleLoopMenuItemController singleLoopMenuItemController = this.aq;
        singleLoopMenuItemController.h = true;
        kem kemVar = singleLoopMenuItemController.e;
        if (kemVar == null || !kemVar.g) {
            return;
        }
        singleLoopMenuItemController.c.u(new acqx(acsb.c(123601)), null);
        if (z) {
            ValueAnimator valueAnimator = singleLoopMenuItemController.j;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            singleLoopMenuItemController.j = ValueAnimator.ofArgb(singleLoopMenuItemController.d, 0).setDuration(3000L);
            singleLoopMenuItemController.j.setStartDelay(1000L);
            singleLoopMenuItemController.j.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: kfh
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    int intValue;
                    kem kemVar2 = SingleLoopMenuItemController.this.e;
                    if (kemVar2 == null || kemVar2.i == (intValue = ((Integer) valueAnimator2.getAnimatedValue()).intValue())) {
                        return;
                    }
                    kemVar2.i = intValue;
                    kemVar2.c();
                }
            });
            singleLoopMenuItemController.j.start();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        String str;
        uyu item = ((ajxr) this.aD).getItem(i);
        if (item instanceof uyw) {
            uyw uywVar = (uyw) item;
            nob nobVar = this.aA;
            if (nobVar == null) {
                dismiss();
                return;
            }
            if (uywVar instanceof ajxu) {
                atda atdaVar = ((ajxu) uywVar).j;
                if (atdaVar != null && (str = this.aI) != null) {
                    PlayerOverflowBottomSheetController playerOverflowBottomSheetController = nobVar.a;
                    if (TextUtils.equals(str, playerOverflowBottomSheetController.i())) {
                        apxf dl = adyu.dl(atdaVar);
                        if (dl == null) {
                            dl = adyu.dk(atdaVar);
                        }
                        if (dl != null) {
                            playerOverflowBottomSheetController.a.c(dl, null);
                        }
                    }
                }
            } else if (uywVar instanceof kem) {
                ((kem) uywVar).a();
            }
            dismiss();
        }
    }
}
