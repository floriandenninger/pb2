package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akj extends kw {
    final /* synthetic */ akk b;

    public akj(akk akkVar) {
        this.b = akkVar;
    }

    @Override // defpackage.kw
    public final ks a(int i) {
        return ks.c(AccessibilityNodeInfo.obtain(this.b.l(i).b));
    }

    @Override // defpackage.kw
    public final ks b(int i) {
        int i2 = i == 2 ? this.b.d : this.b.e;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.kw
    public final boolean c(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        akk akkVar = this.b;
        if (i == -1) {
            return jw.aq(akkVar.c, i2, bundle);
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return akkVar.s(i);
            }
            if (i2 != 64) {
                return i2 != 128 ? akkVar.u(i, i2) : akkVar.r(i);
            }
            if (akkVar.b.isEnabled() && akkVar.b.isTouchExplorationEnabled() && (i4 = akkVar.d) != i) {
                if (i4 != Integer.MIN_VALUE) {
                    akkVar.r(i4);
                }
                akkVar.d = i;
                akkVar.c.invalidate();
                akkVar.v(i, 32768);
                return true;
            }
        } else if ((akkVar.c.isFocused() || akkVar.c.requestFocus()) && (i3 = akkVar.e) != i) {
            if (i3 != Integer.MIN_VALUE) {
                akkVar.s(i3);
            }
            if (i != Integer.MIN_VALUE) {
                akkVar.e = i;
                akkVar.v(i, 8);
                return true;
            }
        }
        return false;
    }
}
