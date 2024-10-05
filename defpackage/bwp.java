package defpackage;

import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bwp extends Property {
    public bwp(Class cls) {
        super(cls, "translationAlpha");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(bwr.a((View) obj));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        bwr.c((View) obj, ((Float) obj2).floatValue());
    }
}
