package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjk implements ciz {
    public final String a;
    public final List b;
    public final boolean c;

    public cjk(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.ciz
    public final cgo a(cfz cfzVar, cjp cjpVar) {
        return new cgp(cfzVar, cjpVar, this);
    }

    public final String toString() {
        String str = this.a;
        String arrays = Arrays.toString(this.b.toArray());
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28 + String.valueOf(arrays).length());
        sb.append("ShapeGroup{name='");
        sb.append(str);
        sb.append("' Shapes: ");
        sb.append(arrays);
        sb.append('}');
        return sb.toString();
    }
}
