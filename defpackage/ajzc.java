package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajzc extends vw {
    public List d;
    public apxf e;
    private final acra g;
    private final ajsa h;
    private final ajjz i;
    private final aahd j;
    private View l;
    public ajyz f = null;
    private final ajyz k = new ajyy(this);

    public ajzc(acrt acrtVar, ajjz ajjzVar, ajsa ajsaVar, aahd aahdVar) {
        this.g = acrtVar;
        this.h = ajsaVar;
        this.i = ajjzVar;
        this.j = aahdVar;
    }

    private static final acqx x(int i) {
        aong aongVar = (aong) asuh.b.createBuilder();
        aone createBuilder = apvd.a.createBuilder();
        int i2 = acrb.SPONSORSHIPS_EMOJI_UPSELL_EMOJI.Jk;
        createBuilder.copyOnWrite();
        apvd apvdVar = (apvd) createBuilder.instance;
        apvdVar.b |= 1;
        apvdVar.c = i2;
        createBuilder.copyOnWrite();
        apvd apvdVar2 = (apvd) createBuilder.instance;
        apvdVar2.b |= 4;
        apvdVar2.e = i;
        aongVar.copyOnWrite();
        asuh asuhVar = (asuh) aongVar.instance;
        apvd apvdVar3 = (apvd) createBuilder.build();
        apvdVar3.getClass();
        asuhVar.h = apvdVar3;
        asuhVar.c |= 8;
        aone createBuilder2 = awau.a.createBuilder();
        createBuilder2.copyOnWrite();
        awau awauVar = (awau) createBuilder2.instance;
        awauVar.b |= 1;
        awauVar.c = 1L;
        aongVar.copyOnWrite();
        asuh asuhVar2 = (asuh) aongVar.instance;
        awau awauVar2 = (awau) createBuilder2.build();
        awauVar2.getClass();
        asuhVar2.e = awauVar2;
        asuhVar2.c |= 2;
        return new acqx((asuh) aongVar.build());
    }

    @Override // defpackage.vw
    public final int b() {
        return this.d.size();
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        this.l = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.emoji_upsell_holder, viewGroup, false);
        return new ajzb(new ajza(this.k, x(i), this.g), this.l, this.h);
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        ajzb ajzbVar = (ajzb) wvVar;
        if (this.d.size() > i) {
            int i2 = ajzb.v;
            this.i.h(ajzbVar.t, this.h.b((String) this.d.get(i)));
            ajzbVar.t.setContentDescription(ajzbVar.u.c((String) this.d.get(i)));
        }
        this.g.n(x(i));
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void p(wv wvVar) {
        int i = ajzb.v;
        ImageView imageView = ((ajzb) wvVar).t;
        if (imageView != null) {
            this.i.e(imageView);
        }
    }

    public final void w() {
        apxf apxfVar = this.e;
        if (apxfVar != null) {
            this.j.a(apxfVar);
        }
    }
}
