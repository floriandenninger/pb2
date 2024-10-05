package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.List;

/* compiled from: PG */
@wyr(a = apac.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, b = apae.SLOT_TYPE_IN_PLAYER, c = {xdi.class})
/* loaded from: classes4.dex */
public final class wsr implements wsx, wof, woq {
    xjn a = xjn.a;
    private final wsw b;
    private final wzq c;
    private final wor d;
    private final wog e;
    private final aifw f;
    private final xgh g;
    private final xev h;
    private final aulq i;
    private final wpl j;
    private final wpn k;

    public wsr(wsw wswVar, wzq wzqVar, wor worVar, wog wogVar, wpl wplVar, wpn wpnVar, aifw aifwVar, xgh xghVar, xev xevVar) {
        this.b = wswVar;
        this.c = wzqVar;
        this.d = worVar;
        this.e = wogVar;
        this.j = wplVar;
        this.k = wpnVar;
        this.f = aifwVar;
        this.g = xghVar;
        this.h = xevVar;
        this.i = (aulq) xevVar.e(xdi.class);
    }

    private final void i() {
        if (wsl.h(this.a)) {
            this.k.a(new acqx(this.a.d));
            this.a = wsl.f(this.a);
        }
    }

    @Override // defpackage.wsx
    public final xev a() {
        throw null;
    }

    @Override // defpackage.wsx
    public final void b() {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void f(aign aignVar, PlayerResponseModel playerResponseModel, aixh aixhVar, String str, String str2) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qp(afih afihVar) {
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qq(String str) {
    }

    @Override // defpackage.wof
    public final void qr(aigf aigfVar, aigf aigfVar2, int i, int i2, boolean z, boolean z2) {
        xjn c = wsl.c(this.a, aigfVar);
        this.a = c;
        if (c.j) {
            this.d.r(c.k, c.g);
            i();
        }
    }

    @Override // defpackage.wof
    public final void qs(String str, long j, long j2, long j3, boolean z) {
        xjn a = wsl.a(this.a, j);
        this.a = a;
        if (a.j) {
            this.d.r(a.k, a.g);
            i();
        }
    }

    @Override // defpackage.wsx
    public final void qt() {
    }

    @Override // defpackage.wsx
    public final void qu() {
        xjn e = wsl.e(this.f.g(), this.i);
        this.a = e;
        if (e.b.h()) {
            this.e.a(this);
            this.d.o(this);
            this.d.p((aooy) this.a.b.c());
            this.d.q(true);
            return;
        }
        this.b.d(this.g, this.h, new wxd("Null CTA renderer for discovery InPlayer"));
    }

    @Override // defpackage.wsx
    public final void qv(int i) {
        wsl.g(this.a, this.c);
        this.d.k();
        this.e.c(this);
        this.b.e(this.g, this.h, i);
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qw(String str, int i) {
    }

    @Override // defpackage.woq
    public final void qx(Object obj, List list) {
        if (this.c.d(obj)) {
            return;
        }
        this.a = wsl.b(this.a, obj);
        this.j.a(list, acrc.i(obj, false));
    }

    @Override // defpackage.wof
    public final /* synthetic */ void qy(ahcm ahcmVar) {
    }
}
