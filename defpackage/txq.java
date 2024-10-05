package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class txq {
    public final txp a;

    public txq(txp txpVar) {
        this.a = txpVar;
    }

    private static final uzi e() {
        uzi b = uzi.b();
        b.c("reference");
        b.d("& ? > 0", 1L);
        return b;
    }

    public final List a(String str) {
        return this.a.a(str, amru.r(e().a()));
    }

    public final List b(String str, String str2) {
        uzi e = e();
        e.c(" AND ");
        e.c("group_id");
        e.d("=?", str2);
        return this.a.a(str, amru.r(e.a()));
    }

    public final List c(String str, String... strArr) {
        return this.a.a(str, tyo.c(e().a(), "thread_id", strArr));
    }

    public final void d(String str, String... strArr) {
        this.a.b(str, tyo.c(null, "thread_id", strArr));
    }
}
