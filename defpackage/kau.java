package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kau implements kbi {
    private final azrw a;
    private final azrw b;
    private final azrw c;
    private final /* synthetic */ int d;

    public kau(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, byte[] bArr) {
        this.d = i;
        azrwVar.getClass();
        this.b = azrwVar;
        this.c = azrwVar2;
        this.a = azrwVar3;
    }

    public kau(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i) {
        this.d = i;
        azrwVar.getClass();
        this.a = azrwVar;
        azrwVar2.getClass();
        this.b = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }

    @Override // defpackage.kbi
    public final /* synthetic */ kbj a(ammv ammvVar) {
        int i = this.d;
        if (i == 0) {
            Context context = (Context) this.a.get();
            context.getClass();
            jni jniVar = (jni) this.b.get();
            jniVar.getClass();
            jyu jyuVar = (jyu) this.c.get();
            jyuVar.getClass();
            return new kat(context, jniVar, jyuVar);
        }
        if (i != 1) {
            jti jtiVar = (jti) this.b.get();
            jtiVar.getClass();
            shf shfVar = (shf) this.a.get();
            shfVar.getClass();
            aahv aahvVar = (aahv) this.c.get();
            aahvVar.getClass();
            return new kbd(jtiVar, shfVar, aahvVar, ammvVar);
        }
        jti jtiVar2 = (jti) this.b.get();
        jtiVar2.getClass();
        fjs fjsVar = (fjs) this.c.get();
        fjsVar.getClass();
        axzf axzfVar = (axzf) this.a.get();
        axzfVar.getClass();
        return new kaa(jtiVar2, fjsVar, axzfVar, null, null, null, null);
    }

    public kau(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i, char[] cArr) {
        this.d = i;
        azrwVar.getClass();
        this.b = azrwVar;
        azrwVar2.getClass();
        this.a = azrwVar2;
        azrwVar3.getClass();
        this.c = azrwVar3;
    }
}
