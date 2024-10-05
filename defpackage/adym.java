package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.io.File;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adym extends afjb {
    private final Set a;
    private Uri b;
    private String c;
    private long d;
    private int e;

    public adym(Set set, int i) {
        super(new pht("CacheManager"), i);
        this.a = set;
    }

    private final boolean c() {
        String str = this.c;
        if (str == null) {
            return false;
        }
        for (phg phgVar : this.a) {
            phl c = phgVar.c(str, this.d);
            if (c != null) {
                if (c.d) {
                    File file = c.e;
                    if (file != null) {
                        Uri fromFile = Uri.fromFile(file);
                        long j = this.d;
                        long j2 = j - c.b;
                        long j3 = c.c - j2;
                        if (j3 <= 0) {
                            throw new EOFException();
                        }
                        super.h(new ath(fromFile, j, j2, j3, str, this.e));
                        return true;
                    }
                } else {
                    phgVar.j(c);
                }
            }
        }
        return false;
    }

    @Override // defpackage.afjb, defpackage.afiz, defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        int g = super.g(bArr, i, i2);
        if (g >= 0) {
            this.d += g;
            return g;
        }
        super.j();
        if (c()) {
            return g(bArr, i, i2);
        }
        return -1;
    }

    @Override // defpackage.afjb, defpackage.afiz, defpackage.ate
    public final long h(ath athVar) {
        this.b = athVar.a;
        this.c = athVar.i;
        this.d = athVar.g;
        this.e = athVar.j;
        c();
        return athVar.h;
    }

    @Override // defpackage.afiz, defpackage.ate
    public final Uri i() {
        return this.b;
    }

    @Override // defpackage.afiz, defpackage.ate
    public final void j() {
        this.b = null;
        super.j();
    }
}
