package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akyb {
    public final Executor a;
    public final acpl b;
    public final afsy c;
    public final axze d;
    private final Context e;
    private final SharedPreferences f;
    private final String g;

    public akyb(Context context, Executor executor, acpl acplVar, axze axzeVar, afsy afsyVar, SharedPreferences sharedPreferences, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e = context;
        this.a = executor;
        this.b = acplVar;
        this.d = axzeVar;
        this.f = sharedPreferences;
        this.c = afsyVar;
        String string = context.getString(R.string.upload_network_policy_pref_value_wifi);
        zhq.m(string);
        this.g = string;
    }

    public final avta a(String str) {
        NetworkInfo activeNetworkInfo;
        aone createBuilder = avta.a.createBuilder();
        createBuilder.copyOnWrite();
        avta avtaVar = (avta) createBuilder.instance;
        str.getClass();
        avtaVar.b |= 1;
        avtaVar.c = str;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.e.getSystemService("connectivity");
        int i = 7;
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    i = 2;
                } else if (type != 4) {
                    i = type != 9 ? type != 6 ? type != 7 ? 3 : 21 : 20 : 22;
                }
            }
            switch (activeNetworkInfo.getSubtype()) {
                case 1:
                    i = 5;
                    break;
                case 2:
                    i = 4;
                    break;
                case 3:
                    i = 17;
                    break;
                case 4:
                    break;
                case 5:
                    i = 9;
                    break;
                case 6:
                    i = 10;
                    break;
                case 7:
                    i = 6;
                    break;
                case 8:
                    i = 12;
                    break;
                case 9:
                    i = 15;
                    break;
                case 10:
                    i = 13;
                    break;
                case 11:
                    i = 16;
                    break;
                case 12:
                    i = 11;
                    break;
                case 13:
                    i = 18;
                    break;
                case 14:
                    i = 8;
                    break;
                case 15:
                    i = 14;
                    break;
                default:
                    i = 19;
                    break;
            }
        } else {
            i = 1;
        }
        createBuilder.copyOnWrite();
        avta avtaVar2 = (avta) createBuilder.instance;
        avtaVar2.e = i - 1;
        avtaVar2.b |= 8;
        int i2 = true == this.g.equals(this.f.getString(yny.UPLOAD_NETWORK_POLICY, null)) ? 3 : 2;
        createBuilder.copyOnWrite();
        avta avtaVar3 = (avta) createBuilder.instance;
        avtaVar3.d = i2 - 1;
        avtaVar3.b |= 4;
        return (avta) createBuilder.build();
    }

    public final void b(final String str, final arpp arppVar) {
        this.a.execute(new Runnable() { // from class: akya
            @Override // java.lang.Runnable
            public final void run() {
                afsx d;
                akyb akybVar = akyb.this;
                String str2 = str;
                arpp arppVar2 = arppVar;
                if (TextUtils.isEmpty(str2)) {
                    d = akybVar.c.c();
                } else {
                    d = akybVar.c.d(str2);
                }
                if (d == null) {
                    d = afsw.a;
                    String valueOf = String.valueOf(arppVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 46 + String.valueOf(valueOf).length());
                    sb.append("Identity not found. IdentityId: ");
                    sb.append(str2);
                    sb.append(" ClientEvent: ");
                    sb.append(valueOf);
                    zga.m("UploadEventLogger", sb.toString());
                    akybVar.d.d("Identity not found. ClientEvent reported as signed-out.");
                }
                akybVar.b.g(arppVar2, d);
            }
        });
    }

    public final void c(String str, String str2, long j, long j2, long j3, long j4, long j5) {
        avsy a = avsz.a();
        avto avtoVar = avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_COPIED_FILE_CHUNK;
        a.copyOnWrite();
        avsz.d((avsz) a.instance, avtoVar);
        aone createBuilder = avta.a.createBuilder();
        createBuilder.copyOnWrite();
        avta avtaVar = (avta) createBuilder.instance;
        str.getClass();
        avtaVar.b |= 1;
        avtaVar.c = str;
        a.copyOnWrite();
        avsz.c((avsz) a.instance, (avta) createBuilder.build());
        a.copyOnWrite();
        avsz.j((avsz) a.instance, j);
        a.copyOnWrite();
        avsz.m((avsz) a.instance, j2);
        a.copyOnWrite();
        avsz.n((avsz) a.instance, j3);
        a.copyOnWrite();
        avsz.o((avsz) a.instance, j4);
        a.copyOnWrite();
        avsz.p((avsz) a.instance, j5);
        avsz avszVar = (avsz) a.build();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).dV(avszVar);
        b(str2, (arpp) a2.build());
    }

    public final void d(String str, String str2, avto avtoVar) {
        avsy a = avsz.a();
        a.copyOnWrite();
        avsz.d((avsz) a.instance, avtoVar);
        aone createBuilder = avta.a.createBuilder();
        createBuilder.copyOnWrite();
        avta avtaVar = (avta) createBuilder.instance;
        str.getClass();
        avtaVar.b |= 1;
        avtaVar.c = str;
        a.copyOnWrite();
        avsz.c((avsz) a.instance, (avta) createBuilder.build());
        avsz avszVar = (avsz) a.build();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).dV(avszVar);
        b(str2, (arpp) a2.build());
    }

    public final void e(String str, String str2, avtp avtpVar) {
        avsy a = avsz.a();
        avto avtoVar = avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_ABANDONED;
        a.copyOnWrite();
        avsz.d((avsz) a.instance, avtoVar);
        aone createBuilder = avta.a.createBuilder();
        createBuilder.copyOnWrite();
        avta avtaVar = (avta) createBuilder.instance;
        str.getClass();
        avtaVar.b |= 1;
        avtaVar.c = str;
        a.copyOnWrite();
        avsz.c((avsz) a.instance, (avta) createBuilder.build());
        a.copyOnWrite();
        avsz.l((avsz) a.instance, avtpVar);
        avsz avszVar = (avsz) a.build();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).dV(avszVar);
        b(str2, (arpp) a2.build());
    }

    public final void f(String str, avtk avtkVar) {
        avsy a = avsz.a();
        avto avtoVar = avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_CREATION_WARNING;
        a.copyOnWrite();
        avsz.d((avsz) a.instance, avtoVar);
        aone createBuilder = avta.a.createBuilder();
        createBuilder.copyOnWrite();
        avta avtaVar = (avta) createBuilder.instance;
        str.getClass();
        avtaVar.b |= 1;
        avtaVar.c = str;
        a.copyOnWrite();
        avsz.c((avsz) a.instance, (avta) createBuilder.build());
        a.copyOnWrite();
        avsz.g((avsz) a.instance, avtkVar);
        avsz avszVar = (avsz) a.build();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).dV(avszVar);
        this.a.execute(new akxz(this, (arpp) a2.build(), 0));
    }

    public final void g(String str, String str2, avtk avtkVar) {
        avsy a = avsz.a();
        avto avtoVar = avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_FAILED;
        a.copyOnWrite();
        avsz.d((avsz) a.instance, avtoVar);
        aone createBuilder = avta.a.createBuilder();
        createBuilder.copyOnWrite();
        avta avtaVar = (avta) createBuilder.instance;
        str.getClass();
        avtaVar.b |= 1;
        avtaVar.c = str;
        a.copyOnWrite();
        avsz.c((avsz) a.instance, (avta) createBuilder.build());
        a.copyOnWrite();
        avsz.g((avsz) a.instance, avtkVar);
        avsz avszVar = (avsz) a.build();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).dV(avszVar);
        b(str2, (arpp) a2.build());
    }

    public final void h(String str, avto avtoVar, avtn avtnVar) {
        avsy a = avsz.a();
        a.copyOnWrite();
        avsz.d((avsz) a.instance, avtoVar);
        a.copyOnWrite();
        avsz.h((avsz) a.instance, avtnVar);
        aone createBuilder = avta.a.createBuilder();
        createBuilder.copyOnWrite();
        avta avtaVar = (avta) createBuilder.instance;
        str.getClass();
        avtaVar.b |= 1;
        avtaVar.c = str;
        a.copyOnWrite();
        avsz.c((avsz) a.instance, (avta) createBuilder.build());
        avsz avszVar = (avsz) a.build();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).dV(avszVar);
        b(null, (arpp) a2.build());
    }

    public final void i(String str, avto avtoVar, int i, boolean z) {
        aone createBuilder = avth.a.createBuilder();
        aone createBuilder2 = avsx.a.createBuilder();
        createBuilder2.copyOnWrite();
        avsx avsxVar = (avsx) createBuilder2.instance;
        avsxVar.d = i - 1;
        avsxVar.b |= 2;
        createBuilder2.copyOnWrite();
        avsx avsxVar2 = (avsx) createBuilder2.instance;
        avsxVar2.b |= 4;
        avsxVar2.e = z;
        avsx avsxVar3 = (avsx) createBuilder2.build();
        createBuilder.copyOnWrite();
        avth avthVar = (avth) createBuilder.instance;
        avsxVar3.getClass();
        avthVar.c = avsxVar3;
        avthVar.b |= 1;
        avth avthVar2 = (avth) createBuilder.build();
        avsy a = avsz.a();
        a.copyOnWrite();
        avsz.d((avsz) a.instance, avtoVar);
        a.copyOnWrite();
        avsz.r((avsz) a.instance, avthVar2);
        aone createBuilder3 = avta.a.createBuilder();
        createBuilder3.copyOnWrite();
        avta avtaVar = (avta) createBuilder3.instance;
        avtaVar.b |= 1;
        avtaVar.c = str;
        a.copyOnWrite();
        avsz.c((avsz) a.instance, (avta) createBuilder3.build());
        avsz avszVar = (avsz) a.build();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).dV(avszVar);
        this.a.execute(new akxz(this, (arpp) a2.build(), 1));
    }

    public final void j(String str, String str2, avtn avtnVar, int i, boolean z, avtm[] avtmVarArr) {
        avsy a = avsz.a();
        avto avtoVar = avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_CONFIRMED;
        a.copyOnWrite();
        avsz.d((avsz) a.instance, avtoVar);
        aone createBuilder = avta.a.createBuilder();
        createBuilder.copyOnWrite();
        avta avtaVar = (avta) createBuilder.instance;
        str.getClass();
        avtaVar.b |= 1;
        avtaVar.c = str;
        a.copyOnWrite();
        avsz.c((avsz) a.instance, (avta) createBuilder.build());
        aone createBuilder2 = avth.a.createBuilder();
        aone createBuilder3 = avsx.a.createBuilder();
        createBuilder3.copyOnWrite();
        avsx avsxVar = (avsx) createBuilder3.instance;
        avsxVar.c = avtnVar.k;
        avsxVar.b |= 1;
        createBuilder3.copyOnWrite();
        avsx avsxVar2 = (avsx) createBuilder3.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        avsxVar2.d = i2;
        avsxVar2.b |= 2;
        createBuilder3.copyOnWrite();
        avsx avsxVar3 = (avsx) createBuilder3.instance;
        avsxVar3.b |= 4;
        avsxVar3.e = z;
        createBuilder2.copyOnWrite();
        avth avthVar = (avth) createBuilder2.instance;
        avsx avsxVar4 = (avsx) createBuilder3.build();
        avsxVar4.getClass();
        avthVar.c = avsxVar4;
        avthVar.b |= 1;
        List asList = Arrays.asList(avtmVarArr);
        createBuilder2.copyOnWrite();
        avth avthVar2 = (avth) createBuilder2.instance;
        aonu aonuVar = avthVar2.d;
        if (!aonuVar.c()) {
            avthVar2.d = aonm.mutableCopy(aonuVar);
        }
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            avthVar2.d.g(((avtm) it.next()).i);
        }
        avth avthVar3 = (avth) createBuilder2.build();
        a.copyOnWrite();
        avsz.r((avsz) a.instance, avthVar3);
        avsz avszVar = (avsz) a.build();
        arpn a2 = arpp.a();
        a2.copyOnWrite();
        ((arpp) a2.instance).dV(avszVar);
        b(str2, (arpp) a2.build());
    }
}
