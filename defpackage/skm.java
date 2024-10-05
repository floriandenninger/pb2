package defpackage;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class skm {
    public static final skm a = new skm();
    private final Object b = new Object();
    private final skl[] c;
    private volatile ajyw d;

    private skm() {
        int[] b = aord.b();
        int i = 0;
        for (int i2 = 0; i2 < 26; i2++) {
            int i3 = b[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            i = Math.max(i, i4);
        }
        this.c = new skl[i + 1];
        int[] b2 = aord.b();
        for (int i5 = 0; i5 < 26; i5++) {
            int i6 = b2[i5];
            int i7 = i6 - 1;
            if (i6 != 0) {
                switch (i7) {
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                        this.c[i7] = new skl();
                        this.c[i7].a = amru.q();
                        break;
                }
            } else {
                throw null;
            }
        }
    }

    public final skk a(int i, sjw sjwVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return skg.a;
        }
        if (i2 == 1) {
            return skg.b;
        }
        int i3 = 0;
        if (i2 == 2) {
            if (sjwVar.c) {
                try {
                    Account[] accountsByType = AccountManager.get(sjwVar.a).getAccountsByType("com.google");
                    int length = accountsByType.length;
                    while (i3 < length) {
                        Account account = accountsByType[i3];
                        if (account.name != null && account.type != null && account.name.endsWith("@google.com")) {
                            return skg.b;
                        }
                        i3++;
                    }
                } catch (SecurityException unused) {
                }
            }
            if (this.d == null) {
                synchronized (this.b) {
                    if (this.d == null) {
                        sko skoVar = new sko();
                        Context applicationContext = sjwVar.a.getApplicationContext();
                        applicationContext.getClass();
                        skoVar.a = applicationContext;
                        ayaw.j(skoVar.a, Context.class);
                        this.d = new ajyw(skoVar.a);
                    }
                }
            }
            return (skr) this.d.c.get();
        }
        if (i2 == 3) {
            skp skpVar = new skp();
            skpVar.a = sjwVar;
            ayaw.j(skpVar.a, sjw.class);
            return new skg(2);
        }
        if (i2 != 4 && i2 != 5 && i2 != 26) {
            switch (i2) {
                case 7:
                    return skg.b;
                case 8:
                    return skg.b;
                case 9:
                    return skg.b;
                case 10:
                    return skg.b;
                default:
                    switch (i2) {
                        case 22:
                            return skg.b;
                        case 23:
                            return skg.b;
                        case 24:
                            return skg.b;
                        default:
                            skl sklVar = this.c[i2];
                            skh skhVar = null;
                            if (sklVar != null) {
                                amru amruVar = sklVar.a;
                                int i4 = ((amvj) amruVar).c;
                                while (i3 < i4) {
                                    skj skjVar = (skj) amruVar.get(i3);
                                    ammv a2 = skjVar.b().a();
                                    if (!a2.h() || ((amru) a2.c()).isEmpty()) {
                                        skhVar = skjVar.a();
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            return skhVar != null ? skhVar : skg.a;
                    }
            }
        }
        return skg.b;
    }
}
