package defpackage;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jpd implements jpr {
    private final ayqi a;
    private final axzf b;

    public jpd(ayqi ayqiVar, axzf axzfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = ayqiVar;
        this.b = axzfVar;
    }

    @Override // defpackage.jpr
    public final aypy b() {
        asvu asvuVar = this.b.a.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        long j = asvuVar.bf;
        if (j <= 0) {
            j = 60;
        }
        long j2 = j;
        return aypy.V(j2, j2, TimeUnit.SECONDS, this.a).ab(this.a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof jpd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{60L});
    }
}
