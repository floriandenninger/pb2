package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amia extends amhg implements amht {
    static final amhs c = new amhs(null);
    private final amhs d;

    public amia() {
        super("", amhu.a.b());
        this.d = c;
    }

    @Override // defpackage.amht
    public final amir d(String str, amip amipVar, boolean z) {
        if (z) {
            WeakHashMap weakHashMap = amjw.a;
        }
        return new amib(str, this, amipVar, z);
    }

    @Override // defpackage.amht
    public final /* synthetic */ Exception e() {
        return this.d;
    }

    @Override // defpackage.amir
    public final amir f(String str, amip amipVar) {
        WeakHashMap weakHashMap = amjw.a;
        return d(str, amipVar, true);
    }

    @Override // defpackage.amir
    public final void g(boolean z) {
    }
}
