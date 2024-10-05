package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agpp implements agqx {
    private final agpl a;
    private final int b;
    private final ajkn c;
    private final axzg d;

    public agpp(agpl agplVar, ajkn ajknVar, int i, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = agplVar;
        this.c = ajknVar;
        this.b = i;
        this.d = axzgVar;
    }

    private static aphf b(String str, List list, int i, int i2, atrt atrtVar) {
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
            i = i2;
        }
        int size = list.size();
        if (i > 0 || z) {
            int i3 = ((i + size) - 1) % size;
            if (z2) {
                i3 = atrtVar.f.d(i3);
            }
            apxf c = c(((agnp) list.get(i3)).f(), str, i3, encodeToString, false);
            createBuilder.copyOnWrite();
            aphf aphfVar6 = (aphf) createBuilder.instance;
            c.getClass();
            aphfVar6.h = c;
            aphfVar6.b |= 32;
        }
        if (i < size - 1 || z) {
            int i4 = (i + 1) % size;
            if (z2) {
                i4 = atrtVar.f.d(i4);
            }
            apxf c2 = c(((agnp) list.get(i4)).f(), str, i4, encodeToString, false);
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
            apxf c3 = c(((agnp) list.get(i)).f(), str, i, encodeToString, true);
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

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0089, code lost:
    
        if (r0 != 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List d(java.lang.String r9, java.util.List r10, int r11, int r12, int r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agpp.d(java.lang.String, java.util.List, int, int, int, java.util.List):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [ajkn] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.List, aonu] */
    @Override // defpackage.agqx
    public final synchronized aphg a(PlaybackStartDescriptor playbackStartDescriptor, agpo agpoVar) {
        Boolean bool;
        List d;
        List arrayList;
        List d2 = agpoVar.d();
        aqvj aqvjVar = this.d.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        int i = 0;
        if (aqvjVar.a(45352939L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45352939L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45352939L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            return this.a.a(playbackStartDescriptor, (List) Collection.EL.stream(d2).map(aidk.b).collect(Collectors.toList()));
        }
        String k = playbackStartDescriptor.k();
        int size = d2.size();
        int max = Math.max(playbackStartDescriptor.a(), 0);
        String i2 = playbackStartDescriptor.i();
        apxf apxfVar = playbackStartDescriptor.b;
        if (apxfVar == null || !apxfVar.pY(atrs.a)) {
            i2 = null;
        }
        aone createBuilder = atrt.a.createBuilder();
        if (!TextUtils.isEmpty(i2)) {
            try {
                byte[] decode = Base64.decode(i2, 0);
                if (decode != null) {
                    createBuilder.mergeFrom(decode, aomw.b());
                }
            } catch (aoob | IllegalArgumentException unused) {
            }
        }
        atrt atrtVar = (atrt) createBuilder.build();
        if (size > 1 && (this.b & 2) != 0) {
            if (atrtVar.e && atrtVar.f.size() != 0 && atrtVar.f.size() == d2.size()) {
                arrayList = atrtVar.f;
                int i3 = 0;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        break;
                    }
                    if (((Integer) arrayList.get(i3)).intValue() == max) {
                        i = i3;
                        break;
                    }
                    i3++;
                }
            } else {
                arrayList = new ArrayList();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList.add(Integer.valueOf(i4));
                }
                arrayList.set(0, Integer.valueOf(max));
                arrayList.set(max, 0);
                this.c.c(arrayList, size);
            }
            d = d(k, d2, max, i, this.b, arrayList);
        } else {
            int i5 = this.b & (-3);
            if (size <= 1 && TextUtils.isEmpty(k)) {
                i5 &= -2;
            }
            d = d(k, d2, max, max, i5, new ArrayList());
        }
        aong aongVar = (aong) aphg.a.createBuilder();
        aongVar.cj(d);
        aongVar.ci(d);
        return (aphg) aongVar.build();
    }
}
