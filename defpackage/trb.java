package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class trb implements anfz {
    public final /* synthetic */ tlg a;
    private final /* synthetic */ int b;

    public /* synthetic */ trb(tlg tlgVar, int i) {
        this.b = i;
        this.a = tlgVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.b;
        if (i == 0) {
            tlg tlgVar = this.a;
            if (!((Boolean) obj).booleanValue()) {
                tsx.d("%s: Unable to modify file subscription for key %s", "SharedFileManager", tlgVar);
                return anaf.O(false);
            }
            return anaf.O(true);
        }
        if (i == 1) {
            tlg tlgVar2 = this.a;
            tlh tlhVar = (tlh) obj;
            if (tlhVar == null) {
                tsx.d("%s: getSharedFile called on file that doesn't exists! Key = %s", "SharedFileManager", tlgVar2);
                return anaf.N(new trg());
            }
            return anaf.O(tlhVar);
        }
        if (i == 2) {
            tlg tlgVar3 = this.a;
            if (!((Boolean) obj).booleanValue()) {
                tsx.d("%s: Unable to write back subscription for file entry with %s", "SharedFileManager", tlgVar3);
                return anaf.O(false);
            }
            return anaf.O(true);
        }
        tlg tlgVar4 = this.a;
        if (!((Boolean) obj).booleanValue()) {
            tsx.d("%s: Unable to write back download info for file entry with %s", "DownloaderCallbackImpl", tlgVar4);
            tkj a = tkl.a();
            a.a = tkk.UNABLE_TO_UPDATE_FILE_STATE_ERROR;
            return anaf.N(a.a());
        }
        return anaf.O(null);
    }
}
