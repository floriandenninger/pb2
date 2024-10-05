package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiqf {
    private final afuh a;
    private final ysy b;
    private final afqj c;
    private final amnv d;
    private final Executor e;
    private final acpl f;
    private final aaea g;
    private final amnv h;
    private final ahbx i;

    public aiqf(afuh afuhVar, ysy ysyVar, afqj afqjVar, amnv amnvVar, Executor executor, ahbx ahbxVar, acpl acplVar, aaea aaeaVar, amnv amnvVar2, byte[] bArr, byte[] bArr2) {
        afuhVar.getClass();
        this.a = afuhVar;
        ysyVar.getClass();
        this.b = ysyVar;
        afqjVar.getClass();
        this.c = afqjVar;
        this.d = amnvVar;
        executor.getClass();
        this.e = executor;
        ahbxVar.getClass();
        this.i = ahbxVar;
        this.f = acplVar;
        this.g = aaeaVar;
        this.h = amnvVar2;
    }

    public final aiqg a(List list, List list2, String str) {
        return new aiqg(this.a, this.b, this.c, this.d, list == null ? new ArrayList() : list, list2 == null ? new ArrayList() : list2, str, this.e, this.i, this.f, this.g, this.h, null, null);
    }
}
