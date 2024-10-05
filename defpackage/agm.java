package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agm {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    final /* synthetic */ ConstraintLayout h;

    public agm(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    private static final boolean b(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void a(afk afkVar, afs afsVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int baseline;
        int max;
        int max2;
        int i;
        int i2;
        int i3;
        if (afkVar == null) {
            return;
        }
        if (afkVar.ag == 8) {
            afsVar.c = 0;
            afsVar.d = 0;
            afsVar.e = 0;
            return;
        }
        if (afkVar.T == null) {
            return;
        }
        int i4 = afsVar.i;
        int i5 = afsVar.j;
        int i6 = afsVar.a;
        int i7 = afsVar.b;
        int i8 = this.b + this.c;
        int i9 = this.d;
        Object obj = afkVar.af;
        int i10 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        if (i10 == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (i10 == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i9, -2);
        } else if (i10 == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i9, -2);
            int i11 = afkVar.s;
            int i12 = afsVar.h;
            if (i12 == 1 || i12 == 2) {
                int measuredHeight = ((View) obj).getMeasuredHeight();
                int h = afkVar.h();
                if (afsVar.h == 2 || i11 != 1 || measuredHeight == h || (obj instanceof agx) || afkVar.e()) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(afkVar.j(), 1073741824);
                }
            }
        } else if (i10 != 3) {
            makeMeasureSpec = 0;
        } else {
            int i13 = this.f;
            afj afjVar = afkVar.f45J;
            int i14 = afjVar != null ? afjVar.f : 0;
            afj afjVar2 = afkVar.L;
            if (afjVar2 != null) {
                i14 += afjVar2.f;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i13, i9 + i14, -1);
        }
        int i15 = i5 - 1;
        if (i5 != 0) {
            if (i15 == 0) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
            } else if (i15 == 1) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i8, -2);
            } else if (i15 == 2) {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i8, -2);
                int i16 = afkVar.t;
                int i17 = afsVar.h;
                if (i17 == 1 || i17 == 2) {
                    int measuredWidth = ((View) obj).getMeasuredWidth();
                    int j = afkVar.j();
                    if (afsVar.h == 2 || i16 != 1 || measuredWidth == j || (obj instanceof agx) || afkVar.f()) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(afkVar.h(), 1073741824);
                    }
                }
            } else if (i15 != 3) {
                makeMeasureSpec2 = 0;
            } else {
                int i18 = this.g;
                int i19 = afkVar.f45J != null ? afkVar.K.f : 0;
                if (afkVar.L != null) {
                    i19 += afkVar.M.f;
                }
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i18, i8 + i19, -1);
            }
            afk afkVar2 = afkVar.T;
            if (afkVar2 != null && afp.b(this.h.f, 256)) {
                View view = (View) obj;
                if (view.getMeasuredWidth() == afkVar.j() && view.getMeasuredWidth() < afkVar2.j() && view.getMeasuredHeight() == afkVar.h() && view.getMeasuredHeight() < afkVar2.h() && view.getBaseline() == afkVar.aa && !afkVar.K() && b(afkVar.H, makeMeasureSpec, afkVar.j()) && b(afkVar.I, makeMeasureSpec2, afkVar.h())) {
                    afsVar.c = afkVar.j();
                    afsVar.d = afkVar.h();
                    afsVar.e = afkVar.aa;
                    return;
                }
            }
            boolean z = i5 == 4 || i5 == 1;
            boolean z2 = i4 == 4 || i4 == 1;
            boolean z3 = i4 == 3 && afkVar.W > 0.0f;
            boolean z4 = i5 == 3 && afkVar.W > 0.0f;
            if (obj == null) {
                return;
            }
            View view2 = (View) obj;
            agl aglVar = (agl) view2.getLayoutParams();
            int i20 = afsVar.h;
            if (i20 != 1 && i20 != 2 && i4 == 3 && afkVar.s == 0 && i5 == 3 && afkVar.t == 0) {
                i2 = -1;
                baseline = 0;
                max = 0;
                max2 = 0;
            } else if (!(obj instanceof aha) || !(afkVar instanceof afq)) {
                view2.measure(makeMeasureSpec, makeMeasureSpec2);
                afkVar.A(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth2 = view2.getMeasuredWidth();
                int measuredHeight2 = view2.getMeasuredHeight();
                baseline = view2.getBaseline();
                int i21 = afkVar.v;
                max = i21 > 0 ? Math.max(i21, measuredWidth2) : measuredWidth2;
                int i22 = afkVar.w;
                if (i22 > 0) {
                    max = Math.min(i22, max);
                }
                int i23 = afkVar.y;
                max2 = i23 > 0 ? Math.max(i23, measuredHeight2) : measuredHeight2;
                int i24 = afkVar.z;
                if (i24 > 0) {
                    max2 = Math.min(i24, max2);
                }
                if (!afp.b(this.h.f, 1)) {
                    if (z3 && z) {
                        max = (int) ((max2 * afkVar.W) + 0.5f);
                    } else if (z4 && z2) {
                        max2 = (int) ((max / afkVar.W) + 0.5f);
                    }
                }
                if (measuredWidth2 != max || measuredHeight2 != max2) {
                    if (measuredWidth2 != max) {
                        i = 1073741824;
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
                    } else {
                        i = 1073741824;
                    }
                    if (measuredHeight2 != max2) {
                        makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max2, i);
                    }
                    view2.measure(makeMeasureSpec, makeMeasureSpec2);
                    afkVar.A(makeMeasureSpec, makeMeasureSpec2);
                    max = view2.getMeasuredWidth();
                    max2 = view2.getMeasuredHeight();
                    baseline = view2.getBaseline();
                }
                i2 = -1;
            } else {
                throw null;
            }
            boolean z5 = baseline != i2;
            afsVar.g = (max == afsVar.a && max2 == afsVar.b) ? false : true;
            boolean z6 = z5 | aglVar.ab;
            if (z6) {
                if (baseline == -1) {
                    i3 = -1;
                    afsVar.c = max;
                    afsVar.d = max2;
                    afsVar.f = z6;
                    afsVar.e = i3;
                    return;
                }
                if (afkVar.aa != baseline) {
                    afsVar.g = true;
                }
            }
            i3 = baseline;
            afsVar.c = max;
            afsVar.d = max2;
            afsVar.f = z6;
            afsVar.e = i3;
            return;
        }
        throw null;
    }
}
