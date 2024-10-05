package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adov {
    public static final /* synthetic */ int b = 0;
    public final ywr a;

    static {
        zga.a("MDX.SessionInfoStorage");
    }

    public adov(ywr ywrVar) {
        this.a = ywrVar;
    }

    public static /* synthetic */ void b(Throwable th) {
        zga.d("Failed to clear storage", th);
    }

    public static /* synthetic */ void c(Throwable th) {
        zga.d("Failed to save session info", th);
    }

    public final anhy a() {
        return anfq.h(this.a.a(), new aczu(19), angq.a);
    }

    public final void d(final adlp adlpVar) {
        ynm.m(this.a.b(new amml() { // from class: adou
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                adlp adlpVar2 = adlp.this;
                int i = adov.b;
                aone createBuilder = awvg.a.createBuilder();
                int i2 = adlpVar2.i;
                int i3 = i2 - 1;
                if (i2 != 0) {
                    createBuilder.copyOnWrite();
                    awvg awvgVar = (awvg) createBuilder.instance;
                    awvgVar.b |= 1;
                    awvgVar.c = i3;
                    String str = adlpVar2.e;
                    createBuilder.copyOnWrite();
                    awvg awvgVar2 = (awvg) createBuilder.instance;
                    str.getClass();
                    awvgVar2.b |= 128;
                    awvgVar2.h = str;
                    String str2 = adlpVar2.d;
                    createBuilder.copyOnWrite();
                    awvg awvgVar3 = (awvg) createBuilder.instance;
                    str2.getClass();
                    awvgVar3.b |= 32;
                    awvgVar3.g = str2;
                    String str3 = adlpVar2.g;
                    createBuilder.copyOnWrite();
                    awvg awvgVar4 = (awvg) createBuilder.instance;
                    str3.getClass();
                    awvgVar4.b |= 256;
                    awvgVar4.i = str3;
                    int i4 = adlpVar2.h;
                    createBuilder.copyOnWrite();
                    awvg awvgVar5 = (awvg) createBuilder.instance;
                    awvgVar5.b |= 512;
                    awvgVar5.j = i4;
                    long j = adlpVar2.b;
                    createBuilder.copyOnWrite();
                    awvg awvgVar6 = (awvg) createBuilder.instance;
                    awvgVar6.b |= 1024;
                    awvgVar6.k = j;
                    if (!adlpVar2.a.isPresent()) {
                        createBuilder.copyOnWrite();
                        awvg awvgVar7 = (awvg) createBuilder.instance;
                        awvgVar7.b |= 2048;
                        awvgVar7.l = -1L;
                        createBuilder.copyOnWrite();
                        awvg awvgVar8 = (awvg) createBuilder.instance;
                        awvgVar8.b |= 4;
                        awvgVar8.e = -1L;
                        createBuilder.copyOnWrite();
                        awvg awvgVar9 = (awvg) createBuilder.instance;
                        awvgVar9.b |= 8;
                        awvgVar9.f = -1L;
                    } else {
                        adkq adkqVar = (adkq) adlpVar2.a.get();
                        long j2 = adkqVar.b;
                        createBuilder.copyOnWrite();
                        awvg awvgVar10 = (awvg) createBuilder.instance;
                        awvgVar10.b |= 2048;
                        awvgVar10.l = j2;
                        long j3 = adkqVar.a;
                        createBuilder.copyOnWrite();
                        awvg awvgVar11 = (awvg) createBuilder.instance;
                        awvgVar11.b |= 4;
                        awvgVar11.e = j3;
                        long j4 = adkqVar.d ? -2L : adkqVar.c;
                        createBuilder.copyOnWrite();
                        awvg awvgVar12 = (awvg) createBuilder.instance;
                        awvgVar12.b |= 8;
                        awvgVar12.f = j4;
                    }
                    if (!adlpVar2.f.isPresent()) {
                        createBuilder.copyOnWrite();
                        awvg awvgVar13 = (awvg) createBuilder.instance;
                        awvgVar13.b |= 2;
                        awvgVar13.d = -1;
                    } else {
                        int i5 = ((atbi) adlpVar2.f.get()).D;
                        createBuilder.copyOnWrite();
                        awvg awvgVar14 = (awvg) createBuilder.instance;
                        awvgVar14.b |= 2;
                        awvgVar14.d = i5;
                    }
                    if (adlpVar2.i == 3) {
                        adks adksVar = adlpVar2.c;
                        adksVar.getClass();
                        String str4 = adksVar.a.c;
                        createBuilder.copyOnWrite();
                        awvg awvgVar15 = (awvg) createBuilder.instance;
                        awvgVar15.b |= 4096;
                        awvgVar15.m = str4;
                    }
                    return (awvg) createBuilder.build();
                }
                throw null;
            }
        }), adha.m);
    }
}
