package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agv {
    public static final int[] a = {0, 4, 8};
    private static final SparseIntArray c;
    private static final SparseIntArray d;
    private final HashMap e = new HashMap();
    public final HashMap b = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        int[] iArr = agz.a;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(101, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(105, 13);
        sparseIntArray.append(108, 16);
        sparseIntArray.append(106, 14);
        sparseIntArray.append(103, 11);
        sparseIntArray.append(107, 15);
        sparseIntArray.append(104, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(120, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(121, 67);
        sparseIntArray.append(112, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(111, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(110, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(113, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(122, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(115, 82);
        sparseIntArray.append(119, 83);
        sparseIntArray.append(118, 84);
        sparseIntArray.append(117, 85);
        sparseIntArray.append(116, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(104, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(105, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(106, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(103, 83);
        sparseIntArray2.append(102, 84);
        sparseIntArray2.append(101, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r9 == (-1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agv.e(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(agl aglVar, String str) {
        int i;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf <= 0 || indexOf >= length - 1) {
                i = -1;
            } else {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i2 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                int i3 = i2;
                i2 = indexOf + 1;
                i = i3;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aglVar.F = str;
    }

    public static final int[] g(View view, String str) {
        int length;
        int i;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = split.length;
            if (i2 >= length) {
                break;
            }
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = agy.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0) {
                if (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view.getParent();
                    if ((trim instanceof String) && (hashMap = constraintLayout.g) != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.g.get(trim);
                    }
                    if (obj != null && (obj instanceof Integer)) {
                        i = ((Integer) obj).intValue();
                    }
                }
                i = 0;
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private static final agq h(Context context, AttributeSet attributeSet, boolean z) {
        agq agqVar = new agq();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? agz.c : agz.a);
        if (z) {
            i(agqVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index != 1 && index != 23 && index != 24) {
                    agqVar.c.b = true;
                    agqVar.d.c = true;
                    agqVar.b.a = true;
                    agqVar.e.b = true;
                }
                SparseIntArray sparseIntArray = c;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        agr agrVar = agqVar.d;
                        agrVar.q = a(obtainStyledAttributes, index, agrVar.q);
                        break;
                    case 2:
                        agr agrVar2 = agqVar.d;
                        agrVar2.f50J = obtainStyledAttributes.getDimensionPixelSize(index, agrVar2.f50J);
                        break;
                    case 3:
                        agr agrVar3 = agqVar.d;
                        agrVar3.p = a(obtainStyledAttributes, index, agrVar3.p);
                        break;
                    case 4:
                        agr agrVar4 = agqVar.d;
                        agrVar4.o = a(obtainStyledAttributes, index, agrVar4.o);
                        break;
                    case 5:
                        agqVar.d.z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        agr agrVar5 = agqVar.d;
                        agrVar5.D = obtainStyledAttributes.getDimensionPixelOffset(index, agrVar5.D);
                        break;
                    case 7:
                        agr agrVar6 = agqVar.d;
                        agrVar6.E = obtainStyledAttributes.getDimensionPixelOffset(index, agrVar6.E);
                        break;
                    case 8:
                        agr agrVar7 = agqVar.d;
                        agrVar7.K = obtainStyledAttributes.getDimensionPixelSize(index, agrVar7.K);
                        break;
                    case 9:
                        agr agrVar8 = agqVar.d;
                        agrVar8.w = a(obtainStyledAttributes, index, agrVar8.w);
                        break;
                    case 10:
                        agr agrVar9 = agqVar.d;
                        agrVar9.v = a(obtainStyledAttributes, index, agrVar9.v);
                        break;
                    case 11:
                        agr agrVar10 = agqVar.d;
                        agrVar10.Q = obtainStyledAttributes.getDimensionPixelSize(index, agrVar10.Q);
                        break;
                    case 12:
                        agr agrVar11 = agqVar.d;
                        agrVar11.R = obtainStyledAttributes.getDimensionPixelSize(index, agrVar11.R);
                        break;
                    case 13:
                        agr agrVar12 = agqVar.d;
                        agrVar12.N = obtainStyledAttributes.getDimensionPixelSize(index, agrVar12.N);
                        break;
                    case 14:
                        agr agrVar13 = agqVar.d;
                        agrVar13.P = obtainStyledAttributes.getDimensionPixelSize(index, agrVar13.P);
                        break;
                    case 15:
                        agr agrVar14 = agqVar.d;
                        agrVar14.S = obtainStyledAttributes.getDimensionPixelSize(index, agrVar14.S);
                        break;
                    case 16:
                        agr agrVar15 = agqVar.d;
                        agrVar15.O = obtainStyledAttributes.getDimensionPixelSize(index, agrVar15.O);
                        break;
                    case 17:
                        agr agrVar16 = agqVar.d;
                        agrVar16.f = obtainStyledAttributes.getDimensionPixelOffset(index, agrVar16.f);
                        break;
                    case 18:
                        agr agrVar17 = agqVar.d;
                        agrVar17.g = obtainStyledAttributes.getDimensionPixelOffset(index, agrVar17.g);
                        break;
                    case 19:
                        agr agrVar18 = agqVar.d;
                        agrVar18.h = obtainStyledAttributes.getFloat(index, agrVar18.h);
                        break;
                    case 20:
                        agr agrVar19 = agqVar.d;
                        agrVar19.x = obtainStyledAttributes.getFloat(index, agrVar19.x);
                        break;
                    case 21:
                        agr agrVar20 = agqVar.d;
                        agrVar20.e = obtainStyledAttributes.getLayoutDimension(index, agrVar20.e);
                        break;
                    case 22:
                        agt agtVar = agqVar.b;
                        agtVar.b = obtainStyledAttributes.getInt(index, agtVar.b);
                        agqVar.b.b = a[agqVar.b.b];
                        break;
                    case 23:
                        agr agrVar21 = agqVar.d;
                        agrVar21.d = obtainStyledAttributes.getLayoutDimension(index, agrVar21.d);
                        break;
                    case 24:
                        agr agrVar22 = agqVar.d;
                        agrVar22.G = obtainStyledAttributes.getDimensionPixelSize(index, agrVar22.G);
                        break;
                    case 25:
                        agr agrVar23 = agqVar.d;
                        agrVar23.i = a(obtainStyledAttributes, index, agrVar23.i);
                        break;
                    case 26:
                        agr agrVar24 = agqVar.d;
                        agrVar24.j = a(obtainStyledAttributes, index, agrVar24.j);
                        break;
                    case 27:
                        agr agrVar25 = agqVar.d;
                        agrVar25.F = obtainStyledAttributes.getInt(index, agrVar25.F);
                        break;
                    case 28:
                        agr agrVar26 = agqVar.d;
                        agrVar26.H = obtainStyledAttributes.getDimensionPixelSize(index, agrVar26.H);
                        break;
                    case 29:
                        agr agrVar27 = agqVar.d;
                        agrVar27.k = a(obtainStyledAttributes, index, agrVar27.k);
                        break;
                    case 30:
                        agr agrVar28 = agqVar.d;
                        agrVar28.l = a(obtainStyledAttributes, index, agrVar28.l);
                        break;
                    case 31:
                        agr agrVar29 = agqVar.d;
                        agrVar29.L = obtainStyledAttributes.getDimensionPixelSize(index, agrVar29.L);
                        break;
                    case 32:
                        agr agrVar30 = agqVar.d;
                        agrVar30.t = a(obtainStyledAttributes, index, agrVar30.t);
                        break;
                    case 33:
                        agr agrVar31 = agqVar.d;
                        agrVar31.u = a(obtainStyledAttributes, index, agrVar31.u);
                        break;
                    case 34:
                        agr agrVar32 = agqVar.d;
                        agrVar32.I = obtainStyledAttributes.getDimensionPixelSize(index, agrVar32.I);
                        break;
                    case 35:
                        agr agrVar33 = agqVar.d;
                        agrVar33.n = a(obtainStyledAttributes, index, agrVar33.n);
                        break;
                    case 36:
                        agr agrVar34 = agqVar.d;
                        agrVar34.m = a(obtainStyledAttributes, index, agrVar34.m);
                        break;
                    case 37:
                        agr agrVar35 = agqVar.d;
                        agrVar35.y = obtainStyledAttributes.getFloat(index, agrVar35.y);
                        break;
                    case 38:
                        agqVar.a = obtainStyledAttributes.getResourceId(index, agqVar.a);
                        break;
                    case 39:
                        agr agrVar36 = agqVar.d;
                        agrVar36.V = obtainStyledAttributes.getFloat(index, agrVar36.V);
                        break;
                    case 40:
                        agr agrVar37 = agqVar.d;
                        agrVar37.U = obtainStyledAttributes.getFloat(index, agrVar37.U);
                        break;
                    case 41:
                        agr agrVar38 = agqVar.d;
                        agrVar38.W = obtainStyledAttributes.getInt(index, agrVar38.W);
                        break;
                    case 42:
                        agr agrVar39 = agqVar.d;
                        agrVar39.X = obtainStyledAttributes.getInt(index, agrVar39.X);
                        break;
                    case 43:
                        agt agtVar2 = agqVar.b;
                        agtVar2.d = obtainStyledAttributes.getFloat(index, agtVar2.d);
                        break;
                    case 44:
                        agu aguVar = agqVar.e;
                        aguVar.n = true;
                        aguVar.o = obtainStyledAttributes.getDimension(index, aguVar.o);
                        break;
                    case 45:
                        agu aguVar2 = agqVar.e;
                        aguVar2.d = obtainStyledAttributes.getFloat(index, aguVar2.d);
                        break;
                    case 46:
                        agu aguVar3 = agqVar.e;
                        aguVar3.e = obtainStyledAttributes.getFloat(index, aguVar3.e);
                        break;
                    case 47:
                        agu aguVar4 = agqVar.e;
                        aguVar4.f = obtainStyledAttributes.getFloat(index, aguVar4.f);
                        break;
                    case 48:
                        agu aguVar5 = agqVar.e;
                        aguVar5.g = obtainStyledAttributes.getFloat(index, aguVar5.g);
                        break;
                    case 49:
                        agu aguVar6 = agqVar.e;
                        aguVar6.h = obtainStyledAttributes.getDimension(index, aguVar6.h);
                        break;
                    case 50:
                        agu aguVar7 = agqVar.e;
                        aguVar7.i = obtainStyledAttributes.getDimension(index, aguVar7.i);
                        break;
                    case 51:
                        agu aguVar8 = agqVar.e;
                        aguVar8.k = obtainStyledAttributes.getDimension(index, aguVar8.k);
                        break;
                    case 52:
                        agu aguVar9 = agqVar.e;
                        aguVar9.l = obtainStyledAttributes.getDimension(index, aguVar9.l);
                        break;
                    case 53:
                        agu aguVar10 = agqVar.e;
                        aguVar10.m = obtainStyledAttributes.getDimension(index, aguVar10.m);
                        break;
                    case 54:
                        agr agrVar40 = agqVar.d;
                        agrVar40.Y = obtainStyledAttributes.getInt(index, agrVar40.Y);
                        break;
                    case 55:
                        agr agrVar41 = agqVar.d;
                        agrVar41.Z = obtainStyledAttributes.getInt(index, agrVar41.Z);
                        break;
                    case 56:
                        agr agrVar42 = agqVar.d;
                        agrVar42.aa = obtainStyledAttributes.getDimensionPixelSize(index, agrVar42.aa);
                        break;
                    case 57:
                        agr agrVar43 = agqVar.d;
                        agrVar43.ab = obtainStyledAttributes.getDimensionPixelSize(index, agrVar43.ab);
                        break;
                    case 58:
                        agr agrVar44 = agqVar.d;
                        agrVar44.ac = obtainStyledAttributes.getDimensionPixelSize(index, agrVar44.ac);
                        break;
                    case 59:
                        agr agrVar45 = agqVar.d;
                        agrVar45.ad = obtainStyledAttributes.getDimensionPixelSize(index, agrVar45.ad);
                        break;
                    case 60:
                        agu aguVar11 = agqVar.e;
                        aguVar11.c = obtainStyledAttributes.getFloat(index, aguVar11.c);
                        break;
                    case 61:
                        agr agrVar46 = agqVar.d;
                        agrVar46.A = a(obtainStyledAttributes, index, agrVar46.A);
                        break;
                    case 62:
                        agr agrVar47 = agqVar.d;
                        agrVar47.B = obtainStyledAttributes.getDimensionPixelSize(index, agrVar47.B);
                        break;
                    case 63:
                        agr agrVar48 = agqVar.d;
                        agrVar48.C = obtainStyledAttributes.getFloat(index, agrVar48.C);
                        break;
                    case 64:
                        ags agsVar = agqVar.c;
                        agsVar.c = a(obtainStyledAttributes, index, agsVar.c);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            agqVar.c.e = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            agqVar.c.e = afg.a[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 66:
                        agqVar.c.g = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        ags agsVar2 = agqVar.c;
                        agsVar2.j = obtainStyledAttributes.getFloat(index, agsVar2.j);
                        break;
                    case 68:
                        agt agtVar3 = agqVar.b;
                        agtVar3.e = obtainStyledAttributes.getFloat(index, agtVar3.e);
                        break;
                    case 69:
                        agqVar.d.ae = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        agqVar.d.af = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        agr agrVar49 = agqVar.d;
                        agrVar49.ag = obtainStyledAttributes.getInt(index, agrVar49.ag);
                        break;
                    case 73:
                        agr agrVar50 = agqVar.d;
                        agrVar50.ah = obtainStyledAttributes.getDimensionPixelSize(index, agrVar50.ah);
                        break;
                    case 74:
                        agqVar.d.ak = obtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        agr agrVar51 = agqVar.d;
                        agrVar51.ao = obtainStyledAttributes.getBoolean(index, agrVar51.ao);
                        break;
                    case 76:
                        ags agsVar3 = agqVar.c;
                        agsVar3.f = obtainStyledAttributes.getInt(index, agsVar3.f);
                        break;
                    case 77:
                        agqVar.d.al = obtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        agt agtVar4 = agqVar.b;
                        agtVar4.c = obtainStyledAttributes.getInt(index, agtVar4.c);
                        break;
                    case 79:
                        ags agsVar4 = agqVar.c;
                        agsVar4.h = obtainStyledAttributes.getFloat(index, agsVar4.h);
                        break;
                    case 80:
                        agr agrVar52 = agqVar.d;
                        agrVar52.am = obtainStyledAttributes.getBoolean(index, agrVar52.am);
                        break;
                    case 81:
                        agr agrVar53 = agqVar.d;
                        agrVar53.an = obtainStyledAttributes.getBoolean(index, agrVar53.an);
                        break;
                    case 82:
                        ags agsVar5 = agqVar.c;
                        agsVar5.d = obtainStyledAttributes.getInteger(index, agsVar5.d);
                        break;
                    case 83:
                        agu aguVar12 = agqVar.e;
                        aguVar12.j = a(obtainStyledAttributes, index, aguVar12.j);
                        break;
                    case 84:
                        ags agsVar6 = agqVar.c;
                        agsVar6.l = obtainStyledAttributes.getInteger(index, agsVar6.l);
                        break;
                    case 85:
                        ags agsVar7 = agqVar.c;
                        agsVar7.k = obtainStyledAttributes.getFloat(index, agsVar7.k);
                        break;
                    case 86:
                        TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                        if (peekValue.type == 1) {
                            agqVar.c.o = obtainStyledAttributes.getResourceId(index, -1);
                            ags agsVar8 = agqVar.c;
                            if (agsVar8.o != -1) {
                                agsVar8.n = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (peekValue.type == 3) {
                            agqVar.c.m = obtainStyledAttributes.getString(index);
                            if (agqVar.c.m.indexOf("/") > 0) {
                                agqVar.c.o = obtainStyledAttributes.getResourceId(index, -1);
                                agqVar.c.n = -2;
                                break;
                            } else {
                                agqVar.c.n = -1;
                                break;
                            }
                        } else {
                            ags agsVar9 = agqVar.c;
                            agsVar9.n = obtainStyledAttributes.getInteger(index, agsVar9.o);
                            break;
                        }
                    case 87:
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 91:
                        agr agrVar54 = agqVar.d;
                        agrVar54.r = a(obtainStyledAttributes, index, agrVar54.r);
                        break;
                    case 92:
                        agr agrVar55 = agqVar.d;
                        agrVar55.s = a(obtainStyledAttributes, index, agrVar55.s);
                        break;
                    case 93:
                        agr agrVar56 = agqVar.d;
                        agrVar56.M = obtainStyledAttributes.getDimensionPixelSize(index, agrVar56.M);
                        break;
                    case 94:
                        agr agrVar57 = agqVar.d;
                        agrVar57.T = obtainStyledAttributes.getDimensionPixelSize(index, agrVar57.T);
                        break;
                    case 95:
                        e(agqVar.d, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        e(agqVar.d, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        agr agrVar58 = agqVar.d;
                        agrVar58.ap = obtainStyledAttributes.getInt(index, agrVar58.ap);
                        break;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return agqVar;
    }

    private static void i(agq agqVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        agp agpVar = new agp();
        agqVar.g = agpVar;
        agqVar.c.b = false;
        agqVar.d.c = false;
        agqVar.b.a = false;
        agqVar.e.b = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (d.get(index)) {
                case 2:
                    agpVar.b(2, typedArray.getDimensionPixelSize(index, agqVar.d.f50J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                    break;
                case 5:
                    agpVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    agpVar.b(6, typedArray.getDimensionPixelOffset(index, agqVar.d.D));
                    break;
                case 7:
                    agpVar.b(7, typedArray.getDimensionPixelOffset(index, agqVar.d.E));
                    break;
                case 8:
                    agpVar.b(8, typedArray.getDimensionPixelSize(index, agqVar.d.K));
                    break;
                case 11:
                    agpVar.b(11, typedArray.getDimensionPixelSize(index, agqVar.d.Q));
                    break;
                case 12:
                    agpVar.b(12, typedArray.getDimensionPixelSize(index, agqVar.d.R));
                    break;
                case 13:
                    agpVar.b(13, typedArray.getDimensionPixelSize(index, agqVar.d.N));
                    break;
                case 14:
                    agpVar.b(14, typedArray.getDimensionPixelSize(index, agqVar.d.P));
                    break;
                case 15:
                    agpVar.b(15, typedArray.getDimensionPixelSize(index, agqVar.d.S));
                    break;
                case 16:
                    agpVar.b(16, typedArray.getDimensionPixelSize(index, agqVar.d.O));
                    break;
                case 17:
                    agpVar.b(17, typedArray.getDimensionPixelOffset(index, agqVar.d.f));
                    break;
                case 18:
                    agpVar.b(18, typedArray.getDimensionPixelOffset(index, agqVar.d.g));
                    break;
                case 19:
                    agpVar.a(19, typedArray.getFloat(index, agqVar.d.h));
                    break;
                case 20:
                    agpVar.a(20, typedArray.getFloat(index, agqVar.d.x));
                    break;
                case 21:
                    agpVar.b(21, typedArray.getLayoutDimension(index, agqVar.d.e));
                    break;
                case 22:
                    agpVar.b(22, a[typedArray.getInt(index, agqVar.b.b)]);
                    break;
                case 23:
                    agpVar.b(23, typedArray.getLayoutDimension(index, agqVar.d.d));
                    break;
                case 24:
                    agpVar.b(24, typedArray.getDimensionPixelSize(index, agqVar.d.G));
                    break;
                case 27:
                    agpVar.b(27, typedArray.getInt(index, agqVar.d.F));
                    break;
                case 28:
                    agpVar.b(28, typedArray.getDimensionPixelSize(index, agqVar.d.H));
                    break;
                case 31:
                    agpVar.b(31, typedArray.getDimensionPixelSize(index, agqVar.d.L));
                    break;
                case 34:
                    agpVar.b(34, typedArray.getDimensionPixelSize(index, agqVar.d.I));
                    break;
                case 37:
                    agpVar.a(37, typedArray.getFloat(index, agqVar.d.y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, agqVar.a);
                    agqVar.a = resourceId;
                    agpVar.b(38, resourceId);
                    break;
                case 39:
                    agpVar.a(39, typedArray.getFloat(index, agqVar.d.V));
                    break;
                case 40:
                    agpVar.a(40, typedArray.getFloat(index, agqVar.d.U));
                    break;
                case 41:
                    agpVar.b(41, typedArray.getInt(index, agqVar.d.W));
                    break;
                case 42:
                    agpVar.b(42, typedArray.getInt(index, agqVar.d.X));
                    break;
                case 43:
                    agpVar.a(43, typedArray.getFloat(index, agqVar.b.d));
                    break;
                case 44:
                    agpVar.d(44, true);
                    agpVar.a(44, typedArray.getDimension(index, agqVar.e.o));
                    break;
                case 45:
                    agpVar.a(45, typedArray.getFloat(index, agqVar.e.d));
                    break;
                case 46:
                    agpVar.a(46, typedArray.getFloat(index, agqVar.e.e));
                    break;
                case 47:
                    agpVar.a(47, typedArray.getFloat(index, agqVar.e.f));
                    break;
                case 48:
                    agpVar.a(48, typedArray.getFloat(index, agqVar.e.g));
                    break;
                case 49:
                    agpVar.a(49, typedArray.getDimension(index, agqVar.e.h));
                    break;
                case 50:
                    agpVar.a(50, typedArray.getDimension(index, agqVar.e.i));
                    break;
                case 51:
                    agpVar.a(51, typedArray.getDimension(index, agqVar.e.k));
                    break;
                case 52:
                    agpVar.a(52, typedArray.getDimension(index, agqVar.e.l));
                    break;
                case 53:
                    agpVar.a(53, typedArray.getDimension(index, agqVar.e.m));
                    break;
                case 54:
                    agpVar.b(54, typedArray.getInt(index, agqVar.d.Y));
                    break;
                case 55:
                    agpVar.b(55, typedArray.getInt(index, agqVar.d.Z));
                    break;
                case 56:
                    agpVar.b(56, typedArray.getDimensionPixelSize(index, agqVar.d.aa));
                    break;
                case 57:
                    agpVar.b(57, typedArray.getDimensionPixelSize(index, agqVar.d.ab));
                    break;
                case 58:
                    agpVar.b(58, typedArray.getDimensionPixelSize(index, agqVar.d.ac));
                    break;
                case 59:
                    agpVar.b(59, typedArray.getDimensionPixelSize(index, agqVar.d.ad));
                    break;
                case 60:
                    agpVar.a(60, typedArray.getFloat(index, agqVar.e.c));
                    break;
                case 62:
                    agpVar.b(62, typedArray.getDimensionPixelSize(index, agqVar.d.B));
                    break;
                case 63:
                    agpVar.a(63, typedArray.getFloat(index, agqVar.d.C));
                    break;
                case 64:
                    agpVar.b(64, a(typedArray, index, agqVar.c.c));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        agpVar.c(65, typedArray.getString(index));
                        break;
                    } else {
                        agpVar.c(65, afg.a[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    agpVar.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    agpVar.a(67, typedArray.getFloat(index, agqVar.c.j));
                    break;
                case 68:
                    agpVar.a(68, typedArray.getFloat(index, agqVar.b.e));
                    break;
                case 69:
                    agpVar.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    agpVar.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    agpVar.b(72, typedArray.getInt(index, agqVar.d.ag));
                    break;
                case 73:
                    agpVar.b(73, typedArray.getDimensionPixelSize(index, agqVar.d.ah));
                    break;
                case 74:
                    agpVar.c(74, typedArray.getString(index));
                    break;
                case 75:
                    agpVar.d(75, typedArray.getBoolean(index, agqVar.d.ao));
                    break;
                case 76:
                    agpVar.b(76, typedArray.getInt(index, agqVar.c.f));
                    break;
                case 77:
                    agpVar.c(77, typedArray.getString(index));
                    break;
                case 78:
                    agpVar.b(78, typedArray.getInt(index, agqVar.b.c));
                    break;
                case 79:
                    agpVar.a(79, typedArray.getFloat(index, agqVar.c.h));
                    break;
                case 80:
                    agpVar.d(80, typedArray.getBoolean(index, agqVar.d.am));
                    break;
                case 81:
                    agpVar.d(81, typedArray.getBoolean(index, agqVar.d.an));
                    break;
                case 82:
                    agpVar.b(82, typedArray.getInteger(index, agqVar.c.d));
                    break;
                case 83:
                    agpVar.b(83, a(typedArray, index, agqVar.e.j));
                    break;
                case 84:
                    agpVar.b(84, typedArray.getInteger(index, agqVar.c.l));
                    break;
                case 85:
                    agpVar.a(85, typedArray.getFloat(index, agqVar.c.k));
                    break;
                case 86:
                    TypedValue peekValue = typedArray.peekValue(index);
                    if (peekValue.type == 1) {
                        agqVar.c.o = typedArray.getResourceId(index, -1);
                        agpVar.b(89, agqVar.c.o);
                        ags agsVar = agqVar.c;
                        if (agsVar.o != -1) {
                            agsVar.n = -2;
                            agpVar.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (peekValue.type == 3) {
                        agqVar.c.m = typedArray.getString(index);
                        agpVar.c(90, agqVar.c.m);
                        if (agqVar.c.m.indexOf("/") > 0) {
                            agqVar.c.o = typedArray.getResourceId(index, -1);
                            agpVar.b(89, agqVar.c.o);
                            agqVar.c.n = -2;
                            agpVar.b(88, -2);
                            break;
                        } else {
                            agqVar.c.n = -1;
                            agpVar.b(88, -1);
                            break;
                        }
                    } else {
                        ags agsVar2 = agqVar.c;
                        agsVar2.n = typedArray.getInteger(index, agsVar2.o);
                        agpVar.b(88, agqVar.c.n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                    break;
                case 93:
                    agpVar.b(93, typedArray.getDimensionPixelSize(index, agqVar.d.M));
                    break;
                case 94:
                    agpVar.b(94, typedArray.getDimensionPixelSize(index, agqVar.d.T));
                    break;
                case 95:
                    e(agpVar, typedArray, index, 0);
                    break;
                case 96:
                    e(agpVar, typedArray, index, 1);
                    break;
                case 97:
                    agpVar.b(97, typedArray.getInt(index, agqVar.d.ap));
                    break;
                case 98:
                    if (typedArray.peekValue(index).type == 3) {
                        typedArray.getString(index);
                        break;
                    } else {
                        agqVar.a = typedArray.getResourceId(index, agqVar.a);
                        break;
                    }
            }
        }
    }

    public final void b(Context context, int i) {
        agv agvVar = this;
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout.getChildCount();
        agvVar.b.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            agl aglVar = (agl) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                HashMap hashMap = agvVar.b;
                Integer valueOf = Integer.valueOf(id);
                if (!hashMap.containsKey(valueOf)) {
                    agvVar.b.put(valueOf, new agq());
                }
                agq agqVar = (agq) agvVar.b.get(valueOf);
                if (agqVar != null) {
                    HashMap hashMap2 = agvVar.e;
                    HashMap hashMap3 = new HashMap();
                    Class<?> cls = childAt.getClass();
                    for (String str : hashMap2.keySet()) {
                        agi agiVar = (agi) hashMap2.get(str);
                        try {
                        } catch (IllegalAccessException e) {
                            e = e;
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                        } catch (InvocationTargetException e3) {
                            e = e3;
                        }
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new agi(agiVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            try {
                                hashMap3.put(str, new agi(agiVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e4) {
                                e = e4;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e5) {
                                e = e5;
                                e.printStackTrace();
                            } catch (InvocationTargetException e6) {
                                e = e6;
                                e.printStackTrace();
                            }
                        }
                    }
                    agqVar.f = hashMap3;
                    agqVar.a = id;
                    agr agrVar = agqVar.d;
                    agrVar.i = aglVar.d;
                    agrVar.j = aglVar.e;
                    agrVar.k = aglVar.f;
                    agrVar.l = aglVar.g;
                    agrVar.m = aglVar.h;
                    agrVar.n = aglVar.i;
                    agrVar.o = aglVar.j;
                    agrVar.p = aglVar.k;
                    agrVar.q = aglVar.l;
                    agrVar.r = aglVar.m;
                    agrVar.s = aglVar.n;
                    agrVar.t = aglVar.r;
                    agrVar.u = aglVar.s;
                    agrVar.v = aglVar.t;
                    agrVar.w = aglVar.u;
                    agrVar.x = aglVar.D;
                    agrVar.y = aglVar.E;
                    agrVar.z = aglVar.F;
                    agrVar.A = aglVar.o;
                    agrVar.B = aglVar.p;
                    agrVar.C = aglVar.q;
                    agrVar.D = aglVar.S;
                    agrVar.E = aglVar.T;
                    agrVar.F = aglVar.U;
                    agrVar.h = aglVar.c;
                    agrVar.f = aglVar.a;
                    agrVar.g = aglVar.b;
                    agrVar.d = aglVar.width;
                    agqVar.d.e = aglVar.height;
                    agqVar.d.G = aglVar.leftMargin;
                    agqVar.d.H = aglVar.rightMargin;
                    agqVar.d.I = aglVar.topMargin;
                    agqVar.d.f50J = aglVar.bottomMargin;
                    agr agrVar2 = agqVar.d;
                    agrVar2.M = aglVar.C;
                    agrVar2.U = aglVar.H;
                    agrVar2.V = aglVar.G;
                    agrVar2.X = aglVar.f49J;
                    agrVar2.W = aglVar.I;
                    agrVar2.am = aglVar.V;
                    agrVar2.an = aglVar.W;
                    agrVar2.Y = aglVar.K;
                    agrVar2.Z = aglVar.L;
                    agrVar2.aa = aglVar.O;
                    agrVar2.ab = aglVar.P;
                    agrVar2.ac = aglVar.M;
                    agrVar2.ad = aglVar.N;
                    agrVar2.ae = aglVar.Q;
                    agrVar2.af = aglVar.R;
                    agrVar2.al = aglVar.X;
                    agrVar2.O = aglVar.w;
                    agrVar2.Q = aglVar.y;
                    agrVar2.N = aglVar.v;
                    agrVar2.P = aglVar.x;
                    agrVar2.S = aglVar.z;
                    agrVar2.R = aglVar.A;
                    agrVar2.T = aglVar.B;
                    agrVar2.ap = aglVar.Y;
                    agrVar2.K = aglVar.getMarginEnd();
                    agqVar.d.L = aglVar.getMarginStart();
                    agqVar.b.b = childAt.getVisibility();
                    agqVar.b.d = childAt.getAlpha();
                    agqVar.e.c = childAt.getRotation();
                    agqVar.e.d = childAt.getRotationX();
                    agqVar.e.e = childAt.getRotationY();
                    agqVar.e.f = childAt.getScaleX();
                    agqVar.e.g = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        agu aguVar = agqVar.e;
                        aguVar.h = pivotX;
                        aguVar.i = pivotY;
                    }
                    agqVar.e.k = childAt.getTranslationX();
                    agqVar.e.l = childAt.getTranslationY();
                    agqVar.e.m = childAt.getTranslationZ();
                    agu aguVar2 = agqVar.e;
                    if (aguVar2.n) {
                        aguVar2.o = childAt.getElevation();
                    }
                    if (childAt instanceof agh) {
                        agh aghVar = (agh) childAt;
                        agr agrVar3 = agqVar.d;
                        agrVar3.ao = aghVar.b.b;
                        agrVar3.aj = Arrays.copyOf(aghVar.c, aghVar.d);
                        agr agrVar4 = agqVar.d;
                        agrVar4.ag = aghVar.a;
                        agrVar4.ah = aghVar.b.c;
                    }
                }
                i2++;
                agvVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void c(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    agq h = h(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        h.d.b = true;
                    }
                    this.b.put(Integer.valueOf(h.a), h);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0025. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:53:0x00e7. Please report as an issue. */
    public final void d(Context context, XmlPullParser xmlPullParser) {
        char c2;
        Object obj;
        char c3;
        try {
            int eventType = xmlPullParser.getEventType();
            agq agqVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    int i = 2;
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        int i2 = 7;
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c2 = 6;
                                    break;
                                }
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    c2 = 7;
                                    break;
                                }
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    c2 = '\t';
                                    break;
                                }
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    c2 = '\b';
                                    break;
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                        }
                        c2 = 65535;
                        switch (c2) {
                            case 0:
                                agqVar = h(context, Xml.asAttributeSet(xmlPullParser), false);
                                break;
                            case 1:
                                agqVar = h(context, Xml.asAttributeSet(xmlPullParser), true);
                                break;
                            case 2:
                                agqVar = h(context, Xml.asAttributeSet(xmlPullParser), false);
                                agr agrVar = agqVar.d;
                                agrVar.b = true;
                                agrVar.c = true;
                                break;
                            case 3:
                                agqVar = h(context, Xml.asAttributeSet(xmlPullParser), false);
                                agqVar.d.ai = 1;
                                break;
                            case 4:
                                if (agqVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                agt agtVar = agqVar.b;
                                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), agz.g);
                                agtVar.a = true;
                                int indexCount = obtainStyledAttributes.getIndexCount();
                                for (int i3 = 0; i3 < indexCount; i3++) {
                                    int index = obtainStyledAttributes.getIndex(i3);
                                    if (index == 1) {
                                        agtVar.d = obtainStyledAttributes.getFloat(1, agtVar.d);
                                    } else if (index == 0) {
                                        agtVar.b = obtainStyledAttributes.getInt(0, agtVar.b);
                                        agtVar.b = a[agtVar.b];
                                    } else {
                                        if (index == 4) {
                                            agtVar.c = obtainStyledAttributes.getInt(4, agtVar.c);
                                        } else if (index == 3) {
                                            agtVar.e = obtainStyledAttributes.getFloat(3, agtVar.e);
                                        }
                                    }
                                }
                                obtainStyledAttributes.recycle();
                                break;
                            case 5:
                                if (agqVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                agu aguVar = agqVar.e;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), agz.i);
                                aguVar.b = true;
                                int indexCount2 = obtainStyledAttributes2.getIndexCount();
                                for (int i4 = 0; i4 < indexCount2; i4++) {
                                    int index2 = obtainStyledAttributes2.getIndex(i4);
                                    switch (agu.a.get(index2)) {
                                        case 1:
                                            aguVar.c = obtainStyledAttributes2.getFloat(index2, aguVar.c);
                                            break;
                                        case 2:
                                            aguVar.d = obtainStyledAttributes2.getFloat(index2, aguVar.d);
                                            break;
                                        case 3:
                                            aguVar.e = obtainStyledAttributes2.getFloat(index2, aguVar.e);
                                            break;
                                        case 4:
                                            aguVar.f = obtainStyledAttributes2.getFloat(index2, aguVar.f);
                                            break;
                                        case 5:
                                            aguVar.g = obtainStyledAttributes2.getFloat(index2, aguVar.g);
                                            break;
                                        case 6:
                                            aguVar.h = obtainStyledAttributes2.getDimension(index2, aguVar.h);
                                            break;
                                        case 7:
                                            aguVar.i = obtainStyledAttributes2.getDimension(index2, aguVar.i);
                                            break;
                                        case 8:
                                            aguVar.k = obtainStyledAttributes2.getDimension(index2, aguVar.k);
                                            break;
                                        case 9:
                                            aguVar.l = obtainStyledAttributes2.getDimension(index2, aguVar.l);
                                            break;
                                        case 10:
                                            aguVar.m = obtainStyledAttributes2.getDimension(index2, aguVar.m);
                                            break;
                                        case 11:
                                            aguVar.n = true;
                                            aguVar.o = obtainStyledAttributes2.getDimension(index2, aguVar.o);
                                            break;
                                        case 12:
                                            aguVar.j = a(obtainStyledAttributes2, index2, aguVar.j);
                                            break;
                                    }
                                }
                                obtainStyledAttributes2.recycle();
                                break;
                            case 6:
                                if (agqVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                agr agrVar2 = agqVar.d;
                                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), agz.e);
                                agrVar2.c = true;
                                int indexCount3 = obtainStyledAttributes3.getIndexCount();
                                for (int i5 = 0; i5 < indexCount3; i5++) {
                                    int index3 = obtainStyledAttributes3.getIndex(i5);
                                    int i6 = agr.a.get(index3);
                                    if (i6 != 80) {
                                        if (i6 != 81) {
                                            if (i6 == 97) {
                                                agrVar2.ap = obtainStyledAttributes3.getInt(index3, agrVar2.ap);
                                            } else {
                                                switch (i6) {
                                                    case 1:
                                                        agrVar2.q = a(obtainStyledAttributes3, index3, agrVar2.q);
                                                        break;
                                                    case 2:
                                                        agrVar2.f50J = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.f50J);
                                                        break;
                                                    case 3:
                                                        agrVar2.p = a(obtainStyledAttributes3, index3, agrVar2.p);
                                                        break;
                                                    case 4:
                                                        agrVar2.o = a(obtainStyledAttributes3, index3, agrVar2.o);
                                                        break;
                                                    case 5:
                                                        agrVar2.z = obtainStyledAttributes3.getString(index3);
                                                        break;
                                                    case 6:
                                                        agrVar2.D = obtainStyledAttributes3.getDimensionPixelOffset(index3, agrVar2.D);
                                                        break;
                                                    case 7:
                                                        agrVar2.E = obtainStyledAttributes3.getDimensionPixelOffset(index3, agrVar2.E);
                                                        break;
                                                    case 8:
                                                        agrVar2.K = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.K);
                                                        break;
                                                    case 9:
                                                        agrVar2.w = a(obtainStyledAttributes3, index3, agrVar2.w);
                                                        break;
                                                    case 10:
                                                        agrVar2.v = a(obtainStyledAttributes3, index3, agrVar2.v);
                                                        break;
                                                    case 11:
                                                        agrVar2.Q = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.Q);
                                                        break;
                                                    case 12:
                                                        agrVar2.R = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.R);
                                                        break;
                                                    case 13:
                                                        agrVar2.N = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.N);
                                                        break;
                                                    case 14:
                                                        agrVar2.P = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.P);
                                                        break;
                                                    case 15:
                                                        agrVar2.S = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.S);
                                                        break;
                                                    case 16:
                                                        agrVar2.O = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.O);
                                                        break;
                                                    case 17:
                                                        agrVar2.f = obtainStyledAttributes3.getDimensionPixelOffset(index3, agrVar2.f);
                                                        break;
                                                    case 18:
                                                        agrVar2.g = obtainStyledAttributes3.getDimensionPixelOffset(index3, agrVar2.g);
                                                        break;
                                                    case 19:
                                                        agrVar2.h = obtainStyledAttributes3.getFloat(index3, agrVar2.h);
                                                        break;
                                                    case 20:
                                                        agrVar2.x = obtainStyledAttributes3.getFloat(index3, agrVar2.x);
                                                        break;
                                                    case 21:
                                                        agrVar2.e = obtainStyledAttributes3.getLayoutDimension(index3, agrVar2.e);
                                                        break;
                                                    case 22:
                                                        agrVar2.d = obtainStyledAttributes3.getLayoutDimension(index3, agrVar2.d);
                                                        break;
                                                    case 23:
                                                        agrVar2.G = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.G);
                                                        break;
                                                    case 24:
                                                        agrVar2.i = a(obtainStyledAttributes3, index3, agrVar2.i);
                                                        break;
                                                    case 25:
                                                        agrVar2.j = a(obtainStyledAttributes3, index3, agrVar2.j);
                                                        break;
                                                    case 26:
                                                        agrVar2.F = obtainStyledAttributes3.getInt(index3, agrVar2.F);
                                                        break;
                                                    case 27:
                                                        agrVar2.H = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.H);
                                                        break;
                                                    case 28:
                                                        agrVar2.k = a(obtainStyledAttributes3, index3, agrVar2.k);
                                                        break;
                                                    case 29:
                                                        agrVar2.l = a(obtainStyledAttributes3, index3, agrVar2.l);
                                                        break;
                                                    case 30:
                                                        agrVar2.L = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.L);
                                                        break;
                                                    case 31:
                                                        agrVar2.t = a(obtainStyledAttributes3, index3, agrVar2.t);
                                                        break;
                                                    case 32:
                                                        agrVar2.u = a(obtainStyledAttributes3, index3, agrVar2.u);
                                                        break;
                                                    case 33:
                                                        agrVar2.I = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.I);
                                                        break;
                                                    case 34:
                                                        agrVar2.n = a(obtainStyledAttributes3, index3, agrVar2.n);
                                                        break;
                                                    case 35:
                                                        agrVar2.m = a(obtainStyledAttributes3, index3, agrVar2.m);
                                                        break;
                                                    case 36:
                                                        agrVar2.y = obtainStyledAttributes3.getFloat(index3, agrVar2.y);
                                                        break;
                                                    case 37:
                                                        agrVar2.V = obtainStyledAttributes3.getFloat(index3, agrVar2.V);
                                                        break;
                                                    case 38:
                                                        agrVar2.U = obtainStyledAttributes3.getFloat(index3, agrVar2.U);
                                                        break;
                                                    case 39:
                                                        agrVar2.W = obtainStyledAttributes3.getInt(index3, agrVar2.W);
                                                        break;
                                                    case 40:
                                                        agrVar2.X = obtainStyledAttributes3.getInt(index3, agrVar2.X);
                                                        break;
                                                    case 41:
                                                        e(agrVar2, obtainStyledAttributes3, index3, 0);
                                                        break;
                                                    case 42:
                                                        e(agrVar2, obtainStyledAttributes3, index3, 1);
                                                        break;
                                                    default:
                                                        switch (i6) {
                                                            case 54:
                                                                agrVar2.Y = obtainStyledAttributes3.getInt(index3, agrVar2.Y);
                                                                break;
                                                            case 55:
                                                                agrVar2.Z = obtainStyledAttributes3.getInt(index3, agrVar2.Z);
                                                                break;
                                                            case 56:
                                                                agrVar2.aa = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.aa);
                                                                break;
                                                            case 57:
                                                                agrVar2.ab = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.ab);
                                                                break;
                                                            case 58:
                                                                agrVar2.ac = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.ac);
                                                                break;
                                                            case 59:
                                                                agrVar2.ad = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.ad);
                                                                break;
                                                            default:
                                                                switch (i6) {
                                                                    case 61:
                                                                        agrVar2.A = a(obtainStyledAttributes3, index3, agrVar2.A);
                                                                        break;
                                                                    case 62:
                                                                        agrVar2.B = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.B);
                                                                        break;
                                                                    case 63:
                                                                        agrVar2.C = obtainStyledAttributes3.getFloat(index3, agrVar2.C);
                                                                        break;
                                                                    default:
                                                                        switch (i6) {
                                                                            case 69:
                                                                                agrVar2.ae = obtainStyledAttributes3.getFloat(index3, 1.0f);
                                                                                break;
                                                                            case 70:
                                                                                agrVar2.af = obtainStyledAttributes3.getFloat(index3, 1.0f);
                                                                                break;
                                                                            case 71:
                                                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                                                break;
                                                                            case 72:
                                                                                agrVar2.ag = obtainStyledAttributes3.getInt(index3, agrVar2.ag);
                                                                                break;
                                                                            case 73:
                                                                                agrVar2.ah = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.ah);
                                                                                break;
                                                                            case 74:
                                                                                agrVar2.ak = obtainStyledAttributes3.getString(index3);
                                                                                break;
                                                                            case 75:
                                                                                agrVar2.ao = obtainStyledAttributes3.getBoolean(index3, agrVar2.ao);
                                                                                break;
                                                                            case 76:
                                                                                Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index3) + "   " + agr.a.get(index3));
                                                                                break;
                                                                            case 77:
                                                                                agrVar2.al = obtainStyledAttributes3.getString(index3);
                                                                                break;
                                                                            default:
                                                                                switch (i6) {
                                                                                    case 91:
                                                                                        agrVar2.r = a(obtainStyledAttributes3, index3, agrVar2.r);
                                                                                        break;
                                                                                    case 92:
                                                                                        agrVar2.s = a(obtainStyledAttributes3, index3, agrVar2.s);
                                                                                        break;
                                                                                    case 93:
                                                                                        agrVar2.M = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.M);
                                                                                        break;
                                                                                    case 94:
                                                                                        agrVar2.T = obtainStyledAttributes3.getDimensionPixelSize(index3, agrVar2.T);
                                                                                        break;
                                                                                    default:
                                                                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index3) + "   " + agr.a.get(index3));
                                                                                        break;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                            }
                                        } else {
                                            agrVar2.an = obtainStyledAttributes3.getBoolean(index3, agrVar2.an);
                                        }
                                    } else {
                                        agrVar2.am = obtainStyledAttributes3.getBoolean(index3, agrVar2.am);
                                    }
                                }
                                obtainStyledAttributes3.recycle();
                                break;
                            case 7:
                                if (agqVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                ags agsVar = agqVar.c;
                                TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), agz.f);
                                agsVar.b = true;
                                int indexCount4 = obtainStyledAttributes4.getIndexCount();
                                for (int i7 = 0; i7 < indexCount4; i7++) {
                                    int index4 = obtainStyledAttributes4.getIndex(i7);
                                    switch (ags.a.get(index4)) {
                                        case 1:
                                            agsVar.j = obtainStyledAttributes4.getFloat(index4, agsVar.j);
                                            break;
                                        case 2:
                                            agsVar.f = obtainStyledAttributes4.getInt(index4, agsVar.f);
                                            break;
                                        case 3:
                                            if (obtainStyledAttributes4.peekValue(index4).type == 3) {
                                                agsVar.e = obtainStyledAttributes4.getString(index4);
                                                break;
                                            } else {
                                                agsVar.e = afg.a[obtainStyledAttributes4.getInteger(index4, 0)];
                                                break;
                                            }
                                        case 4:
                                            agsVar.g = obtainStyledAttributes4.getInt(index4, 0);
                                            break;
                                        case 5:
                                            agsVar.c = a(obtainStyledAttributes4, index4, agsVar.c);
                                            break;
                                        case 6:
                                            agsVar.d = obtainStyledAttributes4.getInteger(index4, agsVar.d);
                                            break;
                                        case 7:
                                            agsVar.h = obtainStyledAttributes4.getFloat(index4, agsVar.h);
                                            break;
                                        case 8:
                                            agsVar.l = obtainStyledAttributes4.getInteger(index4, agsVar.l);
                                            break;
                                        case 9:
                                            agsVar.k = obtainStyledAttributes4.getFloat(index4, agsVar.k);
                                            break;
                                        case 10:
                                            TypedValue peekValue = obtainStyledAttributes4.peekValue(index4);
                                            if (peekValue.type == 1) {
                                                int resourceId = obtainStyledAttributes4.getResourceId(index4, -1);
                                                agsVar.o = resourceId;
                                                if (resourceId != -1) {
                                                    agsVar.n = -2;
                                                    break;
                                                }
                                            } else if (peekValue.type == 3) {
                                                agsVar.m = obtainStyledAttributes4.getString(index4);
                                                if (agsVar.m.indexOf("/") > 0) {
                                                    agsVar.o = obtainStyledAttributes4.getResourceId(index4, -1);
                                                    agsVar.n = -2;
                                                    break;
                                                } else {
                                                    agsVar.n = -1;
                                                    break;
                                                }
                                            } else {
                                                agsVar.n = obtainStyledAttributes4.getInteger(index4, agsVar.o);
                                                break;
                                            }
                                            break;
                                    }
                                }
                                obtainStyledAttributes4.recycle();
                                break;
                            case '\b':
                            case '\t':
                                if (agqVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                HashMap hashMap = agqVar.f;
                                TypedArray obtainStyledAttributes5 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), agz.d);
                                int indexCount5 = obtainStyledAttributes5.getIndexCount();
                                int i8 = 0;
                                String str = null;
                                Object obj2 = null;
                                int i9 = 0;
                                boolean z = false;
                                while (i8 < indexCount5) {
                                    int index5 = obtainStyledAttributes5.getIndex(i8);
                                    if (index5 == 0) {
                                        String string = obtainStyledAttributes5.getString(0);
                                        str = (string == null || string.length() <= 0) ? string : Character.toUpperCase(string.charAt(0)) + string.substring(1);
                                    } else if (index5 == 10) {
                                        str = obtainStyledAttributes5.getString(10);
                                        z = true;
                                    } else if (index5 == 1) {
                                        obj2 = Boolean.valueOf(obtainStyledAttributes5.getBoolean(1, false));
                                        i9 = 6;
                                    } else if (index5 == 3) {
                                        obj2 = Integer.valueOf(obtainStyledAttributes5.getColor(3, 0));
                                        i9 = 3;
                                    } else if (index5 == i) {
                                        obj2 = Integer.valueOf(obtainStyledAttributes5.getColor(i, 0));
                                        i9 = 4;
                                    } else {
                                        if (index5 == i2) {
                                            obj2 = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes5.getDimension(i2, 0.0f), context.getResources().getDisplayMetrics()));
                                        } else if (index5 == 4) {
                                            obj2 = Float.valueOf(obtainStyledAttributes5.getDimension(4, 0.0f));
                                        } else if (index5 == 5) {
                                            obj2 = Float.valueOf(obtainStyledAttributes5.getFloat(5, Float.NaN));
                                            i9 = 2;
                                        } else if (index5 == 6) {
                                            obj2 = Integer.valueOf(obtainStyledAttributes5.getInteger(6, -1));
                                            i9 = 1;
                                        } else if (index5 == 9) {
                                            obj2 = obtainStyledAttributes5.getString(9);
                                            i9 = 5;
                                        } else if (index5 == 8) {
                                            int resourceId2 = obtainStyledAttributes5.getResourceId(8, -1);
                                            if (resourceId2 == -1) {
                                                resourceId2 = obtainStyledAttributes5.getInt(8, -1);
                                            }
                                            obj2 = Integer.valueOf(resourceId2);
                                            i9 = 8;
                                        }
                                        i9 = 7;
                                    }
                                    i8++;
                                    i2 = 7;
                                    i = 2;
                                }
                                String str2 = str;
                                if (str2 != null && (obj = obj2) != null) {
                                    hashMap.put(str2, new agi(str2, i9, obj, z));
                                }
                                obtainStyledAttributes5.recycle();
                                break;
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        if (c3 == 0) {
                            return;
                        }
                        if (c3 == 1 || c3 == 2 || c3 == 3) {
                            try {
                                this.b.put(Integer.valueOf(agqVar.a), agqVar);
                                agqVar = null;
                            } catch (IOException e) {
                                e = e;
                                e.printStackTrace();
                                return;
                            } catch (XmlPullParserException e2) {
                                e = e2;
                                e.printStackTrace();
                                return;
                            }
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e3) {
            e = e3;
        } catch (XmlPullParserException e4) {
            e = e4;
        }
    }
}
