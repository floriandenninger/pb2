package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abj implements aox {
    final /* synthetic */ abs a;
    private final /* synthetic */ int b;

    public abj(abs absVar, int i) {
        this.b = i;
        this.a = absVar;
    }

    @Override // defpackage.aox
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            abh abhVar = (abh) obj;
            if (abhVar != null) {
                abs absVar = this.a;
                int i2 = abhVar.a;
                CharSequence charSequence = abhVar.b;
                switch (i2) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 6:
                    default:
                        i2 = 8;
                        break;
                }
                Context qR = absVar.qR();
                if (Build.VERSION.SDK_INT < 29) {
                    if (i2 != 7) {
                        if (i2 == 9) {
                            i2 = 9;
                        }
                    }
                    if (qR != null && abp.c(qR) && abd.d(absVar.b.a())) {
                        absVar.n();
                        this.a.b.i(null);
                        return;
                    }
                }
                if (absVar.s()) {
                    if (charSequence == null) {
                        charSequence = abo.c(absVar.qR(), i2);
                    }
                    if (i2 == 5) {
                        if (absVar.b.f == 0) {
                            absVar.aF(charSequence);
                        }
                        absVar.d();
                    } else {
                        if (absVar.b.q) {
                            absVar.o(i2, charSequence);
                        } else {
                            absVar.p(charSequence);
                            Handler handler = absVar.a;
                            abl ablVar = new abl(absVar, i2, charSequence);
                            Context qR2 = absVar.qR();
                            handler.postDelayed(ablVar, (qR2 == null || !abn.i(qR2, Build.MODEL)) ? 2000 : 0);
                        }
                        absVar.b.q = true;
                    }
                } else {
                    if (charSequence == null) {
                        charSequence = absVar.O(R.string.default_error_msg) + " " + i2;
                    }
                    absVar.o(i2, charSequence);
                }
                this.a.b.i(null);
                return;
            }
            return;
        }
        if (i == 1) {
            if (((abw) obj) != null) {
                this.a.aG();
                this.a.b.k(null);
                return;
            }
            return;
        }
        if (i == 2) {
            CharSequence charSequence2 = (CharSequence) obj;
            if (charSequence2 != null) {
                abs absVar2 = this.a;
                if (absVar2.s()) {
                    absVar2.p(charSequence2);
                }
                this.a.b.i(null);
                return;
            }
            return;
        }
        if (i == 3) {
            if (((Boolean) obj).booleanValue()) {
                abs absVar3 = this.a;
                if (absVar3.s()) {
                    absVar3.p(absVar3.O(R.string.fingerprint_not_recognized));
                }
                acd acdVar = absVar3.b;
                if (!acdVar.h) {
                    Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                } else {
                    acdVar.h().execute(new abk(absVar3, 1));
                }
                this.a.b.j(false);
                return;
            }
            return;
        }
        if (i == 4) {
            if (((Boolean) obj).booleanValue()) {
                if (this.a.r()) {
                    this.a.n();
                } else {
                    abs absVar4 = this.a;
                    CharSequence e = absVar4.b.e();
                    if (e == null) {
                        e = absVar4.O(R.string.default_error_msg);
                    }
                    absVar4.o(13, e);
                    absVar4.a(2);
                }
                this.a.b.o(false);
                return;
            }
            return;
        }
        if (((Boolean) obj).booleanValue()) {
            this.a.a(1);
            this.a.d();
            this.a.b.l(false);
        }
    }
}
