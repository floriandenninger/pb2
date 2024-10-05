package defpackage;

import android.os.Bundle;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ghv implements Predicate {
    private final /* synthetic */ int v;
    public static final /* synthetic */ ghv u = new ghv(20);
    public static final /* synthetic */ ghv t = new ghv(19);
    public static final /* synthetic */ ghv s = new ghv(18);
    public static final /* synthetic */ ghv r = new ghv(17);
    public static final /* synthetic */ ghv q = new ghv(16);
    public static final /* synthetic */ ghv p = new ghv(15);
    public static final /* synthetic */ ghv o = new ghv(14);
    public static final /* synthetic */ ghv n = new ghv(13);
    public static final /* synthetic */ ghv m = new ghv(12);
    public static final /* synthetic */ ghv l = new ghv(11);
    public static final /* synthetic */ ghv k = new ghv(10);
    public static final /* synthetic */ ghv j = new ghv(9);
    public static final /* synthetic */ ghv i = new ghv(8);
    public static final /* synthetic */ ghv h = new ghv(7);
    public static final /* synthetic */ ghv g = new ghv(6);
    public static final /* synthetic */ ghv f = new ghv(5);
    public static final /* synthetic */ ghv e = new ghv(4);
    public static final /* synthetic */ ghv d = new ghv(3);
    public static final /* synthetic */ ghv c = new ghv(2);
    public static final /* synthetic */ ghv b = new ghv(1);
    public static final /* synthetic */ ghv a = new ghv(0);

    private /* synthetic */ ghv(int i2) {
        this.v = i2;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.v) {
            case 0:
                return Predicate.CC.$default$and(this, predicate);
            case 1:
                return Predicate.CC.$default$and(this, predicate);
            case 2:
                return Predicate.CC.$default$and(this, predicate);
            case 3:
                return Predicate.CC.$default$and(this, predicate);
            case 4:
                return Predicate.CC.$default$and(this, predicate);
            case 5:
                return Predicate.CC.$default$and(this, predicate);
            case 6:
                return Predicate.CC.$default$and(this, predicate);
            case 7:
                return Predicate.CC.$default$and(this, predicate);
            case 8:
                return Predicate.CC.$default$and(this, predicate);
            case 9:
                return Predicate.CC.$default$and(this, predicate);
            case 10:
                return Predicate.CC.$default$and(this, predicate);
            case 11:
                return Predicate.CC.$default$and(this, predicate);
            case 12:
                return Predicate.CC.$default$and(this, predicate);
            case 13:
                return Predicate.CC.$default$and(this, predicate);
            case 14:
                return Predicate.CC.$default$and(this, predicate);
            case 15:
                return Predicate.CC.$default$and(this, predicate);
            case 16:
                return Predicate.CC.$default$and(this, predicate);
            case 17:
                return Predicate.CC.$default$and(this, predicate);
            case 18:
                return Predicate.CC.$default$and(this, predicate);
            case 19:
                return Predicate.CC.$default$and(this, predicate);
            default:
                return Predicate.CC.$default$and(this, predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.v) {
            case 0:
                return Predicate.CC.$default$negate(this);
            case 1:
                return Predicate.CC.$default$negate(this);
            case 2:
                return Predicate.CC.$default$negate(this);
            case 3:
                return Predicate.CC.$default$negate(this);
            case 4:
                return Predicate.CC.$default$negate(this);
            case 5:
                return Predicate.CC.$default$negate(this);
            case 6:
                return Predicate.CC.$default$negate(this);
            case 7:
                return Predicate.CC.$default$negate(this);
            case 8:
                return Predicate.CC.$default$negate(this);
            case 9:
                return Predicate.CC.$default$negate(this);
            case 10:
                return Predicate.CC.$default$negate(this);
            case 11:
                return Predicate.CC.$default$negate(this);
            case 12:
                return Predicate.CC.$default$negate(this);
            case 13:
                return Predicate.CC.$default$negate(this);
            case 14:
                return Predicate.CC.$default$negate(this);
            case 15:
                return Predicate.CC.$default$negate(this);
            case 16:
                return Predicate.CC.$default$negate(this);
            case 17:
                return Predicate.CC.$default$negate(this);
            case 18:
                return Predicate.CC.$default$negate(this);
            case 19:
                return Predicate.CC.$default$negate(this);
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.v) {
            case 0:
                return Predicate.CC.$default$or(this, predicate);
            case 1:
                return Predicate.CC.$default$or(this, predicate);
            case 2:
                return Predicate.CC.$default$or(this, predicate);
            case 3:
                return Predicate.CC.$default$or(this, predicate);
            case 4:
                return Predicate.CC.$default$or(this, predicate);
            case 5:
                return Predicate.CC.$default$or(this, predicate);
            case 6:
                return Predicate.CC.$default$or(this, predicate);
            case 7:
                return Predicate.CC.$default$or(this, predicate);
            case 8:
                return Predicate.CC.$default$or(this, predicate);
            case 9:
                return Predicate.CC.$default$or(this, predicate);
            case 10:
                return Predicate.CC.$default$or(this, predicate);
            case 11:
                return Predicate.CC.$default$or(this, predicate);
            case 12:
                return Predicate.CC.$default$or(this, predicate);
            case 13:
                return Predicate.CC.$default$or(this, predicate);
            case 14:
                return Predicate.CC.$default$or(this, predicate);
            case 15:
                return Predicate.CC.$default$or(this, predicate);
            case 16:
                return Predicate.CC.$default$or(this, predicate);
            case 17:
                return Predicate.CC.$default$or(this, predicate);
            case 18:
                return Predicate.CC.$default$or(this, predicate);
            case 19:
                return Predicate.CC.$default$or(this, predicate);
            default:
                return Predicate.CC.$default$or(this, predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.v) {
            case 0:
                return ((Bundle) obj).containsKey("activePaneKey");
            case 1:
                return ((ammv) obj).h();
            case 2:
                return ((giy) obj).J();
            case 3:
                return ((Integer) obj).intValue() >= 0;
            case 4:
                int i2 = grq.q;
                return ((Map.Entry) obj).getValue() != null;
            case 5:
                return ((ce) obj) instanceof iiq;
            case 6:
                int i3 = ijo.bC;
                return ((Bundle) obj).containsKey(hae.a);
            case 7:
                return (((ReelWatchEndpointOuterClass$ReelWatchEndpoint) obj).b & 2097152) != 0;
            case 8:
                return ((ce) obj) instanceof iiq;
            case 9:
                return Objects.nonNull((View) obj);
            case 10:
                return ((Optional) obj).isPresent();
            case 11:
                int i4 = ivj.cs;
                return obj instanceof ActionBarColor;
            case 12:
                int i5 = ivj.cs;
                return ((nky) obj) instanceof nmb;
            case 13:
                return (((arjv) obj).b & 262144) != 0;
            case 14:
                return ((Optional) obj).isPresent();
            case 15:
                return ((agnv) obj).b();
            case 16:
                return ((agnv) obj).b();
            case 17:
                return ((agnv) obj).b();
            case 18:
                return (((atom) obj).b & 2) != 0;
            case 19:
                return (((atom) obj).b & 1) != 0;
            default:
                return (((atom) obj).b & 1) != 0;
        }
    }
}
