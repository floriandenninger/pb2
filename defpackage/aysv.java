package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aysv implements ayrp {
    public static final /* synthetic */ aysv a = new aysv(1);
    private final /* synthetic */ int b;

    public aysv(int i) {
        this.b = i;
    }

    @Override // defpackage.ayrp
    public final boolean a(Object obj, Object obj2) {
        return this.b != 0 ? Arrays.equals((byte[]) obj, (byte[]) obj2) : aysw.a(obj, obj2);
    }
}
