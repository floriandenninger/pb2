package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kxz implements ajom {
    private final Context a;
    private final ViewGroup b;
    private final TextView c;
    private final TextView d;
    private final aahv e;
    private ayqx f;

    public kxz(Context context, aahv aahvVar) {
        this.a = context;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.suggested_playlist_videos_selection_metadata, (ViewGroup) null);
        this.b = viewGroup;
        this.c = (TextView) viewGroup.findViewById(R.id.feed_source);
        this.d = (TextView) viewGroup.findViewById(R.id.video_count);
        this.e = aahvVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        Object obj = this.f;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
    }

    public final void d(athw athwVar) {
        int size = athwVar == null ? 0 : athwVar.getSelectedVideoIds().size();
        String quantityString = this.a.getResources().getQuantityString(R.plurals.selected_video_count, size, Integer.valueOf(size));
        whu.G(this.d, quantityString);
        this.d.setContentDescription(quantityString);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        arbt arbtVar = (arbt) obj;
        TextView textView = this.c;
        aqyg aqygVar = arbtVar.b;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar));
        d((athw) this.e.c().b(arbtVar.c));
        this.f = this.e.c().h(arbtVar.c, true).L(khf.e).Y(khe.i).k(athw.class).ab(ayqr.a()).ax(new ayrs() { // from class: kxy
            @Override // defpackage.ayrs
            public final void a(Object obj2) {
                kxz.this.d((athw) obj2);
            }
        });
    }
}
