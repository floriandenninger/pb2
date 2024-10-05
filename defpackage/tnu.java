package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tnu implements anfz {
    public final /* synthetic */ tov a;
    public final /* synthetic */ tkt b;
    public final /* synthetic */ tkv c;
    private final /* synthetic */ int d;

    public /* synthetic */ tnu(tov tovVar, tkt tktVar, tkv tkvVar, int i) {
        this.d = i;
        this.a = tovVar;
        this.b = tktVar;
        this.c = tkvVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.d;
        if (i == 0) {
            tov tovVar = this.a;
            tkt tktVar = this.b;
            tkv tkvVar = this.c;
            Uri uri = (Uri) obj;
            if (uri != null) {
                tovVar.a(uri, tktVar, tkvVar);
            }
            return anhv.a;
        }
        if (i == 1) {
            tov tovVar2 = this.a;
            Uri uri2 = (Uri) obj;
            Uri aM = rwh.aM(tovVar2.a, tovVar2.i, this.b, this.c);
            try {
                Uri parse = Uri.parse(aM.toString().substring(0, aM.toString().lastIndexOf("/")));
                if (!tovVar2.g.h(parse)) {
                    tovVar2.g.d(parse);
                }
                Context context = tovVar2.a;
                uri2.getClass();
                tto.b(context, aM, uri2);
                return anhv.a;
            } catch (IOException e) {
                tkj a = tkl.a();
                a.a = tkk.UNABLE_TO_CREATE_SYMLINK_STRUCTURE;
                a.b = "Unable to create symlink";
                a.c = e;
                return anaf.N(a.a());
            }
        }
        tov tovVar3 = this.a;
        tkt tktVar2 = this.b;
        tkv tkvVar2 = this.c;
        if (!((Boolean) obj).booleanValue()) {
            tsx.e("%s: Failed to set new state for file %s, filegroup %s", "FileGroupManager", tktVar2.c, tkvVar2.d);
            tov.v(tovVar3.b, tkvVar2, tktVar2, 14);
        }
        return anhv.a;
    }
}
