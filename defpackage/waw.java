package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class waw extends ArrayAdapter {
    static final Object a = new Object();

    public waw(Context context) {
        super(context, R.layout.channel_creation_gender_picker_item);
        add(a);
    }

    private static final boolean a(View view) {
        return view != null && view.getClass().equals(View.class);
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (getItem(i) == a) {
            if (a(view)) {
                return view;
            }
            View view2 = new View(getContext());
            view2.setLayoutParams(new AbsListView.LayoutParams(-1, 0));
            view2.setVisibility(8);
            return view2;
        }
        if (true == a(view)) {
            view = null;
        }
        return super.getDropDownView(i, view, viewGroup);
    }
}
