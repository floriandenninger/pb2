package defpackage;

import android.animation.ArgbEvaluator;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class omv {
    private final EnumMap a;
    private final ArgbEvaluator b;

    public omv() {
        EnumMap enumMap = new EnumMap(fzh.class);
        for (fzh fzhVar : fzh.values()) {
            enumMap.put((EnumMap) fzhVar, (fzh) new aenz());
        }
        this.a = enumMap;
        this.b = new ArgbEvaluator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        int i = 0;
        for (fzh fzhVar : fzh.values()) {
            aenz aenzVar = (aenz) this.a.get(fzhVar);
            if (aenzVar != null) {
                i = ((Integer) this.b.evaluate(aenzVar.b, Integer.valueOf(i), Integer.valueOf(aenzVar.a))).intValue();
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(fzh fzhVar, float f) {
        fzhVar.getClass();
        aenz aenzVar = (aenz) this.a.get(fzhVar);
        if (aenzVar != null) {
            aenzVar.b = Math.max(0.0f, Math.min(1.0f, f));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(fzh fzhVar, int i) {
        fzhVar.getClass();
        aenz aenzVar = (aenz) this.a.get(fzhVar);
        if (aenzVar != null) {
            aenzVar.a = i;
        }
    }
}
