package defpackage;

import android.util.Log;
import android.view.View;
import com.google.android.libraries.youtube.livecreation.screencast.ScreencastHostService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acdc implements View.OnClickListener {
    public final /* synthetic */ acdn a;
    private final /* synthetic */ int b;

    public /* synthetic */ acdc(acdn acdnVar, int i) {
        this.b = i;
        this.a = acdnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        acdy acdyVar;
        acdw acdwVar;
        int i = 0;
        switch (this.b) {
            case 0:
                acdn acdnVar = this.a;
                acdnVar.j();
                acdk acdkVar = acdnVar.y;
                if (acdkVar != null) {
                    acdy acdyVar2 = (acdy) acdkVar;
                    if (acdnVar == acdyVar2.c) {
                        if (acdy.m(acdyVar2)) {
                            return;
                        }
                        acdyVar2.f.i();
                        return;
                    }
                    String valueOf = String.valueOf(acdnVar);
                    String valueOf2 = String.valueOf(acdyVar2.c);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 31 + String.valueOf(valueOf2).length());
                    sb.append("Unexpected control window: ");
                    sb.append(valueOf);
                    sb.append(" != ");
                    sb.append(valueOf2);
                    Log.e("ScreencastControls", sb.toString());
                    acdyVar2.f.i();
                    return;
                }
                return;
            case 1:
                this.a.j();
                return;
            case 2:
                acdn acdnVar2 = this.a;
                acdnVar2.j();
                if (!acdnVar2.I) {
                    acdnVar2.q(true);
                    acdnVar2.o.I(3, new acqx(acrb.SCREENCAST_CONTROLLER_PAUSE_STREAM_BUTTON), null);
                    accz acczVar = acdnVar2.z;
                    if (acczVar != null) {
                        ScreencastHostService screencastHostService = (ScreencastHostService) ((acdy) acczVar).f;
                        if (screencastHostService.l) {
                            screencastHostService.n.z(new accn(screencastHostService));
                            return;
                        }
                        return;
                    }
                    return;
                }
                acdnVar2.q(false);
                acdnVar2.o.I(3, new acqx(acrb.SCREENCAST_CONTROLLER_RESUME_STREAM_BUTTON), null);
                accz acczVar2 = acdnVar2.z;
                if (acczVar2 != null) {
                    ScreencastHostService screencastHostService2 = (ScreencastHostService) ((acdy) acczVar2).f;
                    if (screencastHostService2.l) {
                        abwy abwyVar = screencastHostService2.n;
                        accn accnVar = new accn(screencastHostService2);
                        if (!abwyVar.S) {
                            zga.b("Cannot resume. Capture stream not active");
                            return;
                        } else {
                            abwyVar.j.g(new abvy(abwyVar, accnVar, i));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                acdn acdnVar3 = this.a;
                acdnVar3.j();
                if (acdnVar3.s()) {
                    acdnVar3.b();
                    return;
                } else {
                    acdnVar3.t.start();
                    return;
                }
            case 4:
                acdn acdnVar4 = this.a;
                acdnVar4.j();
                acdnVar4.e(true);
                return;
            case 5:
                acdn acdnVar5 = this.a;
                acdnVar5.j();
                acdnVar5.o.I(3, new acqx(acrb.SCREENCAST_CONTROLLER_START_STREAM_BUTTON), null);
                accz acczVar3 = acdnVar5.z;
                if (acczVar3 != null) {
                    acdy acdyVar3 = (acdy) acczVar3;
                    if (acdy.n(acdyVar3.i) && acdyVar3.i != 4) {
                        acei aceiVar = acdyVar3.b;
                        if (acdy.n(aceiVar.u) && aceiVar.u != 4) {
                            aceiVar.g(false);
                            aceiVar.c();
                            aceiVar.d.setVisibility(8);
                            aceiVar.a();
                            aceiVar.u = 4;
                        }
                        acdyVar3.c.b();
                        acdyVar3.c.k();
                        acdyVar3.c.d();
                        acdyVar3.c.m.setVisibility(8);
                        acdyVar3.c.c();
                        acdyVar3.h(acdyVar3.g);
                        acdyVar3.k();
                        acdyVar3.i = 4;
                        ScreencastHostService screencastHostService3 = (ScreencastHostService) acdyVar3.f;
                        if (screencastHostService3.l) {
                            Log.w("ScreencastHostServ", "Unexpectedly entered launching state while capture active. Switching to active");
                            if (acdy.m(screencastHostService3.m)) {
                                screencastHostService3.m.c();
                                return;
                            }
                            return;
                        }
                        screencastHostService3.o.h();
                        screencastHostService3.n.p();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                this.a.m.performClick();
                return;
            case 7:
                this.a.N.show();
                return;
            case 8:
                acdn acdnVar6 = this.a;
                acdnVar6.j();
                if (!acdnVar6.G) {
                    accq accqVar = acdnVar6.B;
                    if (accqVar != null) {
                        ((acdy) accqVar).b.e(true, new acdd(acdnVar6, 3));
                    } else {
                        acdnVar6.l(true);
                    }
                    acdnVar6.o.I(3, new acqx(acrb.SCREENCAST_CONTROLLER_ENABLE_CAMERA_BUTTON), null);
                    return;
                }
                accq accqVar2 = acdnVar6.B;
                if (accqVar2 != null) {
                    ((acdy) accqVar2).b.e(false, new acdd(acdnVar6, 2));
                } else {
                    acdnVar6.l(false);
                }
                acdnVar6.o.I(3, new acqx(acrb.SCREENCAST_CONTROLLER_DISABLE_CAMERA_BUTTON), null);
                return;
            case 9:
                acdn acdnVar7 = this.a;
                acdnVar7.j();
                if (!acdnVar7.F) {
                    acdnVar7.p(true);
                    acdp acdpVar = acdnVar7.A;
                    if (acdpVar != null) {
                        acdy acdyVar4 = (acdy) acdpVar;
                        acdyVar4.b.f(true);
                        ((ScreencastHostService) acdyVar4.f).j(true);
                    }
                    acdnVar7.o.I(3, new acqx(acrb.SCREENCAST_CONTROLLER_ENABLE_MIC_BUTTON), null);
                    return;
                }
                acdnVar7.p(false);
                acdp acdpVar2 = acdnVar7.A;
                if (acdpVar2 != null) {
                    acdy acdyVar5 = (acdy) acdpVar2;
                    acdyVar5.b.f(false);
                    ((ScreencastHostService) acdyVar5.f).j(false);
                }
                acdnVar7.o.I(3, new acqx(acrb.SCREENCAST_CONTROLLER_DISABLE_MIC_BUTTON), null);
                return;
            default:
                acdn acdnVar8 = this.a;
                acdnVar8.j();
                if (!acdnVar8.H) {
                    acdnVar8.n(true);
                    acda acdaVar = acdnVar8.C;
                    if (acdaVar != null) {
                        acdaVar.a();
                        return;
                    }
                    return;
                }
                acdnVar8.n(false);
                acda acdaVar2 = acdnVar8.C;
                if (acdaVar2 == null || (acdwVar = (acdyVar = (acdy) acdaVar2).d) == null) {
                    return;
                }
                acdwVar.b();
                acdyVar.d.d.setVisibility(8);
                return;
        }
    }
}
