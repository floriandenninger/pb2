package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agzh extends ArrayAdapter {
    public final ListView b;

    public agzh(Context context, ListView listView) {
        super(context, 0);
        this.b = listView;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        agnc agncVar = (agnc) getItem(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (view == null) {
            view = from.inflate(R.layout.offline_stream_quality_option, viewGroup, false);
        }
        agzg agzgVar = (agzg) view.getTag();
        if (agzgVar == null) {
            agzgVar = new agzg(view);
            view.setTag(agzgVar);
        }
        if (agncVar == null) {
            agzgVar.b.setVisibility(8);
        } else {
            agzgVar.a.setText(agncVar.b);
            Spanned spanned = agncVar.c;
            if (spanned == null) {
                agzgVar.b.setVisibility(8);
            } else {
                agzgVar.b.setText(spanned);
                agzgVar.b.setVisibility(0);
            }
        }
        return view;
    }
}
