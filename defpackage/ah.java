package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ah {
    private static final int[] b = {0, 4, 8};
    private static final SparseIntArray c;
    public final HashMap a = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        int[] iArr = ai.a;
        sparseIntArray.append(84, 25);
        sparseIntArray.append(85, 26);
        sparseIntArray.append(87, 29);
        sparseIntArray.append(88, 30);
        sparseIntArray.append(94, 36);
        sparseIntArray.append(93, 35);
        sparseIntArray.append(66, 4);
        sparseIntArray.append(65, 3);
        sparseIntArray.append(61, 1);
        sparseIntArray.append(102, 6);
        sparseIntArray.append(103, 7);
        sparseIntArray.append(73, 17);
        sparseIntArray.append(74, 18);
        sparseIntArray.append(75, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(89, 32);
        sparseIntArray.append(90, 33);
        sparseIntArray.append(72, 10);
        sparseIntArray.append(71, 9);
        sparseIntArray.append(107, 13);
        sparseIntArray.append(110, 16);
        sparseIntArray.append(108, 14);
        sparseIntArray.append(105, 11);
        sparseIntArray.append(109, 15);
        sparseIntArray.append(106, 12);
        sparseIntArray.append(97, 40);
        sparseIntArray.append(82, 39);
        sparseIntArray.append(81, 41);
        sparseIntArray.append(96, 42);
        sparseIntArray.append(80, 20);
        sparseIntArray.append(95, 37);
        sparseIntArray.append(70, 5);
        sparseIntArray.append(83, 60);
        sparseIntArray.append(92, 60);
        sparseIntArray.append(86, 60);
        sparseIntArray.append(64, 60);
        sparseIntArray.append(60, 60);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(25, 31);
        sparseIntArray.append(26, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(15, 43);
        sparseIntArray.append(28, 44);
        sparseIntArray.append(23, 45);
        sparseIntArray.append(24, 46);
        sparseIntArray.append(20, 47);
        sparseIntArray.append(21, 48);
        sparseIntArray.append(16, 49);
        sparseIntArray.append(17, 50);
        sparseIntArray.append(18, 51);
        sparseIntArray.append(19, 52);
        sparseIntArray.append(27, 53);
        sparseIntArray.append(98, 54);
        sparseIntArray.append(76, 55);
        sparseIntArray.append(99, 56);
        sparseIntArray.append(77, 57);
        sparseIntArray.append(100, 58);
        sparseIntArray.append(78, 59);
        sparseIntArray.append(1, 38);
    }

    private static int i(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    private static final String j(int i) {
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? "end" : "start" : "baseline" : "bottom" : "top";
    }

    public final ag a(int i) {
        HashMap hashMap = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.a.put(valueOf, new ag());
        }
        return (ag) this.a.get(valueOf);
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.c = null;
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap hashMap = this.a;
            Integer valueOf = Integer.valueOf(id);
            if (hashMap.containsKey(valueOf)) {
                hashSet.remove(valueOf);
                ag agVar = (ag) this.a.get(valueOf);
                af afVar = (af) childAt.getLayoutParams();
                agVar.a(afVar);
                childAt.setLayoutParams(afVar);
                childAt.setVisibility(agVar.G);
                childAt.setAlpha(agVar.R);
                childAt.setRotationX(agVar.U);
                childAt.setRotationY(agVar.V);
                childAt.setScaleX(agVar.W);
                childAt.setScaleY(agVar.X);
                childAt.setPivotX(agVar.Y);
                childAt.setPivotY(agVar.Z);
                childAt.setTranslationX(agVar.aa);
                childAt.setTranslationY(agVar.ab);
                childAt.setTranslationZ(agVar.ac);
                if (agVar.S) {
                    childAt.setElevation(agVar.T);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            ag agVar2 = (ag) this.a.get(num);
            if (agVar2.a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                af b2 = ConstraintLayout.b();
                agVar2.a(b2);
                constraintLayout.addView(guideline, b2);
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            af afVar = (af) childAt.getLayoutParams();
            int id = childAt.getId();
            HashMap hashMap = this.a;
            Integer valueOf = Integer.valueOf(id);
            if (!hashMap.containsKey(valueOf)) {
                this.a.put(valueOf, new ag());
            }
            ag agVar = (ag) this.a.get(valueOf);
            agVar.d = id;
            agVar.h = afVar.d;
            agVar.i = afVar.e;
            agVar.j = afVar.f;
            agVar.k = afVar.g;
            agVar.l = afVar.h;
            agVar.m = afVar.i;
            agVar.n = afVar.j;
            agVar.o = afVar.k;
            agVar.p = afVar.l;
            agVar.q = afVar.m;
            agVar.r = afVar.n;
            agVar.s = afVar.o;
            agVar.t = afVar.p;
            agVar.u = afVar.w;
            agVar.v = afVar.x;
            agVar.w = afVar.y;
            agVar.x = afVar.K;
            agVar.y = afVar.L;
            agVar.z = afVar.M;
            agVar.g = afVar.c;
            agVar.e = afVar.a;
            agVar.f = afVar.b;
            agVar.b = afVar.width;
            agVar.c = afVar.height;
            agVar.A = afVar.leftMargin;
            agVar.B = afVar.rightMargin;
            agVar.C = afVar.topMargin;
            agVar.D = afVar.bottomMargin;
            agVar.N = afVar.B;
            agVar.O = afVar.A;
            agVar.Q = afVar.D;
            agVar.P = afVar.C;
            agVar.ad = afVar.E;
            agVar.ae = afVar.F;
            agVar.af = afVar.I;
            agVar.ag = afVar.f41J;
            agVar.ah = afVar.G;
            agVar.ai = afVar.H;
            agVar.E = afVar.getMarginEnd();
            agVar.F = afVar.getMarginStart();
            agVar.G = childAt.getVisibility();
            agVar.R = childAt.getAlpha();
            agVar.U = childAt.getRotationX();
            agVar.V = childAt.getRotationY();
            agVar.W = childAt.getScaleX();
            agVar.X = childAt.getScaleY();
            agVar.Y = childAt.getPivotX();
            agVar.Z = childAt.getPivotY();
            agVar.aa = childAt.getTranslationX();
            agVar.ab = childAt.getTranslationY();
            agVar.ac = childAt.getTranslationZ();
            if (agVar.S) {
                agVar.T = childAt.getElevation();
            }
        }
    }

    public final void e(int i, int i2, int i3, int i4) {
        HashMap hashMap = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.a.put(valueOf, new ag());
        }
        ag agVar = (ag) this.a.get(valueOf);
        if (i2 == 3) {
            if (i4 == 3) {
                agVar.l = i3;
                agVar.m = -1;
                agVar.p = -1;
                return;
            } else if (i4 == 4) {
                agVar.m = i3;
                agVar.l = -1;
                agVar.p = -1;
                return;
            } else {
                throw new IllegalArgumentException("right to " + j(i4) + " undefined");
            }
        }
        if (i2 == 4) {
            if (i4 == 4) {
                agVar.o = i3;
                agVar.n = -1;
                agVar.p = -1;
                return;
            } else if (i4 == 3) {
                agVar.n = i3;
                agVar.o = -1;
                agVar.p = -1;
                return;
            } else {
                throw new IllegalArgumentException("right to " + j(i4) + " undefined");
            }
        }
        if (i2 == 5) {
            if (i4 == 5) {
                agVar.p = i3;
                agVar.o = -1;
                agVar.n = -1;
                agVar.l = -1;
                agVar.m = -1;
                return;
            }
            throw new IllegalArgumentException("right to " + j(i4) + " undefined");
        }
        if (i2 != 6) {
            if (i4 == 7) {
                agVar.t = i3;
                agVar.s = -1;
                return;
            } else if (i4 == 6) {
                agVar.s = i3;
                agVar.t = -1;
                return;
            } else {
                throw new IllegalArgumentException("right to " + j(i4) + " undefined");
            }
        }
        if (i4 == 6) {
            agVar.r = i3;
            agVar.q = -1;
        } else if (i4 == 7) {
            agVar.q = i3;
            agVar.r = -1;
        } else {
            throw new IllegalArgumentException("right to " + j(i4) + " undefined");
        }
    }

    public final void f(int i, int i2, int i3, int i4, int i5) {
        HashMap hashMap = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (!hashMap.containsKey(valueOf)) {
            this.a.put(valueOf, new ag());
        }
        ag agVar = (ag) this.a.get(valueOf);
        if (i2 == 4) {
            if (i4 == 4) {
                agVar.o = i3;
                agVar.n = -1;
                agVar.p = -1;
                agVar.D = i5;
                return;
            }
            throw new IllegalArgumentException("right to " + j(i4) + " undefined");
        }
        if (i2 == 5) {
            if (i4 == 5) {
                agVar.p = i3;
                agVar.o = -1;
                agVar.n = -1;
                agVar.l = -1;
                agVar.m = -1;
                return;
            }
            throw new IllegalArgumentException("right to " + j(i4) + " undefined");
        }
        if (i2 != 6) {
            if (i4 == 7) {
                agVar.t = i3;
                agVar.s = -1;
            } else if (i4 == 6) {
                agVar.s = i3;
                agVar.t = -1;
            } else {
                throw new IllegalArgumentException("right to " + j(i4) + " undefined");
            }
            agVar.E = i5;
            return;
        }
        if (i4 == 6) {
            agVar.r = i3;
            agVar.q = -1;
        } else if (i4 == 7) {
            agVar.q = i3;
            agVar.r = -1;
        } else {
            throw new IllegalArgumentException("right to " + j(i4) + " undefined");
        }
        agVar.F = i5;
    }

    public final void g(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                    ag agVar = new ag();
                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, ai.b);
                    int indexCount = obtainStyledAttributes.getIndexCount();
                    for (int i2 = 0; i2 < indexCount; i2++) {
                        int index = obtainStyledAttributes.getIndex(i2);
                        SparseIntArray sparseIntArray = c;
                        int i3 = sparseIntArray.get(index);
                        if (i3 == 60) {
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        } else {
                            switch (i3) {
                                case 1:
                                    agVar.p = i(obtainStyledAttributes, index, agVar.p);
                                    break;
                                case 2:
                                    agVar.D = obtainStyledAttributes.getDimensionPixelSize(index, agVar.D);
                                    break;
                                case 3:
                                    agVar.o = i(obtainStyledAttributes, index, agVar.o);
                                    break;
                                case 4:
                                    agVar.n = i(obtainStyledAttributes, index, agVar.n);
                                    break;
                                case 5:
                                    agVar.w = obtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    agVar.x = obtainStyledAttributes.getDimensionPixelOffset(index, agVar.x);
                                    break;
                                case 7:
                                    agVar.y = obtainStyledAttributes.getDimensionPixelOffset(index, agVar.y);
                                    break;
                                case 8:
                                    agVar.E = obtainStyledAttributes.getDimensionPixelSize(index, agVar.E);
                                    break;
                                case 9:
                                    agVar.n = i(obtainStyledAttributes, index, agVar.t);
                                    break;
                                case 10:
                                    agVar.s = i(obtainStyledAttributes, index, agVar.s);
                                    break;
                                case 11:
                                    agVar.K = obtainStyledAttributes.getDimensionPixelSize(index, agVar.K);
                                    break;
                                case 12:
                                    agVar.L = obtainStyledAttributes.getDimensionPixelSize(index, agVar.L);
                                    break;
                                case 13:
                                    agVar.H = obtainStyledAttributes.getDimensionPixelSize(index, agVar.H);
                                    break;
                                case 14:
                                    agVar.f47J = obtainStyledAttributes.getDimensionPixelSize(index, agVar.f47J);
                                    break;
                                case 15:
                                    agVar.M = obtainStyledAttributes.getDimensionPixelSize(index, agVar.M);
                                    break;
                                case 16:
                                    agVar.I = obtainStyledAttributes.getDimensionPixelSize(index, agVar.I);
                                    break;
                                case 17:
                                    agVar.e = obtainStyledAttributes.getDimensionPixelOffset(index, agVar.e);
                                    break;
                                case 18:
                                    agVar.f = obtainStyledAttributes.getDimensionPixelOffset(index, agVar.f);
                                    break;
                                case 19:
                                    agVar.g = obtainStyledAttributes.getFloat(index, agVar.g);
                                    break;
                                case 20:
                                    agVar.u = obtainStyledAttributes.getFloat(index, agVar.u);
                                    break;
                                case 21:
                                    agVar.c = obtainStyledAttributes.getLayoutDimension(index, agVar.c);
                                    break;
                                case 22:
                                    agVar.G = obtainStyledAttributes.getInt(index, agVar.G);
                                    agVar.G = b[agVar.G];
                                    break;
                                case 23:
                                    agVar.b = obtainStyledAttributes.getLayoutDimension(index, agVar.b);
                                    break;
                                case 24:
                                    agVar.A = obtainStyledAttributes.getDimensionPixelSize(index, agVar.A);
                                    break;
                                case 25:
                                    agVar.h = i(obtainStyledAttributes, index, agVar.h);
                                    break;
                                case 26:
                                    agVar.i = i(obtainStyledAttributes, index, agVar.i);
                                    break;
                                case 27:
                                    agVar.z = obtainStyledAttributes.getInt(index, agVar.z);
                                    break;
                                case 28:
                                    agVar.B = obtainStyledAttributes.getDimensionPixelSize(index, agVar.B);
                                    break;
                                case 29:
                                    agVar.j = i(obtainStyledAttributes, index, agVar.j);
                                    break;
                                case 30:
                                    agVar.k = i(obtainStyledAttributes, index, agVar.k);
                                    break;
                                case 31:
                                    agVar.F = obtainStyledAttributes.getDimensionPixelSize(index, agVar.F);
                                    break;
                                case 32:
                                    agVar.q = i(obtainStyledAttributes, index, agVar.q);
                                    break;
                                case 33:
                                    agVar.r = i(obtainStyledAttributes, index, agVar.r);
                                    break;
                                case 34:
                                    agVar.C = obtainStyledAttributes.getDimensionPixelSize(index, agVar.C);
                                    break;
                                case 35:
                                    agVar.m = i(obtainStyledAttributes, index, agVar.m);
                                    break;
                                case 36:
                                    agVar.l = i(obtainStyledAttributes, index, agVar.l);
                                    break;
                                case 37:
                                    agVar.v = obtainStyledAttributes.getFloat(index, agVar.v);
                                    break;
                                case 38:
                                    agVar.d = obtainStyledAttributes.getResourceId(index, agVar.d);
                                    break;
                                case 39:
                                    agVar.O = obtainStyledAttributes.getFloat(index, agVar.O);
                                    break;
                                case 40:
                                    agVar.N = obtainStyledAttributes.getFloat(index, agVar.N);
                                    break;
                                case 41:
                                    agVar.P = obtainStyledAttributes.getInt(index, agVar.P);
                                    break;
                                case 42:
                                    agVar.Q = obtainStyledAttributes.getInt(index, agVar.Q);
                                    break;
                                case 43:
                                    agVar.R = obtainStyledAttributes.getFloat(index, agVar.R);
                                    break;
                                case 44:
                                    agVar.S = true;
                                    agVar.T = obtainStyledAttributes.getFloat(index, agVar.T);
                                    break;
                                case 45:
                                    agVar.U = obtainStyledAttributes.getFloat(index, agVar.U);
                                    break;
                                case 46:
                                    agVar.V = obtainStyledAttributes.getFloat(index, agVar.V);
                                    break;
                                case 47:
                                    agVar.W = obtainStyledAttributes.getFloat(index, agVar.W);
                                    break;
                                case 48:
                                    agVar.X = obtainStyledAttributes.getFloat(index, agVar.X);
                                    break;
                                case 49:
                                    agVar.Y = obtainStyledAttributes.getFloat(index, agVar.Y);
                                    break;
                                case 50:
                                    agVar.Z = obtainStyledAttributes.getFloat(index, agVar.Z);
                                    break;
                                case 51:
                                    agVar.aa = obtainStyledAttributes.getFloat(index, agVar.aa);
                                    break;
                                case 52:
                                    agVar.ab = obtainStyledAttributes.getFloat(index, agVar.ab);
                                    break;
                                case 53:
                                    agVar.ac = obtainStyledAttributes.getFloat(index, agVar.ac);
                                    break;
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                        }
                    }
                    obtainStyledAttributes.recycle();
                    if (name.equalsIgnoreCase("Guideline")) {
                        agVar.a = true;
                    }
                    this.a.put(Integer.valueOf(agVar.d), agVar);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void h(int i, int i2, int i3) {
        ag a = a(i);
        if (i2 == 3) {
            a.C = i3;
            return;
        }
        if (i2 == 4) {
            a.D = i3;
        } else {
            if (i2 == 5) {
                throw new IllegalArgumentException("baseline does not support margins");
            }
            if (i2 != 6) {
                a.E = i3;
            } else {
                a.F = i3;
            }
        }
    }
}
