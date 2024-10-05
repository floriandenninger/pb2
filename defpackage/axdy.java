package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axdy extends aonm implements aooz {
    public static final axdy a;
    private static volatile aopf m;
    public int b;
    public String c = "";
    public String d = "";
    public aoro e;
    public aoro f;
    public axbp g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public aony l;

    static {
        axdy axdyVar = new axdy();
        a = axdyVar;
        aonm.registerDefaultInstance(axdy.class, axdyVar);
    }

    private axdy() {
        aomf aomfVar = aomf.b;
        this.l = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0011\n\u0000\u0001\u0000\u0001ဈ\u0000\u0005ဈ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0007\tဌ\b\nဌ\t\u000bခ\n\u000fဇ\u000e\u0011\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", axbl.a(), "i", axch.a(), "j", "k", "l", axdx.class});
            case NEW_MUTABLE_INSTANCE:
                return new axdy();
            case NEW_BUILDER:
                return new aone((boolean[][]) null, (byte[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (axdy.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
