package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class nsg implements ayrw {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ nsg(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ayrw
    public final boolean a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return this.a.equals(((ntw) obj).a);
        }
        if (i == 1) {
            return this.a.equals(((ntw) obj).a);
        }
        if (i == 2) {
            return this.a.equals(((ntw) obj).a);
        }
        if (i == 3) {
            return !((aumv) obj).getPlaylistIds().contains(this.a);
        }
        if (i == 4) {
            return ((aumv) obj).getPlaylistIds().contains(this.a);
        }
        return this.a.equals(((akpc) obj).a);
    }
}
