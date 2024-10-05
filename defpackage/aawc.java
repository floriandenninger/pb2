package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aawc extends aaru {
    public String a;
    private final String b;
    private final String c;
    private final String d;

    public aawc(ajoy ajoyVar, afsx afsxVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super("comment/get_comments", ajoyVar, afsxVar, null, null, null);
        this.b = "";
        this.a = "";
        this.c = "";
        this.d = "";
        k();
    }

    @Override // defpackage.aaru
    public final /* bridge */ /* synthetic */ aoox a() {
        aone createBuilder = arlv.a.createBuilder();
        String str = this.b;
        createBuilder.copyOnWrite();
        arlv arlvVar = (arlv) createBuilder.instance;
        arlvVar.b |= 4;
        arlvVar.e = str;
        String str2 = this.a;
        createBuilder.copyOnWrite();
        arlv arlvVar2 = (arlv) createBuilder.instance;
        str2.getClass();
        arlvVar2.b |= 2;
        arlvVar2.d = str2;
        String str3 = this.d;
        createBuilder.copyOnWrite();
        arlv arlvVar3 = (arlv) createBuilder.instance;
        arlvVar3.b |= 8;
        arlvVar3.f = str3;
        String str4 = this.c;
        createBuilder.copyOnWrite();
        arlv arlvVar4 = (arlv) createBuilder.instance;
        arlvVar4.b |= 1024;
        arlvVar4.g = str4;
        return createBuilder;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        if (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.d)) {
            if (TextUtils.isEmpty(this.a)) {
                return;
            }
            if (!TextUtils.isEmpty(this.b) || !TextUtils.isEmpty(this.d)) {
                throw new IllegalArgumentException("CommentServiceRequest: continuation cannot be set if videoId or channelId set.");
            }
            return;
        }
        throw new IllegalArgumentException("CommentServiceRequest: Can only set one of channelId and videoId.");
    }
}
