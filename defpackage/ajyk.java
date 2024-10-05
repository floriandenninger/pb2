package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajyk extends vw {
    public ajyo d;
    public List e;
    private final ajsa f;
    private final ajjz g;

    public ajyk(ajjz ajjzVar, ajsa ajsaVar) {
        this.f = ajsaVar;
        this.g = ajjzVar;
    }

    @Override // defpackage.vw
    public final int b() {
        return this.e.size();
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        return new ajyj(new ajyi(this.d), LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.emoji_holder, viewGroup, false), this.f);
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void o(wv wvVar, int i) {
        ajyj ajyjVar = (ajyj) wvVar;
        if (this.e.size() > i) {
            int i2 = ajyj.w;
            this.g.h(ajyjVar.t, this.f.b((String) this.e.get(i)));
            String str = (String) this.e.get(i);
            ajyjVar.u.a = str;
            ajyjVar.t.setContentDescription(ajyjVar.v.c(str));
        }
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void p(wv wvVar) {
        int i = ajyj.w;
        ImageView imageView = ((ajyj) wvVar).t;
        if (imageView != null) {
            this.g.e(imageView);
        }
    }
}
