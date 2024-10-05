package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.youtube.app.common.ui.OverScrollLinearLayoutManager;
import com.google.android.apps.youtube.app.common.ui.stickyheaders.StickyHeaderContainer;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ifz implements ajxa, war {
    public final ci a;
    public final CoordinatorLayout b;
    public final LoadingFrameLayout c;
    public final gna d;
    public final acqz e;
    public final nyl f;
    public final ajwi g;
    public final ifv h;
    public dn i;

    /* JADX WARN: Type inference failed for: r10v0, types: [ajos, java.lang.Object] */
    public ifz(Context context, ci ciVar, ypa ypaVar, final acqz acqzVar, zaw zawVar, final aaue aaueVar, ajvb ajvbVar, final agqo agqoVar, ajoy ajoyVar, gni gniVar, aaea aaeaVar, aypn aypnVar, byte[] bArr) {
        int color;
        this.e = acqzVar;
        this.a = ciVar;
        final byte[] bArr2 = null;
        ajvd ajvdVar = new ajvd(aaueVar, acqzVar, bArr2) { // from class: ifx
            public final /* synthetic */ aaue a;
            public final /* synthetic */ acqz b;

            @Override // defpackage.ajvd
            public final ajvc a(Object obj, ajxe ajxeVar, ajwx ajwxVar) {
                agqo agqoVar2 = agqo.this;
                aaue aaueVar2 = this.a;
                acqz acqzVar2 = this.b;
                if (!(obj instanceof aalz)) {
                    return null;
                }
                xph a = agqoVar2.a(aaueVar2, acqzVar2.mM(), ajxeVar);
                a.i((aalz) obj);
                return a;
            }
        };
        View inflate = LayoutInflater.from(context).inflate(R.layout.reel_comment_view, (ViewGroup) null);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ciVar.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        double d = displayMetrics.heightPixels;
        Double.isNaN(d);
        int i = (int) (d * 0.75d);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) inflate.findViewById(R.id.reel_comment_coordinator_layout);
        this.b = coordinatorLayout;
        if (gniVar.a() == gng.DARK) {
            color = ciVar.getResources().getColor(R.color.yt_black1);
        } else {
            color = ciVar.getResources().getColor(R.color.yt_white1);
        }
        coordinatorLayout.setBackgroundColor(color);
        LoadingFrameLayout loadingFrameLayout = (LoadingFrameLayout) inflate.findViewById(R.id.reel_comment_loading_preview);
        this.c = loadingFrameLayout;
        yny.z(loadingFrameLayout, yny.n(i), ViewGroup.LayoutParams.class);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.reel_comments);
        OverScrollLinearLayoutManager overScrollLinearLayoutManager = new OverScrollLinearLayoutManager(null);
        overScrollLinearLayoutManager.ab(1);
        recyclerView.af(overScrollLinearLayoutManager);
        ifv aH = ifv.aH(i);
        nyl nylVar = new nyl();
        this.f = nylVar;
        nylVar.A(acqzVar.mM());
        ajwi ajwiVar = new ajwi(null, recyclerView, ajoyVar, new ajvq(), aaueVar, ypaVar, ajvdVar, zawVar, nylVar, ajvbVar.get(), this, ajwk.d, aaeaVar, aypnVar);
        this.d = new gna((StickyHeaderContainer) inflate.findViewById(R.id.sticky_header_container), (vw) ajwiVar.g, new iga(ajwiVar.f));
        this.g = ajwiVar;
        this.h = aH;
    }

    @Override // defpackage.war
    public final void b() {
        lo();
    }

    @Override // defpackage.war
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.war
    public final void d() {
        lo();
    }

    @Override // defpackage.ajxa
    public final void lo() {
        ajwi ajwiVar = this.g;
        if (ajwiVar != null) {
            ajwiVar.h();
            this.g.af();
        }
        gna gnaVar = this.d;
        if (gnaVar != null) {
            gnaVar.c();
        }
    }

    @Override // defpackage.ajxa
    public final boolean lp() {
        return true;
    }

    @Override // defpackage.war
    public final void mG() {
    }
}
