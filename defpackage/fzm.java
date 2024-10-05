package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fzm {
    public String a;
    public aypy b;
    public fzo c;
    public Cfor d;
    private Boolean e;
    private RecyclerView f;
    private Boolean g;
    private Boolean h;

    public final fzn a() {
        Boolean bool;
        aypy aypyVar = this.b;
        if (aypyVar == null || (bool = this.e) == null || this.c == null || this.d == null || this.f == null || this.g == null || this.h == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" isFilterAppliedObservable");
            }
            if (this.e == null) {
                sb.append(" isFilterApplied");
            }
            if (this.c == null) {
                sb.append(" shownCallback");
            }
            if (this.d == null) {
                sb.append(" swipeRefreshUiController");
            }
            if (this.f == null) {
                sb.append(" recyclerView");
            }
            if (this.g == null) {
                sb.append(" isAccessibilityEnabled");
            }
            if (this.h == null) {
                sb.append(" shouldSkipHideAnimationOnAppStart");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new fzn(this.a, aypyVar, bool.booleanValue(), this.c, this.d, this.f, this.g.booleanValue(), this.h.booleanValue());
    }

    public final void b(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    public final void c(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    public final void d(RecyclerView recyclerView) {
        if (recyclerView == null) {
            throw new NullPointerException("Null recyclerView");
        }
        this.f = recyclerView;
    }

    public final void e(boolean z) {
        this.h = Boolean.valueOf(z);
    }
}
