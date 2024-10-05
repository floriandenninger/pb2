package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioRelativeLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lft extends mlc {
    private final FixedAspectRatioFrameLayout C;
    private final FixedAspectRatioRelativeLayout D;
    private final YouTubeTextView E;
    private final View F;
    private final LinearLayout G;
    private final ViewStub H;
    private final View I;
    public apxf a;
    public final aahd b;
    public final ftw c;
    public final ajun d;
    private final ajoi e;
    private final ajut f;

    public lft(Context context, ajjz ajjzVar, aahd aahdVar, ajut ajutVar, fvf fvfVar, ajun ajunVar, akbd akbdVar, ViewGroup viewGroup, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(context, ajjzVar, new ajpe(), LayoutInflater.from(context).inflate(R.layout.watch_card_hero_video, viewGroup, false), aahdVar, ajutVar, (ohg) null, (ajoy) null, (c) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
        FixedAspectRatioFrameLayout fixedAspectRatioFrameLayout = (FixedAspectRatioFrameLayout) this.i;
        this.C = fixedAspectRatioFrameLayout;
        FixedAspectRatioRelativeLayout fixedAspectRatioRelativeLayout = (FixedAspectRatioRelativeLayout) fixedAspectRatioFrameLayout.findViewById(R.id.hero_image_container);
        this.D = fixedAspectRatioRelativeLayout;
        this.e = new ajoi(aahdVar, fixedAspectRatioRelativeLayout);
        this.b = aahdVar;
        this.f = ajutVar;
        this.E = (YouTubeTextView) fixedAspectRatioFrameLayout.findViewById(R.id.play_all_button);
        this.G = (LinearLayout) fixedAspectRatioFrameLayout.findViewById(R.id.info_container);
        this.F = fixedAspectRatioFrameLayout.findViewById(R.id.gradient);
        this.H = (ViewStub) fixedAspectRatioFrameLayout.findViewById(R.id.watch_card_collage_stub);
        View findViewById = fixedAspectRatioFrameLayout.findViewById(R.id.reminder_button);
        this.I = findViewById;
        this.c = fvfVar.c(findViewById);
        this.d = ajunVar;
        if (akbdVar.d()) {
            akbdVar.c(fixedAspectRatioRelativeLayout, akbdVar.a(fixedAspectRatioRelativeLayout, null));
        } else {
            whu.s(fixedAspectRatioRelativeLayout, whu.x(context, 0));
        }
    }

    private final void d(View view, int i, avgg avggVar) {
        ImageView imageView = (ImageView) view.findViewById(i);
        this.h.h(imageView, avggVar);
        imageView.setVisibility(true != ahbw.L(avggVar) ? 8 : 0);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.i;
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        this.e.c();
        super.b(ajosVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ac  */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oB(defpackage.ajok r18, java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lft.oB(ajok, java.lang.Object):void");
    }
}
