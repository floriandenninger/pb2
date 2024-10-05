package defpackage;

import android.text.TextUtils;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gcm extends akca {
    public Boolean a;
    public akbl b;
    private Boolean c;
    private Boolean d;
    private Integer e;
    private CharSequence f;
    private CharSequence g;
    private View.OnClickListener h;

    @Override // defpackage.akca
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gcq b() {
        Integer num = this.e;
        if (num == null) {
            throw new IllegalStateException("Property \"duration\" has not been set");
        }
        if (num.intValue() == -1 && !TextUtils.isEmpty(this.g)) {
            d(0);
        }
        Boolean bool = this.c;
        if (bool == null || this.d == null || this.a == null || this.e == null || this.f == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" rateLimited");
            }
            if (this.d == null) {
                sb.append(" shownOnFullscreen");
            }
            if (this.a == null) {
                sb.append(" counterfactual");
            }
            if (this.e == null) {
                sb.append(" duration");
            }
            if (this.f == null) {
                sb.append(" text");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new gcq(bool.booleanValue(), this.d.booleanValue(), this.a.booleanValue(), this.e.intValue(), this.f, this.g, this.h, this.b);
    }

    @Override // defpackage.akbm
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void d(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.akca
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void j(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    @Override // defpackage.akca
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void k(CharSequence charSequence) {
        if (charSequence == null) {
            throw new NullPointerException("Null text");
        }
        this.f = charSequence;
    }

    @Override // defpackage.akca
    protected final /* synthetic */ void h(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    @Override // defpackage.akca
    protected final /* synthetic */ void i(CharSequence charSequence) {
        this.g = charSequence;
    }

    @Override // defpackage.akca
    public final /* synthetic */ void l(akbl akblVar) {
        this.b = akblVar;
    }
}
