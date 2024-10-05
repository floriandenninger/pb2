package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.youtube.R;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ixj extends ivu implements ypd {
    private static final Pattern aF = Pattern.compile("RD.*");
    public zaw aA;
    public acra aB;
    public boolean aC;
    public int aD;
    public aadw aE;
    private View aG;
    private View aH;
    private TextView aI;
    private View aJ;
    private View aK;
    private TextView aL;
    private ImageView aM;
    private ykn aN;
    private PlaybackStartDescriptor aO;
    private CharSequence aP;
    public View ae;
    public View af;
    public View ag;
    public aihs ah;
    public ajjz ai;
    public adlt ak;
    public ainy al;
    public ainl am;
    public ypa an;
    public jgf ao;
    public aild ap;
    public nne aq;
    public obr ar;
    public gcl as;
    public String at;
    public int au;
    public String av;
    public long aw;
    public CountDownLatch ay;
    public PlayerResponseModel az;
    public final ixi aj = new ixi(this, 0);
    public boolean ax = true;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
    
        if (r4 != 5) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aN() {
        /*
            r11 = this;
            ainy r0 = r11.al
            java.lang.String r0 = r0.q()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            android.view.View r3 = r11.aG
            r3.setVisibility(r1)
            android.view.View r3 = r11.aJ
            ixf r4 = new ixf
            r4.<init>(r11)
            r3.setOnClickListener(r4)
            int r3 = r11.aD
            int r4 = r3 + (-1)
            r5 = 0
            if (r3 == 0) goto Lc6
            r3 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            if (r4 == r2) goto L53
            if (r4 == r8) goto L53
            if (r4 == r7) goto L43
            if (r4 == r6) goto L33
            if (r4 == r3) goto L43
            r4 = r5
            goto L62
        L33:
            if (r0 == 0) goto L3c
            r4 = 29041(0x7171, float:4.0695E-41)
            acsc r4 = defpackage.acsb.c(r4)
            goto L62
        L3c:
            r4 = 27431(0x6b27, float:3.8439E-41)
            acsc r4 = defpackage.acsb.c(r4)
            goto L62
        L43:
            if (r0 == 0) goto L4c
            r4 = 29042(0x7172, float:4.0697E-41)
            acsc r4 = defpackage.acsb.c(r4)
            goto L62
        L4c:
            r4 = 27429(0x6b25, float:3.8436E-41)
            acsc r4 = defpackage.acsb.c(r4)
            goto L62
        L53:
            if (r0 == 0) goto L5c
            r4 = 29037(0x716d, float:4.069E-41)
            acsc r4 = defpackage.acsb.c(r4)
            goto L62
        L5c:
            r4 = 27427(0x6b23, float:3.8433E-41)
            acsc r4 = defpackage.acsb.c(r4)
        L62:
            if (r4 == 0) goto L6e
            acra r9 = r11.aB
            acqx r10 = new acqx
            r10.<init>(r4)
            r9.n(r10)
        L6e:
            android.view.View r4 = r11.aK
            ixf r9 = new ixf
            r9.<init>(r11)
            r4.setOnClickListener(r9)
            int r1 = r11.aD
            int r4 = r1 + (-1)
            if (r1 == 0) goto Lc5
            if (r4 == r2) goto La9
            if (r4 == r8) goto La9
            if (r4 == r7) goto L99
            if (r4 == r6) goto L89
            if (r4 == r3) goto L99
            goto Lb8
        L89:
            if (r0 == 0) goto L92
            r0 = 29039(0x716f, float:4.0692E-41)
            acsc r5 = defpackage.acsb.c(r0)
            goto Lb8
        L92:
            r0 = 27432(0x6b28, float:3.844E-41)
            acsc r5 = defpackage.acsb.c(r0)
            goto Lb8
        L99:
            if (r0 == 0) goto La2
            r0 = 29040(0x7170, float:4.0694E-41)
            acsc r5 = defpackage.acsb.c(r0)
            goto Lb8
        La2:
            r0 = 27430(0x6b26, float:3.8438E-41)
            acsc r5 = defpackage.acsb.c(r0)
            goto Lb8
        La9:
            if (r0 == 0) goto Lb2
            r0 = 29038(0x716e, float:4.0691E-41)
            acsc r5 = defpackage.acsb.c(r0)
            goto Lb8
        Lb2:
            r0 = 27428(0x6b24, float:3.8435E-41)
            acsc r5 = defpackage.acsb.c(r0)
        Lb8:
            if (r5 == 0) goto Lc4
            acra r0 = r11.aB
            acqx r1 = new acqx
            r1.<init>(r5)
            r0.n(r1)
        Lc4:
            return
        Lc5:
            throw r5
        Lc6:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixj.aN():void");
    }

    private final boolean aO() {
        return !TextUtils.isEmpty(this.at) && TextUtils.isEmpty(this.av);
    }

    public final void aH() {
        adlm g = this.ak.g();
        if (g != null && g.a() == 1) {
            this.ak.g().B(this.av);
        }
        if (this.aC && this.ar.c()) {
            this.aq.r(1, 2);
        }
        this.as.j(gcq.f(this.aP).b());
        this.an.m(this);
    }

    public final void aI(PlayerResponseModel playerResponseModel) {
        this.ap.k(playerResponseModel.q(), new ixh(this), this.av);
    }

    public final void aJ() {
        if (!aO()) {
            this.ae.setVisibility(0);
            this.af.setVisibility(8);
            this.ag.setVisibility(8);
            this.aN = ykn.c(new ixi(this, 1));
            aK(this.av, yki.c(C(), this.aN));
            return;
        }
        aM();
    }

    public final void aK(String str, ykl yklVar) {
        this.ah.h(str, this.aO.y(), this.aO.j(), -1, yklVar);
    }

    public final void aL(adlm adlmVar, boolean z) {
        if (C() == null) {
            kv();
            return;
        }
        if (adlmVar == null && !z) {
            kv();
            return;
        }
        if (z) {
            this.aI.setText(C().getString(R.string.reconnecting));
            this.aH.setVisibility(0);
            return;
        }
        int a = adlmVar.a();
        if (a == 0) {
            if (adlmVar.aj()) {
                this.aI.setText(C().getString(R.string.reconnecting));
            } else {
                this.aI.setText(C().getString(R.string.connecting));
            }
            this.aH.setVisibility(0);
            return;
        }
        if (a != 1) {
            kv();
            return;
        }
        this.aH.setVisibility(8);
        if (aO() || this.az != null) {
            aN();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if (r1 != 5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aM() {
        /*
            r4 = this;
            android.view.View r0 = r4.ae
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r4.af
            r0.setVisibility(r1)
            android.view.View r0 = r4.ag
            r1 = 0
            r0.setVisibility(r1)
            adlt r0 = r4.ak
            adlm r0 = r0.g()
            if (r0 != 0) goto L1b
            return
        L1b:
            int r0 = r0.a()
            if (r0 == 0) goto L2c
            adlt r0 = r4.ak
            boolean r0 = r0.o()
            if (r0 != 0) goto L2c
            r4.aN()
        L2c:
            int r0 = r4.aD
            int r1 = r0 + (-1)
            if (r0 == 0) goto L5f
            r0 = 3
            if (r1 == r0) goto L45
            r0 = 4
            if (r1 == r0) goto L3c
            r0 = 5
            if (r1 == r0) goto L45
            goto L4d
        L3c:
            android.widget.TextView r0 = r4.aL
            r1 = 2132018977(0x7f140721, float:1.9676276E38)
            r0.setText(r1)
            goto L4d
        L45:
            android.widget.TextView r0 = r4.aL
            r1 = 2132018976(0x7f140720, float:1.9676274E38)
            r0.setText(r1)
        L4d:
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r4.az
            if (r0 == 0) goto L5e
            ajjz r1 = r4.ai
            android.widget.ImageView r2 = r4.aM
            aami r0 = r0.b()
            ajjv r3 = defpackage.ajjv.b
            r1.j(r2, r0, r3)
        L5e:
            return
        L5f:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixj.aM():void");
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        CountDownLatch countDownLatch;
        if (i == -1) {
            return new Class[]{adlu.class, aftm.class, ahdv.class};
        }
        if (i == 0) {
            aL(((adlu) obj).a(), this.ak.o());
            return null;
        }
        if (i == 1) {
            if (this.al.q() == null) {
                return null;
            }
            this.ay = new CountDownLatch(2);
            return null;
        }
        if (i == 2) {
            if (((ahdv) obj).c() != aigk.VIDEO_WATCH_LOADED || (countDownLatch = this.ay) == null) {
                return null;
            }
            countDownLatch.countDown();
            if (this.ay.getCount() != 0) {
                return null;
            }
            aH();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void lY() {
        super.lY();
        this.ao = null;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mD() {
        super.mD();
        ykn yknVar = this.aN;
        if (yknVar != null) {
            yknVar.d();
            this.aN = null;
        }
        if (this.ax) {
            this.an.m(this);
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        atax ataxVar = this.aE.b().n;
        if (ataxVar == null) {
            ataxVar = atax.a;
        }
        this.aC = ataxVar.k;
        this.aP = qX().getText(R.string.video_added_to_tv_queue);
        this.aB.d(acsb.b(14908), aahg.b(this.m.getByteArray("navigation_endpoint")), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e6  */
    @Override // defpackage.bv, defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mS() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixj.mS():void");
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.remote_watch_dialog_fragment, viewGroup, false);
        this.ae = inflate.findViewById(R.id.loading);
        this.af = inflate.findViewById(R.id.error);
        this.ag = inflate.findViewById(R.id.content);
        this.aH = inflate.findViewById(R.id.connecting);
        this.aI = (TextView) inflate.findViewById(R.id.connecting_textview);
        this.aG = inflate.findViewById(R.id.remote_actions);
        this.aJ = inflate.findViewById(R.id.play);
        this.aL = (TextView) inflate.findViewById(R.id.play_text);
        this.aK = inflate.findViewById(R.id.queue);
        this.aM = (ImageView) inflate.findViewById(R.id.thumbnail);
        return inflate;
    }

    @Override // defpackage.bv
    public final Dialog oq(Bundle bundle) {
        Dialog oq = super.oq(bundle);
        oq.getWindow().requestFeature(1);
        return oq;
    }
}
