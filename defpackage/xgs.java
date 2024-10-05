package defpackage;

import com.google.android.youtube.R;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgs {
    public static final EnumMap a;
    public boolean b;
    public final arfs c;
    public final arfs d;
    public final apxf e;
    public final apxf f;
    public final CharSequence g;
    public final CharSequence h;

    static {
        EnumMap enumMap = new EnumMap(arfr.class);
        a = enumMap;
        enumMap.put((EnumMap) arfr.LIKE, (arfr) Integer.valueOf(R.drawable.quantum_ic_thumb_up_white_16));
        enumMap.put((EnumMap) arfr.DISLIKE, (arfr) Integer.valueOf(R.drawable.quantum_ic_thumb_down_white_16));
    }

    public xgs(apmp apmpVar) {
        arfs arfsVar;
        apxf apxfVar;
        apxf apxfVar2;
        String str;
        this.b = apmpVar.e;
        String str2 = null;
        if ((apmpVar.b & 32) != 0) {
            arfsVar = apmpVar.g;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
        } else {
            arfsVar = null;
        }
        this.c = arfsVar;
        if ((apmpVar.b & 2048) != 0 && (arfsVar = apmpVar.m) == null) {
            arfsVar = arfs.a;
        }
        this.d = arfsVar;
        if ((apmpVar.b & 512) != 0) {
            apxfVar = apmpVar.k;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        this.e = apxfVar;
        if ((apmpVar.b & 16384) != 0) {
            apxfVar2 = apmpVar.p;
            if (apxfVar2 == null) {
                apxfVar2 = apxf.a;
            }
        } else {
            apxfVar2 = null;
        }
        this.f = apxfVar2;
        aott aottVar = apmpVar.r;
        aots aotsVar = (aottVar == null ? aott.a : aottVar).c;
        if (((aotsVar == null ? aots.a : aotsVar).b & 2) != 0) {
            aott aottVar2 = apmpVar.r;
            aots aotsVar2 = (aottVar2 == null ? aott.a : aottVar2).c;
            str = (aotsVar2 == null ? aots.a : aotsVar2).c;
        } else {
            str = null;
        }
        this.g = str;
        aott aottVar3 = apmpVar.s;
        aots aotsVar3 = (aottVar3 == null ? aott.a : aottVar3).c;
        if (((aotsVar3 == null ? aots.a : aotsVar3).b & 2) != 0) {
            aott aottVar4 = apmpVar.s;
            aots aotsVar4 = (aottVar4 == null ? aott.a : aottVar4).c;
            str2 = (aotsVar4 == null ? aots.a : aotsVar4).c;
        }
        this.h = str2;
    }
}
