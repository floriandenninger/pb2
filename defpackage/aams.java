package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aams {
    private static final Random b = new Random();
    public final List a;

    public aams(List list) {
        this.a = Collections.unmodifiableList(list);
    }

    public static aams a(int i, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(Integer.valueOf(i2));
        }
        if (i == 2) {
            if (b.nextBoolean()) {
                Collections.reverse(arrayList);
            }
        } else if (i == 1) {
            Collections.shuffle(arrayList, b);
        }
        return new aams(arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return amkq.b(this.a, ((aams) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
