package com.google.android.apps.youtube.app.application.backup;

import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.BackupManager;
import android.app.backup.FileBackupHelper;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.FileObserver;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import defpackage.aadw;
import defpackage.adyu;
import defpackage.aghv;
import defpackage.ahbw;
import defpackage.ahbx;
import defpackage.akwg;
import defpackage.amlr;
import defpackage.amml;
import defpackage.ammv;
import defpackage.amrp;
import defpackage.amru;
import defpackage.amvj;
import defpackage.anaf;
import defpackage.atfq;
import defpackage.auie;
import defpackage.emm;
import defpackage.emn;
import defpackage.emo;
import defpackage.emp;
import defpackage.emq;
import defpackage.evr;
import defpackage.fav;
import defpackage.fkc;
import defpackage.gzp;
import defpackage.lyl;
import defpackage.mcy;
import defpackage.oba;
import defpackage.opn;
import defpackage.vcw;
import defpackage.vef;
import defpackage.wcy;
import defpackage.whl;
import defpackage.ylg;
import defpackage.yls;
import defpackage.yny;
import defpackage.zfy;
import defpackage.zga;
import defpackage.zgx;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class YouTubeBackupAgent extends yls {
    public static final Class[] a = {fav.class, fkc.class, ahbw.class, ahbx.class, wcy.class, yny.class, aghv.class, akwg.class, adyu.class, opn.class, lyl.class, mcy.class, evr.class, oba.class};
    private static final Map f;
    public zfy b;
    public aadw c;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("youtube", emq.a);
        f = hashMap;
    }

    public static FileObserver a(Context context) {
        emo emoVar = new emo(context.getDatabasePath("identity.db").getPath(), context);
        emoVar.startWatching();
        return emoVar;
    }

    public static void d(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("youtube", 0);
        if (!sharedPreferences.getBoolean("got_future_restore", false) || zgx.a(context) < sharedPreferences.getInt("future_restore_version", Integer.MAX_VALUE)) {
            return;
        }
        emp empVar = new emp(sharedPreferences);
        zga.g("Triggering manual restore.");
        new BackupManager(context).requestRestore(empVar);
    }

    public static void e(Context context) {
        BackupManager.dataChanged(context.getPackageName());
        context.getSharedPreferences("youtube", 0).edit().putBoolean("got_future_restore", false).apply();
    }

    public static boolean f(zfy zfyVar) {
        return zfyVar == null || zfyVar.e("enable_backup_and_restore", true);
    }

    public static void g(Context context) {
        context.getSharedPreferences("youtube", 0).registerOnSharedPreferenceChangeListener(new emn(context));
    }

    private final File k() {
        return getDatabasePath("identity.db");
    }

    private final File l() {
        return new File(getFilesDir(), "identity.db");
    }

    private static final void m(File file, File file2) {
        try {
            anaf.s(file, file2);
        } catch (IOException unused) {
            zga.g("Unable to copy identity database.");
        }
    }

    private static final void n(File file) {
        if (file.delete()) {
            return;
        }
        zga.g("Unable to delete identity database file from files directory.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yls
    public final amru b() {
        amrp f2 = amru.f();
        f2.h(adyu.dz(getApplicationContext()));
        f2.h(ahbw.b(getApplicationContext()));
        f2.h(ahbx.v(getApplicationContext()));
        f2.h(whl.s(getApplicationContext(), "commonui", "pivotbar_proto.pb"));
        f2.h(whl.s(getApplicationContext(), "commonui", "topbar_proto.pb"));
        f2.h(evr.j(getApplicationContext()));
        f2.h(whl.s(getApplicationContext(), "commonui", "spatial_audio_mealbar_proto.pb"));
        f2.h(evr.a(getApplicationContext()));
        f2.h(oba.b(getApplicationContext()));
        aadw aadwVar = this.c;
        if (aadwVar != null) {
            atfq atfqVar = aadwVar.b().o;
            if (atfqVar == null) {
                atfqVar = atfq.a;
            }
            auie auieVar = atfqVar.g;
            if (auieVar == null) {
                auieVar = auie.a;
            }
            if (auieVar.h) {
                f2.h(whl.s(getApplicationContext(), "offline", "offlinemainbackedup.pb"));
            }
        }
        return f2.g();
    }

    @Override // defpackage.sha
    protected final Map c() {
        return f;
    }

    @Override // defpackage.yls, defpackage.sha, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        if (f(this.b)) {
            File k = k();
            File l = l();
            m(k, l);
            super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
            n(l);
        }
    }

    @Override // defpackage.yls, defpackage.sha, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public final void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        Context applicationContext;
        int a2;
        if (f(this.b) && (a2 = zgx.a((applicationContext = getApplicationContext()))) != 0) {
            if (i > a2) {
                applicationContext.getSharedPreferences("youtube", 0).edit().putBoolean("got_future_restore", true).putInt("future_restore_version", i).apply();
                zga.g("Restore from future version skipped - will trigger a manual restore at next update.");
                return;
            }
            super.onRestore(backupDataInput, i, parcelFileDescriptor);
            zga.g("Restore initiated.");
            File l = l();
            m(l, k());
            n(l);
        }
    }

    @Override // defpackage.yls, defpackage.sha, android.app.backup.BackupAgent
    public final void onCreate() {
        ammv ammvVar;
        String join;
        File file;
        File filesDir;
        Context context = this;
        int i = 0;
        while (true) {
            if (i >= 10000) {
                ammvVar = amlr.a;
                break;
            }
            if (context != null) {
                if (!(context instanceof Application)) {
                    if (!(context instanceof Service)) {
                        if (!(context instanceof Activity)) {
                            if (context instanceof ContextWrapper) {
                                context = ((ContextWrapper) context).getBaseContext();
                            } else {
                                context = context.getApplicationContext();
                            }
                            i++;
                        } else {
                            ammvVar = ammv.j(((Activity) context).getApplication());
                            break;
                        }
                    } else {
                        ammvVar = ammv.j(((Service) context).getApplication());
                        break;
                    }
                } else {
                    ammvVar = ammv.j((Application) context);
                    break;
                }
            } else {
                ammvVar = amlr.a;
                break;
            }
        }
        final Class<emm> cls = emm.class;
        ammv ammvVar2 = (ammv) ammvVar.b(new amml() { // from class: zfg
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                Class cls2 = cls;
                Object q = yjj.q((Application) obj);
                return ammv.i(cls2.isInstance(q) ? cls2.cast(q) : null);
            }
        }).d(gzp.p);
        if (!ammvVar2.h()) {
            zga.l("Skipping auto-backup due to unknown component");
            return;
        }
        ((emm) ammvVar2.c()).iX(this);
        if (f(this.b)) {
            addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
            this.d = whl.l(getApplicationContext());
            this.e = ylg.a();
            amru b = b();
            amvj amvjVar = (amvj) b;
            String[] strArr = new String[amvjVar.c];
            for (int i2 = 0; i2 < amvjVar.c; i2++) {
                Context applicationContext = getApplicationContext();
                vcw vcwVar = this.d;
                Uri uri = (Uri) b.get(i2);
                vef b2 = vef.b();
                b2.d();
                try {
                    file = (File) vcwVar.c(uri, b2);
                    filesDir = applicationContext.getFilesDir();
                } catch (IOException e) {
                    zga.d("Failed to find the file from given uri", e);
                }
                if (file.getPath().startsWith(filesDir.getPath())) {
                    join = file.getPath().replace(filesDir.getPath(), "");
                    strArr[i2] = join;
                }
                List<String> pathSegments = uri.getPathSegments();
                join = pathSegments.size() > 1 ? TextUtils.join(File.separator, pathSegments.subList(1, pathSegments.size())) : "";
                strArr[i2] = join;
            }
            addHelper("protodatastore", new FileBackupHelper(getApplicationContext(), strArr));
            addHelper("DATABASES", new FileBackupHelper(this, "identity.db"));
        }
    }
}
