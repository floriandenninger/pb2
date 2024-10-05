package defpackage;

import android.text.TextUtils;
import j$.util.Optional;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adtk {
    public static final String a = zga.a("MDX.user");
    static final long b = TimeUnit.DAYS.toMillis(1);
    public final azrw c;
    public final shf d;
    public final int[] e;
    public final int[] f;
    public long g;

    public adtk(azrw azrwVar, shf shfVar) {
        int[] iArr = new int[28];
        this.e = iArr;
        int[] iArr2 = new int[28];
        this.f = iArr2;
        this.c = azrwVar;
        this.d = shfVar;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.g = 0L;
    }

    public static void a(String str, int[] iArr) {
        String[] split = str.split(",");
        int length = split.length;
        if (length != 28) {
            String.format(Locale.US, "Expected %d values in the storage but found %d values", 28, Integer.valueOf(length));
        }
        for (int i = 0; i < Math.min(split.length, 28); i++) {
            if (!TextUtils.isEmpty(split[i])) {
                iArr[i] = Integer.parseInt(split[i]);
            }
        }
    }

    public static void d(List list, int[] iArr) {
        if (list.size() != 28) {
            String.format(Locale.US, "Expected %d values in the storage but found %d values", 28, Integer.valueOf(list.size()));
        }
        for (int i = 0; i < Math.min(list.size(), 28); i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int[] iArr, int[] iArr2, int i) {
        f(iArr, iArr2, i, Optional.empty());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(final int[] iArr, final int[] iArr2, final int i, final Optional optional) {
        if (this.g != 0) {
            System.arraycopy(iArr, 0, this.e, 0, 28);
            System.arraycopy(iArr2, 0, this.f, 0, 28);
        }
        ynm.m(((ywr) this.c.get()).b(new amml() { // from class: adtj
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                adtk adtkVar = adtk.this;
                Optional optional2 = optional;
                int i2 = i;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                aone builder = ((awvj) obj).toBuilder();
                if (optional2.isPresent()) {
                    long longValue = ((Long) optional2.get()).longValue();
                    builder.copyOnWrite();
                    awvj awvjVar = (awvj) builder.instance;
                    awvjVar.b |= 2;
                    awvjVar.d = longValue;
                }
                if (i2 == 2) {
                    long c = adtkVar.d.c();
                    builder.copyOnWrite();
                    awvj awvjVar2 = (awvj) builder.instance;
                    awvjVar2.b |= 1;
                    awvjVar2.c = c;
                }
                long j = adtkVar.g;
                if (j != 0) {
                    builder.copyOnWrite();
                    awvj awvjVar3 = (awvj) builder.instance;
                    awvjVar3.b |= 4;
                    awvjVar3.g = j;
                    builder.copyOnWrite();
                    ((awvj) builder.instance).e = awvj.emptyIntList();
                    builder.bh(anaf.ai(iArr3));
                    builder.copyOnWrite();
                    ((awvj) builder.instance).f = awvj.emptyIntList();
                    builder.bg(anaf.ai(iArr4));
                }
                return (awvj) builder.build();
            }
        }), adha.q);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g() {
        long c = this.d.c();
        long j = this.g;
        long j2 = c - j;
        long j3 = b;
        if (j2 < j3) {
            return false;
        }
        int i = (int) ((c - j) / j3);
        this.g = j + (i * j3);
        int min = Math.min(i, 28);
        for (int i2 = 27; i2 >= min; i2--) {
            int[] iArr = this.e;
            int i3 = i2 - min;
            iArr[i2] = iArr[i3];
            int[] iArr2 = this.f;
            iArr2[i2] = iArr2[i3];
        }
        Arrays.fill(this.e, 0, min, 0);
        Arrays.fill(this.f, 0, min, 0);
        return true;
    }
}
