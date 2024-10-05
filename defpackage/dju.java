package defpackage;

import android.graphics.Rect;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dju implements Cloneable {
    public final dmt a;
    public final dha b;
    public final Rect c;
    public final int d;
    public final int e;
    public final int f;
    public final dmi g;
    public final long h;
    public int i;
    public long j;
    public int k = 0;
    public final dik l;
    private final int m;
    private final int n;

    public dju(dik dikVar, dmt dmtVar, dha dhaVar, Rect rect, int i, int i2, int i3, long j, int i4, int i5, dmi dmiVar) {
        this.l = dikVar;
        this.a = dmtVar;
        this.b = dhaVar;
        this.c = rect;
        this.m = i;
        this.n = i2;
        this.d = i3;
        this.h = j;
        this.e = i4;
        this.f = i5;
        this.g = dmiVar;
    }

    public static dju a(dum dumVar) {
        return (dju) dumVar.d.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dup b(dju djuVar, dup dupVar) {
        List list;
        if (dupVar != null) {
            int i = dkk.a;
            long j = djuVar.j;
            if (djuVar == null) {
                throw new IllegalArgumentException("Null output used for LithoRenderUnit.");
            }
        } else {
            int i2 = duo.a;
        }
        Rect rect = djuVar.c;
        dmt dmtVar = djuVar.a;
        if (dupVar != null && (list = dupVar.c) != null) {
            list.size();
        }
        return new dup(djuVar, rect);
    }

    public static boolean e(int i) {
        return (i & 1) == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Rect rect) {
        rect.left = this.c.left - this.m;
        rect.top = this.c.top - this.n;
        rect.right = this.c.right - this.m;
        rect.bottom = this.c.bottom - this.n;
    }

    public final boolean d() {
        if (this.e == 2) {
            return false;
        }
        dik dikVar = this.l;
        return (dikVar != null && dikVar.z()) || this.b.ad();
    }
}
