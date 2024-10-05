package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajoj implements ajol {
    private final Object a;
    private final String b = "SwipeLayoutCoordinator.PRESENT_CONTEXT_KEY";

    public ajoj(Object obj) {
        this.a = obj;
    }

    public static Object b(ajok ajokVar, Class cls) {
        if (ajokVar != null && !TextUtils.isEmpty("SwipeLayoutCoordinator.PRESENT_CONTEXT_KEY")) {
            Object c = ajokVar.c("SwipeLayoutCoordinator.PRESENT_CONTEXT_KEY");
            if (cls.isInstance(c)) {
                return cls.cast(c);
            }
        }
        return null;
    }

    @Override // defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        ajokVar.f(this.b, this.a);
    }
}
