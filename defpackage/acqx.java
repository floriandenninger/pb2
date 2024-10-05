package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acqx extends acsa {
    @Deprecated
    public acqx(acrb acrbVar) {
        acrbVar.getClass();
        aone createBuilder = awav.a.createBuilder();
        int i = acrbVar.Jk;
        createBuilder.copyOnWrite();
        awav awavVar = (awav) createBuilder.instance;
        awavVar.b |= 2;
        awavVar.d = i;
        this.a = (awav) createBuilder.build();
    }

    public static acqx a(aooy aooyVar) {
        if (aooyVar == null) {
            zga.m("INTERACTIONLOGGINGBUG->", "loggingDirectable is null when creating visual element container!");
            return null;
        }
        return new acqx(adyu.cf(aooyVar));
    }

    public acqx(acsc acscVar) {
        acscVar.getClass();
        aone createBuilder = awav.a.createBuilder();
        int i = acscVar.a;
        createBuilder.copyOnWrite();
        awav awavVar = (awav) createBuilder.instance;
        awavVar.b |= 2;
        awavVar.d = i;
        this.a = (awav) createBuilder.build();
    }

    public acqx(aomf aomfVar) {
        aomfVar.getClass();
        aone createBuilder = awav.a.createBuilder();
        createBuilder.copyOnWrite();
        awav awavVar = (awav) createBuilder.instance;
        awavVar.b |= 1;
        awavVar.c = aomfVar;
        this.a = (awav) createBuilder.build();
    }

    public acqx(asuh asuhVar) {
        awav awavVar;
        this.a = awav.a;
        if (asuhVar == null) {
            zga.m("INTERACTIONLOGGINGBUG->", "LoggingDirective is null when creating visual element container!");
            return;
        }
        aone createBuilder = awav.a.createBuilder();
        apvd apvdVar = asuhVar.h;
        if (((apvdVar == null ? apvd.a : apvdVar).b & 1) == 0) {
            aomf aomfVar = asuhVar.d;
            createBuilder.copyOnWrite();
            awav awavVar2 = (awav) createBuilder.instance;
            aomfVar.getClass();
            awavVar2.b |= 1;
            awavVar2.c = aomfVar;
            awavVar = (awav) createBuilder.build();
        } else {
            apvd apvdVar2 = asuhVar.h;
            apvdVar2 = apvdVar2 == null ? apvd.a : apvdVar2;
            int i = apvdVar2.c;
            createBuilder.copyOnWrite();
            awav awavVar3 = (awav) createBuilder.instance;
            awavVar3.b |= 2;
            awavVar3.d = i;
            aone createBuilder2 = awav.a.createBuilder();
            aomf aomfVar2 = asuhVar.d;
            createBuilder2.copyOnWrite();
            awav awavVar4 = (awav) createBuilder2.instance;
            aomfVar2.getClass();
            awavVar4.b |= 1;
            awavVar4.c = aomfVar2;
            createBuilder.copyOnWrite();
            awav awavVar5 = (awav) createBuilder.instance;
            awav awavVar6 = (awav) createBuilder2.build();
            awavVar6.getClass();
            awavVar5.g = awavVar6;
            awavVar5.b |= 16;
            if ((apvdVar2.b & 2) != 0) {
                int i2 = apvdVar2.d;
                createBuilder.copyOnWrite();
                awav awavVar7 = (awav) createBuilder.instance;
                awavVar7.b |= 8;
                awavVar7.f = i2;
            }
            if ((apvdVar2.b & 4) != 0) {
                int i3 = apvdVar2.e;
                createBuilder.copyOnWrite();
                awav awavVar8 = (awav) createBuilder.instance;
                awavVar8.b |= 4;
                awavVar8.e = i3;
            }
            if ((apvdVar2.b & 8) != 0) {
                apve apveVar = apvdVar2.f;
                apveVar = apveVar == null ? apve.a : apveVar;
                createBuilder.copyOnWrite();
                awav awavVar9 = (awav) createBuilder.instance;
                apveVar.getClass();
                awavVar9.h = apveVar;
                awavVar9.b |= 64;
            }
            awavVar = (awav) createBuilder.build();
        }
        if (awavVar != null) {
            this.a = awavVar;
        }
        this.b = asuhVar;
    }

    public acqx(byte[] bArr) {
        bArr.getClass();
        aone createBuilder = awav.a.createBuilder();
        aomf x = aomf.x(bArr);
        createBuilder.copyOnWrite();
        awav awavVar = (awav) createBuilder.instance;
        awavVar.b |= 1;
        awavVar.c = x;
        this.a = (awav) createBuilder.build();
    }
}
