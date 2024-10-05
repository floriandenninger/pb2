package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class lrf implements amml {
    public final /* synthetic */ avzr a;
    private final /* synthetic */ int b;

    public /* synthetic */ lrf(avzr avzrVar, int i) {
        this.b = i;
        this.a = avzrVar;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        int i = this.b;
        if (i == 0) {
            avzr avzrVar = this.a;
            avzr b = avzr.b(((awvr) obj).m);
            if (b == null) {
                b = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
            }
            return Boolean.valueOf(b == avzrVar);
        }
        if (i == 1) {
            avzr avzrVar2 = this.a;
            aone builder = ((lox) obj).toBuilder();
            builder.copyOnWrite();
            lox loxVar = (lox) builder.instance;
            loxVar.c = avzrVar2.e;
            loxVar.b |= 1;
            return (lox) builder.build();
        }
        avzr avzrVar3 = this.a;
        avzr b2 = avzr.b(((awvr) obj).n);
        if (b2 == null) {
            b2 = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
        }
        return Boolean.valueOf(b2 == avzrVar3);
    }
}
