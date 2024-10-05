package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class uys extends ArrayAdapter {
    public uys(Context context) {
        super(context, R.layout.bottom_sheet_list_item);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object a(int i, View view) {
        uyu uyuVar = (uyu) getItem(i);
        if (uyuVar instanceof uyw) {
            return new uyv(view);
        }
        if (uyuVar instanceof uyx) {
            return null;
        }
        String valueOf = String.valueOf(uyuVar.getClass().getSimpleName());
        throw new IllegalStateException(valueOf.length() != 0 ? "Unsupported item: ".concat(valueOf) : new String("Unsupported item: "));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(int i, Object obj) {
        uyu uyuVar = (uyu) getItem(i);
        if (uyuVar instanceof uyw) {
            uyw uywVar = (uyw) uyuVar;
            uyv uyvVar = (uyv) obj;
            uyvVar.a.setText(uywVar.c);
            TextView textView = uyvVar.a;
            ColorStateList colorStateList = uywVar.d;
            if (colorStateList == null) {
                colorStateList = getContext().getResources().getColorStateList(R.color.quantum_black_text);
            }
            textView.setTextColor(colorStateList);
            Drawable drawable = uywVar.e;
            if (drawable != null) {
                uyvVar.b.setImageDrawable(drawable);
                uyvVar.b.setVisibility(0);
            } else {
                uyvVar.b.setVisibility(8);
            }
            Drawable drawable2 = uywVar.f;
            if (drawable2 != null) {
                uyvVar.c.setImageDrawable(drawable2);
                uyvVar.c.setVisibility(0);
                return;
            } else {
                uyvVar.c.setVisibility(8);
                return;
            }
        }
        if (uyuVar instanceof uyx) {
            return;
        }
        String valueOf = String.valueOf(uyuVar.getClass().getSimpleName());
        throw new IllegalStateException(valueOf.length() != 0 ? "Unsupported item: ".concat(valueOf) : new String("Unsupported item: "));
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int i) {
        return getItem(i) instanceof uyw ? 0 : 1;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        uyu uyuVar = (uyu) getItem(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(uyuVar.b(), viewGroup, false);
            view.setTag(a(i, view));
        }
        b(i, view.getTag());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public final boolean isEnabled(int i) {
        return ((uyu) getItem(i)).e();
    }
}
