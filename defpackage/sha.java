package defpackage;

import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.SharedPreferencesBackupHelper;
import android.content.SharedPreferences;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class sha extends BackupAgentHelper {
    private final void a() {
        getSharedPreferences("persistent_backup_agent_helper", 0).edit().clear().apply();
    }

    public static void i(SharedPreferences.Editor editor, String str, Object obj) {
        if (obj instanceof Boolean) {
            editor.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            editor.putFloat(str, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Integer) {
            editor.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            editor.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            editor.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Set) {
            Set<String> set = (Set) obj;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof String)) {
                    String valueOf = String.valueOf(obj != null ? obj.getClass() : null);
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 82 + String.valueOf(valueOf).length());
                    sb.append("Skipping restore of key ");
                    sb.append(str);
                    sb.append(" because its value is a set containing an object of type ");
                    sb.append(valueOf);
                    sb.append(".");
                    Log.w("PersistentBackupAgentHe", sb.toString());
                    return;
                }
            }
            editor.putStringSet(str, set);
            return;
        }
        String valueOf2 = String.valueOf(obj != null ? obj.getClass() : null);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 69 + String.valueOf(valueOf2).length());
        sb2.append("Skipping restore of key ");
        sb2.append(str);
        sb2.append(" because its value is the unrecognized type ");
        sb2.append(valueOf2);
        sb2.append(".");
        Log.w("PersistentBackupAgentHe", sb2.toString());
    }

    public static boolean j(String str) {
        return (str.contains(File.separator) || str.contains("/") || "persistent_backup_agent_helper".equals(str)) ? false : true;
    }

    protected abstract Map c();

    protected final SharedPreferences h(String str) {
        return getSharedPreferences(str, 0);
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
        Map c = c();
        SharedPreferences.Editor edit = getSharedPreferences("persistent_backup_agent_helper", 0).edit();
        edit.clear();
        for (Map.Entry entry : c.entrySet()) {
            String str = (String) entry.getKey();
            sgw sgwVar = (sgw) entry.getValue();
            if (j(str)) {
                for (Map.Entry<String, ?> entry2 : h(str).getAll().entrySet()) {
                    String key = entry2.getKey();
                    Object value = entry2.getValue();
                    if (sgwVar.a(key)) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(key).length());
                        sb.append(str);
                        sb.append("/");
                        sb.append(key);
                        i(edit, sb.toString(), value);
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
                sb2.append("Unsupported shared preferences file name \"");
                sb2.append(str);
                sb2.append("\"");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        edit.apply();
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        a();
    }

    @Override // android.app.backup.BackupAgent
    public void onCreate() {
        addHelper("persistent_backup_agent_helper_prefs", new SharedPreferencesBackupHelper(this, "persistent_backup_agent_helper"));
    }

    @Override // android.app.backup.BackupAgentHelper, android.app.backup.BackupAgent
    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
        super.onRestore(backupDataInput, i, parcelFileDescriptor);
        SharedPreferences sharedPreferences = getSharedPreferences("persistent_backup_agent_helper", 0);
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            int indexOf = key.indexOf("/");
            if (indexOf < 0 || indexOf >= key.length() - 1) {
                StringBuilder sb = new StringBuilder(String.valueOf(key).length() + 57);
                sb.append("Format of key \"");
                sb.append(key);
                sb.append("\" not understood, so skipping its restore.");
                Log.w("PersistentBackupAgentHe", sb.toString());
            } else {
                String substring = key.substring(0, indexOf);
                String substring2 = key.substring(indexOf + 1);
                SharedPreferences.Editor editor = (SharedPreferences.Editor) hashMap.get(substring);
                if (editor == null) {
                    if (!j(substring)) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + 52);
                        sb2.append("Skipping unsupported shared preferences file name \"");
                        sb2.append(substring);
                        sb2.append("\"");
                        Log.w("PersistentBackupAgentHe", sb2.toString());
                    } else {
                        editor = h(substring).edit();
                        hashMap.put(substring, editor);
                    }
                }
                i(editor, substring2, value);
            }
        }
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((SharedPreferences.Editor) it.next()).apply();
        }
        hashMap.keySet();
        a();
    }
}
