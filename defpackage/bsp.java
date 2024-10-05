package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsp extends vw implements brx {
    public List d;
    private final PreferenceGroup e;
    private List f;
    private final List g;
    private final Runnable i = new bsm(this);
    private final Handler h = new Handler();

    public bsp(PreferenceGroup preferenceGroup) {
        this.e = preferenceGroup;
        preferenceGroup.D = this;
        this.f = new ArrayList();
        this.d = new ArrayList();
        this.g = new ArrayList();
        if (preferenceGroup instanceof PreferenceScreen) {
            q(((PreferenceScreen) preferenceGroup).d);
        } else {
            q(true);
        }
        y();
    }

    private final void A(List list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.b);
        }
        int k = preferenceGroup.k();
        for (int i = 0; i < k; i++) {
            Preference o = preferenceGroup.o(i);
            list.add(o);
            bso bsoVar = new bso(o);
            if (!this.g.contains(bsoVar)) {
                this.g.add(bsoVar);
            }
            if (o instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                if (preferenceGroup2.ad()) {
                    A(list, preferenceGroup2);
                }
            }
            o.D = this;
        }
    }

    private static final boolean B(PreferenceGroup preferenceGroup) {
        return preferenceGroup.c != Integer.MAX_VALUE;
    }

    private final List z(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int k = preferenceGroup.k();
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            Preference o = preferenceGroup.o(i2);
            if (o.z) {
                if (!B(preferenceGroup) || i < preferenceGroup.c) {
                    arrayList.add(o);
                } else {
                    arrayList2.add(o);
                }
                if (o instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) o;
                    if (!preferenceGroup2.ad()) {
                        continue;
                    } else if (!B(preferenceGroup) || !B(preferenceGroup2)) {
                        for (Preference preference : z(preferenceGroup2)) {
                            if (!B(preferenceGroup) || i < preferenceGroup.c) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    } else {
                        throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                    }
                } else {
                    i++;
                }
            }
        }
        if (B(preferenceGroup) && i > preferenceGroup.c) {
            brq brqVar = new brq(preferenceGroup.j, arrayList2, preferenceGroup.jT());
            brqVar.o = new bsn(this, preferenceGroup);
            arrayList.add(brqVar);
        }
        return arrayList;
    }

    @Override // defpackage.brx
    public final void a() {
        this.h.removeCallbacks(this.i);
        this.h.post(this.i);
    }

    @Override // defpackage.vw
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.vw
    public final int c(int i) {
        bso bsoVar = new bso(w(i));
        int indexOf = this.g.indexOf(bsoVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.g.size();
        this.g.add(bsoVar);
        return size;
    }

    @Override // defpackage.vw
    public final long mu(int i) {
        if (this.b) {
            return w(i).jT();
        }
        return -1L;
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        bsx bsxVar = (bsx) wvVar;
        Preference w = w(i);
        Drawable background = bsxVar.a.getBackground();
        Drawable drawable = bsxVar.t;
        if (background != drawable) {
            jw.O(bsxVar.a, drawable);
        }
        TextView textView = (TextView) bsxVar.E(R.id.title);
        if (textView != null && bsxVar.u != null && !textView.getTextColors().equals(bsxVar.u)) {
            textView.setTextColor(bsxVar.u);
        }
        w.qn(bsxVar);
    }

    public final Preference w(int i) {
        if (i < 0 || i >= b()) {
            return null;
        }
        return (Preference) this.d.get(i);
    }

    @Override // defpackage.vw
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final bsx f(ViewGroup viewGroup, int i) {
        bso bsoVar = (bso) this.g.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, bsy.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = nz.b(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(bsoVar.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            jw.O(inflate, drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = bsoVar.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new bsx(inflate);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void y() {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((Preference) it.next()).D = null;
        }
        ArrayList arrayList = new ArrayList(this.f.size());
        this.f = arrayList;
        A(arrayList, this.e);
        this.d = z(this.e);
        bsu bsuVar = this.e.k;
        mw();
        for (Preference preference : this.f) {
        }
    }
}
