package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mue implements ajom {
    private final Context a;
    private final FrameLayout b;
    private final boolean c;
    private View d;

    public mue(Context context, aaea aaeaVar) {
        this.b = new FrameLayout(context);
        this.a = context;
        aswb aswbVar = aaeaVar.a().e;
        this.c = (aswbVar == null ? aswb.a : aswbVar).aN;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        if (this.c) {
            mcy.v(this.d);
        }
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        this.b.removeAllViews();
        int bF = aobq.bF(((auoq) obj).c);
        if (bF == 0) {
            bF = 1;
        }
        int i = bF - 1;
        int i2 = R.layout.video_title_bar_ghost_card;
        if (i != 1) {
            if (i == 2) {
                i2 = R.layout.video_metadata_bar_ghost_card;
            } else if (i == 3) {
                i2 = R.layout.video_with_context_ghost_card;
            } else if (i == 4) {
                i2 = R.layout.video_comments_ghost_card;
            }
        }
        this.d = LayoutInflater.from(this.a).inflate(i2, this.b);
        if (this.c) {
            mcy.u(this.d, ajokVar.b("position", -1));
        }
    }
}
