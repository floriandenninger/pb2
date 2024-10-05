package com.google.android.apps.youtube.app.common.rendering.elements.litho.datastore;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.common.rendering.elements.litho.datastore.MainAppPlayerOverlayDataProvider;
import defpackage.ahbw;
import defpackage.aioc;
import defpackage.any;
import defpackage.aok;
import defpackage.aone;
import defpackage.aswe;
import defpackage.ayqw;
import defpackage.ayqx;
import defpackage.azqb;
import defpackage.eoo;
import defpackage.fjw;
import defpackage.fno;
import defpackage.fqt;
import defpackage.kly;
import defpackage.sxd;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MainAppPlayerOverlayDataProvider implements any {
    private final fno g;
    private final aioc h;
    private final kly i;
    private final sxd k;
    private final DisplayMetrics l;
    private final View m;
    private View.OnLayoutChangeListener n;
    private ayqx o;
    public boolean b = false;
    public boolean c = false;
    public final Rect a = new Rect();
    public String d = null;
    public int f = 1;
    public int e = 1;
    private final ayqw j = new ayqw();

    public MainAppPlayerOverlayDataProvider(Context context, sxd sxdVar, YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout, fno fnoVar, aioc aiocVar, kly klyVar) {
        this.k = sxdVar;
        this.l = context.getResources().getDisplayMetrics();
        this.m = youTubePlayerOverlaysLayout;
        this.g = fnoVar;
        this.h = aiocVar;
        this.i = klyVar;
    }

    private static int h(DisplayMetrics displayMetrics, int i) {
        return (int) ((i / displayMetrics.density) + 0.5f);
    }

    public final void g() {
        int i;
        sxd sxdVar = this.k;
        DisplayMetrics displayMetrics = this.l;
        View view = this.m;
        Rect rect = this.a;
        int i2 = this.e;
        String str = this.d;
        int i3 = this.f;
        boolean z = this.b;
        boolean z2 = this.c;
        int i4 = 0;
        if (view != null) {
            i4 = h(displayMetrics, view.getWidth());
            i = h(displayMetrics, view.getHeight());
        } else {
            i = 0;
        }
        aone createBuilder = aswe.a.createBuilder();
        createBuilder.copyOnWrite();
        aswe asweVar = (aswe) createBuilder.instance;
        asweVar.b |= 1;
        asweVar.c = i4;
        createBuilder.copyOnWrite();
        aswe asweVar2 = (aswe) createBuilder.instance;
        asweVar2.b |= 2;
        asweVar2.d = i;
        int h = h(displayMetrics, rect.left);
        createBuilder.copyOnWrite();
        aswe asweVar3 = (aswe) createBuilder.instance;
        asweVar3.b |= 4;
        asweVar3.e = h;
        int h2 = h(displayMetrics, rect.right);
        createBuilder.copyOnWrite();
        aswe asweVar4 = (aswe) createBuilder.instance;
        asweVar4.b |= 8;
        asweVar4.f = h2;
        int h3 = h(displayMetrics, rect.top);
        createBuilder.copyOnWrite();
        aswe asweVar5 = (aswe) createBuilder.instance;
        asweVar5.b |= 16;
        asweVar5.g = h3;
        int h4 = h(displayMetrics, rect.bottom);
        createBuilder.copyOnWrite();
        aswe asweVar6 = (aswe) createBuilder.instance;
        asweVar6.b |= 32;
        asweVar6.h = h4;
        createBuilder.copyOnWrite();
        aswe asweVar7 = (aswe) createBuilder.instance;
        int i5 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        asweVar7.j = i5;
        asweVar7.b |= 128;
        createBuilder.copyOnWrite();
        aswe asweVar8 = (aswe) createBuilder.instance;
        int i6 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        asweVar8.i = i6;
        asweVar8.b |= 64;
        createBuilder.copyOnWrite();
        aswe asweVar9 = (aswe) createBuilder.instance;
        asweVar9.b |= 1024;
        asweVar9.m = z;
        createBuilder.copyOnWrite();
        aswe asweVar10 = (aswe) createBuilder.instance;
        asweVar10.b |= 512;
        asweVar10.l = z2;
        if (str != null) {
            createBuilder.copyOnWrite();
            aswe asweVar11 = (aswe) createBuilder.instance;
            asweVar11.b |= 256;
            asweVar11.k = str;
        }
        sxdVar.b("/youtube/app/player_overlay", ((aswe) createBuilder.build()).toByteArray());
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lg(aok aokVar) {
        this.o = this.g.a.X(new fqt(this, 1));
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: fqs
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                MainAppPlayerOverlayDataProvider mainAppPlayerOverlayDataProvider = MainAppPlayerOverlayDataProvider.this;
                if (Math.abs(i8 - i6) == Math.abs(i4 - i2) && Math.abs(i7 - i5) == Math.abs(i3 - i)) {
                    return;
                }
                mainAppPlayerOverlayDataProvider.g();
            }
        };
        this.n = onLayoutChangeListener;
        this.m.addOnLayoutChangeListener(onLayoutChangeListener);
    }

    @Override // defpackage.any, defpackage.aoa
    public final void lh(aok aokVar) {
        this.m.removeOnLayoutChangeListener(this.n);
        azqb.f((AtomicReference) this.o);
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.j.c();
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.j.g(this.h.ae(fjw.l, fjw.m).h(ahbw.e(1)).Y(new fqt(this, 2), eoo.m), this.i.c.ax(new fqt(this, 0)), this.h.G().i.h(ahbw.e(1)).Y(new fqt(this, 3), eoo.m));
    }
}
