package defpackage;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hyo extends iah {
    public final ImageView t;
    public final iag u;
    public auyb v;
    public final aok w;
    private final ica y;

    public hyo(View view, iag iagVar, ica icaVar, aok aokVar) {
        super(view);
        this.t = (ImageView) view.findViewById(R.id.image);
        this.u = iagVar;
        this.y = icaVar;
        this.w = aokVar;
    }

    @Override // defpackage.iah
    public final void E() {
        if (!this.x.pY(StickerCatalogRendererOuterClass.stickerRenderer)) {
            throw new IllegalArgumentException("renderer missing");
        }
        this.v = (auyb) this.x.pX(StickerCatalogRendererOuterClass.stickerRenderer);
        ammv G = etx.G(this.x);
        if (G.h()) {
            ((iai) this.u).g.add((Uri) G.c());
        }
        ((iai) this.u).s.aL(true);
        ica icaVar = this.y;
        aulq aulqVar = this.x;
        icaVar.a((Uri) etx.G(aulqVar).f(), new hyn(this));
    }

    @Override // defpackage.iah
    public final void F() {
        this.t.setImageDrawable(null);
        this.t.setContentDescription(null);
        ammv G = etx.G(this.x);
        if (G.h()) {
            ica icaVar = this.y;
            Uri uri = (Uri) G.c();
            if (icaVar.a.containsKey(uri)) {
                ykn yknVar = (ykn) icaVar.a.get(uri);
                if (!yknVar.e()) {
                    yknVar.d();
                }
            }
            this.u.e((Uri) G.c());
        }
        this.v = null;
    }
}
