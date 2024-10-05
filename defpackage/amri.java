package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class amri extends amrz implements Map, amph {
    public static amrg b() {
        return new amrg();
    }

    @Override // defpackage.amph
    public final /* bridge */ /* synthetic */ amph a() {
        throw null;
    }

    public abstract amri c();

    @Override // defpackage.amrz
    public final /* bridge */ /* synthetic */ amrl d() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.amrz, java.util.Map, j$.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final amsx values() {
        return c().keySet();
    }

    @Override // defpackage.amrz
    Object writeReplace() {
        return new amrh(this);
    }
}
