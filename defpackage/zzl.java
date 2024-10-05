package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zzl implements Comparable {
    public int a;
    public float b;
    public float c;

    public zzl(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final float a() {
        return this.c - this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        float a = a() - ((zzl) obj).a();
        if (Math.abs(a) < 0.001f) {
            return 0;
        }
        return a > 0.0f ? 1 : -1;
    }
}
