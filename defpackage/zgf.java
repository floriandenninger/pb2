package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zgf extends zge {
    public final Object b;
    public final zgf c;
    private final float d;
    private List e;

    public zgf(int i, Object obj, zgf zgfVar) {
        super(i);
        this.b = obj;
        this.c = zgfVar;
        float d = d(zgfVar);
        this.d = i != 1 ? d + 1.0f : d;
    }

    public static float d(zgf zgfVar) {
        if (zgfVar != null) {
            return zgfVar.d;
        }
        return 0.0f;
    }

    @Override // defpackage.zge
    public final int b() {
        return 1;
    }

    @Override // defpackage.zgg
    public final List e() {
        if (this.e == null) {
            this.e = Collections.singletonList(this.b);
        }
        return this.e;
    }
}
