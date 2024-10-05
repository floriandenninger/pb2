package defpackage;

import android.app.Activity;
import com.google.protos.youtube.api.innertube.ConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eoh {
    public final Activity a;
    public final acqz b;
    public final axpg c;
    public final azrw d;
    public final axpg e;
    public final axpg f;
    public ajdf g;
    public final axpg h;
    public final axpg i;
    public boolean j = true;
    private final aaea k;
    private final ayqi l;

    public eoh(Activity activity, aaea aaeaVar, final aadw aadwVar, acqz acqzVar, axpg axpgVar, azrw azrwVar, final axpg axpgVar2, axpg axpgVar3, axpg axpgVar4, final axpg axpgVar5, final aioc aiocVar, axpg axpgVar6, final axpg axpgVar7, axpg axpgVar8, final ayqi ayqiVar, ayqi ayqiVar2, Executor executor) {
        this.a = activity;
        this.k = aaeaVar;
        this.b = acqzVar;
        this.c = axpgVar;
        this.d = azrwVar;
        this.h = axpgVar3;
        this.e = axpgVar6;
        this.f = axpgVar4;
        this.i = axpgVar8;
        this.l = ayqiVar2;
        if (a()) {
            if (evr.az(aadwVar)) {
                executor.execute(new Runnable() { // from class: eof
                    @Override // java.lang.Runnable
                    public final void run() {
                        eoh.this.d(axpgVar2, axpgVar5, aiocVar, axpgVar7, ayqiVar, aadwVar);
                    }
                });
                return;
            }
            axpgVar.get();
            azrwVar.get();
            axpgVar3.get();
            axpgVar4.get();
            axpgVar5.get();
            axpgVar6.get();
            axpgVar7.get();
            axpgVar8.get();
            d(axpgVar2, axpgVar5, aiocVar, axpgVar7, ayqiVar, aadwVar);
        }
    }

    public static boolean b(fhg fhgVar) {
        return fhgVar.equals(fhg.NONE) || fhgVar.equals(fhg.INLINE_MINIMAL) || fhgVar.equals(fhg.WATCH_WHILE_MINIMIZED);
    }

    public static final String c(aaxh aaxhVar) {
        if (aaxhVar == null) {
            return null;
        }
        aplc aplcVar = aaxhVar.a.f;
        if (aplcVar == null) {
            aplcVar = aplc.a;
        }
        if ((aplcVar.b & 1) == 0) {
            return null;
        }
        aplc aplcVar2 = aaxhVar.a.f;
        if (aplcVar2 == null) {
            aplcVar2 = aplc.a;
        }
        apxf apxfVar = aplcVar2.c;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        return oba.j((ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint) apxfVar.pX(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.showEngagementPanelEndpoint));
    }

    public final boolean a() {
        return evr.K(this.k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(axpg axpgVar, axpg axpgVar2, aioc aiocVar, final axpg axpgVar3, ayqi ayqiVar, aadw aadwVar) {
        yqw yqwVar = (yqw) axpgVar.get();
        fgq fgqVar = (fgq) this.h.get();
        aypn i = fgqVar.h().aF().L(eng.c).Y(eoe.a).ah(fgqVar.g()).w(2L, TimeUnit.SECONDS).i(aypg.LATEST);
        aypy o = aypy.o(yqwVar.b().z(2L, TimeUnit.SECONDS), ((eoa) this.d.get()).b(), i.U(), gii.b);
        asvu asvuVar = aadwVar.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (asvuVar.bE) {
            o = o.ab(this.l);
        }
        o.ao(((izt) axpgVar2.get()).a(), epc.b).p(wbs.K(yqwVar.a())).ab(ayqiVar).ax(new ayrs() { // from class: eod
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                final eoh eohVar = eoh.this;
                axpg axpgVar4 = axpgVar3;
                ammw ammwVar = (ammw) obj;
                aaxh aaxhVar = (aaxh) ammwVar.b;
                badl badlVar = (badl) ammwVar.a;
                boolean booleanValue = ((Boolean) badlVar.a()).booleanValue();
                enz enzVar = (enz) badlVar.b();
                boolean z = false;
                boolean z2 = booleanValue && (enzVar.equals(enz.ACTIVE) || enzVar.equals(enz.ON_HOLD) || enzVar.equals(enz.SYSTEM_ACTIVE) || enzVar.equals(enz.SYSTEM_ON_HOLD)) && eoh.b((fhg) badlVar.c());
                boolean booleanValue2 = ((Boolean) badlVar.a()).booleanValue();
                enz enzVar2 = (enz) badlVar.b();
                fhg fhgVar = (fhg) badlVar.c();
                boolean z3 = enzVar2.equals(enz.ACTIVE) || enzVar2.equals(enz.SYSTEM_ACTIVE);
                boolean z4 = !eoh.b(fhgVar);
                if (booleanValue2 && z3 && z4) {
                    z = true;
                }
                nqp nqpVar = (nqp) axpgVar4.get();
                if (z || eoh.c(aaxhVar) == null || !Objects.equals(eoh.c(aaxhVar), nqpVar.i()) || !nqpVar.x()) {
                    ainy ainyVar = (ainy) eohVar.f.get();
                    if (z) {
                        ainyVar.a();
                        aplc aplcVar = aaxhVar.a.f;
                        if (aplcVar == null) {
                            aplcVar = aplc.a;
                        }
                        if ((aplcVar.b & 1) != 0) {
                            if (((fgq) eohVar.h.get()).g().equals(fhg.WATCH_WHILE_FULLSCREEN)) {
                                ((okf) eohVar.e.get()).c();
                            }
                            aahd aahdVar = (aahd) eohVar.c.get();
                            aplc aplcVar2 = aaxhVar.a.f;
                            if (aplcVar2 == null) {
                                aplcVar2 = aplc.a;
                            }
                            apxf apxfVar = aplcVar2.c;
                            if (apxfVar == null) {
                                apxfVar = apxf.a;
                            }
                            aahdVar.c(apxfVar, amrz.k("engagement_panel_close_listener_key", new nqd() { // from class: eob
                                @Override // defpackage.nqd
                                public final void a() {
                                    eoh eohVar2 = eoh.this;
                                    ainy ainyVar2 = (ainy) eohVar2.f.get();
                                    if (!ainyVar2.d() && eohVar2.j) {
                                        ainyVar2.b();
                                    }
                                    ((eoa) eohVar2.d.get()).c(apkz.BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL);
                                }
                            }));
                        }
                    }
                    if (!z2) {
                        ajdf ajdfVar = eohVar.g;
                        if (ajdfVar != null) {
                            ajdfVar.l();
                            eohVar.g = null;
                            ainy ainyVar2 = (ainy) eohVar.f.get();
                            if (ainyVar2.d() || !eohVar.j) {
                                return;
                            }
                            ainyVar2.b();
                            return;
                        }
                        return;
                    }
                    ainyVar.a();
                    if (eohVar.a()) {
                        arss arssVar = aaxhVar.a;
                        if ((arssVar.b & 512) != 0) {
                            aplc aplcVar3 = arssVar.f;
                            if (aplcVar3 == null) {
                                aplcVar3 = aplc.a;
                            }
                            aulq aulqVar = aplcVar3.d;
                            if (aulqVar == null) {
                                aulqVar = aulq.a;
                            }
                            if (aulqVar.pY(ConfirmDialogRendererOuterClass.confirmDialogRenderer)) {
                                aqdt aqdtVar = (aqdt) aulqVar.pX(ConfirmDialogRendererOuterClass.confirmDialogRenderer);
                                eoa eoaVar = (eoa) eohVar.d.get();
                                eohVar.g = ajdf.g(eohVar.a, aqdtVar, (aahd) eohVar.c.get(), eohVar.b.mM(), (ajdh) eohVar.i.get(), true, false, new eog(eoaVar), null);
                                eoaVar.d(apkz.BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_DIALOG);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                String c = eoh.c(aaxhVar);
                if (c != null) {
                    aone createBuilder = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a.createBuilder();
                    createBuilder.copyOnWrite();
                    HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.instance;
                    hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
                    hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = c;
                    HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2 = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.build();
                    aong aongVar = (aong) apxf.a.createBuilder();
                    aongVar.e(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2);
                    ((aahd) eohVar.c.get()).a((apxf) aongVar.build());
                }
            }
        });
        final int i2 = 0;
        aiocVar.G().i.h(wbs.M(yqwVar.a())).E(ayqiVar).X(new ayrs(this) { // from class: eoc
            public final /* synthetic */ eoh a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    this.a.j = ((ahej) obj).a() != 7;
                    return;
                }
                eoh eohVar = this.a;
                ahef ahefVar = (ahef) obj;
                eoa eoaVar = (eoa) eohVar.d.get();
                if (((fgq) eohVar.h.get()).g().d() || !ahefVar.c().a(aign.VIDEO_PLAYING, aign.ENDED)) {
                    return;
                }
                if (eoaVar.a().equals(enz.ON_HOLD) || eoaVar.a().equals(enz.SYSTEM_ON_HOLD)) {
                    eoaVar.f();
                }
            }
        });
        aypn E = aiocVar.G().a.G().h(wbs.M(yqwVar.a())).E(ayqiVar);
        final int i3 = 1;
        E.X(new ayrs(this) { // from class: eoc
            public final /* synthetic */ eoh a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i3 == 0) {
                    this.a.j = ((ahej) obj).a() != 7;
                    return;
                }
                eoh eohVar = this.a;
                ahef ahefVar = (ahef) obj;
                eoa eoaVar = (eoa) eohVar.d.get();
                if (((fgq) eohVar.h.get()).g().d() || !ahefVar.c().a(aign.VIDEO_PLAYING, aign.ENDED)) {
                    return;
                }
                if (eoaVar.a().equals(enz.ON_HOLD) || eoaVar.a().equals(enz.SYSTEM_ON_HOLD)) {
                    eoaVar.f();
                }
            }
        });
    }
}
