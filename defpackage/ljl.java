package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ljl implements akfn {
    final /* synthetic */ ljn a;

    public ljl(ljn ljnVar) {
        this.a = ljnVar;
    }

    @Override // defpackage.akfn
    public final void a(int i) {
        if (i > 0 && evr.I(this.a.a) && this.a.i.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            ljn ljnVar = this.a;
            if (!ljnVar.t) {
                ljnVar.t = true;
                ljnVar.i.u("voz_ss", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
            }
        }
        this.a.c.f(i);
    }

    @Override // defpackage.akfn
    public final void b() {
        if (evr.I(this.a.a) && this.a.i.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            ljn ljnVar = this.a;
            ljnVar.u = true;
            ljnVar.i.u("voz_mf", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
        }
        ljn ljnVar2 = this.a;
        ljnVar2.n = false;
        akfo akfoVar = ljnVar2.j;
        if (akfoVar != null) {
            akfoVar.d();
        }
        this.a.c.l();
    }

    @Override // defpackage.akfn
    public final void c() {
        this.a.c.m();
    }

    @Override // defpackage.akfn
    public final void d(List list) {
        if (!this.a.s && !list.isEmpty() && this.a.i.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
            this.a.i.u("voz_ftr", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
            this.a.s = true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            amkt amktVar = (amkt) it.next();
            double d = amktVar.c;
            if (d == 1.0d) {
                this.a.q = true;
            }
            if (d >= 0.8d) {
                if (evr.I(this.a.a) && this.a.i.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
                    ljn ljnVar = this.a;
                    if (!ljnVar.u) {
                        ljnVar.i.u("voz_sf", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
                    }
                }
                this.a.c.n(amktVar.b);
            } else {
                this.a.c.p(amktVar.b);
            }
        }
    }
}
