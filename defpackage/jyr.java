package defpackage;

import android.content.Intent;
import android.os.Bundle;
import j$.util.Optional;
import j$.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jyr implements Function {
    private final /* synthetic */ int v;
    public static final /* synthetic */ jyr u = new jyr(20);
    public static final /* synthetic */ jyr t = new jyr(19);
    public static final /* synthetic */ jyr s = new jyr(18);
    public static final /* synthetic */ jyr r = new jyr(17);
    public static final /* synthetic */ jyr q = new jyr(16);
    public static final /* synthetic */ jyr p = new jyr(15);
    public static final /* synthetic */ jyr o = new jyr(14);
    public static final /* synthetic */ jyr n = new jyr(13);
    public static final /* synthetic */ jyr m = new jyr(12);
    public static final /* synthetic */ jyr l = new jyr(11);
    public static final /* synthetic */ jyr k = new jyr(10);
    public static final /* synthetic */ jyr j = new jyr(9);
    public static final /* synthetic */ jyr i = new jyr(8);
    public static final /* synthetic */ jyr h = new jyr(7);
    public static final /* synthetic */ jyr g = new jyr(6);
    public static final /* synthetic */ jyr f = new jyr(5);
    public static final /* synthetic */ jyr e = new jyr(4);
    public static final /* synthetic */ jyr d = new jyr(3);
    public static final /* synthetic */ jyr c = new jyr(2);
    public static final /* synthetic */ jyr b = new jyr(1);
    public static final /* synthetic */ jyr a = new jyr(0);

    private /* synthetic */ jyr(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        switch (this.v) {
            case 0:
                return obj instanceof aqrf ? ajds.a((aqrf) obj) : obj;
            case 1:
                return obj instanceof ajds ? ((ajds) obj).a : obj;
            case 2:
                return Optional.ofNullable((aooy) obj);
            case 3:
                return ((Optional) obj).get();
            case 4:
                return Long.valueOf(((fna) obj).c());
            case 5:
                return Long.valueOf(((fna) obj).kJ());
            case 6:
                return Long.valueOf(((fna) obj).kQ());
            case 7:
                return Long.valueOf(((fna) obj).kK());
            case 8:
                return Long.valueOf(((fna) obj).kL());
            case 9:
                return Boolean.valueOf(((fna) obj).kO());
            case 10:
                return ((Intent) obj).getExtras();
            case 11:
                return ((Bundle) obj).getByteArray("navigation_endpoint");
            case 12:
                return aahg.c((byte[]) obj);
            case 13:
                atda atdaVar = (atda) obj;
                if (atdaVar == null) {
                    return null;
                }
                int i2 = atdaVar.b;
                if ((i2 & 1) != 0) {
                    atdb atdbVar = atdaVar.c;
                    return atdbVar == null ? atdb.a : atdbVar;
                }
                if ((i2 & 2) != 0) {
                    atde atdeVar = atdaVar.d;
                    return atdeVar == null ? atde.a : atdeVar;
                }
                if ((i2 & 4) != 0) {
                    atdd atddVar = atdaVar.e;
                    return atddVar == null ? atdd.a : atddVar;
                }
                if ((i2 & 8) != 0) {
                    atdk atdkVar = atdaVar.f;
                    return atdkVar == null ? atdk.a : atdkVar;
                }
                if ((i2 & 16) != 0) {
                    atcw atcwVar = atdaVar.g;
                    return atcwVar == null ? atcw.a : atcwVar;
                }
                if ((i2 & 32) != 0) {
                    atcx atcxVar = atdaVar.h;
                    return atcxVar == null ? atcx.a : atcxVar;
                }
                if ((i2 & 64) != 0) {
                    atdj atdjVar = atdaVar.i;
                    return atdjVar == null ? atdj.a : atdjVar;
                }
                if ((i2 & 128) != 0) {
                    avqw avqwVar = atdaVar.j;
                    return avqwVar == null ? avqw.a : avqwVar;
                }
                if ((i2 & 256) != 0) {
                    avqx avqxVar = atdaVar.k;
                    return avqxVar == null ? avqx.a : avqxVar;
                }
                if ((i2 & 512) != 0) {
                    atdg atdgVar = atdaVar.l;
                    return atdgVar == null ? atdg.a : atdgVar;
                }
                if ((i2 & 1024) != 0) {
                    avpw avpwVar = atdaVar.m;
                    return avpwVar == null ? avpw.a : avpwVar;
                }
                if ((i2 & 2048) != 0) {
                    atcs atcsVar = atdaVar.n;
                    return atcsVar == null ? atcs.a : atcsVar;
                }
                if ((i2 & 4096) != 0) {
                    auxn auxnVar = atdaVar.o;
                    return auxnVar == null ? auxn.a : auxnVar;
                }
                if ((i2 & 8192) == 0) {
                    return null;
                }
                aqrf aqrfVar = atdaVar.p;
                return aqrfVar == null ? aqrf.a : aqrfVar;
            case 14:
                return ((atdc) obj).c;
            case 15:
                return (fze) ((Optional) obj).get();
            case 16:
                return (aptg) obj;
            case 17:
                return ((aptg) obj).k;
            case 18:
                final mjh mjhVar = (mjh) obj;
                mjhVar.getClass();
                return aynu.e(new ayrm() { // from class: mji
                    @Override // defpackage.ayrm
                    public final void a() {
                        mjh.this.j();
                    }
                });
            case 19:
                return ((mjh) obj).b();
            default:
                return ((mjh) obj).c();
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
