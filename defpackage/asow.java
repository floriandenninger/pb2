package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class asow extends aonm implements aooz {
    public static final asow a;
    private static volatile aopf e;
    public apmh d;
    private int f;
    private aota g;
    private byte h = 2;
    public String b = "";
    public aony c = emptyProtobufList();

    static {
        asow asowVar = new asow();
        a = asowVar;
        aonm.registerDefaultInstance(asow.class, asowVar);
    }

    private asow() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"f", "b", "c", asov.class, "d", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asow();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (asow.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
