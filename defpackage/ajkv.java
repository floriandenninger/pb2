package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajkv implements amnv {
    public final /* synthetic */ azrw a;
    public final /* synthetic */ azrw b;
    public final /* synthetic */ azrw c;
    private final /* synthetic */ int d;

    public /* synthetic */ ajkv(azrw azrwVar, azrw azrwVar2, azrw azrwVar3, int i) {
        this.d = i;
        this.a = azrwVar;
        this.b = azrwVar2;
        this.c = azrwVar3;
    }

    @Override // defpackage.amnv
    public final Object get() {
        if (this.d == 0) {
            azrw azrwVar = this.a;
            azrw azrwVar2 = this.b;
            azrw azrwVar3 = this.c;
            if (!((apdb) azrwVar.get()).e) {
                return null;
            }
            boolean z = false;
            if (((apdb) azrwVar.get()).f && ((akto) azrwVar2.get()).b(((apdb) azrwVar.get()).h, aksi.STREAMZ_GLIDE_SAMPLING)) {
                z = true;
            }
            return new ajkz((apdb) azrwVar.get(), azrwVar3, z);
        }
        azrw azrwVar4 = this.a;
        azrw azrwVar5 = this.b;
        azrw azrwVar6 = this.c;
        if (((apdb) azrwVar4.get()).f && ((akto) azrwVar5.get()).b(((apdb) azrwVar4.get()).h, aksi.STREAMZ_GLIDE_SAMPLING)) {
            return new ajkt((aksl) azrwVar6.get());
        }
        return null;
    }
}
