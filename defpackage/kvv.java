package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kvv extends ArrayAdapter {
    final /* synthetic */ kvw a;
    private final LayoutInflater b;
    private final kvu c;
    private final ajut d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kvv(kvw kvwVar, Context context, ajut ajutVar, List list) {
        super(context, 0);
        this.a = kvwVar;
        this.b = LayoutInflater.from(context);
        this.d = ajutVar;
        this.c = new kvu(kvwVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            add((aqpg) it.next());
        }
    }

    private final void a(View view, int i) {
        aqpg aqpgVar = (aqpg) getItem(i);
        if (view.findViewById(R.id.label) != null) {
            TextView textView = (TextView) view.findViewById(R.id.label);
            aqyg aqygVar = aqpgVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            whu.G(textView, ajcq.b(aqygVar));
        }
        if (view.findViewById(R.id.description) != null) {
            TextView textView2 = (TextView) view.findViewById(R.id.description);
            aqyg aqygVar2 = aqpgVar.f;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            whu.G(textView2, ajcq.b(aqygVar2));
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.icon);
        if (imageView != null) {
            ajut ajutVar = this.d;
            arfs arfsVar = aqpgVar.k;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            int a = ajutVar.a(b);
            if (a == 0) {
                imageView.setImageDrawable(null);
            } else {
                imageView.setImageResource(a);
            }
        }
        view.setTag(aqpgVar);
    }

    @Override // android.widget.ArrayAdapter, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.inflate(R.layout.privacy_dropdown, (ViewGroup) null);
        }
        a(view, i);
        jw.M(view, this.c);
        if (this.a.b.getSelectedItem().equals(view.getTag())) {
            view.findViewById(R.id.inner_item_container).setBackgroundColor(wbs.Q(getContext(), R.attr.yt10PercentLayer));
        }
        return view;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.b.inflate(R.layout.privacy_item, (ViewGroup) null);
        }
        a(view, i);
        return view;
    }
}
