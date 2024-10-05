package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajsx implements ajta {
    private final /* synthetic */ int c;
    public static final /* synthetic */ ajsx b = new ajsx(1);
    public static final /* synthetic */ ajsx a = new ajsx(0);

    private /* synthetic */ ajsx(int i) {
        this.c = i;
    }

    @Override // defpackage.ajta
    public final ajni a(int i, List list, int i2, int i3) {
        if (this.c != 0) {
            ajnh a2 = ajni.a();
            a2.a = i;
            a2.b = list;
            return a2.a();
        }
        ajnh a3 = ajni.a();
        a3.a = i;
        a3.b = list;
        return a3.a();
    }
}
