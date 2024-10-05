package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lde extends ajpc {
    private final ajjz a;
    private final CardView b;
    private final ImageView c;
    private final TextView d;
    private final ajoi e;

    public lde(Activity activity, ajjz ajjzVar, aahd aahdVar, akbd akbdVar, ViewGroup viewGroup) {
        this.a = ajjzVar;
        CardView cardView = (CardView) LayoutInflater.from(activity).inflate(R.layout.album_card, viewGroup, false);
        this.b = cardView;
        TextView textView = (TextView) cardView.findViewById(R.id.title);
        textView.getClass();
        this.d = textView;
        ImageView imageView = (ImageView) cardView.findViewById(R.id.thumbnail);
        imageView.getClass();
        this.c = imageView;
        this.e = new ajoi(aahdVar, cardView);
        akbdVar.c(cardView, akbdVar.a(cardView, null));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.c();
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar;
        apbx apbxVar = (apbx) obj;
        ajoi ajoiVar = this.e;
        acra acraVar = ajokVar.a;
        aqyg aqygVar = null;
        if ((apbxVar.b & 8) != 0) {
            apxfVar = apbxVar.e;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        ajjz ajjzVar = this.a;
        ImageView imageView = this.c;
        avgg avggVar = apbxVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.d;
        if ((apbxVar.b & 2) != 0 && (aqygVar = apbxVar.d) == null) {
            aqygVar = aqyg.a;
        }
        textView.setText(ajcq.b(aqygVar));
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apbx) obj).f.I();
    }
}
