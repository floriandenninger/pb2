package defpackage;

import android.content.Intent;
import android.util.Pair;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import j$.util.Optional;
import j$.util.function.Function;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acxx implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ acxx u = new acxx(20);
    public static final /* synthetic */ acxx t = new acxx(19);
    public static final /* synthetic */ acxx s = new acxx(18);
    public static final /* synthetic */ acxx r = new acxx(17);
    public static final /* synthetic */ acxx q = new acxx(16);
    public static final /* synthetic */ acxx p = new acxx(15);
    public static final /* synthetic */ acxx o = new acxx(14);
    public static final /* synthetic */ acxx n = new acxx(13);
    public static final /* synthetic */ acxx m = new acxx(12);
    public static final /* synthetic */ acxx l = new acxx(11);
    public static final /* synthetic */ acxx k = new acxx(10);
    public static final /* synthetic */ acxx j = new acxx(9);
    public static final /* synthetic */ acxx i = new acxx(8);
    public static final /* synthetic */ acxx h = new acxx(7);
    public static final /* synthetic */ acxx g = new acxx(6);
    public static final /* synthetic */ acxx f = new acxx(5);
    public static final /* synthetic */ acxx e = new acxx(4);
    public static final /* synthetic */ acxx d = new acxx(3);
    public static final /* synthetic */ acxx c = new acxx(2);
    public static final /* synthetic */ acxx b = new acxx(1);
    public static final /* synthetic */ acxx a = new acxx(0);

    private /* synthetic */ acxx(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return (awvb) ((Map.Entry) obj).getValue();
            case 1:
                return (String) ((Map.Entry) obj).getKey();
            case 2:
                bpv bpvVar = (bpv) obj;
                String str = adee.a;
                return bpvVar;
            case 3:
                anhy anhyVar = (anhy) obj;
                String str2 = adee.a;
                try {
                    return (Pair) anaf.W(anhyVar);
                } catch (ExecutionException e2) {
                    String str3 = adee.a;
                    String valueOf = String.valueOf(e2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                    sb.append("Future to get CastDevice from route bundle failed: ");
                    sb.append(valueOf);
                    zga.c(str3, sb.toString());
                    return null;
                }
            case 4:
                String str4 = adee.a;
                return (bpv) ((Pair) obj).first;
            case 5:
                String str5 = adee.a;
                return (Optional) ((Pair) obj).second;
            case 6:
                String str6 = adee.a;
                return Optional.ofNullable(((bpv) obj).q);
            case 7:
                return ((adft) obj).c;
            case 8:
                return (adft) obj;
            case 9:
                return ((adga) obj).a;
            case 10:
                return Integer.valueOf(((FormatStreamModel) obj).e());
            case 11:
                return ((FormatStreamModel) obj).m();
            case 12:
                cnf cnfVar = (cnf) obj;
                aone createBuilder = awyv.a.createBuilder();
                String str7 = cnfVar.a;
                createBuilder.copyOnWrite();
                awyv awyvVar = (awyv) createBuilder.instance;
                str7.getClass();
                awyvVar.b = str7;
                String str8 = cnfVar.b;
                createBuilder.copyOnWrite();
                awyv awyvVar2 = (awyv) createBuilder.instance;
                str8.getClass();
                awyvVar2.c = str8;
                return (awyv) createBuilder.build();
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                aone createBuilder2 = awyv.a.createBuilder();
                String str9 = (String) entry.getKey();
                createBuilder2.copyOnWrite();
                awyv awyvVar3 = (awyv) createBuilder2.instance;
                str9.getClass();
                awyvVar3.b = str9;
                String str10 = (String) entry.getValue();
                createBuilder2.copyOnWrite();
                awyv awyvVar4 = (awyv) createBuilder2.instance;
                str10.getClass();
                awyvVar4.c = str10;
                return (awyv) createBuilder2.build();
            case 14:
                return ucz.a(amru.r((Intent) obj));
            case 15:
                return ucz.a(amru.r((Intent) obj));
            case 16:
                apxf apxfVar = ((apeg) obj).d;
                return apxfVar == null ? apxf.a : apxfVar;
            case 17:
                apxf apxfVar2 = ((apeg) obj).c;
                return apxfVar2 == null ? apxf.a : apxfVar2;
            case 18:
                apxf apxfVar3 = ((apei) obj).e;
                return apxfVar3 == null ? apxf.a : apxfVar3;
            case 19:
                apxf apxfVar4 = ((apei) obj).f;
                return apxfVar4 == null ? apxf.a : apxfVar4;
            default:
                return aalt.g(((atpq) obj).d);
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        switch (this.v) {
            case 0:
                return Function.CC.$default$andThen(this, function);
            case 1:
                return Function.CC.$default$andThen(this, function);
            case 2:
                return Function.CC.$default$andThen(this, function);
            case 3:
                return Function.CC.$default$andThen(this, function);
            case 4:
                return Function.CC.$default$andThen(this, function);
            case 5:
                return Function.CC.$default$andThen(this, function);
            case 6:
                return Function.CC.$default$andThen(this, function);
            case 7:
                return Function.CC.$default$andThen(this, function);
            case 8:
                return Function.CC.$default$andThen(this, function);
            case 9:
                return Function.CC.$default$andThen(this, function);
            case 10:
                return Function.CC.$default$andThen(this, function);
            case 11:
                return Function.CC.$default$andThen(this, function);
            case 12:
                return Function.CC.$default$andThen(this, function);
            case 13:
                return Function.CC.$default$andThen(this, function);
            case 14:
                return Function.CC.$default$andThen(this, function);
            case 15:
                return Function.CC.$default$andThen(this, function);
            case 16:
                return Function.CC.$default$andThen(this, function);
            case 17:
                return Function.CC.$default$andThen(this, function);
            case 18:
                return Function.CC.$default$andThen(this, function);
            case 19:
                return Function.CC.$default$andThen(this, function);
            default:
                return Function.CC.$default$andThen(this, function);
        }
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        switch (this.v) {
            case 0:
                return Function.CC.$default$compose(this, function);
            case 1:
                return Function.CC.$default$compose(this, function);
            case 2:
                return Function.CC.$default$compose(this, function);
            case 3:
                return Function.CC.$default$compose(this, function);
            case 4:
                return Function.CC.$default$compose(this, function);
            case 5:
                return Function.CC.$default$compose(this, function);
            case 6:
                return Function.CC.$default$compose(this, function);
            case 7:
                return Function.CC.$default$compose(this, function);
            case 8:
                return Function.CC.$default$compose(this, function);
            case 9:
                return Function.CC.$default$compose(this, function);
            case 10:
                return Function.CC.$default$compose(this, function);
            case 11:
                return Function.CC.$default$compose(this, function);
            case 12:
                return Function.CC.$default$compose(this, function);
            case 13:
                return Function.CC.$default$compose(this, function);
            case 14:
                return Function.CC.$default$compose(this, function);
            case 15:
                return Function.CC.$default$compose(this, function);
            case 16:
                return Function.CC.$default$compose(this, function);
            case 17:
                return Function.CC.$default$compose(this, function);
            case 18:
                return Function.CC.$default$compose(this, function);
            case 19:
                return Function.CC.$default$compose(this, function);
            default:
                return Function.CC.$default$compose(this, function);
        }
    }
}
