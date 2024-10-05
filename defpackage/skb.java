package defpackage;

import android.util.LruCache;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class skb implements ska {
    public static final int a = d.c(aols.class.getName());
    public static final Map b;
    public static final skw c;
    public final LruCache d = new skf();
    public final LruCache e = new LruCache(100);
    public final skv f;

    static {
        amrw amrwVar = new amrw();
        amrwVar.g(0, "WIRETYPE_VARINT");
        amrwVar.g(1, "WIRETYPE_FIXED64");
        amrwVar.g(2, "WIRETYPE_LENGTH_DELIMITED");
        amrwVar.g(3, "WIRETYPE_START_GROUP");
        amrwVar.g(4, "WIRETYPE_END_GROUP");
        amrwVar.g(5, "WIRETYPE_FIXED32");
        amrwVar.c();
        b = new HashMap();
        c = new skw();
    }

    public skb(skv skvVar) {
        this.f = skvVar;
    }

    public static boolean a(barl barlVar) {
        return (barlVar == null || barlVar.c.size() == 0) ? false : true;
    }

    public static boolean b(int i, int i2) {
        return i == a && i2 == 2;
    }

    public static boolean c(sjw sjwVar, barl barlVar, slc slcVar, ammv ammvVar) {
        skk sksVar;
        int a2;
        int i = 0;
        while (true) {
            int i2 = 1;
            if (barlVar == null || i >= barlVar.c.size()) {
                break;
            }
            int a3 = aorh.a(barlVar.c.d(i));
            if (a3 == 0) {
                a3 = 1;
            }
            aorg g = d.g(a3);
            if (g.b != 1) {
                sksVar = new sks(skm.a, g, sjwVar);
            } else {
                skm skmVar = skm.a;
                if (g.b == 1 && (a2 = aord.a(((Integer) g.c).intValue())) != 0) {
                    i2 = a2;
                }
                sksVar = skmVar.a(i2, sjwVar);
            }
            if (!sksVar.a()) {
                if (axsw.b()) {
                    aone b2 = slcVar.b(3);
                    b2.copyOnWrite();
                    aorj aorjVar = (aorj) b2.instance;
                    aorj aorjVar2 = aorj.a;
                    aorjVar.j = a3 - 1;
                    aorjVar.b |= 128;
                    aorg g2 = d.g(a3);
                    b2.copyOnWrite();
                    aorj aorjVar3 = (aorj) b2.instance;
                    g2.getClass();
                    aorjVar3.k = g2;
                    aorjVar3.b |= 512;
                    if (ammvVar.h()) {
                        b2.V(((Integer) ammvVar.c()).intValue());
                    }
                    slcVar.a(b2);
                }
                return false;
            }
            i++;
        }
        return true;
    }

    public static barl d(bark barkVar) {
        return (barl) Collections.unmodifiableMap(barkVar.d).get(-2032180703);
    }

    public static barl e(baro baroVar) {
        return (barl) Collections.unmodifiableMap(baroVar.b).get(-2032180703);
    }
}
