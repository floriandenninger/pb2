package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rxx extends rxt implements rwa {
    public float e;
    public float f;
    public float g;
    public float h;
    private float i;
    private float j;

    public rxx(Object obj, CharSequence charSequence) {
        super(obj, charSequence);
    }

    public final void a(float f) {
        this.i = f;
        this.e = f;
    }

    public final void b(float f) {
        this.i = this.e;
        this.j = f;
    }

    public final void c(float f) {
        this.f = this.g;
        this.h = f;
    }

    @Override // defpackage.rwa
    public final void setAnimationPercent(float f) {
        this.e = rwq.a(this.i, this.j, f);
        this.g = rwq.a(this.f, this.h, f);
    }
}
