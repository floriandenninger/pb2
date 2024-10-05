package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cty implements ctw {
    int a;
    public Bitmap.Config b;
    private final ctz c;

    public cty(ctz ctzVar) {
        this.c = ctzVar;
    }

    @Override // defpackage.ctw
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cty) {
            cty ctyVar = (cty) obj;
            if (this.a == ctyVar.a && ddn.m(this.b, ctyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Bitmap.Config config = this.b;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return cua.a(this.a, this.b);
    }
}
