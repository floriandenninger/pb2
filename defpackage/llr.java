package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class llr implements ynl {
    private final /* synthetic */ int r;
    public static final /* synthetic */ llr q = new llr(16);
    public static final /* synthetic */ llr p = new llr(15);
    public static final /* synthetic */ llr o = new llr(14);
    public static final /* synthetic */ llr n = new llr(13);
    public static final /* synthetic */ llr m = new llr(12);
    public static final /* synthetic */ llr l = new llr(11);
    public static final /* synthetic */ llr k = new llr(10);
    public static final /* synthetic */ llr j = new llr(9);
    public static final /* synthetic */ llr i = new llr(8);
    public static final /* synthetic */ llr h = new llr(7);
    public static final /* synthetic */ llr g = new llr(6);
    public static final /* synthetic */ llr f = new llr(5);
    public static final /* synthetic */ llr e = new llr(4);
    public static final /* synthetic */ llr d = new llr(3);
    public static final /* synthetic */ llr c = new llr(2);
    public static final /* synthetic */ llr b = new llr(1);
    public static final /* synthetic */ llr a = new llr(0);

    private /* synthetic */ llr(int i2) {
        this.r = i2;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final void a(Object obj) {
        switch (this.r) {
            case 0:
                zga.b("Successfully stored cross device offline device name.");
                return;
            case 1:
                int i2 = eik.d;
                return;
            case 2:
                zga.b("Successfully stored cross device offline device state.");
                return;
            case 3:
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                return;
            case 7:
                return;
            case 8:
                return;
            case 9:
                int i3 = wij.c;
                return;
            case 10:
                return;
            case 11:
                return;
            case 12:
                return;
            case 13:
                Executor executor = ynm.a;
                return;
            case 14:
                String.valueOf(String.valueOf((Boolean) obj)).length();
                return;
            case 15:
                return;
            default:
                String valueOf = String.valueOf((ammv) obj);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("RAM signal initialized: ");
                sb.append(valueOf);
                zga.h("Adaptive", sb.toString());
                return;
        }
    }
}
