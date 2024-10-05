package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class oxu implements oxv {
    @Override // defpackage.oxv
    public final oxf a(String str, boolean z) {
        List a = oyh.a(str, z);
        if (a.isEmpty()) {
            return null;
        }
        return (oxf) a.get(0);
    }
}
