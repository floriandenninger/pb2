package defpackage;

import android.opengl.GLES20;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahnp extends ahno {
    public final int b;

    public ahnp(ahod ahodVar) {
        super(ahodVar.a(R.raw.gl_color_program_vert), ahodVar.a(R.raw.gl_color_program_frag));
        this.b = e("aColor");
    }

    @Override // defpackage.ahno
    public final void d() {
        super.d();
        GLES20.glEnableVertexAttribArray(this.b);
        Boolean bool = ahkt.a;
    }

    @Override // defpackage.ahno
    public final void k() {
        super.k();
        GLES20.glDisableVertexAttribArray(this.b);
        Boolean bool = ahkt.a;
    }
}
