package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vmm {
    private final Map a = new HashMap();
    private final akht b;

    public vmm(akht akhtVar, byte[] bArr, byte[] bArr2) {
        this.b = akhtVar;
    }

    public final vmz a(String str) {
        if (!this.a.containsKey(str)) {
            this.a.put(str, this.b.c(3, ammv.j(str), awzb.OBAKE_GOOGLE_PHOTOS_CLUSTER_PHOTO_SUGGESTIONS, awzb.OBAKE_GOOGLE_PHOTOS_PROMOTABLE_CLUSTER_PHOTO_SUGGESTIONS));
        }
        return (vmz) this.a.get(str);
    }
}
