package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeox implements afgj {
    private final String a;

    public aeox(String str) {
        this.a = str;
    }

    @Override // defpackage.afgj
    public final String a(long j) {
        if (this.a.length() > 85000) {
            try {
                return aear.f(Arrays.copyOf(Base64.decode(this.a, 11), 65000));
            } catch (IllegalArgumentException e) {
                afid.c(afic.DRM, e, "Error base64 decoding. Falling back to basic string trimming.", new Object[0]);
                return String.format("%.65000s", this.a);
            }
        }
        return this.a;
    }
}
