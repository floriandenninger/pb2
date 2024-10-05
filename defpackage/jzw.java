package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jzw implements kbi {
    private final azrw a;
    private final azrw b;

    public jzw(azrw azrwVar, azrw azrwVar2) {
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    @Override // defpackage.kbi
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final kav a(ammv ammvVar) {
        Context context = (Context) this.a.get();
        context.getClass();
        jni jniVar = (jni) this.b.get();
        jniVar.getClass();
        return new kav(context, jniVar, ammvVar, 1);
    }
}
