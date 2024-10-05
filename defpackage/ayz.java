package defpackage;

import androidx.media3.common.decoder.CryptoConfig;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayz implements CryptoConfig {
    public static final boolean a;
    public final UUID b;
    public final byte[] c;

    static {
        boolean z = true;
        if (!"Amazon".equals(pts.c) || (!"AFTM".equals(pts.d) && !"AFTB".equals(pts.d))) {
            z = false;
        }
        a = z;
    }

    public ayz(UUID uuid, byte[] bArr) {
        this.b = uuid;
        this.c = bArr;
    }
}
