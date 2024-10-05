package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.player.autonav.AutonavToggleController;
import com.google.android.apps.youtube.app.player.overlay.SubtitleButtonController;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kob implements View.OnLayoutChangeListener, abjf {
    public final koc a;
    public final ggs b;
    public final ayqd c;
    public final nng d;
    public final kdh e;
    public final AutonavToggleController f;
    public final SubtitleButtonController g;
    public final kmz h;
    public final TouchImageView i;
    public final azrh j = azrh.e();
    public final List k = new ArrayList();
    public koa l;
    public apmp m;
    public khy n;
    public int o;
    public final ajyw p;
    private boolean q;

    public kob(ggs ggsVar, final koc kocVar, ayqd ayqdVar, ajyw ajywVar, kmz kmzVar, nng nngVar, kdh kdhVar, AutonavToggleController autonavToggleController, SubtitleButtonController subtitleButtonController, TouchImageView touchImageView, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = ggsVar;
        this.a = kocVar;
        this.c = ayqdVar;
        this.p = ajywVar;
        this.h = kmzVar;
        this.d = nngVar;
        this.e = kdhVar;
        this.f = autonavToggleController;
        this.g = subtitleButtonController;
        this.i = touchImageView;
        kocVar.getClass();
        final int i = 1;
        kdhVar.j(new fxz() { // from class: kny
            @Override // defpackage.fxz
            public final void a(boolean z) {
                if (i != 0) {
                    koc kocVar2 = kocVar;
                    if (kocVar2.e != z) {
                        kocVar2.e = z;
                        kocVar2.a();
                        return;
                    }
                    return;
                }
                koc kocVar3 = kocVar;
                if (kocVar3.f != z) {
                    kocVar3.f = z;
                    kocVar3.a();
                }
            }
        });
        kocVar.getClass();
        final int i2 = 0;
        autonavToggleController.a = new fxz() { // from class: kny
            @Override // defpackage.fxz
            public final void a(boolean z) {
                if (i2 != 0) {
                    koc kocVar2 = kocVar;
                    if (kocVar2.e != z) {
                        kocVar2.e = z;
                        kocVar2.a();
                        return;
                    }
                    return;
                }
                koc kocVar3 = kocVar;
                if (kocVar3.f != z) {
                    kocVar3.f = z;
                    kocVar3.a();
                }
            }
        };
    }

    @Override // defpackage.abjf
    public final int a() {
        return this.o;
    }

    public final void b(View view) {
        if (this.l == null) {
            this.k.add(view);
            return;
        }
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.controls_overlay_action_button_size);
        yny.A(view, new mkw(dimensionPixelSize, 1), yny.h(yny.y(dimensionPixelSize, dimensionPixelSize), yny.r(resources.getDimensionPixelSize(R.dimen.controls_overlay_action_button_margin_start))), ViewGroup.MarginLayoutParams.class);
        ((LinearLayout) this.l.a.b).addView(view);
    }

    @Override // defpackage.abjf
    public final void c(apmp apmpVar) {
        this.m = apmpVar;
    }

    @Override // defpackage.abjf
    public final void d(int i) {
        this.o = i;
        boolean z = i != 0;
        this.a.g = z;
        if (z) {
            this.j.c(Boolean.valueOf(i == 1));
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i3 - i;
        boolean z = i4 - i2 > i9;
        if (this.q != z) {
            this.q = z;
            if (this.l != null && this.e.a() != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.e.a();
                ArrayDeque arrayDeque = new ArrayDeque();
                if (this.q) {
                    arrayDeque.add(yny.j(3, ((TouchImageView) this.l.f.b).getId()));
                    arrayDeque.add(yny.i(21));
                    arrayDeque.add(yny.t(10));
                    arrayDeque.add(yny.t(16));
                } else {
                    arrayDeque.add(yny.j(16, R.id.autonav_toggle));
                    arrayDeque.add(yny.i(10));
                    arrayDeque.add(yny.t(21));
                    arrayDeque.add(yny.t(3));
                }
                if (yny.E(arrayDeque).a(layoutParams)) {
                    this.e.d(layoutParams);
                }
            }
            koc kocVar = this.a;
            boolean z2 = this.q;
            if (kocVar.d != z2) {
                kocVar.d = z2;
                kocVar.a();
            }
        }
        koc kocVar2 = this.a;
        if (kocVar2.i != i9) {
            kocVar2.i = i9;
            kocVar2.a();
        }
    }
}
