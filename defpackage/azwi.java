package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azwi extends azum implements aztu {
    private final /* synthetic */ int f;
    public static final azwi e = new azwi(4);
    public static final azwi d = new azwi(3);
    public static final azwi c = new azwi(2);
    public static final azwi b = new azwi(1);
    public static final azwi a = new azwi(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azwi(int i) {
        super(1);
        this.f = i;
    }

    @Override // defpackage.aztu
    public final /* synthetic */ Object a(Object obj) {
        int i = this.f;
        if (i == 0) {
            azss azssVar = (azss) obj;
            azssVar.getClass();
            if (azssVar instanceof azwj) {
                return (azwj) azssVar;
            }
            return null;
        }
        if (i == 1) {
            String str = (String) obj;
            str.getClass();
            return str;
        }
        if (i != 2) {
            if (i == 3) {
                ((Throwable) obj).getClass();
                return null;
            }
            ((Throwable) obj).getClass();
            return null;
        }
        azss azssVar2 = (azss) obj;
        azssVar2.getClass();
        if (azssVar2 instanceof azxb) {
            return (azxb) azssVar2;
        }
        return null;
    }
}
