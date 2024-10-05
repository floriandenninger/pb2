package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aein implements Callable {
    private final /* synthetic */ int g;
    public static final /* synthetic */ aein f = new aein(5);
    public static final /* synthetic */ aein e = new aein(4);
    public static final /* synthetic */ aein d = new aein(3);
    public static final /* synthetic */ aein c = new aein(2);
    public static final /* synthetic */ aein b = new aein(1);
    public static final /* synthetic */ aein a = new aein(0);

    public /* synthetic */ aein(int i) {
        this.g = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.g;
        if (i == 0) {
            return new IllegalArgumentException("Can't get InnerTube response observable for a media-only request.");
        }
        if (i == 1) {
            return false;
        }
        if (i != 3) {
            return null;
        }
        return awwv.ACTION_TYPE_RETRY;
    }
}
