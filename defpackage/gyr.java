package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gyr extends HashMap {
    public gyr(int i) {
        super(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object a(String str, amnv amnvVar) {
        if (containsKey(str)) {
            return get(str);
        }
        Object obj = amnvVar.get();
        put(str, obj);
        return obj;
    }
}
