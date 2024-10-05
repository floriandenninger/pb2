package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cug {
    public final Map a = new HashMap();
    public final akau b = new akau(null, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        cuf cufVar;
        synchronized (this) {
            cufVar = (cuf) this.a.get(str);
            did.ap(cufVar);
            int i = cufVar.b;
            if (i > 0) {
                int i2 = i - 1;
                cufVar.b = i2;
                if (i2 == 0) {
                    cuf cufVar2 = (cuf) this.a.remove(str);
                    if (cufVar2.equals(cufVar)) {
                        akau akauVar = this.b;
                        synchronized (akauVar.a) {
                            if (akauVar.a.size() < 10) {
                                akauVar.a.offer(cufVar2);
                            }
                        }
                    } else {
                        String valueOf = String.valueOf(cufVar);
                        String valueOf2 = String.valueOf(cufVar2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 79 + String.valueOf(valueOf2).length() + str.length());
                        sb.append("Removed the wrong lock, expected to remove: ");
                        sb.append(valueOf);
                        sb.append(", but actually removed: ");
                        sb.append(valueOf2);
                        sb.append(", safeKey: ");
                        sb.append(str);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder(str.length() + 81);
                sb2.append("Cannot release a lock that is not held, safeKey: ");
                sb2.append(str);
                sb2.append(", interestedThreads: ");
                sb2.append(i);
                throw new IllegalStateException(sb2.toString());
            }
        }
        cufVar.a.unlock();
    }
}
