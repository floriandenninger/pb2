package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kah implements kbi {
    private final azrw a;
    private final /* synthetic */ int b;

    public kah(azrw azrwVar, int i, byte[] bArr) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public kah(azrw azrwVar, int i) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public kah(azrw azrwVar, int i, char[] cArr) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public kah(azrw azrwVar, int i, short[] sArr) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public kah(azrw azrwVar, int i, int[] iArr) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public kah(azrw azrwVar, int i, boolean[] zArr) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public kah(azrw azrwVar, int i, float[] fArr) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    public kah(azrw azrwVar, int i, byte[][] bArr) {
        this.b = i;
        azrwVar.getClass();
        this.a = azrwVar;
    }

    @Override // defpackage.kbi
    public final /* synthetic */ kbj a(ammv ammvVar) {
        switch (this.b) {
            case 0:
                jng jngVar = (jng) this.a.get();
                jngVar.getClass();
                return new kag(jngVar, ammvVar);
            case 1:
                jti jtiVar = (jti) this.a.get();
                jtiVar.getClass();
                return new kam(jtiVar, ammvVar, 1);
            case 2:
                jng jngVar2 = (jng) this.a.get();
                jngVar2.getClass();
                return new kak(jngVar2, 0);
            case 3:
                jti jtiVar2 = (jti) this.a.get();
                jtiVar2.getClass();
                return new kam(jtiVar2, ammvVar, 0);
            case 4:
                Context context = (Context) this.a.get();
                context.getClass();
                return new kan(context);
            case 5:
                jni jniVar = (jni) this.a.get();
                jniVar.getClass();
                return new kbc(jniVar, ammvVar);
            case 6:
                jti jtiVar3 = (jti) this.a.get();
                jtiVar3.getClass();
                return new kam(jtiVar3, ammvVar, 2);
            default:
                jti jtiVar4 = (jti) this.a.get();
                jtiVar4.getClass();
                return new kam(jtiVar4, ammvVar, 3);
        }
    }
}
