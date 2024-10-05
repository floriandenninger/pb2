package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amyi extends amyg {
    public amyi(amyp amypVar) {
        super(amypVar);
    }

    public static amyi m(String str) {
        return new amyi(amzn.d(str));
    }

    public static amyi n(String str) {
        return new amyi(new anae(str, Level.ALL));
    }

    public static amyi o() {
        return new amyi(amzn.d(amzn.g().b(amyi.class)));
    }

    @Override // defpackage.amxf
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final amyf a(Level level) {
        boolean j = j(level);
        amzn.n(h(), level, j);
        return !j ? b : new amyh(this, level);
    }
}
