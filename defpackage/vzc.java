package defpackage;

import android.util.Property;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vzc extends Property {
    final /* synthetic */ vzd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzc(vzd vzdVar) {
        super(Float.TYPE, "value");
        this.a = vzdVar;
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((vzb) obj).a);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        ((vzb) obj).a = ((Float) obj2).floatValue();
        this.a.invalidateSelf();
    }
}
