package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agpl {
    private final int a;
    private final ajkn b;

    public agpl(ajkn ajknVar, int i, byte[] bArr) {
        this.b = ajknVar;
        this.a = i;
    }

    private static aphf b(String str, int i, int i2, int i3, atrt atrtVar, List list) {
        boolean z = atrtVar.c;
        boolean z2 = atrtVar.e && atrtVar.f.size() != 0;
        boolean z3 = atrtVar.d;
        String encodeToString = Base64.encodeToString(atrtVar.toByteArray(), 0);
        aone createBuilder = aphf.a.createBuilder();
        if (z && z2) {
            createBuilder.copyOnWrite();
            aphf aphfVar = (aphf) createBuilder.instance;
            aphfVar.c = 4;
            aphfVar.b |= 1;
        } else if (z2) {
            createBuilder.copyOnWrite();
            aphf aphfVar2 = (aphf) createBuilder.instance;
            aphfVar2.c = 2;
            aphfVar2.b |= 1;
        } else if (z) {
            createBuilder.copyOnWrite();
            aphf aphfVar3 = (aphf) createBuilder.instance;
            aphfVar3.c = 3;
            aphfVar3.b |= 1;
        } else if (z3) {
            createBuilder.copyOnWrite();
            aphf aphfVar4 = (aphf) createBuilder.instance;
            aphfVar4.c = 6;
            aphfVar4.b |= 1;
        } else {
            createBuilder.copyOnWrite();
            aphf aphfVar5 = (aphf) createBuilder.instance;
            aphfVar5.c = 1;
            aphfVar5.b |= 1;
        }
        if (true == z2) {
            i2 = i3;
        }
        if (i2 > 0 || z) {
            int i4 = ((i2 + i) - 1) % i;
            if (z2) {
                i4 = atrtVar.f.d(i4);
            }
            apxf c = c((String) list.get(i4), str, i4, encodeToString, false);
            createBuilder.copyOnWrite();
            aphf aphfVar6 = (aphf) createBuilder.instance;
            c.getClass();
            aphfVar6.h = c;
            aphfVar6.b |= 32;
        }
        if (i2 < i - 1 || z) {
            int i5 = (i2 + 1) % i;
            if (z2) {
                i5 = atrtVar.f.d(i5);
            }
            apxf c2 = c((String) list.get(i5), str, i5, encodeToString, false);
            createBuilder.copyOnWrite();
            aphf aphfVar7 = (aphf) createBuilder.instance;
            c2.getClass();
            aphfVar7.f = c2;
            aphfVar7.b |= 8;
            createBuilder.copyOnWrite();
            aphf aphfVar8 = (aphf) createBuilder.instance;
            c2.getClass();
            aphfVar8.d = c2;
            aphfVar8.b |= 2;
        }
        if (z3) {
            apxf c3 = c((String) list.get(i2), str, i2, encodeToString, true);
            createBuilder.copyOnWrite();
            aphf aphfVar9 = (aphf) createBuilder.instance;
            c3.getClass();
            aphfVar9.d = c3;
            aphfVar9.b |= 2;
        }
        return (aphf) createBuilder.build();
    }

    private static apxf c(String str, String str2, int i, String str3, boolean z) {
        aone createBuilder = atrr.a.createBuilder();
        if (!TextUtils.isEmpty(str)) {
            createBuilder.copyOnWrite();
            atrr atrrVar = (atrr) createBuilder.instance;
            str.getClass();
            atrrVar.b |= 1;
            atrrVar.c = str;
        }
        if (!TextUtils.isEmpty(str2)) {
            createBuilder.copyOnWrite();
            atrr atrrVar2 = (atrr) createBuilder.instance;
            str2.getClass();
            atrrVar2.b |= 2;
            atrrVar2.d = str2;
        }
        if (i >= 0) {
            createBuilder.copyOnWrite();
            atrr atrrVar3 = (atrr) createBuilder.instance;
            atrrVar3.b |= 4;
            atrrVar3.e = i;
        }
        if (!TextUtils.isEmpty(str3)) {
            createBuilder.copyOnWrite();
            atrr atrrVar4 = (atrr) createBuilder.instance;
            str3.getClass();
            atrrVar4.b |= 8;
            atrrVar4.f = str3;
        }
        createBuilder.copyOnWrite();
        atrr atrrVar5 = (atrr) createBuilder.instance;
        atrrVar5.b |= 32;
        atrrVar5.h = z;
        aong aongVar = (aong) apxf.a.createBuilder();
        aongVar.e(atrs.a, (atrr) createBuilder.build());
        return (apxf) aongVar.build();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x01a6, code lost:
    
        if (r15 != 0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized defpackage.aphg a(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agpl.a(com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor, java.util.List):aphg");
    }
}
