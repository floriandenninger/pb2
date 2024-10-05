package defpackage;

import android.opengl.GLES20;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axiv implements bapq {
    private static final float[] d = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    public final axir a = new axir();
    public final baqo b;
    public volatile boolean c;

    public axiv() {
        baqo baqoVar = new baqo();
        this.b = baqoVar;
        baqoVar.b();
    }

    @Override // defpackage.bapq
    public final void a(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        axir axirVar = this.a;
        float[] fArr2 = d;
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        axirVar.a(i2, i3);
        bapq bapqVar = axirVar.b;
        bapa bapaVar = axirVar.a;
        bapqVar.a(i, fArr2, i2, i3, 0, 0, bapaVar.c, bapaVar.d);
        GLES20.glBindFramebuffer(36160, iArr[0]);
    }

    @Override // defpackage.bapq
    public final void b(int i, float[] fArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        axir axirVar = this.a;
        float[] fArr2 = d;
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        axirVar.a(i2, i3);
        bapq bapqVar = axirVar.b;
        bapa bapaVar = axirVar.a;
        bapqVar.b(i, fArr2, i2, i3, 0, 0, bapaVar.c, bapaVar.d);
        GLES20.glBindFramebuffer(36160, iArr[0]);
    }

    @Override // defpackage.bapq
    public final void c() {
        this.b.a();
        axir axirVar = this.a;
        axirVar.a.a();
        bapq bapqVar = axirVar.b;
        if (bapqVar != null) {
            bapqVar.c();
        }
        this.b.b();
    }
}
