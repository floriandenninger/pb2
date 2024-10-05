package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ygl extends ajpc {
    final ImageView a;
    final TextView b;
    final TextView c;
    final TextView d;
    final TextView e;
    final TextView f;
    final ImageView g;
    private final ajjz h;
    private final aahd i;
    private final ajut j;
    private final ViewGroup k;
    private final CardView l;
    private final FixedAspectRatioFrameLayout m;
    private final ajyf n;
    private final ajyf o;
    private final zbb p;
    private final View q;

    public ygl(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, ajyg ajygVar, ViewGroup viewGroup) {
        this.h = ajjzVar;
        this.i = aahdVar;
        this.j = ajutVar;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.subscription_product_upsell_offer_card, viewGroup, false);
        this.k = viewGroup2;
        CardView cardView = (CardView) viewGroup2.findViewById(R.id.card_view);
        this.l = cardView;
        FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = (FixedAspectRatioFrameLayout) cardView.findViewById(R.id.header_container);
        this.m = fixedAspectRatioFrameLayout;
        this.a = (ImageView) fixedAspectRatioFrameLayout.findViewById(R.id.header_image);
        View findViewById = fixedAspectRatioFrameLayout.findViewById(R.id.header_scrim);
        this.q = findViewById;
        this.g = (ImageView) fixedAspectRatioFrameLayout.findViewById(R.id.logo);
        this.b = (TextView) cardView.findViewById(R.id.title);
        this.c = (TextView) cardView.findViewById(R.id.description);
        this.d = (TextView) cardView.findViewById(R.id.additional_info);
        TextView textView = (TextView) cardView.findViewById(R.id.primary_button);
        this.e = textView;
        TextView textView2 = (TextView) cardView.findViewById(R.id.secondary_button);
        this.f = textView2;
        this.n = ajygVar.a(textView);
        this.o = ajygVar.a(textView2);
        this.p = whu.Q(findViewById);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.k;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d1  */
    @Override // defpackage.ajpc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajok r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygl.d(ajok, java.lang.Object):void");
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avam) obj).l.I();
    }
}
