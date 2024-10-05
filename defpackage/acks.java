package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acks implements View.OnClickListener, abvm {
    public final atgg a;
    public final List b;
    public final ackq c;
    public final ViewGroup d;
    public final acra e;
    public final byte[] f;
    public PopupWindow g;
    private final ajut h;
    private final Context i;
    private final aahd j;
    private final apmg k;
    private final LayoutInflater l;
    private final List m = new ArrayList();
    private final Map n = new HashMap();
    private int o = -1;

    public acks(Context context, ackq ackqVar, atgg atggVar, ajut ajutVar, aahd aahdVar, acra acraVar, int i, int i2) {
        apmg apmgVar;
        this.i = context;
        this.c = ackqVar;
        atggVar.getClass();
        this.a = atggVar;
        this.h = ajutVar;
        this.j = aahdVar;
        this.e = acraVar;
        atgd atgdVar = atggVar.c;
        amkq.N((atgdVar == null ? atgd.a : atgdVar).b == 65153809);
        atgd atgdVar2 = atggVar.c;
        atgdVar2 = atgdVar2 == null ? atgd.a : atgdVar2;
        if (atgdVar2.b == 65153809) {
            apmgVar = (apmg) atgdVar2.c;
        } else {
            apmgVar = apmg.a;
        }
        this.b = atggVar.e;
        this.l = LayoutInflater.from(context);
        ImageButton imageButton = new ImageButton(context);
        if ((apmgVar.b & 32) != 0) {
            arfs arfsVar = apmgVar.g;
            arfr b = arfr.b((arfsVar == null ? arfs.a : arfsVar).c);
            imageButton.setImageResource(ajutVar.a(b == null ? arfr.UNKNOWN : b));
        }
        if ((apmgVar.b & 65536) != 0) {
            aots aotsVar = apmgVar.r;
            imageButton.setContentDescription((aotsVar == null ? aots.a : aotsVar).c);
        }
        byte[] I = apmgVar.t.I();
        this.f = I;
        this.k = apmgVar;
        imageButton.setOnClickListener(this);
        imageButton.setBackgroundColor(0);
        whu.F(imageButton, imageButton.getBackground(), 1);
        acraVar.D(new acqx(I));
        FrameLayout frameLayout = new FrameLayout(context);
        this.d = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.addView(imageButton);
        ViewGroup.LayoutParams layoutParams = imageButton.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
    }

    public static final int c(LinearLayout linearLayout, View view) {
        return ((-linearLayout.getMeasuredHeight()) - view.getHeight()) - view.getPaddingTop();
    }

    @Override // defpackage.abvm
    public final void a(int i) {
        this.n.remove(Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        if (r2 == ((defpackage.acif) r5.c).aE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
    
        if (r2 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005d, code lost:
    
        if (r2 == r1) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0066, code lost:
    
        if (r2 == ((defpackage.acif) r5.c).aD) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        if (r2 == ((defpackage.acif) r5.c).e.aO()) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        if (r2 == ((defpackage.acif) r5.c).ay) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0085, code lost:
    
        if (r2 == ((defpackage.acif) r5.c).az) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.util.List r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != 0) goto L4
            return r0
        L4:
            java.util.Iterator r6 = r6.iterator()
            r1 = 1
        L9:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L8a
            java.lang.Object r1 = r6.next()
            atgl r1 = (defpackage.atgl) r1
            int r2 = r1.b
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L24
            java.lang.Object r2 = r1.c
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L25
        L24:
            r2 = 0
        L25:
            int r1 = r1.d
            int r1 = defpackage.anaf.ci(r1)
            if (r1 != 0) goto L2e
            r1 = 1
        L2e:
            int r1 = r1 + (-1)
            switch(r1) {
                case 1: goto L7f;
                case 2: goto L76;
                case 3: goto L69;
                case 4: goto L60;
                case 5: goto L52;
                case 6: goto L3e;
                case 7: goto L35;
                default: goto L33;
            }
        L33:
            r1 = 0
            goto L88
        L35:
            ackq r1 = r5.c
            acif r1 = (defpackage.acif) r1
            boolean r1 = r1.aE
            if (r2 != r1) goto L33
            goto L87
        L3e:
            ackq r1 = r5.c
            acif r1 = (defpackage.acif) r1
            atgf r1 = r1.aB
            if (r1 == 0) goto L4e
            int r1 = r1.b
            r1 = r1 & 16
            if (r1 == 0) goto L4e
            r1 = 1
            goto L4f
        L4e:
            r1 = 0
        L4f:
            if (r2 != r1) goto L33
            goto L87
        L52:
            ackq r1 = r5.c
            acif r1 = (defpackage.acif) r1
            int r1 = r1.aA
            if (r1 > r0) goto L5c
            r1 = 0
            goto L5d
        L5c:
            r1 = 1
        L5d:
            if (r2 != r1) goto L33
            goto L87
        L60:
            ackq r1 = r5.c
            acif r1 = (defpackage.acif) r1
            boolean r1 = r1.aD
            if (r2 != r1) goto L33
            goto L87
        L69:
            ackq r1 = r5.c
            acif r1 = (defpackage.acif) r1
            acih r1 = r1.e
            boolean r1 = r1.aO()
            if (r2 != r1) goto L33
            goto L87
        L76:
            ackq r1 = r5.c
            acif r1 = (defpackage.acif) r1
            boolean r1 = r1.ay
            if (r2 != r1) goto L33
            goto L87
        L7f:
            ackq r1 = r5.c
            acif r1 = (defpackage.acif) r1
            boolean r1 = r1.az
            if (r2 != r1) goto L33
        L87:
            r1 = 1
        L88:
            if (r1 != 0) goto L9
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acks.b(java.util.List):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0216, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() < (r12 + r10)) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0259, code lost:
    
        r2 = r16.i;
        r5 = r3.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x025d, code lost:
    
        if (r5 != null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x025f, code lost:
    
        r5 = defpackage.aqyg.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0261, code lost:
    
        defpackage.whu.L(r2, defpackage.ajcq.b(r5).toString(), 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0256, code lost:
    
        if (android.os.SystemClock.elapsedRealtime() < (r12 + r10)) goto L123;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r17) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acks.onClick(android.view.View):void");
    }
}
