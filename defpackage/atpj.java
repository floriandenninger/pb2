package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atpj extends aonm implements aooz {
    public static final atpj a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aulq e;
    private byte f = 2;

    static {
        atpj atpjVar = new atpj();
        a = atpjVar;
        aonm.registerDefaultInstance(atpj.class, atpjVar);
    }

    private atpj() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0002\u0003ᐉ\u0000\u0005ᐉ\u0002", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new atpj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atpj.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
