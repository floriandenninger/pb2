package defpackage;

import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iix implements Runnable {
    public final /* synthetic */ ijo a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ iix(ijo ijoVar, String str, int i) {
        this.c = i;
        this.a = ijoVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            ijo ijoVar = this.a;
            String str = this.b;
            aukv aL = ijoVar.aL();
            if (aL == null || !str.equals(aL.d)) {
                return;
            }
            ijoVar.bl();
            return;
        }
        if (i == 1) {
            ijo ijoVar2 = this.a;
            String str2 = this.b;
            ijoVar2.ah.i(str2, 2);
            if (ijoVar2.aq.d()) {
                ijoVar2.by = new ammr(str2, (byte[]) null, (char[]) null);
                return;
            }
            ijm ijmVar = ijoVar2.bl;
            if (ijmVar.a != null) {
                ijmVar.a = null;
                ijoVar2.bh(ihk.a(2), true);
                return;
            } else {
                ily aG = ijoVar2.aG();
                if (aG != null) {
                    aG.d.d(ijoVar2.O(R.string.reel_error_video_not_available), null);
                    return;
                }
                return;
            }
        }
        ijo ijoVar3 = this.a;
        String str3 = this.b;
        aukv aL2 = ijoVar3.aL();
        if (aL2 == null || !str3.equals(aL2.d)) {
            return;
        }
        ijoVar3.bl();
    }
}
