package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rhe implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ long d;
    final /* synthetic */ rff e;

    public rhe(rff rffVar, String str, String str2, String str3, long j) {
        this.e = rffVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.a;
        if (str == null) {
            this.e.a.i.m().u(this.b, null);
        } else {
            this.e.a.i.m().u(this.b, new rij(this.c, str, this.d));
        }
    }
}
