package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lgh {
    private final Context a;
    private final aahd b;
    private final ajjz c;
    private final ajyg d;
    private final ajut e;
    private final ftn f;
    private final akbf g;
    private final akbd h;
    private final fvf i;

    public lgh(Context context, aahd aahdVar, ajjz ajjzVar, akbf akbfVar, ajyg ajygVar, ajut ajutVar, ftn ftnVar, fvf fvfVar, akbd akbdVar, byte[] bArr) {
        this.a = context;
        this.b = aahdVar;
        this.c = ajjzVar;
        this.g = akbfVar;
        this.d = ajygVar;
        this.e = ajutVar;
        this.f = ftnVar;
        this.i = fvfVar;
        this.h = akbdVar;
    }

    public final lgf a(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return new lgi(this.a, this.b, this.c, this.g, this.d, this.e, this.f, this.i, this.h, viewGroup, null);
        }
        return new lgg(this.a, this.b, this.c, this.g, this.d, this.e, this.f, this.i, this.h, viewGroup, null);
    }
}
