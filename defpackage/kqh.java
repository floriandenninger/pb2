package defpackage;

import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kqh {
    public final trp a;

    public kqh(trp trpVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = trpVar;
    }

    public static final long d(kqs kqsVar) {
        if ((kqsVar.b & 2) != 0) {
            return kqsVar.d;
        }
        return -1L;
    }

    public final boolean a(kqs kqsVar) {
        return (kqsVar.b & 1) != 0 ? kqsVar.c : c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        AccessibilityManager a = zev.a(this.a.a);
        return a != null && a.isEnabled();
    }

    public final boolean c() {
        return zev.e(this.a.a);
    }
}
