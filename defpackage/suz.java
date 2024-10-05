package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class suz {
    public final AccessibilityManager a;
    public final suy b;
    public final sus c;
    public DisplayMetrics d;
    private final Context e;

    public suz(Context context, sus susVar) {
        this.e = context;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getApplicationContext().getSystemService("accessibility");
        accessibilityManager.getClass();
        this.a = accessibilityManager;
        this.b = new suy(accessibilityManager);
        this.d = context.getResources().getDisplayMetrics();
        this.c = susVar;
    }

    public static int a(DisplayMetrics displayMetrics, int i) {
        return (int) ((i / displayMetrics.density) + 0.5f);
    }

    public final aypy b(final sxc sxcVar) {
        azgp azgpVar = new azgp(aypy.v(new ayqa() { // from class: suw
            @Override // defpackage.ayqa
            public final void a(final aypz aypzVar) {
                final suz suzVar = suz.this;
                sxc sxcVar2 = sxcVar;
                final View view = sxcVar2.b;
                Integer num = sxcVar2.c;
                int intValue = num != null ? num.intValue() : 0;
                Integer num2 = sxcVar2.d;
                int intValue2 = num2 != null ? num2.intValue() : 0;
                final int a = suz.a(suzVar.d, intValue);
                final int a2 = suz.a(suzVar.d, intValue2);
                final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: sut
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        aypzVar.d(suz.this.c(view, a, a2));
                    }
                };
                final suv suvVar = new suv(suzVar, aypzVar, view, a, a2);
                final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: suu
                    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                    public final void onTouchExplorationStateChanged(boolean z) {
                        suz suzVar2 = suz.this;
                        aypz aypzVar2 = aypzVar;
                        View view2 = view;
                        int i = a;
                        int i2 = a2;
                        suzVar2.b.b();
                        aypzVar2.d(suzVar2.c(view2, i, i2));
                    }
                };
                suzVar.a.addTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                if (view != null) {
                    view.addOnLayoutChangeListener(onLayoutChangeListener);
                }
                suzVar.c.b(suvVar);
                aypzVar.f(new ayrr() { // from class: sux
                    @Override // defpackage.ayrr
                    public final void a() {
                        suz suzVar2 = suz.this;
                        View view2 = view;
                        View.OnLayoutChangeListener onLayoutChangeListener2 = onLayoutChangeListener;
                        suv suvVar2 = suvVar;
                        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener2 = touchExplorationStateChangeListener;
                        if (view2 != null) {
                            view2.removeOnLayoutChangeListener(onLayoutChangeListener2);
                        }
                        suzVar2.c.c(suvVar2);
                        suzVar2.a.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener2);
                    }
                });
                aypzVar.d(suzVar.c(view, a, a2));
            }
        }), aysv.a);
        ayrv ayrvVar = aynu.l;
        return azgpVar;
    }

    public final byte[] c(View view, int i, int i2) {
        return d(view, 0, null, i, i2);
    }

    public final byte[] d(View view, int i, Context context, int i2, int i3) {
        if (view != null) {
            i2 = a(this.d, view.getWidth());
            i3 = a(this.d, view.getHeight());
        }
        if (context != null) {
            this.d = context.getResources().getDisplayMetrics();
        }
        DisplayMetrics displayMetrics = this.d;
        int a = a(displayMetrics, displayMetrics.widthPixels);
        DisplayMetrics displayMetrics2 = this.d;
        int a2 = a(displayMetrics2, displayMetrics2.heightPixels);
        if (i == 0) {
            i = (a == 0 || a2 == 0) ? 1 : a2 > a ? 4 : 2;
        }
        aone createBuilder = awot.a.createBuilder();
        createBuilder.copyOnWrite();
        awot awotVar = (awot) createBuilder.instance;
        awotVar.g = 0;
        awotVar.b |= 16;
        createBuilder.copyOnWrite();
        awot awotVar2 = (awot) createBuilder.instance;
        awotVar2.b |= 1;
        awotVar2.c = i2;
        createBuilder.copyOnWrite();
        awot awotVar3 = (awot) createBuilder.instance;
        awotVar3.b |= 2;
        awotVar3.d = i3;
        aone createBuilder2 = awoo.a.createBuilder();
        createBuilder2.copyOnWrite();
        awoo awooVar = (awoo) createBuilder2.instance;
        awooVar.c = i - 1;
        awooVar.b |= 1;
        awoo awooVar2 = (awoo) createBuilder2.build();
        createBuilder.copyOnWrite();
        awot awotVar4 = (awot) createBuilder.instance;
        awooVar2.getClass();
        awotVar4.e = awooVar2;
        awotVar4.b |= 4;
        aone createBuilder3 = awpx.a.createBuilder();
        createBuilder3.copyOnWrite();
        awpx awpxVar = (awpx) createBuilder3.instance;
        awpxVar.b |= 1;
        awpxVar.c = a;
        createBuilder3.copyOnWrite();
        awpx awpxVar2 = (awpx) createBuilder3.instance;
        awpxVar2.b |= 2;
        awpxVar2.d = a2;
        awpx awpxVar3 = (awpx) createBuilder3.build();
        createBuilder.copyOnWrite();
        awot awotVar5 = (awot) createBuilder.instance;
        awpxVar3.getClass();
        awotVar5.f = awpxVar3;
        awotVar5.b |= 8;
        int i4 = this.e.getApplicationContext().getResources().getConfiguration().smallestScreenWidthDp < 600 ? 1 : 2;
        createBuilder.copyOnWrite();
        awot awotVar6 = (awot) createBuilder.instance;
        awotVar6.h = i4 - 1;
        awotVar6.b |= 32;
        Boolean a3 = this.b.a();
        if (a3 != null) {
            boolean booleanValue = a3.booleanValue();
            createBuilder.copyOnWrite();
            awot awotVar7 = (awot) createBuilder.instance;
            awotVar7.b |= 64;
            awotVar7.i = booleanValue;
        }
        return ((awot) createBuilder.build()).toByteArray();
    }
}
