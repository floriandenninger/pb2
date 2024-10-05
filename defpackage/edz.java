package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.youtube.app.common.endpoint.LoggingUrlsPingController;
import com.google.android.apps.youtube.app.extensions.reel.common.audio.SfvAudioItemPlaybackController;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.protos.youtube.api.innertube.ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint;
import com.google.protos.youtube.api.innertube.FlagVideoEndpointOuterClass$FlagVideoEndpoint;
import com.google.protos.youtube.api.innertube.MenuEndpointOuterClass$MenuEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import com.google.protos.youtube.api.innertube.ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand;
import com.google.protos.youtube.api.innertube.ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand;
import com.google.protos.youtube.api.innertube.ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class edz implements azrw {
    private final int a;
    private final ehr b;

    public edz(ehr ehrVar, int i) {
        this.b = ehrVar;
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ammv] */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    @Override // defpackage.azrw
    public final Object get() {
        String str = "Expected activity to be a FragmentActivity: ";
        switch (this.a) {
            case 0:
                ehr ehrVar = this.b;
                Activity activity = ehrVar.a;
                try {
                    str = activity == null ? amlr.a : ammv.j((ci) activity);
                    return ajbp.g(str, ehrVar.s);
                } catch (ClassCastException e) {
                    String valueOf = String.valueOf(activity);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44);
                    sb.append(str);
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString(), e);
                }
            case 1:
                ehr ehrVar2 = this.b;
                azrw azrwVar = ehrVar2.d;
                ammv b = ammv.i((azrw) amrz.k(ReelWatchActivity.class, ehrVar2.r).get(ehrVar2.a().getClass())).b(yml.q);
                azrwVar.getClass();
                return (aahd) b.d(new uqa(azrwVar, 3));
            case 2:
                return this.b.e();
            case 3:
                ehr ehrVar3 = this.b;
                amrw i = amrz.i(9);
                i.g(FlagVideoEndpointOuterClass$FlagVideoEndpoint.class, ehrVar3.e);
                i.g(atmf.class, ehrVar3.f);
                i.g(ShowCommentSimpleboxCommandOuterClass$ShowCommentSimpleboxCommand.class, ehrVar3.g);
                i.g(ReelWatchEndpointOuterClass$ReelWatchEndpoint.class, ehrVar3.h);
                i.g(aplt.class, ehrVar3.j);
                i.g(MenuEndpointOuterClass$MenuEndpoint.class, ehrVar3.n);
                i.g(ConfirmDialogEndpointOuterClass$ConfirmDialogEndpoint.class, ehrVar3.o);
                i.g(ShowReelsCommentsOverlayCommandOuterClass$ShowReelsCommentsOverlayCommand.class, ehrVar3.p);
                i.g(ReelWatchSurveyActionCommandOuterClass$ReelWatchSurveyActionCommand.class, ehrVar3.q);
                amrz c = i.c();
                aahd e2 = ehrVar3.e();
                acqz f = ehrVar3.f();
                LoggingUrlsPingController al = ((ffi) ((axqk) ((ames) ehrVar3.c.get()).a()).lM()).al();
                ayaw.k(al);
                aagt g = aagx.g();
                g.b(c);
                g.d(e2);
                return new acrc(new idu(g.a(), al), f);
            case 4:
                return ghe.m(this.b.c());
            case 5:
                return ghe.e(this.b.c());
            case 6:
                ehr ehrVar4 = this.b;
                xoh gf = ((xpy) ((axqk) ((ames) ehrVar4.c.get()).a()).lM()).gf();
                ayaw.k(gf);
                fma fmaVar = (fma) ehrVar4.b.wk.get();
                ili cL = ((ijv) ((axqk) ((ames) ehrVar4.c.get()).a()).lM()).cL();
                ayaw.k(cL);
                return new ife(gf, fmaVar, cL);
            case 7:
                ehr ehrVar5 = this.b;
                return ghe.f((ing) ehrVar5.b.vK.get(), ehrVar5.b.bY(), ehrVar5.b.gY(), ehrVar5.b());
            case 8:
                ehr ehrVar6 = this.b;
                ci ciVar = (ci) ehrVar6.i.get();
                SfvAudioItemPlaybackController ch = ((hbh) ((axqk) ((ames) ehrVar6.c.get()).a()).lM()).ch();
                ayaw.k(ch);
                aahd aahdVar = (aahd) ehrVar6.b.iM.get();
                hav b2 = ehrVar6.b();
                inp cO = ((idx) ((axqk) ((ames) ehrVar6.c.get()).a()).lM()).cO();
                ayaw.k(cO);
                aoae mY = ((hbt) ((axqk) ((ames) ehrVar6.c.get()).a()).lM()).mY();
                ayaw.k(mY);
                return ghe.u(ciVar, ch, aahdVar, b2, cO, mY, amvo.b, ehrVar6.f());
            case 9:
                Activity a = this.b.a();
                try {
                    return (ci) a;
                } catch (ClassCastException e3) {
                    String valueOf2 = String.valueOf(a);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 44);
                    sb2.append("Expected activity to be a FragmentActivity: ");
                    sb2.append(valueOf2);
                    throw new IllegalStateException(sb2.toString(), e3);
                }
            case 10:
                ehr ehrVar7 = this.b;
                return ghe.d(ehrVar7.c(), (gru) ehrVar7.m.get());
            case 11:
                ehr ehrVar8 = this.b;
                ci ciVar2 = (ci) ehrVar8.i.get();
                aahd aahdVar2 = (aahd) ehrVar8.k.get();
                ajut ajutVar = (ajut) ehrVar8.b.lE.get();
                ajoy ajoyVar = new ajoy(ehrVar8.l, (byte[]) null, (byte[]) null);
                lyp ev = ((nic) ((axqk) ((ames) ehrVar8.c.get()).a()).lM()).ev();
                ayaw.k(ev);
                acqz f2 = ehrVar8.f();
                aalw aalwVar = (aalw) ehrVar8.b.wp.get();
                lru lruVar = (lru) ehrVar8.b.wq.get();
                ajdh jm = ((ajdk) ((axqk) ((ames) ehrVar8.c.get()).a()).lM()).jm();
                ayaw.k(jm);
                return ghe.p(ciVar2, aahdVar2, ajutVar, ajoyVar, ev, f2, aalwVar, lruVar, jm);
            case 12:
                aoae mR = ((ajot) ((axqk) ((ames) this.b.c.get()).a()).lM()).mR();
                ayaw.k(mR);
                return mR;
            case 13:
                ehr ehrVar9 = this.b;
                Context d = ((idw) ((axqk) ((ames) ehrVar9.c.get()).a()).lM()).d();
                ayaw.k(d);
                return ghe.c(d, (aahd) ehrVar9.k.get(), ehrVar9.b.cO(), (ajut) ehrVar9.b.lE.get());
            case 14:
                ifz cH = ((ifr) ((axqk) ((ames) this.b.c.get()).a()).lM()).cH();
                ayaw.k(cH);
                return ghe.g(cH);
            default:
                return ghe.n();
        }
    }
}
