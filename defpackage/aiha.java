package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiha implements aarz {
    aomf a;
    String b;

    public aiha(aypn aypnVar, aypn aypnVar2) {
        ayqw ayqwVar = new ayqw();
        final int i = 1;
        ayqwVar.d(ahbw.c(aypnVar, aidf.i).Y(new ayrs(this) { // from class: aigz
            public final /* synthetic */ aiha a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    aiha aihaVar = this.a;
                    ahen ahenVar = (ahen) obj;
                    if (ahenVar.a().a() == 0 && ahenVar.a().Z().equals(aihaVar.b)) {
                        aihaVar.a = null;
                        return;
                    }
                    return;
                }
                aiha aihaVar2 = this.a;
                ahdp ahdpVar = (ahdp) obj;
                aryi q = ahdpVar.a().q();
                aihaVar2.a = q != null ? q.o : null;
                aihaVar2.b = ahdpVar.b();
            }
        }, ahwx.s));
        final int i2 = 0;
        ayqwVar.d(aypnVar2.Y(new ayrs(this) { // from class: aigz
            public final /* synthetic */ aiha a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    aiha aihaVar = this.a;
                    ahen ahenVar = (ahen) obj;
                    if (ahenVar.a().a() == 0 && ahenVar.a().Z().equals(aihaVar.b)) {
                        aihaVar.a = null;
                        return;
                    }
                    return;
                }
                aiha aihaVar2 = this.a;
                ahdp ahdpVar = (ahdp) obj;
                aryi q = ahdpVar.a().q();
                aihaVar2.a = q != null ? q.o : null;
                aihaVar2.b = ahdpVar.b();
            }
        }, ahwx.s));
    }

    @Override // defpackage.aarz
    public final void a(aone aoneVar) {
        aomf aomfVar = this.a;
        if (aomfVar == null || aomfVar.H()) {
            return;
        }
        aone createBuilder = arms.a.createBuilder();
        createBuilder.copyOnWrite();
        arms armsVar = (arms) createBuilder.instance;
        armsVar.b |= 1;
        armsVar.c = aomfVar;
        arms armsVar2 = (arms) createBuilder.build();
        aoneVar.copyOnWrite();
        arnb arnbVar = (arnb) aoneVar.instance;
        arnb arnbVar2 = arnb.a;
        armsVar2.getClass();
        aony aonyVar = arnbVar.k;
        if (!aonyVar.c()) {
            arnbVar.k = aonm.mutableCopy(aonyVar);
        }
        arnbVar.k.add(armsVar2);
    }
}
