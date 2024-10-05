package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahis implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ ahix c;

    public ahis(ahix ahixVar, float f, float f2) {
        this.c = ahixVar;
        this.a = f;
        this.b = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ahix ahixVar = this.c;
        float f = this.a;
        float f2 = this.b;
        afgr afgrVar = ahixVar.f;
        long round = Math.round(Math.toDegrees(f));
        long round2 = Math.round(Math.toDegrees(f2));
        StringBuilder sb = new StringBuilder(23);
        sb.append((int) round);
        sb.append(":");
        sb.append((int) round2);
        afgrVar.a(sb.toString());
    }
}
