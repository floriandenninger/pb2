package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lon implements zdj {
    final /* synthetic */ ywr a;
    final /* synthetic */ ywr b;
    private final /* synthetic */ int c;

    public lon(ywr ywrVar, ywr ywrVar2, int i) {
        this.c = i;
        this.a = ywrVar;
        this.b = ywrVar2;
    }

    @Override // defpackage.zdj
    public final /* synthetic */ anhy b(Object obj) {
        if (this.c == 0) {
            Boolean bool = (Boolean) obj;
            anhy b = this.a.b(new lod(bool, 5));
            if (bool.booleanValue()) {
                return anfq.i(b, new lol(this.b, 3), angq.a);
            }
            final ywr ywrVar = this.a;
            final ywr ywrVar2 = this.b;
            return anfq.i(b, new anfz() { // from class: lom
                @Override // defpackage.anfz
                public final anhy a(Object obj2) {
                    return anfq.i(ywr.this.a(), new lol(ywrVar2, 2), angq.a);
                }
            }, angq.a);
        }
        final Boolean bool2 = (Boolean) obj;
        anhy b2 = this.a.b(new lod(bool2, 0));
        final ywr ywrVar3 = this.b;
        final ywr ywrVar4 = this.a;
        return anfq.i(b2, new anfz() { // from class: lof
            @Override // defpackage.anfz
            public final anhy a(Object obj2) {
                ywr ywrVar5 = ywr.this;
                final Boolean bool3 = bool2;
                final ywr ywrVar6 = ywrVar4;
                return ywrVar5.b(new amml() { // from class: loe
                    @Override // defpackage.amml
                    public final Object apply(Object obj3) {
                        avzr b3;
                        Boolean bool4 = bool3;
                        ywr ywrVar7 = ywrVar6;
                        aone builder = ((awvr) obj3).toBuilder();
                        if (bool4.booleanValue()) {
                            b3 = avzr.VIDEO_QUALITY_SETTING_DATA_SAVER;
                        } else {
                            b3 = avzr.b(((lox) ywrVar7.c()).c);
                            if (b3 == null) {
                                b3 = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
                            }
                        }
                        builder.copyOnWrite();
                        awvr awvrVar = (awvr) builder.instance;
                        awvrVar.m = b3.e;
                        awvrVar.b |= 16;
                        return (awvr) builder.build();
                    }
                });
            }
        }, angq.a);
    }

    @Override // defpackage.zdj
    public final anhy a() {
        if (this.c == 0) {
            return anfq.i(this.b.a(), new lol(this.a, 0), angq.a);
        }
        return anfq.i(this.b.a(), new lol(this.a, 1), angq.a);
    }
}
