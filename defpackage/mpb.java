package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mpb extends mlc implements lsa {
    private final ajoi C;
    private final lsb D;
    private final ViewStub E;
    private final shf F;
    private final ImageView G;
    private View H;
    private apju I;

    /* renamed from: J, reason: collision with root package name */
    private jru f238J;
    private ardf K;
    private final aaea L;
    private final ohg M;
    protected final Resources a;
    protected final ajop b;
    protected final LinearLayout c;
    protected final RelativeLayout d;
    protected final RelativeLayout e;
    private final ajuw f;

    public mpb(Context context, ajjz ajjzVar, ajop ajopVar, aahd aahdVar, ajuw ajuwVar, shf shfVar, ViewGroup viewGroup, lsb lsbVar, ohg ohgVar, aaea aaeaVar, ajoy ajoyVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(context, ajjzVar, aahdVar, ajopVar, R.layout.compact_video_item, viewGroup, ohgVar, ajoyVar, cVar, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        this.a = context.getResources();
        this.b = ajopVar;
        ajuwVar.getClass();
        this.f = ajuwVar;
        this.C = new ajoi(aahdVar, ajopVar);
        this.F = shfVar;
        this.D = lsbVar;
        lsbVar.a(this);
        this.M = ohgVar;
        View view = this.i;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.video_info_view);
        this.c = linearLayout;
        this.d = (RelativeLayout) linearLayout.findViewById(R.id.thumbnail_layout);
        this.e = (RelativeLayout) linearLayout.findViewById(R.id.text_layout);
        this.E = (ViewStub) linearLayout.findViewById(R.id.offline_badge_beside_details);
        this.G = (ImageView) view.findViewById(R.id.channel_avatar);
        jw.M(view, new moz());
        this.L = aaeaVar;
    }

    private static apkf f(ardf ardfVar) {
        apkd apkdVar = ardfVar.s;
        if (apkdVar == null) {
            apkdVar = apkd.a;
        }
        if ((apkdVar.b & 2) == 0) {
            return null;
        }
        apkd apkdVar2 = ardfVar.s;
        if (apkdVar2 == null) {
            apkdVar2 = apkd.a;
        }
        apkf apkfVar = apkdVar2.d;
        return apkfVar == null ? apkf.a : apkfVar;
    }

    private static final boolean g(aswa aswaVar) {
        int cX;
        return (aswaVar == null || (cX = amkq.cX(aswaVar.b)) == 0 || cX != 11) ? false : true;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b.a();
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.K = null;
        jru jruVar = this.f238J;
        if (jruVar != null) {
            jruVar.a();
        }
        this.C.c();
    }

    @Override // defpackage.lsa
    public final frh d() {
        return this.r;
    }

    @Override // defpackage.lsa
    public final apju e() {
        return this.I;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x01d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ee  */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oB(defpackage.ajok r17, java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mpb.oB(ajok, java.lang.Object):void");
    }
}
