package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aysj implements ayrw {
    final Class a;

    public aysj(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.ayrw
    public final boolean a(Object obj) {
        return this.a.isInstance(obj);
    }
}
