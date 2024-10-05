package defpackage;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FileBackupHelper;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class yls extends sha {
    public vcw d;
    public ylg e;

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract amru b();

    @Override // defpackage.sha, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        ylg ylgVar;
        try {
            try {
                this.e.b();
                super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
                ylgVar = this.e;
            } catch (InterruptedException unused) {
                Thread.interrupted();
                ylgVar = this.e;
            }
            ylgVar.d();
        } catch (Throwable th) {
            this.e.d();
            throw th;
        }
    }

    @Override // defpackage.sha, android.app.backup.BackupAgent
    public void onCreate() {
        String join;
        File file;
        File filesDir;
        addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
        this.d = whl.l(getApplicationContext());
        this.e = ylg.a();
        amru b = b();
        amvj amvjVar = (amvj) b;
        String[] strArr = new String[amvjVar.c];
        for (int i = 0; i < amvjVar.c; i++) {
            Context applicationContext = getApplicationContext();
            vcw vcwVar = this.d;
            Uri uri = (Uri) b.get(i);
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
                strArr[i] = join;
            }
            List<String> pathSegments = uri.getPathSegments();
            join = pathSegments.size() > 1 ? TextUtils.join(File.separator, pathSegments.subList(1, pathSegments.size())) : "";
            strArr[i] = join;
        }
        addHelper("protodatastore", new FileBackupHelper(getApplicationContext(), strArr));
    }

    @Override // defpackage.sha, android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        ylg ylgVar;
        try {
            try {
                this.e.b();
                super.onRestore(backupDataInput, i, parcelFileDescriptor);
                ylgVar = this.e;
            } catch (InterruptedException unused) {
                Thread.interrupted();
                ylgVar = this.e;
            }
            ylgVar.d();
        } catch (Throwable th) {
            this.e.d();
            throw th;
        }
    }
}
