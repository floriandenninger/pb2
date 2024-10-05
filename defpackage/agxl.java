package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agxl implements agzm {
    final /* synthetic */ String a;
    final /* synthetic */ atrx b;
    final /* synthetic */ agno c;
    final /* synthetic */ byte[] d;
    final /* synthetic */ agxo e;

    public agxl(agxo agxoVar, String str, atrx atrxVar, agno agnoVar, byte[] bArr) {
        this.e = agxoVar;
        this.a = str;
        this.b = atrxVar;
        this.c = agnoVar;
        this.d = bArr;
    }

    @Override // defpackage.agzm
    public final void a() {
    }

    @Override // defpackage.agzm
    public final void b() {
        agxo agxoVar = this.e;
        String str = this.a;
        atrx atrxVar = this.b;
        agno agnoVar = this.c;
        byte[] bArr = this.d;
        agya agyaVar = agxoVar.e;
        agyaVar.a.m();
        this.e.l(agyaVar.b.a().i().C(str, atrxVar, agnoVar, bArr, -1, 2));
    }
}
