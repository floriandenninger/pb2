package defpackage;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rfm implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ rfp f;

    public rfm(rfp rfpVar, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f = rfpVar;
        this.a = i;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rgc g = this.f.w.g();
        if (g.m()) {
            rfp rfpVar = this.f;
            if (rfpVar.a == 0) {
                rem J2 = rfpVar.J();
                if (J2.b == null) {
                    synchronized (J2) {
                        if (J2.b == null) {
                            ApplicationInfo applicationInfo = J2.I().getApplicationInfo();
                            String a = qtp.a();
                            if (applicationInfo != null) {
                                String str = applicationInfo.processName;
                                J2.b = Boolean.valueOf(str != null && str.equals(a));
                            }
                            if (J2.b == null) {
                                J2.b = Boolean.TRUE;
                                J2.aF().c.a("My process not in the list of running processes");
                            }
                        }
                    }
                }
                if (J2.b.booleanValue()) {
                    rfp rfpVar2 = this.f;
                    rfpVar2.P();
                    rfpVar2.a = 'C';
                } else {
                    rfp rfpVar3 = this.f;
                    rfpVar3.P();
                    rfpVar3.a = 'c';
                }
            }
            rfp rfpVar4 = this.f;
            if (rfpVar4.b < 0) {
                rfpVar4.J().y();
                rfpVar4.b = 44000L;
            }
            char charAt = "01VDIWEA?".charAt(this.a);
            rfp rfpVar5 = this.f;
            char c = rfpVar5.a;
            long j = rfpVar5.b;
            String b = rfp.b(true, this.b, this.c, this.d, this.e);
            StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(c);
            sb.append(j);
            sb.append(":");
            sb.append(b);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.b.substring(0, 1024);
            }
            rga rgaVar = g.c;
            if (rgaVar != null) {
                rgaVar.e.n();
                if (rgaVar.a() == 0) {
                    rgaVar.b();
                }
                if (sb2 == null) {
                    sb2 = "";
                }
                long j2 = rgaVar.e.a().getLong(rgaVar.b, 0L);
                if (j2 <= 0) {
                    SharedPreferences.Editor edit = rgaVar.e.a().edit();
                    edit.putString(rgaVar.c, sb2);
                    edit.putLong(rgaVar.b, 1L);
                    edit.apply();
                    return;
                }
                long nextLong = rgaVar.e.N().A().nextLong();
                long j3 = j2 + 1;
                long j4 = Long.MAX_VALUE / j3;
                SharedPreferences.Editor edit2 = rgaVar.e.a().edit();
                if ((Long.MAX_VALUE & nextLong) < j4) {
                    edit2.putString(rgaVar.c, sb2);
                }
                edit2.putLong(rgaVar.b, j3);
                edit2.apply();
                return;
            }
            return;
        }
        this.f.g(6, "Persisted config not initialized. Not logging error/warn");
    }
}
