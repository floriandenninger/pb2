package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adla implements aftf {
    public final afte a;
    private final adlt b;
    private final boolean c;

    static {
        zga.a("MDX.Incognito");
    }

    public adla(afte afteVar, adlt adltVar, acxi acxiVar) {
        this.a = afteVar;
        this.b = adltVar;
        this.c = acxiVar.c.equals("cl");
    }

    public final void a() {
        this.a.i(this);
    }

    @Override // defpackage.aftf
    public final void j() {
        adlm g;
        if (this.c && (g = this.b.g()) != null) {
            ynm.i(g.q(atbi.MDX_SESSION_DISCONNECT_REASON_INCOGNITO, Optional.empty()), llr.o);
        }
    }

    @Override // defpackage.aftf
    public final void k() {
    }

    @Override // defpackage.aftf
    public final void l() {
    }
}
