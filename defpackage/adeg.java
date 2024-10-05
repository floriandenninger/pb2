package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adeg {
    public static final String a = zga.a("MDX.RouteUtil");
    final Handler b = new Handler(Looper.getMainLooper());
    private final String c;
    private final azrw d;
    private final adch e;

    public adeg(String str, azrw azrwVar, adch adchVar) {
        this.c = str;
        this.d = azrwVar;
        this.e = adchVar;
    }

    public static boolean c(String str, String str2) {
        amkq.E((str.contains(":") && str.lastIndexOf(":") == str.length() + (-1)) ? false : true);
        amkq.E((str2.contains(":") && str2.lastIndexOf(":") == str2.length() + (-1)) ? false : true);
        return str.substring(str.lastIndexOf(":") + 1).replace("-", "").equals(str2.substring(str2.lastIndexOf(":") + 1).replace("-", ""));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(adlj adljVar, bpv bpvVar) {
        Optional findFirst;
        String q = adgb.q(bpvVar.q);
        if (q == null) {
            findFirst = Optional.empty();
        } else {
            findFirst = Collection.EL.stream(adljVar.b()).filter(new opz(q, 11)).findFirst();
        }
        if (!findFirst.isPresent()) {
            zga.m(a, "Route was not found in screen monitor");
            return false;
        }
        return TextUtils.isEmpty(((adfy) findFirst.get()).f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(bpv bpvVar) {
        Iterator it = bpvVar.j.iterator();
        while (it.hasNext()) {
            Iterator<String> categoriesIterator = ((IntentFilter) it.next()).categoriesIterator();
            while (categoriesIterator.hasNext()) {
                if (categoriesIterator.next().contains("MDX_MEDIA_ROUTE_CONTROL_CATEGORY_")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean h(bpv bpvVar) {
        Bundle bundle = bpvVar.q;
        return bundle != null && g(bpvVar) && adgb.r(bundle) == 4;
    }

    public static boolean i(bpv bpvVar) {
        Bundle bundle = bpvVar.q;
        return bundle != null && g(bpvVar) && adgb.r(bundle) == 3;
    }

    public final List b(String str, Context context) {
        ArrayList arrayList = new ArrayList();
        for (bpv bpvVar : j()) {
            if (str.equals(bpvVar.d)) {
                arrayList.add(bpvVar);
            }
        }
        return arrayList;
    }

    public final boolean e(bpv bpvVar) {
        Iterator it = bpvVar.j.iterator();
        while (it.hasNext()) {
            if (((IntentFilter) it.next()).hasCategory("android.media.intent.category.LIVE_AUDIO")) {
                return !bpvVar.equals(bpw.g());
            }
        }
        return false;
    }

    public final boolean f(bpv bpvVar) {
        String str = this.c;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator it = bpvVar.j.iterator();
        while (it.hasNext()) {
            if (((IntentFilter) it.next()).hasCategory(prh.r(str))) {
                return true;
            }
        }
        return false;
    }

    public final List j() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return this.e.a();
        }
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        this.b.post(new adef(synchronizedList, countDownLatch, this.e));
        try {
            countDownLatch.await(10L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            zga.o(a, "Timed out getting available media routes.", e);
        }
        return synchronizedList;
    }

    public final bpv a(atbe atbeVar, Context context) {
        if (atbeVar == null || (atbeVar.b & 2) == 0) {
            zga.m(a, "Invalid MdxScreen.");
            return null;
        }
        for (bpv bpvVar : j()) {
            if (c(atbeVar.d, bpvVar.c)) {
                return bpvVar;
            }
        }
        return null;
    }
}
