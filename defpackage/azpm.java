package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azpm implements Runnable {
    final azpl a;
    final /* synthetic */ azpn b;

    public azpm(azpn azpnVar, azpl azplVar) {
        this.b = azpnVar;
        this.a = azplVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.d = true;
        this.b.a.remove(this.a);
    }
}
