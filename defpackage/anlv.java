package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anlv extends anjs {
    public anlv(Class cls) {
        super(cls);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ aooy a(aomf aomfVar) {
        return (annj) aonm.parseFrom(annj.a, aomfVar, aomw.a());
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ Object b(aooy aooyVar) {
        aone createBuilder = anni.a.createBuilder();
        aomf x = aomf.x(anrj.a(((annj) aooyVar).b));
        createBuilder.copyOnWrite();
        ((anni) createBuilder.instance).c = x;
        createBuilder.copyOnWrite();
        ((anni) createBuilder.instance).b = 0;
        return (anni) createBuilder.build();
    }

    @Override // defpackage.anjs
    public final Map c() {
        HashMap hashMap = new HashMap();
        aone createBuilder = annj.a.createBuilder();
        createBuilder.copyOnWrite();
        annj.a((annj) createBuilder.instance);
        hashMap.put("AES256_SIV", new anjr((annj) createBuilder.build(), 1));
        aone createBuilder2 = annj.a.createBuilder();
        createBuilder2.copyOnWrite();
        annj.a((annj) createBuilder2.instance);
        hashMap.put("AES256_SIV_RAW", new anjr((annj) createBuilder2.build(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // defpackage.anjs
    public final /* bridge */ /* synthetic */ void d(aooy aooyVar) {
        int i = ((annj) aooyVar).b;
        if (i == 64) {
            return;
        }
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(i);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidAlgorithmParameterException(sb.toString());
    }
}
