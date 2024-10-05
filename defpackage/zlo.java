package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zlo extends BaseAdapter {
    private final Context a;
    private final List b;
    private final ajjs c;

    public zlo(Context context, List list, ajjs ajjsVar) {
        context.getClass();
        this.a = context;
        list.getClass();
        this.b = list;
        ajjsVar.getClass();
        this.c = ajjsVar;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.b.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return this.b.get(i);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        zln zlnVar;
        aqyg aqygVar;
        if (view != null) {
            zlnVar = (zln) view;
        } else {
            zlnVar = new zln(this.a, this.c);
        }
        apgq apgqVar = (apgq) getItem(i);
        apgqVar.getClass();
        if (!apgqVar.equals(zlnVar.e)) {
            zlnVar.e = apgqVar;
            if ((apgqVar.b & 1) != 0) {
                aqygVar = apgqVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            Spanned b = ajcq.b(aqygVar);
            zlnVar.b.setText(b);
            zlnVar.a.setContentDescription(b);
            zlnVar.a.setBackground(null);
            zlnVar.a.setBackgroundColor(zlnVar.getResources().getColor(R.color.yt_black3));
            zlnVar.c.n();
            ajkj ajkjVar = zlnVar.c;
            avgg avggVar = apgqVar.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajkjVar.l(avggVar, zlnVar.d);
            if ((apgqVar.b & 2) == 0) {
                zlnVar.c.e(R.drawable.audio_swap_track_not_loaded);
            }
            zlnVar.c.i(ImageView.ScaleType.CENTER_CROP);
        }
        return zlnVar;
    }
}
