package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes.dex */
public class algj extends ng {
    private FrameLayout a;
    public BottomSheetBehavior b;
    public FrameLayout c;
    boolean d;
    public boolean e;
    public boolean f;
    public algb g;
    private CoordinatorLayout h;
    private final boolean i;
    private final algb j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public algj(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968813(0x7f0400ed, float:1.754629E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2132083850(0x7f15048a, float:1.9807854E38)
        L1b:
            r3.<init>(r4, r5)
            r3.d = r0
            r3.e = r0
            algh r4 = new algh
            r4.<init>(r3)
            r3.j = r4
            r3.e()
            android.content.Context r4 = r3.getContext()
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int[] r5 = new int[r0]
            r0 = 2130969275(0x7f0402bb, float:1.7547227E38)
            r1 = 0
            r5[r1] = r0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5)
            boolean r4 = r4.getBoolean(r1, r1)
            r3.i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.algj.<init>(android.content.Context, int):void");
    }

    public static void b(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    private final View f(int i, View view, ViewGroup.LayoutParams layoutParams) {
        g();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.i) {
            jw.X(this.c, new alge(this));
        }
        this.c.removeAllViews();
        if (layoutParams == null) {
            this.c.addView(view);
        } else {
            this.c.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new algf(this));
        jw.M(this.c, new algg(this));
        this.c.setOnTouchListener(new gpm(6));
        return this.a;
    }

    private final void g() {
        if (this.a == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.a = frameLayout;
            this.h = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.a.findViewById(R.id.design_bottom_sheet);
            this.c = frameLayout2;
            BottomSheetBehavior x = BottomSheetBehavior.x(frameLayout2);
            this.b = x;
            x.y(this.j);
            this.b.E(this.d);
        }
    }

    public final BottomSheetBehavior a() {
        if (this.b == null) {
            g();
        }
        return this.b;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        a();
        super.cancel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.i && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            FrameLayout frameLayout = this.a;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.h;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ng, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            if (Build.VERSION.SDK_INT < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    protected final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.b;
        if (bottomSheetBehavior == null || bottomSheetBehavior.t != 5) {
            return;
        }
        bottomSheetBehavior.G(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.d != z) {
            this.d = z;
            BottomSheetBehavior bottomSheetBehavior = this.b;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.E(z);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.d) {
            this.d = true;
        }
        this.e = z;
        this.f = true;
    }

    @Override // defpackage.ng, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(f(i, null, null));
    }

    @Override // defpackage.ng, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(f(0, view, null));
    }

    @Override // defpackage.ng, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(f(0, view, layoutParams));
    }
}
