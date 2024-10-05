package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ipu implements View.OnClickListener {
    private final /* synthetic */ int j;
    public static final /* synthetic */ ipu i = new ipu(12);
    public static final /* synthetic */ ipu h = new ipu(11);
    public static final /* synthetic */ ipu g = new ipu(10);
    public static final /* synthetic */ ipu f = new ipu(8);
    public static final /* synthetic */ ipu e = new ipu(7);
    public static final /* synthetic */ ipu d = new ipu(6);
    public static final /* synthetic */ ipu c = new ipu(5);
    public static final /* synthetic */ ipu b = new ipu(4);
    public static final /* synthetic */ ipu a = new ipu(3);

    public /* synthetic */ ipu(int i2) {
        this.j = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.j) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return;
            case 7:
                long j = kqm.a;
                return;
            case 8:
                long j2 = kqm.a;
                return;
            case 9:
            case 10:
            case 11:
                return;
            default:
                tyo.L(view);
                return;
        }
    }
}
