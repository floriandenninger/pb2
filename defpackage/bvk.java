package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.os.Trace;
import android.util.Property;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvk {
    public static boolean a() {
        return Trace.isEnabled();
    }

    public static ObjectAnimator b(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, (Property<Object, V>) property, (TypeConverter) null, path);
    }
}
