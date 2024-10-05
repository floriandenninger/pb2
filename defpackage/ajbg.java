package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajbg implements axqr {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final azrw d;
    private final /* synthetic */ int e;

    public ajbg(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i) {
        this.e = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
        this.d = azrwVar4;
    }

    public ajbg(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, byte[] bArr) {
        this.e = i;
        this.b = azrwVar;
        this.a = azrwVar2;
        this.d = azrwVar3;
        this.c = azrwVar4;
    }

    public ajbg(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, char[] cArr) {
        this.e = i;
        this.d = azrwVar;
        this.b = azrwVar2;
        this.a = azrwVar3;
        this.c = azrwVar4;
    }

    public ajbg(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, int[] iArr) {
        this.e = i;
        this.c = azrwVar;
        this.b = azrwVar2;
        this.d = azrwVar3;
        this.a = azrwVar4;
    }

    public ajbg(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, short[] sArr) {
        this.e = i;
        this.c = azrwVar;
        this.d = azrwVar2;
        this.a = azrwVar3;
        this.b = azrwVar4;
    }

    public ajbg(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4, int i, boolean[] zArr) {
        this.e = i;
        this.c = azrwVar;
        this.a = azrwVar2;
        this.b = azrwVar3;
        this.d = azrwVar4;
    }

    public static ajbg a(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new ajbg(azrwVar, azrwVar2, azrwVar3, azrwVar4, 0);
    }

    public static ajan b(Executor executor, azrw azrwVar, aifk aifkVar, acpl acplVar) {
        return new ajan(executor, azrwVar, aifkVar, acplVar);
    }

    public static ajbg c(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new ajbg(azrwVar, azrwVar2, azrwVar3, azrwVar4, 1, (byte[]) null);
    }

    public static ajbg d(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new ajbg(azrwVar, azrwVar2, azrwVar3, azrwVar4, 2, (char[]) null);
    }

    public static ajbg e(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, azrw azrwVar4) {
        return new ajbg(azrwVar, azrwVar2, azrwVar3, azrwVar4, 3, (short[]) null);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        int i = this.e;
        if (i == 0) {
            return new ajbf((Executor) this.a.get(), (ajay) ((axqs) this.b).a, (shf) this.c.get(), (aaea) this.d.get());
        }
        if (i == 1) {
            return b((Executor) this.b.get(), this.a, (aifk) this.d.get(), (acpl) this.c.get());
        }
        if (i == 2) {
            ajgq ajgqVar = (ajgq) this.d.get();
            akto aktoVar = (akto) this.b.get();
            return Boolean.valueOf(ahbn.q(ajgqVar, aktoVar));
        }
        if (i == 3) {
            return akbc.y((Context) ((axqs) this.c).a, (anib) this.d.get(), ((yjv) this.a).b(), (vfg) this.b.get());
        }
        if (i == 4) {
            return new alqq((alqy) this.c.get(), (alqn) this.b.get(), (alqm) this.d.get(), (alra) this.a.get());
        }
        return new alrm(((alqs) this.c).get(), (File) this.a.get(), (alqm) this.b.get(), axqq.a(this.d));
    }
}
