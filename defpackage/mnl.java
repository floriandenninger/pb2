package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mnl extends mlc implements lsa {
    private final int C;
    private final int D;
    private final LinearLayout E;
    private final RelativeLayout F;
    private final SwipeLayout G;
    private final ViewStub H;
    private final ajos I;

    /* renamed from: J, reason: collision with root package name */
    private ajoi f237J;
    private View K;
    private jyb L;
    private zeq M;
    private List N;
    private jru O;
    private aqdb P;
    private final abwz Q;
    private final ohg R;
    private final shf a;
    private final ajop b;
    private final ajuw c;
    private final lsb d;
    private final aahd e;
    private apju f;

    public mnl(Context context, ajjz ajjzVar, aahd aahdVar, shf shfVar, gma gmaVar, ajuw ajuwVar, ohg ohgVar, lsb lsbVar, abwz abwzVar, ajpa ajpaVar, ajoy ajoyVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(context, ajjzVar, gmaVar, LayoutInflater.from(context).inflate(R.layout.compact_video_item, (ViewGroup) null, false), aahdVar, ohgVar, ajoyVar, cVar, null, null, null, null, null, null);
        this.a = shfVar;
        this.b = gmaVar;
        ajuwVar.getClass();
        this.c = ajuwVar;
        this.e = aahdVar;
        this.R = ohgVar;
        this.d = lsbVar;
        this.Q = abwzVar;
        lsbVar.a(this);
        this.C = context.getResources().getDimensionPixelSize(R.dimen.compact_video_padding_start);
        this.D = context.getResources().getDimensionPixelSize(R.dimen.compact_video_padding_bottom);
        this.I = ajpaVar;
        View view = this.i;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.video_info_view);
        this.E = linearLayout;
        this.F = (RelativeLayout) linearLayout.findViewById(R.id.thumbnail_layout);
        this.G = (SwipeLayout) view.findViewById(R.id.compact_swipe_layout);
        this.H = (ViewStub) linearLayout.findViewById(R.id.offline_badge_beside_details);
        gmaVar.c(linearLayout);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.i;
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.P = null;
        this.f237J.c();
        jyb jybVar = this.L;
        if (jybVar != null) {
            jybVar.c.m(jybVar);
            fjg fjgVar = jybVar.q;
            if (fjgVar != null) {
                jybVar.g.b(fjgVar);
            }
            fjl fjlVar = jybVar.p;
            if (fjlVar != null) {
                jybVar.f.b(fjlVar);
            }
            int a = jybVar.a(R.attr.ytTextPrimary);
            int a2 = jybVar.a(R.attr.ytTextSecondary);
            jybVar.j.setTextColor(a);
            jybVar.l.setTextColor(a2);
            jybVar.l.setSingleLine();
            whu.I(jybVar.k, true);
            jybVar.c();
            whu.I(jybVar.m, false);
            whu.I(jybVar.o, false);
            jybVar.n.setOnClickListener(null);
            ajop ajopVar = jybVar.s;
            if (ajopVar != null) {
                ajopVar.d(jybVar.d);
                jybVar.s = null;
            }
            jybVar.r = null;
            jybVar.t = null;
            jybVar.u = null;
            jybVar.v = null;
            jybVar.w = null;
            this.L = null;
        }
        muf.i(this.M, this.G, this.N, ajosVar);
        this.M = null;
        jru jruVar = this.O;
        if (jruVar != null) {
            jruVar.a();
        }
    }

    @Override // defpackage.lsa
    public final frh d() {
        return this.r;
    }

    @Override // defpackage.lsa
    public final apju e() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04c5 A[LOOP:0: B:193:0x04bf->B:195:0x04c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02d9  */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void oB(defpackage.ajok r34, java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnl.oB(ajok, java.lang.Object):void");
    }
}
