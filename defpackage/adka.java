package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adka {
    public static final String a = zga.a("MDX.promotion");
    public final SharedPreferences b;
    public final shf c;
    public final Map d;
    public final Map e;
    public int f;
    private int g;

    public adka(SharedPreferences sharedPreferences, Set set, int i, shf shfVar) {
        this.b = sharedPreferences;
        shfVar.getClass();
        this.c = shfVar;
        this.d = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            adjl adjlVar = (adjl) it.next();
            this.d.put(adjlVar.a, adjlVar);
        }
        HashMap hashMap = new HashMap();
        this.e = hashMap;
        ynm.k(anaf.O(Integer.valueOf(this.b.getInt("promotion_counter_ref_id", 0))), angq.a, adha.g, new ynl() { // from class: adjx
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                final adka adkaVar = adka.this;
                adkaVar.f = ((Integer) obj).intValue();
                for (final adjl adjlVar2 : adkaVar.d.values()) {
                    final String e = adka.e(adjlVar2.a);
                    ynm.k(anaf.O(adkaVar.b.getString(e, "")), angq.a, new ynk() { // from class: adjw
                        @Override // defpackage.zfi
                        /* renamed from: b */
                        public final void a(Throwable th) {
                            zga.f(adka.a, String.format(Locale.US, "Error while retrieving storage item of type=%s", adjl.this.a), th);
                        }
                    }, new ynl() { // from class: adjy
                        @Override // defpackage.ynl, defpackage.zfi
                        public final void a(Object obj2) {
                            adka adkaVar2 = adka.this;
                            adjl adjlVar3 = adjlVar2;
                            String str = e;
                            String str2 = (String) obj2;
                            if (str2.isEmpty()) {
                                return;
                            }
                            try {
                                adjz adjzVar = new adjz(adjlVar3.a, str2);
                                adkaVar2.e.put(adjlVar3.a, adjzVar);
                                String.format(Locale.US, "loaded promotion item: type=%s value=%s", adjlVar3.a, adjzVar);
                            } catch (IllegalArgumentException e2) {
                                String str3 = adka.a;
                                String valueOf = String.valueOf(str);
                                zga.f(str3, valueOf.length() != 0 ? "Failed to load promotion: ".concat(valueOf) : new String("Failed to load promotion: "), e2);
                            }
                        }
                    });
                }
            }
        });
        this.g = i;
        if (this.f < i) {
            String.format(Locale.US, "clearing promotion storage: stored promotion counter ref id %d < %d", Integer.valueOf(this.f), Integer.valueOf(this.g));
            for (adkb adkbVar : hashMap.keySet()) {
                this.e.put(adkbVar, new adjz(adkbVar));
            }
            ynm.k(a(), angq.a, adha.i, ynm.b);
        }
    }

    public static final String e(adkb adkbVar) {
        String valueOf = String.valueOf(adkbVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("notification-type-");
        sb.append(valueOf);
        return sb.toString();
    }

    public final anhy a() {
        SharedPreferences.Editor edit = this.b.edit();
        int i = this.g;
        if (i > this.f) {
            edit.putInt("promotion_counter_ref_id", i);
        }
        for (adjz adjzVar : this.e.values()) {
            edit.putString(e(adjzVar.a), adjzVar.toString());
        }
        edit.commit();
        return anhv.a;
    }
}
