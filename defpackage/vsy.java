package defpackage;

import android.net.Uri;
import com.google.android.libraries.video.editablevideo.EditableVideoEdits;
import com.google.android.libraries.video.media.VideoMetaData;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vsy {
    public final EditableVideoEdits a;
    public final VideoMetaData b;
    private final List c = new CopyOnWriteArrayList();

    public vsy(EditableVideoEdits editableVideoEdits, VideoMetaData videoMetaData) {
        this.a = editableVideoEdits;
        this.b = videoMetaData;
    }

    public final void A(double d, double d2) {
        amkq.E(d >= 0.0d && d < 1.0d);
        amkq.E(d2 >= 0.0d && d2 < 1.0d);
        amkq.E(d + d2 < 1.0d);
        EditableVideoEdits editableVideoEdits = this.a;
        editableVideoEdits.o = d;
        editableVideoEdits.p = d2;
    }

    public final void B(String str) {
        this.a.e = str;
    }

    public final void C(long j) {
        E(this.a.f, j);
    }

    public final void D(long j) {
        E(j, this.a.g);
    }

    public final void E(long j, long j2) {
        EditableVideoEdits editableVideoEdits = this.a;
        if (editableVideoEdits.a) {
            long j3 = editableVideoEdits.b;
            long j4 = this.b.g;
            long j5 = editableVideoEdits.c;
            long min = j5 > 0 ? Math.min(j4, j5) : j4;
            long j6 = this.a.f;
            long max = j6 != j ? Math.max(Math.min(j, j2 - j3), j2 - min) : j;
            long j7 = this.a.g;
            long max2 = j7 != j2 ? Math.max(Math.min(j2, min + max), j3 + max) : j2;
            if (max < 0) {
                max = 0;
            }
            if (max2 <= j4) {
                j4 = max2;
            }
            EditableVideoEdits editableVideoEdits2 = this.a;
            editableVideoEdits2.f = max;
            editableVideoEdits2.g = j4;
            if (j6 != j) {
                t(0);
            }
            if (j7 != j2) {
                t(1);
            }
        }
    }

    public final boolean F() {
        return this.a.m;
    }

    public final boolean G() {
        EditableVideoEdits editableVideoEdits = this.a;
        return editableVideoEdits.l != null && editableVideoEdits.n > 1.0E-6f;
    }

    public final boolean H() {
        return (d() == 0.0d && a() == 0.0d && b() == 0.0d && c() == 0.0d) ? false : true;
    }

    public final boolean I() {
        String str = this.a.e;
        return (str == null || str.equals("NORMAL")) ? false : true;
    }

    public final boolean J() {
        return (K() || this.a.i != 0 || I() || G() || F() || H()) ? false : true;
    }

    public final boolean K() {
        EditableVideoEdits editableVideoEdits = this.a;
        return editableVideoEdits.h && !(editableVideoEdits.f == 0 && editableVideoEdits.g == this.b.g);
    }

    public final boolean L() {
        return this.a.a;
    }

    public final double a() {
        return this.a.p;
    }

    public final double b() {
        return this.a.q;
    }

    public final double c() {
        return this.a.r;
    }

    public final double d() {
        return this.a.o;
    }

    public final float e() {
        return this.a.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsy)) {
            return false;
        }
        vsy vsyVar = (vsy) obj;
        return uqq.p(this.b, vsyVar.b) && uqq.p(this.c, vsyVar.c);
    }

    public final int f() {
        return this.a.i;
    }

    public final long g() {
        return this.a.j;
    }

    public final long h() {
        return this.a.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final long i() {
        return this.a.c;
    }

    public final long j() {
        return this.a.b;
    }

    public final long k() {
        return l() / 1000;
    }

    public final long l() {
        EditableVideoEdits editableVideoEdits = this.a;
        return editableVideoEdits.h ? editableVideoEdits.g : this.b.g;
    }

    public final long m() {
        return n() / 1000;
    }

    public final long n() {
        EditableVideoEdits editableVideoEdits = this.a;
        if (editableVideoEdits.h) {
            return editableVideoEdits.f;
        }
        return 0L;
    }

    public final Uri o() {
        return this.a.l;
    }

    public final String p() {
        String str = this.a.e;
        return str == null ? "NORMAL" : str;
    }

    public final void q(vsz vszVar) {
        this.c.add(vszVar);
    }

    public final void r(Set set) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((vsz) it.next()).a(this, set);
        }
    }

    public final void s(Set set) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((vsz) it.next()).c(this, set);
        }
    }

    public final void t(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((vsz) it.next()).b(this, i);
        }
    }

    public final String toString() {
        String name = getClass().getName();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("videoMetaData=");
        sb.append(valueOf);
        return uqq.o(name, sb.toString());
    }

    public final void u(vsz vszVar) {
        this.c.remove(vszVar);
    }

    public final void v(boolean z) {
        EditableVideoEdits editableVideoEdits = this.a;
        if (editableVideoEdits.m == z) {
            return;
        }
        editableVideoEdits.m = z;
        t(5);
    }

    public final void w(long j) {
        EditableVideoEdits editableVideoEdits = this.a;
        if (editableVideoEdits.j != j) {
            editableVideoEdits.j = j;
            t(3);
        }
    }

    public final void x(Uri uri) {
        this.a.l = uri;
    }

    public final void y(float f) {
        EditableVideoEdits editableVideoEdits = this.a;
        if (editableVideoEdits.n != f) {
            editableVideoEdits.n = f;
            t(4);
        }
    }

    public final void z(double d, double d2) {
        amkq.E(d >= 0.0d && d < 1.0d);
        amkq.E(d2 >= 0.0d && d2 < 1.0d);
        amkq.E(d + d2 < 1.0d);
        EditableVideoEdits editableVideoEdits = this.a;
        editableVideoEdits.q = d;
        editableVideoEdits.r = d2;
    }

    public vsy(VideoMetaData videoMetaData, long j, long j2, boolean z) {
        videoMetaData.getClass();
        this.b = videoMetaData;
        this.a = new EditableVideoEdits(videoMetaData, j, j2, z);
    }
}
