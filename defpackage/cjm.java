package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjm implements ciz {
    public final String a;
    public final cil b;
    public final List c;
    public final cik d;
    public final cin e;
    public final cil f;
    public final float g;
    public final boolean h;
    public final int i;
    public final int j;

    public cjm(String str, cil cilVar, List list, cik cikVar, cin cinVar, cil cilVar2, int i, int i2, float f, boolean z) {
        this.a = str;
        this.b = cilVar;
        this.c = list;
        this.d = cikVar;
        this.e = cinVar;
        this.f = cilVar2;
        this.i = i;
        this.j = i2;
        this.g = f;
        this.h = z;
    }

    @Override // defpackage.ciz
    public final cgo a(cfz cfzVar, cjp cjpVar) {
        return new chd(cfzVar, cjpVar, this);
    }
}
