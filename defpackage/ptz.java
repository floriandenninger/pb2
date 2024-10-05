package defpackage;

import com.google.android.flexbox.FlexboxLayoutManager;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ptz {
    public int a;
    public int b;
    public int c;
    public int d = 0;
    public boolean e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ FlexboxLayoutManager h;

    public ptz(FlexboxLayoutManager flexboxLayoutManager) {
        this.h = flexboxLayoutManager;
    }

    public final void b() {
        this.a = -1;
        this.b = -1;
        this.c = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.f = false;
        this.g = false;
        if (this.h.K()) {
            FlexboxLayoutManager flexboxLayoutManager = this.h;
            if (flexboxLayoutManager.b == 0) {
                this.e = flexboxLayoutManager.a == 1;
                return;
            } else {
                this.e = false;
                return;
            }
        }
        FlexboxLayoutManager flexboxLayoutManager2 = this.h;
        if (flexboxLayoutManager2.b == 0) {
            this.e = flexboxLayoutManager2.a == 3;
        } else {
            this.e = false;
        }
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.a + ", mFlexLinePosition=" + this.b + ", mCoordinate=" + this.c + ", mPerpendicularCoordinate=" + this.d + ", mLayoutFromEnd=" + this.e + ", mValid=" + this.f + ", mAssignedFromSavedState=" + this.g + '}';
    }

    public final void a() {
        int j;
        if (!this.h.K()) {
            FlexboxLayoutManager flexboxLayoutManager = this.h;
            if (flexboxLayoutManager.c) {
                this.c = this.e ? flexboxLayoutManager.f.f() : flexboxLayoutManager.H - flexboxLayoutManager.f.j();
                return;
            }
        }
        if (this.e) {
            j = this.h.f.f();
        } else {
            j = this.h.f.j();
        }
        this.c = j;
    }
}
