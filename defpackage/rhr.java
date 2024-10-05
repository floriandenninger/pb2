package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rhr implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ Object c;
    final /* synthetic */ long d;
    final /* synthetic */ rid e;

    public rhr(rid ridVar, String str, String str2, Object obj, long j) {
        this.e = ridVar;
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.U(this.a, this.b, this.c, this.d);
    }
}
