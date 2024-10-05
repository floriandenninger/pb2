package defpackage;

import com.facebook.yoga.YogaFlexDirection;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class spb {
    public static final String a = "spb";
    public static final AtomicInteger b = new AtomicInteger(1);

    private spb() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static spz a() {
        return spa.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static YogaFlexDirection b(aoam aoamVar) {
        if (aoamVar == null) {
            return YogaFlexDirection.COLUMN;
        }
        axoy axoyVar = new axoy();
        if (szz.l(aoamVar, axoyVar, 168772996, swi.b)) {
            int aK = axoyVar.aK();
            if (aK == 1) {
                return YogaFlexDirection.ROW;
            }
            if (aK == 2) {
                return YogaFlexDirection.ROW_REVERSE;
            }
            if (aK == 4) {
                return YogaFlexDirection.COLUMN_REVERSE;
            }
            return YogaFlexDirection.COLUMN;
        }
        return YogaFlexDirection.COLUMN;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aoam c(aoam aoamVar) {
        if (aoamVar == null) {
            return null;
        }
        aoam aoamVar2 = new aoam();
        for (int i = 0; i < aoamVar.W(); i++) {
            aoamVar.aA(aoamVar2, i);
            if (aoamVar2.T() == 183314536) {
                return aoam.aB(aoamVar2.V());
            }
        }
        return null;
    }
}
