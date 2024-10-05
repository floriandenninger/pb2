package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agab implements agaf {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    private final Executor b;
    private final SharedPreferences c;
    private final ywr d;

    public agab(SharedPreferences sharedPreferences, ywr ywrVar, Executor executor) {
        executor.getClass();
        this.b = executor;
        this.c = sharedPreferences;
        this.d = ywrVar;
    }

    @Override // defpackage.agaf
    public final void a(String str, boolean z) {
        this.c.edit().putBoolean(str, z).apply();
        if (TextUtils.equals("video_notifications_enabled", str)) {
            Runnable runnable = new Runnable() { // from class: agaa
                @Override // java.lang.Runnable
                public final void run() {
                    Iterator it = agab.this.a.iterator();
                    while (it.hasNext()) {
                        ((agae) it.next()).d();
                    }
                }
            };
            if (yjk.h()) {
                runnable.run();
            } else {
                this.b.execute(runnable);
            }
        }
    }

    @Override // defpackage.agaf
    public final void b(agae agaeVar) {
        this.a.add(agaeVar);
    }

    @Override // defpackage.agaf
    public final boolean c(String str, boolean z) {
        return this.c.getBoolean(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agaf
    public final int d(String str) {
        awwf awwfVar = (awwf) this.d.c();
        String concat = str.length() != 0 ? "com.google.android.libraries.youtube.notification.badgecount.badgecount".concat(str) : new String("com.google.android.libraries.youtube.notification.badgecount.badgecount");
        concat.getClass();
        aoot aootVar = awwfVar.l;
        if (aootVar.containsKey(concat)) {
            return ((Integer) aootVar.get(concat)).intValue();
        }
        return 0;
    }

    @Override // defpackage.agaf
    public final long e() {
        return ((awwf) this.d.c()).f;
    }

    @Override // defpackage.agaf
    public final ammv f() {
        return (((awwf) this.d.c()).b & 64) != 0 ? ammv.j(Boolean.valueOf(((awwf) this.d.c()).i)) : amlr.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agaf
    public final ammv g(String str) {
        awwf awwfVar = (awwf) this.d.c();
        Map unmodifiableMap = Collections.unmodifiableMap(awwfVar.m);
        String valueOf = String.valueOf(str);
        if (!unmodifiableMap.containsKey(valueOf.length() != 0 ? "com.google.android.libraries.youtube.notification.pref.notification_channel_importance".concat(valueOf) : new String("com.google.android.libraries.youtube.notification.pref.notification_channel_importance"))) {
            return amlr.a;
        }
        String valueOf2 = String.valueOf(str);
        String concat = valueOf2.length() != 0 ? "com.google.android.libraries.youtube.notification.pref.notification_channel_importance".concat(valueOf2) : new String("com.google.android.libraries.youtube.notification.pref.notification_channel_importance");
        concat.getClass();
        aoot aootVar = awwfVar.m;
        int intValue = aootVar.containsKey(concat) ? ((Integer) aootVar.get(concat)).intValue() : 0;
        String valueOf3 = String.valueOf(str);
        String concat2 = valueOf3.length() != 0 ? "com.google.android.libraries.youtube.notification.pref.notification_channel_sound_enabled".concat(valueOf3) : new String("com.google.android.libraries.youtube.notification.pref.notification_channel_sound_enabled");
        concat2.getClass();
        aoot aootVar2 = awwfVar.n;
        return ammv.j(new agad(intValue, aootVar2.containsKey(concat2) ? ((Boolean) aootVar2.get(concat2)).booleanValue() : false));
    }

    @Override // defpackage.agaf
    public final ammv h() {
        return (((awwf) this.d.c()).b & 16) != 0 ? ammv.j(Boolean.valueOf(((awwf) this.d.c()).g)) : amlr.a;
    }

    @Override // defpackage.agaf
    public final ammv i() {
        return (((awwf) this.d.c()).b & 32) != 0 ? ammv.j(Long.valueOf(((awwf) this.d.c()).h)) : amlr.a;
    }

    @Override // defpackage.agaf
    public final anhy j(String str, int i) {
        return this.d.b(new uko(str, i, 2));
    }

    @Override // defpackage.agaf
    public final anhy k(final agac agacVar) {
        return this.d.b(new amml() { // from class: agag
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                agac agacVar2 = agac.this;
                aone builder = ((awwf) obj).toBuilder();
                aqkg aqkgVar = agacVar2.b;
                builder.copyOnWrite();
                awwf awwfVar = (awwf) builder.instance;
                awwfVar.c = aqkgVar;
                awwfVar.b |= 1;
                long j = agacVar2.a;
                builder.copyOnWrite();
                awwf awwfVar2 = (awwf) builder.instance;
                awwfVar2.b |= 2;
                awwfVar2.d = j;
                return (awwf) builder.build();
            }
        });
    }

    @Override // defpackage.agaf
    public final anhy l(String str) {
        return this.d.b(new wgs(str, 18));
    }

    @Override // defpackage.agaf
    public final anhy m(long j) {
        return this.d.b(new fjv(j, 12));
    }

    @Override // defpackage.agaf
    public final anhy n(boolean z) {
        return this.d.b(new agai(z, 1));
    }

    @Override // defpackage.agaf
    public final anhy o(final String str, final agad agadVar) {
        return this.d.b(new amml() { // from class: agah
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                String str2 = str;
                agad agadVar2 = agadVar;
                aone builder = ((awwf) obj).toBuilder();
                String valueOf = String.valueOf(str2);
                builder.bw(valueOf.length() != 0 ? "com.google.android.libraries.youtube.notification.pref.notification_channel_importance".concat(valueOf) : new String("com.google.android.libraries.youtube.notification.pref.notification_channel_importance"), agadVar2.a);
                String valueOf2 = String.valueOf(str2);
                builder.bx(valueOf2.length() != 0 ? "com.google.android.libraries.youtube.notification.pref.notification_channel_sound_enabled".concat(valueOf2) : new String("com.google.android.libraries.youtube.notification.pref.notification_channel_sound_enabled"), agadVar2.b);
                return (awwf) builder.build();
            }
        });
    }

    @Override // defpackage.agaf
    public final anhy p(boolean z) {
        return this.d.b(new agai(z, 0));
    }

    @Override // defpackage.agaf
    public final anhy q(long j) {
        return this.d.b(new fjv(j, 13));
    }

    @Override // defpackage.agaf
    public final anhy r(boolean z) {
        return this.d.b(new agai(z, 2));
    }

    @Override // defpackage.agaf
    public final String s() {
        return ((awwf) this.d.c()).e;
    }

    @Override // defpackage.agaf
    public final boolean t() {
        return ((awwf) this.d.c()).k;
    }
}
