package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afsm implements afqm {
    public final Executor a;
    public volatile Map b;
    public final azrw c;
    public final ammv d;
    public volatile boolean e;
    public final boolean f;
    private final azrw g;
    private final axpg h;

    public afsm(Executor executor, azrw azrwVar, axpg axpgVar, ynx ynxVar, azrw azrwVar2, ammv ammvVar) {
        this.a = executor;
        this.h = axpgVar;
        this.g = azrwVar;
        asuf asufVar = ynxVar.a().r;
        aqun aqunVar = (asufVar == null ? asuf.a : asufVar).b;
        this.f = (aqunVar == null ? aqun.a : aqunVar).b;
        this.c = azrwVar2;
        this.d = ammvVar;
    }

    @Override // defpackage.afqm
    public final int a() {
        return 72;
    }

    @Override // defpackage.afqm
    public final int b() {
        return (int) TimeUnit.HOURS.toMinutes(72L);
    }

    @Override // defpackage.afqm
    public final List c() {
        return amru.u(10, 60, 3600, 43200);
    }

    @Override // defpackage.afqm
    public final boolean d() {
        return true;
    }

    public final Map e(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("exception.message", str);
        }
        hashMap.putAll(this.b);
        return hashMap;
    }

    public final synchronized void f() {
        this.e = false;
        this.b = null;
    }

    public final synchronized void g() {
        this.e = true;
    }

    public final void h(zhy zhyVar, Map map) {
        afug e = afuh.e("ecatcher");
        e.d = true;
        e.f = map;
        e.b(zhyVar.a());
        if (this.e) {
            ((afuh) this.g.get()).b(this, e, new afsl(0));
        }
    }

    public final zhy i(int i, int i2, String str) {
        zhy b = zhy.b(Uri.parse("https://www.youtube.com/error_204"));
        b.h("log.level", adyu.B(i));
        b.h("exception.category", adyu.C(i2));
        if (str != null) {
            b.h("exception.type", str);
        }
        b.h("t", "androiderror");
        ((afqj) this.h.get()).d(b);
        return b;
    }

    public final aptu j(int i, int i2, String str, Throwable th) {
        apty aptyVar;
        aone createBuilder = aptx.a.createBuilder();
        int i3 = 3;
        int i4 = i + (-1) != 0 ? 3 : 2;
        createBuilder.copyOnWrite();
        aptx aptxVar = (aptx) createBuilder.instance;
        aptxVar.d = i4 - 1;
        aptxVar.b |= 2;
        createBuilder.copyOnWrite();
        aptx aptxVar2 = (aptx) createBuilder.instance;
        str.getClass();
        aptxVar2.b |= 1;
        aptxVar2.c = str;
        if (th != null) {
            String canonicalName = th.getClass().getCanonicalName();
            createBuilder.copyOnWrite();
            aptx aptxVar3 = (aptx) createBuilder.instance;
            canonicalName.getClass();
            aptxVar3.b |= 4;
            aptxVar3.e = canonicalName;
        }
        aone createBuilder2 = aptu.a.createBuilder();
        createBuilder2.copyOnWrite();
        aptu aptuVar = (aptu) createBuilder2.instance;
        aptx aptxVar4 = (aptx) createBuilder.build();
        aptxVar4.getClass();
        aptuVar.e = aptxVar4;
        aptuVar.b |= 4;
        aone createBuilder3 = aptv.a.createBuilder();
        switch (i2 - 1) {
            case 0:
                i3 = 2;
                break;
            case 1:
                break;
            case 2:
                i3 = 4;
                break;
            case 3:
                i3 = 6;
                break;
            case 4:
                i3 = 9;
                break;
            case 5:
                i3 = 16;
                break;
            case 6:
                i3 = 28;
                break;
            case 7:
                i3 = 19;
                break;
            case 8:
                i3 = 27;
                break;
            case 9:
                i3 = 21;
                break;
            case 10:
                i3 = 20;
                break;
            case 11:
                i3 = 13;
                break;
            case 12:
                i3 = 17;
                break;
            case 13:
                i3 = 10;
                break;
            case 14:
                i3 = 22;
                break;
            case 15:
                i3 = 7;
                break;
            case 16:
                i3 = 26;
                break;
            case 17:
                i3 = 8;
                break;
            case 18:
                i3 = 25;
                break;
            case 19:
                i3 = 11;
                break;
            case 20:
                i3 = 15;
                break;
            case 21:
                i3 = 18;
                break;
            case 22:
                i3 = 5;
                break;
            case 23:
                i3 = 23;
                break;
            case 24:
                i3 = 14;
                break;
            case 25:
                i3 = 12;
                break;
            case 26:
                i3 = 29;
                break;
            case 27:
            case 29:
            default:
                i3 = 1;
                break;
            case 28:
                i3 = 31;
                break;
            case 30:
                i3 = 33;
                break;
            case 31:
                i3 = 34;
                break;
        }
        createBuilder3.copyOnWrite();
        aptv aptvVar = (aptv) createBuilder3.instance;
        aptvVar.c = i3 - 1;
        aptvVar.b |= 1;
        Map map = this.b;
        aone createBuilder4 = apty.a.createBuilder();
        if (map == null) {
            aptyVar = (apty) createBuilder4.build();
        } else {
            if (map.containsKey("innertube.run.job")) {
                String str2 = (String) map.get("innertube.run.job");
                createBuilder4.copyOnWrite();
                apty aptyVar2 = (apty) createBuilder4.instance;
                str2.getClass();
                aptyVar2.b |= 32;
                aptyVar2.g = str2;
            }
            if (map.containsKey("innertube.build.label")) {
                String str3 = (String) map.get("innertube.build.label");
                createBuilder4.copyOnWrite();
                apty aptyVar3 = (apty) createBuilder4.instance;
                str3.getClass();
                aptyVar3.b = 4 | aptyVar3.b;
                aptyVar3.e = str3;
            }
            if (map.containsKey("innertube.build.timestamp")) {
                long parseLong = Long.parseLong((String) map.get("innertube.build.timestamp"), 10);
                createBuilder4.copyOnWrite();
                apty aptyVar4 = (apty) createBuilder4.instance;
                aptyVar4.b = 8 | aptyVar4.b;
                aptyVar4.f = parseLong;
            }
            if (map.containsKey("innertube.build.changelist")) {
                long parseLong2 = Long.parseLong((String) map.get("innertube.build.changelist"), 10);
                createBuilder4.copyOnWrite();
                apty aptyVar5 = (apty) createBuilder4.instance;
                aptyVar5.b |= 1;
                aptyVar5.c = parseLong2;
            }
            if (map.containsKey("innertube.build.experiments.source_version")) {
                long parseLong3 = Long.parseLong((String) map.get("innertube.build.experiments.source_version"), 10);
                createBuilder4.copyOnWrite();
                apty aptyVar6 = (apty) createBuilder4.instance;
                aptyVar6.b |= 2;
                aptyVar6.d = parseLong3;
            }
            aptyVar = (apty) createBuilder4.build();
        }
        createBuilder3.copyOnWrite();
        aptv aptvVar2 = (aptv) createBuilder3.instance;
        aptyVar.getClass();
        aptvVar2.d = aptyVar;
        aptvVar2.b |= 2;
        createBuilder2.copyOnWrite();
        aptu aptuVar2 = (aptu) createBuilder2.instance;
        aptv aptvVar3 = (aptv) createBuilder3.build();
        aptvVar3.getClass();
        aptuVar2.c = aptvVar3;
        aptuVar2.b |= 1;
        if (th != null) {
            if (afsn.b(th)) {
                th = afsn.a(th);
            }
            aone createBuilder5 = aptw.a.createBuilder();
            aone createBuilder6 = apts.a.createBuilder();
            aomf byteString = ((andu) anaf.av(th).build()).toByteString();
            createBuilder6.copyOnWrite();
            apts aptsVar = (apts) createBuilder6.instance;
            aptsVar.b |= 1;
            aptsVar.c = byteString;
            apts aptsVar2 = (apts) createBuilder6.build();
            createBuilder5.copyOnWrite();
            aptw aptwVar = (aptw) createBuilder5.instance;
            aptsVar2.getClass();
            aptwVar.c = aptsVar2;
            aptwVar.b = 2;
            createBuilder2.copyOnWrite();
            aptu aptuVar3 = (aptu) createBuilder2.instance;
            aptw aptwVar2 = (aptw) createBuilder5.build();
            aptwVar2.getClass();
            aptuVar3.d = aptwVar2;
            aptuVar3.b |= 2;
        }
        return (aptu) createBuilder2.build();
    }
}
