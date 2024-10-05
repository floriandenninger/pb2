package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agpr {
    private final agkd a;
    private final Executor b;

    public agpr(agkd agkdVar, Executor executor) {
        this.a = agkdVar;
        this.b = executor;
    }

    public static final boolean e(agnv agnvVar, boolean z) {
        if (agnvVar.A() || agnvVar.C() || agnvVar.s()) {
            return false;
        }
        return agnvVar.x() || agnvVar.w() || !agnvVar.b() || !agnvVar.a() || z;
    }

    public final anhy a(agnv agnvVar) {
        agnvVar.getClass();
        return anfq.h(this.a.b(agnvVar.m()), new jit(agnvVar, 5), this.b);
    }

    public final anhy b(agnv agnvVar) {
        if (agnvVar == null || esv.g(agnvVar.m())) {
            return anaf.O(false);
        }
        return anfq.h(this.a.b(agnvVar.m()), new jit(agnvVar, 6), this.b);
    }

    public final anhy c(agnv agnvVar) {
        if (agnvVar == null || esv.g(agnvVar.m())) {
            return anaf.O(false);
        }
        return anfq.h(this.a.a(agnvVar.m()), new jit(agnvVar, 3), this.b);
    }

    public final anhy d(agnv agnvVar) {
        if (agnvVar == null || esv.g(agnvVar.m())) {
            return anaf.O(false);
        }
        return anfq.h(this.a.b(agnvVar.m()), new jit(agnvVar, 4), this.b);
    }
}
