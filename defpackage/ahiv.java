package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahiv implements Runnable {
    final /* synthetic */ double a;
    final /* synthetic */ double b;
    final /* synthetic */ String c;
    final /* synthetic */ ahiw d;

    public ahiv(ahiw ahiwVar, double d, double d2, String str) {
        this.d = ahiwVar;
        this.a = d;
        this.b = d2;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afgr afgrVar = this.d.n;
        double d = this.a;
        double d2 = this.b;
        String str = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 50);
        sb.append(d);
        sb.append(":");
        sb.append(d2);
        sb.append(":");
        sb.append(str);
        afgrVar.a(sb.toString());
    }
}
