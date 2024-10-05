package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class trk implements tow {
    public final Executor a;
    private final Context b;
    private final shf c;
    private final tme d;
    private final ammv e;

    public trk(Context context, shf shfVar, tme tmeVar, ammv ammvVar, Executor executor) {
        this.b = context;
        this.c = shfVar;
        this.d = tmeVar;
        this.e = ammvVar;
        this.a = executor;
    }

    @Override // defpackage.tow
    public final anhy a(tkv tkvVar) {
        int i = tsx.a;
        tkv aO = rwh.aO(tkvVar, (this.c.c() / 1000) + tkvVar.j);
        ArrayList arrayList = new ArrayList();
        arrayList.add(aO);
        return m(arrayList);
    }

    @Override // defpackage.tow
    public final anhy b() {
        rwh.ar(this.b, "gms_icing_mdd_groups", this.e).edit().clear().commit();
        rwh.ar(this.b, "gms_icing_mdd_group_key_properties", this.e).edit().clear().commit();
        return k();
    }

    @Override // defpackage.tow
    public final anhy c() {
        return anfq.i(d(), new anfz() { // from class: trj
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                trk trkVar = trk.this;
                final List list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(trkVar.g((tld) it.next()));
                }
                return anaf.H(arrayList).b(new anfy() { // from class: tri
                    @Override // defpackage.anfy
                    public final anhy a() {
                        List list2 = list;
                        List list3 = arrayList;
                        ArrayList arrayList2 = new ArrayList();
                        for (int i = 0; i < list2.size(); i++) {
                            tld tldVar = (tld) list2.get(i);
                            tkv tkvVar = (tkv) anaf.W((Future) list3.get(i));
                            if (tkvVar != null) {
                                arrayList2.add(Pair.create(tldVar, tkvVar));
                            }
                        }
                        return anaf.O(arrayList2);
                    }
                }, trkVar.a);
            }
        }, this.a);
    }

    @Override // defpackage.tow
    public final anhy d() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences ar = rwh.ar(this.b, "gms_icing_mdd_groups", this.e);
        SharedPreferences.Editor editor = null;
        for (String str : ar.getAll().keySet()) {
            try {
                arrayList.add(rwh.aG(str));
            } catch (ttk e) {
                String valueOf = String.valueOf(str);
                tsx.j(e, valueOf.length() != 0 ? "Failed to deserialize groupKey:".concat(valueOf) : new String("Failed to deserialize groupKey:"));
                this.d.a(e, "Failed to deserialize groupKey", new Object[0]);
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    @Override // defpackage.tow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.anhy e() {
        /*
            r7 = this;
            java.lang.String r0 = "FileGroupsMetadataUtil"
            android.content.Context r1 = r7.b
            ammv r2 = r7.e
            java.io.File r1 = defpackage.rwh.aH(r1, r2)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L5b
            r2.<init>(r1)     // Catch: java.io.FileNotFoundException -> L5b
            r3 = 0
            r4 = 1
            long r5 = r1.length()     // Catch: java.lang.IllegalArgumentException -> L4c
            int r1 = (int) r5     // Catch: java.lang.IllegalArgumentException -> L4c
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch: java.lang.IllegalArgumentException -> L4c
            java.nio.channels.FileChannel r5 = r2.getChannel()     // Catch: java.io.IOException -> L39
            r5.read(r1)     // Catch: java.io.IOException -> L39
            java.nio.Buffer r5 = r1.rewind()     // Catch: java.io.IOException -> L39
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5     // Catch: java.io.IOException -> L39
            java.lang.Class<tkv> r5 = defpackage.tkv.class
            tkv r6 = defpackage.tkv.a     // Catch: java.io.IOException -> L39
            aopf r6 = r6.getParserForType()     // Catch: java.io.IOException -> L39
            java.util.List r1 = defpackage.rwh.aF(r1, r5, r6)     // Catch: java.io.IOException -> L39
            r2.close()     // Catch: java.io.IOException -> L37
            goto L45
        L37:
            r2 = move-exception
            goto L3c
        L39:
            r1 = move-exception
            r2 = r1
            r1 = 0
        L3c:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            java.lang.String r0 = "%s: IOException occurred while reading file groups."
            defpackage.tsx.f(r2, r0, r4)
        L45:
            if (r1 != 0) goto L64
            amru r1 = defpackage.amru.q()
            goto L64
        L4c:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            java.lang.String r0 = "%s: Exception while reading from stale groups into buffer."
            defpackage.tsx.f(r1, r0, r2)
            amru r1 = defpackage.amru.q()
            goto L64
        L5b:
            r1.getAbsolutePath()
            int r0 = defpackage.tsx.a
            amru r1 = defpackage.amru.q()
        L64:
            anhy r0 = defpackage.anaf.O(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trk.e():anhy");
    }

    @Override // defpackage.tow
    public final anhy f() {
        return anhv.a;
    }

    @Override // defpackage.tow
    public final anhy g(tld tldVar) {
        return anaf.O((tkv) rwh.at(rwh.ar(this.b, "gms_icing_mdd_groups", this.e), rwh.aI(tldVar), tkv.a.getParserForType()));
    }

    @Override // defpackage.tow
    public final anhy h(tld tldVar) {
        return anaf.O((tle) rwh.at(rwh.ar(this.b, "gms_icing_mdd_group_key_properties", this.e), rwh.aI(tldVar), tle.a.getParserForType()));
    }

    @Override // defpackage.tow
    public final anhy i(tld tldVar) {
        return anaf.O(Boolean.valueOf(rwh.ax(rwh.ar(this.b, "gms_icing_mdd_groups", this.e), rwh.aI(tldVar))));
    }

    @Override // defpackage.tow
    public final anhy j(List list) {
        SharedPreferences.Editor edit = rwh.ar(this.b, "gms_icing_mdd_groups", this.e).edit();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tld tldVar = (tld) it.next();
            String str = tldVar.c;
            String str2 = tldVar.d;
            int i = tsx.a;
            edit.remove(rwh.au(tldVar));
        }
        return anaf.O(Boolean.valueOf(edit.commit()));
    }

    @Override // defpackage.tow
    public final anhy k() {
        n().delete();
        return anhv.a;
    }

    @Override // defpackage.tow
    public final anhy l(tld tldVar, tkv tkvVar) {
        return anaf.O(Boolean.valueOf(rwh.ay(rwh.ar(this.b, "gms_icing_mdd_groups", this.e), rwh.aI(tldVar), tkvVar)));
    }

    @Override // defpackage.tow
    public final anhy m(List list) {
        File n = n();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(n, true);
            try {
                ByteBuffer aE = rwh.aE(list);
                if (aE != null) {
                    fileOutputStream.getChannel().write(aE);
                }
                fileOutputStream.close();
                return anaf.O(true);
            } catch (IOException unused) {
                tsx.b("IOException occurred while writing file groups.");
                return anaf.O(false);
            }
        } catch (FileNotFoundException unused2) {
            tsx.c("File %s not found while writing.", n.getAbsolutePath());
            return anaf.O(false);
        }
    }

    final File n() {
        return rwh.aH(this.b, this.e);
    }
}
