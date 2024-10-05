package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajhd {
    public final int a;
    public final float b;
    public final ajhb c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final float o;
    public final boolean p;
    private final boolean q;

    public ajhd() {
    }

    public ajhd(int i, float f, ajhb ajhbVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2, float f2, boolean z11, boolean z12) {
        this.a = i;
        this.b = f;
        this.c = ajhbVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = z9;
        this.m = z10;
        this.n = i2;
        this.o = f2;
        this.p = z11;
        this.q = z12;
    }

    public static ajhc a(ajhb ajhbVar) {
        amru amruVar;
        ajhc ajhcVar = new ajhc();
        amru amruVar2 = ajhe.a;
        int i = ((amvj) amruVar2).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ajhh) amruVar2.get(i2)).a(ajhcVar);
        }
        if (ajhbVar != null && (amruVar = (amru) ajhe.b.get(ajhbVar)) != null) {
            int size = amruVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((ajhh) amruVar.get(i3)).a(ajhcVar);
            }
        }
        return ajhcVar;
    }

    public final boolean equals(Object obj) {
        ajhb ajhbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajhd) {
            ajhd ajhdVar = (ajhd) obj;
            if (this.a == ajhdVar.a && Float.floatToIntBits(this.b) == Float.floatToIntBits(ajhdVar.b) && ((ajhbVar = this.c) != null ? ajhbVar.equals(ajhdVar.c) : ajhdVar.c == null) && this.d == ajhdVar.d && this.e == ajhdVar.e && this.f == ajhdVar.f && this.g == ajhdVar.g && this.h == ajhdVar.h && this.i == ajhdVar.i && this.j == ajhdVar.j && this.k == ajhdVar.k && this.l == ajhdVar.l && this.m == ajhdVar.m && this.n == ajhdVar.n && Float.floatToIntBits(this.o) == Float.floatToIntBits(ajhdVar.o) && this.p == ajhdVar.p && this.q == ajhdVar.q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int floatToIntBits = (((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003;
        ajhb ajhbVar = this.c;
        return ((((((((((((((((((((((((((((floatToIntBits ^ (ajhbVar == null ? 0 : ajhbVar.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ this.n) * 1000003) ^ Float.floatToIntBits(this.o)) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003) ^ (true == this.q ? 1231 : 1237);
    }

    public final String toString() {
        int i = this.a;
        float f = this.b;
        String valueOf = String.valueOf(this.c);
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        boolean z4 = this.g;
        boolean z5 = this.h;
        boolean z6 = this.i;
        boolean z7 = this.j;
        boolean z8 = this.k;
        boolean z9 = this.l;
        boolean z10 = this.m;
        int i2 = this.n;
        float f2 = this.o;
        boolean z11 = this.p;
        boolean z12 = this.q;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 567);
        sb.append("SurfaceConfig{lithoInitRange=");
        sb.append(i);
        sb.append(", lithoRangeRatio=");
        sb.append(f);
        sb.append(", surfaceName=");
        sb.append(valueOf);
        sb.append(", recyclerViewItemPrefetch=");
        sb.append(z);
        sb.append(", recyclerViewFixedSize=");
        sb.append(z2);
        sb.append(", recyclerViewDisableViewCache=");
        sb.append(z3);
        sb.append(", useIncrementalMountForRb=");
        sb.append(z4);
        sb.append(", useLegacyVisible=");
        sb.append(z5);
        sb.append(", horizontalCollectionTouchInterceptor=");
        sb.append(z6);
        sb.append(", useSwipeToCameraLocalElementsConfig=");
        sb.append(z7);
        sb.append(", useSizeSpecYouTubeElement=");
        sb.append(z8);
        sb.append(", useAsyncPresenterPreparation=");
        sb.append(z9);
        sb.append(", rebindAfterDetach=");
        sb.append(z10);
        sb.append(", asyncPrepareInitRange=");
        sb.append(i2);
        sb.append(", asyncPrepareRangeRatio=");
        sb.append(f2);
        sb.append(", useIncrementalMountForAsyncPrepare=");
        sb.append(z11);
        sb.append(", useFlatbufferRuntime=");
        sb.append(z12);
        sb.append("}");
        return sb.toString();
    }
}
