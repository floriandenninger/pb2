package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eby extends ecl {
    private static volatile String h;
    private static final Object i = new Object();

    public eby(ebe ebeVar, aone aoneVar, int i2) {
        super(ebeVar, "FIES3RTkQwHbrKX6yNHRLvjdTy/vAwaHt4NSjNSY8AdC8m3WKKtOY2UmKZKAKB0T", "2LDOSJy2Fx9VBMC+bm+0OJly9nmnJoeXDwyJmbeZyYc=", aoneVar, i2, 1);
    }

    @Override // defpackage.ecl
    protected final void a() {
        aone aoneVar = this.g;
        aoneVar.copyOnWrite();
        dvo dvoVar = (dvo) aoneVar.instance;
        dvo dvoVar2 = dvo.a;
        dvoVar.b |= 1;
        dvoVar.e = "E";
        if (h == null) {
            synchronized (i) {
                if (h == null) {
                    h = (String) this.d.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            aone aoneVar2 = this.g;
            String str = h;
            aoneVar2.copyOnWrite();
            dvo dvoVar3 = (dvo) aoneVar2.instance;
            str.getClass();
            dvoVar3.b |= 1;
            dvoVar3.e = str;
        }
    }
}
