package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahhx implements ahgb {
    final /* synthetic */ ahhy a;
    final /* synthetic */ ahlr b;

    public ahhx(ahhy ahhyVar, ahlr ahlrVar) {
        this.a = ahhyVar;
        this.b = ahlrVar;
    }

    @Override // defpackage.ahgb
    public final void a() {
        ahhy ahhyVar = this.a;
        ahhyVar.e = true;
        ahhyVar.c();
        ahlr ahlrVar = this.b;
        boolean z = this.a.e;
        ahlv ahlvVar = ahlrVar.a;
        ahlz ahlzVar = ahlrVar.b;
        if (z) {
            ahlzVar.a(ahlvVar.h);
        }
    }
}
