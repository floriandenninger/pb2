package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akcr {
    public int a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public View.OnClickListener e;
    public CharSequence f;
    public View.OnClickListener g;
    public int h;
    public boolean i;
    public akhz j;
    public akhz k;
    private final View l;
    private int m;

    public akcr(View view) {
        this.l = view;
    }

    private static final void c(TextView textView, akhz akhzVar) {
        if (akhzVar == null) {
            return;
        }
        Resources resources = textView.getResources();
        textView.setTextColor(akhzVar.a);
        int i = akhzVar.b;
        whu.E(textView, i == 0 ? null : resources.getDrawable(i));
    }

    private static final void d(View view, View.OnClickListener onClickListener, akce akceVar) {
        view.setOnClickListener(new akcq(onClickListener, akceVar));
    }

    public final akce a() {
        akce akceVar;
        View inflate = View.inflate(this.l.getContext(), R.layout.tooltip_content_view, null);
        TextView textView = (TextView) inflate.findViewById(R.id.tooltip_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tooltip_description);
        TextView textView3 = (TextView) inflate.findViewById(R.id.action_button);
        TextView textView4 = (TextView) inflate.findViewById(R.id.dismiss_button);
        c(textView3, this.j);
        c(textView4, this.k);
        whu.G(textView, this.b);
        whu.G(textView2, this.c);
        whu.G(textView3, this.d);
        whu.G(textView4, this.f);
        whu.E(textView3, textView3.getBackground());
        whu.E(textView4, textView4.getBackground());
        if (textView.getVisibility() == 8) {
            yny.z(textView2, yny.v(0), ViewGroup.MarginLayoutParams.class);
        }
        if (this.i) {
            akceVar = new akce(inflate, this.a, this.l, this.m, this.h);
        } else {
            akceVar = new akce(inflate, this.a, this.l, this.m);
        }
        d(textView3, this.e, akceVar);
        d(textView4, this.g, akceVar);
        return akceVar;
    }

    public final void b() {
        this.m = 2;
    }
}
