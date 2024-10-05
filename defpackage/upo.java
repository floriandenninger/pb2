package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class upo {
    public final upm a;
    public final azrw b;
    public final uue c;
    public final azrw d;
    public final unx e;
    private final unq f;
    private final Executor g;

    public upo(upm upmVar, azrw azrwVar, unq unqVar, uuf uufVar, azrw azrwVar2, unx unxVar, Executor executor, axpg axpgVar, azrw azrwVar3) {
        this.a = upmVar;
        this.f = unqVar;
        this.b = azrwVar;
        this.g = executor;
        this.d = new egv(azrwVar2, 5);
        Context context = (Context) uufVar.a.get();
        context.getClass();
        Executor executor2 = (Executor) uufVar.b.get();
        executor2.getClass();
        uui uuiVar = (uui) uufVar.c.get();
        uuiVar.getClass();
        Boolean bool = (Boolean) uufVar.d.get();
        bool.getClass();
        this.c = new uue(context, executor2, uuiVar, axpgVar, bool.booleanValue(), azrwVar3);
        this.e = unxVar;
    }

    public final long a(String str) {
        if (this.f.b) {
            return -1L;
        }
        uue uueVar = this.c;
        uua uuaVar = uueVar.d;
        int intValue = ((Integer) uuaVar.b.get()).intValue();
        if (intValue == 0) {
            return -1L;
        }
        if (intValue != Integer.MAX_VALUE) {
            synchronized (uuaVar.a) {
                if (uuaVar.d >= intValue) {
                    long j = uuaVar.e;
                    shf shfVar = uuaVar.c;
                    if (SystemClock.elapsedRealtime() - j <= 1000) {
                        return -1L;
                    }
                }
            }
        }
        boolean z = uueVar.c;
        uuj uujVar = uueVar.b;
        if (z) {
            return uujVar.a(str);
        }
        return -1L;
    }

    public final anhy b(final upk upkVar) {
        return this.f.b ? anaf.M() : anaf.R(new Runnable() { // from class: upn
            @Override // java.lang.Runnable
            public final void run() {
                bacs d;
                int i;
                amyo[] amyoVarArr;
                upo upoVar = upo.this;
                upk upkVar2 = upkVar;
                if (upkVar2.g) {
                    aone createBuilder = bacs.a.createBuilder();
                    createBuilder.copyOnWrite();
                    bacs bacsVar = (bacs) createBuilder.instance;
                    bacsVar.d = 2;
                    bacsVar.b |= 4;
                    d = (bacs) createBuilder.build();
                } else {
                    Long l = upkVar2.f;
                    uue uueVar = upoVar.c;
                    boolean z = uueVar.c;
                    uuj uujVar = uueVar.b;
                    if (z) {
                        d = uujVar.b(l);
                    } else {
                        d = uujVar.d();
                    }
                }
                if (d.c == -1) {
                    return;
                }
                ups upsVar = (ups) upoVar.b.get();
                bact bactVar = upkVar2.c;
                aone builder = bactVar.toBuilder();
                aone createBuilder2 = bacf.a.createBuilder();
                int i2 = upsVar.h;
                createBuilder2.copyOnWrite();
                bacf bacfVar = (bacf) createBuilder2.instance;
                bacfVar.e = i2 - 1;
                bacfVar.b |= 4;
                String str = upsVar.b;
                if (str != null) {
                    createBuilder2.copyOnWrite();
                    bacf bacfVar2 = (bacf) createBuilder2.instance;
                    bacfVar2.b |= 1;
                    bacfVar2.c = str;
                }
                createBuilder2.copyOnWrite();
                bacf bacfVar3 = (bacf) createBuilder2.instance;
                bacfVar3.b |= 8;
                bacfVar3.f = 396895652L;
                String str2 = upsVar.d;
                if (str2 != null) {
                    createBuilder2.copyOnWrite();
                    bacf bacfVar4 = (bacf) createBuilder2.instance;
                    bacfVar4.b |= 2;
                    bacfVar4.d = str2;
                }
                String str3 = upsVar.c;
                if (str3 != null) {
                    createBuilder2.copyOnWrite();
                    bacf bacfVar5 = (bacf) createBuilder2.instance;
                    bacfVar5.b |= 16;
                    bacfVar5.g = str3;
                }
                builder.copyOnWrite();
                bact bactVar2 = (bact) builder.instance;
                bacf bacfVar6 = (bacf) createBuilder2.build();
                bacfVar6.getClass();
                bactVar2.f = bacfVar6;
                bactVar2.b |= 16;
                if (slf.e(upsVar.a)) {
                    aone createBuilder3 = bacj.a.createBuilder();
                    long freeSpace = upsVar.e.a().getFreeSpace();
                    createBuilder3.copyOnWrite();
                    bacj bacjVar = (bacj) createBuilder3.instance;
                    bacjVar.b |= 1;
                    bacjVar.c = freeSpace / 1024;
                    long longValue = ((Long) upsVar.f.get()).longValue();
                    createBuilder3.copyOnWrite();
                    bacj bacjVar2 = (bacj) createBuilder3.instance;
                    bacjVar2.b = 2 | bacjVar2.b;
                    bacjVar2.d = longValue;
                    builder.copyOnWrite();
                    bact bactVar3 = (bact) builder.instance;
                    bacj bacjVar3 = (bacj) createBuilder3.build();
                    bacjVar3.getClass();
                    bactVar3.q = bacjVar3;
                    bactVar3.b |= 2097152;
                }
                amnv amnvVar = upsVar.g;
                if (!TextUtils.isEmpty(null)) {
                    bace baceVar = bactVar.p;
                    if (baceVar == null) {
                        baceVar = bace.a;
                    }
                    aone builder2 = baceVar.toBuilder();
                    if (((bace) builder2.instance).c.isEmpty()) {
                        builder2.copyOnWrite();
                        throw null;
                    }
                    String str4 = ((String) null) + "::" + ((bace) builder2.instance).c;
                    builder2.copyOnWrite();
                    bace baceVar2 = (bace) builder2.instance;
                    str4.getClass();
                    baceVar2.b |= 1;
                    baceVar2.c = str4;
                    builder.copyOnWrite();
                    bact bactVar4 = (bact) builder.instance;
                    bace baceVar3 = (bace) builder2.build();
                    baceVar3.getClass();
                    bactVar4.p = baceVar3;
                    bactVar4.b |= 524288;
                }
                aone builder3 = ((bact) builder.build()).toBuilder();
                builder3.copyOnWrite();
                bact bactVar5 = (bact) builder3.instance;
                d.getClass();
                bactVar5.r = d;
                bactVar5.b |= 33554432;
                unw unwVar = upkVar2.h;
                if (unwVar != null) {
                    ArrayList arrayList = new ArrayList();
                    int i3 = 0;
                    while (true) {
                        uny[] unyVarArr = unwVar.b;
                        if (i3 >= unyVarArr.length) {
                            break;
                        }
                        uny unyVar = unyVarArr[i3];
                        int i4 = unwVar.c[i3];
                        int max = Math.max(i4 - Math.min(100, 19), 0);
                        int i5 = i4 - max;
                        if (i5 <= 0) {
                            amyoVarArr = new amyo[0];
                        } else {
                            amyo[] amyoVarArr2 = new amyo[i5];
                            for (int i6 = 0; i6 < i5; i6++) {
                                amyoVarArr2[i6] = (amyo) unyVar.a.get((i6 + max) % 20);
                            }
                            int i7 = unyVar.b;
                            if (i4 <= 0) {
                                i = -i4;
                            } else {
                                int i8 = unyVar.c;
                                i = (Integer.MAX_VALUE - i4) - 27;
                            }
                            int i9 = (i - (20 - i5)) + 1;
                            if (i9 >= i5) {
                                amyoVarArr = new amyo[0];
                            } else if (i9 > 0) {
                                int i10 = i5 - i9;
                                amyoVarArr = new amyo[i10];
                                System.arraycopy(amyoVarArr2, i9, amyoVarArr, 0, i10);
                            } else {
                                amyoVarArr = amyoVarArr2;
                            }
                        }
                        for (amyo amyoVar : amyoVarArr) {
                            arrayList.add(new unv(amyoVar, i3));
                        }
                        i3++;
                    }
                    Collections.sort(arrayList, unt.a);
                    aone createBuilder4 = baci.a.createBuilder();
                    long j = 0;
                    for (int max2 = Math.max(arrayList.size() - 100, 0); max2 < arrayList.size(); max2++) {
                        unv unvVar = (unv) arrayList.get(max2);
                        amyo amyoVar2 = unvVar.a;
                        int i11 = unvVar.b;
                        amxs f = amyoVar2.f();
                        String b = f.b();
                        String d2 = f.d();
                        int a = f.a();
                        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 13 + d2.length());
                        sb.append(b);
                        sb.append(".");
                        sb.append(d2);
                        sb.append(":");
                        sb.append(a);
                        Long a2 = anrs.a(sb.toString());
                        if (a2 != null) {
                            long longValue2 = a2.longValue();
                            createBuilder4.copyOnWrite();
                            baci baciVar = (baci) createBuilder4.instance;
                            aonx aonxVar = baciVar.b;
                            if (!aonxVar.c()) {
                                baciVar.b = aonm.mutableCopy(aonxVar);
                            }
                            baciVar.b.f(longValue2);
                            long e = amyoVar2.e() / 1000000;
                            long j2 = e - j;
                            createBuilder4.copyOnWrite();
                            baci baciVar2 = (baci) createBuilder4.instance;
                            aonx aonxVar2 = baciVar2.c;
                            if (!aonxVar2.c()) {
                                baciVar2.c = aonm.mutableCopy(aonxVar2);
                            }
                            baciVar2.c.f(j2);
                            createBuilder4.copyOnWrite();
                            baci baciVar3 = (baci) createBuilder4.instance;
                            aonu aonuVar = baciVar3.d;
                            if (!aonuVar.c()) {
                                baciVar3.d = aonm.mutableCopy(aonuVar);
                            }
                            baciVar3.d.g(i11);
                            j = e;
                        }
                    }
                    baci baciVar4 = (baci) createBuilder4.build();
                    builder3.copyOnWrite();
                    bact bactVar6 = (bact) builder3.instance;
                    baciVar4.getClass();
                    bactVar6.s = baciVar4;
                    bactVar6.b |= 67108864;
                }
                String str5 = upkVar2.a;
                if (upkVar2.b) {
                    if (str5 == null) {
                        builder3.copyOnWrite();
                        bact bactVar7 = (bact) builder3.instance;
                        bactVar7.b &= -32769;
                        bactVar7.o = bact.a.o;
                    } else {
                        builder3.copyOnWrite();
                        bact bactVar8 = (bact) builder3.instance;
                        bactVar8.b |= 32768;
                        bactVar8.o = str5;
                    }
                } else if (str5 == null) {
                    builder3.copyOnWrite();
                    bact bactVar9 = (bact) builder3.instance;
                    bactVar9.b &= -5;
                    bactVar9.e = bact.a.e;
                } else {
                    builder3.copyOnWrite();
                    bact bactVar10 = (bact) builder3.instance;
                    bactVar10.b |= 4;
                    bactVar10.e = str5;
                }
                Object obj = upoVar.d.get();
                babg babgVar = upkVar2.d;
                if (obj != null || babgVar != null) {
                    if (obj != null && babgVar != null) {
                        aong aongVar = (aong) ((aonm) obj).toBuilder();
                        aongVar.mergeFrom((aonm) babgVar);
                        obj = (babg) aongVar.build();
                    } else if (obj == null) {
                        babgVar.getClass();
                        obj = babgVar;
                    }
                    builder3.copyOnWrite();
                    bact bactVar11 = (bact) builder3.instance;
                    obj.getClass();
                    bactVar11.m = (babg) obj;
                    bactVar11.b |= 8192;
                }
                String str6 = upkVar2.e;
                if (str6 != null) {
                    aone createBuilder5 = bace.a.createBuilder();
                    createBuilder5.copyOnWrite();
                    bace baceVar4 = (bace) createBuilder5.instance;
                    baceVar4.b |= 1;
                    baceVar4.c = str6;
                    builder3.copyOnWrite();
                    bact bactVar12 = (bact) builder3.instance;
                    bace baceVar5 = (bace) createBuilder5.build();
                    baceVar5.getClass();
                    bactVar12.p = baceVar5;
                    bactVar12.b |= 524288;
                }
                upm upmVar = upoVar.a;
                bact bactVar13 = (bact) builder3.build();
                amru amruVar = (amru) upmVar.b.get();
                int size = amruVar.size();
                RuntimeException runtimeException = null;
                for (int i12 = 0; i12 < size; i12++) {
                    try {
                        ((uuq) amruVar.get(i12)).b(bactVar13);
                    } catch (RuntimeException e2) {
                        ((amxh) ((amxh) ((amxh) upm.a.g()).h(e2)).i("com/google/android/libraries/performance/primes/metrics/core/MetricDispatcher", "dispatch", ':', "MetricDispatcher.java")).q("One transmitter failed to send message");
                        if (runtimeException == null) {
                            runtimeException = e2;
                        }
                    }
                }
                if (runtimeException != null) {
                    throw runtimeException;
                }
                uua uuaVar = upoVar.c.d;
                shf shfVar = uuaVar.c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                synchronized (uuaVar.a) {
                    uuaVar.d++;
                    if (elapsedRealtime - uuaVar.e > 1000) {
                        uuaVar.d = 0;
                        uuaVar.e = elapsedRealtime;
                    }
                }
            }
        }, this.g);
    }

    public final boolean c(String str) {
        return a(str) != -1;
    }
}
