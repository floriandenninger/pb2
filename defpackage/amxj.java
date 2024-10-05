package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amxj extends amxf {
    private static final amxy b = new amxy((byte[]) null);

    public amxj(amyp amypVar) {
        super(amypVar);
    }

    @Deprecated
    public static amxj l(String str) {
        anaf.e(!str.isEmpty(), "injected class name is empty");
        return new amxj(amzn.d(str.replace('/', '.')));
    }

    @Override // defpackage.amxf
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final amxh a(Level level) {
        boolean j = j(level);
        amzn.n(h(), level, j);
        return !j ? b : new amxi(this, level);
    }
}
