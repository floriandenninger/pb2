package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class alds implements anfz {
    public final /* synthetic */ aldz a;
    public final /* synthetic */ String b;
    public final /* synthetic */ aldq c;
    public final /* synthetic */ aldo d;
    private final /* synthetic */ int e;

    public /* synthetic */ alds(aldz aldzVar, String str, aldq aldqVar, aldo aldoVar, int i) {
        this.e = i;
        this.a = aldzVar;
        this.b = str;
        this.c = aldqVar;
        this.d = aldoVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.e == 0) {
            return this.a.b((List) obj, this.b, this.c, this.d);
        }
        return this.a.b(Collections.singleton((aleb) obj), this.b, this.c, this.d);
    }
}
