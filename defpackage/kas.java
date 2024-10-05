package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kas implements kbi {
    private final azrw a;
    private final azrw b;
    private final /* synthetic */ int c;

    public kas(azrw azrwVar, azrw azrwVar2, int i, byte[] bArr) {
        this.c = i;
        azrwVar.getClass();
        this.b = azrwVar;
        this.a = azrwVar2;
    }

    public kas(azrw azrwVar, azrw azrwVar2, int i) {
        this.c = i;
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    public kas(azrw azrwVar, azrw azrwVar2, int i, char[] cArr) {
        this.c = i;
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    public kas(azrw azrwVar, azrw azrwVar2, int i, short[] sArr) {
        this.c = i;
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
    }

    @Override // defpackage.kbi
    public final /* synthetic */ kbj a(ammv ammvVar) {
        int i = this.c;
        if (i == 0) {
            Context context = (Context) this.a.get();
            context.getClass();
            jni jniVar = (jni) this.b.get();
            jniVar.getClass();
            return new kar(context, jniVar);
        }
        if (i == 1) {
            jti jtiVar = (jti) this.b.get();
            jtiVar.getClass();
            fiu fiuVar = (fiu) this.a.get();
            fiuVar.getClass();
            return new jzz(jtiVar, fiuVar, ammvVar);
        }
        if (i == 2) {
            Context context2 = (Context) this.a.get();
            context2.getClass();
            jni jniVar2 = (jni) this.b.get();
            jniVar2.getClass();
            return new kav(context2, jniVar2, ammvVar, 0);
        }
        if (i == 3) {
            Context context3 = (Context) this.a.get();
            context3.getClass();
            jni jniVar3 = (jni) this.b.get();
            jniVar3.getClass();
            return new kav(context3, jniVar3, ammvVar, 2);
        }
        if (i != 4) {
            jti jtiVar2 = (jti) this.b.get();
            jtiVar2.getClass();
            fjs fjsVar = (fjs) this.a.get();
            fjsVar.getClass();
            return new kbg(jtiVar2, fjsVar);
        }
        jti jtiVar3 = (jti) this.b.get();
        jtiVar3.getClass();
        aahv aahvVar = (aahv) this.a.get();
        aahvVar.getClass();
        return new kbe(jtiVar3, aahvVar, ammvVar);
    }

    public kas(azrw azrwVar, azrw azrwVar2, int i, int[] iArr) {
        this.c = i;
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
    }

    public kas(azrw azrwVar, azrw azrwVar2, int i, boolean[] zArr) {
        this.c = i;
        azrwVar.getClass();
        this.b = azrwVar;
        this.a = azrwVar2;
    }
}
