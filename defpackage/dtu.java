package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.MovementMethod;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dtu extends dha {
    public static final /* synthetic */ int Q = 0;

    @dnt(a = 13)
    final MovementMethod A;

    @dnt(a = 3)
    public boolean B;

    @dnt(a = 3)
    public int C;

    @dnt(a = 3)
    public int D;

    @dnt(a = 13)
    public ColorStateList E;

    @dnt(a = 3)
    public int F;

    @dnt(a = 5)
    public List G;

    @dnt(a = 13)
    final Typeface H;
    public diy I;

    /* renamed from: J, reason: collision with root package name */
    diy f189J;
    ammr K;
    ammr L;
    ammr M;
    ammr N;
    ammr O;
    ammr P;

    @dnt(a = 14)
    private dtt R;

    @dnt(a = 3)
    public int a;

    @dnt(a = 3)
    public boolean b;

    @dnt(a = 3)
    int c;

    @dnt(a = 3)
    public int d;

    @dnt(a = 13)
    public CharSequence e;

    @dnt(a = 13)
    final ColorStateList f;

    @dnt(a = 3)
    public int g;

    @dnt(a = 13)
    public CharSequence v;

    @dnt(a = 13)
    public Drawable w;

    @dnt(a = 5)
    final List x;

    @dnt(a = 3)
    public int y;

    @dnt(a = 3)
    public int z;

    public dtu() {
        super("TextInput");
        this.c = 8388627;
        this.e = dty.c;
        this.f = dty.b;
        this.g = 0;
        this.v = dty.d;
        this.w = dty.e;
        this.x = Collections.emptyList();
        this.y = 1;
        this.z = Integer.MAX_VALUE;
        this.A = dty.g;
        this.B = false;
        this.C = 0;
        this.D = 1;
        this.E = dty.a;
        this.F = -1;
        this.G = Collections.emptyList();
        this.H = dty.f;
        this.R = new dtt();
    }

    @Override // defpackage.dhk
    protected final int F() {
        return 3;
    }

    @Override // defpackage.dhk
    protected final Object L(Context context) {
        return dty.d(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void M(dhe dheVar) {
        baql baqlVar = new baql();
        baql baqlVar2 = new baql();
        baql baqlVar3 = new baql();
        dty.j(baqlVar, baqlVar2, baqlVar3, this.v);
        dtt dttVar = this.R;
        dttVar.b = (AtomicReference) baqlVar.a;
        dttVar.c = (AtomicReference) baqlVar2.a;
        dttVar.a = ((Integer) baqlVar3.a).intValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void P(dhe dheVar, Object obj) {
        dty.e(dheVar, (dtw) obj, this.G);
    }

    @Override // defpackage.dhk
    public final void R(dhe dheVar, dhi dhiVar, int i, int i2, dlo dloVar) {
        CharSequence charSequence = this.e;
        Drawable drawable = this.w;
        ColorStateList colorStateList = this.E;
        ColorStateList colorStateList2 = this.f;
        int i3 = this.d;
        int i4 = this.F;
        Typeface typeface = this.H;
        int i5 = this.D;
        int i6 = this.c;
        int i7 = this.y;
        int i8 = this.C;
        int i9 = this.g;
        List list = this.x;
        boolean z = this.B;
        int i10 = this.z;
        int i11 = this.a;
        dtt dttVar = this.R;
        AtomicReference atomicReference = dttVar.c;
        int i12 = dttVar.a;
        dty.c(dheVar, i, i2, dloVar, charSequence, drawable, colorStateList, colorStateList2, i3, i4, typeface, i5, i6, i7, i8, i9, list, z, i10, i11, atomicReference);
    }

    @Override // defpackage.dhk
    protected final void S(dhe dheVar, Object obj) {
        CharSequence charSequence = this.e;
        Drawable drawable = this.w;
        ColorStateList colorStateList = this.E;
        ColorStateList colorStateList2 = this.f;
        int i = this.d;
        int i2 = this.F;
        Typeface typeface = this.H;
        int i3 = this.D;
        int i4 = this.c;
        int i5 = this.y;
        int i6 = this.C;
        int i7 = this.g;
        List list = this.x;
        boolean z = this.B;
        int i8 = this.z;
        MovementMethod movementMethod = this.A;
        int i9 = this.a;
        dtt dttVar = this.R;
        dty.h(dheVar, (dtw) obj, charSequence, drawable, colorStateList, colorStateList2, i, i2, typeface, i3, i4, i5, i6, i7, list, z, i8, movementMethod, i9, dttVar.c, dttVar.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void W(dhe dheVar, Object obj) {
        dty.g((dtw) obj, this.R.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void X(dlq dlqVar, dlq dlqVar2) {
        dtt dttVar = (dtt) dlqVar;
        dtt dttVar2 = (dtt) dlqVar2;
        dttVar2.a = dttVar.a;
        dttVar2.b = dttVar.b;
        dttVar2.c = dttVar.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final boolean ac() {
        return true;
    }

    @Override // defpackage.dhk
    public final boolean ag() {
        return true;
    }

    @Override // defpackage.dhk
    protected final boolean ai(dha dhaVar, dha dhaVar2) {
        dim dimVar;
        Integer valueOf;
        dim dimVar2;
        Integer valueOf2;
        dim dimVar3;
        Integer valueOf3;
        dim dimVar4;
        Integer valueOf4;
        dim dimVar5;
        Integer valueOf5;
        dim dimVar6;
        List list;
        dim dimVar7;
        Boolean valueOf6;
        dim dimVar8;
        Integer num;
        dim dimVar9;
        Integer valueOf7;
        dim dimVar10;
        Integer num2;
        dim dimVar11;
        MovementMethod movementMethod;
        dtu dtuVar = (dtu) dhaVar;
        dtu dtuVar2 = (dtu) dhaVar2;
        dim dimVar12 = new dim(dtuVar.v, dtuVar2 == null ? null : dtuVar2.v);
        dim dimVar13 = new dim(dtuVar.e, dtuVar2 == null ? null : dtuVar2.e);
        dim dimVar14 = new dim(dtuVar.w, dtuVar2 == null ? null : dtuVar2.w);
        Float valueOf8 = Float.valueOf(0.0f);
        Float f = dtuVar2 == null ? null : valueOf8;
        dim dimVar15 = new dim(valueOf8, f);
        dim dimVar16 = new dim(valueOf8, f);
        dim dimVar17 = new dim(valueOf8, f);
        dim dimVar18 = new dim(-7829368, dtuVar2 == null ? null : -7829368);
        dim dimVar19 = new dim(dtuVar.E, dtuVar2 == null ? null : dtuVar2.E);
        dim dimVar20 = new dim(dtuVar.f, dtuVar2 == null ? null : dtuVar2.f);
        dim dimVar21 = new dim(Integer.valueOf(dtuVar.d), dtuVar2 == null ? null : Integer.valueOf(dtuVar2.d));
        dim dimVar22 = new dim(Integer.valueOf(dtuVar.F), dtuVar2 == null ? null : Integer.valueOf(dtuVar2.F));
        dim dimVar23 = new dim(dtuVar.H, dtuVar2 == null ? null : dtuVar2.H);
        Integer valueOf9 = Integer.valueOf(dtuVar.D);
        if (dtuVar2 == null) {
            dimVar = dimVar23;
            valueOf = null;
        } else {
            dimVar = dimVar23;
            valueOf = Integer.valueOf(dtuVar2.D);
        }
        dim dimVar24 = new dim(valueOf9, valueOf);
        Integer valueOf10 = Integer.valueOf(dtuVar.c);
        if (dtuVar2 == null) {
            dimVar2 = dimVar24;
            valueOf2 = null;
        } else {
            dimVar2 = dimVar24;
            valueOf2 = Integer.valueOf(dtuVar2.c);
        }
        dim dimVar25 = new dim(valueOf10, valueOf2);
        dim dimVar26 = new dim(true, dtuVar2 == null ? null : true);
        Integer valueOf11 = Integer.valueOf(dtuVar.y);
        if (dtuVar2 == null) {
            dimVar3 = dimVar26;
            valueOf3 = null;
        } else {
            dimVar3 = dimVar26;
            valueOf3 = Integer.valueOf(dtuVar2.y);
        }
        dim dimVar27 = new dim(valueOf11, valueOf3);
        Integer valueOf12 = Integer.valueOf(dtuVar.C);
        if (dtuVar2 == null) {
            dimVar4 = dimVar27;
            valueOf4 = null;
        } else {
            dimVar4 = dimVar27;
            valueOf4 = Integer.valueOf(dtuVar2.C);
        }
        dim dimVar28 = new dim(valueOf12, valueOf4);
        Integer valueOf13 = Integer.valueOf(dtuVar.g);
        if (dtuVar2 == null) {
            dimVar5 = dimVar28;
            valueOf5 = null;
        } else {
            dimVar5 = dimVar28;
            valueOf5 = Integer.valueOf(dtuVar2.g);
        }
        dim dimVar29 = new dim(valueOf13, valueOf5);
        List list2 = dtuVar.x;
        if (dtuVar2 == null) {
            dimVar6 = dimVar29;
            list = null;
        } else {
            dimVar6 = dimVar29;
            list = dtuVar2.x;
        }
        dim dimVar30 = new dim(list2, list);
        dim dimVar31 = new dim(null, null);
        Boolean valueOf14 = Boolean.valueOf(dtuVar.B);
        if (dtuVar2 == null) {
            dimVar7 = dimVar31;
            valueOf6 = null;
        } else {
            dimVar7 = dimVar31;
            valueOf6 = Boolean.valueOf(dtuVar2.B);
        }
        dim dimVar32 = new dim(valueOf14, valueOf6);
        if (dtuVar2 == null) {
            dimVar8 = dimVar32;
            num = null;
        } else {
            dimVar8 = dimVar32;
            num = 1;
        }
        dim dimVar33 = new dim(1, num);
        Integer valueOf15 = Integer.valueOf(dtuVar.z);
        if (dtuVar2 == null) {
            dimVar9 = dimVar33;
            valueOf7 = null;
        } else {
            dimVar9 = dimVar33;
            valueOf7 = Integer.valueOf(dtuVar2.z);
        }
        dim dimVar34 = new dim(valueOf15, valueOf7);
        if (dtuVar2 == null) {
            dimVar10 = dimVar34;
            num2 = null;
        } else {
            dimVar10 = dimVar34;
            num2 = -1;
        }
        dim dimVar35 = new dim(-1, num2);
        MovementMethod movementMethod2 = dtuVar.A;
        if (dtuVar2 == null) {
            dimVar11 = dimVar35;
            movementMethod = null;
        } else {
            dimVar11 = dimVar35;
            movementMethod = dtuVar2.A;
        }
        return dty.b(dimVar12, dimVar13, dimVar14, dimVar15, dimVar16, dimVar17, dimVar18, dimVar19, dimVar20, dimVar21, dimVar22, dimVar, dimVar2, dimVar25, dimVar3, dimVar4, dimVar5, dimVar6, dimVar30, dimVar7, dimVar8, dimVar9, dimVar10, dimVar11, new dim(movementMethod2, movementMethod), new dim(null, null), new dim(Integer.valueOf(dtuVar.R.a), dtuVar2 != null ? Integer.valueOf(dtuVar2.R.a) : null));
    }

    @Override // defpackage.dhk
    public final int aj() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dhk
    public final void ar(Object obj) {
        dty.f((dtw) obj);
    }

    @Override // defpackage.dha
    /* renamed from: e */
    public final boolean f(dha dhaVar) {
        if (this == dhaVar) {
            return true;
        }
        if (dhaVar == null || getClass() != dhaVar.getClass()) {
            return false;
        }
        dtu dtuVar = (dtu) dhaVar;
        if (this.k == dtuVar.k) {
            return true;
        }
        if (this.a != dtuVar.a || this.c != dtuVar.c || this.d != dtuVar.d) {
            return false;
        }
        CharSequence charSequence = this.e;
        if (charSequence == null ? dtuVar.e != null : !charSequence.equals(dtuVar.e)) {
            return false;
        }
        ColorStateList colorStateList = this.f;
        if (colorStateList == null ? dtuVar.f != null : !colorStateList.equals(dtuVar.f)) {
            return false;
        }
        if (this.g != dtuVar.g) {
            return false;
        }
        CharSequence charSequence2 = this.v;
        if (charSequence2 == null ? dtuVar.v != null : !charSequence2.equals(dtuVar.v)) {
            return false;
        }
        Drawable drawable = this.w;
        if (drawable == null ? dtuVar.w != null : !drawable.equals(dtuVar.w)) {
            return false;
        }
        List list = this.x;
        if (list == null ? dtuVar.x != null : !list.equals(dtuVar.x)) {
            return false;
        }
        if (this.y != dtuVar.y || this.z != dtuVar.z) {
            return false;
        }
        MovementMethod movementMethod = this.A;
        if (movementMethod == null ? dtuVar.A != null : !movementMethod.equals(dtuVar.A)) {
            return false;
        }
        if (this.B != dtuVar.B || this.C != dtuVar.C || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || this.D != dtuVar.D) {
            return false;
        }
        ColorStateList colorStateList2 = this.E;
        if (colorStateList2 == null ? dtuVar.E != null : !colorStateList2.equals(dtuVar.E)) {
            return false;
        }
        if (this.F != dtuVar.F) {
            return false;
        }
        List list2 = this.G;
        if (list2 == null ? dtuVar.G != null : !list2.equals(dtuVar.G)) {
            return false;
        }
        Typeface typeface = this.H;
        if (typeface == null ? dtuVar.H != null : !typeface.equals(dtuVar.H)) {
            return false;
        }
        dtt dttVar = this.R;
        int i = dttVar.a;
        dtt dttVar2 = dtuVar.R;
        if (i != dttVar2.a) {
            return false;
        }
        AtomicReference atomicReference = dttVar.b;
        if (atomicReference == null ? dttVar2.b != null : !atomicReference.equals(dttVar2.b)) {
            return false;
        }
        AtomicReference atomicReference2 = this.R.c;
        AtomicReference atomicReference3 = dtuVar.R.c;
        return atomicReference2 == null ? atomicReference3 == null : atomicReference2.equals(atomicReference3);
    }

    @Override // defpackage.dha, defpackage.div
    public final /* bridge */ /* synthetic */ boolean f(Object obj) {
        return f((dha) obj);
    }

    @Override // defpackage.dha
    public final /* bridge */ /* synthetic */ dha j() {
        dtu dtuVar = (dtu) super.j();
        dtuVar.R = new dtt();
        return dtuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dha
    public final dlq m() {
        return this.R;
    }

    @Override // defpackage.dha
    public final void s(dja djaVar) {
        ammr ammrVar = this.K;
        if (ammrVar != null) {
            djaVar.b(ammrVar);
        }
        ammr ammrVar2 = this.L;
        if (ammrVar2 != null) {
            djaVar.b(ammrVar2);
        }
        ammr ammrVar3 = this.M;
        if (ammrVar3 != null) {
            djaVar.b(ammrVar3);
        }
        ammr ammrVar4 = this.N;
        if (ammrVar4 != null) {
            djaVar.b(ammrVar4);
        }
        ammr ammrVar5 = this.O;
        if (ammrVar5 != null) {
            djaVar.b(ammrVar5);
        }
        ammr ammrVar6 = this.P;
        if (ammrVar6 != null) {
            djaVar.b(ammrVar6);
        }
    }
}
