package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class igv implements zfi {
    public final /* synthetic */ List a;
    private final /* synthetic */ int b;

    public /* synthetic */ igv(List list, int i) {
        this.b = i;
        this.a = list;
    }

    @Override // defpackage.zfi
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.add(Optional.ofNullable(((ihm) obj).h));
        } else {
            this.a.add(((ihm) obj).d);
        }
    }
}
