package defpackage;

import android.content.SharedPreferences;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aarh implements aasa, aady, ypd {
    public final azrh a;
    public final azrr b;
    public final azrr c;
    public final SharedPreferences d;
    public final yxx e;
    public final aarg h;
    public final aarg i;
    public int j;
    public volatile long k;
    public volatile long l;
    public volatile long m;
    private final shf n;
    private final File o;
    private final File p;
    private boolean q;
    public long f = -1;
    public long g = -1;
    private final ReentrantLock r = new ReentrantLock();

    public aarh(SharedPreferences sharedPreferences, shf shfVar, azrw azrwVar, yxx yxxVar, File file) {
        this.d = sharedPreferences;
        this.n = shfVar;
        this.e = yxxVar;
        this.o = new File(file, "cfg/cg.pb");
        this.p = new File(file, "cfg/cg.pb.new");
        if (yxxVar != null) {
            this.j = (int) yxxVar.f(yxx.C);
        }
        this.i = new aarg(aard.f, aard.a, aard.d, apwy.a, (byte) 1);
        this.h = new aarg(aard.g, aard.c, aard.e, arfd.a, (byte) 2);
        if ((this.j & 4) == 0 && azrwVar != null) {
            ((ypa) azrwVar.get()).g(this);
        }
        azrh e = azrh.e();
        this.a = e;
        azrr ab = azrr.ab();
        this.b = ab;
        azrr ab2 = azrr.ab();
        this.c = ab2;
        final int i = 2;
        ab2.W(new ayrs(this) { // from class: aara
            public final /* synthetic */ aarh a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    aarh aarhVar = this.a;
                    aarhVar.m = aarhVar.a();
                } else if (i2 == 1) {
                    aarh aarhVar2 = this.a;
                    aarhVar2.l = aarhVar2.a();
                } else {
                    aarh aarhVar3 = this.a;
                    aarhVar3.k = aarhVar3.a();
                }
            }
        }, new zxi(5));
        final int i2 = 1;
        ab.W(new ayrs(this) { // from class: aara
            public final /* synthetic */ aarh a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i2;
                if (i22 == 0) {
                    aarh aarhVar = this.a;
                    aarhVar.m = aarhVar.a();
                } else if (i22 == 1) {
                    aarh aarhVar2 = this.a;
                    aarhVar2.l = aarhVar2.a();
                } else {
                    aarh aarhVar3 = this.a;
                    aarhVar3.k = aarhVar3.a();
                }
            }
        }, new zxi(6));
        final int i3 = 0;
        e.as(arfd.a).W(new ayrs(this) { // from class: aara
            public final /* synthetic */ aarh a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                int i22 = i3;
                if (i22 == 0) {
                    aarh aarhVar = this.a;
                    aarhVar.m = aarhVar.a();
                } else if (i22 == 1) {
                    aarh aarhVar2 = this.a;
                    aarhVar2.l = aarhVar2.a();
                } else {
                    aarh aarhVar3 = this.a;
                    aarhVar3.k = aarhVar3.a();
                }
            }
        }, new zxi(7));
    }

    public static apck b(apwy apwyVar) {
        atej atejVar = apwyVar.k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        apck apckVar = atejVar.q;
        return apckVar == null ? apck.a : apckVar;
    }

    public static void e(String str, Throwable th) {
        q(2, str, th);
    }

    public static void j(String str) {
        q(1, str, null);
    }

    public static final void m(String str, Throwable th) {
        e(str.concat(" restore failed"), th);
    }

    private final void n() {
        this.h.a = "";
    }

    private final boolean o() {
        avdz avdzVar = ((arfd) this.h.d).y;
        if (avdzVar == null) {
            avdzVar = avdz.a;
        }
        int i = this.j;
        int i2 = avdzVar.b;
        this.j = i2;
        return ((i2 ^ i) & 1) != 0;
    }

    private final boolean p() {
        try {
            OutputStream w = yjk.w(this.p);
            try {
                w.write(PrivateKeyType.INVALID);
                w.write(PrivateKeyType.INVALID);
                w.write(PrivateKeyType.INVALID);
                w.write(1);
                w.write(0);
                aarf.b(w, b((apwy) this.i.d));
                this.i.c(w);
                this.h.c(w);
                w.close();
                yjk.x(this.o, aarc.a);
                return yjk.t(this.p, this.o, aarc.a);
            } catch (Throwable th) {
                try {
                    w.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (Exception e) {
            e("Failed to backup cfg", e);
            yjk.x(this.p, aarc.a);
            return false;
        }
    }

    private static void q(int i, String str, Throwable th) {
        if (str == null) {
            str = "";
        }
        if (th == null) {
            afsi.b(i, 18, str);
        } else {
            afsi.c(i, 18, str, th);
        }
    }

    private final void r(SharedPreferences.Editor editor) {
        editor.putString("com.google.android.libraries.youtube.innertube.cold_config_group", this.i.a()).putString("com.google.android.libraries.youtube.innertube.cold_hash_data", this.i.a).putLong("com.google.android.libraries.youtube.innertube.cold_stored_timestamp", this.i.b).putString("com.google.android.libraries.youtube.innertube.hot_config_group", this.h.a()).putString("com.google.android.libraries.youtube.innertube.hot_hash_data", this.h.a).putLong("com.google.android.libraries.youtube.innertube.hot_stored_timestamp", this.h.b);
        this.f = this.i.c;
        this.g = this.h.b;
        yjk.x(this.o, aarc.a);
        yjk.x(this.p, aarc.a);
    }

    public final long a() {
        return this.n.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015a A[Catch: all -> 0x0210, TryCatch #2 {all -> 0x0210, blocks: (B:38:0x00b4, B:40:0x00be, B:41:0x00c0, B:44:0x00ca, B:45:0x00d1, B:48:0x00db, B:49:0x00e2, B:51:0x00e6, B:52:0x00e8, B:55:0x00f5, B:57:0x00f9, B:59:0x0132, B:60:0x0156, B:62:0x015a, B:63:0x015c, B:66:0x0165, B:68:0x0169, B:70:0x01a0, B:71:0x01bd, B:73:0x01c3, B:75:0x01d7, B:76:0x01dc, B:77:0x01f4, B:79:0x01f8, B:80:0x0207, B:84:0x01b8, B:87:0x017b, B:89:0x0183, B:90:0x0188, B:92:0x018e, B:93:0x0151, B:96:0x010b, B:99:0x0114, B:100:0x011a, B:102:0x0120), top: B:37:0x00b4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0165 A[Catch: all -> 0x0210, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0210, blocks: (B:38:0x00b4, B:40:0x00be, B:41:0x00c0, B:44:0x00ca, B:45:0x00d1, B:48:0x00db, B:49:0x00e2, B:51:0x00e6, B:52:0x00e8, B:55:0x00f5, B:57:0x00f9, B:59:0x0132, B:60:0x0156, B:62:0x015a, B:63:0x015c, B:66:0x0165, B:68:0x0169, B:70:0x01a0, B:71:0x01bd, B:73:0x01c3, B:75:0x01d7, B:76:0x01dc, B:77:0x01f4, B:79:0x01f8, B:80:0x0207, B:84:0x01b8, B:87:0x017b, B:89:0x0183, B:90:0x0188, B:92:0x018e, B:93:0x0151, B:96:0x010b, B:99:0x0114, B:100:0x011a, B:102:0x0120), top: B:37:0x00b4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a0 A[Catch: all -> 0x0210, TryCatch #2 {all -> 0x0210, blocks: (B:38:0x00b4, B:40:0x00be, B:41:0x00c0, B:44:0x00ca, B:45:0x00d1, B:48:0x00db, B:49:0x00e2, B:51:0x00e6, B:52:0x00e8, B:55:0x00f5, B:57:0x00f9, B:59:0x0132, B:60:0x0156, B:62:0x015a, B:63:0x015c, B:66:0x0165, B:68:0x0169, B:70:0x01a0, B:71:0x01bd, B:73:0x01c3, B:75:0x01d7, B:76:0x01dc, B:77:0x01f4, B:79:0x01f8, B:80:0x0207, B:84:0x01b8, B:87:0x017b, B:89:0x0183, B:90:0x0188, B:92:0x018e, B:93:0x0151, B:96:0x010b, B:99:0x0114, B:100:0x011a, B:102:0x0120), top: B:37:0x00b4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c3 A[Catch: all -> 0x0210, TryCatch #2 {all -> 0x0210, blocks: (B:38:0x00b4, B:40:0x00be, B:41:0x00c0, B:44:0x00ca, B:45:0x00d1, B:48:0x00db, B:49:0x00e2, B:51:0x00e6, B:52:0x00e8, B:55:0x00f5, B:57:0x00f9, B:59:0x0132, B:60:0x0156, B:62:0x015a, B:63:0x015c, B:66:0x0165, B:68:0x0169, B:70:0x01a0, B:71:0x01bd, B:73:0x01c3, B:75:0x01d7, B:76:0x01dc, B:77:0x01f4, B:79:0x01f8, B:80:0x0207, B:84:0x01b8, B:87:0x017b, B:89:0x0183, B:90:0x0188, B:92:0x018e, B:93:0x0151, B:96:0x010b, B:99:0x0114, B:100:0x011a, B:102:0x0120), top: B:37:0x00b4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f8 A[Catch: all -> 0x0210, TryCatch #2 {all -> 0x0210, blocks: (B:38:0x00b4, B:40:0x00be, B:41:0x00c0, B:44:0x00ca, B:45:0x00d1, B:48:0x00db, B:49:0x00e2, B:51:0x00e6, B:52:0x00e8, B:55:0x00f5, B:57:0x00f9, B:59:0x0132, B:60:0x0156, B:62:0x015a, B:63:0x015c, B:66:0x0165, B:68:0x0169, B:70:0x01a0, B:71:0x01bd, B:73:0x01c3, B:75:0x01d7, B:76:0x01dc, B:77:0x01f4, B:79:0x01f8, B:80:0x0207, B:84:0x01b8, B:87:0x017b, B:89:0x0183, B:90:0x0188, B:92:0x018e, B:93:0x0151, B:96:0x010b, B:99:0x0114, B:100:0x011a, B:102:0x0120), top: B:37:0x00b4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b8 A[Catch: all -> 0x0210, TryCatch #2 {all -> 0x0210, blocks: (B:38:0x00b4, B:40:0x00be, B:41:0x00c0, B:44:0x00ca, B:45:0x00d1, B:48:0x00db, B:49:0x00e2, B:51:0x00e6, B:52:0x00e8, B:55:0x00f5, B:57:0x00f9, B:59:0x0132, B:60:0x0156, B:62:0x015a, B:63:0x015c, B:66:0x0165, B:68:0x0169, B:70:0x01a0, B:71:0x01bd, B:73:0x01c3, B:75:0x01d7, B:76:0x01dc, B:77:0x01f4, B:79:0x01f8, B:80:0x0207, B:84:0x01b8, B:87:0x017b, B:89:0x0183, B:90:0x0188, B:92:0x018e, B:93:0x0151, B:96:0x010b, B:99:0x0114, B:100:0x011a, B:102:0x0120), top: B:37:0x00b4, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0181  */
    @Override // defpackage.aasa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.arnd r15) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aarh.c(arnd):void");
    }

    @Override // defpackage.aasa
    public final /* synthetic */ void d(aaru aaruVar, arnd arndVar) {
        whu.U(this, arndVar);
    }

    @Override // defpackage.aasa
    public final /* synthetic */ boolean f(aaru aaruVar) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(ypa ypaVar) {
        final int i = 1;
        ypaVar.a(this, aftm.class, new ypb(this) { // from class: aarb
            public final /* synthetic */ aarh a;

            {
                this.a = this;
            }

            @Override // defpackage.ypb
            public final void a(Object obj) {
                if (i != 0) {
                    this.a.k();
                } else {
                    this.a.l();
                }
            }
        });
        final int i2 = 0;
        ypaVar.a(this, afto.class, new ypb(this) { // from class: aarb
            public final /* synthetic */ aarh a;

            {
                this.a = this;
            }

            @Override // defpackage.ypb
            public final void a(Object obj) {
                if (i2 != 0) {
                    this.a.k();
                } else {
                    this.a.l();
                }
            }
        });
    }

    public final void h(Executor executor, azrw azrwVar, azrw azrwVar2) {
        byte b;
        apck apckVar;
        if (i()) {
            File[] fileArr = {this.o, this.p};
            int i = 0;
            char c = 0;
            loop0: while (true) {
                if (i >= 2) {
                    break;
                }
                try {
                    aarf aarfVar = new aarf(fileArr[i]);
                    while (true) {
                        int i2 = aarfVar.b;
                        byte[] bArr = aarfVar.a;
                        if (i2 >= bArr.length - 1) {
                            break loop0;
                        }
                        if (aarfVar.c <= 0) {
                            b = aarfVar.d;
                            aarfVar.d = (byte) (b + 1);
                        } else {
                            aarfVar.b = i2 + 1;
                            b = bArr[i2];
                        }
                        if (b == 0) {
                            apckVar = (apck) aarfVar.a(apck.a);
                            if (apckVar == null) {
                                apckVar = apck.a;
                            }
                        } else {
                            if (b == 1) {
                                this.i.e(aarfVar);
                            } else if (b == 2) {
                                this.h.e(aarfVar);
                                apckVar = null;
                                b = 2;
                            }
                            apckVar = null;
                        }
                        if (c == 0 && b != 0) {
                            if (((Boolean) ((aadr) azrwVar.get()).b().get()).booleanValue()) {
                                c = 2;
                                break loop0;
                            }
                            c = 1;
                        }
                        if (b == 0) {
                            this.c.sc(apckVar);
                        } else if (b == 1) {
                            this.b.sc((apwy) this.i.d);
                        } else if (b != 2 || this.a.aR()) {
                            e("Bin unknown type", null);
                        } else {
                            this.a.c((arfd) this.h.d);
                        }
                    }
                } catch (FileNotFoundException unused) {
                } catch (Throwable th) {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    e("Bin restore fail", th);
                }
                i++;
            }
            if (c == 2) {
                j("bin resetConfigs");
                this.i.b();
                this.h.b();
                this.j = 0;
                SharedPreferences.Editor edit = this.d.edit();
                r(edit);
                yxx yxxVar = this.e;
                if (yxxVar != null) {
                    yxxVar.h(edit);
                }
                edit.apply();
            }
            aarg aargVar = this.i;
            aargVar.c = aargVar.b;
            if (!this.c.af()) {
                this.c.sc(b((apwy) this.i.d));
            }
            if (!this.b.af()) {
                this.b.sc((apwy) this.i.d);
            }
            if (!this.a.aR()) {
                this.a.c((arfd) this.h.d);
            }
            if ((this.j & 4) == 0 || azrwVar2 == null) {
                return;
            }
            g((ypa) azrwVar2.get());
            return;
        }
        executor.execute(new aare(this, azrwVar, azrwVar2));
    }

    public final boolean i() {
        return (this.j & 1) != 0;
    }

    public final void k() {
        if (i()) {
            n();
        } else {
            this.d.edit().remove("com.google.android.libraries.youtube.innertube.hot_hash_data").apply();
            this.h.a = "";
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            k();
            return null;
        }
        if (i == 1) {
            l();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void l() {
        if (i()) {
            n();
        } else {
            this.d.edit().remove("com.google.android.libraries.youtube.innertube.hot_hash_data").apply();
            this.h.a = "";
        }
    }
}
