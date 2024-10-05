package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class axfh implements Runnable {
    final /* synthetic */ axfb a;
    final /* synthetic */ axfl b;

    public axfh(axfl axflVar, axfb axfbVar) {
        this.b = axflVar;
        this.a = axfbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afbe afbeVar = this.b.c;
        axfb axfbVar = this.a;
        String str = afbeVar.b;
        StringBuilder sb = new StringBuilder(str.length() + 50);
        sb.append("Error with ");
        sb.append(str);
        sb.append(" spatial audio renderer initialization.");
        zga.d(sb.toString(), axfbVar);
    }
}
