package defpackage;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Handler;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adbi {
    private long A;
    private ConnectivityManager B;
    private bpv C;
    public final ce a;
    public final azrw b;
    public final bph c;
    public final addy d;
    public final acra e;
    public final adcu f;
    public acra g;
    public Context h;
    public ScrollView i;
    public TextView j;
    public LinearLayout k;
    public List l;
    public View.OnClickListener m;
    public View n;
    public TextView o;
    public TextView p;
    public View q;
    public View r;
    public View s;
    public BroadcastReceiver t;
    boolean u;
    public Handler v;
    private final adch x;
    private final adlj y;
    private final shf z;
    private final Runnable D = new Runnable() { // from class: adbe
        @Override // java.lang.Runnable
        public final void run() {
            adbi.this.c();
        }
    };
    public final ji w = new adbf(this);

    public adbi(ce ceVar, azrw azrwVar, bph bphVar, addy addyVar, adch adchVar, adlj adljVar, shf shfVar, acra acraVar, adcu adcuVar) {
        this.a = ceVar;
        this.b = azrwVar;
        this.c = bphVar;
        this.d = addyVar;
        this.x = adchVar;
        this.y = adljVar;
        this.z = shfVar;
        this.e = acraVar;
        this.f = adcuVar;
    }

    private final void e(boolean z) {
        int orElse;
        if (z) {
            orElse = wbs.W(this.h, R.attr.ytThemedBlue).orElse(0);
        } else {
            orElse = wbs.W(this.h, R.attr.ytStaticBrandRed).orElse(0);
        }
        this.j.setBackgroundColor(orElse);
        this.k.setVisibility(true != z ? 8 : 0);
        View view = this.n;
        int i = true == z ? 8 : 0;
        view.setVisibility(i);
        this.o.setVisibility(i);
        this.p.setVisibility(i);
    }

    public final void a() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://support.google.com/youtube/answer/3230451"));
        try {
            this.a.C().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.a.C(), R.string.mdx_pref_pair_with_tv_no_browser_to_show_help_page, 1).show();
        }
    }

    public final void b(bpv bpvVar) {
        this.d.O(bpvVar);
        this.i.fullScroll(33);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int, boolean] */
    public final void c() {
        bpv bpvVar;
        View inflate;
        adbh adbhVar;
        acsc c;
        long c2 = this.z.c();
        long j = c2 - this.A;
        if (j < 300) {
            this.v.removeCallbacks(this.D);
            this.v.postDelayed(this.D, 300 - j);
            return;
        }
        this.A = c2;
        List a = this.x.a();
        int size = a.size();
        while (true) {
            size--;
            if (size < 0) {
                bpvVar = null;
                break;
            } else if (((bpv) a.get(size)).m()) {
                bpvVar = (bpv) a.remove(size);
                break;
            }
        }
        Collections.sort(a, unt.k);
        ?? r3 = 0;
        if (bpvVar != null) {
            a.add(0, bpvVar);
        }
        Resources resources = this.j.getResources();
        if (!a.isEmpty()) {
            e(true);
            if (bpvVar != null) {
                this.j.setText(Html.fromHtml(resources.getString(R.string.mdx_pref_pair_with_tv_header_connected, bpvVar.d)));
                if (!amkq.b(this.C, bpvVar)) {
                    zev.c(this.h, this.j, resources.getString(R.string.mdx_pref_pair_with_tv_header_connected_content_description, bpvVar.d));
                }
            } else {
                this.j.setText(R.string.mdx_pref_pair_with_tv_header_normal);
                bpv bpvVar2 = this.C;
                if (bpvVar2 != null) {
                    zev.c(this.h, this.j, resources.getString(R.string.mdx_pref_pair_with_tv_header_disconnected_content_description, bpvVar2.d));
                }
            }
        } else if (!this.u) {
            e(false);
            this.j.setText(R.string.mdx_pref_pair_with_tv_header_no_wifi);
            this.o.setText(R.string.mdx_pref_pair_with_tv_no_tvs_found_no_wifi_summary);
            this.p.setText(R.string.mdx_pref_pair_with_tv_no_tvs_found_no_wifi_button);
            this.g.n(new acqx(acsb.c(27851)));
        } else {
            e(false);
            this.j.setText(R.string.mdx_pref_pair_with_tv_header_with_wifi);
            this.o.setText(R.string.mdx_pref_pair_with_tv_no_tvs_found_with_wifi_summary);
            this.p.setText(R.string.mdx_pref_pair_with_tv_no_tvs_found_with_wifi_button);
            this.g.n(new acqx(acsb.c(27852)));
        }
        boolean isEmpty = this.y.c().isEmpty();
        boolean z = !isEmpty;
        int i = true != isEmpty ? 0 : 8;
        this.r.setVisibility(i);
        this.s.setVisibility(i);
        if (z) {
            this.g.n(new acqx(acsb.c(27853)));
        }
        this.q.setVisibility(bpvVar == null ? 0 : 8);
        if (bpvVar == null) {
            this.g.n(new acqx(acsb.c(27849)));
        }
        this.C = bpvVar;
        int childCount = this.k.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            } else {
                this.l.add(this.k.getChildAt(childCount));
            }
        }
        this.k.removeAllViews();
        LayoutInflater from = LayoutInflater.from(this.h);
        int i2 = 0;
        while (i2 < a.size()) {
            if (!this.l.isEmpty()) {
                inflate = (View) this.l.remove((int) r3);
                adbhVar = (adbh) inflate.getTag();
            } else {
                inflate = from.inflate(R.layout.mdx_pair_with_tv_row, this.k, (boolean) r3);
                adbhVar = new adbh(inflate, this.m);
                inflate.setTag(adbhVar);
            }
            bpv bpvVar3 = (bpv) a.get(i2);
            acra acraVar = this.g;
            bpv bpvVar4 = this.C;
            adbhVar.b.setText(bpvVar3.d);
            boolean m = bpvVar3.m();
            int i3 = bpvVar3.h;
            Resources resources2 = adbhVar.a.getResources();
            yny.z(adbhVar.a, yny.n(resources2.getDimensionPixelSize(m ? R.dimen.mdx_pair_with_tv_row_height_selected : R.dimen.mdx_pair_with_tv_row_height_unselected)), ViewGroup.LayoutParams.class);
            adbhVar.c.setVisibility(true != m ? 8 : 0);
            if (m) {
                c = acsb.c(27848);
            } else {
                c = acsb.c(27847);
            }
            acraVar.n(new acqx(c));
            adbhVar.d.setContentDescription(resources2.getString(true != m ? R.string.mdx_pref_pair_with_tv_link_button_content_description : R.string.mdx_pref_pair_with_tv_unlink_button_content_description));
            adbhVar.d.setTag(bpvVar3);
            if (m) {
                adbhVar.d.setText(R.string.mdx_pref_pair_with_tv_unlink_button);
            } else {
                adbhVar.d.setText(R.string.mdx_pref_pair_with_tv_link_button);
            }
            adbhVar.d.setVisibility(true != ((!m && bpvVar4 != null) || i3 == 1) ? 0 : 8);
            adbhVar.e.setVisibility(i3 != 1 ? 8 : 0);
            this.k.addView(inflate);
            i2++;
            r3 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d() {
        if (this.B == null) {
            this.B = (ConnectivityManager) this.h.getSystemService("connectivity");
        }
        NetworkInfo activeNetworkInfo = this.B.getActiveNetworkInfo();
        this.u = activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }
}
