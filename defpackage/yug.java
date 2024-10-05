package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yug extends yty {
    public yug(String str) {
        super(str);
    }

    @Override // defpackage.yty
    protected final boolean a(String str) {
        return !"Accept-Encoding".equalsIgnoreCase(str);
    }
}
