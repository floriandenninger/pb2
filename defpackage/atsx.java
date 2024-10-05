package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atsx extends aonm implements aooz {
    public static final atsx a;
    private static volatile aopf f;
    public int b;
    public aqyg d;
    public apmh e;
    private aota g;
    private byte h = 2;
    public aony c = emptyProtobufList();

    static {
        atsx atsxVar = new atsx();
        a = atsxVar;
        aonm.registerDefaultInstance(atsx.class, atsxVar);
    }

    private atsx() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0004\u0001Л\u0002ᐉ\u0000\u0003ᐉ\u0001\u0005ᐉ\u0003", new Object[]{"b", "c", atss.class, "d", "g", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new atsx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (atsx.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
