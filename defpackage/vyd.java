package defpackage;

import android.util.Property;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class vyd extends Property {
    public vyd() {
        super(Float.TYPE, "revealState");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        int i = vye.d;
        return Float.valueOf(((vye) obj).c);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        vye vyeVar = (vye) obj;
        float floatValue = ((Float) obj2).floatValue();
        int i = vye.d;
        vyeVar.c = floatValue;
        vyeVar.invalidateSelf();
    }
}
