package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wcs implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String[] c;
    final /* synthetic */ wcu d;

    public wcs(wcu wcuVar, String str, String str2, String[] strArr) {
        this.d = wcuVar;
        this.a = str;
        this.b = str2;
        this.c = strArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a.getWritableDatabase().delete(this.a, this.b, this.c);
        this.d.b.open();
    }
}
