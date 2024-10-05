package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lvb extends vw {
    public final atht d;
    final /* synthetic */ lvc e;
    private final List f;
    private final ajjv g;

    public lvb(lvc lvcVar, List list, atht athtVar) {
        this.e = lvcVar;
        this.f = list;
        this.d = athtVar;
        ajju a = ajjv.a();
        a.b(R.drawable.missing_avatar);
        this.g = a.a();
    }

    public static final void w(lva lvaVar, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        aqyg aqygVar;
        lvaVar.u.setAlpha(1.0f);
        lvaVar.v.setAlpha(1.0f);
        lvaVar.w.setVisibility(8);
        TextView textView = lvaVar.v;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 4) != 0) {
            aqygVar = reelItemRendererOuterClass$ReelItemRenderer.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
    }

    public static final void x(lva lvaVar, atht athtVar) {
        aqyg aqygVar;
        lvaVar.u.setAlpha(0.5f);
        lvaVar.v.setAlpha(0.5f);
        lvaVar.w.setVisibility(0);
        TextView textView = lvaVar.v;
        if ((athtVar.b & 4) != 0) {
            aqygVar = athtVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
    }

    @Override // defpackage.vw
    public final int b() {
        return this.f.size();
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        return new lva(LayoutInflater.from(this.e.a).inflate(R.layout.multi_reel_dismissal_item, (ViewGroup) null, false));
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        avgg avggVar;
        aqyg aqygVar;
        aujt aujtVar;
        aujt aujtVar2;
        boolean z;
        final lva lvaVar = (lva) wvVar;
        final ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = (ReelItemRendererOuterClass$ReelItemRenderer) this.f.get(i);
        this.e.d.mM().D(new acqx(reelItemRendererOuterClass$ReelItemRenderer.p));
        apxf apxfVar = null;
        this.e.d.mM().u(new acqx(reelItemRendererOuterClass$ReelItemRenderer.p), null);
        ajjz ajjzVar = this.e.b;
        ImageView imageView = lvaVar.u;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 32) != 0) {
            avggVar = reelItemRendererOuterClass$ReelItemRenderer.g;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        ajjzVar.k(imageView, avggVar, this.g);
        YouTubeButton youTubeButton = lvaVar.w;
        atht athtVar = this.d;
        if ((athtVar.b & 8) != 0) {
            aqygVar = athtVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        youTubeButton.setText(ajcq.b(aqygVar));
        List list = this.e.h;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 2097152) != 0) {
            aujtVar = reelItemRendererOuterClass$ReelItemRenderer.s;
            if (aujtVar == null) {
                aujtVar = aujt.a;
            }
        } else {
            aujtVar = null;
        }
        if (list.contains(aujtVar)) {
            x(lvaVar, this.d);
        } else {
            w(lvaVar, reelItemRendererOuterClass$ReelItemRenderer);
        }
        View view = lvaVar.t;
        if ((reelItemRendererOuterClass$ReelItemRenderer.b & 2097152) != 0) {
            aujtVar2 = reelItemRendererOuterClass$ReelItemRenderer.s;
            if (aujtVar2 == null) {
                aujtVar2 = aujt.a;
            }
        } else {
            aujtVar2 = null;
        }
        view.setTag(aujtVar2);
        lvaVar.t.setOnClickListener(new View.OnClickListener() { // from class: luz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                lvb lvbVar = lvb.this;
                lva lvaVar2 = lvaVar;
                ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer2 = reelItemRendererOuterClass$ReelItemRenderer;
                atht athtVar2 = lvbVar.d;
                if ((reelItemRendererOuterClass$ReelItemRenderer2.b & 131072) != 0) {
                    lvbVar.e.d.mM().I(3, new acqx(reelItemRendererOuterClass$ReelItemRenderer2.p), null);
                }
                if (lvaVar2.w.getVisibility() == 0) {
                    lvb.w(lvaVar2, reelItemRendererOuterClass$ReelItemRenderer2);
                    if (lvbVar.e.h.contains(lvaVar2.t.getTag())) {
                        lvbVar.e.h.remove(lvaVar2.t.getTag());
                    }
                    if (lvbVar.e.f.containsKey(lvaVar2.t.getTag())) {
                        lvbVar.e.f.remove(lvaVar2.t.getTag());
                        return;
                    }
                    return;
                }
                lvb.x(lvaVar2, athtVar2);
                lvbVar.e.h.add((aujt) lvaVar2.t.getTag());
                lvbVar.e.f.put((aujt) lvaVar2.t.getTag(), reelItemRendererOuterClass$ReelItemRenderer2.p.I());
            }
        });
        aott aottVar = reelItemRendererOuterClass$ReelItemRenderer.q;
        if (aottVar == null) {
            aottVar = aott.a;
        }
        if ((aottVar.b & 1) != 0) {
            TextView textView = lvaVar.v;
            aott aottVar2 = reelItemRendererOuterClass$ReelItemRenderer.q;
            if (aottVar2 == null) {
                aottVar2 = aott.a;
            }
            aots aotsVar = aottVar2.c;
            if (aotsVar == null) {
                aotsVar = aots.a;
            }
            textView.setContentDescription(aotsVar.c);
        }
        int bl = anaf.bl(reelItemRendererOuterClass$ReelItemRenderer.o);
        if (bl == 0 || bl != 2) {
            hbb hbbVar = this.e.e;
            if ((reelItemRendererOuterClass$ReelItemRenderer.b & 4096) != 0 && (apxfVar = reelItemRendererOuterClass$ReelItemRenderer.m) == null) {
                apxfVar = apxf.a;
            }
            if (!hbbVar.f(apxfVar)) {
                z = false;
                lvaVar.u.setEnabled(!z);
            }
        }
        z = true;
        lvaVar.u.setEnabled(!z);
    }
}
