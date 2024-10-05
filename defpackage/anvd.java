package defpackage;

import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class anvd implements anwy {
    private final /* synthetic */ int c;
    public static final /* synthetic */ anvd b = new anvd(1);
    public static final /* synthetic */ anvd a = new anvd(0);

    private /* synthetic */ anvd(int i) {
        this.c = i;
    }

    @Override // defpackage.anwy
    public final Object a() {
        if (this.c != 0) {
            return Collections.emptySet();
        }
        return null;
    }
}
