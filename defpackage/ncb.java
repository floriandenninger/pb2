package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Spanned;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlaybackLifecycleController;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ncb extends mlc implements ajof {
    public final View C;
    public Bitmap D;
    public String E;
    private final ajop F;
    private final ajoi G;
    private ajok H;
    private gol I;
    private final aahd a;
    private final InlinePlaybackLifecycleController b;
    private final mgu c;
    private final mhg d;
    private final ajjv e;
    public final nby f;

    /* JADX INFO: Access modifiers changed from: protected */
    public ncb(ajjz ajjzVar, ajut ajutVar, ajuw ajuwVar, View view, View view2, View view3, Context context, aahd aahdVar, InlinePlaybackLifecycleController inlinePlaybackLifecycleController, mgu mguVar, mhg mhgVar, ajop ajopVar, ajyw ajywVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(context, ajjzVar, ajopVar, view2, aahdVar, ajutVar, (ohg) null, (ajoy) null, (c) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.f = new nby(ajjzVar, ajutVar, ajuwVar, view, view3, true, ajywVar, akbdVar, null, null, null, null, null);
        this.a = aahdVar;
        this.b = inlinePlaybackLifecycleController;
        this.c = mguVar;
        this.F = ajopVar;
        this.G = new ajoi(aahdVar, ajopVar, this);
        this.d = mhgVar;
        this.C = view2.findViewById(R.id.thumbnail_layout);
        ajju a = ajjv.a();
        a.c = new nca(this, mguVar);
        this.e = a.a();
    }

    public static final boolean f(gol golVar, gol golVar2) {
        if (golVar == null || golVar2 == null) {
            return golVar == golVar2;
        }
        return amkq.b(golVar.b, golVar2.b);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.F.a();
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.C.setAlpha(1.0f);
        this.G.c();
    }

    public final ayph d(int i, ggr ggrVar) {
        if (i == 0) {
            return this.b.i(this.I);
        }
        return this.b.j(this.I, ggrVar, i != 2 ? 0 : 2);
    }

    @Override // defpackage.ajom
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, gol golVar) {
        apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        avgg avggVar;
        this.I = golVar;
        arhz arhzVar = golVar.b;
        this.E = arhzVar.k;
        avfp avfpVar = null;
        this.D = null;
        this.H = ajokVar;
        ajoi ajoiVar = this.G;
        acra acraVar = ajokVar.a;
        if ((arhzVar.b & 256) != 0) {
            apxfVar = arhzVar.i;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.b(acraVar, apxfVar, ajokVar.e(), this);
        if ((arhzVar.b & 16) != 0) {
            aqygVar = arhzVar.f;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        Spanned b = ajcq.b(aqygVar);
        if ((arhzVar.b & 16) != 0) {
            aqygVar2 = arhzVar.f;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        p(b, ajcq.i(aqygVar2), arhzVar.d, null);
        if ((arhzVar.b & 2) != 0) {
            avggVar = arhzVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        z(avggVar, this.e);
        t(mcy.O(arhzVar.d));
        ftp ftpVar = this.p;
        if (ftpVar != null) {
            ftpVar.a();
        }
        aulq aulqVar = arhzVar.e;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(avga.a)) {
            aulq aulqVar2 = arhzVar.e;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            avfpVar = (avfp) aulqVar2.pX(avga.a);
        }
        if (avfpVar != null) {
            x(avfpVar, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        this.f.f(false);
    }

    @Override // defpackage.ajof
    public final boolean h(View view) {
        mhg mhgVar = this.d;
        gol golVar = this.I;
        aahd aahdVar = this.a;
        ajok ajokVar = this.H;
        return mhgVar.b(golVar, aahdVar, ajokVar.a, ajokVar.e(), this);
    }

    public final void i() {
        Bitmap bitmap = this.D;
        if (bitmap != null) {
            this.c.b(this.E, bitmap);
        }
    }

    @Override // defpackage.mlc, defpackage.ajog
    public final void oh(Map map) {
        avgg avggVar;
        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", this.C);
        arhz arhzVar = this.I.b;
        if ((arhzVar.b & 2) != 0) {
            avggVar = arhzVar.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
        } else {
            avggVar = null;
        }
        map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", avggVar);
        this.d.a(this.I, map);
    }
}
