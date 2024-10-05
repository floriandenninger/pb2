package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agsb implements agsg {
    static final atrx c = atrx.SD;
    public static final /* synthetic */ int h = 0;
    private final amru a;
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    protected final SharedPreferences d;
    protected final aaea e;
    protected final agsd f;
    public final amru g;

    public agsb(SharedPreferences sharedPreferences, aaea aaeaVar, int i, agsd agsdVar) {
        this.d = sharedPreferences;
        this.e = aaeaVar;
        this.f = agsdVar;
        ArrayList arrayList = new ArrayList();
        for (atrx atrxVar : ahab.g.keySet()) {
            if (ahab.a(atrxVar, 0) <= i) {
                arrayList.add(atrxVar);
            }
        }
        amru o = amru.o(arrayList);
        this.a = o;
        ArrayList arrayList2 = new ArrayList();
        if (o.contains(atrx.LD)) {
            arrayList2.add(atrx.LD);
        }
        if (o.contains(atrx.SD)) {
            arrayList2.add(atrx.SD);
        }
        if (o.contains(atrx.HD)) {
            arrayList2.add(atrx.HD);
        }
        this.g = amru.o(arrayList2);
    }

    private static String a(String str) {
        return yny.L("offline_auto_offline_interval_%s", str);
    }

    private static String g(String str) {
        return yny.L("offline_resync_interval_%s", str);
    }

    @Override // defpackage.agsg
    public final void B(String str, long j) {
        this.d.edit().putLong(yny.L("last_offline_video_playback_position_sync_timestamp_%s", str), j).apply();
    }

    @Override // defpackage.agsg
    public final void C(String str, long j) {
        this.d.edit().putLong(yny.L("offline_auto_offline_execution_window_%s", str), j).apply();
    }

    @Override // defpackage.agsg
    public final void D(String str, long j) {
        ynm.m(this.f.a.b(new wgt(str, j, 4)), afka.n);
    }

    @Override // defpackage.agsg
    public final void E(atrx atrxVar) {
        amkq.E(atrxVar != atrx.UNKNOWN_FORMAT_TYPE);
        int a = ahab.a(atrxVar, -1);
        if (a != -1) {
            this.d.edit().putString(aghv.QUALITY, Integer.toString(a)).apply();
        }
    }

    @Override // defpackage.agsg
    public final void F(String str, long j) {
        this.d.edit().putLong(a(str), j).apply();
    }

    @Override // defpackage.agsg
    public final void G(String str, long j) {
        this.d.edit().putLong(g(str), j).apply();
    }

    @Override // defpackage.agsg
    public final void H(boolean z) {
        this.d.edit().putBoolean("offline_use_sd_card", z).apply();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((agsf) it.next()).j();
        }
    }

    @Override // defpackage.agsg
    public final void I(String str, boolean z) {
        this.d.edit().putBoolean(yny.L("should_record_offline_playback_last_position_%s", str), z).apply();
    }

    @Override // defpackage.agsg
    public final boolean J() {
        return this.g.size() > 1;
    }

    @Override // defpackage.agsg
    public final boolean K(String str) {
        return this.d.getBoolean(yny.L("should_record_offline_playback_last_position_%s", str), true);
    }

    @Override // defpackage.agsg
    public final boolean L() {
        return this.f.b();
    }

    @Override // defpackage.agsg
    public final boolean M(String str, String str2) {
        String L = yny.L("offline_identity_nonce_mapping_%s", str);
        if (this.d.edit().putString(L, str2).commit()) {
            return true;
        }
        this.d.edit().remove(L).apply();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean N(atsb atsbVar) {
        if (!J()) {
            return false;
        }
        atrx v = v(atrx.UNKNOWN_FORMAT_TYPE);
        return v == atrx.UNKNOWN_FORMAT_TYPE || !agnc.d(atsbVar).containsKey(v);
    }

    @Override // defpackage.agsg
    public final boolean O() {
        return this.d.getBoolean(aghv.PLAYLIST_WARNING, true);
    }

    @Override // defpackage.agsg
    public final boolean P() {
        return this.d.getBoolean("offline_use_sd_card", true);
    }

    @Override // defpackage.agsg
    public final void Q() {
    }

    @Override // defpackage.agsg
    public final void R(agsf agsfVar) {
        this.b.remove(agsfVar);
    }

    @Override // defpackage.agsg
    public final void S() {
        this.d.edit().putBoolean(aghv.PLAYLIST_WARNING, false).apply();
    }

    @Override // defpackage.agsg
    public final void T() {
    }

    @Override // defpackage.agsg
    public final int U(atrx atrxVar) {
        atph atphVar = this.e.a().g;
        if (atphVar == null) {
            atphVar = atph.a;
        }
        if (!atphVar.m) {
            return 1;
        }
        atrx atrxVar2 = atrx.UNKNOWN_FORMAT_TYPE;
        switch (atrxVar.ordinal()) {
            case 1:
            case 5:
                return 2;
            case 2:
            case 6:
                return 3;
            case 3:
            case 7:
            case 8:
            case 9:
                return 4;
            case 4:
            default:
                return 1;
        }
    }

    @Override // defpackage.agsg
    public ammy b() {
        return wgw.p;
    }

    @Override // defpackage.agsg
    public ammy c() {
        return wgw.q;
    }

    @Override // defpackage.agsg
    public amru d() {
        return this.g;
    }

    @Override // defpackage.agsg
    public Comparator e() {
        return ahab.e;
    }

    @Override // defpackage.agsg
    public Comparator f() {
        return ahab.c;
    }

    @Override // defpackage.agsg
    public boolean l() {
        return this.d.getBoolean(aghv.WIFI_POLICY, false);
    }

    @Override // defpackage.agsg
    public boolean m(atsb atsbVar, atom atomVar) {
        return N(atsbVar);
    }

    @Override // defpackage.agsg
    public boolean n() {
        return false;
    }

    @Override // defpackage.agsg
    public final long o(String str) {
        return this.d.getLong(yny.L("last_offline_video_playback_position_sync_timestamp_%s", str), 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agsg
    public final long p(String str) {
        awwj awwjVar = (awwj) this.f.a.c();
        awwh awwhVar = awwh.a;
        aoot aootVar = awwjVar.d;
        if (aootVar.containsKey(str)) {
            awwhVar = (awwh) aootVar.get(str);
        }
        return awwhVar.c;
    }

    @Override // defpackage.agsg
    public final long q(String str) {
        return this.d.getLong(a(str), 0L);
    }

    @Override // defpackage.agsg
    public final long r(String str) {
        return this.d.getLong(g(str), 0L);
    }

    @Override // defpackage.agsg
    public final amru s() {
        return this.a;
    }

    @Override // defpackage.agsg
    public final anhy t(final awwg awwgVar) {
        return this.f.b.b(new amml() { // from class: agsc
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                awwg awwgVar2 = awwg.this;
                aone builder = ((awwj) obj).toBuilder();
                builder.copyOnWrite();
                awwj awwjVar = (awwj) builder.instance;
                awwjVar.c = awwgVar2.e;
                awwjVar.b |= 1;
                return (awwj) builder.build();
            }
        });
    }

    @Override // defpackage.agsg
    public final atrx u() {
        return v(c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final atrx v(atrx atrxVar) {
        String string = this.d.getString(aghv.QUALITY, null);
        if (string != null) {
            try {
                int parseInt = Integer.parseInt(string);
                amxe it = this.a.iterator();
                while (it.hasNext()) {
                    atrx atrxVar2 = (atrx) it.next();
                    if (ahab.a(atrxVar2, -1) == parseInt) {
                        return atrxVar2;
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        return atrxVar;
    }

    @Override // defpackage.agsg
    public final awwg w() {
        if (this.f.b()) {
            awwg b = awwg.b(((awwj) this.f.b.c()).c);
            if (b == null) {
                b = awwg.UNKNOWN;
            }
            return b == awwg.UNKNOWN ? awwg.UNMETERED_WIFI_OR_UNMETERED_MOBILE : b;
        }
        if (l()) {
            return awwg.UNMETERED_WIFI_OR_UNMETERED_MOBILE;
        }
        return awwg.ANY;
    }

    @Override // defpackage.agsg
    public final String x(String str) {
        return this.d.getString(yny.L("offline_identity_nonce_mapping_%s", str), str);
    }

    @Override // defpackage.agsg
    public final String y(yxn yxnVar) {
        return this.d.getString("video_storage_location_on_sdcard", yxnVar.e(yxnVar.c()));
    }

    @Override // defpackage.agsg
    public final void z(agsf agsfVar) {
        this.b.add(agsfVar);
    }
}
