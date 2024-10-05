package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class trm implements trh {
    private final Context a;
    private final tme b;
    private final ammv c;
    private final tko d;

    public trm(Context context, tme tmeVar, ammv ammvVar, tko tkoVar) {
        this.a = context;
        this.b = tmeVar;
        this.c = ammvVar;
        this.d = tkoVar;
    }

    @Override // defpackage.trh
    public final anhy a() {
        rwh.ar(this.a, "gms_icing_mdd_shared_files", this.c).edit().clear().commit();
        return anaf.O(null);
    }

    @Override // defpackage.trh
    public final anhy c() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences ar = rwh.ar(this.a, "gms_icing_mdd_shared_files", this.c);
        SharedPreferences.Editor editor = null;
        for (String str : ar.getAll().keySet()) {
            try {
                arrayList.add(rwh.az(str, this.a, this.b));
            } catch (ttn e) {
                String valueOf = String.valueOf(str);
                tsx.j(e, valueOf.length() != 0 ? "Failed to deserialize newFileKey:".concat(valueOf) : new String("Failed to deserialize newFileKey:"));
                this.b.a(e, "Failed to deserialize newFileKey, unexpected key size: %d", Integer.valueOf(amnm.c("|").h(str).size()));
                if (editor == null) {
                    editor = ar.edit();
                }
                editor.remove(str);
            }
        }
        if (editor != null) {
            editor.commit();
        }
        return anaf.O(arrayList);
    }

    @Override // defpackage.trh
    public final anhy d() {
        String str;
        String str2;
        tpr a;
        int ordinal;
        String str3;
        String str4;
        boolean z;
        String str5 = "Failed to commit migration version to disk.";
        String str6 = "Fail to set target version ";
        int i = 2;
        boolean z2 = false;
        if (rwh.bg(this.a)) {
            this.d.p();
            tpr a2 = tpr.a(2);
            tpr bf = rwh.bf(this.a, this.b);
            int i2 = a2.d;
            int i3 = bf.d;
            int i4 = 1;
            if (i2 != i3) {
                if (i2 >= i3) {
                    int i5 = i3 + 1;
                    while (i5 <= a2.d) {
                        try {
                            a = tpr.a(i5);
                            ordinal = a.ordinal();
                            str3 = str5;
                        } catch (Throwable th) {
                            th = th;
                            str = str6;
                            str2 = str5;
                        }
                        if (ordinal == i4) {
                            str4 = str6;
                            int i6 = tsx.a;
                            SharedPreferences ar = rwh.ar(this.a, "gms_icing_mdd_shared_files", this.c);
                            SharedPreferences.Editor edit = ar.edit();
                            Iterator<String> it = ar.getAll().keySet().iterator();
                            while (it.hasNext()) {
                                String next = it.next();
                                try {
                                    tlg az = rwh.az(next, this.a, this.b);
                                    tlh tlhVar = (tlh) rwh.at(ar, next, tlh.a.getParserForType());
                                    if (tlhVar == null) {
                                        tsx.c("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                        edit.remove(next);
                                    } else {
                                        rwh.av(edit, next);
                                        rwh.aw(edit, rwh.aD(az), tlhVar);
                                    }
                                } catch (ttn e) {
                                    tsx.d("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", next);
                                    this.b.a(e, "Failed to deserialize file key, remove and continue.", new Object[0]);
                                    edit.remove(next);
                                    ar = ar;
                                    it = it;
                                }
                            }
                            if (!edit.commit()) {
                                tsx.b("Failed to commit migration metadata to disk");
                                this.b.a(new Exception("Migrate to DownloadTransform failed."), "Failed to commit migration metadata to disk.", new Object[0]);
                                z = false;
                            }
                            z = true;
                        } else {
                            if (ordinal == i) {
                                try {
                                    int i7 = tsx.a;
                                    SharedPreferences ar2 = rwh.ar(this.a, "gms_icing_mdd_shared_files", this.c);
                                    SharedPreferences.Editor edit2 = ar2.edit();
                                    for (String str7 : ar2.getAll().keySet()) {
                                        try {
                                            tlg az2 = rwh.az(str7, this.a, this.b);
                                            tlh tlhVar2 = (tlh) rwh.at(ar2, str7, tlh.a.getParserForType());
                                            if (tlhVar2 == null) {
                                                tsx.c("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                                edit2.remove(str7);
                                            } else {
                                                rwh.av(edit2, str7);
                                                rwh.aw(edit2, rwh.aC(az2), tlhVar2);
                                            }
                                        } catch (ttn e2) {
                                            tsx.d("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str7);
                                            SharedPreferences sharedPreferences = ar2;
                                            str4 = str6;
                                            try {
                                                this.b.a(e2, "Failed to deserialize file key, remove and continue.", new Object[0]);
                                                edit2.remove(str7);
                                                ar2 = sharedPreferences;
                                                str6 = str4;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str2 = str3;
                                                str = str4;
                                            }
                                        }
                                    }
                                    str4 = str6;
                                    if (!edit2.commit()) {
                                        tsx.b("Failed to commit migration metadata to disk");
                                        this.b.a(new Exception("Migrate to ChecksumOnly failed."), "Failed to commit migration metadata to disk.", new Object[0]);
                                        z = false;
                                    }
                                    z = true;
                                } catch (Throwable th3) {
                                    th = th3;
                                    str = str6;
                                    str2 = str3;
                                }
                            } else {
                                str4 = str6;
                                String name = a.name();
                                StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 33);
                                sb.append("Upgrade to version ");
                                sb.append(name);
                                sb.append("not supported!");
                                throw new UnsupportedOperationException(sb.toString());
                            }
                            th = th2;
                            str2 = str3;
                            str = str4;
                            if (rwh.bf(this.a, this.b).d != a2.d && !rwh.bh(this.a, a2)) {
                                String valueOf = String.valueOf(a2);
                                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 75);
                                sb2.append("Failed to commit migration version to disk. Fail to set target version to ");
                                sb2.append(valueOf);
                                sb2.append(".");
                                tsx.b(sb2.toString());
                                tme tmeVar = this.b;
                                String valueOf2 = String.valueOf(a2);
                                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 28);
                                sb3.append(str);
                                sb3.append(valueOf2);
                                sb3.append(".");
                                tmeVar.a(new Exception(sb3.toString()), str2, new Object[0]);
                            }
                            throw th;
                        }
                        if (z) {
                            rwh.bh(this.a, tpr.a(i5));
                            i5++;
                            str5 = str3;
                            str6 = str4;
                            i = 2;
                            i4 = 1;
                        } else {
                            if (rwh.bf(this.a, this.b).d != a2.d && !rwh.bh(this.a, a2)) {
                                String valueOf3 = String.valueOf(a2);
                                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf3).length() + 75);
                                sb4.append("Failed to commit migration version to disk. Fail to set target version to ");
                                sb4.append(valueOf3);
                                sb4.append(".");
                                tsx.b(sb4.toString());
                                tme tmeVar2 = this.b;
                                String valueOf4 = String.valueOf(a2);
                                StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf4).length() + 28);
                                sb5.append(str4);
                                sb5.append(valueOf4);
                                sb5.append(".");
                                tmeVar2.a(new Exception(sb5.toString()), str3, new Object[0]);
                            }
                            z2 = false;
                        }
                    }
                    String str8 = str6;
                    String str9 = str5;
                    if (rwh.bf(this.a, this.b).d != a2.d && !rwh.bh(this.a, a2)) {
                        String valueOf5 = String.valueOf(a2);
                        StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf5).length() + 75);
                        sb6.append("Failed to commit migration version to disk. Fail to set target version to ");
                        sb6.append(valueOf5);
                        sb6.append(".");
                        tsx.b(sb6.toString());
                        tme tmeVar3 = this.b;
                        String valueOf6 = String.valueOf(a2);
                        StringBuilder sb7 = new StringBuilder(String.valueOf(valueOf6).length() + 28);
                        sb7.append(str8);
                        sb7.append(valueOf6);
                        sb7.append(".");
                        tmeVar3.a(new Exception(sb7.toString()), str9, new Object[0]);
                    }
                } else {
                    tsx.e("%s Cannot migrate back from value %s to %s. Clear everything!", "SharedFilesMetadata", bf, a2);
                    tme tmeVar4 = this.b;
                    String valueOf7 = String.valueOf(bf);
                    String valueOf8 = String.valueOf(a2);
                    StringBuilder sb8 = new StringBuilder(String.valueOf(valueOf7).length() + 30 + String.valueOf(valueOf8).length());
                    sb8.append("Downgraded file key from ");
                    sb8.append(valueOf7);
                    sb8.append(" to ");
                    sb8.append(valueOf8);
                    sb8.append(".");
                    tmeVar4.a(new Exception(sb8.toString()), "FileKey migrations unexpected downgrade.", new Object[0]);
                    rwh.bh(this.a, a2);
                }
                return anaf.O(Boolean.valueOf(z2));
            }
            z2 = true;
            return anaf.O(Boolean.valueOf(z2));
        }
        int i8 = tsx.a;
        rwh.bi(this.a);
        Context context = this.a;
        this.d.p();
        rwh.bh(context, tpr.a(2));
        return anaf.O(false);
    }

    @Override // defpackage.trh
    public final anhy e(tlg tlgVar) {
        return anaf.O((tlh) rwh.at(rwh.ar(this.a, "gms_icing_mdd_shared_files", this.c), rwh.aA(tlgVar, this.a, this.b), tlh.a.getParserForType()));
    }

    @Override // defpackage.trh
    public final anhy f(tlg tlgVar) {
        return anaf.O(Boolean.valueOf(rwh.ax(rwh.ar(this.a, "gms_icing_mdd_shared_files", this.c), rwh.aA(tlgVar, this.a, this.b))));
    }

    @Override // defpackage.trh
    public final anhy g(tlg tlgVar, tlh tlhVar) {
        return anaf.O(Boolean.valueOf(rwh.ay(rwh.ar(this.a, "gms_icing_mdd_shared_files", this.c), rwh.aA(tlgVar, this.a, this.b), tlhVar)));
    }
}
