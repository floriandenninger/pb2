package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahnz extends ahob {
    public final int b;
    public final int d;

    public ahnz(ahod ahodVar) {
        super(ahodVar.a(R.raw.gl_streaming_texture_program_vert), ahodVar.a(R.raw.gl_streaming_texture_program_frag));
        this.b = f("uTexMultiplier");
        this.d = f("uTexOffset");
    }
}
