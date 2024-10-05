package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import j$.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class opz implements Predicate {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ opz(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // j$.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.b) {
            case 0:
                return ((opl) obj).a.equals(this.a);
            case 1:
                return ((auap) obj).c.equals(this.a);
            case 2:
                return this.a.equals(((AccountIdentity) obj).a());
            case 3:
                return ((alym) obj).c.equals(this.a);
            case 4:
                return TextUtils.equals(((MediaAd) obj).m, this.a);
            case 5:
                String str = this.a;
                return str != null && str.equals(((adgb) obj).h());
            case 6:
                return this.a.equals(((adga) obj).h());
            case 7:
                String str2 = this.a;
                String str3 = adcj.a;
                return str2.equals(((adfy) obj).h());
            case 8:
                String str4 = this.a;
                int i = addy.h;
                return str4.equals(((adgb) obj).h());
            case 9:
                String str5 = this.a;
                int i2 = addy.h;
                return str5.equals(((adgb) obj).h());
            case 10:
                String str6 = this.a;
                int i3 = addy.h;
                return str6.equals(((adgb) obj).h());
            case 11:
                String str7 = this.a;
                String str8 = adeg.a;
                return str7.equals(((adfy) obj).h());
            case 12:
                String str9 = this.a;
                String str10 = adeg.a;
                return str9.equals(((adfy) obj).h());
            default:
                String str11 = this.a;
                String str12 = adof.k;
                return str11.equals(((adfy) obj).h());
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.b) {
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
            default:
                return Predicate.CC.$default$and(this, predicate);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate negate() {
        switch (this.b) {
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
            default:
                return Predicate.CC.$default$negate(this);
        }
    }

    @Override // j$.util.function.Predicate
    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.b) {
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
            default:
                return Predicate.CC.$default$or(this, predicate);
        }
    }
}
