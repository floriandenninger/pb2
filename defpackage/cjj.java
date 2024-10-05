package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjj implements ciz {
    public final Path.FillType a;
    public final String b;
    public final cik c;
    public final cin d;
    public final boolean e;
    private final boolean f;

    public cjj(String str, boolean z, Path.FillType fillType, cik cikVar, cin cinVar, boolean z2) {
        this.b = str;
        this.f = z;
        this.a = fillType;
        this.c = cikVar;
        this.d = cinVar;
        this.e = z2;
    }

    @Override // defpackage.ciz
    public final cgo a(cfz cfzVar, cjp cjpVar) {
        return new cgs(cfzVar, cjpVar, this);
    }

    public final String toString() {
        boolean z = this.f;
        StringBuilder sb = new StringBuilder(36);
        sb.append("ShapeFill{color=, fillEnabled=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }
}
