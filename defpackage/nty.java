package defpackage;

import android.util.Pair;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nty implements Predicate {
    private final /* synthetic */ int r;
    public static final /* synthetic */ nty q = new nty(17);
    public static final /* synthetic */ nty p = new nty(16);
    public static final /* synthetic */ nty o = new nty(15);
    public static final /* synthetic */ nty n = new nty(14);
    public static final /* synthetic */ nty m = new nty(13);
    public static final /* synthetic */ nty l = new nty(12);
    public static final /* synthetic */ nty k = new nty(11);
    public static final /* synthetic */ nty j = new nty(10);
    public static final /* synthetic */ nty i = new nty(9);
    public static final /* synthetic */ nty h = new nty(8);
    public static final /* synthetic */ nty g = new nty(7);
    public static final /* synthetic */ nty f = new nty(6);
    public static final /* synthetic */ nty e = new nty(5);
    public static final /* synthetic */ nty d = new nty(4);
    public static final /* synthetic */ nty c = new nty(2);
    public static final /* synthetic */ nty b = new nty(1);
    public static final /* synthetic */ nty a = new nty(0);

    public /* synthetic */ nty(int i2) {
        this.r = i2;
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.r) {
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
            default:
                return Predicate.CC.$default$and(this, predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.r) {
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
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.r) {
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
            default:
                return Predicate.CC.$default$or(this, predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.r) {
            case 0:
                return ((nqg) obj) instanceof npj;
            case 1:
                return obj instanceof auap;
            case 2:
                return ((fhg) obj).i();
            case 3:
                return ((String) obj).startsWith("PREF");
            case 4:
                return ((String) obj).contains("=");
            case 5:
                int i2 = xgt.a;
                return ((aoye) obj).c.contains("label=video_skip_shown");
            case 6:
                return Objects.nonNull((Pair) obj);
            case 7:
                amsx amsxVar = aeez.a;
                return aaoq.b().contains((Integer) obj);
            case 8:
                return (((apei) obj).b & 4) != 0;
            case 9:
                return (((apei) obj).b & 8) != 0;
            case 10:
                return (((apeg) obj).b & 2) != 0;
            case 11:
                return (((apeg) obj).b & 1) != 0;
            case 12:
                return (((awtb) obj).b & 2) != 0;
            case 13:
                return !((awtb) obj).d.isEmpty();
            case 14:
                return Collection.EL.stream(((awtb) obj).e).anyMatch(o);
            case 15:
                return ((awtd) obj).c != 0.0d;
            case 16:
                return !((String) obj).isEmpty();
            default:
                return (((awti) obj).b & 4) != 0;
        }
    }
}
