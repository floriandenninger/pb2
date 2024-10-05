package com.google.android.libraries.youtube.mdx.mediaroute;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import defpackage.acqx;
import defpackage.acsb;
import defpackage.acwr;
import defpackage.acwv;
import defpackage.addk;
import defpackage.addo;
import defpackage.adfc;
import defpackage.adlt;
import defpackage.aypy;
import defpackage.azrl;
import defpackage.azrw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdxMediaRouteButton extends MediaRouteButton implements addo {
    public final azrl d;
    public azrw e;
    public adlt f;
    public azrw g;
    public acwr h;
    public acwv i;
    public boolean j;
    public adfc k;
    public addk l;
    public c m;

    public MdxMediaRouteButton(Context context) {
        super(context);
        this.d = azrl.e();
        this.j = false;
    }

    private final Activity j() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    @Override // defpackage.addo
    public final aypy h() {
        return this.d.U();
    }

    @Override // defpackage.addo
    public final void i() {
        addk addkVar = this.l;
        if (addkVar != null) {
            addkVar.a.a().n(new acqx(acsb.c(126925)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
    
        if (r0.a(r3 instanceof defpackage.ci ? ((defpackage.ci) r3).getSupportFragmentManager() : null) == false) goto L34;
     */
    @Override // androidx.mediarouter.app.MediaRouteButton, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean performClick() {
        /*
            r5 = this;
            defpackage.yjk.f()
            com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c r0 = r5.m
            if (r0 == 0) goto La
            r0.e()
        La:
            boolean r0 = r5.j
            r1 = 1
            if (r0 != 0) goto L20
            azrl r0 = r5.d
            boolean r0 = r0.aO()
            if (r0 != 0) goto L18
            goto L20
        L18:
            azrl r0 = r5.d
            zjf r2 = defpackage.zjf.a
            r0.c(r2)
            return r1
        L20:
            addk r0 = r5.l
            r2 = 0
            if (r0 == 0) goto L3a
            addn r0 = r0.a
            acra r0 = r0.a()
            acqx r3 = new acqx
            r4 = 11208(0x2bc8, float:1.5706E-41)
            acsc r4 = defpackage.acsb.c(r4)
            r3.<init>(r4)
            r4 = 3
            r0.I(r4, r3, r2)
        L3a:
            acwv r0 = r5.i
            boolean r0 = r0.b()
            if (r0 == 0) goto L97
            azrw r0 = r5.e
            java.lang.Object r0 = r0.get()
            bpw r0 = (defpackage.bpw) r0
            bpv r0 = defpackage.bpw.j()
            adlt r3 = r5.f
            adlm r3 = r3.g()
            if (r3 != 0) goto L67
            azrw r3 = r5.g
            java.lang.Object r3 = r3.get()
            addy r3 = (defpackage.addy) r3
            boolean r0 = r3.L(r0)
            if (r0 == 0) goto L67
            defpackage.bpw.o(r1)
        L67:
            acwr r0 = r5.h
            if (r0 == 0) goto L76
            boolean r0 = r0.e()
            if (r0 != 0) goto L76
            acwr r0 = r5.h
            r0.b()
        L76:
            adfc r0 = r5.k
            if (r0 == 0) goto L8e
            android.app.Activity r3 = r5.j()
            boolean r4 = r3 instanceof defpackage.ci
            if (r4 == 0) goto L88
            ci r3 = (defpackage.ci) r3
            dd r2 = r3.getSupportFragmentManager()
        L88:
            boolean r0 = r0.a(r2)
            if (r0 != 0) goto L94
        L8e:
            boolean r0 = super.performClick()
            if (r0 == 0) goto L95
        L94:
            return r1
        L95:
            r0 = 0
            return r0
        L97:
            acwv r0 = r5.i
            android.app.Activity r2 = r5.j()
            r0.a(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.youtube.mdx.mediaroute.MdxMediaRouteButton.performClick():boolean");
    }

    public MdxMediaRouteButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = azrl.e();
        this.j = false;
    }

    public MdxMediaRouteButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = azrl.e();
        this.j = false;
    }
}
