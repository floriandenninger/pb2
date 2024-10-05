package com.facebook.yoga;

import defpackage.dha;
import defpackage.dhe;
import defpackage.did;
import defpackage.dii;
import defpackage.din;
import defpackage.djr;
import defpackage.djt;
import defpackage.dlo;
import defpackage.dut;
import defpackage.duv;
import java.util.ArrayList;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class YogaNodeJNIBase extends dut implements Cloneable {
    protected long a;
    private float[] arr;
    public Object b;
    private YogaNodeJNIBase c;
    private List d;
    private YogaMeasureFunction e;
    private boolean f;
    private int mLayoutDirection;

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNew());
    }

    private static duv ae(long j) {
        return new duv(Float.intBitsToFloat((int) j), YogaUnit.a((int) (j >> 32)));
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List list = this.d;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i);
        this.d.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.c = this;
        return yogaNodeJNIBase.a;
    }

    @Override // defpackage.dut
    public final void A(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasis(this.a, f);
    }

    @Override // defpackage.dut
    public final void B(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercent(this.a, f);
    }

    @Override // defpackage.dut
    public final void C(YogaFlexDirection yogaFlexDirection) {
        YogaNative.jni_YGNodeStyleSetFlexDirection(this.a, yogaFlexDirection.e);
    }

    @Override // defpackage.dut
    public final void D(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrow(this.a, f);
    }

    @Override // defpackage.dut
    public final void E(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrink(this.a, f);
    }

    @Override // defpackage.dut
    public final void F(float f) {
        YogaNative.jni_YGNodeStyleSetHeight(this.a, f);
    }

    @Override // defpackage.dut
    public final void G(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercent(this.a, f);
    }

    @Override // defpackage.dut
    public final void H(YogaJustify yogaJustify) {
        YogaNative.jni_YGNodeStyleSetJustifyContent(this.a, yogaJustify.g);
    }

    @Override // defpackage.dut
    public final void I(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetMargin(this.a, yogaEdge.j, f);
    }

    @Override // defpackage.dut
    public final void J(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetMarginPercent(this.a, yogaEdge.j, f);
    }

    @Override // defpackage.dut
    public final void K(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeight(this.a, f);
    }

    @Override // defpackage.dut
    public final void L(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercent(this.a, f);
    }

    @Override // defpackage.dut
    public final void M(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidth(this.a, f);
    }

    @Override // defpackage.dut
    public final void N(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercent(this.a, f);
    }

    @Override // defpackage.dut
    public final void O(YogaMeasureFunction yogaMeasureFunction) {
        this.e = yogaMeasureFunction;
        YogaNative.jni_YGNodeSetHasMeasureFunc(this.a, true);
    }

    @Override // defpackage.dut
    public final void P(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeight(this.a, f);
    }

    @Override // defpackage.dut
    public final void Q(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercent(this.a, f);
    }

    @Override // defpackage.dut
    public final void R(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidth(this.a, f);
    }

    @Override // defpackage.dut
    public final void S(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercent(this.a, f);
    }

    @Override // defpackage.dut
    public final void T(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPadding(this.a, yogaEdge.j, f);
    }

    @Override // defpackage.dut
    public final void U(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingPercent(this.a, yogaEdge.j, f);
    }

    @Override // defpackage.dut
    public final void V(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPosition(this.a, yogaEdge.j, f);
    }

    @Override // defpackage.dut
    public final void W(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPositionPercent(this.a, yogaEdge.j, f);
    }

    @Override // defpackage.dut
    public final void X(YogaPositionType yogaPositionType) {
        YogaNative.jni_YGNodeStyleSetPositionType(this.a, yogaPositionType.c);
    }

    @Override // defpackage.dut
    public final void Y(float f) {
        YogaNative.jni_YGNodeStyleSetWidth(this.a, f);
    }

    @Override // defpackage.dut
    public final void Z(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercent(this.a, f);
    }

    @Override // defpackage.dut
    public final float a(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i = (int) fArr[0];
        if ((i & 4) != 4) {
            return 0.0f;
        }
        int i2 = (14 - (1 != (i & 1) ? 4 : 0)) - ((i & 2) != 2 ? 4 : 0);
        YogaEdge yogaEdge2 = YogaEdge.LEFT;
        int ordinal = yogaEdge.ordinal();
        if (ordinal == 0) {
            return this.arr[i2];
        }
        if (ordinal == 1) {
            return this.arr[i2 + 1];
        }
        if (ordinal == 2) {
            return this.arr[i2 + 2];
        }
        if (ordinal == 3) {
            return this.arr[i2 + 3];
        }
        if (ordinal == 4) {
            return i() == YogaDirection.RTL ? this.arr[i2 + 2] : this.arr[i2];
        }
        if (ordinal == 5) {
            return i() == YogaDirection.RTL ? this.arr[i2] : this.arr[i2 + 2];
        }
        throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
    }

    @Override // defpackage.dut
    public final void aa(YogaWrap yogaWrap) {
        YogaNative.jni_YGNodeStyleSetFlexWrap(this.a, yogaWrap.d);
    }

    @Override // defpackage.dut
    public final boolean ab() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.f;
    }

    @Override // defpackage.dut
    public final void ac() {
        YogaNative.jni_YGNodeStyleSetFlex(this.a, 0.0f);
    }

    @Override // defpackage.dut
    /* renamed from: ad, reason: merged with bridge method [inline-methods] */
    public final YogaNodeJNIBase k() {
        try {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) super.clone();
            long jni_YGNodeClone = YogaNative.jni_YGNodeClone(this.a);
            yogaNodeJNIBase.c = null;
            yogaNodeJNIBase.a = jni_YGNodeClone;
            yogaNodeJNIBase.d = null;
            YogaNative.jni_YGNodeClearChildren(jni_YGNodeClone);
            return yogaNodeJNIBase;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.dut
    public final float b() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    public final float baseline(float f, float f2) {
        throw null;
    }

    @Override // defpackage.dut
    public final float c(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null || (((int) fArr[0]) & 1) != 1) {
            return 0.0f;
        }
        YogaEdge yogaEdge2 = YogaEdge.LEFT;
        int ordinal = yogaEdge.ordinal();
        if (ordinal == 0) {
            return this.arr[6];
        }
        if (ordinal == 1) {
            return this.arr[7];
        }
        if (ordinal == 2) {
            return this.arr[8];
        }
        if (ordinal == 3) {
            return this.arr[9];
        }
        if (ordinal == 4) {
            return i() == YogaDirection.RTL ? this.arr[8] : this.arr[6];
        }
        if (ordinal == 5) {
            return i() == YogaDirection.RTL ? this.arr[6] : this.arr[8];
        }
        throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
    }

    @Override // defpackage.dut
    public final float d(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i = (int) fArr[0];
        if ((i & 2) != 2) {
            return 0.0f;
        }
        int i2 = 10 - (1 != (i & 1) ? 4 : 0);
        YogaEdge yogaEdge2 = YogaEdge.LEFT;
        int ordinal = yogaEdge.ordinal();
        if (ordinal == 0) {
            return this.arr[i2];
        }
        if (ordinal == 1) {
            return this.arr[i2 + 1];
        }
        if (ordinal == 2) {
            return this.arr[i2 + 2];
        }
        if (ordinal == 3) {
            return this.arr[i2 + 3];
        }
        if (ordinal == 4) {
            return i() == YogaDirection.RTL ? this.arr[i2 + 2] : this.arr[i2];
        }
        if (ordinal == 5) {
            return i() == YogaDirection.RTL ? this.arr[i2] : this.arr[i2 + 2];
        }
        throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
    }

    @Override // defpackage.dut
    public final float e() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // defpackage.dut
    public final float f() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // defpackage.dut
    public final float g() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // defpackage.dut
    public final int h() {
        List list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.dut
    public final YogaDirection i() {
        float[] fArr = this.arr;
        return YogaDirection.a(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // defpackage.dut
    public final YogaDirection j() {
        return YogaDirection.a(YogaNative.jni_YGNodeStyleGetDirection(this.a));
    }

    @Override // defpackage.dut
    public final /* bridge */ /* synthetic */ dut l(int i) {
        List list = this.d;
        if (list == null) {
            throw new IllegalStateException("YogaNode does not have children");
        }
        return (YogaNodeJNIBase) list.get(i);
    }

    @Override // defpackage.dut
    public final /* synthetic */ dut m() {
        return this.c;
    }

    @Override // defpackage.dut
    public final duv n() {
        return ae(YogaNative.jni_YGNodeStyleGetHeight(this.a));
    }

    @Override // defpackage.dut
    public final duv o() {
        return ae(YogaNative.jni_YGNodeStyleGetWidth(this.a));
    }

    @Override // defpackage.dut
    public final Object p() {
        return this.b;
    }

    @Override // defpackage.dut
    public final void q(dut dutVar, int i) {
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) dutVar;
        if (yogaNodeJNIBase.c == null) {
            if (this.d == null) {
                this.d = new ArrayList(4);
            }
            this.d.add(i, dutVar);
            yogaNodeJNIBase.c = this;
            YogaNative.jni_YGNodeInsertChild(this.a, yogaNodeJNIBase.a, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    @Override // defpackage.dut
    public final void r(float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            List list = ((YogaNodeJNIBase) arrayList.get(i)).d;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].a;
        }
        YogaNative.jni_YGNodeCalculateLayout(this.a, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // defpackage.dut
    public final void s() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f = false;
    }

    @Override // defpackage.dut
    public final void t(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignContent(this.a, yogaAlign.i);
    }

    @Override // defpackage.dut
    public final void u(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignItems(this.a, yogaAlign.i);
    }

    @Override // defpackage.dut
    public final void v(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignSelf(this.a, yogaAlign.i);
    }

    @Override // defpackage.dut
    public final void w(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatio(this.a, f);
    }

    @Override // defpackage.dut
    public final void x(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetBorder(this.a, yogaEdge.j, f);
    }

    @Override // defpackage.dut
    public final void y(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.dut
    public final void z(YogaDirection yogaDirection) {
        YogaNative.jni_YGNodeStyleSetDirection(this.a, yogaDirection.d);
    }

    public YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f = true;
        if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.a = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [dhi, java.lang.Object, djr] */
    public final long measure(float f, int i, float f2, int i2) {
        int C;
        int i3;
        int i4;
        if (this.e == null) {
            throw new RuntimeException("Measure function isn't defined!");
        }
        YogaMeasureMode a = YogaMeasureMode.a(i);
        YogaMeasureMode a2 = YogaMeasureMode.a(i2);
        ?? p = p();
        dha W = p.W();
        dhe dheVar = W.q;
        if (dheVar != null && dheVar.k()) {
            return 0L;
        }
        dii diiVar = (dii) p;
        dha dhaVar = null;
        din dinVar = diiVar.d ? diiVar.c : null;
        int u = did.u(f, a);
        int u2 = did.u(f2, a2);
        diiVar.e = u;
        diiVar.f = u2;
        dhe dheVar2 = diiVar.a;
        if (dha.A(dheVar2, W) || p.aM()) {
            dha V = p.V();
            if (W != V) {
                dhaVar = V;
            } else if (p.al() != null) {
                dhaVar = p.al().W();
            }
            if (dhaVar != null) {
                dheVar2 = dhaVar.q;
            }
            djr e = djt.e(dheVar2, p, u, u2);
            int H = e.H();
            C = e.C();
            i3 = H;
        } else if (dinVar == null || dinVar.e() != u || dinVar.d() != u2) {
            dlo dloVar = new dlo(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            W.R(dheVar, p, u, u2, dloVar);
            int i5 = dloVar.a;
            if (i5 < 0 || (i4 = dloVar.b) < 0) {
                String valueOf = String.valueOf(W);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
                sb.append("MeasureOutput not set, ComponentLifecycle is: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
            din dinVar2 = diiVar.c;
            if (dinVar2 != null) {
                dinVar2.ko(u);
                diiVar.c.kl(u2);
                diiVar.c.kn(i5);
                diiVar.c.km(i4);
            }
            C = i4;
            i3 = i5;
        } else {
            W.an();
            i3 = (int) dinVar.b();
            C = (int) dinVar.a();
        }
        diiVar.g = i3;
        diiVar.h = C;
        return Float.floatToRawIntBits(r11) | (Float.floatToRawIntBits(r10) << 32);
    }
}
