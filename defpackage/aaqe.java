package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaqe {
    final abez a;
    public final SettableFuture b = SettableFuture.f();
    public final aftr c;
    public final aueu d;

    public aaqe(abez abezVar, aftq aftqVar) {
        aueu aueuVar;
        this.a = abezVar;
        aveq aveqVar = abezVar.a;
        if (aveqVar.b == 6) {
            aueuVar = (aueu) aveqVar.c;
        } else {
            aueuVar = aueu.a;
        }
        this.d = aueuVar;
        asmn b = asmn.b(aueuVar.c);
        aftr d = aftqVar.d(b == null ? asmn.LATENCY_ACTION_UNKNOWN : b);
        this.c = d;
        d.e();
    }

    public final void a() {
        this.c.c("pcc");
        apni a = this.a.a();
        apnh apnhVar = apnh.SCREEN_EXIT;
        b(a.b().ordinal() != 0 ? 1 : 4);
    }

    public final void b(int i) {
        aftr aftrVar = this.c;
        aone createBuilder = asmb.a.createBuilder();
        aone createBuilder2 = asmh.a.createBuilder();
        createBuilder2.copyOnWrite();
        asmh asmhVar = (asmh) createBuilder2.instance;
        asmhVar.f = i - 1;
        asmhVar.b |= 8;
        createBuilder.copyOnWrite();
        asmb asmbVar = (asmb) createBuilder.instance;
        asmh asmhVar2 = (asmh) createBuilder2.build();
        asmhVar2.getClass();
        asmbVar.A = asmhVar2;
        asmbVar.d |= 128;
        aftrVar.a((asmb) createBuilder.build());
    }
}
