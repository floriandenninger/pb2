package defpackage;

import android.accounts.Account;
import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vrn {
    private static final amxj d = amxj.l("com/google/android/libraries/user/profile/photopicker/picker/ActivityParams");
    public final ammv a;
    public final ammv b;
    public final aoez c;
    private final ammv e;

    public vrn(ci ciVar, vjv vjvVar) {
        ammv ammvVar;
        String str;
        ammv i = ammv.i(ciVar.getIntent().getExtras());
        ammv i2 = i.h() ? ammv.i(ciVar.getIntent().getExtras().getString("com.google.profile.photopicker.ACCOUNT")) : amlr.a;
        this.e = i2;
        if (i2.h()) {
            Account[] a = vjvVar.a();
            String str2 = (String) i2.c();
            for (Account account : a) {
                if (account.name.equals(str2)) {
                    ammvVar = ammv.j(account);
                    break;
                }
            }
        }
        ammvVar = amlr.a;
        this.a = ammvVar;
        if (i.h() && ((Bundle) i.c()).containsKey("com.google.profile.photopicker.HOST_INFO")) {
            aone builder = ((aofn) amkq.ck((Bundle) i.c(), "com.google.profile.photopicker.HOST_INFO", aofn.a, aomw.b())).toBuilder();
            Application application = ciVar.getApplication();
            try {
                str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                str = "not available";
            }
            builder.copyOnWrite();
            aofn aofnVar = (aofn) builder.instance;
            str.getClass();
            aofnVar.b |= 2;
            aofnVar.d = str;
            this.b = ammv.j((aofn) builder.build());
        } else {
            this.b = amlr.a;
        }
        aone createBuilder = aoez.a.createBuilder();
        createBuilder.copyOnWrite();
        aoez aoezVar = (aoez) createBuilder.instance;
        aoezVar.b |= 1;
        aoezVar.c = "0.1";
        createBuilder.copyOnWrite();
        aoez aoezVar2 = (aoez) createBuilder.instance;
        aoezVar2.b |= 2;
        aoezVar2.d = 397934269L;
        this.c = (aoez) createBuilder.build();
    }

    public final String a() {
        return (String) this.e.c();
    }

    public final boolean b() {
        if (!this.e.h()) {
            ((amxh) ((amxh) d.g()).i("com/google/android/libraries/user/profile/photopicker/picker/ActivityParams", "hasValidParams", 129, "ActivityParams.java")).q("Photopicker parameters invalid: PHOTO_PICKER_MESSAGE_ACCOUNT is missing.");
            return false;
        }
        if (!this.a.h()) {
            ((amxh) ((amxh) d.g()).i("com/google/android/libraries/user/profile/photopicker/picker/ActivityParams", "hasValidParams", 134, "ActivityParams.java")).q("Photopicker parameters invalid: the specified account was not present.");
            return false;
        }
        if (this.b.h()) {
            return true;
        }
        ((amxh) ((amxh) d.g()).i("com/google/android/libraries/user/profile/photopicker/picker/ActivityParams", "hasValidParams", 139, "ActivityParams.java")).q("Photopicker parameters invalid: the contacts host information was not present.");
        return false;
    }
}
