package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMetadata;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.EventParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rff extends ecq implements rfg {
    public final rki a;
    private Boolean b;
    private String c;

    public rff() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    private final void d(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.b == null) {
                        if (!"com.google.android.gms".equals(this.c)) {
                            Context b = this.a.b();
                            if (oba.Y(b, Binder.getCallingUid(), "com.google.android.gms")) {
                                try {
                                    if (qnn.b(b).c(b.getPackageManager().getPackageInfo("com.google.android.gms", 64))) {
                                    }
                                } catch (PackageManager.NameNotFoundException unused) {
                                }
                            }
                            if (!qnn.b(this.a.b()).d(Binder.getCallingUid())) {
                                z2 = false;
                                this.b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.b = Boolean.valueOf(z2);
                    }
                    if (this.b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.a.aF().c.b("Measurement Service called with invalid calling package. appId", rfp.a(str));
                    throw e;
                }
            }
            if (this.c == null && qnm.h(this.a.b(), Binder.getCallingUid(), str)) {
                this.c = str;
            }
            if (str.equals(this.c)) {
                return;
            } else {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
        }
        this.a.aF().c.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void e(AppMetadata appMetadata) {
        qip.an(appMetadata);
        qip.ax(appMetadata.a);
        d(appMetadata.a, false);
        this.a.s().aa(appMetadata.b, appMetadata.q, appMetadata.u);
    }

    @Override // defpackage.rfg
    public final String a(AppMetadata appMetadata) {
        e(appMetadata);
        return this.a.u(appMetadata);
    }

    public final void b(EventParcel eventParcel, AppMetadata appMetadata) {
        this.a.w();
        this.a.A(eventParcel, appMetadata);
    }

    public final void c(Runnable runnable) {
        qip.an(runnable);
        if (this.a.aG().i()) {
            runnable.run();
        } else {
            this.a.aG().g(runnable);
        }
    }

    @Override // defpackage.rfg
    public final List f(String str, String str2, AppMetadata appMetadata) {
        e(appMetadata);
        String str3 = appMetadata.a;
        qip.an(str3);
        try {
            return (List) this.a.aG().b(new rgx(this, str3, str, str2, 2, (char[]) null)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.aF().c.b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.rfg
    public final List g(String str, String str2, String str3) {
        d(str, true);
        try {
            return (List) this.a.aG().b(new rgx(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.aF().c.b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.rfg
    public final List h(String str, String str2, boolean z, AppMetadata appMetadata) {
        e(appMetadata);
        String str3 = appMetadata.a;
        qip.an(str3);
        try {
            List<rkk> list = (List) this.a.aG().b(new rgx(this, str3, str, str2, 1, (byte[]) null)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (rkk rkkVar : list) {
                if (z || !rkm.am(rkkVar.c)) {
                    arrayList.add(new UserAttributeParcel(rkkVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.aF().c.c("Failed to query user properties. appId", rfp.a(appMetadata.a), e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.rfg
    public final List i(String str, String str2, String str3, boolean z) {
        d(str, true);
        try {
            List<rkk> list = (List) this.a.aG().b(new rgx(this, str, str2, str3, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (rkk rkkVar : list) {
                if (z || !rkm.am(rkkVar.c)) {
                    arrayList.add(new UserAttributeParcel(rkkVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.aF().c.c("Failed to get user properties as. appId", rfp.a(str), e);
            return Collections.emptyList();
        }
    }

    @Override // defpackage.rfg
    public final void j(AppMetadata appMetadata) {
        e(appMetadata);
        c(new rgy(this, appMetadata, 3));
    }

    @Override // defpackage.rfg
    public final void k(EventParcel eventParcel, AppMetadata appMetadata) {
        qip.an(eventParcel);
        e(appMetadata);
        c(new rgz(this, eventParcel, appMetadata));
    }

    @Override // defpackage.rfg
    public final void l(AppMetadata appMetadata) {
        qip.ax(appMetadata.a);
        d(appMetadata.a, false);
        c(new rgy(this, appMetadata, 1));
    }

    @Override // defpackage.rfg
    public final void m(ConditionalUserPropertyParcel conditionalUserPropertyParcel, AppMetadata appMetadata) {
        qip.an(conditionalUserPropertyParcel);
        qip.an(conditionalUserPropertyParcel.c);
        e(appMetadata);
        ConditionalUserPropertyParcel conditionalUserPropertyParcel2 = new ConditionalUserPropertyParcel(conditionalUserPropertyParcel);
        conditionalUserPropertyParcel2.a = appMetadata.a;
        c(new rgv(this, conditionalUserPropertyParcel2, appMetadata));
    }

    @Override // defpackage.rfg
    public final void n(AppMetadata appMetadata) {
        qip.ax(appMetadata.a);
        qip.an(appMetadata.v);
        rgy rgyVar = new rgy(this, appMetadata, 2);
        if (this.a.aG().i()) {
            rgyVar.run();
        } else {
            this.a.aG().h(rgyVar);
        }
    }

    @Override // defpackage.rfg
    public final void o(long j, String str, String str2, String str3) {
        c(new rhe(this, str2, str3, str, j));
    }

    @Override // defpackage.rfg
    public final void p(final Bundle bundle, AppMetadata appMetadata) {
        e(appMetadata);
        final String str = appMetadata.a;
        qip.an(str);
        c(new Runnable() { // from class: rgu
            @Override // java.lang.Runnable
            public final void run() {
                rff rffVar = rff.this;
                String str2 = str;
                Bundle bundle2 = bundle;
                req j = rffVar.a.j();
                j.n();
                j.V();
                byte[] byteArray = j.U().g(new reu(j.w, "", str2, "dep", 0L, 0L, bundle2)).toByteArray();
                j.aF().k.c("Saving default event parameters, appId, data size", j.L().c(str2), Integer.valueOf(byteArray.length));
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str2);
                contentValues.put("parameters", byteArray);
                try {
                    if (j.d().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        j.aF().c.b("Failed to insert default event parameters (got -1). appId", rfp.a(str2));
                    }
                } catch (SQLiteException e) {
                    j.aF().c.c("Error storing default event parameters. appId", rfp.a(str2), e);
                }
            }
        });
    }

    @Override // defpackage.rfg
    public final void q(AppMetadata appMetadata) {
        e(appMetadata);
        c(new rgy(this, appMetadata, 0));
    }

    @Override // defpackage.rfg
    public final void r(UserAttributeParcel userAttributeParcel, AppMetadata appMetadata) {
        qip.an(userAttributeParcel);
        e(appMetadata);
        c(new rhc(this, userAttributeParcel, appMetadata));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rfg
    public final byte[] s(EventParcel eventParcel, String str) {
        qip.ax(str);
        qip.an(eventParcel);
        d(str, true);
        this.a.aF().j.b("Log and bundle. event", this.a.l().c(eventParcel.a));
        this.a.T();
        long nanoTime = System.nanoTime() / 1000000;
        rgr aG = this.a.aG();
        rhb rhbVar = new rhb(this, eventParcel, str);
        aG.j();
        rgp rgpVar = new rgp(aG, rhbVar, true);
        if (Thread.currentThread() != aG.b) {
            aG.c(rgpVar);
        } else {
            rgpVar.run();
        }
        try {
            byte[] bArr = (byte[]) rgpVar.get();
            if (bArr == null) {
                this.a.aF().c.b("Log and bundle returned null. appId", rfp.a(str));
                bArr = new byte[0];
            }
            this.a.T();
            this.a.aF().j.d("Log and bundle processed. event, size, time_ms", this.a.l().c(eventParcel.a), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
            return bArr;
        } catch (InterruptedException | ExecutionException e) {
            this.a.aF().c.d("Failed to log and bundle. appId, event, error", rfp.a(str), this.a.l().c(eventParcel.a), e);
            return null;
        }
    }

    public rff(rki rkiVar) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        qip.an(rkiVar);
        this.a = rkiVar;
        this.c = null;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0001. Please report as an issue. */
    @Override // defpackage.ecq
    protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        ArrayList arrayList;
        switch (i) {
            case 1:
                k((EventParcel) ecr.a(parcel, EventParcel.CREATOR), (AppMetadata) ecr.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                r((UserAttributeParcel) ecr.a(parcel, UserAttributeParcel.CREATOR), (AppMetadata) ecr.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                j((AppMetadata) ecr.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                EventParcel eventParcel = (EventParcel) ecr.a(parcel, EventParcel.CREATOR);
                String readString = parcel.readString();
                parcel.readString();
                qip.an(eventParcel);
                qip.ax(readString);
                d(readString, true);
                c(new rha(this, eventParcel, readString));
                parcel2.writeNoException();
                return true;
            case 6:
                q((AppMetadata) ecr.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                AppMetadata appMetadata = (AppMetadata) ecr.a(parcel, AppMetadata.CREATOR);
                boolean j = ecr.j(parcel);
                e(appMetadata);
                String str = appMetadata.a;
                qip.an(str);
                try {
                    List<rkk> list = (List) this.a.aG().b(new rhd(this, str)).get();
                    arrayList = new ArrayList(list.size());
                    for (rkk rkkVar : list) {
                        if (j || !rkm.am(rkkVar.c)) {
                            arrayList.add(new UserAttributeParcel(rkkVar));
                        }
                    }
                } catch (InterruptedException | ExecutionException e) {
                    this.a.aF().c.c("Failed to get user properties. appId", rfp.a(appMetadata.a), e);
                    arrayList = null;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                byte[] s = s((EventParcel) ecr.a(parcel, EventParcel.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(s);
                return true;
            case 10:
                o(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String a = a((AppMetadata) ecr.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 12:
                m((ConditionalUserPropertyParcel) ecr.a(parcel, ConditionalUserPropertyParcel.CREATOR), (AppMetadata) ecr.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                ConditionalUserPropertyParcel conditionalUserPropertyParcel = (ConditionalUserPropertyParcel) ecr.a(parcel, ConditionalUserPropertyParcel.CREATOR);
                qip.an(conditionalUserPropertyParcel);
                qip.an(conditionalUserPropertyParcel.c);
                qip.ax(conditionalUserPropertyParcel.a);
                d(conditionalUserPropertyParcel.a, true);
                c(new rgw(this, new ConditionalUserPropertyParcel(conditionalUserPropertyParcel)));
                parcel2.writeNoException();
                return true;
            case 14:
                List h = h(parcel.readString(), parcel.readString(), ecr.j(parcel), (AppMetadata) ecr.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(h);
                return true;
            case 15:
                List i3 = i(parcel.readString(), parcel.readString(), parcel.readString(), ecr.j(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(i3);
                return true;
            case 16:
                List f = f(parcel.readString(), parcel.readString(), (AppMetadata) ecr.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(f);
                return true;
            case 17:
                List g = g(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(g);
                return true;
            case 18:
                l((AppMetadata) ecr.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            case 19:
                p((Bundle) ecr.a(parcel, Bundle.CREATOR), (AppMetadata) ecr.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
            case 20:
                n((AppMetadata) ecr.a(parcel, AppMetadata.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
