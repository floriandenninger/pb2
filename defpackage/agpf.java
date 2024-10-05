package defpackage;

import android.util.Pair;
import java.util.Comparator;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agpf implements Comparator {
    private final /* synthetic */ int a;

    public agpf(int i) {
        this.a = i;
    }

    public static final int a(akzs akzsVar, akzs akzsVar2) {
        return amqb.g(anaf.ab(akzsVar.h, akzsVar2.h)).c(akzsVar.e, akzsVar2.e).a();
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                return ((Long) obj2).compareTo((Long) obj);
            }
            if (i == 2) {
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Integer) pair2.first).intValue() == ((Integer) pair.first).intValue()) {
                    return ((Long) pair.second).compareTo((Long) pair2.second);
                }
                return ((Integer) pair2.first).compareTo((Integer) pair.first);
            }
            if (i == 3) {
                return a((akzs) obj, (akzs) obj2);
            }
            CronetProvider cronetProvider = (CronetProvider) obj;
            CronetProvider cronetProvider2 = (CronetProvider) obj2;
            if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider.getName())) {
                return 1;
            }
            if (CronetProvider.PROVIDER_NAME_FALLBACK.equals(cronetProvider2.getName())) {
                return -1;
            }
            return -CronetEngine.Builder.compareVersions(cronetProvider.getVersion(), cronetProvider2.getVersion());
        }
        agov agovVar = (agov) obj;
        agov agovVar2 = (agov) obj2;
        atpo atpoVar = agovVar.c.e;
        if (atpoVar == null) {
            atpoVar = atpo.b;
        }
        int i2 = atpoVar.d;
        atpo atpoVar2 = agovVar2.c.e;
        if (atpoVar2 == null) {
            atpoVar2 = atpo.b;
        }
        int i3 = i2 - atpoVar2.d;
        if (i3 != 0) {
            return i3;
        }
        long j = agovVar.d;
        long j2 = agovVar2.d;
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }
}
