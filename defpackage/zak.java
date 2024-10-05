package defpackage;

import android.accounts.AuthenticatorException;
import android.content.Context;
import com.google.android.youtube.R;
import java.io.IOException;
import java.net.SocketException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zak implements zaw {
    private final Context a;
    private final ysy b;
    private final ajm c;
    private final axzg d;

    public zak(Context context, ysy ysyVar, axzg axzgVar, byte[] bArr, byte[] bArr2) {
        context.getClass();
        this.a = context;
        ysyVar.getClass();
        this.b = ysyVar;
        this.c = ajm.a();
        this.d = axzgVar;
    }

    private final zfl f(Object... objArr) {
        if (this.b.o()) {
            if (objArr.length <= 0) {
                return zfl.a(this.a, R.string.common_error_network, new Object[0]);
            }
            return new zfl(this.a.getString(R.string.common_error_network), zfl.c(this.a, R.string.common_error_network, objArr));
        }
        if (objArr.length <= 0) {
            return zfl.b(this.a, 1, R.string.common_no_network, new Object[0]);
        }
        return new zfl(this.a.getString(R.string.common_no_network), zfl.c(this.a, R.string.common_no_network, objArr), 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zaw
    public final zfl a(Throwable th) {
        Boolean bool;
        int i;
        if (th == 0) {
            return zfl.a(this.a, R.string.common_error_generic, new Object[0]);
        }
        if (th instanceof zfz) {
            return ((zfz) th).a(this.a);
        }
        if (th instanceof AuthenticatorException) {
            return zfl.a(this.a, R.string.common_error_authenticating, new Object[0]);
        }
        if (th instanceof SocketException) {
            return f(new Object[0]);
        }
        if (th instanceof ysr) {
            ysr ysrVar = (ysr) th;
            Context context = this.a;
            int i2 = ysrVar.a;
            if (i2 == 403) {
                return new zfl(context.getString(R.string.common_error_forbidden_action), zfl.c(context, R.string.common_error_http, 403));
            }
            if (i2 == 500) {
                return new zfl(context.getString(R.string.common_error_generic), zfl.c(context, R.string.common_error_http, 500));
            }
            if (i2 == 401) {
                return new zfl(context.getString(R.string.common_error_unauthorized), zfl.c(context, R.string.common_error_http, 401));
            }
            String format = String.format(Locale.US, "%d", Integer.valueOf(ysrVar.a));
            return new zfl(context.getString(R.string.common_error_http, this.c.b(format)), zfl.c(context, R.string.common_error_http, format));
        }
        if (th instanceof cnq) {
            cnq cnqVar = (cnq) th;
            cnh cnhVar = cnqVar.b;
            if (cnhVar != null && (i = cnhVar.a) > 0) {
                if (i == 403) {
                    return new zfl(this.a.getString(R.string.common_error_forbidden_action), zfl.c(this.a, R.string.common_error_http, 403));
                }
                if (i == 401) {
                    return new zfl(this.a.getString(R.string.common_error_unauthorized), zfl.c(this.a, R.string.common_error_http, 401));
                }
                if (i == 500) {
                    return new zfl(this.a.getString(R.string.common_error_generic), zfl.c(this.a, R.string.common_error_http, 500));
                }
                String format2 = String.format(Locale.US, "%d", Integer.valueOf(cnhVar.a));
                return new zfl(this.a.getString(R.string.common_error_http, this.c.b(format2)), zfl.c(this.a, R.string.common_error_http, format2));
            }
            if (th instanceof cnb) {
                if (!(th.getCause() instanceof IOException)) {
                    String message = th.getMessage();
                    if (message == null || message.isEmpty()) {
                        return zfl.a(this.a, R.string.common_error_authenticating, new Object[0]);
                    }
                    return new zfl(this.a.getString(R.string.common_error_authenticating), zfl.c(this.a, R.string.common_error_authenticating, message.replace(' ', '_')));
                }
                axzg axzgVar = this.d;
                if (axzgVar != null) {
                    aqvj aqvjVar = axzgVar.b.b().C;
                    if (aqvjVar == null) {
                        aqvjVar = aqvj.a;
                    }
                    if (aqvjVar.a(45355319L)) {
                        aoot aootVar = aqvjVar.b;
                        if (!aootVar.containsKey(45355319L)) {
                            throw new IllegalArgumentException();
                        }
                        aqvk aqvkVar = (aqvk) aootVar.get(45355319L);
                        bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
                    } else {
                        bool = false;
                    }
                    if (bool.booleanValue()) {
                        return f("AuthFailureError");
                    }
                }
            }
            if (cnqVar instanceof cnp) {
                return zfl.a(this.a, R.string.common_error_timeout, new Object[0]);
            }
        }
        if (th instanceof IOException) {
            return f(new Object[0]);
        }
        return a(th.getCause());
    }

    @Override // defpackage.zaw
    public final String b(Throwable th) {
        return a(th).a;
    }

    @Override // defpackage.zaw
    public final void c(int i) {
        d(this.a.getString(i));
    }

    @Override // defpackage.zaw
    public final void d(String str) {
        if (str == null) {
            whu.L(this.a, "", 1);
        }
        whu.L(this.a, str, 1);
    }

    @Override // defpackage.zaw
    public final void e(Throwable th) {
        d(b(th));
    }
}
