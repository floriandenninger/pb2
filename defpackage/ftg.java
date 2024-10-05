package defpackage;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ftg extends BaseAdapter implements SpinnerAdapter {
    public CharSequence b;
    public int c;
    private final ViewGroup d;
    private final Spinner e;
    private final int f;
    private final int g;
    private final int i;
    private int k = -1;
    private final int h = R.layout.sort_filter_item;
    private final List j = new ArrayList();
    public final Set a = new HashSet();

    public ftg(ViewGroup viewGroup, Spinner spinner, int i, int i2, int i3) {
        this.d = viewGroup;
        this.e = spinner;
        this.f = i;
        this.g = i2;
        this.i = i3;
    }

    private final View c(ViewGroup viewGroup) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        View inflate = from.inflate(this.f, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.spinner_header_item_container);
        viewGroup2.addView(from.inflate(this.g, viewGroup2, false));
        inflate.setTag(R.id.spinner_contents_view, true);
        return inflate;
    }

    private final void d(TextView textView, int i) {
        textView.setText(((ftf) this.j.get(i)).a());
    }

    private static void e(View view, int i) {
        if (view instanceof ImageView) {
            if (i != 0) {
                ((ImageView) view).setImageResource(i);
            }
            whu.I(view, i != 0);
        }
    }

    private static boolean f(View view, int i, Object obj) {
        Object tag = view != null ? view.getTag(i) : null;
        return tag != null && tag.equals(obj);
    }

    private static final TextView g(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.spinner_header_item_container);
        View findViewById = viewGroup.findViewById(R.id.title);
        if (findViewById instanceof TextView) {
            return (TextView) findViewById;
        }
        return (TextView) viewGroup.getChildAt(0);
    }

    public final void a(List list) {
        this.j.clear();
        this.j.addAll(list);
        notifyDataSetChanged();
    }

    public final void b(int i, Object obj) {
        ((ftf) this.j.get(i)).c(obj);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.j.size();
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [aooy, java.lang.Object] */
    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        int i2;
        if (!f(view, R.id.spinner_dropdown_item_view, true) || view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(this.h, viewGroup, false);
            view.setTag(R.id.spinner_dropdown_item_view, true);
        }
        ftf ftfVar = (ftf) this.j.get(i);
        TextView textView = (TextView) view.findViewById(R.id.title);
        if (ftfVar.d()) {
            textView.setBackground(new ColorDrawable(wbs.W(this.d.getContext(), R.attr.yt10PercentLayer).orElse(0)));
        } else {
            textView.setBackground(null);
        }
        textView.setText(ftfVar.a());
        int paddingLeft = view.getPaddingLeft();
        if (i == 0) {
            i2 = this.i;
            i = 0;
        } else {
            i2 = 0;
        }
        view.setPadding(paddingLeft, i2, view.getPaddingRight(), i == this.j.size() + (-1) ? this.i : 0);
        int i3 = this.k;
        if (i3 == -1) {
            View c = c(this.e);
            if (c.getLayoutParams() == null) {
                c.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d.getMeasuredWidth(), 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.d.getMeasuredHeight(), 0);
            e(c.findViewById(R.id.icon), this.c);
            TextView g = g(c);
            int i4 = 0;
            for (int i5 = 0; i5 < Math.min(this.j.size(), 10); i5++) {
                d(g, i5);
                c.measure(makeMeasureSpec, makeMeasureSpec2);
                i4 = Math.max(i4, c.getMeasuredWidth());
            }
            Drawable background = this.d.getBackground();
            if (background != null) {
                Rect rect = new Rect();
                background.getPadding(rect);
                i4 += rect.left + rect.right;
            }
            i3 = Math.max(i4, this.e.getWidth());
            this.k = i3;
        }
        view.setMinimumWidth(i3);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            fav.M(((fta) it.next()).a.e, ftfVar.b());
        }
        return view;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return ((ftf) this.j.get(i)).b();
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (viewGroup instanceof AdapterView) {
            i = ((AdapterView) viewGroup).getSelectedItemPosition();
        }
        if (!f(view, R.id.spinner_contents_view, true) || view == null) {
            view = c(viewGroup);
        }
        TextView g = g(view);
        if (!TextUtils.isEmpty(this.b)) {
            g.setText(this.b);
        } else {
            d(g, i);
        }
        e(view.findViewById(R.id.icon), this.c);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.k = -1;
        super.notifyDataSetChanged();
    }
}
