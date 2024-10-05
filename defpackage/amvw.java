package defpackage;

import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amvw {
    private final Field a;

    public amvw(Field field) {
        this.a = field;
        field.setAccessible(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Object obj, int i) {
        try {
            this.a.set(obj, Integer.valueOf(i));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Object obj, Object obj2) {
        try {
            this.a.set(obj, obj2);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
