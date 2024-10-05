package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.TrackingUrlModel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisa implements aiqh {
    public final String a;
    public final awdi b;
    public final shf c;
    public final aifv d;
    public final aaea e;
    public final aypn f;
    public final aypn g;
    public final aypn h;
    public final aypn i;
    public final aypn j;
    public final aypn k;
    public final aypn l;
    public final aypn m;
    public final aypn n;
    public final aypn o;
    public final aypn p;
    public final ajby q;
    public final aypn r;
    public afgs s;
    public final ayqw t = new ayqw();
    private final afgt u;
    private final boolean v;

    public aisa(shf shfVar, String str, awdi awdiVar, boolean z, aypn aypnVar, aypn aypnVar2, aypn aypnVar3, aypn aypnVar4, aypn aypnVar5, aypn aypnVar6, aypn aypnVar7, aypn aypnVar8, aypn aypnVar9, aypn aypnVar10, aypn aypnVar11, ajby ajbyVar, aaea aaeaVar, afgt afgtVar, aifv aifvVar, aadw aadwVar, aypn aypnVar12) {
        this.c = shfVar;
        this.a = str;
        this.b = awdiVar;
        this.v = z;
        this.f = aypnVar;
        this.g = aypnVar2;
        this.h = aypnVar3;
        this.i = aypnVar4;
        this.j = aypnVar5;
        this.k = aypnVar6;
        this.n = aypnVar7;
        this.o = aypnVar8;
        this.m = aypnVar9;
        this.l = aypnVar10;
        this.p = aypnVar11;
        this.q = ajbyVar;
        this.e = aaeaVar;
        this.u = afgtVar;
        this.d = aifvVar;
        this.r = aypnVar12;
        if (aifk.G(aadwVar) && b(aaeaVar).d) {
            afgs a = afgtVar.a(str, awdiVar);
            this.s = a;
            if (a != null) {
                ajbyVar.addObserver(a);
            }
        }
    }

    public static auij b(aaea aaeaVar) {
        if (aaeaVar == null || aaeaVar.a() == null) {
            return auij.b;
        }
        atcl atclVar = aaeaVar.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        auij auijVar = atclVar.f;
        return auijVar == null ? auij.b : auijVar;
    }

    @Override // defpackage.aiqh
    public final void a(long j) {
        afgs afgsVar = this.s;
        if (afgsVar != null) {
            afgsVar.J(j);
        }
    }

    public final void c(String str, String str2, awdi awdiVar, VideoStreamingData videoStreamingData, TrackingUrlModel trackingUrlModel, PlayerConfigModel playerConfigModel) {
        afgs afgsVar = this.s;
        if (afgsVar != null) {
            if (afgsVar.m) {
                return;
            }
            afgsVar.h(trackingUrlModel, str2, null, null, str, videoStreamingData, playerConfigModel);
        } else {
            afgs b = this.u.b(trackingUrlModel, str2, awdiVar, null, null, str, videoStreamingData, this.v, playerConfigModel);
            this.s = b;
            if (b != null) {
                this.q.addObserver(b);
            }
        }
    }

    public final boolean d() {
        arfd a;
        aaea aaeaVar = this.e;
        if (aaeaVar != null && (a = aaeaVar.a()) != null) {
            atcl atclVar = a.i;
            if (atclVar == null) {
                atclVar = atcl.a;
            }
            apdj apdjVar = atclVar.i;
            if (apdjVar == null) {
                apdjVar = apdj.a;
            }
            if (apdjVar.i) {
                return true;
            }
        }
        return false;
    }
}
