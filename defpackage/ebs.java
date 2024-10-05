package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ebs extends ecl {
    public ebs(ebe ebeVar, aone aoneVar, int i) {
        super(ebeVar, "NSYe0Ak7CUXd9zFZA3bczJ8pTgBK/kfUu9ICpHR+lQrTNc8+V7Owo49e2WIp0407", "Ux7t0A/7z2bV/IDvLZJgV4tTxr0Vvc1KngWKlG2Szwg=", aoneVar, i, 24);
    }

    private final void c() {
        pvh b = this.a.b();
        if (b != null) {
            try {
                pvg d = b.d();
                String d2 = ebg.d(d.a);
                if (d2 != null) {
                    synchronized (this.g) {
                        aone aoneVar = this.g;
                        aoneVar.copyOnWrite();
                        dvo dvoVar = (dvo) aoneVar.instance;
                        dvo dvoVar2 = dvo.a;
                        dvoVar.d |= 512;
                        dvoVar.ab = d2;
                        aone aoneVar2 = this.g;
                        boolean z = d.b;
                        aoneVar2.copyOnWrite();
                        dvo dvoVar3 = (dvo) aoneVar2.instance;
                        dvoVar3.d |= 2048;
                        dvoVar3.ad = z;
                        aone aoneVar3 = this.g;
                        aoneVar3.copyOnWrite();
                        dvo dvoVar4 = (dvo) aoneVar3.instance;
                        dvoVar4.ac = 5;
                        dvoVar4.d |= 1024;
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.ecl
    protected final void a() {
        if (!this.a.l) {
            synchronized (this.g) {
                aone aoneVar = this.g;
                String str = (String) this.d.invoke(null, this.a.a);
                aoneVar.copyOnWrite();
                dvo dvoVar = (dvo) aoneVar.instance;
                dvo dvoVar2 = dvo.a;
                str.getClass();
                dvoVar.d |= 512;
                dvoVar.ab = str;
            }
            return;
        }
        c();
    }

    @Override // defpackage.ecl, java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        kt();
        return null;
    }

    @Override // defpackage.ecl
    public final void kt() {
        ebe ebeVar = this.a;
        if (ebeVar.n) {
            super.kt();
        } else if (ebeVar.l) {
            c();
        }
    }
}
