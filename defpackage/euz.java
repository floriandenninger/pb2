package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class euz implements ykl {
    final /* synthetic */ String a;
    final /* synthetic */ eva b;

    public euz(eva evaVar, String str) {
        this.b = evaVar;
        this.a = str;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        eva evaVar = this.b;
        String str = this.a;
        Bitmap a = fhe.a(evaVar.b, (Bitmap) obj2);
        if (str.equals(evaVar.j) && evaVar.m) {
            evaVar.k = str;
            dy dyVar = evaVar.l;
            if (dyVar != null) {
                dyVar.n(a);
                evaVar.d.notify(1005, evaVar.l.b());
            }
        }
    }
}
