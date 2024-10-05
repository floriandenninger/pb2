package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agvg {
    private final Map a = new HashMap();
    private final Map b = new HashMap();
    private int c = 0;
    private int d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized aguf a(String str) {
        return (aguf) this.a.get(str);
    }

    public final synchronized aguf b(String str) {
        aguf agufVar = (aguf) this.a.remove(str);
        if (agufVar != null) {
            Integer num = (Integer) this.b.remove(str);
            if (num == null) {
                return agufVar;
            }
            if (num.intValue() != 1 && num.intValue() != 3 && num.intValue() != 4 && num.intValue() != 7 && num.intValue() != 6) {
                if (num.intValue() == 2) {
                    this.d--;
                    return agufVar;
                }
            }
            this.c--;
        }
        return agufVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean c(int i) {
        if (i == 1 || i == 3 || i == 4 || i == 7 || i == 5 || i == 6) {
            return this.c <= 0;
        }
        if (i == 2) {
            return this.d <= 0;
        }
        StringBuilder sb = new StringBuilder(34);
        sb.append("Invalid transfer type: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean d(String str) {
        return this.a.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean e(String str, aguf agufVar, int i) {
        if (!c(i)) {
            return false;
        }
        this.a.put(str, agufVar);
        this.b.put(str, Integer.valueOf(i));
        if (i != 1 && i != 3 && i != 4 && i != 7 && i != 6) {
            if (i == 2) {
                this.d++;
            }
            return true;
        }
        this.c++;
        return true;
    }
}
