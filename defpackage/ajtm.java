package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajtm implements Runnable {
    final /* synthetic */ ajtn a;

    public ajtm(ajtn ajtnVar) {
        this.a = ajtnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ajtn ajtnVar = this.a;
        ajtz ajtzVar = ajtnVar.c;
        ajtzVar.ad(ajtnVar.b, null, adpt.k, ajtzVar.X(), new ajts(true));
    }
}
