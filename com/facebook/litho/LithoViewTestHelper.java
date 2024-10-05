package com.facebook.litho;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import defpackage.dic;
import defpackage.did;
import defpackage.dkp;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LithoViewTestHelper {
    public static String a(dkp dkpVar) {
        if (dkpVar == null) {
            return "";
        }
        String viewToString = viewToString(dkpVar, true);
        if (!TextUtils.isEmpty(viewToString)) {
            return viewToString;
        }
        return "(" + dkpVar.getLeft() + "," + dkpVar.getTop() + "-" + dkpVar.getRight() + "," + dkpVar.getBottom() + ")";
    }

    private static void b(dic dicVar, StringBuilder sb, boolean z, int i) {
        for (dic dicVar2 : dicVar.m()) {
            int i2 = dicVar.p(dicVar2) ? -dicVar.a().left : 0;
            int i3 = dicVar.p(dicVar2) ? -dicVar.a().top : 0;
            sb.append("\n");
            for (int i4 = 0; i4 <= i; i4++) {
                sb.append("  ");
            }
            did.addViewDescription(i2, i3, dicVar2, sb, z);
            b(dicVar2, sb, z, i + 1);
        }
    }

    public static TestItem findTestItem(dkp dkpVar, String str) {
        Deque findTestItems = dkpVar.findTestItems(str);
        if (findTestItems.isEmpty()) {
            return null;
        }
        return (TestItem) findTestItems.getLast();
    }

    public static Deque findTestItems(dkp dkpVar, String str) {
        return dkpVar.findTestItems(str);
    }

    public static String viewToString(dkp dkpVar) {
        return viewToString(dkpVar, false);
    }

    public static String viewToString(dkp dkpVar, boolean z) {
        dic f = dic.f(dkpVar);
        if (f == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 2;
        int[] iArr = new int[2];
        Object parent = dkpVar.getParent();
        int i2 = 0;
        if (!(parent instanceof View)) {
            iArr[0] = dkpVar.getLeft();
            iArr[1] = dkpVar.getTop();
        } else {
            dkpVar.getLocationOnScreen(iArr);
            int[] iArr2 = new int[2];
            ((View) parent).getLocationOnScreen(iArr2);
            iArr[0] = iArr[0] - iArr2[0];
            iArr[1] = iArr[1] - iArr2[1];
        }
        did.addViewDescription(iArr[0], iArr[1], f, sb, z);
        if (z) {
            for (ViewParent parent2 = dkpVar.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                i++;
            }
            i2 = i;
        }
        b(f, sb, z, i2);
        return sb.toString();
    }
}
