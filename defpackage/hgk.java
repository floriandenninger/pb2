package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsPlayerView;
import com.google.android.youtube.R;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hgk implements hhz {
    public final hgo a;
    public final hik b;
    public final azrl c;
    public akcv d;
    public Long e = null;
    private final Context f;
    private final SortedMap g;

    public hgk(ce ceVar, Map map, hgo hgoVar, hik hikVar) {
        this.f = ceVar.qW();
        this.a = hgoVar;
        TreeMap treeMap = new TreeMap();
        this.g = treeMap;
        treeMap.putAll(map);
        this.b = hikVar;
        this.c = azrl.e();
    }

    @Override // defpackage.hhz
    public final aypy a() {
        return this.c.U();
    }

    @Override // defpackage.hhz
    public final boolean b(axdk axdkVar, View view) {
        yjk.f();
        boolean z = false;
        if (this.g.isEmpty() || !axdkVar.y()) {
            akcv akcvVar = this.d;
            if (akcvVar == null) {
                return false;
            }
            if (akcvVar.i()) {
                c(true);
                return true;
            }
            zga.b("STooltipCntr: Unexpected - Tooltip is not null but it's not showing");
            return false;
        }
        if (this.d != null) {
            Long l = this.e;
            if (l == null || l.longValue() != axdkVar.e()) {
                c(false);
            } else {
                c(true);
                return true;
            }
        }
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f).inflate(R.layout.shorts_edit_popup, (ViewGroup) null);
        final View Q = etx.Q(this.f, view.getMeasuredWidth(), view.getMeasuredHeight(), ((ShortsPlayerView) view).g, axdkVar.g().e);
        akcv akcvVar2 = new akcv(viewGroup, Q, 2, 2, 2, R.style.ShortsEditTooltip);
        this.d = akcvVar2;
        akcvVar2.d(false);
        for (Map.Entry entry : this.g.entrySet()) {
            if (((hij) entry.getValue()).b(axdkVar) && this.d != null) {
                viewGroup.addView(((hij) entry.getValue()).a(viewGroup, axdkVar, this.d));
                z = true;
            }
        }
        if (z) {
            this.e = Long.valueOf(axdkVar.e());
            final ViewGroup viewGroup2 = (ViewGroup) view.getParent();
            viewGroup2.addView(Q);
            akcv akcvVar3 = this.d;
            if (akcvVar3 != null) {
                akcvVar3.f(new akcs() { // from class: hgi
                    @Override // defpackage.akcs
                    public final void a(int i) {
                        hgk hgkVar = hgk.this;
                        ViewGroup viewGroup3 = viewGroup2;
                        View view2 = Q;
                        hgkVar.d = null;
                        hgkVar.e = null;
                        if (i == 1) {
                            hgkVar.b.j(true);
                        }
                        viewGroup3.removeView(view2);
                        hgkVar.c.c(false);
                    }
                });
            }
            Q.getViewTreeObserver().addOnGlobalLayoutListener(new hgj(this, Q, view));
        }
        return z;
    }

    @Override // defpackage.hhz
    public final void c(boolean z) {
        akcv akcvVar = this.d;
        if (akcvVar == null || !akcvVar.i()) {
            return;
        }
        this.d.b(3);
        if (z) {
            this.b.j(false);
            this.a.f();
        }
    }
}
