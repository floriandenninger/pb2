package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajhc {
    public Integer a;
    public Float b;
    public ajhb c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Boolean j;
    public Boolean k;
    public Boolean l;
    public Boolean m;
    public Integer n;
    public Float o;
    public Boolean p;
    private Boolean q;

    public final ajhd a() {
        Integer num = this.a;
        if (num == null || this.b == null || this.d == null || this.e == null || this.f == null || this.g == null || this.h == null || this.i == null || this.j == null || this.k == null || this.l == null || this.m == null || this.n == null || this.o == null || this.p == null || this.q == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a == null) {
                sb.append(" lithoInitRange");
            }
            if (this.b == null) {
                sb.append(" lithoRangeRatio");
            }
            if (this.d == null) {
                sb.append(" recyclerViewItemPrefetch");
            }
            if (this.e == null) {
                sb.append(" recyclerViewFixedSize");
            }
            if (this.f == null) {
                sb.append(" recyclerViewDisableViewCache");
            }
            if (this.g == null) {
                sb.append(" useIncrementalMountForRb");
            }
            if (this.h == null) {
                sb.append(" useLegacyVisible");
            }
            if (this.i == null) {
                sb.append(" horizontalCollectionTouchInterceptor");
            }
            if (this.j == null) {
                sb.append(" useSwipeToCameraLocalElementsConfig");
            }
            if (this.k == null) {
                sb.append(" useSizeSpecYouTubeElement");
            }
            if (this.l == null) {
                sb.append(" useAsyncPresenterPreparation");
            }
            if (this.m == null) {
                sb.append(" rebindAfterDetach");
            }
            if (this.n == null) {
                sb.append(" asyncPrepareInitRange");
            }
            if (this.o == null) {
                sb.append(" asyncPrepareRangeRatio");
            }
            if (this.p == null) {
                sb.append(" useIncrementalMountForAsyncPrepare");
            }
            if (this.q == null) {
                sb.append(" useFlatbufferRuntime");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ajhd(num.intValue(), this.b.floatValue(), this.c, this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.n.intValue(), this.o.floatValue(), this.p.booleanValue(), this.q.booleanValue());
    }

    public final void b(boolean z) {
        this.q = Boolean.valueOf(z);
    }
}
