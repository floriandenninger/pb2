package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ygq {
    final TextView a;
    final ImageView b;
    final ImageView c;
    final TextView d;
    final TextView e;
    final View f;
    final View g;
    final TextView h;
    public final int i;
    public final ajyf j;
    public final zbb k;
    public int[] l;
    final /* synthetic */ ygr m;

    public ygq(ygr ygrVar, int i) {
        this.m = ygrVar;
        this.i = i;
        if (i != 0) {
            this.g = c(R.layout.unlimited_page_header_v2).findViewById(R.id.unlimited_page_header);
        } else {
            this.g = c(R.layout.unlimited_page_header);
        }
        this.b = (ImageView) this.g.findViewById(R.id.promo_background);
        this.c = (ImageView) this.g.findViewById(R.id.promo_logo);
        this.a = (TextView) this.g.findViewById(R.id.promo_header_description);
        TextView textView = (TextView) this.g.findViewById(R.id.subscription_button);
        this.d = textView;
        this.e = (TextView) this.g.findViewById(R.id.metadata);
        View findViewById = this.g.findViewById(R.id.background_scrim);
        this.f = findViewById;
        this.j = ygrVar.e.a(textView);
        this.k = whu.Q(findViewById);
        this.h = (TextView) this.g.findViewById(R.id.promotion_text);
        textView.addOnLayoutChangeListener(akbc.e(textView, ygrVar.d.getResources().getDimensionPixelSize(R.dimen.price_icon_size)));
    }

    public static final avgg b(avgm avgmVar, boolean z) {
        if (avgmVar == null) {
            return null;
        }
        avgl avglVar = avgmVar.c;
        if (avglVar == null) {
            avglVar = avgl.a;
        }
        if (z) {
            avgg avggVar = avglVar.d;
            return avggVar == null ? avgg.a : avggVar;
        }
        avgg avggVar2 = avglVar.c;
        return avggVar2 == null ? avgg.a : avggVar2;
    }

    private final View c(int i) {
        return LayoutInflater.from(this.m.d).inflate(i, (ViewGroup) this.m.c, false);
    }

    public final void a(ImageView imageView, avgg avggVar) {
        if (avggVar != null) {
            this.m.a.h(imageView, avggVar);
        } else {
            this.m.a.e(imageView);
        }
    }
}
