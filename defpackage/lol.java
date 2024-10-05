package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class lol implements anfz {
    public final /* synthetic */ ywr a;
    private final /* synthetic */ int b;

    public /* synthetic */ lol(ywr ywrVar, int i) {
        this.b = i;
        this.a = ywrVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        boolean z;
        int i = this.b;
        if (i == 0) {
            ywr ywrVar = this.a;
            z = ((fof) obj).e == 1;
            return anfq.h(ywrVar.b(new eou(z, 18)), new eou(z, 19), angq.a);
        }
        if (i == 1) {
            ywr ywrVar2 = this.a;
            avzr b = avzr.b(((awvr) obj).m);
            if (b == null) {
                b = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
            }
            z = b == avzr.VIDEO_QUALITY_SETTING_DATA_SAVER;
            return anfq.h(ywrVar2.b(new eou(z, 10)), new eou(z, 11), angq.a);
        }
        if (i == 2) {
            ywr ywrVar3 = this.a;
            final lox loxVar = (lox) obj;
            if ((loxVar.b & 4) == 0) {
                return anhv.a;
            }
            if (loxVar.e == -1) {
                return ywrVar3.b(loc.d);
            }
            return ywrVar3.b(new amml() { // from class: lok
                @Override // defpackage.amml
                public final Object apply(Object obj2) {
                    lox loxVar2 = lox.this;
                    aone builder = ((fof) obj2).toBuilder();
                    int i2 = loxVar2.e;
                    builder.copyOnWrite();
                    fof fofVar = (fof) builder.instance;
                    fofVar.b |= 4;
                    fofVar.e = i2;
                    return (fof) builder.build();
                }
            });
        }
        return this.a.b(loc.c);
    }
}
