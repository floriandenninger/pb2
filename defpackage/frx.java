package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.youtube.R;
import java.util.WeakHashMap;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class frx implements View.OnClickListener, AdapterView.OnItemClickListener {
    public static final WeakHashMap a = new WeakHashMap();
    public final LayoutInflater b;
    public final frv c;
    private final Activity d;
    private final vh e;
    private View f;

    public frx(Activity activity) {
        this.d = activity;
        this.b = activity.getLayoutInflater();
        activity.getResources();
        frv frvVar = new frv(this);
        this.c = frvVar;
        vh vhVar = new vh(activity);
        this.e = vhVar;
        vhVar.f = (int) activity.getResources().getDimension(R.dimen.innertube_menu_width);
        vhVar.z();
        vhVar.e(frvVar);
        vhVar.m = this;
        a.put(this, null);
    }

    public final void a() {
        if (this.f != null) {
            this.f = null;
            this.e.k();
        }
    }

    public final void b(String str, frw frwVar) {
        frv frvVar = this.c;
        int size = frvVar.a.size();
        int i = frvVar.d;
        frvVar.d = i + 1;
        frt frtVar = new frt(Integer.valueOf(i), str, frwVar);
        frvVar.a.add(size, frtVar);
        frvVar.b.put(frtVar.a.intValue(), frtVar);
        frvVar.notifyDataSetChanged();
        frtVar.a.intValue();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.c.notifyDataSetChanged();
        this.f = view;
        this.e.f = (int) whu.t(this.d, whu.v(this.d, this.c, null), this.d.getResources().getDimension(R.dimen.innertube_menu_width_increment_dp));
        vh vhVar = this.e;
        vhVar.j = 8388661;
        vhVar.l = view;
        vhVar.s();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        View view2;
        frw frwVar = ((frt) this.c.c.get(i)).b.b;
        if (frwVar == null || (view2 = this.f) == null) {
            return;
        }
        frwVar.a(view2.getTag());
        a();
    }
}
