package defpackage;

import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amib extends amhg implements amht {
    private final Exception c;
    private final boolean d;

    public amib(String str, amht amhtVar, amip amipVar, boolean z) {
        super(str, amhtVar, amipVar);
        this.c = amhtVar.e();
        this.d = z;
    }

    @Override // defpackage.amht
    public final amir d(String str, amip amipVar, boolean z) {
        if (z && !this.d) {
            WeakHashMap weakHashMap = amjw.a;
        }
        boolean z2 = true;
        if ((!z || this.d) && !this.d) {
            z2 = false;
        }
        return new amib(str, this, amipVar, z2);
    }

    @Override // defpackage.amht
    public final Exception e() {
        return this.c;
    }

    @Override // defpackage.amir
    public final amir f(String str, amip amipVar) {
        return d(str, amipVar, true);
    }

    @Override // defpackage.amir
    public final void g(boolean z) {
    }

    public amib(String str, amip amipVar, boolean z) {
        super(str, amhu.a.b(), amipVar);
        this.c = amia.c;
        this.d = z;
    }
}
