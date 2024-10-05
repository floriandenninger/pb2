package defpackage;

import android.content.SharedPreferences;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aard implements amml {
    private final /* synthetic */ int r;
    public static final /* synthetic */ aard q = new aard(20);
    public static final /* synthetic */ aard p = new aard(19);
    public static final /* synthetic */ aard o = new aard(17);
    public static final /* synthetic */ aard n = new aard(16);
    public static final /* synthetic */ aard m = new aard(12);
    public static final /* synthetic */ aard l = new aard(11);
    public static final /* synthetic */ aard k = new aard(10);
    public static final /* synthetic */ aard j = new aard(9);
    public static final /* synthetic */ aard i = new aard(8);
    public static final /* synthetic */ aard h = new aard(7);
    public static final /* synthetic */ aard g = new aard(6);
    public static final /* synthetic */ aard f = new aard(5);
    public static final /* synthetic */ aard e = new aard(4);
    public static final /* synthetic */ aard d = new aard(3);
    public static final /* synthetic */ aard c = new aard(2);
    public static final /* synthetic */ aard b = new aard(1);
    public static final /* synthetic */ aard a = new aard(0);

    public /* synthetic */ aard(int i2) {
        this.r = i2;
    }

    @Override // defpackage.amml
    public final Object apply(Object obj) {
        switch (this.r) {
            case 0:
                arbv arbvVar = (arbv) obj;
                if (arbvVar.b == 6) {
                    return (aomf) arbvVar.c;
                }
                return aomf.b;
            case 1:
                int i2 = aako.a;
                return ((aquf) obj).c;
            case 2:
                arbv arbvVar2 = (arbv) obj;
                if (arbvVar2.d == 7) {
                    return (aomf) arbvVar2.e;
                }
                return aomf.b;
            case 3:
                return ((arbv) obj).g;
            case 4:
                return ((arbv) obj).f;
            case 5:
                arbv arbvVar3 = (arbv) obj;
                return arbvVar3.b == 1 ? (String) arbvVar3.c : "";
            case 6:
                arbv arbvVar4 = (arbv) obj;
                return arbvVar4.d == 3 ? (String) arbvVar4.e : "";
            case 7:
                return new aasx((Throwable) obj);
            case 8:
                return new abci((asay) obj);
            case 9:
                asaz asazVar = (asaz) obj;
                ArrayList arrayList = new ArrayList();
                int i3 = asazVar.b;
                if (i3 == 88478200) {
                    apug apugVar = (apug) asazVar.c;
                    if (apugVar.e) {
                        arrayList.add(adyu.dB(apugVar));
                    }
                    if (apugVar.d) {
                        arrayList.add(new abcd());
                    }
                } else if (i3 == 66930374) {
                    arrayList.add((aupv) asazVar.c);
                }
                return arrayList;
            case 10:
                return Boolean.valueOf(((awus) obj).c);
            case 11:
                return Collections.unmodifiableMap(((awuu) obj).e);
            case 12:
                atyi atyiVar = ((awuu) obj).c;
                return atyiVar == null ? atyi.a : atyiVar;
            case 13:
                aone builder = ((aosc) obj).toBuilder();
                builder.copyOnWrite();
                aosc aoscVar = (aosc) builder.instance;
                aoscVar.b |= 8;
                aoscVar.f = true;
                return (aosc) builder.build();
            case 14:
                aone builder2 = ((aosc) obj).toBuilder();
                builder2.copyOnWrite();
                aosc aoscVar2 = (aosc) builder2.instance;
                aoscVar2.b |= 2;
                aoscVar2.d = true;
                return (aosc) builder2.build();
            case 15:
                aone builder3 = ((aosc) obj).toBuilder();
                builder3.copyOnWrite();
                aosc aoscVar3 = (aosc) builder3.instance;
                aoscVar3.b |= 4;
                aoscVar3.e = false;
                return (aosc) builder3.build();
            case 16:
                aone builder4 = ((aosc) obj).toBuilder();
                builder4.copyOnWrite();
                aosc aoscVar4 = (aosc) builder4.instance;
                aoscVar4.b |= 64;
                aoscVar4.i = true;
                return (aosc) builder4.build();
            case 17:
                return Boolean.valueOf(1 == (((atnz) obj).b & 1));
            case 18:
                awuv awuvVar = (awuv) obj;
                String str = acpf.a;
                if ((awuvVar.b & 2) == 0) {
                    return null;
                }
                aomf aomfVar = awuvVar.d;
                try {
                    return (Throwable) new ObjectInputStream(aomfVar.m()).readObject();
                } catch (IOException | ClassNotFoundException unused) {
                    String str2 = acpf.a;
                    String valueOf = String.valueOf(aomfVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    sb.append("Failed to deserialize throwable. [");
                    sb.append(valueOf);
                    sb.append("]");
                    zga.c(str2, sb.toString());
                    return null;
                }
            case 19:
                String str3 = acpf.a;
                aone builder5 = ((awuv) obj).toBuilder();
                builder5.copyOnWrite();
                awuv awuvVar2 = (awuv) builder5.instance;
                awuvVar2.b &= -3;
                awuvVar2.d = awuv.a.d;
                return (awuv) builder5.build();
            default:
                SharedPreferences sharedPreferences = (SharedPreferences) obj;
                aone createBuilder = awuv.a.createBuilder();
                if (sharedPreferences.contains("interaction_logging_client_side_ve_counter")) {
                    long j2 = sharedPreferences.getLong("interaction_logging_client_side_ve_counter", 10000L);
                    createBuilder.copyOnWrite();
                    awuv awuvVar3 = (awuv) createBuilder.instance;
                    awuvVar3.b |= 16;
                    awuvVar3.g = j2;
                }
                return (awuv) createBuilder.build();
        }
    }
}
