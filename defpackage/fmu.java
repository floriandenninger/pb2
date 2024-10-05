package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fmu {
    final Paint a;
    final Paint b;
    final Paint c;
    final Paint d;
    final Paint e;
    final int f;
    final Paint g;
    final int h;
    final int i;
    final int j;
    final int k;
    final Paint l;
    final int m;
    final int n;
    final int o;
    final int p;
    final int q;
    final int r;
    final boolean s;
    final gxl t;
    final int u;
    final int v;
    final int w;
    public final int x;
    public final boolean y;

    public fmu(Context context, aadw aadwVar) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.e = new Paint(1);
        this.o = resources.getDimensionPixelSize(R.dimen.inline_time_bar_chapters_scrubbing_height);
        this.p = resources.getDimensionPixelSize(R.dimen.inline_time_bar_for_timestamp_markers_height);
        this.q = resources.getDimensionPixelSize(R.dimen.inline_time_bar_for_expanded_timestamp_markers_height);
        apwy b = aadwVar.b();
        asvu asvuVar = b.e;
        boolean z = false;
        if ((asvuVar == null ? asvu.a : asvuVar).aF) {
            asvu asvuVar2 = b.e;
            if (!(asvuVar2 == null ? asvu.a : asvuVar2).bl) {
                z = true;
            }
        }
        this.s = z;
        this.f = yjk.K(displayMetrics, 4);
        Paint paint = new Paint();
        this.g = paint;
        paint.setColor(resources.getColor(R.color.inline_time_bar_ad_break_marker_color));
        this.h = resources.getDimensionPixelSize(R.dimen.timestamp_marker_width);
        this.k = resources.getDimensionPixelSize(R.dimen.timestamp_cluster_spacing);
        this.i = resources.getDimensionPixelSize(R.dimen.timestamp_marker_active_width);
        this.j = resources.getDimensionPixelSize(R.dimen.timestamp_cluster_gap_width);
        int color = resources.getColor(R.color.active_timestamp_marker_color);
        this.m = color;
        this.n = resources.getColor(R.color.non_active_timestamp_marker_color);
        Paint paint2 = new Paint(1);
        this.l = paint2;
        paint2.setColor(color);
        this.u = yjk.K(displayMetrics, 3);
        this.v = resources.getDimensionPixelSize(R.dimen.inline_time_bar_chapter_gap_width);
        this.w = resources.getDimensionPixelSize(R.dimen.inline_time_bar_scrubbing_chapter_gap_width);
        this.t = new gxl(resources);
        asvu asvuVar3 = b.e;
        this.y = (asvuVar3 == null ? asvu.a : asvuVar3).cs;
        asvu asvuVar4 = b.e;
        this.x = yjk.K(displayMetrics, (asvuVar4 == null ? asvu.a : asvuVar4).cr);
        asvu asvuVar5 = b.e;
        if ((asvuVar5 == null ? asvu.a : asvuVar5).aF) {
            asvu asvuVar6 = b.e;
            this.r = yjk.K(displayMetrics, (asvuVar6 == null ? asvu.a : asvuVar6).aG);
        } else {
            this.r = ViewConfiguration.get(context).getScaledTouchSlop();
        }
    }
}
