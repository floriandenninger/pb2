package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mfv implements ajom {
    public final aahd a;
    private final ajjz b;
    private final ajuw c;
    private final View d;
    private final ImageView e;
    private final TextView f;
    private final TextView g;
    private final TextView h;
    private final ImageView i;
    private final int j;

    public mfv(Context context, aahd aahdVar, ajjz ajjzVar, ajuw ajuwVar, ViewGroup viewGroup) {
        this.a = aahdVar;
        this.b = ajjzVar;
        this.c = ajuwVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_suggested_video, viewGroup, false);
        this.d = inflate;
        this.e = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.f = (TextView) inflate.findViewById(R.id.duration);
        this.g = (TextView) inflate.findViewById(R.id.headline);
        this.h = (TextView) inflate.findViewById(R.id.view_count);
        this.i = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.compact_suggested_video_last_video_spacing);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.e(this.e);
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        final aqcw aqcwVar = (aqcw) obj;
        this.d.setOnClickListener(new View.OnClickListener() { // from class: mfu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                mfv mfvVar = mfv.this;
                aqcw aqcwVar2 = aqcwVar;
                aahd aahdVar = mfvVar.a;
                apxf apxfVar = aqcwVar2.i;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
            }
        });
        View view = this.d;
        jw.Y(view, jw.i(view), this.d.getPaddingTop(), jw.h(this.d), ajokVar.j("isLastVideo", false) ? this.j : 0);
        ajjz ajjzVar = this.b;
        ImageView imageView = this.e;
        avgg avggVar = aqcwVar.e;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.f;
        aqyg aqygVar3 = null;
        if ((aqcwVar.b & 8) != 0) {
            aqygVar = aqcwVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView, ajcq.b(aqygVar));
        TextView textView2 = this.g;
        if ((aqcwVar.b & 1) != 0) {
            aqygVar2 = aqcwVar.c;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        whu.G(textView2, ajcq.b(aqygVar2));
        TextView textView3 = this.h;
        if ((aqcwVar.b & 2) != 0 && (aqygVar3 = aqcwVar.d) == null) {
            aqygVar3 = aqyg.a;
        }
        whu.G(textView3, ajcq.b(aqygVar3));
        ajuw ajuwVar = this.c;
        View rootView = this.d.getRootView();
        ImageView imageView2 = this.i;
        aulq aulqVar = aqcwVar.g;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        ajuwVar.e(rootView, imageView2, (atdc) aulqVar.pX(MenuRendererOuterClass.menuRenderer), aqcwVar, acra.l);
    }
}
