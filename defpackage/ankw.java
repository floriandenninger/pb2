package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ankw extends anjs {
    public ankw(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (annc) aonm.parseFrom(annc.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        annc anncVar = (annc) aooyVar;
        aone createBuilder = annb.a.createBuilder();
        aomf x = aomf.x(anrj.a(anncVar.c));
        createBuilder.copyOnWrite();
        ((annb) createBuilder.instance).d = x;
        annd anndVar = anncVar.b;
        if (anndVar == null) {
            anndVar = annd.a;
        }
        createBuilder.copyOnWrite();
        annb annbVar = (annb) createBuilder.instance;
        anndVar.getClass();
        annbVar.c = anndVar;
        createBuilder.copyOnWrite();
        ((annb) createBuilder.instance).b = 0;
        return (annb) createBuilder.build();
    }

    @Override // defpackage.anjs
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", ankx.i(16, 1));
        hashMap.put("AES128_EAX_RAW", ankx.i(16, 3));
        hashMap.put("AES256_EAX", ankx.i(32, 1));
        hashMap.put("AES256_EAX_RAW", ankx.i(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
        annc anncVar = (annc) aooyVar;
        anrp.a(anncVar.c);
        annd anndVar = anncVar.b;
        if (anndVar == null) {
            anndVar = annd.a;
        }
        if (anndVar.b != 12) {
            annd anndVar2 = anncVar.b;
            if (anndVar2 == null) {
                anndVar2 = annd.a;
            }
            if (anndVar2.b != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }
}
