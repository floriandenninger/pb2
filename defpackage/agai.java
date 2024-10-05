package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agai implements amml {
    public final /* synthetic */ boolean a;
    private final /* synthetic */ int b;

    public /* synthetic */ agai(boolean z, int i) {
        this.b = i;
        this.a = z;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        int i = this.b;
        if (i == 0) {
            boolean z = this.a;
            aone builder = ((awwf) obj).toBuilder();
            builder.copyOnWrite();
            awwf awwfVar = (awwf) builder.instance;
            awwfVar.b |= 16;
            awwfVar.g = z;
            return (awwf) builder.build();
        }
        if (i == 1) {
            boolean z2 = this.a;
            aone builder2 = ((awwf) obj).toBuilder();
            builder2.copyOnWrite();
            awwf awwfVar2 = (awwf) builder2.instance;
            awwfVar2.b |= 64;
            awwfVar2.i = z2;
            return (awwf) builder2.build();
        }
        boolean z3 = this.a;
        aone builder3 = ((awwf) obj).toBuilder();
        builder3.copyOnWrite();
        awwf awwfVar3 = (awwf) builder3.instance;
        awwfVar3.b |= 256;
        awwfVar3.k = z3;
        return (awwf) builder3.build();
    }
}
