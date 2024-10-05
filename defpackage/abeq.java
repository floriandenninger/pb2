package defpackage;

import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abeq implements vfl {
    public final /* synthetic */ ykr a;
    private final /* synthetic */ int b;

    public /* synthetic */ abeq(ykr ykrVar, int i) {
        this.b = i;
        this.a = ykrVar;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [aooy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [aooy, java.lang.Object] */
    @Override // defpackage.vfl
    public final aooy a(vfm vfmVar, aooy aooyVar) {
        apgh apghVar;
        int i = this.b;
        apgh apghVar2 = null;
        if (i == 0) {
            ykr ykrVar = this.a;
            String d = vfmVar.d("com.google.android.libraries.youtube.innertube.pref.player_config_supplier", null);
            if (d == null) {
                return aooyVar;
            }
            try {
                atyi atyiVar = (atyi) ((aone) atyi.a.createBuilder().mergeFrom(Base64.decode(d, 0), aomw.b())).build();
                aone builder = ((awuu) aooyVar).toBuilder();
                builder.copyOnWrite();
                awuu awuuVar = (awuu) builder.instance;
                atyiVar.getClass();
                awuuVar.c = atyiVar;
                awuuVar.b |= 1;
                return ykrVar.a(aooyVar, (awuu) builder.build());
            } catch (aoob | IllegalArgumentException | NullPointerException unused) {
                return aooyVar;
            }
        }
        if (i == 1) {
            return (aooy) this.a.a(vfmVar, aooyVar);
        }
        ykr ykrVar2 = this.a;
        String d2 = vfmVar.d("attribution_data", null);
        if (d2 == null) {
            return aooyVar;
        }
        try {
            try {
                apghVar = (apgh) aonm.parseFrom(apgh.a, Base64.decode(d2, 0), aomw.b());
            } catch (aoob unused2) {
                apghVar = null;
            }
            if (apghVar != null && apghVar.b.size() > 0) {
                apghVar2 = apghVar;
            }
            aone builder2 = ((awuu) aooyVar).toBuilder();
            builder2.copyOnWrite();
            awuu awuuVar2 = (awuu) builder2.instance;
            apghVar2.getClass();
            awuuVar2.d = apghVar2;
            awuuVar2.b |= 2;
            return ykrVar2.a(aooyVar, (awuu) builder2.build());
        } catch (IllegalArgumentException | NullPointerException unused3) {
            return aooyVar;
        }
    }
}
