package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aapn implements Runnable {
    final /* synthetic */ aapl a;
    final /* synthetic */ aapo b;

    public aapn(aapo aapoVar, aapl aaplVar) {
        this.b = aapoVar;
        this.a = aaplVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        for (askp askpVar : this.a.a()) {
            hashMap.put(askpVar.e, askpVar.c == 2 ? (String) askpVar.d : "");
        }
        this.b.b.b = hashMap;
        this.b.b.g();
    }
}
