package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gox implements gof {
    private final avgg a;
    private final String b;
    private final apxf c;
    private final apxf d;
    private final aqyg e;
    private final List f;
    private final boolean g;
    private final gok h;
    private final int i;

    public gox(int i, avgg avggVar, String str, apxf apxfVar, apxf apxfVar2, aqyg aqygVar, avfv[] avfvVarArr, boolean z, gok gokVar) {
        this.i = i;
        this.a = avggVar;
        this.b = str;
        this.c = apxfVar;
        this.d = apxfVar2;
        this.e = aqygVar;
        this.f = avfvVarArr == null ? null : Arrays.asList(avfvVarArr);
        this.g = z;
        this.h = gokVar;
    }

    public static gow n() {
        return new gow();
    }

    @Override // defpackage.gof
    public final gok a() {
        return this.h;
    }

    @Override // defpackage.gof
    public final apxf b() {
        return this.c;
    }

    @Override // defpackage.gof
    public final apxf c() {
        return this.d;
    }

    @Override // defpackage.gof
    public final aqyg d() {
        return this.e;
    }

    @Override // defpackage.gof
    public final avgg e() {
        return this.a;
    }

    @Override // defpackage.gof
    public final String f() {
        return this.b;
    }

    @Override // defpackage.gof
    public final List g() {
        return this.f;
    }

    @Override // defpackage.gof
    public final boolean h() {
        return this.g;
    }

    @Override // defpackage.gof
    public final /* synthetic */ boolean i() {
        return evr.bt(this);
    }

    @Override // defpackage.gof
    public final /* synthetic */ boolean j() {
        return evr.bu(this);
    }

    @Override // defpackage.gof
    public final /* synthetic */ boolean k(gof gofVar) {
        return evr.bv(this, gofVar);
    }

    @Override // defpackage.gof
    public final int l() {
        return this.i;
    }

    @Override // defpackage.gof
    public final /* synthetic */ void m() {
        evr.bw(this);
    }
}
