package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class omz implements fxi {
    private final aahd a;
    private final ffh b;

    public omz(aahd aahdVar, aahd aahdVar2, fxj fxjVar) {
        this.a = aahdVar;
        this.b = (ffh) aahdVar2;
        if (fxjVar.b) {
            b();
        }
    }

    @Override // defpackage.fxi
    public final void a() {
        ffh ffhVar = this.b;
        aahd aahdVar = this.a;
        WeakReference weakReference = ffhVar.a;
        if (weakReference == null || weakReference.get() != aahdVar) {
            return;
        }
        ffhVar.a = null;
    }

    @Override // defpackage.fxi
    public final void b() {
        this.b.a = new WeakReference(this.a);
    }
}
