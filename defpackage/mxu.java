package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.EndorsementMetadataSwapRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxu implements ajom, lsa, gmf, ypd {
    protected final Context a;
    final fyl b;
    mxt c;
    private final aahd d;
    private final ypa e;
    private final gfy f;
    private final ajuw g;
    private final lsb h;
    private final ajnv i;
    private apju j;
    private final ajos k;
    private mqr l;
    private final FrameLayout m;
    private awal n;
    private final aadw o;
    private final c p;
    private final ajyw q;
    private final ajyw r;

    public mxu(Context context, ypa ypaVar, aahd aahdVar, gfy gfyVar, ajuw ajuwVar, aadw aadwVar, lsb lsbVar, ajyw ajywVar, ajyw ajywVar2, ajnv ajnvVar, ajos ajosVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.a = context;
        this.e = ypaVar;
        this.d = aahdVar;
        this.f = gfyVar;
        this.g = ajuwVar;
        this.r = ajywVar2;
        this.i = ajnvVar;
        fyl fylVar = new fyl(wbs.W(context, R.attr.ytSeparator).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height));
        this.b = fylVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.m = frameLayout;
        frameLayout.setBackground(fylVar);
        this.h = lsbVar;
        lsbVar.a(this);
        this.q = ajywVar;
        this.k = ajosVar;
        this.o = aadwVar;
        this.p = cVar;
    }

    private final int g() {
        return this.a.getResources().getConfiguration().orientation;
    }

    private static apkf h(awal awalVar) {
        if ((awalVar.b & 2097152) == 0) {
            return null;
        }
        apkd apkdVar = awalVar.t;
        if (apkdVar == null) {
            apkdVar = apkd.a;
        }
        apkf apkfVar = apkdVar.d;
        return apkfVar == null ? apkf.a : apkfVar;
    }

    private static boolean i(awal awalVar) {
        if (awalVar == null) {
            return false;
        }
        aulq aulqVar = awalVar.A;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        return aulqVar.pY(EndorsementMetadataSwapRendererOuterClass.endorsementMetadataSwapRenderer);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.m;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.n = null;
        this.e.m(this);
        mxt mxtVar = this.c;
        if (mxtVar != null) {
            mxtVar.b(ajosVar);
            this.m.removeAllViews();
            ajosVar.b(this.c.i);
        }
        mqr mqrVar = this.l;
        if (mqrVar != null) {
            mqrVar.a();
        }
    }

    @Override // defpackage.lsa
    public final frh d() {
        mxt mxtVar = this.c;
        if (mxtVar == null) {
            return null;
        }
        return mxtVar.r;
    }

    @Override // defpackage.lsa
    public final apju e() {
        return this.j;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        ftp ftpVar;
        if (i == -1) {
            return new Class[]{gfx.class};
        }
        if (i == 0) {
            boolean a = ((gfx) obj).a();
            mxt mxtVar = this.c;
            if (mxtVar == null || (ftpVar = mxtVar.p) == null) {
                return null;
            }
            int i2 = true != a ? 8 : 0;
            View view = ftpVar.f;
            if (!ftpVar.e || view == null || !ftpVar.c) {
                return null;
            }
            view.setVisibility(i2);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.gmf
    public final boolean oA(gmf gmfVar) {
        if (gmfVar instanceof mxu) {
            return amkq.b(((mxu) gmfVar).n, this.n);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:309:0x027f, code lost:
    
        if (r8 != 10) goto L165;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0628 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:259:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03c4  */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oB(defpackage.ajok r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 1666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mxu.oB(ajok, java.lang.Object):void");
    }

    @Override // defpackage.gmf
    public final ayph oz(int i) {
        if (this.l != null) {
            if ((i == 1 || i == 2) && i(this.n)) {
                this.l.c();
            } else if (i == 0 && i(this.n)) {
                this.l.b();
            }
        }
        return ayph.f();
    }
}
