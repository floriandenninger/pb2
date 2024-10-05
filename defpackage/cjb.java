package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjb implements ciz {
    public final Path.FillType a;
    public final cim b;
    public final cin c;
    public final cip d;
    public final cip e;
    public final String f;
    public final boolean g;
    public final int h;

    public cjb(String str, int i, Path.FillType fillType, cim cimVar, cin cinVar, cip cipVar, cip cipVar2, boolean z) {
        this.h = i;
        this.a = fillType;
        this.b = cimVar;
        this.c = cinVar;
        this.d = cipVar;
        this.e = cipVar2;
        this.f = str;
        this.g = z;
    }

    @Override // defpackage.ciz
    public final cgo a(cfz cfzVar, cjp cjpVar) {
        return new cgt(cfzVar, cjpVar, this);
    }
}
