package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qop extends UnsupportedOperationException {
    private final Feature a;

    public qop(Feature feature) {
        this.a = feature;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
