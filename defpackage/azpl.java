package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azpl implements Comparable {
    final Runnable a;
    final long b;
    final int c;
    volatile boolean d;

    public azpl(Runnable runnable, Long l, int i) {
        this.a = runnable;
        this.b = l.longValue();
        this.c = i;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        azpl azplVar = (azpl) obj;
        long j = this.b;
        long j2 = azplVar.b;
        int i = j < j2 ? -1 : j > j2 ? 1 : 0;
        if (i != 0) {
            return i;
        }
        int i2 = this.c;
        int i3 = azplVar.c;
        if (i2 < i3) {
            return -1;
        }
        return i2 > i3 ? 1 : 0;
    }
}
