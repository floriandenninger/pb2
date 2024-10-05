package defpackage;

import java.util.Map;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aalu {
    public final Map a;
    private final amrz b;

    public aalu(Map map) {
        this.a = map;
        amrw amrwVar = new amrw();
        for (Map.Entry entry : map.entrySet()) {
            amrwVar.g(((aalb) entry.getValue()).c(), (Long) entry.getKey());
        }
        this.b = amrwVar.c();
    }

    public static int a(String str) {
        try {
            return aalt.a(str);
        } catch (IllegalArgumentException unused) {
            return CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        }
    }

    public final long b(Class cls) {
        return ((Long) this.b.getOrDefault(cls, -2147483648L)).longValue();
    }

    public final whu c(String str, byte[] bArr) {
        long a = a(str);
        if (a == -2147483648L) {
            return aalf.b(str, bArr);
        }
        aalb aalbVar = (aalb) this.a.get(Long.valueOf(a));
        if (aalbVar == null) {
            return aalf.b(str, bArr);
        }
        return aalbVar.b(bArr);
    }
}
