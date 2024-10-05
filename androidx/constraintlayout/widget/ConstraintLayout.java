package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.acq;
import defpackage.afk;
import defpackage.afl;
import defpackage.afn;
import defpackage.afo;
import defpackage.afr;
import defpackage.agh;
import defpackage.agi;
import defpackage.agj;
import defpackage.agl;
import defpackage.agm;
import defpackage.agq;
import defpackage.agr;
import defpackage.agt;
import defpackage.agu;
import defpackage.agv;
import defpackage.agw;
import defpackage.agx;
import defpackage.agz;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    SparseArray a;
    public ArrayList b;
    protected afl c;
    public int d;
    protected boolean e;
    public int f;
    public HashMap g;
    agm h;
    private int i;
    private int j;
    private int k;
    private agv l;
    private int m;
    private SparseArray n;

    public ConstraintLayout(Context context) {
        super(context);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new afl();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.l = null;
        this.m = -1;
        this.g = new HashMap();
        this.n = new SparseArray();
        this.h = new agm(this, this);
        e(null, 0, 0);
    }

    protected static final agl d() {
        return new agl();
    }

    private final void e(AttributeSet attributeSet, int i, int i2) {
        afl aflVar = this.c;
        aflVar.af = this;
        agm agmVar = this.h;
        aflVar.aG = agmVar;
        aflVar.b.g = agmVar;
        this.a.put(getId(), this);
        this.l = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, agz.b, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 16) {
                    this.i = obtainStyledAttributes.getDimensionPixelOffset(16, this.i);
                } else if (index == 17) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(17, this.d);
                } else if (index == 14) {
                    this.j = obtainStyledAttributes.getDimensionPixelOffset(14, this.j);
                } else if (index == 15) {
                    this.k = obtainStyledAttributes.getDimensionPixelOffset(15, this.k);
                } else if (index == 112) {
                    this.f = obtainStyledAttributes.getInt(112, this.f);
                } else if (index == 55) {
                    int resourceId = obtainStyledAttributes.getResourceId(55, 0);
                    if (resourceId != 0) {
                        try {
                            acq.b(getContext(), resourceId, new SparseArray(), new SparseArray());
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(34, 0);
                    try {
                        agv agvVar = new agv();
                        this.l = agvVar;
                        agvVar.c(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.l = null;
                    }
                    this.m = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.c.U(this.f);
    }

    private final void f() {
        this.e = true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:106:0x01d1. Please report as an issue. */
    private final void g() {
        boolean z;
        int i;
        float f;
        int i2;
        afk afkVar;
        afk afkVar2;
        afk afkVar3;
        afk afkVar4;
        float f2;
        agl aglVar;
        float f3;
        int i3;
        int i4;
        float parseFloat;
        int i5;
        Object obj;
        afo afoVar;
        afk qe;
        String str;
        int d;
        ConstraintLayout constraintLayout;
        int i6;
        boolean z2;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        int i11;
        String str3;
        afk afkVar5;
        ConstraintLayout constraintLayout2 = this;
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            afk qe2 = constraintLayout2.qe(constraintLayout2.getChildAt(i12));
            if (qe2 != null) {
                qe2.s();
            }
        }
        int i13 = -1;
        if (isInEditMode) {
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = constraintLayout2.getChildAt(i14);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    Integer valueOf = Integer.valueOf(childAt.getId());
                    if (resourceName instanceof String) {
                        if (constraintLayout2.g == null) {
                            constraintLayout2.g = new HashMap();
                        }
                        int indexOf = resourceName.indexOf("/");
                        constraintLayout2.g.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, Integer.valueOf(valueOf.intValue()));
                    }
                    int indexOf2 = resourceName.indexOf(47);
                    if (indexOf2 != -1) {
                        resourceName = resourceName.substring(indexOf2 + 1);
                    }
                    int id = childAt.getId();
                    if (id == 0) {
                        afkVar5 = constraintLayout2.c;
                    } else {
                        View view = (View) constraintLayout2.a.get(id);
                        if (view == null && (view = constraintLayout2.findViewById(id)) != null && view != constraintLayout2 && view.getParent() == constraintLayout2) {
                            constraintLayout2.onViewAdded(view);
                        }
                        if (view == constraintLayout2) {
                            afkVar5 = constraintLayout2.c;
                        } else {
                            afkVar5 = view == null ? null : ((agl) view.getLayoutParams()).aq;
                        }
                    }
                    afkVar5.ah = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (constraintLayout2.m != -1) {
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt2 = constraintLayout2.getChildAt(i15);
                if (childAt2.getId() == constraintLayout2.m && (childAt2 instanceof agw)) {
                    throw null;
                }
            }
        }
        agv agvVar = constraintLayout2.l;
        int i16 = 1;
        if (agvVar != null) {
            int childCount2 = getChildCount();
            HashSet hashSet = new HashSet(agvVar.b.keySet());
            int i17 = 0;
            while (i17 < childCount2) {
                View childAt3 = constraintLayout2.getChildAt(i17);
                int id2 = childAt3.getId();
                HashMap hashMap = agvVar.b;
                Integer valueOf2 = Integer.valueOf(id2);
                if (!hashMap.containsKey(valueOf2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("id unknown ");
                    try {
                        str3 = childAt3.getContext().getResources().getResourceEntryName(childAt3.getId());
                    } catch (Exception unused2) {
                        str3 = "UNKNOWN";
                    }
                    sb.append(str3);
                    Log.w("ConstraintSet", sb.toString());
                } else if (id2 != i13) {
                    if (id2 != i13 && agvVar.b.containsKey(valueOf2)) {
                        hashSet.remove(valueOf2);
                        agq agqVar = (agq) agvVar.b.get(valueOf2);
                        if (agqVar != null) {
                            if (childAt3 instanceof agh) {
                                agqVar.d.ai = i16;
                                agh aghVar = (agh) childAt3;
                                aghVar.setId(id2);
                                agr agrVar = agqVar.d;
                                aghVar.a = agrVar.ag;
                                aghVar.b(agrVar.ah);
                                agr agrVar2 = agqVar.d;
                                aghVar.b.b = agrVar2.ao;
                                int[] iArr = agrVar2.aj;
                                if (iArr != null) {
                                    aghVar.e(iArr);
                                } else {
                                    String str4 = agrVar2.ak;
                                    if (str4 != null) {
                                        agrVar2.aj = agv.g(aghVar, str4);
                                        aghVar.e(agqVar.d.aj);
                                    }
                                }
                            }
                            agl aglVar2 = (agl) childAt3.getLayoutParams();
                            aglVar2.a();
                            agqVar.a(aglVar2);
                            HashMap hashMap2 = agqVar.f;
                            Class<?> cls = childAt3.getClass();
                            for (String str5 : hashMap2.keySet()) {
                                boolean z3 = isInEditMode;
                                agi agiVar = (agi) hashMap2.get(str5);
                                HashMap hashMap3 = hashMap2;
                                if (agiVar.a) {
                                    i8 = childCount;
                                    str2 = str5;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    i8 = childCount;
                                    sb2.append("set");
                                    sb2.append(str5);
                                    str2 = sb2.toString();
                                }
                                try {
                                    i10 = agiVar.h;
                                    i11 = i10 - 1;
                                } catch (IllegalAccessException e) {
                                    e = e;
                                    i9 = childCount2;
                                } catch (NoSuchMethodException e2) {
                                    e = e2;
                                    i9 = childCount2;
                                } catch (InvocationTargetException e3) {
                                    e = e3;
                                    i9 = childCount2;
                                }
                                if (i10 == 0) {
                                    i9 = childCount2;
                                    throw null;
                                }
                                switch (i11) {
                                    case 0:
                                        i9 = childCount2;
                                        cls.getMethod(str2, Integer.TYPE).invoke(childAt3, Integer.valueOf(agiVar.c));
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                        break;
                                    case 1:
                                        i9 = childCount2;
                                        cls.getMethod(str2, Float.TYPE).invoke(childAt3, Float.valueOf(agiVar.d));
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                        break;
                                    case 2:
                                        i9 = childCount2;
                                        cls.getMethod(str2, Integer.TYPE).invoke(childAt3, Integer.valueOf(agiVar.g));
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                        break;
                                    case 3:
                                        i9 = childCount2;
                                        Method method = cls.getMethod(str2, Drawable.class);
                                        ColorDrawable colorDrawable = new ColorDrawable();
                                        colorDrawable.setColor(agiVar.g);
                                        method.invoke(childAt3, colorDrawable);
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                        break;
                                    case 4:
                                        i9 = childCount2;
                                        cls.getMethod(str2, CharSequence.class).invoke(childAt3, agiVar.e);
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                        break;
                                    case 5:
                                        i9 = childCount2;
                                        cls.getMethod(str2, Boolean.TYPE).invoke(childAt3, Boolean.valueOf(agiVar.f));
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                        break;
                                    case 6:
                                        i9 = childCount2;
                                        cls.getMethod(str2, Float.TYPE).invoke(childAt3, Float.valueOf(agiVar.d));
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                        break;
                                    case 7:
                                        i9 = childCount2;
                                        try {
                                            cls.getMethod(str2, Integer.TYPE).invoke(childAt3, Integer.valueOf(agiVar.c));
                                        } catch (IllegalAccessException e4) {
                                            e = e4;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str5 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                            isInEditMode = z3;
                                            hashMap2 = hashMap3;
                                            childCount = i8;
                                            childCount2 = i9;
                                        } catch (NoSuchMethodException e5) {
                                            e = e5;
                                            Log.e("TransitionLayout", e.getMessage());
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str5 + "\" not found on " + cls.getName());
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append(cls.getName());
                                            sb3.append(" must have a method ");
                                            sb3.append(str2);
                                            Log.e("TransitionLayout", sb3.toString());
                                            isInEditMode = z3;
                                            hashMap2 = hashMap3;
                                            childCount = i8;
                                            childCount2 = i9;
                                        } catch (InvocationTargetException e6) {
                                            e = e6;
                                            Log.e("TransitionLayout", " Custom Attribute \"" + str5 + "\" not found on " + cls.getName());
                                            e.printStackTrace();
                                            isInEditMode = z3;
                                            hashMap2 = hashMap3;
                                            childCount = i8;
                                            childCount2 = i9;
                                        }
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        childCount2 = i9;
                                    default:
                                        isInEditMode = z3;
                                        hashMap2 = hashMap3;
                                        childCount = i8;
                                        break;
                                }
                            }
                            i6 = childCount2;
                            z2 = isInEditMode;
                            i7 = childCount;
                            childAt3.setLayoutParams(aglVar2);
                            agt agtVar = agqVar.b;
                            if (agtVar.c == 0) {
                                childAt3.setVisibility(agtVar.b);
                            }
                            childAt3.setAlpha(agqVar.b.d);
                            childAt3.setRotation(agqVar.e.c);
                            childAt3.setRotationX(agqVar.e.d);
                            childAt3.setRotationY(agqVar.e.e);
                            childAt3.setScaleX(agqVar.e.f);
                            childAt3.setScaleY(agqVar.e.g);
                            agu aguVar = agqVar.e;
                            if (aguVar.j != -1) {
                                if (((View) childAt3.getParent()).findViewById(agqVar.e.j) != null) {
                                    float top = (r0.getTop() + r0.getBottom()) / 2.0f;
                                    float left = (r0.getLeft() + r0.getRight()) / 2.0f;
                                    if (childAt3.getRight() - childAt3.getLeft() > 0 && childAt3.getBottom() - childAt3.getTop() > 0) {
                                        int left2 = childAt3.getLeft();
                                        int top2 = childAt3.getTop();
                                        childAt3.setPivotX(left - left2);
                                        childAt3.setPivotY(top - top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(aguVar.h)) {
                                    childAt3.setPivotX(agqVar.e.h);
                                }
                                if (!Float.isNaN(agqVar.e.i)) {
                                    childAt3.setPivotY(agqVar.e.i);
                                }
                            }
                            childAt3.setTranslationX(agqVar.e.k);
                            childAt3.setTranslationY(agqVar.e.l);
                            childAt3.setTranslationZ(agqVar.e.m);
                            agu aguVar2 = agqVar.e;
                            if (aguVar2.n) {
                                childAt3.setElevation(aguVar2.o);
                            }
                            i17++;
                            constraintLayout2 = this;
                            isInEditMode = z2;
                            childCount = i7;
                            childCount2 = i6;
                            i13 = -1;
                            i16 = 1;
                        }
                    }
                } else {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                i6 = childCount2;
                z2 = isInEditMode;
                i7 = childCount;
                i17++;
                constraintLayout2 = this;
                isInEditMode = z2;
                childCount = i7;
                childCount2 = i6;
                i13 = -1;
                i16 = 1;
            }
            int i18 = childCount2;
            z = isInEditMode;
            i = childCount;
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                agq agqVar2 = (agq) agvVar.b.get(num);
                if (agqVar2 != null) {
                    if (agqVar2.d.ai == 1) {
                        agh aghVar2 = new agh(getContext());
                        aghVar2.setId(num.intValue());
                        agr agrVar3 = agqVar2.d;
                        int[] iArr2 = agrVar3.aj;
                        if (iArr2 != null) {
                            aghVar2.e(iArr2);
                        } else {
                            String str6 = agrVar3.ak;
                            if (str6 != null) {
                                agrVar3.aj = agv.g(aghVar2, str6);
                                aghVar2.e(agqVar2.d.aj);
                            }
                        }
                        agr agrVar4 = agqVar2.d;
                        aghVar2.a = agrVar4.ag;
                        aghVar2.b(agrVar4.ah);
                        agl d2 = d();
                        aghVar2.f();
                        agqVar2.a(d2);
                        constraintLayout = this;
                        constraintLayout.addView(aghVar2, d2);
                    } else {
                        constraintLayout = this;
                    }
                    if (agqVar2.d.b) {
                        Guideline guideline = new Guideline(getContext());
                        guideline.setId(num.intValue());
                        agl d3 = d();
                        agqVar2.a(d3);
                        constraintLayout.addView(guideline, d3);
                    }
                }
            }
            constraintLayout2 = this;
            for (int i19 = 0; i19 < i18; i19++) {
                View childAt4 = constraintLayout2.getChildAt(i19);
                if (childAt4 instanceof agj) {
                }
            }
        } else {
            z = isInEditMode;
            i = childCount;
        }
        constraintLayout2.c.aH.clear();
        int size = constraintLayout2.b.size();
        if (size > 0) {
            for (int i20 = 0; i20 < size; i20++) {
                agj agjVar = (agj) constraintLayout2.b.get(i20);
                if (agjVar.isInEditMode()) {
                    String str7 = agjVar.f;
                    obj = null;
                    agjVar.f = null;
                } else {
                    obj = null;
                }
                afo afoVar2 = agjVar.h;
                if (afoVar2 != null) {
                    afoVar2.ar = 0;
                    Arrays.fill(afoVar2.aq, obj);
                    for (int i21 = 0; i21 < agjVar.d; i21++) {
                        int i22 = agjVar.c[i21];
                        View qd = constraintLayout2.qd(i22);
                        if (qd == null && (d = agjVar.d(constraintLayout2, (str = (String) agjVar.g.get(Integer.valueOf(i22))))) != 0) {
                            agjVar.c[i21] = d;
                            agjVar.g.put(Integer.valueOf(d), str);
                            qd = constraintLayout2.qd(d);
                        }
                        if (qd != null && (qe = constraintLayout2.qe(qd)) != (afoVar = agjVar.h) && qe != null) {
                            int i23 = afoVar.ar;
                            afk[] afkVarArr = afoVar.aq;
                            int length = afkVarArr.length;
                            if (i23 + 1 > length) {
                                afoVar.aq = (afk[]) Arrays.copyOf(afkVarArr, length + length);
                            }
                            afk[] afkVarArr2 = afoVar.aq;
                            int i24 = afoVar.ar;
                            afkVarArr2[i24] = qe;
                            afoVar.ar = i24 + 1;
                        }
                    }
                    afo afoVar3 = agjVar.h;
                }
            }
        }
        int i25 = i;
        for (int i26 = 0; i26 < i25; i26++) {
            View childAt5 = constraintLayout2.getChildAt(i26);
            if (childAt5 instanceof agx) {
                throw null;
            }
        }
        constraintLayout2.n.clear();
        constraintLayout2.n.put(0, constraintLayout2.c);
        constraintLayout2.n.put(getId(), constraintLayout2.c);
        for (int i27 = 0; i27 < i25; i27++) {
            View childAt6 = constraintLayout2.getChildAt(i27);
            constraintLayout2.n.put(childAt6.getId(), constraintLayout2.qe(childAt6));
        }
        for (int i28 = 0; i28 < i25; i28++) {
            View childAt7 = constraintLayout2.getChildAt(i28);
            afk qe3 = constraintLayout2.qe(childAt7);
            if (qe3 != null) {
                agl aglVar3 = (agl) childAt7.getLayoutParams();
                afl aflVar = constraintLayout2.c;
                aflVar.aH.add(qe3);
                afk afkVar6 = qe3.T;
                if (afkVar6 != null) {
                    ((afr) afkVar6).Y(qe3);
                }
                qe3.T = aflVar;
                SparseArray sparseArray = constraintLayout2.n;
                aglVar3.a();
                aglVar3.ar = false;
                qe3.ag = childAt7.getVisibility();
                boolean z4 = aglVar3.ae;
                qe3.af = childAt7;
                if (childAt7 instanceof agj) {
                    ((agj) childAt7).a(qe3, constraintLayout2.c.d);
                }
                if (aglVar3.ac) {
                    afn afnVar = (afn) qe3;
                    int i29 = aglVar3.an;
                    int i30 = aglVar3.ao;
                    float f4 = aglVar3.ap;
                    if (f4 == -1.0f) {
                        i5 = -1;
                        if (i29 != -1) {
                            if (i29 >= 0) {
                                afnVar.a = -1.0f;
                                afnVar.b = i29;
                                afnVar.c = i5;
                            }
                        } else if (i30 != -1 && i30 >= 0) {
                            afnVar.a = -1.0f;
                            afnVar.b = -1;
                            afnVar.c = i30;
                        }
                    } else if (f4 > -1.0f) {
                        afnVar.a = f4;
                        i5 = -1;
                        afnVar.b = -1;
                        afnVar.c = i5;
                    }
                } else {
                    int i31 = aglVar3.ag;
                    int i32 = aglVar3.ah;
                    int i33 = aglVar3.ai;
                    int i34 = aglVar3.aj;
                    int i35 = aglVar3.ak;
                    int i36 = aglVar3.al;
                    float f5 = aglVar3.am;
                    int i37 = aglVar3.o;
                    if (i37 != -1) {
                        afk afkVar7 = (afk) sparseArray.get(i37);
                        if (afkVar7 != null) {
                            float f6 = aglVar3.q;
                            qe3.P(7, afkVar7, 7, aglVar3.p, 0);
                            qe3.E = f6;
                        }
                        aglVar = aglVar3;
                        f3 = 0.0f;
                    } else {
                        if (i31 != -1) {
                            afk afkVar8 = (afk) sparseArray.get(i31);
                            if (afkVar8 != null) {
                                f = f5;
                                i2 = i36;
                                qe3.P(2, afkVar8, 2, aglVar3.leftMargin, i35);
                            } else {
                                f = f5;
                                i2 = i36;
                            }
                        } else {
                            f = f5;
                            i2 = i36;
                            if (i32 != -1 && (afkVar = (afk) sparseArray.get(i32)) != null) {
                                qe3.P(2, afkVar, 4, aglVar3.leftMargin, i35);
                            }
                        }
                        if (i33 != -1) {
                            afk afkVar9 = (afk) sparseArray.get(i33);
                            if (afkVar9 != null) {
                                qe3.P(4, afkVar9, 2, aglVar3.rightMargin, i2);
                            }
                        } else if (i34 != -1 && (afkVar2 = (afk) sparseArray.get(i34)) != null) {
                            qe3.P(4, afkVar2, 4, aglVar3.rightMargin, i2);
                        }
                        int i38 = aglVar3.h;
                        if (i38 != -1) {
                            afk afkVar10 = (afk) sparseArray.get(i38);
                            if (afkVar10 != null) {
                                qe3.P(3, afkVar10, 3, aglVar3.topMargin, aglVar3.w);
                            }
                        } else {
                            int i39 = aglVar3.i;
                            if (i39 != -1 && (afkVar3 = (afk) sparseArray.get(i39)) != null) {
                                qe3.P(3, afkVar3, 5, aglVar3.topMargin, aglVar3.w);
                            }
                        }
                        int i40 = aglVar3.j;
                        if (i40 != -1) {
                            afk afkVar11 = (afk) sparseArray.get(i40);
                            if (afkVar11 != null) {
                                qe3.P(5, afkVar11, 3, aglVar3.bottomMargin, aglVar3.y);
                            }
                        } else {
                            int i41 = aglVar3.k;
                            if (i41 != -1 && (afkVar4 = (afk) sparseArray.get(i41)) != null) {
                                qe3.P(5, afkVar4, 5, aglVar3.bottomMargin, aglVar3.y);
                            }
                        }
                        int i42 = aglVar3.l;
                        if (i42 != -1) {
                            f2 = f;
                            aglVar = aglVar3;
                            h(qe3, aglVar3, sparseArray, i42, 6);
                        } else {
                            f2 = f;
                            aglVar = aglVar3;
                            int i43 = aglVar.m;
                            if (i43 != -1) {
                                h(qe3, aglVar, sparseArray, i43, 3);
                            } else {
                                int i44 = aglVar.n;
                                if (i44 != -1) {
                                    h(qe3, aglVar, sparseArray, i44, 5);
                                }
                            }
                        }
                        f3 = 0.0f;
                        if (f2 >= 0.0f) {
                            qe3.ad = f2;
                        }
                        float f7 = aglVar.E;
                        if (f7 >= 0.0f) {
                            qe3.ae = f7;
                        }
                    }
                    if (z) {
                        int i45 = aglVar.S;
                        if (i45 == -1) {
                            if (aglVar.T != -1) {
                                i45 = -1;
                            }
                        }
                        int i46 = aglVar.T;
                        qe3.Y = i45;
                        qe3.Z = i46;
                    }
                    if (!aglVar.Z) {
                        if (aglVar.width == -1) {
                            if (aglVar.V) {
                                qe3.Q(3);
                            } else {
                                qe3.Q(4);
                            }
                            qe3.L(2).f = aglVar.leftMargin;
                            qe3.L(4).f = aglVar.rightMargin;
                        } else {
                            qe3.Q(3);
                            qe3.D(0);
                        }
                    } else {
                        qe3.Q(1);
                        qe3.D(aglVar.width);
                        if (aglVar.width == -2) {
                            qe3.Q(2);
                        }
                    }
                    if (!aglVar.aa) {
                        if (aglVar.height == -1) {
                            if (aglVar.W) {
                                qe3.R(3);
                            } else {
                                qe3.R(4);
                            }
                            qe3.L(3).f = aglVar.topMargin;
                            qe3.L(5).f = aglVar.bottomMargin;
                        } else {
                            qe3.R(3);
                            qe3.y(0);
                        }
                    } else {
                        qe3.R(1);
                        qe3.y(aglVar.height);
                        if (aglVar.height == -2) {
                            qe3.R(2);
                        }
                    }
                    String str8 = aglVar.F;
                    if (str8 == null || str8.length() == 0) {
                        qe3.W = f3;
                    } else {
                        int length2 = str8.length();
                        int indexOf3 = str8.indexOf(44);
                        if (indexOf3 <= 0 || indexOf3 >= length2 - 1) {
                            i3 = 0;
                            i4 = -1;
                        } else {
                            String substring = str8.substring(0, indexOf3);
                            if (substring.equalsIgnoreCase("W")) {
                                i4 = 0;
                            } else {
                                i4 = substring.equalsIgnoreCase("H") ? 1 : -1;
                            }
                            i3 = indexOf3 + 1;
                        }
                        int indexOf4 = str8.indexOf(58);
                        if (indexOf4 < 0 || indexOf4 >= length2 - 1) {
                            String substring2 = str8.substring(i3);
                            if (substring2.length() > 0) {
                                parseFloat = Float.parseFloat(substring2);
                            }
                            parseFloat = 0.0f;
                        } else {
                            String substring3 = str8.substring(i3, indexOf4);
                            String substring4 = str8.substring(indexOf4 + 1);
                            if (substring3.length() > 0 && substring4.length() > 0) {
                                try {
                                    float parseFloat2 = Float.parseFloat(substring3);
                                    float parseFloat3 = Float.parseFloat(substring4);
                                    if (parseFloat2 > f3 && parseFloat3 > f3) {
                                        if (i4 == 1) {
                                            parseFloat = Math.abs(parseFloat3 / parseFloat2);
                                        } else {
                                            parseFloat = Math.abs(parseFloat2 / parseFloat3);
                                        }
                                    }
                                } catch (NumberFormatException unused3) {
                                }
                            }
                            parseFloat = 0.0f;
                        }
                        if (parseFloat > f3) {
                            qe3.W = parseFloat;
                            qe3.X = i4;
                        }
                    }
                    float f8 = aglVar.G;
                    float[] fArr = qe3.ak;
                    fArr[0] = f8;
                    fArr[1] = aglVar.H;
                    qe3.ai = aglVar.I;
                    qe3.aj = aglVar.f49J;
                    int i47 = aglVar.Y;
                    if (i47 >= 0 && i47 <= 3) {
                        qe3.r = i47;
                    }
                    int i48 = aglVar.K;
                    int i49 = aglVar.M;
                    int i50 = aglVar.O;
                    float f9 = aglVar.Q;
                    qe3.s = i48;
                    qe3.v = i49;
                    if (i50 == Integer.MAX_VALUE) {
                        i50 = 0;
                    }
                    qe3.w = i50;
                    qe3.x = f9;
                    if (f9 > f3 && f9 < 1.0f && i48 == 0) {
                        qe3.s = 2;
                    }
                    int i51 = aglVar.L;
                    int i52 = aglVar.N;
                    int i53 = aglVar.P;
                    float f10 = aglVar.R;
                    qe3.t = i51;
                    qe3.y = i52;
                    if (i53 == Integer.MAX_VALUE) {
                        i53 = 0;
                    }
                    qe3.z = i53;
                    qe3.A = f10;
                    if (f10 > f3 && f10 < 1.0f && i51 == 0) {
                        qe3.t = 2;
                    }
                }
            }
        }
    }

    private final void h(afk afkVar, agl aglVar, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.a.get(i);
        afk afkVar2 = (afk) sparseArray.get(i);
        if (afkVar2 == null || view == null || !(view.getLayoutParams() instanceof agl)) {
            return;
        }
        aglVar.ab = true;
        if (i2 == 6) {
            agl aglVar2 = (agl) view.getLayoutParams();
            aglVar2.ab = true;
            aglVar2.aq.F = true;
        }
        afkVar.L(6).j(afkVar2.L(i2), aglVar.C, aglVar.B);
        afkVar.F = true;
        afkVar.L(3).d();
        afkVar.L(5).d();
    }

    protected final boolean c() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof agl;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int parseInt4 = Integer.parseInt(split[3]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = i4 + ((int) ((parseInt4 / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        f();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return d();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new agl(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            agl aglVar = (agl) childAt.getLayoutParams();
            afk afkVar = aglVar.aq;
            if (childAt.getVisibility() == 8 && !aglVar.ac && !aglVar.ad) {
                boolean z2 = aglVar.af;
                if (!isInEditMode) {
                    continue;
                }
            }
            boolean z3 = aglVar.ae;
            int k = afkVar.k();
            int l = afkVar.l();
            childAt.layout(k, l, afkVar.j() + k, afkVar.h() + l);
            if (childAt instanceof agx) {
                throw null;
            }
        }
        int size = this.b.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0799  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0219  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        afk qe = qe(view);
        if ((view instanceof Guideline) && !(qe instanceof afn)) {
            agl aglVar = (agl) view.getLayoutParams();
            aglVar.aq = new afn();
            aglVar.ac = true;
            ((afn) aglVar.aq).c(aglVar.U);
        }
        if (view instanceof agj) {
            agj agjVar = (agj) view;
            agjVar.f();
            ((agl) view.getLayoutParams()).ad = true;
            if (!this.b.contains(agjVar)) {
                this.b.add(agjVar);
            }
        }
        this.a.put(view.getId(), view);
        this.e = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.a.remove(view.getId());
        this.c.Y(qe(view));
        this.b.remove(view);
        this.e = true;
    }

    public final View qd(int i) {
        return (View) this.a.get(i);
    }

    public final afk qe(View view) {
        if (view == this) {
            return this.c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof agl) {
            return ((agl) view.getLayoutParams()).aq;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof agl) {
            return ((agl) view.getLayoutParams()).aq;
        }
        return null;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        f();
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        this.a.remove(getId());
        super.setId(i);
        this.a.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new agl(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new afl();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.l = null;
        this.m = -1;
        this.g = new HashMap();
        this.n = new SparseArray();
        this.h = new agm(this, this);
        e(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new afl();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.l = null;
        this.m = -1;
        this.g = new HashMap();
        this.n = new SparseArray();
        this.h = new agm(this, this);
        e(attributeSet, i, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.a = new SparseArray();
        this.b = new ArrayList(4);
        this.c = new afl();
        this.i = 0;
        this.d = 0;
        this.j = Integer.MAX_VALUE;
        this.k = Integer.MAX_VALUE;
        this.e = true;
        this.f = 257;
        this.l = null;
        this.m = -1;
        this.g = new HashMap();
        this.n = new SparseArray();
        this.h = new agm(this, this);
        e(attributeSet, i, i2);
    }
}
