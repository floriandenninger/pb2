package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tre implements anfz {
    public final /* synthetic */ trf a;
    public final /* synthetic */ tlg b;
    private final /* synthetic */ int c;

    public /* synthetic */ tre(trf trfVar, tlg tlgVar, int i) {
        this.c = i;
        this.a = trfVar;
        this.b = tlgVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.c;
        if (i == 0) {
            trf trfVar = this.a;
            tlg tlgVar = this.b;
            tlh tlhVar = (tlh) obj;
            if (tlhVar == null) {
                tsx.c("%s: Unable to read sharedFile from shared preferences.", "SharedFileManager");
                return anaf.N(new trg());
            }
            tlc a = tlc.a(tlhVar.d);
            if (a == null) {
                a = tlc.NONE;
            }
            if (a != tlc.DOWNLOAD_COMPLETE) {
                Context context = trfVar.a;
                int bp = rwh.bp(tlgVar.f);
                Uri aY = rwh.aY(context, bp == 0 ? 1 : bp, tlhVar.c, tlgVar.e, trfVar.b, trfVar.j, false);
                if (aY != null) {
                    trfVar.d.b(aY);
                }
            }
            return anhv.a;
        }
        int i2 = 0;
        int i3 = 2;
        if (i != 1) {
            if (i == 2) {
                trf trfVar2 = this.a;
                tlg tlgVar2 = this.b;
                tlh tlhVar2 = (tlh) obj;
                if (tlhVar2 == null) {
                    tsx.d("%s: getOnDeviceUri called on file that doesn't exists. Key = %s!", "SharedFileManager", tlgVar2);
                    return anaf.N(new trg());
                }
                Context context2 = trfVar2.a;
                int bp2 = rwh.bp(tlgVar2.f);
                return anaf.O(rwh.aY(context2, bp2 != 0 ? bp2 : 1, tlhVar2.c, tlhVar2.g, trfVar2.b, trfVar2.j, tlhVar2.e));
            }
            trf trfVar3 = this.a;
            tlg tlgVar3 = this.b;
            tlh tlhVar3 = (tlh) obj;
            if (tlhVar3 == null) {
                tsx.d("%s: No file entry with key %s", "SharedFileManager", tlgVar3);
                return anaf.O(false);
            }
            Context context3 = trfVar3.a;
            int bp3 = rwh.bp(tlgVar3.f);
            Uri aY2 = rwh.aY(context3, bp3 == 0 ? 1 : bp3, tlhVar3.c, tlgVar3.e, trfVar3.b, trfVar3.j, false);
            if (aY2 != null) {
                trfVar3.d.b(aY2);
            }
            return anfq.i(trfVar3.c.f(tlgVar3), new trb(tlgVar3, i2), trfVar3.k);
        }
        trf trfVar4 = this.a;
        tlg tlgVar4 = this.b;
        if (((tlh) obj) != null) {
            return anaf.O(true);
        }
        SharedPreferences ar = rwh.ar(trfVar4.a, "gms_icing_mdd_shared_file_manager_metadata", trfVar4.j);
        long j = ar.getLong("next_file_name_v2", System.currentTimeMillis());
        if (!ar.edit().putLong("next_file_name_v2", 1 + j).commit()) {
            tsx.d("%s: Unable to update file name %s", "SharedFileManager", tlgVar4);
            return anaf.O(false);
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("datadownloadfile_");
        sb.append(j);
        String sb2 = sb.toString();
        aone createBuilder = tlh.a.createBuilder();
        tlc tlcVar = tlc.SUBSCRIBED;
        createBuilder.copyOnWrite();
        tlh tlhVar4 = (tlh) createBuilder.instance;
        tlhVar4.d = tlcVar.h;
        tlhVar4.b |= 2;
        createBuilder.copyOnWrite();
        tlh tlhVar5 = (tlh) createBuilder.instance;
        sb2.getClass();
        tlhVar5.b = 1 | tlhVar5.b;
        tlhVar5.c = sb2;
        return anfq.i(trfVar4.c.g(tlgVar4, (tlh) createBuilder.build()), new trb(tlgVar4, i3), trfVar4.k);
    }
}
