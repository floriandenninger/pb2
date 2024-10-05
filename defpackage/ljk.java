package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ljk implements akfm {
    final /* synthetic */ ljn a;

    public ljk(ljn ljnVar) {
        this.a = ljnVar;
    }

    @Override // defpackage.akfm
    public final /* synthetic */ void a(amkk amkkVar) {
    }

    @Override // defpackage.akfm
    public final void b() {
        ljn ljnVar = this.a;
        if (ljnVar.n || ljnVar.q) {
            return;
        }
        ljnVar.i();
        ljn ljnVar2 = this.a;
        ljnVar2.c.o(ljnVar2.o, ljnVar2.p);
    }

    @Override // defpackage.akfm
    public final void c(Throwable th) {
        if (th.getMessage() != null) {
            String format = String.format(new Locale("en"), "%s (YtConnectionType = %d)", th.getMessage(), Integer.valueOf(this.a.f.a()));
            afsi.c(2, 32, format, th);
            String valueOf = String.valueOf(format);
            zga.d(valueOf.length() != 0 ? "VoiceSearchController error: ".concat(valueOf) : new String("VoiceSearchController error: "), th);
        }
        ljn ljnVar = this.a;
        if (ljnVar.n) {
            ljnVar.m();
        }
        this.a.i();
    }

    @Override // defpackage.akfm
    public final void d(aomf aomfVar) {
        aomf aomfVar2;
        try {
            awzg awzgVar = (awzg) aonm.parseFrom(awzg.a, aomfVar, aomw.b());
            aarr aarrVar = this.a.g;
            if (awzgVar.b == 1) {
                aomfVar2 = (aomf) awzgVar.c;
            } else {
                aomfVar2 = aomf.b;
            }
            arjb arjbVar = (arjb) aarrVar.a(aomfVar2.I(), arjb.a);
            if (arjbVar != null) {
                if ((arjbVar.b & 4) != 0 && arjbVar.f.size() <= 0) {
                    this.a.h.n(new acqx(arjbVar.c.I()));
                }
                if ((arjbVar.b & 128) != 0) {
                    this.a.b.g(aomfVar.I());
                    return;
                }
                if (arjbVar.f.size() > 0) {
                    ljn ljnVar = this.a;
                    ljnVar.r = arjbVar.f;
                    ljnVar.c();
                    ljnVar.c.j();
                    if (evr.I(ljnVar.a) && ljnVar.i.n(asmn.LATENCY_ACTION_VOICE_ASSISTANT)) {
                        ljnVar.i.u("voz_vt", asmn.LATENCY_ACTION_VOICE_ASSISTANT);
                        return;
                    }
                    return;
                }
                this.a.i();
                this.a.m();
            }
        } catch (aoob unused) {
        }
    }
}
