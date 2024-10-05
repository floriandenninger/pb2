package com.google.android.apps.youtube.app.extensions.reel.common.browse;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentControllerImpl;
import com.google.android.apps.youtube.app.extensions.reel.common.browse.ReelBrowseFragmentFeedController;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import defpackage.aauc;
import defpackage.aaue;
import defpackage.acqz;
import defpackage.acsx;
import defpackage.acsy;
import defpackage.acsz;
import defpackage.ajok;
import defpackage.ajut;
import defpackage.any;
import defpackage.aobq;
import defpackage.aok;
import defpackage.aone;
import defpackage.aplt;
import defpackage.apxf;
import defpackage.aqet;
import defpackage.aqeu;
import defpackage.arfr;
import defpackage.arfs;
import defpackage.arjq;
import defpackage.arjv;
import defpackage.asmb;
import defpackage.asmn;
import defpackage.aujw;
import defpackage.aulq;
import defpackage.aurj;
import defpackage.aurk;
import defpackage.fgz;
import defpackage.hbx;
import defpackage.hcd;
import defpackage.hce;
import defpackage.hcf;
import defpackage.hqa;
import defpackage.hqc;
import defpackage.ynk;
import defpackage.ynl;
import defpackage.ynm;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReelBrowseFragmentControllerImpl implements any {
    public acsx a = new acsz();
    public BrowseResponseModel b;
    public hcf c;
    private final aaue d;
    private final Executor e;
    private final acqz f;
    private final fgz g;
    private final acsy h;

    public ReelBrowseFragmentControllerImpl(aaue aaueVar, Executor executor, acqz acqzVar, fgz fgzVar, acsy acsyVar, hcf hcfVar) {
        this.d = aaueVar;
        this.e = executor;
        this.c = hcfVar;
        this.f = acqzVar;
        this.g = fgzVar;
        this.h = acsyVar;
    }

    public final void g(apxf apxfVar) {
        hcf hcfVar = this.c;
        if (hcfVar == null) {
            return;
        }
        ((hbx) hcfVar).aj.c();
        aplt apltVar = (aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint);
        aauc f = this.d.f();
        f.d(apltVar.c);
        f.v(apltVar.d);
        f.l(apxfVar.c);
        acsx b = this.h.b(asmn.LATENCY_ACTION_BROWSE);
        this.a = b;
        aone createBuilder = asmb.a.createBuilder();
        asmn asmnVar = asmn.LATENCY_ACTION_BROWSE;
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmbVar.e = asmnVar.bO;
        asmbVar.b |= 1;
        String str = apltVar.c;
        createBuilder.copyOnWrite();
        asmb asmbVar2 = (asmb) createBuilder.instance;
        str.getClass();
        asmbVar2.c |= 4;
        asmbVar2.r = str;
        b.a((asmb) createBuilder.build());
        this.a.c("br_s");
        ynm.k(this.d.h(f, this.e), this.e, new ynk() { // from class: hby
            @Override // defpackage.zfi
            /* renamed from: b */
            public final void a(Throwable th) {
                ReelBrowseFragmentControllerImpl reelBrowseFragmentControllerImpl = ReelBrowseFragmentControllerImpl.this;
                hcf hcfVar2 = reelBrowseFragmentControllerImpl.c;
                if (hcfVar2 == null) {
                    return;
                }
                hbx hbxVar = (hbx) hcfVar2;
                hbxVar.aj.b(hbxVar.qX().getString(R.string.reel_generic_error_message), true);
                hbxVar.ae.h();
                reelBrowseFragmentControllerImpl.a.c("br_e");
            }
        }, new ynl() { // from class: hbz
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                ReelBrowseFragmentControllerImpl reelBrowseFragmentControllerImpl = ReelBrowseFragmentControllerImpl.this;
                BrowseResponseModel browseResponseModel = (BrowseResponseModel) obj;
                if (reelBrowseFragmentControllerImpl.c == null) {
                    return;
                }
                reelBrowseFragmentControllerImpl.b = browseResponseModel;
                reelBrowseFragmentControllerImpl.h(browseResponseModel);
                reelBrowseFragmentControllerImpl.a.c("br_r");
                if (browseResponseModel.f() != null) {
                    hcf hcfVar2 = reelBrowseFragmentControllerImpl.c;
                    aamd f2 = browseResponseModel.f();
                    hbx hbxVar = (hbx) hcfVar2;
                    ReelBrowseFragmentFeedController reelBrowseFragmentFeedController = hbxVar.af;
                    Context context = hbxVar.ah;
                    aone createBuilder2 = aved.a.createBuilder();
                    auov auovVar = f2.a;
                    createBuilder2.copyOnWrite();
                    aved avedVar = (aved) createBuilder2.instance;
                    avedVar.c = auovVar;
                    avedVar.b |= 1;
                    aved avedVar2 = (aved) createBuilder2.build();
                    aone createBuilder3 = aveh.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    aveh avehVar = (aveh) createBuilder3.instance;
                    avedVar2.getClass();
                    avehVar.k = avedVar2;
                    avehVar.b |= 8192;
                    reelBrowseFragmentFeedController.g(context, amru.r(new aame((aveh) createBuilder3.build())), null);
                    hbxVar.aj.a();
                } else if (browseResponseModel.g() != null) {
                    hbx hbxVar2 = (hbx) reelBrowseFragmentControllerImpl.c;
                    hbxVar2.af.g(hbxVar2.ah, browseResponseModel.g(), null);
                    hbxVar2.aj.a();
                }
                reelBrowseFragmentControllerImpl.i(browseResponseModel);
                reelBrowseFragmentControllerImpl.j(browseResponseModel);
                reelBrowseFragmentControllerImpl.a.c("ol");
            }
        });
    }

    public final void h(BrowseResponseModel browseResponseModel) {
        this.g.a(this.f.mM(), browseResponseModel.a);
    }

    public final void i(BrowseResponseModel browseResponseModel) {
        arjv arjvVar = browseResponseModel.a;
        if ((arjvVar.b & 8) != 0) {
            hcf hcfVar = this.c;
            aulq aulqVar = arjvVar.e;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            hcd hcdVar = ((hbx) hcfVar).ag;
            if (aulqVar.pY(aqeu.a)) {
                hcdVar.a.f(hcdVar.a.g((aqet) aulqVar.pX(aqeu.a)), false);
            }
        }
    }

    public final void j(BrowseResponseModel browseResponseModel) {
        aujw aujwVar;
        aurk aurkVar;
        aurk aurkVar2;
        int i;
        ImageView imageView;
        ReelBrowseFragmentToolbarController reelBrowseFragmentToolbarController = ((hbx) this.c).ae;
        arjq arjqVar = browseResponseModel.a.d;
        if (arjqVar == null) {
            arjqVar = arjq.a;
        }
        int i2 = arjqVar.b;
        if (i2 != 313670307) {
            if (i2 != 338099421) {
                if (i2 != 50236216) {
                    reelBrowseFragmentToolbarController.h();
                    return;
                }
                reelBrowseFragmentToolbarController.d.oB(new ajok(), browseResponseModel);
                reelBrowseFragmentToolbarController.a.addView(reelBrowseFragmentToolbarController.d.c);
                reelBrowseFragmentToolbarController.d.c.findViewById(R.id.feed_tabbed_back).setOnClickListener(new hce(reelBrowseFragmentToolbarController, 3));
                return;
            }
            hqa hqaVar = reelBrowseFragmentToolbarController.c;
            ajok ajokVar = new ajok();
            if (arjqVar.b == 338099421) {
                aujwVar = (aujw) arjqVar.c;
            } else {
                aujwVar = aujw.a;
            }
            hqaVar.oB(ajokVar, aujwVar);
            reelBrowseFragmentToolbarController.a.addView(reelBrowseFragmentToolbarController.c.a);
            reelBrowseFragmentToolbarController.c.a.findViewById(R.id.pivot_back).setOnClickListener(new hce(reelBrowseFragmentToolbarController, 2));
            return;
        }
        hqc hqcVar = reelBrowseFragmentToolbarController.b;
        ajok ajokVar2 = new ajok();
        if (arjqVar.b == 313670307) {
            aurkVar = (aurk) arjqVar.c;
        } else {
            aurkVar = aurk.a;
        }
        hqcVar.oB(ajokVar2, aurkVar);
        reelBrowseFragmentToolbarController.a.addView(reelBrowseFragmentToolbarController.b.c);
        hqc hqcVar2 = reelBrowseFragmentToolbarController.b;
        if (arjqVar.b == 313670307) {
            aurkVar2 = (aurk) arjqVar.c;
        } else {
            aurkVar2 = aurk.a;
        }
        hce hceVar = new hce(reelBrowseFragmentToolbarController, 0);
        aurj aurjVar = aurkVar2.f;
        if (aurjVar == null) {
            aurjVar = aurj.a;
        }
        if ((aurjVar.b & 1) != 0) {
            ajut ajutVar = hqcVar2.b;
            arfs arfsVar = aurjVar.c;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            i = ajutVar.a(b);
        } else {
            i = 0;
        }
        int bw = aobq.bw(aurjVar.d);
        if (bw == 0) {
            bw = 1;
        }
        if (bw - 1 != 1) {
            imageView = (ImageView) hqcVar2.c.findViewById(R.id.music_picker_trailing_button);
        } else {
            imageView = (ImageView) hqcVar2.c.findViewById(R.id.music_picker_leading_button);
        }
        imageView.setVisibility(0);
        if (i > 0) {
            imageView.setImageResource(i);
        }
        imageView.setOnClickListener(hceVar);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.c = null;
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void nv(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void ot(aok aokVar) {
    }
}
