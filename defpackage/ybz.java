package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PerksSectionRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ybz {
    public final View a;
    public final ScrollView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    private final ajut l;
    private final ajjz m;
    private final ImageView n;

    public ybz(Context context, ajut ajutVar, ajjz ajjzVar, View view) {
        this.l = ajutVar;
        this.m = ajjzVar;
        this.a = view.findViewById(R.id.header_container);
        this.n = (ImageView) view.findViewById(R.id.header_background);
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.perks_scroll_view);
        this.b = scrollView;
        this.e = (ImageView) view.findViewById(R.id.membership_icon);
        this.c = (ImageView) view.findViewById(R.id.channel_thumbnail);
        this.d = (ImageView) view.findViewById(R.id.viewer_thumbnail);
        Resources resources = context.getResources();
        this.f = resources.getDimensionPixelSize(R.dimen.membership_offer_header_minimum_size);
        this.g = resources.getDimensionPixelSize(R.dimen.membership_offer_header_maximum_size);
        this.h = resources.getDimensionPixelSize(R.dimen.membership_offer_header_with_perks_avatars_minimum_size);
        this.i = resources.getDimensionPixelSize(R.dimen.membership_offer_header_with_perks_avatars_maximum_size);
        this.j = resources.getDimensionPixelSize(R.dimen.membership_offer_header_with_perks_offer_minimum_size);
        this.k = resources.getDimensionPixelSize(R.dimen.membership_offer_header_with_perks_offer_maximum_size);
        scrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: yby
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                ybz ybzVar = ybz.this;
                float min = 1.0f - Math.min(1.0f, ybzVar.b.getScrollY() / (ybzVar.g - ybzVar.f));
                ybz.b(ybzVar.a, ybzVar.f, ybzVar.g, min, false);
                ybz.b(ybzVar.d, ybzVar.h, ybzVar.i, min, true);
                ybz.b(ybzVar.c, ybzVar.h, ybzVar.i, min, true);
                ybz.b(ybzVar.e, ybzVar.j, ybzVar.k, min, true);
                float f = min - 0.5f;
                float max = Math.max(0.0f, f + f);
                ybzVar.d.setAlpha(max);
                ybzVar.c.setAlpha(max);
                ybzVar.e.setAlpha(max);
            }
        });
    }

    public static final void b(View view, float f, float f2, float f3, boolean z) {
        zhh n;
        int i = (int) (f + (f3 * (f2 - f)));
        if (z) {
            n = yny.y(i, i);
        } else {
            n = yny.n(i);
        }
        yny.z(view, n, ViewGroup.LayoutParams.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c(ycl yclVar, aulq aulqVar) {
        if (!aulqVar.pY(PerksSectionRendererOuterClass.perksSectionRenderer)) {
            whu.I(yclVar.a, false);
        } else {
            yclVar.e((atty) aulqVar.pX(PerksSectionRendererOuterClass.perksSectionRenderer));
            whu.I(yclVar.a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(avgg avggVar, avgg avggVar2, avgg avggVar3, arfs arfsVar) {
        arfr arfrVar;
        this.m.h(this.n, avggVar);
        this.m.h(this.c, avggVar2);
        this.m.h(this.d, avggVar3);
        ajut ajutVar = this.l;
        if (arfsVar != null) {
            arfrVar = arfr.b(arfsVar.c);
            if (arfrVar == null) {
                arfrVar = arfr.UNKNOWN;
            }
        } else {
            arfrVar = arfr.UNKNOWN;
        }
        int a = ajutVar.a(arfrVar);
        this.e.setImageResource(a);
        whu.I(this.e, a != 0);
    }
}
