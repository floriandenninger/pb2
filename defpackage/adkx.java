package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class adkx implements Runnable {
    final /* synthetic */ adkz a;

    public adkx(adkz adkzVar) {
        this.a = adkzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        adkz adkzVar = this.a;
        adky adkyVar = adkzVar.g;
        if (adkyVar == null) {
            return;
        }
        int i = adkzVar.i;
        adkzVar.i = i + 1;
        adnd adndVar = (adnd) adkyVar;
        if (adndVar.aJ()) {
            adgj adgjVar = new adgj();
            adgjVar.a("senderSentTimeStamp", String.valueOf(adndVar.i.d()));
            adgjVar.a("interval", String.valueOf(i));
            adndVar.aA(adgf.HEARTBEAT, adgjVar);
        }
    }
}
