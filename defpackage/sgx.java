package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sgx implements sgw {
    final /* synthetic */ Collection a;

    public sgx(Collection collection) {
        this.a = collection;
    }

    @Override // defpackage.sgw
    public final boolean a(String str) {
        return this.a.contains(str);
    }
}
