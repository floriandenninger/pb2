package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rgm extends rka implements rel {
    public final Map a;
    public final Map b;
    public final Map c;
    final aef d;
    public final Map e;
    final rgk f;
    private final Map g;
    private final Map h;

    public rgm(rki rkiVar) {
        super(rkiVar);
        this.a = new adz();
        this.g = new adz();
        this.h = new adz();
        this.b = new adz();
        this.e = new adz();
        this.c = new adz();
        this.d = new rgj(this);
        this.f = new rgk(this);
    }

    private final rku m(String str, byte[] bArr) {
        if (bArr != null) {
            try {
                rku rkuVar = (rku) ((aone) rkj.i(rku.a.createBuilder(), bArr)).build();
                aF().k.c("Parsed config. version, gmp_app_id", (rkuVar.b & 1) != 0 ? Long.valueOf(rkuVar.c) : null, (rkuVar.b & 2) != 0 ? rkuVar.d : null);
                return rkuVar;
            } catch (aoob e) {
                aF().f.c("Unable to merge remote config. appId", rfp.a(str), e);
                return rku.a;
            } catch (RuntimeException e2) {
                aF().f.c("Unable to merge remote config. appId", rfp.a(str), e2);
                return rku.a;
            }
        }
        return rku.a;
    }

    private static final Map o(rku rkuVar) {
        adz adzVar = new adz();
        if (rkuVar != null) {
            for (rkv rkvVar : rkuVar.e) {
                adzVar.put(rkvVar.b, rkvVar.c);
            }
        }
        return adzVar;
    }

    private final void p(String str, aone aoneVar) {
        adz adzVar = new adz();
        adz adzVar2 = new adz();
        adz adzVar3 = new adz();
        if (aoneVar != null) {
            for (int i = 0; i < ((rku) aoneVar.instance).f.size(); i++) {
                aone builder = ((rkt) ((rku) aoneVar.instance).f.get(i)).toBuilder();
                if (!TextUtils.isEmpty(((rkt) builder.instance).c)) {
                    String str2 = ((rkt) builder.instance).c;
                    String b = rhi.b(str2);
                    if (!TextUtils.isEmpty(b)) {
                        builder.copyOnWrite();
                        rkt rktVar = (rkt) builder.instance;
                        b.getClass();
                        rktVar.b |= 1;
                        rktVar.c = b;
                        aoneVar.copyOnWrite();
                        rku rkuVar = (rku) aoneVar.instance;
                        rkt rktVar2 = (rkt) builder.build();
                        rktVar2.getClass();
                        aony aonyVar = rkuVar.f;
                        if (!aonyVar.c()) {
                            rkuVar.f = aonm.mutableCopy(aonyVar);
                        }
                        rkuVar.f.set(i, rktVar2);
                    }
                    adzVar.put(str2, Boolean.valueOf(((rkt) builder.instance).d));
                    rkt rktVar3 = (rkt) builder.instance;
                    adzVar2.put(rktVar3.c, Boolean.valueOf(rktVar3.e));
                    rkt rktVar4 = (rkt) builder.instance;
                    if ((rktVar4.b & 8) != 0) {
                        int i2 = rktVar4.f;
                        if (i2 < 2 || i2 > 65535) {
                            rfn rfnVar = aF().f;
                            rkt rktVar5 = (rkt) builder.instance;
                            rfnVar.c("Invalid sampling rate. Event name, sample rate", rktVar5.c, Integer.valueOf(rktVar5.f));
                        } else {
                            adzVar3.put(rktVar4.c, Integer.valueOf(i2));
                        }
                    }
                } else {
                    aF().f.a("EventConfig contained null event name");
                }
            }
        }
        this.g.put(str, adzVar);
        this.h.put(str, adzVar2);
        this.c.put(str, adzVar3);
    }

    @Override // defpackage.rel
    public final String a(String str, String str2) {
        n();
        d(str);
        Map map = (Map) this.a.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // defpackage.rka
    protected final void b() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final rku c(String str) {
        V();
        n();
        qip.ax(str);
        d(str);
        return (rku) this.b.get(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        if (r2 == null) goto L28;
     */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0114: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:41:0x0114 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgm.d(java.lang.String):void");
    }

    public final void e(String str, rku rkuVar) {
        dyh dyhVar;
        if (rkuVar.i.size() == 0) {
            this.d.i(str);
            return;
        }
        aF().k.b("EES programs found", Integer.valueOf(rkuVar.i.size()));
        rlk rlkVar = (rlk) rkuVar.i.get(0);
        try {
            dxh dxhVar = new dxh();
            dxhVar.a("internal.remoteConfig", new rgi(this, str, 1));
            dxhVar.a("internal.appMetadata", new rgi(this, str, 2));
            dxhVar.a("internal.logger", new Callable() { // from class: rgh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new dxs(rgm.this.f);
                }
            });
            try {
                dxhVar.b = dxhVar.a.a();
                if (!(dxhVar.a.b(dxhVar.b, (rll[]) rlkVar.b.toArray(new rll[0])) instanceof dyf)) {
                    rli rliVar = rlkVar.c;
                    if (rliVar == null) {
                        rliVar = rli.a;
                    }
                    for (rlj rljVar : rliVar.b) {
                        aony aonyVar = rljVar.c;
                        String str2 = rljVar.b;
                        Iterator it = aonyVar.iterator();
                        while (it.hasNext()) {
                            dyn b = dxhVar.a.b(dxhVar.b, (rll) it.next());
                            if (b instanceof dyk) {
                                dxk dxkVar = dxhVar.b;
                                if (dxkVar.h(str2)) {
                                    dyn d = dxkVar.d(str2);
                                    if (d instanceof dyh) {
                                        dyhVar = (dyh) d;
                                    } else {
                                        String valueOf = String.valueOf(str2);
                                        throw new IllegalStateException(valueOf.length() != 0 ? "Invalid function name: ".concat(valueOf) : new String("Invalid function name: "));
                                    }
                                } else {
                                    dyhVar = null;
                                }
                                if (dyhVar != null) {
                                    dyhVar.a(dxhVar.b, Collections.singletonList(b));
                                } else {
                                    String valueOf2 = String.valueOf(str2);
                                    throw new IllegalStateException(valueOf2.length() != 0 ? "Rule function is undefined: ".concat(valueOf2) : new String("Rule function is undefined: "));
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                    this.d.d(str, dxhVar);
                    rfn rfnVar = aF().k;
                    rli rliVar2 = rlkVar.c;
                    if (rliVar2 == null) {
                        rliVar2 = rli.a;
                    }
                    rfnVar.c("EES program loaded for appId, activities", str, Integer.valueOf(rliVar2.b.size()));
                    rli rliVar3 = rlkVar.c;
                    if (rliVar3 == null) {
                        rliVar3 = rli.a;
                    }
                    Iterator it2 = rliVar3.b.iterator();
                    while (it2.hasNext()) {
                        aF().k.b("EES program activity", ((rlj) it2.next()).b);
                    }
                    return;
                }
                throw new IllegalStateException("Program loading failed");
            } catch (Throwable th) {
                throw new dxi(th);
            }
        } catch (dxi unused) {
            aF().c.b("Failed to load EES program. appId", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(String str) {
        n();
        rku c = c(str);
        if (c == null) {
            return false;
        }
        return c.h;
    }

    public final boolean g(String str) {
        rku rkuVar;
        axvz.b();
        return (!J().o(rfd.at) || TextUtils.isEmpty(str) || (rkuVar = (rku) this.b.get(str)) == null || rkuVar.i.size() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(String str, String str2) {
        Boolean bool;
        n();
        d(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.h.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j(String str, String str2) {
        Boolean bool;
        n();
        d(str);
        if (h(str) && rkm.am(str2)) {
            return true;
        }
        if (k(str) && rkm.an(str2)) {
            return true;
        }
        Map map = (Map) this.g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0341, code lost:
    
        r8.put("filter_id", r5);
        r8.put("event_name", r11.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x034f, code lost:
    
        if ((r11.b & 64) == 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0351, code lost:
    
        r5 = java.lang.Boolean.valueOf(r11.i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0359, code lost:
    
        r8.put("session_scoped", r5);
        r8.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x036d, code lost:
    
        if (r9.d().insertWithOnConflict(r21, null, r8, 5) != (-1)) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x036f, code lost:
    
        r9.aF().c.b("Failed to insert event filter (got -1). appId", defpackage.rfp.a(r29));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x037e, code lost:
    
        r3 = r23;
        r8 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0384, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0385, code lost:
    
        r9.aF().c.c("Error storing event filter. appId", defpackage.rfp.a(r29), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0460, code lost:
    
        r9.V();
        r9.n();
        defpackage.qip.ax(r29);
        r0 = r9.d();
        r3 = r20;
        r0.delete("property_filters", r3, new java.lang.String[]{r29, java.lang.String.valueOf(r7)});
        r0.delete(r21, r3, new java.lang.String[]{r29, java.lang.String.valueOf(r7)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0358, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0340, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02f4, code lost:
    
        r0 = r9.aF().f;
        r5 = defpackage.rfp.a(r29);
        r8 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0308, code lost:
    
        if ((r11.b & 1) == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x030a, code lost:
    
        r19 = java.lang.Integer.valueOf(r11.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0315, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r5, r8, java.lang.String.valueOf(r19));
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0313, code lost:
    
        r19 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0396, code lost:
    
        r23 = r3;
        r0 = r0.d.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03a2, code lost:
    
        if (r0.hasNext() == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03a4, code lost:
    
        r3 = (defpackage.rkr) r0.next();
        r9.V();
        r9.n();
        defpackage.qip.ax(r29);
        defpackage.qip.an(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03bc, code lost:
    
        if (android.text.TextUtils.isEmpty(r3.d) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03e5, code lost:
    
        r8 = r3.toByteArray();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r29);
        r24 = r0;
        r11.put(r5, java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0400, code lost:
    
        if ((r3.b & 1) == 0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0402, code lost:
    
        r0 = java.lang.Integer.valueOf(r3.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x040a, code lost:
    
        r11.put("filter_id", r0);
        r25 = r5;
        r11.put("property_name", r3.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x041a, code lost:
    
        if ((r3.b & 32) == 0) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x041c, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0424, code lost:
    
        r11.put("session_scoped", r0);
        r11.put("data", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0438, code lost:
    
        if (r9.d().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x044a, code lost:
    
        r0 = r24;
        r5 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x043a, code lost:
    
        r9.aF().c.b("Failed to insert property filter (got -1). appId", defpackage.rfp.a(r29));
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0450, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0451, code lost:
    
        r9.aF().c.c("Error storing property filter. appId", defpackage.rfp.a(r29), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0423, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0409, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03be, code lost:
    
        r0 = r9.aF().f;
        r8 = defpackage.rfp.a(r29);
        r11 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03d2, code lost:
    
        if ((r3.b & 1) == 0) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x03d4, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03dc, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03db, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0296, code lost:
    
        r8 = r0.d.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02a0, code lost:
    
        if (r8.hasNext() == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02ac, code lost:
    
        if ((((defpackage.rkr) r8.next()).b & 1) != 0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02ae, code lost:
    
        r9.aF().f.c("Property filter with no ID. Audience definition ignored. appId, audienceId", defpackage.rfp.a(r29), java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02c2, code lost:
    
        r8 = r0.e.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02cc, code lost:
    
        r5 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02d6, code lost:
    
        if (r8.hasNext() == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02d8, code lost:
    
        r11 = (defpackage.rko) r8.next();
        r9.V();
        r9.n();
        defpackage.qip.ax(r29);
        defpackage.qip.an(r11);
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02f2, code lost:
    
        if (android.text.TextUtils.isEmpty(r11.d) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x031e, code lost:
    
        r3 = r11.toByteArray();
        r24 = r8;
        r8 = new android.content.ContentValues();
        r8.put("app_id", r29);
        r8.put("audience_id", java.lang.Integer.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0337, code lost:
    
        if ((r11.b & 1) == 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0339, code lost:
    
        r5 = java.lang.Integer.valueOf(r11.c);
     */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(java.lang.String r29, byte[] r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 1535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rgm.l(java.lang.String, byte[], java.lang.String):boolean");
    }
}
