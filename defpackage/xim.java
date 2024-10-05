package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xim extends ahus implements xhx {
    public xla a;
    private final xkz b;
    private final xks c;
    private LinearLayout d;
    private ImageView e;
    private xjq f;
    private boolean g;

    public xim(Context context) {
        super(context);
        this.b = new xkz(context);
        this.c = new xks();
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ View a(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        LayoutInflater.from(context).inflate(R.layout.mdx_ad_overlay, frameLayout);
        this.d = (LinearLayout) frameLayout.findViewById(R.id.ad_text_and_ad_choices_button);
        this.e = (ImageView) frameLayout.findViewById(R.id.ad_choices);
        this.d.setOnClickListener(new xil(this));
        frameLayout.getWidth();
        return frameLayout;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ahuy
    public final /* bridge */ /* synthetic */ void d(Context context, View view) {
        ((FrameLayout) view).getWidth();
        if (ab(2)) {
            this.c.a(false);
        }
        if (ab(1)) {
            boolean z = this.f.e.b;
            if (this.g != z) {
                this.e.setVisibility(true != z ? 8 : 0);
                this.d.setEnabled(z);
                this.g = z;
            }
            boolean nt = nt();
            this.b.e(this.f.f, nt);
            this.c.e(Boolean.valueOf(this.f.b), nt);
        }
    }

    @Override // defpackage.xhx
    public final void nM(xla xlaVar) {
        this.a = xlaVar;
        this.b.f = xlaVar;
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return wbs.D(this.f, 1);
    }

    @Override // defpackage.xhx
    public final void qH(xjq xjqVar) {
        this.f = xjqVar;
        if (np()) {
            this.b.e(this.f.f, nt());
        }
        if (!nt()) {
            this.c.e(false, false);
            super.kV();
        } else {
            kX();
        }
        Z(1);
    }
}
