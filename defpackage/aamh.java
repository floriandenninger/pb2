package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aamh {
    public final int a;
    public final int b;
    private final zgd c;

    public aamh(Uri uri, int i, int i2) {
        uri.getClass();
        this.c = new aamg(uri);
        this.a = i;
        this.b = i2;
    }

    public final Uri a() {
        return (Uri) this.c.get();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aamh) {
            aamh aamhVar = (aamh) obj;
            if (this.c.get() == null) {
                return aamhVar.c.get() == null;
            }
            if (((Uri) this.c.get()).equals(aamhVar.c.get()) && this.a == aamhVar.a && this.b == aamhVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.c.get() == null ? 0 : ((Uri) this.c.get()).hashCode()) + 31) * 31) + this.a) * 31) + this.b;
    }

    public aamh(avgf avgfVar) {
        avgfVar.getClass();
        this.c = new aamf(avgfVar.c);
        this.a = avgfVar.d;
        this.b = avgfVar.e;
    }
}
