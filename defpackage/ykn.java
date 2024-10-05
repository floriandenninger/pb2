package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ykn implements ykl {
    private volatile ykl a;

    private ykn(ykl yklVar) {
        this.a = yklVar;
    }

    public static ykn c(ykl yklVar) {
        return new ykn(yklVar);
    }

    @Override // defpackage.ykl
    public final void a(Object obj, Exception exc) {
        if (this.a == null) {
            return;
        }
        try {
            this.a.a(obj, exc);
        } catch (NullPointerException unused) {
        }
    }

    @Override // defpackage.ykl
    public final void b(Object obj, Object obj2) {
        if (this.a == null) {
            return;
        }
        try {
            this.a.b(obj, obj2);
        } catch (NullPointerException unused) {
        }
    }

    public final void d() {
        this.a = null;
    }

    public final boolean e() {
        return this.a == null;
    }
}
