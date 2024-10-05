package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lac extends ajpc implements ypd {
    private final Context a;
    private final afsy b;
    private final azrw c;
    private final ypa d;
    private final View e;
    private final ProgressBar f;
    private final TextView g;
    private final TextView h;

    public lac(Context context, afsy afsyVar, azrw azrwVar, ypa ypaVar) {
        this.a = context;
        this.b = afsyVar;
        this.c = azrwVar;
        this.d = ypaVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.storage_info_view, (ViewGroup) null);
        this.e = inflate;
        this.g = (TextView) inflate.findViewById(R.id.storage_used);
        this.h = (TextView) inflate.findViewById(R.id.storage_free);
        this.f = (ProgressBar) inflate.findViewById(R.id.storage_bar);
        inflate.findViewById(R.id.legend_used).setBackground(h(R.attr.ytCallToAction));
        inflate.findViewById(R.id.legend_free).setBackground(h(R.attr.ytIconDisabled));
    }

    private final GradientDrawable h(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(wbs.Q(this.a, i));
        return gradientDrawable;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.d.m(this);
    }

    @Override // defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        this.d.g(this);
        g();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return null;
    }

    public final void g() {
        agej b;
        agna agnaVar = null;
        if (this.b.t() && (b = ((agof) this.c.get()).a().b()) != null) {
            agnaVar = b.b();
        }
        long a = agnaVar == null ? 0L : agnaVar.a();
        long H = yjk.H();
        this.f.setMax((int) yjj.A(a + H));
        long A = yjj.A(a);
        this.f.setProgress((int) A);
        Resources resources = this.a.getResources();
        this.g.setText(Html.fromHtml(resources.getString(R.string.storage_used, zhq.g(resources, A))));
        this.h.setText(Html.fromHtml(resources.getString(R.string.storage_free, zhq.g(resources, yjj.A(H)))));
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{agkm.class, agkn.class, agko.class, agkq.class, agks.class, agkt.class};
            case 0:
                g();
                return null;
            case 1:
                g();
                return null;
            case 2:
                g();
                return null;
            case 3:
                g();
                return null;
            case 4:
                g();
                return null;
            case 5:
                g();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
