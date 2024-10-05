package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lgo {
    final lgn b;
    protected final ajss c;
    public WeakReference d;
    public final lgm a = new lgm();
    private final ajpd e = new ajpd();

    public lgo(ajss ajssVar) {
        this.c = ajssVar;
        lgn lgnVar = new lgn(this);
        this.b = lgnVar;
        ((ajox) ajssVar.g).rU(lgnVar);
    }

    public final void a(arev arevVar) {
        if (arevVar == null) {
            return;
        }
        this.e.clear();
        this.e.add(arevVar);
        this.c.L(this.e);
        int intValue = ((Integer) arevVar.pX(arer.c)).intValue();
        if (intValue == -1 || intValue >= arevVar.d.size()) {
            return;
        }
        lgm lgmVar = this.a;
        lgmVar.c = intValue;
        auoa auoaVar = ((arex) arevVar.d.get(intValue)).k;
        if (auoaVar == null) {
            auoaVar = auoa.a;
        }
        lgmVar.b = auoaVar;
    }
}
