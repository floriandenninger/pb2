package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jna implements anfz {
    public final /* synthetic */ jne a;
    private final /* synthetic */ int b;

    public /* synthetic */ jna(jne jneVar, int i, byte[] bArr) {
        this.b = i;
        this.a = jneVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.b;
        if (i == 0) {
            ammw ammwVar = (ammw) obj;
            return this.a.a.b((Optional) ammwVar.a, (Optional) ammwVar.b);
        }
        if (i == 1) {
            ammw ammwVar2 = (ammw) obj;
            return this.a.a.a((Optional) ammwVar2.a, (Optional) ammwVar2.b);
        }
        if (i == 2) {
            ammw ammwVar3 = (ammw) obj;
            return this.a.a.c((Optional) ammwVar3.a, (Optional) ammwVar3.b);
        }
        ammw ammwVar4 = (ammw) obj;
        return this.a.a.d((Optional) ammwVar4.a, (Optional) ammwVar4.b);
    }
}
