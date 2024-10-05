package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alcn extends alct {
    public static final Charset a = Charset.forName("UTF-8");
    public final shf b;
    public final aseb c;
    public final akxh e;
    private final axar f;
    private final alej g;
    private final aleo h;
    private final akyg i;
    private final Map k;
    private final akwg l;
    private final axze m;

    public alcn(shf shfVar, aaea aaeaVar, aseb asebVar, akxh akxhVar, akyk akykVar, akym akymVar, axze axzeVar, alej alejVar, aleo aleoVar, akwg akwgVar, akyb akybVar, albx albxVar, alaj alajVar, alep alepVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        super(avtr.UPLOAD_PROCESSOR_TYPE_TRANSFER, shfVar, aaeaVar, axzeVar, akybVar, albxVar, alajVar, alepVar, null, null, null);
        this.k = new ConcurrentHashMap();
        this.b = shfVar;
        this.c = asebVar;
        this.e = akxhVar;
        this.m = axzeVar;
        this.g = alejVar;
        this.h = aleoVar;
        this.l = akwgVar;
        this.i = new akyg(akykVar, akymVar);
        axaq a2 = axar.a();
        a2.a = 0L;
        this.f = a2.a();
    }

    @Override // defpackage.aldq
    public final akyq a(akzs akzsVar) {
        return this.i;
    }

    @Override // defpackage.aldq
    public final akzp b(akzs akzsVar) {
        akzp akzpVar = akzsVar.f65J;
        return akzpVar == null ? akzp.a : akzpVar;
    }

    @Override // defpackage.albk
    public final anhy c(String str, akwm akwmVar, akzs akzsVar) {
        awzu a2;
        final String str2 = akzsVar.k;
        String str3 = akzsVar.G;
        final String str4 = (akzsVar.c & 32) != 0 ? akzsVar.H : null;
        if (alep.k(akzsVar)) {
            a2 = new awzv(alep.g(akzsVar));
        } else {
            a2 = this.g.a(akzsVar, new alae() { // from class: alci
                @Override // defpackage.alae
                public final void a(double d) {
                    alcn alcnVar = alcn.this;
                    alcnVar.e.e(str2, d);
                }
            });
        }
        axak axakVar = new axak(str3, "PUT", null, a2, null, this.h.a().a, this.f, true);
        axakVar.j(new alcm(this, str2), 65536, 500);
        this.l.a();
        anhy i = anfq.i(axakVar.a(), new anfz() { // from class: alcj
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                alcn alcnVar = alcn.this;
                String str5 = str4;
                axap axapVar = (axap) obj;
                if (axapVar.b()) {
                    throw akwe.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_TRANSFER_EXCEPTION, alcnVar.c.e);
                }
                if (!axapVar.a()) {
                    throw akwe.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_EMPTY_RESPONSE, alcnVar.c.e);
                }
                awzy awzyVar = axapVar.b;
                int i2 = awzyVar.a;
                if (i2 >= 0) {
                    awzx awzxVar = awzyVar.b;
                    if (awzxVar != null) {
                        try {
                            InputStream inputStream = awzyVar.c;
                            if (inputStream == null) {
                                throw akwe.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_ERROR_PARSING_RESPONSE, alcnVar.c.e);
                            }
                            byte[] c = anbt.c(inputStream);
                            String a3 = awzxVar.a("X-Goog-Upload-Status");
                            if ("cancelled".equals(a3)) {
                                throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_CANCELLATION);
                            }
                            if (!"final".equals(a3)) {
                                throw akwe.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_UNEXPECTED_SCOTTY_STATUS, alcnVar.c.e);
                            }
                            if (i2 != 200) {
                                throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_ERROR_RESPONSE_CODE);
                            }
                            try {
                                JSONObject jSONObject = new JSONObject(new String(c, alcn.a));
                                String string = jSONObject.getString("status");
                                String optString = jSONObject.optString("scottyResourceId", "");
                                if (!string.equals("STATUS_SUCCESS")) {
                                    throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_UNSUCCESSFUL_STATUS);
                                }
                                if (TextUtils.isEmpty(optString)) {
                                    throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_EMPTY_RESOURCE_OR_HANDLE);
                                }
                                if (str5 == null || optString.equals(str5)) {
                                    return anaf.O(alcnVar.u(alcnVar.d.d(), true, new joi(optString, 9)));
                                }
                                throw akwe.a(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_RESOURCE_MISMATCH);
                            } catch (JSONException unused) {
                                throw akwe.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_ERROR_PARSING_RESPONSE, alcnVar.c.e);
                            }
                        } catch (IOException unused2) {
                            throw akwe.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_ERROR_PARSING_RESPONSE, alcnVar.c.e);
                        }
                    }
                    throw new AssertionError("Null response headers");
                }
                throw akwe.c(avtq.UPLOAD_PROCESSOR_FAILURE_REASON_SCOTTY_ERROR_RESPONSE_CODE, alcnVar.c.e);
            }
        }, angq.a);
        anaf.Y(i, new alcl(this, axakVar, str2), angq.a);
        return i;
    }

    @Override // defpackage.aldq
    public final ayro e() {
        return albr.f;
    }

    @Override // defpackage.aldq
    public final String f() {
        return "ScottyTransferTask";
    }

    @Override // defpackage.aldq
    public final boolean h() {
        return true;
    }

    @Override // defpackage.albk
    public final boolean i(akzs akzsVar) {
        int i = akzsVar.b;
        return ((i & 64) == 0 || (akzsVar.c & 16) == 0 || (i & 2) == 0) ? false : true;
    }

    @Override // defpackage.alct, defpackage.albk
    public final akwp k(Throwable th, akzs akzsVar, boolean z) {
        if (alep.k(akzsVar)) {
            axze axzeVar = this.m;
            akzq a2 = akzq.a(akzsVar.l);
            if (a2 == null) {
                a2 = akzq.UNKNOWN_UPLOAD;
            }
            axzeVar.f("ScottyTransferTask Fallback to Source", th, a2);
            alep alepVar = this.d;
            avtq avtqVar = avtq.UPLOAD_PROCESSOR_FAILURE_REASON_FALLBACK_TO_SOURCE;
            akzp akzpVar = akzsVar.f65J;
            if (akzpVar == null) {
                akzpVar = akzp.a;
            }
            akzpVar.getClass();
            return u(alepVar.o(avtqVar, akzpVar, this.c.e, this.m), z, airw.i);
        }
        if (th instanceof akwe) {
            akwe akweVar = (akwe) th;
            if (akweVar.b) {
                final Long l = (Long) this.k.get(akzsVar.k);
                if (l == null || l.longValue() <= akzsVar.I || akweVar.c.isEmpty()) {
                    return t(n(akzsVar, akweVar), z);
                }
                aone createBuilder = akzp.a.createBuilder();
                createBuilder.copyOnWrite();
                akzp akzpVar2 = (akzp) createBuilder.instance;
                akzpVar2.c = 2;
                akzpVar2.b |= 1;
                long c = this.b.c();
                long longValue = ((Long) akweVar.c.get(0)).longValue();
                createBuilder.copyOnWrite();
                akzp akzpVar3 = (akzp) createBuilder.instance;
                akzpVar3.b |= 8;
                akzpVar3.f = c + longValue;
                createBuilder.copyOnWrite();
                akzp akzpVar4 = (akzp) createBuilder.instance;
                akzpVar4.b |= 4;
                akzpVar4.e = 1;
                avtq avtqVar2 = akweVar.a;
                createBuilder.copyOnWrite();
                akzp akzpVar5 = (akzp) createBuilder.instance;
                akzpVar5.d = avtqVar2.aB;
                akzpVar5.b |= 2;
                return u((akzp) createBuilder.build(), z, new ayrs() { // from class: alck
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        Long l2 = l;
                        aone aoneVar = (aone) obj;
                        Charset charset = alcn.a;
                        long longValue2 = l2.longValue();
                        aoneVar.copyOnWrite();
                        akzs akzsVar2 = (akzs) aoneVar.instance;
                        akzs akzsVar3 = akzs.a;
                        akzsVar2.c |= 64;
                        akzsVar2.I = longValue2;
                    }
                });
            }
        }
        return super.k(th, akzsVar, z);
    }

    public final void s(String str, axam axamVar, double d) {
        awzu c = axamVar.c();
        long e = c != null ? c.e() : 0L;
        long a2 = c != null ? c.a() : 0L;
        long j = a2 == -1 ? -1L : a2;
        this.k.put(str, Long.valueOf(e));
        this.e.f(str, e, j, d);
    }
}
