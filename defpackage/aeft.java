package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeft implements Runnable {
    final /* synthetic */ aefw a;
    private final ath b;

    public aeft(aefw aefwVar, ath athVar) {
        this.a = aefwVar;
        this.b = athVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                ((aeis) this.a.c.b).n.N();
                this.a.a.h(this.b);
                ((aeis) this.a.c.b).n.ac();
                byte[] bArr = new byte[16384];
                if (!aefw.c(this.a.a.a())) {
                    throw new aefs(6, "Invalid UMP response received");
                }
                while (true) {
                    int g = this.a.a.g(bArr, 0, 16384);
                    if (g == -1) {
                        break;
                    }
                    aels aelsVar = this.a.c;
                    int i = aelsVar.d;
                    if (i < 100000) {
                        if (i == 0 && g > 0) {
                            ((aeis) aelsVar.b).n.Q();
                        }
                        int i2 = aelsVar.d + g;
                        aelsVar.d = i2;
                        if (i2 > 100000) {
                            ((aeis) aelsVar.b).n.O();
                        }
                    }
                    this.a.b.a(ByteBuffer.wrap(bArr, 0, g));
                }
                if (!this.a.b.b()) {
                    throw new aefs(6, "Hanging data during UMP parsing");
                }
                aels aelsVar2 = this.a.c;
                aelr aelrVar = aelsVar2.c;
                ovr ovrVar = aelrVar.c;
                if (ovrVar != null) {
                    try {
                        aelrVar.d(ovrVar);
                        aelrVar.c = null;
                    } catch (aelo e) {
                        aelrVar.a.e(e);
                    }
                }
                aelsVar2.b.j();
                try {
                    this.a.a.j();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                try {
                    this.a.a.j();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (aefs e2) {
            this.a.c.b(e2);
            try {
                this.a.a.j();
            } catch (IOException unused3) {
            }
        } catch (IOException e3) {
            aels aelsVar3 = this.a.c;
            String valueOf = String.valueOf(e3.getMessage());
            aelsVar3.b(new aefs(valueOf.length() != 0 ? "IO error ".concat(valueOf) : new String("IO error "), e3));
            try {
                this.a.a.j();
            } catch (IOException unused4) {
            }
        }
    }
}
