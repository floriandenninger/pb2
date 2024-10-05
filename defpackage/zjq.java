package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zjq implements anhh {
    final /* synthetic */ zjn a;
    final /* synthetic */ zjr b;

    public zjq(zjr zjrVar, zjn zjnVar) {
        this.b = zjrVar;
        this.a = zjnVar;
    }

    @Override // defpackage.anhh
    public final /* synthetic */ void b(Object obj) {
        zjp zjpVar = (zjp) obj;
        String str = zjr.a;
        String.valueOf(String.valueOf(zjpVar)).length();
        this.b.c = zjpVar;
        zjn zjnVar = this.a;
        long j = zjpVar.a;
        aone aoneVar = zjnVar.b;
        aoneVar.copyOnWrite();
        aqia aqiaVar = (aqia) aoneVar.instance;
        aqia aqiaVar2 = aqia.a;
        aqiaVar.c = 1;
        aqiaVar.b |= 8;
        aoneVar.copyOnWrite();
        aqia aqiaVar3 = (aqia) aoneVar.instance;
        aqiaVar3.b |= 64;
        aqiaVar3.e = (int) j;
        zjnVar.a();
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        zga.f(zjr.a, "Failed to fetch CPID", th);
        this.b.c = null;
        zjn zjnVar = this.a;
        aone aoneVar = zjnVar.b;
        aoneVar.copyOnWrite();
        aqia aqiaVar = (aqia) aoneVar.instance;
        aqia aqiaVar2 = aqia.a;
        aqiaVar.c = 2;
        aqiaVar.b |= 8;
        aoneVar.copyOnWrite();
        aqia aqiaVar3 = (aqia) aoneVar.instance;
        aqiaVar3.b |= 64;
        aqiaVar3.e = -1;
        zjnVar.a();
    }
}
