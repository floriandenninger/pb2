package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.InlinePlaybackRendererOuterClass;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mkv implements ajom, ggr, ypd {
    gol a;
    private final Context b;
    private final amnv c;
    private final ajjz d;
    private final fgn e;
    private final aahd f;
    private final flx g;
    private final gfy h;
    private final FrameLayout i;
    private mku j;
    private mku k;
    private mku l;
    private final lru m;

    public mkv(Context context, amnv amnvVar, ypa ypaVar, ajjz ajjzVar, fgn fgnVar, aahd aahdVar, flx flxVar, gfy gfyVar, lru lruVar, byte[] bArr) {
        this.b = context;
        this.c = amnvVar;
        ypaVar.getClass();
        ajjzVar.getClass();
        this.d = ajjzVar;
        fgnVar.getClass();
        this.e = fgnVar;
        aahdVar.getClass();
        this.f = aahdVar;
        flxVar.getClass();
        this.g = flxVar;
        gfyVar.getClass();
        this.h = gfyVar;
        lruVar.getClass();
        this.m = lruVar;
        this.i = new FrameLayout(context);
        ypaVar.g(this);
        this.a = gol.a;
    }

    private final View d(int i) {
        View inflate = View.inflate(this.b, i, null);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.inline_metadata_stub);
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.inline_metadata_full);
            viewStub.inflate();
        }
        return inflate;
    }

    private final mku e(ajop ajopVar, View view, aahd aahdVar) {
        return new mku(this.b, this.d, this.e, ajopVar, view, aahdVar, this.g);
    }

    private final void h(mku mkuVar, gol golVar) {
        if (l(mkuVar)) {
            mkuVar.e(golVar.b);
        }
    }

    private final void k(mku mkuVar, boolean z) {
        if (l(mkuVar)) {
            mkuVar.f(z);
        }
    }

    private final boolean l(mku mkuVar) {
        return mkuVar != null && whu.N(this.i, mkuVar.a());
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.i;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        mku mkuVar = this.j;
        if (mkuVar != null) {
            mkuVar.b(ajosVar);
        }
        mku mkuVar2 = this.k;
        if (mkuVar2 != null) {
            mkuVar2.b(ajosVar);
        }
    }

    @Override // defpackage.ggr
    public final View g() {
        mku mkuVar = this.l;
        if (mkuVar == null) {
            return null;
        }
        return mkuVar.a;
    }

    @Override // defpackage.ggr
    public final void i(boolean z) {
    }

    @Override // defpackage.ggr
    public final /* synthetic */ mhp j() {
        return null;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        aulq aulqVar;
        if (i == -1) {
            return new Class[]{flw.class, gfx.class, ghg.class, adlu.class};
        }
        if (i == 0) {
            flw flwVar = (flw) obj;
            if (this.a == gol.a || !TextUtils.equals(this.a.f(), flwVar.a())) {
                return null;
            }
            h(this.j, this.a);
            h(this.k, this.a);
            return null;
        }
        if (i == 1) {
            boolean z = !((gfx) obj).a();
            k(this.j, z);
            k(this.k, z);
            return null;
        }
        if (i != 2) {
            if (i == 3) {
                boolean z2 = ((adlu) obj).a() != null;
                mku mkuVar = this.j;
                if (!l(mkuVar)) {
                    return null;
                }
                mkuVar.g(z2, this.m);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        ghg ghgVar = (ghg) obj;
        if (this.a == gol.a) {
            return null;
        }
        String f = this.a.f();
        aone builder = evr.bq(this.a.b).toBuilder();
        if (TextUtils.equals(f, ghgVar.b()) && builder != null) {
            arhw arhwVar = (arhw) builder.instance;
            if ((arhwVar.b & 64) != 0) {
                asnj asnjVar = arhwVar.h;
                if (asnjVar == null) {
                    asnjVar = asnj.a;
                }
                aone builder2 = asnjVar.toBuilder();
                asni asniVar = ((asnj) builder2.instance).c;
                if (asniVar == null) {
                    asniVar = asni.a;
                }
                aong aongVar = (aong) asniVar.toBuilder();
                asno a = ghgVar.a();
                aongVar.copyOnWrite();
                asni asniVar2 = (asni) aongVar.instance;
                asniVar2.d = a.e;
                asniVar2.b |= 2;
                builder2.copyOnWrite();
                asnj asnjVar2 = (asnj) builder2.instance;
                asni asniVar3 = (asni) aongVar.build();
                asniVar3.getClass();
                asnjVar2.c = asniVar3;
                asnjVar2.b |= 1;
                builder.copyOnWrite();
                arhw arhwVar2 = (arhw) builder.instance;
                asnj asnjVar3 = (asnj) builder2.build();
                asnjVar3.getClass();
                arhwVar2.h = asnjVar3;
                arhwVar2.b |= 64;
            }
        }
        aone builder3 = this.a.b.toBuilder();
        arhx arhxVar = this.a.b.g;
        if (arhxVar == null) {
            arhxVar = arhx.a;
        }
        aone builder4 = arhxVar.toBuilder();
        builder4.copyOnWrite();
        arhx arhxVar2 = (arhx) builder4.instance;
        arhw arhwVar3 = (arhw) builder.build();
        arhwVar3.getClass();
        arhxVar2.c = arhwVar3;
        arhxVar2.b |= 1;
        builder3.copyOnWrite();
        arhz arhzVar = (arhz) builder3.instance;
        arhx arhxVar3 = (arhx) builder4.build();
        arhxVar3.getClass();
        arhzVar.g = arhxVar3;
        arhzVar.b = 32 | arhzVar.b;
        arhz arhzVar2 = (arhz) builder3.build();
        gol golVar = this.a;
        golVar.b = arhzVar2;
        Object obj2 = golVar.c;
        if (obj2 instanceof aqjc) {
            aong aongVar2 = (aong) ((aqjc) obj2).toBuilder();
            aqjc aqjcVar = (aqjc) golVar.c;
            if (aqjcVar.c == 22) {
                aulqVar = (aulq) aqjcVar.d;
            } else {
                aulqVar = aulq.a;
            }
            aong aongVar3 = (aong) aulqVar.toBuilder();
            aongVar3.e(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer, golVar.b);
            aongVar2.copyOnWrite();
            aqjc aqjcVar2 = (aqjc) aongVar2.instance;
            aulq aulqVar2 = (aulq) aongVar3.build();
            aulqVar2.getClass();
            aqjcVar2.d = aulqVar2;
            aqjcVar2.c = 22;
            golVar.c = aongVar2.build();
            return null;
        }
        if (obj2 instanceof mge) {
            aone builder5 = ((mge) obj2).a().toBuilder();
            aulq aulqVar3 = ((mge) golVar.c).a().c;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            aong aongVar4 = (aong) aulqVar3.toBuilder();
            aongVar4.e(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer, golVar.b);
            builder5.copyOnWrite();
            auge augeVar = (auge) builder5.instance;
            aulq aulqVar4 = (aulq) aongVar4.build();
            aulqVar4.getClass();
            augeVar.c = aulqVar4;
            augeVar.b |= 1;
            ((mge) golVar.c).d = (auge) builder5.build();
            return null;
        }
        if (!(obj2 instanceof mgf)) {
            return null;
        }
        aone builder6 = ((mgf) obj2).a().toBuilder();
        aulq aulqVar5 = ((mgf) golVar.c).a().c;
        if (aulqVar5 == null) {
            aulqVar5 = aulq.a;
        }
        aong aongVar5 = (aong) aulqVar5.toBuilder();
        aongVar5.e(InlinePlaybackRendererOuterClass.inlinePlaybackRenderer, golVar.b);
        builder6.copyOnWrite();
        augi augiVar = (augi) builder6.instance;
        aulq aulqVar6 = (aulq) aongVar5.build();
        aulqVar6.getClass();
        augiVar.c = aulqVar6;
        augiVar.b |= 1;
        ((mgf) golVar.c).d = (augi) builder6.build();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v9, types: [ajop, java.lang.Object] */
    @Override // defpackage.ajom
    public final void oB(ajok ajokVar, Object obj) {
        gol bp = evr.bp(obj);
        if (bp == null) {
            bp = gol.a;
        }
        this.a = bp;
        this.i.removeAllViews();
        if (ajokVar.j("inlineFullscreen", false)) {
            if (this.k == null) {
                this.k = e(new ajpe(), d(R.layout.inline_video_fullscreen), this.f);
            }
            this.l = this.k;
        } else {
            if (this.j == null) {
                ?? r8 = this.c.get();
                View d = d(R.layout.inline_video);
                aahd aahdVar = this.f;
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.apps.youtube.app.endpoint.flags", 8);
                this.j = e(r8, d, new gve(aahdVar, hashMap));
                Resources resources = this.b.getResources();
                this.j.a.addOnLayoutChangeListener(new mid(new Rect(0, 0, 0, (resources.getDimensionPixelSize(R.dimen.inline_time_bar_size) - resources.getDimensionPixelSize(R.dimen.inline_controls_bottom_bar_height)) / 2)));
            }
            this.l = this.j;
        }
        this.i.addView(this.l.a());
        this.l.oB(ajokVar, this.a.b);
        this.l.f(!this.h.f());
        this.l.g(this.m.a.g() != null, this.m);
    }
}
