package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bjt implements biz {
    final /* synthetic */ biz a;
    final /* synthetic */ bju b;

    public bjt(bju bjuVar, biz bizVar) {
        this.b = bjuVar;
        this.a = bizVar;
    }

    @Override // defpackage.biz
    public final long a() {
        return this.a.a();
    }

    @Override // defpackage.biz
    public final bix b(long j) {
        bix b = this.a.b(j);
        bja bjaVar = b.a;
        bja bjaVar2 = new bja(bjaVar.b, bjaVar.c + this.b.a);
        bja bjaVar3 = b.b;
        return new bix(bjaVar2, new bja(bjaVar3.b, bjaVar3.c + this.b.a));
    }

    @Override // defpackage.biz
    public final boolean c() {
        return this.a.c();
    }
}
