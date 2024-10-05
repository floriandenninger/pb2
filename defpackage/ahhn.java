package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahhn {
    final /* synthetic */ ahhp a;
    private final ahho b;

    public ahhn(ahhp ahhpVar, ahho ahhoVar) {
        this.a = ahhpVar;
        this.b = ahhoVar;
    }

    public final float a() {
        float f = this.a.b;
        if (f == 0.0f) {
            return -1.0f;
        }
        return (this.b.a[0] + (f / 2.0f)) / f;
    }

    public final boolean b() {
        ahhp ahhpVar = this.a;
        return ahhpVar.b != 0.0f && ahhpVar.c != 0.0f && Math.abs(this.b.a[0]) <= this.a.b / 2.0f && Math.abs(this.b.a[1]) <= this.a.c / 2.0f;
    }
}
