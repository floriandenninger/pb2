package defpackage;

import android.util.Property;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vsk extends Property {
    public vsk() {
        super(Float.TYPE, "transitionProgress");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((vsg) obj).a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((vsg) obj).d(((Float) obj2).floatValue());
    }
}
