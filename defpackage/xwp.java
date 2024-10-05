package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xwp extends BaseAdapter {
    public aqpk a;
    public boolean b;
    private final LayoutInflater c;
    private final ajut d;
    private final Context e;
    private final int f;
    private final List g = new ArrayList();

    public xwp(Context context, ajut ajutVar) {
        this.c = LayoutInflater.from(context);
        this.d = ajutVar;
        this.f = context.getResources().getDimensionPixelOffset(R.dimen.post_dialog_filter_top_bottom_padding);
        this.e = context;
    }

    private final View c(int i, View view, ViewGroup viewGroup, boolean z) {
        xwo xwoVar;
        int i2;
        aqpk item = getItem(i);
        if (view == null) {
            xwoVar = new xwo(this.c.inflate(R.layout.backstage_access_restriction_item, viewGroup, false), this.e, this.b);
            xwoVar.a.setTag(xwoVar);
        } else {
            xwoVar = (xwo) view.getTag();
        }
        boolean z2 = (item.b & 2) != 0;
        if (z2) {
            ImageView imageView = xwoVar.d;
            ajut ajutVar = this.d;
            arfs arfsVar = item.f;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            imageView.setImageResource(ajutVar.a(b));
            xwoVar.d.setColorFilter(wbs.W(this.e, R.attr.ytTextSecondary).orElse(0));
            ImageView imageView2 = xwoVar.d;
            aqyg aqygVar = item.g;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            imageView2.setContentDescription(ajcq.b(aqygVar));
        }
        whu.I(xwoVar.d, z2);
        YouTubeTextView youTubeTextView = xwoVar.c;
        aqyg aqygVar2 = item.e;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        youTubeTextView.setText(ajcq.b(aqygVar2));
        if (z) {
            xwoVar.b.setBackgroundColor(item.equals(this.a) ? aih.d(this.e, R.color.quantum_grey300) : 0);
            View view2 = xwoVar.a;
            int paddingLeft = view2.getPaddingLeft();
            if (i == 0) {
                i2 = this.f;
                i = 0;
            } else {
                i2 = 0;
            }
            view2.setPadding(paddingLeft, i2, xwoVar.a.getPaddingRight(), i == getCount() + (-1) ? this.f : 0);
        } else {
            View view3 = xwoVar.b;
            view3.setPadding(this.b ? 0 : view3.getPaddingLeft(), 0, this.b ? 0 : xwoVar.b.getPaddingRight(), 0);
        }
        return xwoVar.a;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aqpk getItem(int i) {
        return (aqpk) this.g.get(i);
    }

    public final void b(List list) {
        this.g.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aqpk aqpkVar = ((aqpe) it.next()).d;
            if (aqpkVar == null) {
                aqpkVar = aqpk.a;
            }
            this.g.add(aqpkVar);
            if (aqpkVar.h) {
                this.a = aqpkVar;
            }
        }
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.g.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return c(i, view, viewGroup, true);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        return c(i, view, viewGroup, false);
    }
}
