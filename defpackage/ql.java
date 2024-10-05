package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ql extends BaseAdapter {
    final /* synthetic */ qm a;
    private int b = -1;

    public ql(qm qmVar) {
        this.a = qmVar;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qt getItem(int i) {
        ArrayList e = this.a.c.e();
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (qt) e.get(i);
    }

    final void b() {
        qq qqVar = this.a.c;
        qt qtVar = qqVar.h;
        if (qtVar != null) {
            ArrayList e = qqVar.e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                if (((qt) e.get(i)) == qtVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.a.c.e().size();
        return this.b < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((rf) view).f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
