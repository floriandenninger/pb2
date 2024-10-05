package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Insets;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.litho.ComponentTree;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajek extends ajfn {
    public axpg ae;
    public slr af;
    public int ai;
    public dkp aj;
    public String ak;
    FrameLayout al;
    RelativeLayout am;
    public Dialog an;
    ViewGroup ao;
    private List ar;
    private dkp as;
    private ajej at;
    private acra au;
    private Object av;
    private final ayqw aq = new ayqw();
    boolean ag = false;
    public boolean ah = true;
    public int ap = 1;

    public static void aK(ajek ajekVar, swu swuVar, acra acraVar) {
        ajgc ajgcVar;
        ajekVar.au = acraVar;
        if (swuVar != null) {
            Object obj = swuVar.d;
            if (!(obj instanceof ajgc) || (ajgcVar = (ajgc) obj) == null) {
                return;
            }
            ajekVar.av = ajgcVar.a;
        }
    }

    public static final int aL(WindowInsets windowInsets) {
        int i = windowInsets.getInsets(WindowInsets.Type.systemBars()).bottom;
        int i2 = windowInsets.getInsets(WindowInsets.Type.ime()).bottom;
        if (i2 > i) {
            return i2 - i;
        }
        return 0;
    }

    private static RelativeLayout aO(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return relativeLayout;
    }

    private final dkp aP(awos awosVar, Context context) {
        dkp dkpVar = new dkp(context);
        dhe dheVar = dkpVar.t;
        sqq sqqVar = (sqq) this.ae.get();
        sxb a = sxc.a();
        a.a = dkpVar;
        a.f(false);
        a.l = amru.r(ahbl.i(this.av));
        sxc a2 = a.a();
        byte[] byteArray = awosVar.toByteArray();
        acra acraVar = this.au;
        dho c = ComponentTree.c(dkpVar.t, sqqVar.a(dheVar, a2, byteArray, acraVar != null ? ajgg.w(acraVar) : null, this.aq));
        c.d = false;
        dkpVar.G(c.a());
        return dkpVar;
    }

    private static void aQ(dkp dkpVar) {
        if (dkpVar != null) {
            dkpVar.E();
            dkpVar.K();
            dkpVar.G(null);
        }
    }

    public final RelativeLayout aF(Context context) {
        RelativeLayout aO = aO(context);
        ajej ajejVar = new ajej(context);
        ajejVar.ay();
        ajejVar.af(new LinearLayoutManager());
        ajejVar.ac(new ajem((sqq) this.ae.get(), this.ar, this.au, this.av));
        ajejVar.setVerticalFadingEdgeEnabled(true);
        this.at = ajejVar;
        aO.addView(ajejVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        dkp dkpVar = this.as;
        if (dkpVar == null || this.at == null) {
            layoutParams.addRule(10);
        } else {
            layoutParams.addRule(3, dkpVar.getId());
            ajej ajejVar2 = this.at;
            if (ajejVar2 != null) {
                ajejVar2.setPadding(0, 48, 0, 0);
            }
            ajej ajejVar3 = this.at;
            if (ajejVar3 != null) {
                ajejVar3.setClipToPadding(false);
            }
            ajej ajejVar4 = this.at;
            if (ajejVar4 != null) {
                ajejVar4.setFadingEdgeLength(48);
            }
        }
        ajej ajejVar5 = this.at;
        if (ajejVar5 != null) {
            ajejVar5.setLayoutParams(layoutParams);
        }
        dkp dkpVar2 = this.as;
        if (dkpVar2 != null) {
            aO.addView(dkpVar2);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams2.addRule(10);
            layoutParams2.setMargins(0, 0, 0, -48);
            dkp dkpVar3 = this.as;
            if (dkpVar3 != null) {
                dkpVar3.setLayoutParams(layoutParams2);
            }
        }
        aO.setBackgroundColor(wbs.Q(context, R.attr.ytBrandBackgroundSolid));
        return aO;
    }

    public final void aG(Dialog dialog, Activity activity) {
        int i;
        if (dialog == null) {
            return;
        }
        BottomSheetBehavior a = ((algj) dialog).a();
        AccessibilityManager accessibilityManager = (AccessibilityManager) activity.getSystemService("accessibility");
        if (!this.ah || accessibilityManager.isEnabled()) {
            a.G(3);
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        dkp dkpVar = this.as;
        ajej ajejVar = this.at;
        if (ajejVar == null) {
            i = 0;
        } else if (dkpVar == null) {
            i = ajejVar.getMeasuredHeight();
        } else {
            i = dkpVar.getMeasuredHeight() + ajejVar.getMeasuredHeight();
        }
        double d = displayMetrics.heightPixels;
        Double.isNaN(d);
        int i2 = (int) (d * 0.6d);
        if (i > i2) {
            a.F(i2);
        } else {
            a.F(i);
        }
    }

    public final void aH() {
        RelativeLayout relativeLayout;
        ViewGroup viewGroup = this.ao;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        FrameLayout frameLayout = this.al;
        if (frameLayout != null && (relativeLayout = this.am) != null) {
            frameLayout.removeView(relativeLayout);
        }
        this.at = null;
        this.as = null;
        this.aj = null;
        this.al = null;
        this.am = null;
    }

    public final void aI(awug awugVar, Activity activity) {
        if ((awugVar.c & 2) != 0) {
            awos awosVar = awugVar.e;
            if (awosVar == null) {
                awosVar = awos.a;
            }
            this.aj = aP(awosVar, activity);
        }
        if ((awugVar.c & 1) != 0) {
            awos awosVar2 = awugVar.d;
            if (awosVar2 == null) {
                awosVar2 = awos.a;
            }
            dkp aP = aP(awosVar2, activity);
            this.as = aP;
            aP.setId(View.generateViewId());
        }
        this.ar = awugVar.f;
    }

    public final void aJ(final Activity activity) {
        FrameLayout frameLayout;
        final Dialog dialog = this.an;
        if (this.aj != null && dialog != null) {
            FrameLayout frameLayout2 = (FrameLayout) dialog.findViewById(R.id.container);
            frameLayout2.setImportantForAccessibility(2);
            frameLayout2.setFocusable(false);
            dkp dkpVar = this.aj;
            if (dkpVar != null) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                RelativeLayout aO = aO(activity);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                dkp dkpVar2 = this.aj;
                if (dkpVar2 != null) {
                    dkpVar2.setLayoutParams(layoutParams2);
                    aO.addView(this.aj);
                }
                aO.setLayoutParams(layoutParams);
                aO.setBackgroundColor(wbs.Q(activity, R.attr.ytBrandBackgroundSolid));
                frameLayout2.addView(aO);
                dkpVar.post(new Runnable() { // from class: ajeg
                    @Override // java.lang.Runnable
                    public final void run() {
                        dkp dkpVar3;
                        ajek ajekVar = ajek.this;
                        Dialog dialog2 = dialog;
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) dialog2.findViewById(R.id.coordinator);
                        FrameLayout frameLayout3 = (FrameLayout) dialog2.findViewById(R.id.container);
                        if (coordinatorLayout == null || (dkpVar3 = ajekVar.aj) == null) {
                            return;
                        }
                        yny.z(coordinatorLayout, yny.k(dkpVar3.getMeasuredHeight()), ViewGroup.MarginLayoutParams.class);
                        frameLayout3.requestLayout();
                    }
                });
            }
            frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: ajef
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ajek.this.dismiss();
                }
            });
        }
        ajej ajejVar = this.at;
        if (ajejVar != null && dialog != null) {
            ajejVar.post(new Runnable() { // from class: ajeh
                @Override // java.lang.Runnable
                public final void run() {
                    ajek.this.aG(dialog, activity);
                }
            });
        }
        if (this.aj == null && this.as == null && this.ar.isEmpty() && dialog != null && (frameLayout = (FrameLayout) dialog.findViewById(R.id.container)) != null) {
            RelativeLayout relativeLayout = new RelativeLayout(activity);
            ProgressBar progressBar = new ProgressBar(activity);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            relativeLayout.addView(progressBar, layoutParams3);
            frameLayout.addView(relativeLayout);
            this.am = relativeLayout;
            this.al = frameLayout;
        }
    }

    @Override // defpackage.bv, defpackage.ce
    public final void lZ() {
        RelativeLayout relativeLayout;
        slr slrVar = this.af;
        if ((slrVar instanceof ajec) && this.au != null) {
            ajec ajecVar = (ajec) slrVar;
            acra acraVar = ajecVar.c;
            if (acraVar != null) {
                acraVar.t();
            }
            ajecVar.c = null;
        }
        super.lZ();
        aQ(this.as);
        aQ(this.aj);
        this.aq.c();
        FrameLayout frameLayout = this.al;
        if (frameLayout != null && (relativeLayout = this.am) != null) {
            frameLayout.removeView(relativeLayout);
        }
        this.al = null;
        this.am = null;
        aH();
        this.an = null;
        this.ao = null;
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ci C = C();
        C.getClass();
        Bundle bundle2 = this.m;
        if (bundle2 == null || (!bundle2.containsKey("COMMAND_BOTTOM_SHEET_FRAGMENT_KEY") && !bundle2.containsKey("ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY"))) {
            throw new IllegalStateException("No valid arguments provided.");
        }
        if (bundle2.containsKey("COMMAND_BOTTOM_SHEET_UPDATE_FRAGMENT_KEY")) {
            try {
                aI((awug) amkq.cj(bundle2, "COMMAND_BOTTOM_SHEET_UPDATE_FRAGMENT_KEY", awug.a, aomw.b()), C);
            } catch (aoob e) {
                throw new IllegalStateException("Error decoding UpdateActionSheetCommand", e);
            }
        } else if (bundle2.containsKey("ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY")) {
            try {
                this.ar = Collections.singletonList((awos) amkq.cj(bundle2, "ELEMENT_BOTTOM_SHEET_FRAGMENT_KEY", awos.a, aomw.b()));
            } catch (aoob e2) {
                throw new IllegalStateException("Error decoding Element", e2);
            }
        } else {
            try {
                awty awtyVar = (awty) amkq.cj(bundle2, "COMMAND_BOTTOM_SHEET_FRAGMENT_KEY", awty.a, aomw.b());
                int i = awtyVar.c;
                if ((i & 4) != 0) {
                    this.ak = awtyVar.g;
                }
                if ((i & 2) != 0) {
                    awos awosVar = awtyVar.e;
                    if (awosVar == null) {
                        awosVar = awos.a;
                    }
                    this.aj = aP(awosVar, C);
                }
                if ((awtyVar.c & 1) != 0) {
                    awos awosVar2 = awtyVar.d;
                    if (awosVar2 == null) {
                        awosVar2 = awos.a;
                    }
                    dkp aP = aP(awosVar2, C);
                    this.as = aP;
                    aP.setId(View.generateViewId());
                }
                this.ar = awtyVar.f;
            } catch (aoob e3) {
                throw new IllegalStateException("Error decoding ShowActionSheetCommand", e3);
            }
        }
        slr slrVar = this.af;
        if ((slrVar instanceof ajec) && bundle != null) {
            ajec ajecVar = (ajec) slrVar;
            WeakReference weakReference = ajecVar.b;
            if (weakReference != null) {
                weakReference.clear();
            }
            ajecVar.b = new WeakReference(this);
        }
        FrameLayout frameLayout = new FrameLayout(C);
        frameLayout.setFitsSystemWindows(true);
        frameLayout.addView(aF(C));
        this.ao = frameLayout;
        return frameLayout;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r5 = C();
        r5.getClass();
        aG(r4.d, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0016, code lost:
    
        if (r5.orientation == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x001e, code lost:
    
        if (r0 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x001b, code lost:
    
        if (r5.orientation == 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
    
        if (r1 != 3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        dismiss();
     */
    @Override // defpackage.ce, android.content.ComponentCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConfigurationChanged(android.content.res.Configuration r5) {
        /*
            r4 = this;
            super.onConfigurationChanged(r5)
            int r0 = r4.ap
            int r1 = r0 + (-1)
            if (r0 == 0) goto L31
            r0 = 0
            r2 = 1
            if (r1 == r2) goto L19
            r3 = 2
            if (r1 == r3) goto L14
            r5 = 3
            if (r1 == r5) goto L20
            goto L24
        L14:
            int r5 = r5.orientation
            if (r5 != r3) goto L1e
            goto L1d
        L19:
            int r5 = r5.orientation
            if (r5 != r2) goto L1e
        L1d:
            r0 = 1
        L1e:
            if (r0 == 0) goto L24
        L20:
            r4.dismiss()
            return
        L24:
            ci r5 = r4.C()
            r5.getClass()
            android.app.Dialog r0 = r4.d
            r4.aG(r0, r5)
            return
        L31:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajek.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Override // defpackage.algk, defpackage.nh, defpackage.bv
    public final Dialog oq(Bundle bundle) {
        View decorView;
        final View findViewById;
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final ci C = C();
        C.getClass();
        int navigationBarColor = C.getWindow().getNavigationBarColor();
        algj algjVar = new algj(C, R.style.Theme_YouTube_ElementsBottomSheetDialog);
        this.an = algjVar;
        algjVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ajed
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ajek ajekVar = ajek.this;
                Activity activity = C;
                if (activity.isDestroyed() || activity.isFinishing()) {
                    return;
                }
                ajekVar.aJ(activity);
            }
        });
        Window window = algjVar.getWindow();
        if (window != null) {
            window.setNavigationBarColor(navigationBarColor);
            if (Build.VERSION.SDK_INT >= 30 && (decorView = window.getDecorView()) != null && (findViewById = decorView.findViewById(android.R.id.content)) != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()) != null) {
                decorView.setWindowInsetsAnimationCallback(new ajei(this, marginLayoutParams.bottomMargin, findViewById, decorView, marginLayoutParams));
                decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ajee
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        ajek ajekVar = ajek.this;
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                        View view2 = findViewById;
                        Insets insets = windowInsets.getInsets(WindowInsets.Type.systemBars());
                        if (ajekVar.ag) {
                            return view.onApplyWindowInsets(windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), insets.bottom));
                        }
                        marginLayoutParams2.bottomMargin = 0;
                        view2.setLayoutParams(marginLayoutParams2);
                        return view.onApplyWindowInsets(windowInsets);
                    }
                });
            }
        }
        int M = yjk.M(C);
        if (this.ai > 0 && M >= 600) {
            algjVar.a().d = yjk.K(C.getResources().getDisplayMetrics(), Math.min(this.ai, M));
        }
        return algjVar;
    }
}
