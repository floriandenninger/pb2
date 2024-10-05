package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wxj implements wxl, wol {
    public final xgh a;
    public final xfn b;
    public final Executor c;
    public final wxw e;
    private final wxk f;
    private final aixh g;
    private final ypa h;
    private final aaea i;
    private final wxc j;
    private final wqg l;
    public boolean d = false;
    private boolean k = false;

    public wxj(wxk wxkVar, aaea aaeaVar, wqg wqgVar, wxw wxwVar, xgh xghVar, ypa ypaVar, Executor executor, wxc wxcVar) {
        this.f = wxkVar;
        this.i = aaeaVar;
        this.l = wqgVar;
        this.e = wxwVar;
        this.a = xghVar;
        this.g = (aixh) xghVar.d(xej.class);
        this.b = (xfn) xghVar.d(xdb.class);
        this.h = ypaVar;
        this.c = executor;
        this.j = wxcVar;
    }

    @Override // defpackage.wxl
    public final void a() {
        this.d = true;
        if (!wbs.n(this.i) || !this.j.k().contains(this.a.a)) {
            try {
                wqg wqgVar = this.l;
                aixh aixhVar = this.g;
                if (aixhVar == null) {
                    throw new wnw("VideoPlayback wasn't available when trying to request interrupt");
                }
                ajbf h = aixhVar.h();
                if (h != null) {
                    if (wqgVar.a != null) {
                        throw new wnw("Tried to enter PlayerBytesSlot when interrupt already acquired");
                    }
                    h.c(new wqf(wqgVar, this));
                } else {
                    throw new wnw("VideoInterrupt.Controller wasn't available when trying to request interrupt");
                }
            } catch (wnw e) {
                this.f.k(this.a, new wxf(e.toString()));
                return;
            }
        } else {
            this.d = false;
            this.f.i(this.a);
        }
        if (this.b != xfn.PRE_ROLL) {
            this.h.d(new xaj());
        }
        if (wbs.n(this.i) && this.j.k().contains(this.a.a)) {
            return;
        }
        this.h.d(new xal());
    }

    @Override // defpackage.wxl
    public final void b() {
        this.h.d(new xai());
        if (this.d) {
            this.k = true;
            this.f.l(this.a);
        } else {
            this.k = false;
            this.f.l(this.a);
            this.l.a();
        }
    }

    public final void c() {
        this.d = false;
        if (this.k) {
            this.l.a();
        } else {
            this.h.d(new xak());
            this.f.i(this.a);
        }
    }

    @Override // defpackage.wol
    public final /* synthetic */ void i() {
    }
}
