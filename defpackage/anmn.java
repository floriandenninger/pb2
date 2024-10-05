package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anmn extends anjs {
    public anmn(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (anoa) aonm.parseFrom(anoa.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        anoa anoaVar = (anoa) aooyVar;
        aone createBuilder = annz.a.createBuilder();
        createBuilder.copyOnWrite();
        ((annz) createBuilder.instance).b = 0;
        anob anobVar = anoaVar.b;
        if (anobVar == null) {
            anobVar = anob.a;
        }
        createBuilder.copyOnWrite();
        annz annzVar = (annz) createBuilder.instance;
        anobVar.getClass();
        annzVar.c = anobVar;
        aomf x = aomf.x(anrj.a(anoaVar.c));
        createBuilder.copyOnWrite();
        ((annz) createBuilder.instance).d = x;
        return (annz) createBuilder.build();
    }

    @Override // defpackage.anjs
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", anmo.k(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", anmo.k(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", anmo.k(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", anmo.k(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", anmo.k(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", anmo.k(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", anmo.k(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", anmo.k(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", anmo.k(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", anmo.k(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
        anoa anoaVar = (anoa) aooyVar;
        if (anoaVar.c >= 16) {
            anob anobVar = anoaVar.b;
            if (anobVar == null) {
                anobVar = anob.a;
            }
            anmo.i(anobVar);
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
