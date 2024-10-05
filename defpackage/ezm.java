package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ezm implements aaha {
    public final zaw a;
    public final aahd b;
    public final acra c;
    private final Executor d;
    private final ci e;
    private final aahv f;
    private final afsy g;
    private final aaxn h;

    public ezm(aaxn aaxnVar, zaw zawVar, aahd aahdVar, Executor executor, ci ciVar, aahv aahvVar, afsy afsyVar, acra acraVar, byte[] bArr, byte[] bArr2) {
        aaxnVar.getClass();
        this.h = aaxnVar;
        zawVar.getClass();
        this.a = zawVar;
        aahdVar.getClass();
        this.b = aahdVar;
        executor.getClass();
        this.d = executor;
        ciVar.getClass();
        this.e = ciVar;
        aahvVar.getClass();
        this.f = aahvVar;
        afsyVar.getClass();
        this.g = afsyVar;
        this.c = acraVar;
    }

    public final void b(String str, aviu aviuVar) {
        if (str.isEmpty()) {
            return;
        }
        aahu a = this.f.a(this.g.c());
        str.getClass();
        amkq.O(!str.isEmpty(), "key cannot be empty");
        aone createBuilder = avjc.a.createBuilder();
        createBuilder.copyOnWrite();
        avjc avjcVar = (avjc) createBuilder.instance;
        avjcVar.b |= 1;
        avjcVar.c = str;
        aviz avizVar = new aviz(createBuilder);
        aone aoneVar = avizVar.a;
        aoneVar.copyOnWrite();
        avjc avjcVar2 = (avjc) aoneVar.instance;
        avjcVar2.d = aviuVar.f;
        avjcVar2.b |= 2;
        avjb b = avizVar.b();
        aalc c = a.c();
        c.d(b);
        c.b().T();
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        avix avixVar = (avix) apxfVar.pX(aviy.a);
        final ascn ascnVar = avixVar.b;
        if (ascnVar == null) {
            ascnVar = ascn.a;
        }
        aaxn aaxnVar = this.h;
        abdi abdiVar = new abdi(aaxnVar.f, aaxnVar.a.c(), ascnVar, null, null, null);
        abdiVar.l(apxfVar.c);
        aviv avivVar = avixVar.c;
        if (avivVar == null) {
            avivVar = aviv.a;
        }
        final String str = avivVar.e;
        b(str, aviu.TRANSCRIPT_SEARCH_STATE_VALUE_SEARCHING);
        ci ciVar = this.e;
        aaxn aaxnVar2 = this.h;
        ynm.n(ciVar, aaxnVar2.b.b(abdiVar, this.d), new zfi() { // from class: ezl
            @Override // defpackage.zfi
            public final void a(Object obj) {
                ezm ezmVar = ezm.this;
                ezmVar.b(str, aviu.TRANSCRIPT_SEARCH_STATE_VALUE_FAILED);
                ezmVar.a.e((Throwable) obj);
            }
        }, new zfi() { // from class: ezk
            @Override // defpackage.zfi
            public final void a(Object obj) {
                ezm ezmVar = ezm.this;
                ascn ascnVar2 = ascnVar;
                String str2 = str;
                asco ascoVar = (asco) obj;
                if (ascoVar != null && !ascoVar.c.isEmpty()) {
                    ezmVar.b.b(ascoVar.c);
                }
                if (ascnVar2.e.isEmpty()) {
                    ezmVar.b(str2, aviu.TRANSCRIPT_SEARCH_STATE_VALUE_NOT_SEARCHING);
                } else {
                    ezmVar.b(str2, aviu.TRANSCRIPT_SEARCH_STATE_VALUE_COMPLETE);
                }
                if (ascoVar != null) {
                    ((acqq) ezmVar.c).D(new acqx(ascoVar.d));
                }
            }
        });
    }
}
