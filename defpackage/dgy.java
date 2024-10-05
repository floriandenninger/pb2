package defpackage;

import android.graphics.drawable.Drawable;
import com.facebook.yoga.YogaDirection;
import com.facebook.yoga.YogaEdge;
import com.facebook.yoga.YogaPositionType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dgy implements Cloneable {
    private dhe a;
    public dlj b;
    public dha c;

    /* JADX INFO: Access modifiers changed from: protected */
    public static void o(int i, BitSet bitSet, String[] strArr) {
        if (bitSet.nextClearBit(0) < i) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                if (!bitSet.get(i2)) {
                    arrayList.add(strArr[i2]);
                }
            }
            String valueOf = String.valueOf(Arrays.toString(arrayList.toArray()));
            throw new IllegalStateException(valueOf.length() != 0 ? "The following props are not marked as optional and were not supplied: ".concat(valueOf) : new String("The following props are not marked as optional and were not supplied: "));
        }
    }

    public final void A(String str) {
        dgx C = this.c.C();
        C.a = (byte) (C.a | 2);
        C.d = str;
    }

    public final void B(int i) {
        dgw c = this.c.C().c();
        c.a |= 131072;
        c.k = i;
    }

    public final void C(Object obj) {
        this.c.C().D().q(obj);
    }

    public final void D(float f) {
        int a = this.b.a(f);
        dgv dgvVar = (dgv) this.c.C().C();
        dgvVar.a |= 1;
        dgvVar.b = a;
    }

    public final void E(YogaEdge yogaEdge, int i) {
        dgv dgvVar = (dgv) this.c.C().C();
        dgvVar.a |= 8388608;
        if (dgvVar.y == null) {
            dgvVar.y = new diu();
        }
        dgvVar.y.d(yogaEdge, i);
    }

    public final void F(Object obj) {
        this.c.C().e = obj;
    }

    public final void G(float f) {
        dgv dgvVar = (dgv) this.c.C().C();
        dgvVar.a |= 32768;
        dgvVar.n = f;
    }

    public final void H(float f) {
        dgv dgvVar = (dgv) this.c.C().C();
        dgvVar.a |= 65536;
        dgvVar.o = f;
    }

    public final void I(float f) {
        int a = this.b.a(f);
        dgv dgvVar = (dgv) this.c.C().C();
        dgvVar.a |= 64;
        dgvVar.h = a;
    }

    public final void J(float f) {
        dgv dgvVar = (dgv) this.c.C().C();
        dgvVar.a |= 128;
        dgvVar.i = f;
    }

    public final void K(diy diyVar) {
        dgw c = this.c.C().c();
        c.a |= 64;
        c.d = diyVar;
    }

    public final void L(YogaEdge yogaEdge, int i) {
        dgv dgvVar = (dgv) this.c.C().C();
        dgvVar.a |= 33554432;
        if (dgvVar.w == null) {
            dgvVar.w = new diu();
        }
        dgvVar.w.d(yogaEdge, i);
    }

    public final void M(int i) {
        dgv dgvVar = (dgv) this.c.C().C();
        dgvVar.a |= 256;
        dgvVar.j = i;
    }

    public final void N(YogaEdge yogaEdge, int i) {
        dgv dgvVar = (dgv) this.c.C().C();
        dgvVar.a |= 2097152;
        if (dgvVar.v == null) {
            dgvVar.v = new diu();
        }
        dgvVar.v.d(yogaEdge, i);
    }

    public final void O(YogaPositionType yogaPositionType) {
        dgv dgvVar = (dgv) this.c.C().C();
        dgvVar.a |= 1048576;
        dgvVar.u = yogaPositionType;
    }

    public final void P(YogaEdge yogaEdge, float f) {
        int a = this.b.a(f);
        dgw c = this.c.C().c();
        c.a |= 256;
        if (c.f == null) {
            c.f = new diu();
        }
        c.f.d(yogaEdge, a);
    }

    public final void Q(diy diyVar) {
        this.c.C().D().p(diyVar);
    }

    public final void R(diy diyVar) {
        dgw c = this.c.C().c();
        c.a |= 8;
        c.b = diyVar;
    }

    public final void S(float f) {
        dgv dgvVar = (dgv) this.c.C().C();
        dgvVar.a |= 2;
        dgvVar.c = f;
    }

    public final void T() {
        this.c.C().f = true;
    }

    public abstract dha a();

    protected abstract void b(dha dhaVar);

    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final dgy clone() {
        try {
            dgy dgyVar = (dgy) super.clone();
            dha j = this.c.j();
            dgyVar.c = j;
            dgyVar.b(j);
            return dgyVar;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public final dgy n(YogaEdge yogaEdge, float f) {
        L(yogaEdge, this.b.a(f));
        return this;
    }

    public final void p(float f) {
        dgx C = this.c.C();
        C.D().c(f);
        C.a = (byte) (f == 1.0f ? C.a & (-9) : C.a | 8);
    }

    public final void q(Drawable drawable) {
        dgx C = this.c.C();
        C.a = (byte) (C.a | 1);
        C.c = drawable;
    }

    public final void r(diy diyVar) {
        this.c.C().D().d(diyVar);
    }

    public void s(boolean z) {
        this.c.C().D().f(z);
    }

    public void t(CharSequence charSequence) {
        this.c.C().D().g(charSequence);
    }

    public final void u(boolean z) {
        this.c.C().D().k(z);
    }

    public final void v(int i) {
        dgw c = this.c.C().c();
        c.a |= 1;
        c.e = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(dhe dheVar, dha dhaVar) {
        this.b = dheVar.g;
        this.c = dhaVar;
        this.a = dheVar;
        dha dhaVar2 = dheVar.f;
        if (dhaVar2 != null) {
            this.c.l = dhaVar2.m;
        }
        this.c.r = dheVar.b;
    }

    public final void x(String str) {
        if (str == null) {
            dha dhaVar = this.a.f;
            String o = dhaVar != null ? dhaVar.o() : "unknown component";
            StringBuilder sb = new StringBuilder(String.valueOf(o).length() + 99);
            sb.append("Setting a null key from ");
            sb.append(o);
            sb.append(" which is usually a mistake! If it is not, explicitly set the String 'null'");
            dhz.a(2, "Component:NullKeySet", sb.toString());
            str = "null";
        }
        dha dhaVar2 = this.c;
        dhaVar2.o = true;
        dhaVar2.n = str;
    }

    public final void y(YogaDirection yogaDirection) {
        dgv dgvVar = (dgv) this.c.C().C();
        dgvVar.a |= 4096;
        dgvVar.s = yogaDirection;
    }

    public final void z(YogaEdge yogaEdge, float f) {
        E(yogaEdge, this.b.a(f));
    }
}
