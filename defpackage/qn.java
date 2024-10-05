package defpackage;

import android.support.v7.view.menu.ListMenuItemView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qn extends BaseAdapter {
    public final qq a;
    public boolean b;
    private int c = -1;
    private final boolean d;
    private final LayoutInflater e;
    private final int f;

    public qn(qq qqVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.d = z;
        this.e = layoutInflater;
        this.a = qqVar;
        this.f = i;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final qt getItem(int i) {
        ArrayList e = this.d ? this.a.e() : this.a.f();
        int i2 = this.c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (qt) e.get(i);
    }

    final void b() {
        qq qqVar = this.a;
        qt qtVar = qqVar.h;
        if (qtVar != null) {
            ArrayList e = qqVar.e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                if (((qt) e.get(i)) == qtVar) {
                    this.c = i;
                    return;
                }
            }
        }
        this.c = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList e = this.d ? this.a.e() : this.a.f();
        if (this.c < 0) {
            return e.size();
        }
        return e.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.e.inflate(this.f, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        boolean z = this.a.w() && i2 != (i3 >= 0 ? getItem(i3).b : i2);
        ImageView imageView = listMenuItemView.b;
        if (imageView != null) {
            imageView.setVisibility((listMenuItemView.d || !z) ? 8 : 0);
        }
        rf rfVar = (rf) view;
        if (this.b) {
            listMenuItemView.e = true;
            listMenuItemView.c = true;
        }
        rfVar.f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
