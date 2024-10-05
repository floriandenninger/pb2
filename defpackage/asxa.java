package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asxa extends aonm implements aooz {
    public static final asxa a;
    private static volatile aopf h;
    public int b;
    public String c = "";
    public String d;
    public aony e;
    public aony f;
    public String g;

    static {
        asxa asxaVar = new asxa();
        a = asxaVar;
        aonm.registerDefaultInstance(asxa.class, asxaVar);
    }

    private asxa() {
        aomf aomfVar = aomf.b;
        this.d = "";
        this.e = aonm.emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = "";
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004\u001a\u0005\u001b\u0006ဈ\u0003", new Object[]{"b", "c", "d", "e", "f", aqll.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asxa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (asxa.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
