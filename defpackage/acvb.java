package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acvb {
    private final acpl a;

    static {
        zga.a("MDX.BackgroundPlaybackLogger");
    }

    public acvb(acpl acplVar) {
        this.a = acplVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2, boolean z, String str) {
        Object[] objArr = new Object[4];
        int i3 = i - 1;
        objArr[0] = Integer.valueOf(i3);
        int i4 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        objArr[1] = Integer.valueOf(i4);
        objArr[2] = Boolean.valueOf(z);
        objArr[3] = str;
        String.format("playbackResult:%d sessionType:%d retry:%s playlistId:%s", objArr);
        aone createBuilder = aszu.a.createBuilder();
        createBuilder.copyOnWrite();
        aszu aszuVar = (aszu) createBuilder.instance;
        aszuVar.c = i3;
        aszuVar.b |= 1;
        createBuilder.copyOnWrite();
        aszu aszuVar2 = (aszu) createBuilder.instance;
        aszuVar2.d = i4;
        aszuVar2.b |= 2;
        createBuilder.copyOnWrite();
        aszu aszuVar3 = (aszu) createBuilder.instance;
        aszuVar3.b |= 8;
        aszuVar3.e = z;
        createBuilder.copyOnWrite();
        aszu aszuVar4 = (aszu) createBuilder.instance;
        str.getClass();
        aszuVar4.b |= 16;
        aszuVar4.f = str;
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cV((aszu) createBuilder.build());
        this.a.c((arpp) a.build());
    }
}
