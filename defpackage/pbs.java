package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pbs implements Runnable {
    final /* synthetic */ pbu a;
    final /* synthetic */ pbt b;

    public pbs(pbt pbtVar, pbu pbuVar) {
        this.b = pbtVar;
        this.a = pbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afbe afbeVar = this.b.b;
        pbu pbuVar = this.a;
        String str = afbeVar.b;
        StringBuilder sb = new StringBuilder(str.length() + 26);
        sb.append("Error with ");
        sb.append(str);
        sb.append(" audio decoder.");
        zga.d(sb.toString(), pbuVar);
    }
}
