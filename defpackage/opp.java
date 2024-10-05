package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.google.android.apps.youtube.app.offline.ui.UploadArrowView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class opp implements mjh {
    private final zce a;
    private final isr b;

    public opp(jlb jlbVar, Context context, UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer, byte[] bArr) {
        ViewStub viewStub = new ViewStub(context);
        viewStub.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        viewStub.setLayoutResource(R.layout.pivot_bar_upload_indicator);
        zce b = zce.b(viewStub, UploadArrowView.class);
        this.a = b;
        ayqi ayqiVar = (ayqi) jlbVar.b.get();
        ayqiVar.getClass();
        Context context2 = (Context) jlbVar.f.get();
        context2.getClass();
        aahv aahvVar = (aahv) jlbVar.c.get();
        aahvVar.getClass();
        isn isnVar = (isn) jlbVar.e.get();
        isnVar.getClass();
        isl islVar = (isl) jlbVar.d.get();
        islVar.getClass();
        aadw aadwVar = (aadw) jlbVar.a.get();
        aadwVar.getClass();
        this.b = new itg(ayqiVar, context2, aahvVar, isnVar, islVar, aadwVar, new isz(b), uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer);
    }

    @Override // defpackage.mjh
    public final View a() {
        this.b.b(true);
        zce zceVar = this.a;
        View view = zceVar.b;
        return view != null ? view : zceVar.a;
    }

    @Override // defpackage.mjh
    public final aypn b() {
        itg itgVar = (itg) this.b;
        return itgVar.b.A(new ist(itgVar, 2)).A(ohs.n);
    }

    @Override // defpackage.mjh
    public final aypn c() {
        return ((itg) this.b).b.A(ism.e).n();
    }

    @Override // defpackage.mjh
    public final void d() {
        this.b.c(isq.FORCE_GONE);
        this.b.a(true);
    }

    @Override // defpackage.mjh
    public final void e() {
        this.b.c(isq.ALLOW_VISIBLE);
        this.b.a(false);
    }

    @Override // defpackage.zfk
    public final void j() {
        this.b.b(false);
    }
}
