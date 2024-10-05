package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aezl implements aezs {
    final aezk a;
    final /* synthetic */ aezt b;

    public aezl(aezt aeztVar, aezk aezkVar) {
        this.b = aeztVar;
        this.a = aezkVar;
    }

    @Override // defpackage.aezs
    public final int b() {
        int a = a();
        if (a == 1) {
            return 0;
        }
        return this.b.a.a(a - 1);
    }

    @Override // defpackage.aezs
    public final /* synthetic */ long c() {
        return -9223372036854775807L;
    }

    @Override // defpackage.aezs
    public boolean e() {
        throw null;
    }
}
