package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class frv extends BaseAdapter {
    final /* synthetic */ frx e;
    public int d = 1;
    public final ArrayList a = new ArrayList();
    public final SparseArray b = new SparseArray();
    public final ArrayList c = new ArrayList();

    public frv(frx frxVar) {
        this.e = frxVar;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.c.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.c.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return ((frt) this.c.get(i)).a.intValue();
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        fru fruVar;
        frt frtVar = (frt) this.c.get(i);
        if (frtVar == null) {
            return null;
        }
        if (view == null) {
            view = this.e.b.inflate(R.layout.contextual_menu_item_layout, viewGroup, false);
            fruVar = new fru(view);
            view.setTag(fruVar);
        } else {
            fruVar = (fru) view.getTag();
        }
        fruVar.getClass();
        if (fruVar.a != null) {
            String str = frtVar.b.a;
            if (!TextUtils.isEmpty(str)) {
                fruVar.a.setText(str);
                fruVar.a.setVisibility(0);
            } else {
                fruVar.a.setText((CharSequence) null);
                fruVar.a.setVisibility(8);
            }
        }
        ImageView imageView = fruVar.b;
        if (imageView != null) {
            imageView.setImageBitmap(null);
            fruVar.b.setVisibility(8);
        }
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        this.c.clear();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            frt frtVar = (frt) arrayList.get(i);
            frs frsVar = frtVar.b;
            this.c.add(frtVar);
        }
        super.notifyDataSetChanged();
    }
}
