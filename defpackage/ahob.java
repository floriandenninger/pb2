package defpackage;

import android.opengl.GLES20;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ahob extends ahno {
    public final int h;
    public final int i;

    public ahob(String str, String str2) {
        super(str, str2);
        this.h = e("aTextureCoords");
        this.i = f("uBrightness");
    }

    @Override // defpackage.ahno
    public final void c(ahku ahkuVar) {
        ahkuVar.e.a(this.h);
        super.c(ahkuVar);
    }

    @Override // defpackage.ahno
    public final void d() {
        super.d();
        GLES20.glEnableVertexAttribArray(this.h);
        Boolean bool = ahkt.a;
    }

    @Override // defpackage.ahno
    public final void k() {
        super.k();
        GLES20.glDisableVertexAttribArray(this.h);
        Boolean bool = ahkt.a;
    }
}
