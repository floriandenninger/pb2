package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.audioswap.model.Track;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zly extends BaseAdapter {
    private final Context a;
    private final List b;
    private final zlf c;
    private final boolean d;
    private final ajjs e;

    public zly(Context context, List list, zlf zlfVar, ajjs ajjsVar, boolean z) {
        context.getClass();
        this.a = context;
        this.b = list;
        zlfVar.getClass();
        this.c = zlfVar;
        ajjsVar.getClass();
        this.e = ajjsVar;
        this.d = z;
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
        zlx zlxVar;
        if (view != null) {
            zlxVar = (zlx) view;
        } else if (this.d) {
            zlxVar = new zlz(this.a, this.c, this.e);
        } else {
            zlxVar = new zlx(this.a, this.c, this.e, R.layout.audio_swap_track_bar);
        }
        Track track = (Track) getItem(i);
        track.getClass();
        if (!track.equals(zlxVar.h)) {
            zlxVar.h = track;
            zlxVar.b.setText(track.a);
            zlxVar.c.setText(track.b);
            zlxVar.d.setText(vlu.g(zlxVar.getContext(), track.c, false));
            TextView textView = zlxVar.e;
            if (textView != null) {
                textView.setText(track.f);
            }
            if (zlxVar.a != null) {
                zlxVar.f.l(track.e, zlxVar.g);
            }
            zlxVar.a();
        }
        return zlxVar;
    }
}
