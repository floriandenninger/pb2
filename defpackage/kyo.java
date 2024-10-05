package defpackage;

import android.app.Activity;
import android.net.Uri;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kyo {
    public final zaw a;
    private final Activity b;
    private final afsy c;
    private final aftn d;
    private final aayg e;
    private final ypa f;
    private final aahd g;
    private final Executor h;

    public kyo(Activity activity, afsy afsyVar, aftn aftnVar, aayg aaygVar, zaw zawVar, ypa ypaVar, aahd aahdVar, Executor executor) {
        this.b = activity;
        this.e = aaygVar;
        this.c = afsyVar;
        this.d = aftnVar;
        this.a = zawVar;
        this.f = ypaVar;
        this.g = aahdVar;
        this.h = executor;
    }

    public final void a(final asno asnoVar, final String str, byte[] bArr) {
        ynk ynkVar = new ynk() { // from class: kyl
            @Override // defpackage.zfi
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final void a(Throwable th) {
                kyo kyoVar = kyo.this;
                zga.d("Error rating", th);
                kyoVar.a.e(th);
            }
        };
        Runnable runnable = anij.a;
        asno asnoVar2 = asno.LIKE;
        int ordinal = asnoVar.ordinal();
        if (ordinal == 0) {
            aaye b = this.e.b();
            b.m(bArr);
            b.v(str);
            final int i = 0;
            ynm.l(this.e.g(b), this.h, ynkVar, new ynl(this) { // from class: kym
                public final /* synthetic */ kyo a;

                {
                    this.a = this;
                }

                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    int i2 = i;
                    if (i2 == 0) {
                        this.a.c(str, asnoVar, ((artt) obj).d);
                    } else if (i2 == 1) {
                        this.a.c(str, asnoVar, ((artr) obj).c);
                    } else {
                        this.a.c(str, asnoVar, ((artv) obj).c);
                    }
                }
            }, runnable);
            return;
        }
        final int i2 = 1;
        if (ordinal == 1) {
            aayd a = this.e.a();
            a.m(bArr);
            a.v(str);
            ynm.l(this.e.e(a), this.h, ynkVar, new ynl(this) { // from class: kym
                public final /* synthetic */ kyo a;

                {
                    this.a = this;
                }

                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    int i22 = i2;
                    if (i22 == 0) {
                        this.a.c(str, asnoVar, ((artt) obj).d);
                    } else if (i22 == 1) {
                        this.a.c(str, asnoVar, ((artr) obj).c);
                    } else {
                        this.a.c(str, asnoVar, ((artv) obj).c);
                    }
                }
            }, runnable);
            return;
        }
        final int i3 = 2;
        if (ordinal != 2) {
            return;
        }
        aayf d = this.e.d();
        d.m(bArr);
        d.v(str);
        ynm.l(this.e.i(d), this.h, ynkVar, new ynl(this) { // from class: kym
            public final /* synthetic */ kyo a;

            {
                this.a = this;
            }

            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                int i22 = i3;
                if (i22 == 0) {
                    this.a.c(str, asnoVar, ((artt) obj).d);
                } else if (i22 == 1) {
                    this.a.c(str, asnoVar, ((artr) obj).c);
                } else {
                    this.a.c(str, asnoVar, ((artv) obj).c);
                }
            }
        }, runnable);
    }

    public final void b(asno asnoVar, String str) {
        if (this.c.t()) {
            a(asnoVar, str, aaef.b);
        } else {
            this.d.c(this.b, null, new kyn(this, asnoVar, str));
        }
    }

    public final void c(String str, asno asnoVar, List list) {
        if (list != null && list.size() > 0) {
            this.g.d(list, null);
        }
        this.f.f(new ghf(str, asnoVar));
    }

    public final void d(String str, String str2) {
        str.getClass();
        wbs.aG(this.b, str2, new Uri.Builder().scheme("http").authority("www.youtube.com").appendPath("playlist").appendQueryParameter("list", str).build());
    }
}
