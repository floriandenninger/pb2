package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpq implements ajom, ggr, gmf, mqq {
    public final Context a;
    public final FrameLayout b;
    mpp c;
    private final ajop d;
    private final InlinePlaybackLifecycleController e;
    private final boolean f;
    private mpp g;
    private mpp h;
    private Object i;
    private gol j;
    private boolean k;
    private final abwz l;

    public mpq(Context context, gma gmaVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, abwz abwzVar, boolean z, byte[] bArr) {
        this.a = context;
        this.d = gmaVar;
        inlinePlaybackLifecycleController.getClass();
        this.e = inlinePlaybackLifecycleController;
        this.l = abwzVar;
        this.f = z;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        h(gol.a);
        frameLayout.addView(this.c.a());
    }

    private final int d() {
        return this.a.getResources().getConfiguration().orientation;
    }

    private final View e(int i, int i2) {
        View inflate = View.inflate(this.a, i, null);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.inline_metadata_stub);
        if (viewStub != null) {
            viewStub.setLayoutResource(i2);
            viewStub.inflate();
        }
        return inflate;
    }

    private final mpp f(ajop ajopVar, View view) {
        abwz abwzVar = this.l;
        boolean z = this.f;
        Context context = (Context) abwzVar.a.get();
        context.getClass();
        ajjz ajjzVar = (ajjz) abwzVar.g.get();
        ajjzVar.getClass();
        ajut ajutVar = (ajut) abwzVar.e.get();
        ajutVar.getClass();
        aahd aahdVar = (aahd) abwzVar.j.get();
        aahdVar.getClass();
        ajuw ajuwVar = (ajuw) abwzVar.n.get();
        ajuwVar.getClass();
        mgu mguVar = (mgu) abwzVar.o.get();
        mguVar.getClass();
        gfz gfzVar = (gfz) abwzVar.f.get();
        gfzVar.getClass();
        mhg mhgVar = (mhg) abwzVar.d.get();
        mhgVar.getClass();
        ajyw ajywVar = (ajyw) abwzVar.b.get();
        ajywVar.getClass();
        ajnv ajnvVar = (ajnv) abwzVar.m.get();
        ajnvVar.getClass();
        ohg ohgVar = (ohg) abwzVar.l.get();
        ohgVar.getClass();
        aadw aadwVar = (aadw) abwzVar.k.get();
        aadwVar.getClass();
        lsb lsbVar = (lsb) abwzVar.h.get();
        lsbVar.getClass();
        c cVar = (c) abwzVar.c.get();
        cVar.getClass();
        c cVar2 = (c) abwzVar.i.get();
        cVar2.getClass();
        view.getClass();
        return new mpp(context, ajjzVar, ajutVar, aahdVar, ajuwVar, mguVar, gfzVar, mhgVar, ajywVar, ajnvVar, ohgVar, aadwVar, lsbVar, cVar, cVar2, ajopVar, view, this, z, null, null, null, null, null, null);
    }

    private final boolean h(gol golVar) {
        mpp mppVar;
        boolean g = mpp.g(golVar);
        int d = d();
        int i = R.layout.inline_muted_metadata;
        if (d == 2 && golVar != null && !evr.bt(golVar)) {
            if (k(this.h, g)) {
                if (this.f) {
                    this.h = f(this.d, e(R.layout.promoted_video_item_land, R.layout.inline_muted_metadata));
                } else {
                    mpp f = f(this.d, e(true != g ? R.layout.video_feed_entry : R.layout.video_feed_entry_swap, R.layout.inline_muted_metadata));
                    this.h = f;
                    View a = f.a();
                    whu.I(a.findViewById(R.id.post_author), false);
                    whu.I(a.findViewById(R.id.post_text), false);
                }
            }
            mppVar = this.h;
        } else {
            if (k(this.g, g)) {
                ajop ajopVar = this.d;
                if (true == g) {
                    i = R.layout.inline_muted_metadata_swap;
                }
                this.g = f(ajopVar, e(R.layout.inline_muted_video_full_bleed, i));
            }
            mppVar = this.g;
        }
        if (this.c == mppVar) {
            return false;
        }
        this.c = mppVar;
        return true;
    }

    private static boolean k(mpp mppVar, boolean z) {
        if (mppVar != null) {
            if ((mppVar.f != null) == z) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        mpp mppVar = this.h;
        if (mppVar != null) {
            mppVar.b(ajosVar);
        }
        mpp mppVar2 = this.g;
        if (mppVar2 != null) {
            mppVar2.b(ajosVar);
        }
        this.k = false;
        this.j = null;
        this.i = null;
    }

    @Override // defpackage.ggr
    public final View g() {
        gol golVar;
        if (this.c == null) {
            return null;
        }
        if (d() != 2 || (golVar = this.j) == null || evr.bt(golVar)) {
            return this.c.d;
        }
        return null;
    }

    @Override // defpackage.ggr
    public final void i(boolean z) {
        Bitmap bitmap;
        this.k = z;
        mpp mppVar = this.g;
        if (mppVar == null || mppVar.F == z) {
            return;
        }
        mppVar.F = z;
        if (!z || (bitmap = mppVar.E) == null) {
            return;
        }
        mppVar.e.b(mppVar.C, bitmap);
    }

    @Override // defpackage.ggr
    public final /* synthetic */ mhp j() {
        return null;
    }

    @Override // defpackage.gmf
    public final boolean oA(gmf gmfVar) {
        return (gmfVar instanceof mpq) && ((mpq) gmfVar).i == this.i;
    }

    @Override // defpackage.ajom
    public final void oB(ajok ajokVar, Object obj) {
        this.i = obj;
        gol bp = evr.bp(obj);
        this.j = bp == null ? gol.a : bp;
        if (h(bp)) {
            this.b.removeAllViews();
            this.b.addView(this.c.a());
        }
        i(this.k);
        this.c.oB(ajokVar, this.j);
    }

    @Override // defpackage.gmf
    public final ayph oz(int i) {
        mpp mppVar = this.c;
        if (mppVar.f != null) {
            if ((i == 1 || i == 2) && mpp.g(mppVar.D)) {
                mppVar.f.c();
            } else if (i == 0 && mpp.g(mppVar.D)) {
                mppVar.f.b();
            }
        }
        if (i == 0) {
            return this.e.i(this.j);
        }
        return this.e.j(this.j, this, i != 2 ? 0 : 2);
    }
}
