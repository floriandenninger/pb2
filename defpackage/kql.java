package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class kql implements amml {
    private final long a;

    public kql(long j) {
        this.a = j;
    }

    @Override // defpackage.amml
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        kqs kqsVar = (kqs) obj;
        aone builder = kqsVar.toBuilder();
        long j = this.a;
        builder.copyOnWrite();
        kqs kqsVar2 = (kqs) builder.instance;
        kqsVar2.b |= 4;
        kqsVar2.e = j;
        long j2 = kqsVar.f;
        builder.copyOnWrite();
        kqs kqsVar3 = (kqs) builder.instance;
        kqsVar3.b |= 8;
        kqsVar3.f = j2 + 1;
        return (kqs) builder.build();
    }
}
